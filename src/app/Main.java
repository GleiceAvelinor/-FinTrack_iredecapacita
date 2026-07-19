package app;

import java.util.Scanner;
import controller.FinTracker;
import model.Transacao;
import exceptions.EntradaInvalidaException;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FinTracker finTracker = new FinTracker();
        int opcao = 0;

        while (opcao != 5) {
            try { // O try deve envolver o código que pode lançar a exceção
                System.out.println("===== FINTRACK =====");
                System.out.println("1. Adicionar transacao");
                System.out.println("2. Listar transacoes");
                System.out.println("3. Mostrar saldo");
                System.out.println("4. Remover transacao");
                System.out.println("5. Sair");

                System.out.print("Escolha uma opcao: ");
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.print("Descricao: ");
                        String descricao = scanner.nextLine();

                        System.out.print("Valor: R$ ");
                        double valor = scanner.nextDouble();
                        if (valor <= 0) {
                            throw new EntradaInvalidaException("O valor deve ser maior que zero");
                        }
                        scanner.nextLine();

                        System.out.print("Tipo (receita/despesa): ");
                        String tipo = scanner.nextLine();

                        Transacao transacao = new Transacao(descricao, valor, tipo);
                        finTracker.adicionarTransacao(transacao);
                        System.out.println("Transacao adicionada com sucesso!");
                        break;

                    case 2:
                        finTracker.listarTransacoes();
                        break;

                    case 3:
                        System.out.println("Saldo atual: R$ " + finTracker.calcularSaldoTotal());
                        break;

                    case 4:
                        System.out.print("Digite o índice da transacao: ");
                        int indice = scanner.nextInt();
                        finTracker.removerTransacao(indice);
                        System.out.println("Transacao removida!");
                        break;

                    case 5:
                        System.out.println("Encerrando sistema...");
                        break;

                    default:
                        System.out.println("Opcao inválida!");
                }
            } catch (EntradaInvalidaException e) {
                System.out.println(e.getMessage()); 
                System.out.println("Entrada inválida! Digite novamente.");
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }
}
