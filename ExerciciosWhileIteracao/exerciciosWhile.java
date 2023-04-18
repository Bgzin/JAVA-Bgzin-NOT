package ExerciciosWhileIteracao;

public class exerciciosWhile {

    public void exercicio1t(){
        int vetorA[]=new int[]{3,5,7,9,11,13};
        int vetorB[]= new int[5];
        int i=0;
        while(i<vetorA.length);
        vetorB[i]=vetorA[i];
        System.out.println("VetorB["+i+"]="+vetorB[i]);
        i++;
    }   
    
    public void exercicio2(){
        int vetorA[]=new int[]{4,8,12,18,22,26,30,34};
        int vetorB[]=new int[8];
        int i=0;
        while(i<vetorA.length);
        vetorB[i]=vetorA[i]*2;
        System.out.println("VetorB é ["+i+"]="+vetorB[i]);
        i++;
    }

    public void exercicio3(){
        int vetorA[]=new int[]{2,4,6,8,10,12,14,16,18,20,22,24,26,28,30};
        int vetorB[]=new int[15];
        int i=0;
        while(i<vetorA.length);
        vetorB[i]=vetorA[i]*vetorA[i];
        System.out.println("o vetorB é ["+i+"]="+vetorB[i]);
        i++;
    }

    public void exercicio4(){
        int vetorA[]= new int[]{2,4,6,8,10,12,14,16,18,20,22,24,26,28,30};
        double vetorB[]= new double[15];
        int i=0;
        while(i<vetorA.length);
        vetorB[i]=Math.sqrt(vetorA[i]);
        System.out.println(" o vetorB é ["+i+"]="+vetorB[i]);

    }

    public void exercicio5(){
        int vetorA[]= new int[]{2,4,8,10,12,14,16,18,20,22};
        int vetorB[]= new int[10];
        int i=0;
        while (i<vetorA.length);
        vetorB[i]=vetorA[i]*i;
        System.out.println("o vetorB é ["+i+"]="+vetorB[i]);
    }
    
    public void exercicio6(){
        int vetorA[]=new int[]{4,8,12,28,32,36,40,44,48,52};
        int vetorB[]=new int[]{4,8,12,28,32,36,40,44,48,52};
        double vetorC[]=new double[10];
        int i=0;
        while (i<vetorA.length && i<vetorB.length);
        vetorC[i]=vetorA[i]+vetorB[i];
        System.out.println("o vetorC é ["+i+"]"+vetorC[i]);

    }
}
