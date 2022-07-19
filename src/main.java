import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        double heat;
        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık Giriniz : ");
        heat=input.nextDouble();

        if (heat < 5){
            System.out.println("Önerilen Etkinlik  = Kayak ");
        }else if (heat >= 5 && heat <= 15){
            System.out.println("Önerilen Etkinlik  = Sinema");
        }else if (heat >=15 && heat <= 25){
            System.out.println("Önerilen Etkinlik  = Piknik");
        }else {
            System.out.println("Önerilen Etkinlik  = Yüzme");
        }

    }
}
