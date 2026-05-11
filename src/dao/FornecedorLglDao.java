package dao;

import bean.FornecedorLgl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FornecedorLglDao {

    private Connection conn;

    public FornecedorLglDao(Connection conn) {
        this.conn = conn;
    }

    public void inserir(FornecedorLgl fornecedor) throws SQLException {

        String sql = "INSERT INTO fornecedor ("
                + "razaoSocial, nomeComercial, cnpj, site, cidade, "
                + "endereco, cep, bairro, complemento, numero, "
                + "email, telefone, contato, uf"
                + ") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, fornecedor.getRazaoSocial());
        stmt.setString(2, fornecedor.getNomeComercial());
        stmt.setString(3, fornecedor.getCnpj());
        stmt.setString(4, fornecedor.getSite());
        stmt.setString(5, fornecedor.getCidade());
        stmt.setString(6, fornecedor.getEndereco());
        stmt.setString(7, fornecedor.getCep());
        stmt.setString(8, fornecedor.getBairro());
        stmt.setString(9, fornecedor.getComplemento());
        stmt.setInt(10, fornecedor.getNumero());
        stmt.setString(11, fornecedor.getEmail());
        stmt.setString(12, fornecedor.getTelefone());
        stmt.setString(13, fornecedor.getContato());
        stmt.setString(14, fornecedor.getUf());

        stmt.execute();
        stmt.close();
    }
}