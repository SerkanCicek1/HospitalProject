package application.console.concretes;

import java.util.Scanner;

public class Start {

    public static void start(){

        Scanner inp = new Scanner(System.in);
        int select;

        do {
            System.out.println("========== DEVKENT HASTANESİ UYGULAMAMIZA HOSGELDINIZ ==========\n");
            System.out.println("1-Doktor Menüsü Seçimi");
            System.out.println("2-Hasta Menüsü Seçimi");
            System.out.println("0-Çıkış");

            select = inp.nextInt();

            switch (select){
                case 1:

                    break;
                case 2:

                    break;
                case 0:
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız!");
                    break;
            }

        }while(select != 0);

        System.out.println("İyi günler, sağlıklı günler dileriz...");
    }

}