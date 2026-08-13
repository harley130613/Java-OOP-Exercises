/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btc2;
import java.util.Scanner;
/**
 *
 * @author PM09 17
 */
public class BTC2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        System.out.print("Java MyProg 1 ");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        if(month <3)
        {
            /*month =12;
            year -=1;*/
            int k = (day + 2*(month + 12) + 3*(month+12+1)/5 + (year-1) + (year-1)/4)%7;
            /*switch(k){
            case 0:
                System.out.println(day+"/"+month+"/"+year+" la Chu nhat");
                break;
            case 1:
                System.out.println(day+"/"+month+"/"+year+" la Thu hai");
                break;
            case 2:
                System.out.println(day+"/"+month+"/"+year+" la Thu ba");
                break;
            case 3:
                System.out.println(day+"/"+month+"/"+year+" la Thu tu");
                break;
            case 4:
                System.out.println(day+"/"+month+"/"+year+" la Thu nam");
                break;
            case 5:
                System.out.println(day+"/"+month+"/"+year+" la Thu sau");
                break;
            case 6:
                System.out.println(day+"/"+month+"/"+year+" la Thu bay");
                break;
            default:
                System.out.println("Loi");
            }*/
           return;
           
        }
       
        int k = (((day + 2*month + 3*(month+1))/5 + year + year/4)%7);
        switch(k){
            case 0:
                System.out.println(day+"/"+month+"/"+year+" la Chu nhat");
                break;
            case 1:
                System.out.println(day+"/"+month+"/"+year+" la Thu hai");
                break;
            case 2:
                System.out.println(day+"/"+month+"/"+year+" la Thu ba");
                break;
            case 3:
                System.out.println(day+"/"+month+"/"+year+" la Thu tu");
                break;
            case 4:
                System.out.println(day+"/"+month+"/"+year+" la Thu nam");
                break;
            case 5:
                System.out.println(day+"/"+month+"/"+year+" la Thu sau");
                break;
            case 6:
                System.out.println(day+"/"+month+"/"+year+" la Thu bay");
                break;
            default:
                System.out.println("Loi");

        }
    }
    
}
