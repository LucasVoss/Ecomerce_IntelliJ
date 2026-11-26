package Model;

public class Cliente extends Pessoa{

    public Cliente (String cpf, String nome, String email, String telefone, String genero, int idade, Endereco endereco){
        super(cpf, nome, email, genero, telefone, idade, endereco);

    }
}
