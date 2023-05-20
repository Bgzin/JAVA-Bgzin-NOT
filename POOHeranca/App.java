package POOHeranca;

import POOHeranca.Pessoas.Alunos;
import POOHeranca.Pessoas.Funcionarios;
import POOHeranca.Pessoas.Pessoas;
import POOHeranca.Pessoas.Professores;

public class App {
    public static void main(String[] args) {

        //objetos
        Pessoas pessoa01 = new Pessoas();
        Alunos aluno01= new Alunos();
        Funcionarios func01= new Funcionarios();
        Professores professor01 = new Professores(); 
        aluno01.setNome("Roberval");
        aluno01.setIdade(17);
        aluno01.setEndereco("jardim periferico, 158");
        aluno01.setCurso("T.I");
        aluno01.setTurma("M1A");

    

      //acessar os atributos(get)
      System.out.println("Nome: "+aluno01.getNome());
      System.out.println("Idade: "+aluno01.getIdade());
      System.out.println("Endereco: "+aluno01.getEndereco());
      System.out.println("Curso: "+aluno01.getCurso());
      System.out.println("Turma: "+aluno01.getTurma());

      System.out.println("---------------------");
        //

        func01.setSetor("Professor");
        System.out.println("Setor: "+func01.getSetor());
       
 System.out.println("---------------------");
        //
        professor01.setNome("Rogerin");
        professor01.setnCadastro("504.303.501SP");
        professor01.setBloco("C");
        professor01.setSala("12");
        professor01.setMateria("Desenvolvimento");

        System.out.println("Nome: "+professor01.getNome());
        System.out.println("N Cadastro: "+professor01.getnCadastro());
        System.out.println("Bloco: "+professor01.getBloco());
        System.out.println("Sala: "+professor01.getSala());
        System.out.println("Materia: "+professor01.getMateria());
    }
}
