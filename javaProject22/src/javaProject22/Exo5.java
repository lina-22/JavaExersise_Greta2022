package javaProject22;

import java.util.Scanner;

public class Exo5 {

    public static void main(String[] args) {
        int []annee = {31,28,31,30,31,30,31,31,30,31,30,31};
        Scanner sc = new Scanner(System.in);
        int mois, jour, nb=0;
        do {
            System.out.println("Quel est le mois?");
            mois= sc.nextInt();
        }while (mois<=0 || mois>12);
        do {
            System.out.println("Quel est le jour?");
            jour= sc.nextInt();
        }while (jour<=0 || jour>annee[mois-1]);

        int i = 0;
        while (i<mois-1) {
            nb = nb+annee[i] ;
            i++;
        }
        nb = nb +jour ;
        System.out.println("Nombre de jours demandÃ©: "+nb);
    }
}
