package com.example.listview_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class SanPham_Activity extends AppCompatActivity {

    Button btn_tacPham;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_san_pham);
        btn_tacPham = findViewById(R.id.btn_TacPham);
        btn_tacPham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SanPham_Activity.this, TacPhamActivity.class);
                startActivity(intent);
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//hiển thị nút back

        Intent intent = getIntent();
        if (intent != null){
            String name = intent.getStringExtra("name");
            String moTa = intent.getStringExtra("moTa");
            int img = intent.getIntExtra("image", R.drawable.cuahoangde);

            // Anh xa
            TextView ten = findViewById(R.id.ten);
            TextView tt = findViewById(R.id.tt);
            ImageView avt = findViewById(R.id.avt);

            // Hien thi chu

            ten.setText(name);
            tt.setText(moTa);
            avt.setImageResource(img);


        }
    }
}