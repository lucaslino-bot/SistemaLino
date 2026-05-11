package bean;

public class VendasProdutosLgl {

    private int lgl_idVendaProduto;
    private int lgl_idVenda;
    private int lgl_idProduto;
    private int lgl_quantidade;
    private double lgl_precoUnitario;
    private double lgl_subtotal;

    public int getLgl_idVendaProduto() {
        return lgl_idVendaProduto;
    }

    public void setLgl_idVendaProduto(int lgl_idVendaProduto) {
        this.lgl_idVendaProduto = lgl_idVendaProduto;
    }

    public int getLgl_idVenda() {
        return lgl_idVenda;
    }

    public void setLgl_idVenda(int lgl_idVenda) {
        this.lgl_idVenda = lgl_idVenda;
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