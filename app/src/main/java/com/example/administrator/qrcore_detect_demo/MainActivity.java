package com.example.administrator.qrcore_detect_demo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }




    public void generate_code(View view) {
        Intent intent1=new Intent(MainActivity.this,generate_qrcode.class);
        startActivity(intent1);
    }

    public void generate_code_pic(View view) {
        Intent intent1=new Intent(MainActivity.this,generate_qrcode_pic.class);
        startActivity(intent1);
    }
}
