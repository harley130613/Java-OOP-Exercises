/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btct;

/**
 *
 * @author PM01 27
 */
public class KhachSan extends Nguoi {
    public float SoNgayTro;
    public String LoaiPhong;
    public float GiaPhong;
    public KhachSan (String HoTen, String NgaySinh, int CMND, float SoNgayTro,
            String LoaiPhong, float GiaPhong)
            {
                super (HoTen, NgaySinh, CMND);
                this.SoNgayTro = SoNgayTro;
                this.LoaiPhong = LoaiPhong;
                this.GiaPhong = GiaPhong;
            }
    public void show()
            {
                System.out.println("Ho ten khach hang: "+ HoTen);
                System.out.println("Ngay sinh: "+ NgaySinh);
                System.out.println("So chung minh thu: "+ CMND);
                System.out.println("So ngay tro: "+SoNgayTro);
                System.out.println("Loai phong tro: "+ LoaiPhong);
                System.out.println("Gia phong tro: "+ GiaPhong);
                
            }
    
    
}
