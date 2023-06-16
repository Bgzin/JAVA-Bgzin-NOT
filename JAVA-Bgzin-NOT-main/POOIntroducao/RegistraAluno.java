package POOIntroducao;

public class RegistraAluno {
    //atributos dos Objetos
    private String nome;
    private String endereco;
    private int idade;
    private double notaMatematica;
    private double notaPortugues;
    private double notaCiencias;
    //atributo de classe
    private static int contadorEstudante;  //contador

    //métodos acesso = get e  modificao = set

    //criação de metodos
    //pega o nome do estudante
    public String getNome(){
    return nome;
    }
    public String getEndereco(){
        return endereco;
    }
    public int getIdade(){
        return idade;
    }
    public double getMedia(){
        double resultado=0;
        resultado = (notaMatematica
                    + notaPortugues 
                    + notaCiencias) / 3;
        return resultado;
    }

        //retorna a quantidade de estudantes cadastrados
        public static int getQuantidadeAlunos(){
            return contadorEstudante;
        }

        // define ou altera o nome do estudante
public void setNome(String nome){
    this.nome = nome;
    }
    // define ou altera o endereço do estudante
    public void setEndereco(String endereco){
    this.endereco = endereco;
    }
    // define ou altera o endereço do estudante
    public void setIdade(int idade){
    this.idade = idade;
    }
    // define ou altera o endereço do estudante
    public void setNotaMatematica(double notaMatematica){
    this.notaMatematica = notaMatematica;
    }
    // define ou altera o endereço do estudante
    public void setNotaPortugues(double notaPortugues){
        this.notaPortugues = notaPortugues;
    }
    // define ou altera o endereço do estudante
    public void setNotaCiencias(double NotaCiencias){
    this.notaCiencias = NotaCiencias;
    }


    }

