import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi, i, toplam = 0;
        Scanner scn = new Scanner(System.in);

        do {
            System.out.print("Lütfen bir sayı giriniz: ");
            sayi= scn.nextInt();
            //4 ün katları otomatik olarak 2 nin katları olduğu için 4 e bölünebilmeyi eklememize gerek yok
            if(sayi%2==0){
                toplam+=sayi;
            }
        }
        while(sayi%2==0);

        System.out.print("Girilen sayılardan 4 ve 2 nin katlarının toplamları: " + toplam);
    }
}