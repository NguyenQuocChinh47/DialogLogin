package com.example.dialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView edtDangnhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtDangnhap =findViewById(R.id.edt_Dangnhap);
        edtDangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogLogin();
            }
        });

    }

    private void DialogLogin() {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog);
        dialog.setCanceledOnTouchOutside(false);
        final EditText edtUserName = dialog.findViewById(R.id.edt_UserName);
        final EditText edtPassWord = dialog.findViewById(R.id.edt_PassWord);
        Button btnHuy        = dialog.findViewById(R.id.btn_Huy);
        Button btnDongY      = dialog.findViewById(R.id.btn_DongY);

        btnDongY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = edtUserName.getText().toString().trim();
                String pass = edtPassWord.getText().toString().trim();
                if(user.equals("anhchinhslct")&&pass.equals("1234")){
                    Toast.makeText(MainActivity.this,"Đăng nhập thành công", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this,"Tài khoản hoặc mật khẩu chưa chính xác!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnHuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }


}