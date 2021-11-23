
package projetointegrado;

public class Resistor {
    //atributos
    private String comercial;
    private double res;
    private double ph;
    private String cor1;
    private String cor2;
    private String cor3;
    private final String cor4 = "Sua 4 cor pode ser tanto dourada como prateada depende da tolerancia";    
     
    //metodo 1
    public void Resistencia_cor(double x){
        
        this.res = x;
        
        if(this.res <10){
            cor3 = "Prata";
            ph = this.res*10;
            
        }else if(this.res >=10 && this.res<100){
            cor3 = "Preto";
            ph = this.res;
            
        }else if(this.res >=100 && this.res<1000){
            cor3 = "Marrom";
            ph = this.res/10;
            
        }else if(this.res >=1000 && this.res<10000){
            cor3 = "Vermelho";
            ph = this.res/100;
            
        }else if(this.res >=10000 && this.res<100000){
            cor3 = "Laranja";
            ph = this.res/1000;
            
        }else if(this.res >=100000 && this.res<1000000){
            cor3 = "Amarelo";
            ph = this.res/10000;
            
        }else if(this.res == 1000000){
            cor1 = "Marrom";
            cor2 = "Preto"; 
            cor3 = "Verde";
        }
        
        double valor2 = ph%10;
        double valor1 = ph - valor2;
        
        if(valor1 == 10){
                cor1 = "Marrom";
                if(valor2 == 1){
                    cor2 = "Marrom";
                    comercial = "Sim";
                }else if(valor2 == 2){
                    cor2 = "Vermelho";
                    comercial = "Sim";
                }else if(valor2 == 3){
                    cor2 = "Laranja";
                    comercial = "Sim";
                }else if(valor2 == 4){
                    cor2 = "Amarelo";
                    comercial = "Nao";
                }else if(valor2 == 5){
                    cor2 = "Verde";
                    comercial = "Sim";
                }else if(valor2 == 6){
                    cor2 = "Azul";
                    comercial = "Sim";
                }else if(valor2 == 7){
                    cor2 = "Violeta";
                    comercial = "Nao";
                }else if(valor2 == 8){
                    cor2 = "Cinza";
                    comercial = "Sim";
                }else if(valor2 == 9){
                    cor2 = "Branco";
                    comercial = "Nao";
                }else if(valor2 == 0){
                    cor2 = "Preto";
                    comercial = "Sim";
                }
            }else if(valor1 == 20){
                cor1 = "Vermelho";
                if(valor2 == 1){
                    cor2 = "Marrom";
                    comercial = "Nao";
                }else if(valor2 == 2){
                    cor2 = "Vermelho";
                    comercial = "Sim";
                }else if(valor2 == 3){
                    cor2 = "Laranja";
                    comercial = "Nao";
                }else if(valor2 == 4){
                    cor2 = "Amarelo";
                    comercial = "Sim";
                }else if(valor2 == 5){
                    cor2 = "Verde";
                    comercial = "Nao";
                }else if(valor2 == 6){
                    cor2 = "Azul";
                    comercial = "Nao";
                }else if(valor2 == 7){
                    cor2 = "Violeta";
                    comercial = "Sim";
                }else if(valor2 == 8){
                    cor2 = "Cinza";
                    comercial = "Nao";
                }else if(valor2 == 9){
                    cor2 = "Branco";
                    comercial = "Nao";
                }else if(valor2 == 0){
                    cor2 = "Preto";
                    comercial = "Sim";
                }
            }else if(valor1 == 30){
                cor1 = "Laranja";
                if(valor2 == 1){
                    cor2 = "Marrom";
                    comercial = "Nao";
                }else if(valor2 == 2){
                    cor2 = "Vermelho";
                    comercial = "Nao";
                }else if(valor2 == 3){
                    cor2 = "Laranja";
                    comercial = "Sim";
                }else if(valor2 == 4){
                    cor2 = "Amarelo";
                    comercial = "Nao";
                }else if(valor2 == 5){
                    cor2 = "Verde";
                    comercial = "Nao";
                }else if(valor2 == 6){
                    cor2 = "Azul";
                    comercial = "Sim";
                }else if(valor2 == 7){
                    cor2 = "Violeta";
                    comercial = "Nao";
                }else if(valor2 == 8){
                    cor2 = "Cinza";
                    comercial = "Nao";
                }else if(valor2 == 9){
                    cor2 = "Branco";
                    comercial = "Sim";
                }else if(valor2 == 0){
                    cor2 = "Preto";
                    comercial = "Sim";
                }
            }else if(valor1 == 40){
                cor1 = "Amarelo";
                if(valor2 == 1){
                    cor2 = "Marrom";
                    comercial = "Nao";
                }else if(valor2 == 2){
                    cor2 = "Vermelho";
                    comercial = "Nao";
                }else if(valor2 == 3){
                    cor2 = "Laranja";
                    comercial = "Sim";
                }else if(valor2 == 4){
                    cor2 = "Amarelo";
                    comercial = "Nao";
                }else if(valor2 == 5){
                    cor2 = "Verde";
                    comercial = "Nao";
                }else if(valor2 == 6){
                    cor2 = "Azul";
                    comercial = "Nao";
                }else if(valor2 == 7){
                    cor2 = "Violeta";
                    comercial = "Sim";
                }else if(valor2 == 8){
                    cor2 = "Cinza";
                    comercial = "Nao";
                }else if(valor2 == 9){
                    cor2 = "Branco";
                    comercial = "Nao";
                }else if(valor2 == 0){
                    cor2 = "Preto";
                    comercial = "Nao";
                }
            }else if(valor1 == 50){
                cor1 = "Verde";
                if(valor2 == 1){
                    cor2 = "Marrom";
                    comercial = "Sim";
                }else if(valor2 == 2){
                    cor2 = "Vermelho";
                    comercial = "Nao";
                }else if(valor2 == 3){
                    cor2 = "Laranja";
                    comercial = "Sim";
                }else if(valor2 == 4){
                    cor2 = "Amarelo";
                    comercial = "Nao";
                }else if(valor2 == 5){
                    cor2 = "Verde";
                    comercial = "Nao";
                }else if(valor2 == 6){
                    cor2 = "Azul";
                    comercial = "Sim";
                }else if(valor2 == 7){
                    cor2 = "Violeta";
                    comercial = "Nao";
                }else if(valor2 == 8){
                    cor2 = "Cinza";
                    comercial = "Nao";
                }else if(valor2 == 9){
                    cor2 = "Branco";
                    comercial = "Nao";
                }else if(valor2 == 0){
                    cor2 = "Preto";
                    comercial = "Nao";
                }
            }else if(valor1 == 60){
                cor1 = "Azul";
                if(valor2 == 1){
                    cor2 = "Marrom";
                    comercial = "Nao";
                }else if(valor2 == 2){
                    cor2 = "Vermelho";
                    comercial = "Sim";
                }else if(valor2 == 3){
                    cor2 = "Laranja";
                    comercial = "Nao";
                }else if(valor2 == 4){
                    cor2 = "Amarelo";
                    comercial = "Nao";
                }else if(valor2 == 5){
                    cor2 = "Verde";
                    comercial = "Nao";
                }else if(valor2 == 6){
                    cor2 = "Azul";
                    comercial = "Nao";
                }else if(valor2 == 7){
                    cor2 = "Violeta";
                    comercial = "Nao";
                }else if(valor2 == 8){
                    cor2 = "Cinza";
                    comercial = "Sim";
                }else if(valor2 == 9){
                    cor2 = "Branco";
                    comercial = "Nao";
                }else if(valor2 == 0){
                    cor2 = "Preto";
                    comercial = "Nao";
                }
            }else if(valor1 == 70){
                cor1 = "Violeta";
                if(valor2 == 1){
                    cor2 = "Marrom";
                    comercial = "Nao";
                }else if(valor2 == 2){
                    cor2 = "Vermelho";
                    comercial = "Nao";
                }else if(valor2 == 3){
                    cor2 = "Laranja";
                    comercial = "Nao";
                }else if(valor2 == 4){
                    cor2 = "Amarelo";
                    comercial = "Nao";
                }else if(valor2 == 5){
                    cor2 = "Verde";
                    comercial = "Sim";
                }else if(valor2 == 6){
                    cor2 = "Azul";
                    comercial = "Nao";
                }else if(valor2 == 7){
                    cor2 = "Violeta";
                    comercial = "Nao";
                }else if(valor2 == 8){
                    cor2 = "Cinza";
                    comercial = "Nao";
                }else if(valor2 == 9){
                    cor2 = "Branco";
                    comercial = "Nao";
                }else if(valor2 == 0){
                    cor2 = "Preto";
                    comercial = "Nao";
                }
            }else if(valor1 == 80){
                cor1 = "Cinza";
                if(valor2 == 1){
                    cor2 = "Marrom";
                    comercial = "Nao";
                }else if(valor2 == 2){
                    cor2 = "Vermelho";
                    comercial = "Sim";
                }else if(valor2 == 3){
                    cor2 = "Laranja";
                    comercial = "Nao";
                }else if(valor2 == 4){
                    cor2 = "Amarelo";
                    comercial = "Nao";
                }else if(valor2 == 5){
                    cor2 = "Verde";
                    comercial = "Nao";
                }else if(valor2 == 6){
                    cor2 = "Azul";
                    comercial = "Nao";
                }else if(valor2 == 7){
                    cor2 = "Violeta";
                    comercial = "Nao";
                }else if(valor2 == 8){
                    cor2 = "Cinza";
                    comercial = "Nao";
                }else if(valor2 == 9){
                    cor2 = "Branco";
                    comercial = "Nao";
                }else if(valor2 == 0){
                    cor2 = "Preto";
                    comercial = "Nao";
                }
            }else if(valor1 == 90){
                cor1 = "Branco";
                if(valor2 == 1){
                    cor2 = "Marrom";
                    comercial = "Sim";
                }else if(valor2 == 2){
                    cor2 = "Vermelho";
                    comercial = "Nao";
                }else if(valor2 == 3){
                    cor2 = "Laranja";
                    comercial = "Nao";
                }else if(valor2 == 4){
                    cor2 = "Amarelo";
                    comercial = "Nao";
                }else if(valor2 == 5){
                    cor2 = "Verde";
                    comercial = "Nao";
                }else if(valor2 == 6){
                    cor2 = "Azul";
                    comercial = "Nao";
                }else if(valor2 == 7){
                    cor2 = "Violeta";
                    comercial = "Nao";
                }else if(valor2 == 8){
                    cor2 = "Cinza";
                    comercial = "Nao";
                }else if(valor2 == 9){
                    cor2 = "Branco";
                    comercial = "Nao";
                }else if(valor2 == 0){
                    cor2 = "Preto";
                    comercial = "Nao";
                }
            }
        
    }
    
    //metodo 2
    public void cor_resistencia(String x1,String x2, String x3){
        
        if("Marrom".equals(x1) || "marrom".equals(x1)){
            this.res = 10;      
        }else if("Vermelho".equals(x1) || "vermelho".equals(x1) ){
            this.res = 20;
        }else if("Laranja".equals(x1)|| "laranja".equals(x1)){
            this.res = 30;
        }else if("Amarelo".equals(x1)|| "amarelo".equals(x1)){
            this.res = 40;
        }else if("Verde".equals(x1)|| "verde".equals(x1)){
            this.res = 50;
        }else if("Azul".equals(x1)|| "azul".equals(x1)){
            this.res = 60;
        }else if("Violeta".equals(x1)|| "violeta".equals(x1)){
            this.res = 70;
        }else if("Cinza".equals(x1)|| "cinza".equals(x1)){
            this.res = 80;
        }else if("Branco".equals(x1)|| "branco".equals(x1)){
            this.res = 90;
        }else{
            System.out.println("Valor Para cor1 invalido!");
        }
        
        if("Marrom".equals(x2) || "marrom".equals(x2)){
            this.res = this.res + 1;      
        }else if("Vermelho".equals(x2) || "vermelho".equals(x2)){
            this.res = this.res + 2;
        }else if("Laranja".equals(x2) || "laranja".equals(x2)){
            this.res = this.res + 3;
        }else if("Amarelo".equals(x2) || "amarelo".equals(x2)){
            this.res = this.res + 4;
        }else if("Verde".equals(x2) || "verde".equals(x2)){
            this.res = this.res + 5;
        }else if("Azul".equals(x2) || "azul".equals(x2)){
            this.res = this.res + 6;
        }else if("Violeta".equals(x2) || "violeta".equals(x2)){
            this.res = this.res + 7;
        }else if("Cinza".equals(x2) || "cinza".equals(x2)){
            this.res = this.res + 8;
        }else if("Branco".equals(x2) || "branco".equals(x2)){
            this.res = this.res + 9;
        }else if("Preto".equals(x2) || "preto".equals(x2)){
            this.res = this.res + 0;
        }else{
           System.out.println("Valor Para cor2 invalido!"); 
        }
        
        double[] ValoresComerciais = {10,11,12,13,15,16,18,20,22,24,27,30,33,36,39,43,47,51,56,62,68,75,82,91};
        int i = 0;
        while(i <24){
            if(this.res == ValoresComerciais[i]){
                comercial = "Sim";
                break;
            }else{
                comercial = "Nao";
                i = i+1;
            }
        }
        
        if("Prata".equals(x3) || "prata".equals(x3)){
            this.res = this.res * 0.1;      
        }else if("Preto".equals(x3) || "preto".equals(x3)){
            this.res = this.res * 1;
        }else if("Marrom".equals(x3) || "marrom".equals(x3)){
            this.res = this.res * 10;
        }else if("Vermelho".equals(x3) || "vermelho".equals(x3)){
            this.res = this.res * 100;
        }else if("Laranja".equals(x3) || "laranja".equals(x3)){
            this.res = this.res * 1000;
        }else if("Amarelo".equals(x3) || "amarelo".equals(x3)){
            this.res = this.res * 10000;
        }else if("Verde".equals(x3) || "verde".equals(x3)){
            this.res = this.res * 100000;
        }else{
            System.out.println("Valor Para cor3 invalido!");
        }
        
    }

    //getter
    public String getComercial() {
        return comercial;
    }
    
    public double getRes() {
        return res;
    }

    public String getCor1() {
        return cor1;
    }

    public String getCor2() {
        return cor2;
    }

    public String getCor3() {
        return cor3;
    }

    public String getCor4() {
        return cor4;
    }
    
    
}
