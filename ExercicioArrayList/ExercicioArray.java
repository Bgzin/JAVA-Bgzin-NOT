package ExercicioArrayList;

import java.util.LinkedList;

public class ExercicioArray {
    LinkedList <String> pessoas = new LinkedList<>();

    public void teste(){
        pessoas.add("Fernanda");
        pessoas.add("Paula");
        pessoas.add("Romarin");
        //adicionando a primeira posição
        pessoas.addFirst("Roger");
        //buscando a primeira posição
        System.out.println(pessoas.getFirst());
    }
}
