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