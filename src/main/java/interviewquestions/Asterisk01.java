package interviewquestions;

import java.util.Scanner;

public class Asterisk01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz");
        int satirSayisi = input.nextInt();

        for(int i = 1; i<satirSayisi*2; i++){

            if(i%2!=0){

                if(satirSayisi>i){
                    for(int bosluk = 1; bosluk<=satirSayisi-i; bosluk++){
                        System.out.print(" ");
                    }
                    for(int yildiz = 1; yildiz<=i; yildiz++){
                        System.out.print("* ");
                    }

                }else {

                    for(int yildiz = 0; yildiz<i-satirSayisi; yildiz++){
                        System.out.print(" ");
                    }
                    for(int bosluk = satirSayisi; bosluk>i-satirSayisi; bosluk--){
                        System.out.print("* ");
                    }

                }
                System.out.println();

            }

        }
}}
