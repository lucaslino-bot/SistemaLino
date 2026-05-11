package dao;

import bean.VendasProdutosLgl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VendasProdutosLglDao {

    private Connection conn;

    public VendasProdutosLglDao(Connection conn) {
        this.conn = conn;
    }

    public void inserir(VendasProdutosLgl vendaProduto) throws SQLException {

        String sql = "INSERT INTO vendas_produtos ("
                + "lgl_idVenda, lgl_idProduto, "
                + "lgl_quantidade, lgl_precoUnitario, lgl_subtotal"
                + ") VALUES (?,?,?,?,?)";

        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setInt(1, vendaProduto.getLgl_idVenda());
        stmt.setInt(2, vendaProduto.getLgl_idProduto());
        stmt.setInt(3, vendaProduto.getLgl_quantidade());
        stmt.setDouble(4, vendaProduto.getLgl_precoUnitario());
        stmt.setDouble(5, vendaProduto.getLgl_subtotal());

        stmt.execute();
        stmt.close();
    }
}