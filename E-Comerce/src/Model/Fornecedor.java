package Model;

public class Fornecedor extends Pessoa{

    String cnpj;
    Produto Produto;

    public Fornecedor(String cpf, String nome, String email, String telefone, String genero, int idade, Endereco endereco,
                      String cnpj, Produto produto) {
        super(cpf, nome, email, telefone, genero, idade, endereco);

        this.cnpj = cnpj;
        this.Produto = produto;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Produto getProduto() {
        return Produto;
    }

    public void setProduto(Produto produto) {
        Produto = produto;
    }
}

