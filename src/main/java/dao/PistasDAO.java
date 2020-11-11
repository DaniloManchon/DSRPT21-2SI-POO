package dao;

import conexao.ConexaoDB;
import model.Pistas;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PistasDAO {
    private Connection connection;
    private PreparedStatement ps;
    private ResultSet rs;
    //TODO fazer essa porra aqui
    //TODO fazer Servlet
    public boolean cadastrar(Pistas pistas) throws SQLException {
        boolean sucesso = false;
        final String sql = "insert into dsrpt_usuario(id, name, password, usertype) values(?,?,?,?)";
        connection = new ConexaoDB().conectar();
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, );
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

}
