import java.util.Scanner;
public class SinifGecme {
    public static void main(String[] args) {
        double mat, fiz, turk, kim, muzik, ortalama, notToplam=0;
        int dersSayisi=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notu: ");
        mat = input.nextDouble();
        System.out.print("Fizik notu: ");
        fiz = input.nextDouble();
        System.out.print("Türkçe notu: ");
        turk = input.nextDouble();
        System.out.print("Kimya notu: ");
        kim = input.nextDouble();
        System.out.print("Müzik notu: ");
        muzik = input.nextDouble();

        if(mat>=0 && mat<=100){
            notToplam += mat;
            dersSayisi++;
        }
        if(fiz>=0 && fiz<=100){
            notToplam += fiz;
            dersSayisi++;
        }
        if(turk>=0 && turk<=100){
            notToplam += turk;
            dersSayisi++;
        }
        if(kim>=0 && kim<=100){
            notToplam += kim;
            dersSayisi++;
        }
        if(muzik>=0 && muzik<=100){
            notToplam += muzik;
            dersSayisi++;
        }
        ortalama = notToplam/dersSayisi;
        System.out.println("Ortalamaniz: " + ortalama);
        if (ortalama>=55){
            System.out.println("Geçtiniz!");
        } else{
            System.out.println("Kaldınız!");
        }


    }
}
