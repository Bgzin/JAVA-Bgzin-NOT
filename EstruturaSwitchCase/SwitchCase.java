package EstruturaSwitchCase;

import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class SwitchCase {
    
    Scanner sc= new Scanner (System.in);

    public void letras(){

        System.out.println("Digite uma Letra");
        String letra = sc.nextLine();
        switch (letra){
                  case "a": System.out.println(letra+" é Vogal");
               break;
             case "e": System.out.println(letra+" é Vogal");
            break;
          case "i": System.out.println(letra+" é Vogal");
        break;
        case "o": System.out.println(letra+" é Vogal");
        break;
           case "u": System.out.println(letra+" é Vogal");
              break;
                 default: System.out.println(letra+" é consoante");
                    break;

        }
        
    }
    

    public void mes(){
      System.out.println("Digite o numero do mes");
      int numero = sc.nextInt();
       
    switch(numero){
        case 1: System.out.println("Mes de Janeiro");
        break;
        case 2: System.out.println("Mes de Fevereiro");
        break;
        case 3: System.out.println("Mes de março");
        break;
        case 4: System.out.println("Mes de Abril");
        break;
        case 5: System.out.println("Mes de Maio");
        break;
        case 6: System.out.println("Mes de Junho");
        break;
        case 7: System.out.println("Mes de Julho");
        break;
        case 8: System.out.println("Mes de Agosto");
        break;
        case 9: System.out.println("Mes de Setembro");
        break;
        case 10: System.out.println("Mes de Outubro");
        break;
        case 11: System.out.println("Mes de Novembro");
        break;
        case 12: System.out.println("Mes de Dezembro");
        break;
        default: System.out.println("Não corresponde a nenhum Mês");
        break;
    }

    }
}
