
package projetointegrado;

import java.util.Scanner;


public class ProjetoIntegrado {

   
    public static void main(String[] args) {
        
        Resistor res1 = new Resistor();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escolha:\n1.Converter valor para cor.\n2.Converter cor para valor.");
        int esc = sc.nextInt();
        
        while (esc != 0){
            if (esc == 1){
                System.out.println("Digite o valor do seu resistor");
                double y = sc.nextDouble();
                res1.Resistencia_cor(y);
                System.out.println("\nO seu resistor tem as seguintes cores seguindo essa ordem:" + res1.getCor1() + " "  + res1.getCor2()+ " " + res1.getCor3()+ " " + res1.getCor4());
                System.out.println("O seu resistor eh comercial? " + res1.getComercial());
            }else if (esc == 2){
                System.out.println("Digite as cores do seu resistor em ordem");
                String cor1 = sc.next();
                String cor2 = sc.next();
                String cor3 = sc.next();
                res1.cor_resistencia(cor1, cor2, cor3);
                System.out.println("\nO seu resistor vale:" + res1.getRes() + "Ω");
                System.out.println("O seu resistor eh comercial? " + res1.getComercial());
            }else{
                System.out.println("Valor invalido");
            }
            System.out.println("\nEscolha:\n1.Converter valor para cor.\n2.Converter cor para valor.\n0.SAIR");
            esc = sc.nextInt();
        }
        
    }
    
}
