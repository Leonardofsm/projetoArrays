
package PacoteArrays;

public class CriandoPercorrendoVetores {
    public static void main(String[] args) {
        String [] nomes = new String[5];
        
        //Inserindo dados no vetor
        nomes[0] = "Leonardo";
        nomes[1] = "Felipe";
        nomes[2] = "Santos";
        nomes[3] = "Mendonca";
        nomes[4] = "Girafa";
        
        
        //Percorrendo vetor com estrutura de repetição
        for(int i =0; i < 5; i++) {
            
        System.out.println("Seu nome é :" + nomes[i]);
        }
        
        
    }
    
}
