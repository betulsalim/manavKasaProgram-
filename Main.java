import java.util.Scanner;
public class Main {
    public static void main(String [ ] args){
        float toplamTutar,armutFiyat=2.14f,elmaFiyat=3.67f,domatesFiyat=1.11f,muzFiyat=0.95f,patlıcanFiyat=5.00f;
        float akg,ekg,dkg,mkg,pkg;

        Scanner input = new Scanner(System.in);

        System.out.println("Armut kaç kilo? ");
        akg = input.nextFloat();

        System.out.println("Elma kaç kilo? ");
        ekg = input.nextFloat();

        System.out.println("Domates kaç kilo? ");
        dkg = input.nextFloat();

        System.out.println("Patlıcan kaç kilo? ");
        pkg = input.nextFloat();

        System.out.println("Muz kaç kilo? ");
        mkg  =  input.nextFloat();

        toplamTutar = (akg*armutFiyat) + (patlıcanFiyat*pkg) + (dkg*domatesFiyat) +(mkg*muzFiyat) + (elmaFiyat*ekg);
        System.out.println(toplamTutar);
    }
}
