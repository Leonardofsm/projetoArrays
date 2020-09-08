
package PacoteArrays;
import javax.swing.*;

public class CriandoVetorLength {
    public static void main(String[] args) {
        int tamVet =0;
        
        String aux = JOptionPane.showInputDialog(null, "Insira o tamanho do vetor: ");
        tamVet = Integer.parseInt(aux);
        
        double pagamento[] = new double[tamVet];
        
        for (int i = 0; i < pagamento.length; i++) {
            aux = JOptionPane.showInputDialog(null, "Insira o valor do pagamento: ");
            pagamento[i] = Double.parseDouble(aux);
        }
        
        for (int i = 0; i < pagamento.length; i++) {
            System.out.println("Valor do pagamento: R$" + pagamento[i]);
        }
        
        System.out.println("Tamanho do vetor:" + tamVet);
    }
    
}
