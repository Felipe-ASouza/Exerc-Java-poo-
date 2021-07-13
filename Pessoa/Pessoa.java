public class Pessoa {
    String rg;
    String cpf;
    String nome;
    String endereco;
    String celular;
    String email;
    double altura;
    double peso;
    char sexo;
    int idade;

    public Pessoa(String rg, String cpf, String nome, String endereco, String celular, String email, double altura, double peso, char sexo, int idade){

        this.rg = rg;
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.celular = celular;
        this.email = email;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
        this.idade = idade;
    }
}
