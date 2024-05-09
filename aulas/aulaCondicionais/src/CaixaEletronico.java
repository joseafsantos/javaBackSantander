public class CaixaEletronico {

    public static void main(String[] args) {
        double saldo = 25.0;
        double valSaque = 17.0;

        if (valSaque < saldo)
            saldo = saldo - valSaque;

            System.out.println(saldo);


    }
}
