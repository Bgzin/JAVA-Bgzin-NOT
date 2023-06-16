package POOIntroducao;

public class App {
    
    public static void main(String[] args) {
        //criar o bojeto
        RegistraAluno aluno1= new RegistraAluno();//objeto
        //modificar os atributos(set)
        aluno1.setNome("Ana Clara Teixeira");
        aluno1.setEndereco("Jd lago Azul, 148");
        aluno1.setIdade(17);
        aluno1.setNotaMatematica(8);
        aluno1.setNotaCiencias(6);
        aluno1.setNotaPortugues(8);
        ;
        //acessar os atributos(get)
        System.out.println("Nome: "+aluno1.getNome());
        System.out.println("Endereço: "+aluno1.getEndereco());
        System.out.println("Idade: "+aluno1.getIdade());
        System.out.println("Media de notas: "+aluno1.getMedia());
        

    }
}
