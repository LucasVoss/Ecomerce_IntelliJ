package Model;

public class Vendedor extends Pessoa{

    double meta;
    double totalVendido;
    String matricula;


    public Vendedor(String cpf, String nome, String email, String telefone, String genero, int idade, Endereco endereco, double meta, double totalVendido, String matricula) {
        super(cpf, nome, email, telefone, genero, idade, endereco);
        this.meta = meta;
        this.matricula = matricula;
        this.totalVendido = totalVendido;

    }

    public double getMeta() {
        return meta;
    }

    public void setMeta(double meta) {
        this.meta = meta;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getTotalVendido() {
        return totalVendido;
    }

    public void setTotalVendido(double totalVendido) {
        this.totalVendido = totalVendido;
    }
}
