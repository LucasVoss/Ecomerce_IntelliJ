package Model;

public class Pagamento {

    String metodo;
    String cvc;
    double preco;
    double desconto;
    String validade;
    String numeroCartao;
    String nomeTitular;
    Pedido pedido;

    public Pagamento ( String metodo, String cvc, double preco, double desconto, String validade, String numeroCartao,
                       String nomeTitular, Pedido pedido) {

        this.metodo = metodo;
        this.cvc = cvc;
        this.nomeTitular = nomeTitular;
        this.desconto = desconto;
        this.numeroCartao = numeroCartao;
        this.preco = preco;
        this.validade = validade;
        this.pedido = pedido;

    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}

