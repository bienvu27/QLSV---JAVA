package model;

import java.util.ArrayList;

public class QLSVModel {
    private ArrayList<ThiSinh> dsThiSinh;

    public QLSVModel() {
        this.dsThiSinh = new ArrayList<ThiSinh>();
    }

    public QLSVModel(ArrayList<ThiSinh> dsThiSinh) {
        this.dsThiSinh = dsThiSinh;
    }

    public ArrayList<ThiSinh> getDsThiSinh() {
        return dsThiSinh;
    }

    public void setDsThiSinh(ArrayList<ThiSinh> dsThiSinh) {
        this.dsThiSinh = dsThiSinh;
    }

    //    Thêm sinh viên
    public void insert(ThiSinh thiSinh) {
        this.dsThiSinh.add(thiSinh);
    }

    //    Xóa sinh viên
    public void delete(ThiSinh thiSinh) {
        this.dsThiSinh.remove(thiSinh);
    }

    //    Sửa sinh viên
    public void update(ThiSinh thiSinh) {
        this.dsThiSinh.remove(thiSinh);
        this.dsThiSinh.add(thiSinh);
    }
}
