import java.util.Scanner;
public class Main {
    static double us(double a, double b){
        if (b==1){
            return a;
        } else {
            return us(a,b-1)*a;
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("TABAN DEĞERİNİ giriniz: ");
        double a= in.nextDouble();
        System.out.println("ÜS DEĞERİNİ giriniz: ");
        double b= in.nextDouble();
        System.out.println("Sonuç : "+us(a,b));
    }
}