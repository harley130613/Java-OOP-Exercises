/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btct;

/**
 *
 * @author PM01 27
 */
public class Nguoi {
    public String HoTen;
    public String NgaySinh;
    public int CMND;
    public Nguoi (String HoTen1, String NgaySinh1, int CMND1)
            {
                HoTen = HoTen1;
                NgaySinh = NgaySinh1;
                CMND = CMND1;
            }
    public void show()
            {
                System.out.println("Ho ten khach hang: "+ HoTen);
                System.out.println("Ngay sinh: "+ NgaySinh);
                System.out.println("So chung minh thu: "+ CMND);
            }
            
}
