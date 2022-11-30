package com.example.listview_menu;

public class TacPham {
    String tacPham,theLoai,noiDung;
    int img;

    public TacPham(String tacPham, String theLoai, String noiDung, int img) {
        this.tacPham = tacPham;
        this.theLoai = theLoai;
        this.noiDung = noiDung;
        this.img = img;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public TacPham() {
    }

    public String getTacPham() {
        return tacPham;
    }

    public void setTacPham(String tacPham) {
        this.tacPham = tacPham;
    }




    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }
}
