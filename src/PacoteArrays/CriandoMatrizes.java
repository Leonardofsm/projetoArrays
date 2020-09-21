
package PacoteArrays;

public class CriandoMatrizes {
 public static void main(String[] args) {

        //Declarando e instanciando uma matriz 3x3
        int numeros[][] = new int[3][3]; 

        //Inserindo valores na matriz 3x3
        numeros[0][0] = 150; 
        numeros[0][1] = 100;
        numeros[0][2] = 250;
        numeros[1][0] = 230;
        numeros[1][1] = 78;
        numeros[1][2] = 95;
        numeros[2][0] = 158;
        numeros[2][1] = 57;
        numeros[2][2] = 32;

        //Imprimindo os valores da matriz
        System.out.println("Valores na matriz: "+numeros[0][0]);
        System.out.println("Valores na matriz: "+numeros[0][1]);
        System.out.println("Valores na matriz: "+numeros[0][2]);
        System.out.println("Valores na matriz: "+numeros[1][0]);
        System.out.println("Valores na matriz: "+numeros[1][1]);
        System.out.println("Valores na matriz: "+numeros[1][2]);
        System.out.println("Valores na matriz: "+numeros[2][0]);
        System.out.println("Valores na matriz: "+numeros[2][1]);
        System.out.println("Valores na matriz: "+numeros[2][2]);

    }

    
}
