package COM.BANCO;

public class Titular {
//    cpf, nome e idade
    public String cpf;
    public String nome;
    public int idade;

    public Titular(String cpf, String nome, int idade) {
        this.cpf = cpf;
        this.nome = nome.toUpperCase();
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
