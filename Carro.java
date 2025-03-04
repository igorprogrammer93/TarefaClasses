// Classe que representa um carro no mundo real
public class Carro {

    // Propriedades do carro (Atributos)
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;
    private boolean ligado;

    // Construtor para inicializar o carro
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0.0;  // Carro começa parado
        this.ligado = false;         // Carro começa desligado
    }

    // Método para ligar o carro
    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O carro está ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    // Método para desligar o carro
    public void desligar() {
        if (ligado) {
            ligado = false;
            velocidadeAtual = 0.0;
            System.out.println("O carro está desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    // Método para acelerar o carro
    public void acelerar(double incremento) {
        if (ligado) {
            velocidadeAtual += incremento;
            System.out.println("Acelerando. Velocidade atual: " + velocidadeAtual + " km/h");
        } else {
            System.out.println("Não é possível acelerar. O carro está desligado.");
        }
    }

    // Método para frear o carro
    public void frear(double decremento) {
        if (ligado && velocidadeAtual > 0) {
            velocidadeAtual -= decremento;
            if (velocidadeAtual < 0) {
                velocidadeAtual = 0;
            }
            System.out.println("Freando. Velocidade atual: " + velocidadeAtual + " km/h");
        } else if (!ligado) {
            System.out.println("O carro está desligado.");
        } else {
            System.out.println("O carro já está parado.");
        }
    }

    // Métodos getters para acessar as propriedades
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public boolean isLigado() {
        return ligado;
    }

    // Método main para testar a classe Carro
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corolla", 2022);

        // Exibindo as propriedades do carro
        System.out.println("Marca: " + meuCarro.getMarca());
        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("Ano: " + meuCarro.getAno());

        // Interagindo com o carro
        meuCarro.ligar();
        meuCarro.acelerar(50);
        meuCarro.frear(20);
        meuCarro.desligar();
    }
}
