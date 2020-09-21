
package PacoteArrays;
import javax.swing.*;
/**
 * @author Leonardo Mendonca
 */
public class Atividade03 {
    public static void main(String[] args) {
        String aux = "";
        String nome [] = new String[50];
        double altura[] = new double[50];
        double idade [] = new double[50];
        char sexo [] = new char[50];
        
        double maiorAltura=0, menorAltura = 0, mediaAlturaMulheres =0, cont=0, idadeHomemVelho=0, idadeMulherNova=0; 
        
        
        for (int i = 0; i < 5; i++) {
            nome[i] = JOptionPane.showInputDialog(null, "Digite seu Nome: ");
            nome[i] = "Nome:" + nome[i];
            
            aux = JOptionPane.showInputDialog(null, "Digite sua altura: ");
            altura[i] = Double.parseDouble(aux);
            
            
            aux = JOptionPane.showInputDialog(null, "Digite sua idade: ");
            idade[i] = Double.parseDouble(aux);
            
            
            aux = JOptionPane.showInputDialog(null, "Digite seu sexo (M ou F): ");
            sexo[i] = aux.charAt(0);
            
            System.out.println("Nome: " + nome[i] + "\n" +
                               "Altura: " + altura[i] + "\n" +
                                "Idade: " + idade[i] + "\n" + 
                                "Sexo: " + sexo[i] + "\n" );
            if(i == 0){
                maiorAltura= altura[i];
                menorAltura = altura[i];
            } 
            
            if(menorAltura > altura[i]){
               menorAltura = altura[i]; 
            }
            if(maiorAltura < altura[i]){
               maiorAltura = altura[i]; 
            }
            if(sexo[i] == 'F'){
                cont +=1;
                mediaAlturaMulheres += altura[i];
                if(idadeMulherNova > idade[i]){
                    idadeMulherNova = idade[i];
                }
            }
            if (sexo[i] == 'M'){
                if(idadeHomemVelho < idade[i]){
                    idadeHomemVelho = idade[i];
                }
            }
            
        }
        
        System.out.println("Menor Altura:" + menorAltura);
        System.out.println("Maior Altura:" + maiorAltura);
        System.out.println("Média Altura Mulheres:" + (mediaAlturaMulheres/cont));
        System.out.println("Idade Homem mais velho:" + idadeHomemVelho);
        System.out.println("Idade mulher mais nova:" + idadeMulherNova);
        

    }
}
