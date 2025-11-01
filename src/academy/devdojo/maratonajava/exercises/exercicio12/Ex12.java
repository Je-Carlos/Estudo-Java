package academy.devdojo.maratonajava.exercises.exercicio12;

import java.util.Locale;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);;
        double total = 0.0;
        String input;
        System.out.print("MERCADINHO DO ZÉ\n");
        do {
            System.out.println("Digite o valor do produto (digite 'fim' para finalizar)");
            input = scanner.nextLine();

            if (!input.equalsIgnoreCase("fim")){
                try {
                    String formatarInput = input.replace(",",".");
                    double valor = Double.parseDouble(formatarInput);
                    total += valor;
                    System.out.printf("Subtotal: R$ %.2f\n", total);
                } catch (NumberFormatException e){
                    System.out.println("Entrada inválida. Por favor, digite um número ou 'fim'");
                }
            }
        } while (!input.equalsIgnoreCase("fim"));
        System.out.println("--- Compra Finalizada ---");
        System.out.printf("Valor Total: R$ %.2f\n", total);

        if (total > 0){
            System.out.println("\n--- Escolha o Método de Pagamento ---");
            System.out.println("[1] À Vista (Dinheiro ou Pix) - 15% de desconto");
            System.out.println("[2] À Vista (Cartão de Crédito) - 10% de desconto");
            System.out.println("[3] Parcelado 2x no Cartão - Preço normal");
            System.out.println("[4] Parcelado 3x ou mais no Cartão - 10% de juros");
            System.out.print("Digite a opção desejada: ");
            String opcaoSelecionada = scanner.nextLine();
            double totalFinal;

            try {
                int escolha = Integer.parseInt(opcaoSelecionada);
                switch (escolha){
                    case 1:
                        totalFinal = total * 0.85;
                        System.out.println("Opção: À Vista (Dinheiro/Pix)");
                        System.out.printf("Desconto aplicado (15%%): R$ %.2f\n", (total - totalFinal));
                        System.out.printf("VALOR FINAL A PAGAR: R$ %.2f\n", totalFinal);
                        break;

                    case 2:
                        totalFinal = total * 0.90;
                        System.out.println("Opção: À Vista (Cartão de Crédito)");
                        System.out.printf("Desconto aplicado (10%%): R$ %.2f\n", (total - totalFinal));
                        System.out.printf("VALOR FINAL A PAGAR: R$ %.2f\n", totalFinal);
                        break;

                    case 3:
                        totalFinal = total;
                        System.out.println("Opção: Parcelado 2x no Cartão");
                        System.out.printf("VALOR FINAL: 2x de R$ %.2f (Total: R$ %.2f)\n", (totalFinal / 2), totalFinal);
                        break;

                    case 4:
                        System.out.print("Em quantas vezes (3 ou mais)? ");
                        String entradaParcelas = scanner.nextLine();

                        try {
                            int numParcelas = Integer.parseInt(entradaParcelas);

                            if (numParcelas >= 3) {
                                totalFinal = total * 1.10;
                                double valorParcela = totalFinal / numParcelas;
                                System.out.println("Opção: Parcelado " + numParcelas + "x no Cartão");
                                System.out.printf("Juros aplicado (10%%): R$ %.2f\n", (totalFinal - total));
                                System.out.printf("VALOR FINAL: %dx de R$ %.2f (Total com juros: R$ %.2f)\n", numParcelas, valorParcela, totalFinal);
                            } else {
                                System.out.println("Número de parcelas inválido para esta opção.");
                                System.out.printf("O total permanece: R$ %.2f\n", total);
                            }
                        } catch (NumberFormatException eParcelas) {
                            System.out.println("Número de parcelas inválido.");
                            System.out.printf("O total permanece: R$ %.2f\n", total);
                        }
                        break;

                    default:
                        System.out.println("Opção de pagamento inválida. O valor total será cobrado sem descontos ou juros.");
                        System.out.printf("VALOR FINAL: R$ %.2f\n", total);
                        break;
                }

            } catch (NumberFormatException eOpcao) {
                System.out.println("Opção inválida. O valor total será cobrado sem descontos ou juros.");
                System.out.printf("VALOR FINAL: R$ %.2f\n", total);
            }

        } else {
            System.out.println("Nenhum produto registrado. Encerrando.");
        }

        scanner.close();
    }
}
