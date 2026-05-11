package bean;

import java.time.LocalDate;
import java.time.LocalTime;

public class VendasLgl {

    private int lgl_idVenda;
    private int lgl_idCliente;
    private int lgl_idUsuario;
    private LocalDate lgl_dataVenda;
    private LocalTime lgl_horaVenda;
    private double lgl_valorTotal;
    private String lgl_formaPagamento;
    private String lgl_status;

    public int getLgl_idVenda() {
        return lgl_idVenda;
    }

    public void setLgl_idVenda(int lgl_idVenda) {
        this.lgl_idVenda = lgl_idVenda;
    }

    public int getLgl_idCliente() {
        return lgl_idCliente;
    }

    public void setLgl_idCliente(int lgl_idCliente) {
        this.lgl_idCliente = lgl_idCliente;
    }

    public int getLgl_idUsuario() {
        return lgl_idUsuario;
    }

    public void setLgl_idUsuario(int lgl_idUsuario) {
        this.lgl_idUsuario = lgl_idUsuario;
    }

    public LocalDate getLgl_dataVenda() {
        return lgl_dataVenda;
    }

    public void setLgl_dataVenda(LocalDate lgl_dataVenda) {
        this.lgl_dataVenda = lgl_dataVenda;
    }

    public LocalTime getLgl_horaVenda() {
        return lgl_horaVenda;
    }

    public void setLgl_horaVenda(LocalTime lgl_horaVenda) {
        this.lgl_horaVenda = lgl_horaVenda;
    }

    public double getLgl_valorTotal() {
        return lgl_valorTotal;
    }

    public void setLgl_valorTotal(double lgl_valorTotal) {
        this.lgl_valorTotal = lgl_valorTotal;
    }

    public String getLgl_formaPagamento() {
        return lgl_formaPagamento;
    }

    public void setLgl_formaPagamento(String lgl_formaPagamento) {
        this.lgl_formaPagamento = lgl_formaPagamento;
    }

    public String getLgl_status() {
        return lgl_status;
    }

    public void setLgl_status(String lgl_status) {
        this.lgl_status = lgl_status;
    }
}