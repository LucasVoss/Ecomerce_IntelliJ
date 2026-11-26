package Model;

public class Pedido {

    int quantidade;
    int codigo;
    Cliente cliente;
    Fornecedor fornecedor;
    String notaFiscal;
    double precoTotal;
    Produto produto;
    Pagamento pagamento;
    Endereco endereco;

    public Pedido( int quantidade, int codigo, Cliente cliente, Fornecedor fornecedor, String notaFiscal,
                   double precoTotal, Produto produto, Pagamento pagamento, Endereco endereco) {

        this.cliente = cliente;
        this.codigo = codigo;
        this.endereco = endereco;
        this.fornecedor = fornecedor;
        this.notaFiscal = notaFiscal;
        this.pagamento = pagamento;
        this.precoTotal = precoTotal;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public String getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(String notaFiscal) {
        this.notaFiscal = notaFiscal;
    }
}
