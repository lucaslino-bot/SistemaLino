package dao;

import bean.UsuarioLgl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioLglDao {

    private Connection conn;

    public UsuarioLglDao(Connection conn) {
        this.conn = conn;
    }

    public void inserir(UsuarioLgl usuario) throws SQLException {

        String sql = "INSERT INTO usuario ("
                + "nome, apelido, cpf, dataNascimento, senha, nivel, "
                + "email, telefone, ativo, dataCadastro, horaCadastro, "
                + "acessos, genero, cargo"
                + ") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, usuario.getNome());
        stmt.setString(2, usuario.getApelido());
        stmt.setString(3, usuario.getCpf());
        stmt.setString(4, usuario.getDataNascimento());
        stmt.setString(5, usuario.getSenha());
        stmt.setString(6, usuario.getNivel());
        stmt.setString(7, usuario.getEmail());
        stmt.setString(8, usuario.getTelefone());
        stmt.setBoolean(9, usuario.isAtivo());
        stmt.setString(10, usuario.getDataCadastro());
        stmt.setString(11, usuario.getHoraCadastro());
        stmt.setString(12, usuario.getAcessos());
        stmt.setString(13, usuario.getGenero());
        stmt.setString(14, usuario.getCargo());

        stmt.execute();
        stmt.close();
    }
}