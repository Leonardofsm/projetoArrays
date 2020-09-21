
package PacoteArrays;

import javax.swing.*;

public class MatrizComLength {
    public static void main(String[] args) {

        //Definindo o tamanho da matriz
        int linha = 0, coluna = 0;

        //Declarando e instanciando uma matriz 3x3
        int numeros[][] = new int[linha][coluna];
        String aux = "";

        aux = JOptionPane.showInputDialog(null, "Insira o número da linha");
        linha = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog(null, "Insira o número da coluna");
        coluna = Integer.parseInt(aux);

        //Inserindo valores na matriz 3x3 com estrutura de repetição
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {

                aux = JOptionPane.showInputDialog(null, "Insira números na linha: " + i + " na coluna " + j);
                numeros[i][j] = Integer.parseInt(aux);
            }
        }

        //Imprimindo os valores da matriz
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                System.out.println("Valores na matriz: " + numeros[i][j] + " Linha: " + i + " Coluna: " + j);
            }
        }
    }
    
}
