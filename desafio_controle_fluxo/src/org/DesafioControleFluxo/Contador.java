package org.DesafioControleFluxo;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Por favor, digite o primeiro valor: ");
        int parametroUm = entrada.nextInt();
        System.out.print("Por favor, digite o segundo valor: ");
        int parametroDois = entrada.nextInt();
        System.out.println("");
        
        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
        
        entrada.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroDois é maior que parametroUm
        if (parametroDois <= parametroUm) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }
        
        // Laço for que imprime os números com base na variável contagem.
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Imprimindo o número: " + i);
        }
    }
}