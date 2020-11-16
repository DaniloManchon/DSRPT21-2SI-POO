package dao;

import conexao.ConexaoDB;
import model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    private Connection connection;
    private PreparedStatement ps;
    private ResultSet rs;

    public Usuario logar(int id, String password) {
        Usuario usuario = null;
        final String sql = "select * from dsrpt_usuario where id=? and password=?";
        connection = new ConexaoDB().conectar();
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if (rs.next()) {
                usuario = new Usuario(id, rs.getString("name"), password, rs.getString("usertype"));
                connection.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return usuario;
    }

    public boolean cadastrar(Usuario usuario) throws SQLException {
        boolean sucesso = false;
        final String sql = "insert into dsrpt_usuario(id, name, password, usertype) values(?,?,?,?)";
        connection = new ConexaoDB().conectar();
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, usuario.getId());
            ps.setString(2, usuario.getName());
            ps.setString(3, usuario.getPassword());
            ps.setString(4, usuario.getUserType());
            ps.execute();
            System.out.println("usuario cadastrado");
            sucesso = true;
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            connection.close();
        }
        return sucesso;
    }
}

