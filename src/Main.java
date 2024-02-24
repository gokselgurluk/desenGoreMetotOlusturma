import java.util.Scanner;

public class Main {
    static int pattern(int number, boolean control, int i){
        if (control){//true degeri ile başlıyoruz önce sayıyı negatife kadar düşürcez
            if (number>0){  //sayi negatif olana kadar kod blogunun çalışmasını saglıyoruz
                System.out.print(number+" ");//sayıyı herdefasında ekran yazıyoruz
                i++; //sayacı arttırıyoruz bu ekleme işlemin de yarıdmcı olacak
                return pattern(number-5,true,i); //şart saglana kadar recusive metodunu cagırıyoruz
            }else {
                return pattern(number, false, i);//sayı - veya 0 ulastıgı için code blogundan cıkıyoruz ve birdah gırmesın dıye
            }                                           //true degişkenini false yapıyoruz
        }else { //sayının negatif den pozıtıfe kadar ekleme işlemi ypaılacak
            System.out.print(number+" ");//son sayı degerını yazıyoruz - veya 0 dır
            if (i>0) {//yukarda ne kadar sure ıslem tekrarladıysa sayaca kaydettık tekrar syısı kadar ekleme yapıcaz
                i--;  // her işlemde saycı 1 eksıltecegız
                return pattern(number + 5, false, i);//recuesive metodunu kosul saglandıgı surece cagırıryoruz
            }else {
                return 0;   //sayac 0 olunca tekrar return 0 yapıyoruz kı metotu cagırmayalım donguden cıkalım
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Bir Değer Giriniz : ");
        int number = scan.nextInt();
       System.out.println(pattern(number,true,0));

    }
}