package dao;

import bean.VeiculosLgl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VeiculosLglDao {

    private Connection conn;

    public VeiculosLglDao(Connection conn) {
        this.conn = conn;
    }

    public void inserir(VeiculosLgl veiculo) throws SQLException {

        String sql = "INSERT INTO veiculos ("
                + "marca, tipo, modelo, cor, descricao, statusVenda"
                + ") VALUES (?,?,?,?,?,?)";

        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, veiculo.getMarca());
        stmt.setString(2, veiculo.getTipo());
        stmt.setString(3, veiculo.getModelo());
        stmt.setString(4, veiculo.getCor());
        stmt.setString(5, veiculo.getDescricao());
        stmt.setString(6, veiculo.getStatusVenda());

        stmt.execute();
        stmt.close();
    }
}