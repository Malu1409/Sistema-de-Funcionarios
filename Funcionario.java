// Classe abstrata Funcionario
abstract class Funcionario {
    private String nome;
    private double salario;

    // Construtor
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Método abstrato que será implementado nas subclasses
    public abstract void trabalhar();

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

// Subclasse Gerente que herda de Funcionario
class Gerente extends Funcionario {
    private String departamento;

    // Construtor
    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    // Implementação do método abstrato trabalhar() para Gerente
    @Override
    public void trabalhar() {
        System.out.println("Gerente " + getNome() + " está gerenciando o departamento " + departamento + ".");
    }

    // Método específico de Gerente
    public void realizarPlanejamento() {
        System.out.println("Gerente " + getNome() + " está realizando o planejamento do departamento.");
    }
}

// Subclasse Programador que herda de Funcionario
class Programador extends Funcionario {
    private String linguagem;

    // Construtor
    public Programador(String nome, double salario, String linguagem) {
        super(nome, salario);
        this.linguagem = linguagem;
    }

    // Implementação do método abstrato trabalhar() para Programador
    @Override
    public void trabalhar() {
        System.out.println("Programador " + getNome() + " está programando em " + linguagem + ".");
    }

    // Método específico de Programador
    public void depurarCodigo() {
        System.out.println("Programador " + getNome() + " está depurando código.");
    }
}

