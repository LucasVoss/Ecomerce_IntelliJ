package Model;

public class Produto {

    String codigo;
    String nome;
    String descricao;
    double preco;
    String categoria;
    String validade;
    String localFabricacao;
    Estoque estoque;
    Fornecedor fornecedor;


    public Produto (String codigo, String nome, String descricao, String categoria, String validade, String localFabricacao,
                    double preco, Estoque estoque, Fornecedor fornecedor) {
        this.categoria = categoria;
        this.codigo = codigo;
        this.descricao = descricao;
        this.localFabricacao = localFabricacao;
        this.nome = nome;
        this.preco = preco;
        this.validade = validade;
        this.fornecedor = fornecedor;
        this.estoque = estoque;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getLocalFabricacao() {
        return localFabricacao;
    }

    public void setLocalFabricacao(String localFabricacao) {
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
