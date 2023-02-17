package ExercicioOperadores;

import java.util.Scanner;

public class NotaAluno {
    Scanner sc = new Scanner (System.in);
    public void notaFrequencia() {
    System.out.println("informe a Nota 1 do Aluno");
        int nota1= sc.nextInt(50);
        System.out.println("informe a Nota 2 do Aluno");
        int nota2= sc.nextInt(75);
        boolean aprovado = nota1 >= nota2;
        double mediaNotas= (nota1+nota2)/2;
        boolean Media= nota1==nota2;
       
        


        
        }


}
