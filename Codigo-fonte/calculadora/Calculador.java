package calculadora;

import java.util.Scanner;

/**
 *
 * @author Alberto tonela
 */
public class Calculador {
    public static void main(String[] args) {
        double soma = 0; double resultado = 0; double resultad = 1; double resulta = 1;
        int s =1;
        int opcao;
        Scanner tec = new Scanner (System.in);
        String   resp  ;
        int k = 0;
        do{
        System.out.println("=========================================================================================================================");
        System.out.println(" ___________         BEM VINDO A SUA MAQUINA CALCULADORA          _______________");
        System.out.println(" dgite [1] para adicao ,[2] subtracao , [3] multiplicacao ,"
                + "[4] divisao , [5] para calcular o factorial  e [0] para sair ");
        System.out.println("=========================================================================================================================");

           
        opcao =tec.nextInt();
        switch(opcao){
            case 1:
                System.out.println(" digite o primeiro numero");
                double a = tec.nextDouble();
                System.out.println(" digite o segundo numero ");
                double b = tec.nextDouble();
                 soma = (a+b);
                break;
            case 2:
                System.out.println(" digite o primeiro numero ");
                double c = tec.nextDouble();
                System.out.println(" digite o segundo numero ");
                double d = tec.nextDouble();
                 resultado = (c-d);
                
                break;
            case 3:
                System.out.println(" digite o primeriro numero");
                double e = tec.nextDouble();
                System.out.println(" digite o segundo numero");
                double f =tec.nextDouble();
                 resultad = (e*f);
                break;
            case 4:
                System.out.println("digite o primeiro numero ");
                double g = tec.nextDouble();
                System.out.println(" digite o segundo numero ");
                double h = tec.nextDouble();
                if(h==0){
                    System.out.println(" ERRO!!,nao posso realizar uma divisao com zero ");
                } 
                 resulta = (g/h);
                break;
            case 5:
                System.out.println(" informe o numero ");
                //int s =1;
                 int p = tec.nextInt();
                 for( int i = p ; i>= 1 ; i-- ){
                    s*=i;
                     //System.out.println(p);
                 }
                 
                break;
            case 0:
                System.exit(0);
                break;
            default :
                
                
                break;
        }  
        System.out.println( " digite [k] para continuar ou[l] para sair ");
        resp = tec.next();
        }while(resp.equals("k") );   //System.out.println();
        
       System.out.println(" a soma total e "+soma); 
       System.out.println(" a soma total e "+resultado);
       System.out.println(" a soma total e "+resultad);
       System.out.println(" a soma total e "+resulta);
       System.out.println(" o valir do factorial e "+s);
        
    }
    
}
