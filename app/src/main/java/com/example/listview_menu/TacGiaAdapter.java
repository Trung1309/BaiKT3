package com.example.listview_menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TacGiaAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<TacGia> list_tacGia;

    public TacGiaAdapter(Context context, int layout, List<TacGia> list_tacGia) {
        this.context = context;
        this.layout = layout;
        this.list_tacGia = list_tacGia;
    }

    @Override
    public int getCount() {
        return list_tacGia.size();
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
        TextView txt_ten = view.findViewById(R.id.ten_sp);
        TextView txt_tt = view.findViewById(R.id.TT_sp);
        ImageView avata = view.findViewById(R.id.image_sp);

        //Gán giá trị
        TacGia tacGia = list_tacGia.get(i);
        txt_ten.setText(tacGia.getTacGia());
        txt_tt.setText(tacGia.getMota());
        avata.setImageResource(tacGia.getImg());


        return view;
    }
}
