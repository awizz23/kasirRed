package test_kasir;

import java.util.Scanner;

public class Test_kasir {

    public static void main(String[] args) {
        Scanner upis = new Scanner(System.in);

        System.out.println("Upišite visinu prvog kupaca u redu: ");

        int kupac01 = upis.nextInt();

        System.out.println("Upišite visinu drugog kupaca u redu: ");

        int kupac02 = upis.nextInt();

        System.out.println("Upišite visinu trećeg kupaca u redu: ");

        int kupac03 = upis.nextInt();

        System.out.println("Upišite visinu četvrtog kupaca u redu: ");

        int kupac04 = upis.nextInt();

        System.out.println("Upišite visinu petog kupaca u redu: ");

        int kupac05 = upis.nextInt();

        int vidljivi01, vidljivi02;

        if (kupac02 > kupac03) {
            vidljivi01 = kupac02;
        } else {
            vidljivi01 = kupac03;
        }

        if (kupac04 > kupac05) {
            vidljivi02 = kupac04;
        } else {
            vidljivi02 = kupac05;
        }
        System.out.println("Kupci koje kasisr vidi su: " + kupac01 + ", " + vidljivi01 + ", " + vidljivi02);

        //System.out.println("Kupci koje kasir vidi imaju visinu: " + kupac01 + ", " + kupac02 + ", " + kupac03 + ", " + kupac04 + ", " + kupac05);
    }
}
