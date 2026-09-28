public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        setPreco(preco);
        this.quantidade = quantidade >= 0 ? quantidade : 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("[AVISO] Preço inválido (R$ " + preco + "). O preço não pode ser negativo! Mantido valor atual: R$ " + this.preco);
        } else {
            this.preco = preco;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            System.out.println("[AVISO] A quantidade não pode ser negativa!");
        } else {
            this.quantidade = quantidade;
        }
    }

    public void adicionarEstoque(int qtd) {
        if (qtd > 0) {
            this.quantidade += qtd;
            System.out.println("Estoque adicionado: +" + qtd + " unidades. Total atual: " + this.quantidade);
        } else {
            System.out.println("[AVISO] Quantidade a adicionar deve ser maior que zero.");
        }
    }

    public boolean vender(int qtd) {
        if (qtd <= 0) {
            System.out.println("[AVISO] Quantidade para venda deve ser maior que zero.");
            return false;
        }

        if (qtd > this.quantidade) {
            System.out.println("VENDA RECUSADA: Estoque insuficiente (Disponível: " + this.quantidade + " | Solicitado: " + qtd + ")");
            return false;
        }

        this.quantidade -= qtd;
        System.out.println("VENDA APROVADA: " + qtd + " unidade(s) vendida(s). Estoque restante: " + this.quantidade);
        return true;
    }
}