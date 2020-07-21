/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM;

/**
 *
 * @author 0ldbl
 */
public class SinhVien {

    private String manv;
    private String hoten;
    private String email;
    private String sodt;
    private boolean gioitinh;
    private String diachi;
    private String hinh;

    public SinhVien() {
        
    }

    public SinhVien(String manv, String hoten, String email, String sodt, boolean gioitinh, String diachi, String hinh) {
        this.manv = manv;
        this.hoten = hoten;
        this.email = email;
        this.sodt = sodt;
        this.diachi = diachi;
        this.hinh = hinh;
        this.gioitinh = gioitinh;
    }

    /**
     * @return the manv
     */
    public String getManv() {
        return manv;
    }

    /**
     * @param manv the manv to set
     */
    public void setManv(String manv) {
        this.manv = manv;
    }

    /**
     * @return the hoten
     */
    public String getHoten() {
        return hoten;
    }

    /**
     * @param hoten the hoten to set
     */
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the sodt
     */
    public String getSodt() {
        return sodt;
    }

    /**
     * @param sodt the sodt to set
     */
    public void setSodt(String sodt) {
        this.sodt = sodt;
    }

    /**
     * @return the diachi
     */
    public String getDiachi() {
        return diachi;
    }

    /**
     * @param diachi the diachi to set
     */
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    /**
     * @return the hinh
     */
    public String getHinh() {
        return hinh;
    }

    /**
     * @param hinh the hinh to set
     */
    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    /**
     * @return the gioitinh
     */
    public boolean isGioitinh() {
        return gioitinh;
    }

    /**
     * @param gioitinh the gioitinh to set
     */
    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

}
