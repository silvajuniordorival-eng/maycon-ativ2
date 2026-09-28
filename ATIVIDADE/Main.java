public class Main {
    public static void main(String[] args) {
        Produto p = new Produto("Mouse Gamer", 100.00, 5);

        System.out.println("=== TESTE 1: Validação do setPreco (Valor Negativo) ===");
        System.out.println("Preço atual antes da tentativa: R$ " + p.getPreco());
        p.setPreco(-35.50);
        System.out.println("Preço atual após tentativa negativa: R$ " + p.getPreco());

        System.out.println("\n=== TESTE 2: Alteração de Preço para Valor Válido ===");
        p.setPreco(120.00);
        System.out.println("Novo preço confirmado: R$ " + p.getPreco());

        System.out.println("\n=== TESTE 3: Adicionar Estoque ===");
        p.adicionarEstoque(3);

        System.out.println("\n=== TESTE 4: Venda Acima do Estoque Disponível ===");
        boolean sucessoVenda = p.vender(10);
        System.out.println("Resultado do retorno do método vender(10): " + sucessoVenda);
    }
}