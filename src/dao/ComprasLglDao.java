package dao;

import bean.ComprasLgl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ComprasLglDao {

    private Connection conn;

    public ComprasLglDao(Connection conn) {
        this.conn = conn;
    }

    public void inserir(ComprasLgl compra) throws SQLException {

        String sql = "INSERT INTO compras ("
                + "lgl_status, lgl_idFornecedor, "
                + "lgl_dataCompra, lgl_valorTotal"
                + ") VALUES (?,?,?,?)";

        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, compra.getLgl_status());
        stmt.setInt(2, compra.getLgl_idFornecedor());
        stmt.setDate(3, java.sql.Date.valueOf(compra.getLgl_dataCompra()));
        stmt.setDouble(4, compra.getLgl_valorTotal());

        stmt.execute();
        stmt.close();
    }
}