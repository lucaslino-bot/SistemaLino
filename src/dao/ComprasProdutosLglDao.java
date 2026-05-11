package dao;

import bean.ComprasProdutosLgl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ComprasProdutosLglDao {

    private Connection conn;

    public ComprasProdutosLglDao(Connection conn) {
        this.conn = conn;
    }

    public void inserir(ComprasProdutosLgl compraProduto) throws SQLException {

        String sql = "INSERT INTO compras_produtos ("
                + "lgl_idCompra, lgl_idProduto, "
                + "lgl_quantidade, lgl_precoUnitario, lgl_subtotal"
                + ") VALUES (?,?,?,?,?)";

        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setInt(1, compraProduto.getLgl_idCompra());
        stmt.setInt(2, compraProduto.getLgl_idProduto());
        stmt.setInt(3, compraProduto.getLgl_quantidade());
        stmt.setDouble(4, compraProduto.getLgl_precoUnitario());
        stmt.setDouble(5, compraProduto.getLgl_subtotal());

        stmt.execute();
        stmt.close();
    }
}