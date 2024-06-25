// Classe principal para testar o sistema
public class SistemaFuncionarios {
    public static void main(String[] args) {
        // Criando um Gerente
        Funcionario gerente = new Gerente("João", 10000, "TI");
        gerente.trabalhar(); // Polimorfismo - chama o método específico de Gerente
        ((Gerente) gerente).realizarPlanejamento(); // Downcasting para acessar método específico de Gerente

        // Criando um Programador
        Funcionario programador = new Programador("Maria", 5000, "Java");
        programador.trabalhar(); // Polimorfismo - chama o método específico de Programador
        ((Programador) programador).depurarCodigo(); // Downcasting para acessar método específico de Programador
    }
}
