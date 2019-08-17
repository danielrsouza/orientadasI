package COM.BANCO;

public class main {

    public static void main(String[] args) {
        //Instanciando os objetos.
        Titular t1 = new Titular("04118908085", "Daniel Ricardo", 22);
        Titular t2 = new Titular("01454588455", "Jose", 61);
        Conta c1 = new Conta("6974225", t1);
        Conta c2 = new Conta("12345", t2);

        //Verificando saldo default com quem tem mais que 60 anos e com quem tem menos (limite).
        System.out.println("Saldo C1: "+c1.getSaldo());
        System.out.println("Saldo C2: "+c2.getSaldo());
        System.out.println();

        // Testando Metodo Deposito.
        System.out.println("DEPOSITANDO");
        if(c1.deposita(3000)){
            System.out.println("Deposito feito com sucesso!");
        }
        System.out.println();

        //Verificando saldo após o deposito.
        System.out.println("Saldo C1: "+c1.getSaldo());
        System.out.println("Saldo C2: "+c2.getSaldo());
        System.out.println();

        // Testando metodo de transferir.
        System.out.println("TRANSFERINDO");
        if(c1.transfere(1500, c2)) {
            System.out.println("A transferência foi efetuada com sucesso!");
        } else {
            System.out.println("Vocẽ não possuí saldo suficiente");
        }
        System.out.println();

        //Verificando saldo apos a transferencia
        System.out.println("Saldo C1: "+c1.getSaldo());
        System.out.println("Saldo C2: "+c2.getSaldo());
        System.out.println();

        //Verificando metodo sacar.
        System.out.println("SACANDO");
        if(c1.saca(200)) {
            System.out.println("O saque foi efetuado com sucesso!");
        } else {
            System.out.println("Você não possui saldo suficiente");
        }
        System.out.println();

        //Verificando saldo apos o saque
        System.out.println("Saldo C1: "+c1.getSaldo());
        System.out.println("Saldo C2: "+c2.getSaldo());
        System.out.println();

        //Verifica o numero das contas
        System.out.println("NUMEROS DA CONTA C1: "+ c1.getNumeroDaConta());
        System.out.println("NUMEROS DA CONTA C2: "+ c2.getNumeroDaConta());
        System.out.println();

        //printa o nome em letra maiscula como e salvo no banco.
        System.out.println(t1.getNome());

    }

}
