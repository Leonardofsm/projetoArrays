
package PacoteArrays;
import javax.swing.*;

public class CriandoPercorrendoVetorRepeticao {
    public static void main(String[] args) {
        //String aux ="";
      
        //Iniciando o vetor
       double numeros[] = new double[5];
       
       //percorrendo o vetor e inserindo informações no vetor
       for (int i =0; i < 5; i++) { 
       String aux = JOptionPane.showInputDialog(null, "Insira números");
       numeros[i] = Double.parseDouble(aux);
       }
       
       //percorrendo o vetor e imprimindo os valores
        for (int i = 0; i < 5; i++) {
            System.out.println("Valores do vetor: " + numeros[i] + " na posição: " + i);
        }
    }
    
}
