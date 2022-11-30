package com.example.listview_menu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    TacGiaAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            String[] name = {"Huy Cận"," Mạc Ngôn"," Shakespeare", "Hemingway"};
        int[] image = {R.drawable.huycan,R.drawable.macngon,R.drawable.shakespeare,R.drawable.hemingway,};
        String[] moTa = {"Cù Huy Cận (1919 – 2005), bút danh hoạt động nghệ thuật là Huy Cận, là một chính khách, từng giữ nhiều chức vụ lãnh đạo cao cấp trong chính phủ Việt Nam như Bộ trưởng Bộ Canh nông (nay là Bộ Nông nghiệp và Phát triển nông thôn), Thứ trưởng Bộ Văn hóa Nghệ thuật, Bộ trưởng Bộ Văn hóa Giáo dục, Thứ trưởng Bộ Nội vụ, Bộ Kinh tế, Bộ trưởng Tổng Thư ký Hội đồng Bộ trưởng (nay là Bộ trưởng Chủ nhiệm Văn phòng Chính phủ), ngoài ra ông còn là một nhà lãnh đạo chủ chốt của Đảng Dân chủ Việt Nam, đảng viên Đảng Cộng sản Việt Nam[1][2], đồng thời cũng là một trong những thi sĩ xuất sắc nhất của phong trào Thơ mới. Ông từng là Viện sĩ Viện Hàn lâm Thơ Thế giới và Chủ tịch Ủy ban Liên hiệp các Hiệp hội Văn học Việt Nam giai đoạn 1984-1995." ,
                "Mạc Ngôn (sinh ngày 17 tháng 2 năm 1955) là một nhà văn người Trung Quốc xuất thân từ nông dân. Ông đã từng được thế giới biết đến với tác phẩm Cao lương đỏ đã được đạo diễn nổi tiếng Trương Nghệ Mưu chuyển thể thành phim. Bộ phim đã được giải Gấu vàng tại Liên hoan phim quốc tế Berlin năm 1988.\n" +
                        "\n" +
                        "Ngày 11 tháng 10 năm 2012, ông được trao giải Nobel Văn học năm 2012[1], là nhà văn đầu tiên mang quốc tịch Trung Quốc nhận được giải thưởng danh giá này.",
                "William Shakespeare (tên phiên âm: Uy-li-am Sếch-xpia; không rõ ngày sinh của ông, nhưng theo truyền thống được ghi nhận là vào ngày 23 tháng 4 năm 1564, ngày thánh George; mất ngày 23 tháng 4 năm 1616 theo lịch Julius hoặc ngày 3 tháng 5 năm 1616 theo lịch Gregorius) là một nhà văn và nhà viết kịch Anh, được coi là nhà văn vĩ đại nhất của Anh và là nhà viết kịch đi trước thời đại.[1] Ông còn được vinh danh là nhà thơ tiêu biểu của nước Anh và là \"Thi sĩ của dòng sông Avon\" (Avon là dòng sông nơi sinh của Shakespeare, Stratford-upon-Avon).[2] Những tác phẩm của ông, bao gồm cả những tác phẩm đồng tác giả, bao gồm 39 vở kịch, 154 bản sonnet, hai bản thơ tường thuật dài, và vài bài thơ ngắn. Những vở kịch của ông đã được dịch ra thành rất nhiều ngôn ngữ lớn và được trình diễn nhiều hơn bất kì nhà viết kịch nào.[3]",
                "Ernest Miller Hemingway (21 tháng 7 năm 1899 – 2 tháng 7 năm 1961) là một tiểu thuyết gia người Mỹ, nhà văn viết truyện ngắn và là một nhà báo. Ông là một phần của cộng đồng những người xa xứ ở Paris trong thập niên 20 của thế kỷ XX và là một trong những cựu quân nhân trong Chiến tranh thế giới I, sau đó được biết đến qua \"Thế hệ đã mất\". Ông đã nhận được Giải Pulitzer năm 1953 với tiểu thuyết Ông già và biển cả và Giải Nobel Văn học năm 1954."};

        ArrayList<TacGia> arrayList = new ArrayList<>();
        for(int i = 0;i < image.length ;i++){
            TacGia sp = new TacGia(name[i],moTa[i],image[i]);
            arrayList.add(sp);
        }
        listView = findViewById(R.id.listMenu);
        adapter = new TacGiaAdapter(this,R.layout.dong_menu,arrayList);
        listView.setAdapter(adapter);
        listView.setClickable(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, SanPham_Activity.class);
                intent.putExtra("name",name[i]);
                intent.putExtra("moTa", moTa[i]);
                intent.putExtra("image",image[i]);
                startActivity(intent);

            }
        });


        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                final int item = i;
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Bạn có xoá không ?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                arrayList.remove(item);
                                adapter.notifyDataSetChanged();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                return false;
            }
        });
    }

}