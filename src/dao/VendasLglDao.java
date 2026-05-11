package dao;

import bean.VendasLgl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VendasLglDao {

    private Connection conn;

    public VendasLglDao(Connection conn) {
        this.conn = conn;
    }

    public void inserir(VendasLgl venda) throws SQLException {

        String sql = "INSERT INTO vendas ("
                + "lgl_idCliente, lgl_idUsuario, lgl_dataVenda, "
                + "lgl_horaVenda, lgl_valorTotal, "
                + "lgl_formaPagamento, lgl_status"
                + ") VALUES (?,?,?,?,?,?,?)";

        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setInt(1, venda.getLgl_idCliente());
        stmt.setInt(2, venda.getLgl_idUsuario());
        stmt.setDate(3, java.sql.Date.valueOf(venda.getLgl_dataVenda()));
        stmt.setTime(4, java.sql.Time.valueOf(venda.getLgl_horaVenda()));
        stmt.setDouble(5, venda.getLgl_valorTotal());
        stmt.setString(6, venda.getLgl_formaPagamento());
        stmt.setString(7, venda.getLgl_status());

        stmt.execute();
        stmt.close();
    }
}