import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int armut,elma,domates,muz,patlican;
        double armutFiyat=2.14,elmaFiyat=3.67,domatesFiyat=1.11,muzFiyat=0.95,patlicanFiyat=5,toplam;

        Scanner girdi = new Scanner(System.in);
        System.out.print("Armut Kac Kilo ? : ");
        armut = girdi.nextInt();
        System.out.print("Elma Kac Kilo ? : ");
        elma = girdi.nextInt();
        System.out.print("Domates Kac Kilo ? : ");
        domates = girdi.nextInt();
        System.out.print("Muz Kac Kilo ? : ");
        muz = girdi.nextInt();
        System.out.print("Patlican Kac Kilo ? : ");
        patlican = girdi.nextInt();

        toplam=armut*armutFiyat+elma*elmaFiyat+domates*domatesFiyat+muz*muzFiyat+patlican*patlicanFiyat;

        System.out.print("Toplam Tutar: "+toplam+ " TL");

    }
}
