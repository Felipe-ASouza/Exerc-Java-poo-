public class TestePessoa {
    public static void main(String[] args) {
        Pessoa dados = new Pessoa("52.731.662-4", "50448554701", "Felipe Alexandre de Souza", "Rua Maria Oliano gerassi 246",
                "11 985622083", "felipe.alexandre3388@gmail.com", 1.84, 64, 'M', 19);
        System.out.println("RG: " + dados.rg + "\n" + "CPF: " + dados.cpf + "\n" + "nome: " + dados.nome +
                "\n" + "endereço: " + dados.endereco + "\n" + "Celular: " + dados.celular +
                "\n" + "Email: " + dados.email + "\n" + "Altura: " + dados.altura + "\n" +  "Peso: " + dados.peso +
                "\n" + "Sexo: " + dados.sexo  + "\n" + "Idade: " + dados.idade);
    }


}
