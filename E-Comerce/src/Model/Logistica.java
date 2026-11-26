package Model;

import java.time.LocalDate;

public class Logistica {

    Endereco endereco;
    Cliente cliente;
    Pedido pedido;
    String senhaEntrega;
    LocalDate prazo;

    public Logistica(Endereco endereco, Cliente cliente, Pedido pedido, String senhaEntrega, LocalDate prazo) {
        this.endereco = endereco;
        this.cliente = cliente;
        this.pedido = pedido;
        this.prazo = prazo;
        this.senhaEntrega = senhaEntrega;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getPrazo() {
        return prazo;
    }

    public void setPrazo(LocalDate prazo) {
        this.prazo = prazo;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public String getSenhaEntrega() {
        return senhaEntrega;
    }

    public void setSenhaEntrega(String senhaEntrega) {
        this.senhaEntrega = senhaEntrega;
    }
}
