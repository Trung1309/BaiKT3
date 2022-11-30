package com.example.listview_menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TacPhamAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<TacPham> list_tacPham;

    public TacPhamAdapter(Context context, int layout, List<TacPham> list_tacPham) {
        this.context = context;
        this.layout = layout;
        this.list_tacPham = list_tacPham;
    }

    @Override
    public int getCount() {
        return list_tacPham.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);

        //ánh xạ
        TextView txt_ten = view.findViewById(R.id.ten_tp);
        TextView txt_tl = view.findViewById(R.id.ten_theloai);
        ImageView avata = view.findViewById(R.id.avt_tp);

        //Gán giá trị
        TacPham tacPham = list_tacPham.get(i);
        txt_ten.setText(tacPham.getTacPham());
        txt_tl.setText(tacPham.getTheLoai());
        avata.setImageResource(tacPham.getImg());

        return view;
    }
}
