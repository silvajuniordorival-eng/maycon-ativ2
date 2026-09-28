public class Funcionario {
    private String nome;
    private double salario;

    /
    public Funcionario() {
    }

    
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    
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

    
    public void aumentarSalario(double porcentagem) {
        this.salario = this.salario + this.salario * (porcentagem / 100);
    }

    
    public double calcularSalarioAnual() {
        return this.salario * 13;
    }
}