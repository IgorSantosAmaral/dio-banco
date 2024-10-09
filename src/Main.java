public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco TESTE");


        Cliente igor = new Cliente();
        igor.setNome("Igor");

        Cliente maria = new Cliente();
        maria.setNome("Maria");

        Cliente jose = new Cliente();
        jose.setNome("José");

        Conta ccIgor = new ContaCorrente(igor);
        Conta poupancaIgor = new ContaPoupanca(igor);

        Conta ccMaria = new ContaCorrente(maria);
        Conta poupancaMaria = new ContaPoupanca(maria);

        Conta ccJose = new ContaCorrente(jose);
        Conta poupancaJose = new ContaPoupanca(jose);

        banco.adicionarConta(ccIgor);
        banco.adicionarConta(poupancaIgor);
        banco.adicionarConta(ccMaria);
        banco.adicionarConta(poupancaMaria);
        banco.adicionarConta(ccJose);
        banco.adicionarConta(poupancaJose);

        ccIgor.depositar(100);
        ccIgor.transferir(100, poupancaIgor);

        ccMaria.depositar(400);
        ccMaria.transferir(200, poupancaJose);

        ccJose.depositar(300);
        ccJose.transferir(300, poupancaIgor);

        System.out.println("=== Extratos ===");
        ccIgor.imprimirExtrato();
        poupancaIgor.imprimirExtrato();

        ccMaria.imprimirExtrato();
        poupancaMaria.imprimirExtrato();

        ccJose.imprimirExtrato();
        poupancaJose.imprimirExtrato();

        banco.listarClientes();

        banco.listarContas();
    }
}