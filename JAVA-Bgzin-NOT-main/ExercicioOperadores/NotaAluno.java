package ExercicioOperadores;

import java.util.Scanner;

public class NotaAluno {
    Scanner sc = new Scanner (System.in);
    public void notaFrequencia() {
    System.out.println("informe a Nota 1 do Aluno");
        int nota1= sc.nextInt();
        System.out.println("informe a Nota 2 do Aluno");
        int nota2= sc.nextInt();
        double mediaAluno =nota1;
        mediaAluno += nota2;
        mediaAluno /= 2;
        System.out.println("A média do aluno é "+mediaAluno);
        boolean mediaAprovado= mediaAluno >= 50;
        System.out.println("O aluno está aprovado por Nota?" +mediaAprovado);
        System.out.println("Informe a Frequencia do aluno");
        int FrequenciaAluno = sc.nextInt();
        boolean frequenciaAprovado = FrequenciaAluno >=75;
        System.out.println("O aluno está aprovado por Frequencia?" +frequenciaAprovado);
        boolean aprovacaoFinal = (mediaAprovado==true)&&(frequenciaAprovado= true);
        System.out.println("O aluno esta aprovado no curso?"+aprovacaoFinal);
        


        
        }


}
