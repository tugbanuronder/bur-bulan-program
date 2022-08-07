import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int ay, gun;

        System.out.print("Hangi ay dogdunuz:");
        ay = input.nextInt();
        System.out.print("Hangi gun dogdunuz:");
        gun = input.nextInt();

        if(ay>=1 && ay<=12){
            if(gun>=1 && gun<=31){
                if(ay==1 && gun<22){
                    System.out.println("Oglak burcusunuz.");
                } else if (ay ==1 && gun>21){
                    System.out.println("Kova burcusunuz.");
                } else if (ay==2 && gun<20) {
                    System.out.println("Kova burcusunuz.");
                } else if (ay ==2 && gun>19) {
                    System.out.println("Balık burcusunuz.");
                } else if (ay == 3 && gun<21) {
                    System.out.println("Balık burcusunuz.");
                } else if (ay == 3 && gun>20) {
                    System.out.println("Koc burcusunuz.");
                } else if (ay == 4 && gun<21) {
                    System.out.println("Koc burcusunuz.");
                } else if (ay == 4 && gun>20) {
                    System.out.println("Boga burcusunuz.");
                } else if (ay == 5 && gun<22) {
                    System.out.println("Boga burcusunuz.");
                } else if (ay == 5 && gun>21) {
                    System.out.println("Ikizler burcusunuz.");
                } else if (ay == 6 && gun<23) {
                    System.out.println("Ikizler burcusunuz.");
                } else if (ay == 6 && gun>22) {
                    System.out.println("Yengec burcusunuz.");
                } else if (ay == 7 && gun<23) {
                    System.out.println("Yengec burcusunuz.");
                } else if (ay == 7 && gun>22) {
                    System.out.println("Aslan burcusunuz.");
                } else if (ay == 8 && gun<23) {
                    System.out.println("Aslan burcusunuz.");
                } else if (ay ==8 && gun >22) {
                    System.out.println("Basak burcusunuz.");
                } else if (ay==9 && gun<23) {
                    System.out.println("Basak burcusunuz.");
                } else if (ay==9 && gun>22) {
                    System.out.println("Terazi burcusunuz.");
                } else if (ay == 10 && gun<23) {
                    System.out.println("Terazi burcusunuz.");
                } else if (ay== 10 && gun>22) {
                    System.out.println("Akrep burcusunuz.");
                } else if (ay ==11 && gun<22) {
                    System.out.println("Akrep burcusunuz.");
                } else if (ay ==11 && gun>21) {
                    System.out.println("Yay burcusunuz.");
                } else if (ay == 12 && gun<22) {
                    System.out.println("Yay burcusunuz.");
                } else if (ay ==12 && gun>22) {
                    System.out.println("Oglak burcusunuz.");
                }
            }else{
                System.out.println("Gun degeriniz yanlıs.Tekrardan deneyiniz.");
            }
        }else {
            System.out.println("Ay degeriniz yanlıs.Tekrardan deneyiniz.");
        }
    }
}