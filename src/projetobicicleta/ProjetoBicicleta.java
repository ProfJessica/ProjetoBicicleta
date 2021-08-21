package projetobicicleta;

import java.util.Scanner;


public class ProjetoBicicleta {

    public static void main(String[] args) {
        System.out.println("Quantas rodas a sua bicicleta tem? ");
        Scanner input = new Scanner(System.in);
        
        int Rodas = input.nextInt();
 
        System.out.println("A sua bicicleta tem " + Rodas + " rodas.");

    }
    
}
