import java.util.Scanner;

// Bai tap: nhap 2 so nguyen a, b va tinh tong.
// (Da sua so voi ban goc: bien a/b khai bao la int nhung gan bang
// sc.nextLine() - loi kieu du lieu; va System.out.println(...) dung sai
// cu phap voi nhieu tham so phay - Java khong ho tro kieu nay. Ca 2 loi
// deu khien code khong the compile duoc.)
public class BT11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen a = ");
        int a = sc.nextInt();
        System.out.print("Nhap so nguyen b = ");
        int b = sc.nextInt();
        System.out.println("Tong " + a + " + " + b + " = " + (a + b));
    }
}
