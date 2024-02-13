
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int sayi, kalan, total = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir sayi giriniz : ");
        sayi = scanner.nextInt();
        
        while(sayi != 0){
            kalan = sayi % 10;
            total += kalan;
            sayi /= 10;
        }
        System.out.println("Basamaklari toplami : " + total);
        
        
        
    }
}
