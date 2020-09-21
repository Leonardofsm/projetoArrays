package PacoteArrays;

import javax.swing.*;

public class PercorrerMatrizRepeticao {

    public static void main(String[] args) {

        //Declarando e instanciando uma matriz 3x3
        int numeros[][] = new int[3][3];
        String aux = "";

        //Inserindo valores na matriz 3x3 com estrutura de repetição
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                aux = JOptionPane.showInputDialog(null, "Insira números na linha: " + i + " na coluna " + j);
                numeros[i][j] = Integer.parseInt(aux);
            }
        }

        //Imprimindo os valores da matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Valores na matriz: " + numeros[i][j] + " Linha: " + i + " Coluna: " + j);
            }
        }
    }

}
