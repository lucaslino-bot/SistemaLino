package bean;

import java.time.LocalDate;

public class ComprasLgl {

    private int lgl_idCompra;
    private String lgl_status;
    private int lgl_idFornecedor;
    private LocalDate lgl_dataCompra;
    private double lgl_valorTotal;

    public int getLgl_idCompra() {
        return lgl_idCompra;
    }

    public void setLgl_idCompra(int lgl_idCompra) {
        this.lgl_idCompra = lgl_idCompra;
    }

    public String getLgl_status() {
        return lgl_status;
    }

    public void setLgl_status(String lgl_status) {
        this.lgl_status = lgl_status;
    }

    public int getLgl_idFornecedor() {
        return lgl_idFornecedor;
    }

    public void setLgl_idFornecedor(int lgl_idFornecedor) {
        this.lgl_idFornecedor = lgl_idFornecedor;
    }

    public LocalDate getLgl_dataCompra() {
        return lgl_dataCompra;
    }

    public void setLgl_dataCompra(LocalDate lgl_dataCompra) {
        this.lgl_dataCompra = lgl_dataCompra;
    }

    public double getLgl_valorTotal() {
        return lgl_valorTotal;
    }

    public void setLgl_valorTotal(double lgl_valorTotal) {
        this.lgl_valorTotal = lgl_valorTotal;
    }
}