package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Float numnang;
    Float numcao;
    Float numkq;
    String str;
    boolean kt=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button tinh = (Button) findViewById(R.id.tinh);
        EditText cnang = (EditText) findViewById(R.id.cantext);
        EditText ccao = (EditText) findViewById(R.id.caotext);
        TextView kq= (TextView) findViewById(R.id.textView);
        TextView kqc= (TextView) findViewById(R.id.textView1);
        tinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numnang = Float.parseFloat(cnang.getText().toString());
                numcao = Float.parseFloat(ccao.getText().toString());
                if (numcao==0){
                    kq.setText("Nhập đúng định dạng".toString());
                }else{
                    str=String.valueOf(numnang*1.0/(numcao*numcao));
                    kq.setText(str);
                    numkq=Float.parseFloat(kq.getText().toString());
                    String loai;
                    if ( numkq <18 ) loai="Người gầy";
                    else if (numkq < 25) loai = " Bình thường";
                    else if (numkq <30) loai = " Béo phì độ I";
                    else if (numkq <35) loai =" Béo phì độ II";
                    else loai= " Béo phì độ III";
                    kqc.setText(loai);
                }}
        }
        );

    }
}