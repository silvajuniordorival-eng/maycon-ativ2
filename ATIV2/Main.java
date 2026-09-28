public class Main {
    public static void main(String[] args) {
        
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Carlos Silva");
        funcionario1.setSalario(3000.00);

        
        Funcionario funcionario2 = new Funcionario("Ana Souza", 4500.00);

        
        funcionario1.aumentarSalario(10);

        System.out.println("=== FUNCIONÁRIO 1 ===");
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Salário Mensal: R$ " + funcionario1.getSalario());
        System.out.println("Salário Anual (com 13º): R$ " + funcionario1.calcularSalarioAnual());

        System.out.println("\n=== FUNCIONÁRIO 2 ===");
        System.out.println("Nome: " + funcionario2.getNome());
        System.out.println("Salário Mensal: R$ " + funcionario2.getSalario());
        System.out.println("Salário Anual (com 13º): R$ " + funcionario2.calcularSalarioAnual());
    }
}