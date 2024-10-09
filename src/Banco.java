import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public void listarContas() {
        System.out.println("=== " + nome + " ===");
        System.out.println("=== Lista de Contas ===");
        for (Conta conta : contas) {
            System.out.printf("Titular: %s, Tipo: %s, Número: %d, Saldo: %.2f%n",
                    conta.getCliente().getNome(),
                    conta instanceof ContaCorrente ? "Conta Corrente" : "Conta Poupança",
                    conta.getNumero(),
                    conta.getSaldo());
        }
    }

    public void listarClientes() {
        System.out.println("=== Lista de Clientes ===");
        List<String> nomesClientes = new ArrayList<>();
        for (Conta conta : contas) {
            String nomeCliente = conta.getCliente().getNome();
            if (!nomesClientes.contains(nomeCliente)) {
                nomesClientes.add(nomeCliente);
                System.out.println("Cliente: " + nomeCliente);
            }
        }
    }

}