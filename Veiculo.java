import java.time.LocalDate;

public class Veiculo {
    String marca;
    String modelo;
    int ano;
    String placa;
    
}

Veiculo() {

    this("Marca desconhecida", "Modelo desconhecido",
        LocalDate.now().getYear(), "");

}

Veiculo(String marca, String modelo, int ano, String placa) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    this.placa = placa;
}