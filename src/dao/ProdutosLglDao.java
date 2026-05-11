package dao;

import bean.ProdutosLgl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutosLglDao {

    private Connection conn;

    public ProdutosLglDao(Connection conn) {
        this.conn = conn;
    }

    public void inserir(ProdutosLgl produto) throws SQLException {

        String sql = "INSERT INTO produtos ("
                + "nome, preco, quantidadeEstoque, chegadaEstoque, "
                + "descricao, fornecedor, categoria"
                + ") VALUES (?,?,?,?,?,?,?)";

        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, produto.getNome());
        stmt.setDouble(2, produto.getPreco());
        stmt.setInt(3, produto.getQuantidadeEstoque());
        stmt.setString(4, produto.getChegadaEstoque());
        stmt.setString(5, produto.getDescricao());
        stmt.setString(6, produto.getFornecedor());
        stmt.setString(7, produto.getCategoria());

        stmt.execute();
        stmt.close();
    }
}