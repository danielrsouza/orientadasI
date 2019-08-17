package COM.BANCO;
import java.util.Random;

public class Conta {
//    saldo, numero da conta, senha e titular.

    public double saldo;
    public double limite;
    public int numeroDaConta;
    public String senha;
    public Titular titular;


    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public Conta(String senha, Titular titular) {
        Random gerador = new Random();
        this.numeroDaConta = gerador.nextInt(100000);
        this.senha = senha;
        this.titular = titular;

        if(titular.getIdade() > 60){
            this.limite = 300;
            this.saldo += this.limite;
        } else {
            this.limite = 200;
            this.saldo += this.limite;
        }


    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public boolean deposita(double valor) {
        this.saldo += valor;
        return true;
    }

    public boolean saca(double valor) {
        this.saldo += this.limite;
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }

    }

    public boolean transfere(double valor, Conta conta) {
        this.saldo += this.limite;
        if(this.saldo >= valor) {
            this.saldo -= valor;
            conta.setSaldo(valor);
            return true;
        } else {
            return false;
        }

    }
}
