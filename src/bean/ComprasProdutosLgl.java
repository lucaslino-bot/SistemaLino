package bean;

public class ComprasProdutosLgl {

    private int lgl_idCompraProduto;
    private int lgl_idCompra;
    private int lgl_idProduto;
    private int lgl_quantidade;
    private double lgl_precoUnitario;
    private double lgl_subtotal;

    public int getLgl_idCompraProduto() {
        return lgl_idCompraProduto;
    }

    public void setLgl_idCompraProduto(int lgl_idCompraProduto) {
        this.lgl_idCompraProduto = lgl_idCompraProduto;
    }

    public int getLgl_idCompra() {
        return lgl_idCompra;
    }

    public void setLgl_idCompra(int lgl_idCompra) {
        this.lgl_idCompra = lgl_idCompra;
    }

    public int getLgl_idProduto() {
        return lgl_idProduto;
    }

    public void setLgl_idProduto(int lgl_idProduto) {
        this.lgl_idProduto = lgl_idProduto;
    }

    public int getLgl_quantidade() {
        return lgl_quantidade;
    }

    public void setLgl_quantidade(int lgl_quantidade) {
        this.lgl_quantidade = lgl_quantidade;
    }

    public double getLgl_precoUnitario() {
        return lgl_precoUnitario;
    }

    public void setLgl_precoUnitario(double lgl_precoUnitario) {
        this.lgl_precoUnitario = lgl_precoUnitario;
    }

    public double getLgl_subtotal() {
        return lgl_subtotal;
    }

    public void setLgl_subtotal(double lgl_subtotal) {
        this.lgl_subtotal = lgl_subtotal;
    }
}