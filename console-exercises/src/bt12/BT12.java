import java.util.Scanner;

// Bai tap: nhap 1 chuoi, in ra ban chu hoa va chu thuong.
// (Da sua so voi ban goc: khai bao "string" (chu thuong) khong ton tai
// trong Java, phai la "String" - loi khien code khong the compile duoc.)
public class BT12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String a = sc.nextLine();
        System.out.println("Chuoi vua nhap la: " + a);

        String aUpper = a.toUpperCase();
        System.out.println("Ket qua chuyen sang chu hoa la: " + aUpper);

        String aLower = a.toLowerCase();
        System.out.println("Ket qua chuyen sang chu thuong la: " + aLower);
    }
}
