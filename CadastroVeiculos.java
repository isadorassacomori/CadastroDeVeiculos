import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroVeiculos {

    static Scanner scanner = new Scanner(System.in);
    static List<Veiculo> veiculos = new ArrayList<>();

    public static void main(String[] args) {

        int opcao;

        do {
            System.out.println("\n======= Cadastro de Veículos OO =======");
            System.out.println("1 - Cadastrar Veículo");
            System.out.println("2 - Listar Veículos");
            System.out.println("3 - Consultar Veículo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarVeiculo();
                    break;

                case 2:
                    listarVeiculos();
                    break;

                case 3:
                    consultarVeiculo();
                    break;

                case 0:
                    System.out.println("Sistema encerrado.");
                    break;

                    default:
                    System.out.println("Opção inválida.");
            }

         } while (opcao != 0);
    }

    public static void cadastrarVeiculo() {

        System.out.println("\n--- Cadastro de Veículo ---");

        System.out.print("Marca: ");
        String marca = scanner.nextLine();

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        int anoAtual = LocalDate.now().getYear();
        int ano;

        while (true) {
            System.out.print("Ano: ");
            ano = scanner.nextInt();
            scanner.nextLine();

            if (ano >= 1900 && ano <= anoAtual + 1) {
                 break;
            } else {
                System.out.println("Ano inválido! Digite um ano entre 1900 e " + (anoAtual + 1));
            }
        }

    String placa;

        while (true) {
            System.out.print("Placa: ");
            placa = scanner.nextLine();

            if (!placaExiste(placa)) {
                break;
            } else {
                System.out.println("Já existe um veículo cadastrado com essa placa.");
            }
        }

        Veiculo veiculo = new Veiculo(marca, modelo, ano, placa);

        veiculos.add(veiculo);

        System.out.println("Veículo cadastrado com sucesso!");
    }

    public static void listarVeiculos() {

         System.out.println("\n--- Lista de Veículos ---");

        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
            return;
        }
