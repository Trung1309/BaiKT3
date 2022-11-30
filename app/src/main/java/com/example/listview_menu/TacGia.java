package com.example.listview_menu;

public class TacGia {
    private String tacGia, Mota;
    int img;

    public TacGia(String tacGia, String mota, int img) {
        this.tacGia = tacGia;
        Mota = mota;
        this.img = img;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String mota) {
        Mota = mota;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
