package sef.module3.sample;
import java.util.Scanner; 

/**
 * @FrancielyBastos 
 * Para Casa #1
 */

public class TotalIngressos {
    public static void main(String[] args) {
    	
    	int valorA = 50, valorB = 30, valorC = 20, bilhetesA, bilhetesB, bilhetesC, rendaTotal;
    	
        Scanner input = new Scanner(System.in);
        
        //Obtém o total de ingressos classe A vendidos e armazena em bilhetesA
        System.out.println("Quantos bilhetes da Classe A foram vendidos? ");
        bilhetesA = input.nextInt();
                                  
        //Obtém o total de ingressos classe B vendidos e armazena em bilhetesB
        System.out.println("Quantos bilhetes da Classe B foram vendidos? ");
        bilhetesB = input.nextInt();
        
        //Obtém o total de ingressos classe C vendidos e armazena em bilhetesC
        System.out.println("Quantos bilhetes da Classe C foram vendidos? ");
        bilhetesC = input.nextInt();
        
        input.close();
        
        //Cálculo da renda gerada com os ingressos e imprime o valor na tela
        rendaTotal = (valorA * bilhetesA) + (valorB * bilhetesB) + (valorC * bilhetesC);
        
        System.out.println("A renda total gerada pela venda dos ingressos foi: R$" + rendaTotal);
        
    }
}
