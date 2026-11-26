package Model;

public class Estoque {

    int Qtd;
    Fornecedor fornecedor;
    Produto produto;

    public Estoque (int qtd, Fornecedor fornecedor, Produto produto) {
        this.Qtd = qtd;
        this.fornecedor = fornecedor;
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getQtd() {
        return Qtd;
    }

    public void setQtd(int qtd) {
        Qtd = qtd;
    }
}
