package dao;

import conexao.ConexaoDB;
import model.Pistas;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PistasDAO {
    private Connection connection;
    private PreparedStatement ps;
    private ResultSet rs;

    public Pistas validar(int id) {
        Pistas pistas = null;
        final String sql = "select * from dsrpt_pistas where id=?";
        connection = new ConexaoDB().conectar();
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                pistas = new Pistas(
                        id,
                        rs.getString("latitude"),
                        rs.getString("longitude"),
                        rs.getString("elevacao"),
                        rs.getString("nome"),
                        rs.getString("cidade"),
                        rs.getString("pais"),
                        rs.getString("info")
                        );
                connection.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return pistas;
    }

    public boolean cadastrarComInfo(Pistas pistas) throws SQLException {
        boolean sucesso = false;
        final String sql = "insert into dsrpt_pistas(id, latitude, longitude, elevacao, nome, cidade, pais, info) values(?,?,?,?,?,?,?,?)";
        connection = new ConexaoDB().conectar();
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, pistas.getId());
            ps.setString(2, pistas.getLatitude());
            ps.setString(3, pistas.getLongitude());
            ps.setString(4, pistas.getElevacao());
            ps.setString(5, pistas.getNome());
            ps.setString(6, pistas.getCidade());
            ps.setString(7, pistas.getPais());
            ps.setString(8, pistas.getInfo());
            ps.execute();
            System.out.println("Pista com info cadastrada");
            sucesso = true;
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            connection.close();
        }
        return sucesso;
    }

    public boolean cadastrarSemInfo(Pistas pistas) throws SQLException {
        boolean sucesso = false;
        final String sql = "insert into dsrpt_pistas(id, latitude, longitude, elevacao, nome, cidade, pais, info) values(?,?,?,?,?,?,?,?)";
        connection = new ConexaoDB().conectar();
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, pistas.getId());
            ps.setString(2, pistas.getLatitude());
            ps.setString(3, pistas.getLongitude());
            ps.setString(4, pistas.getElevacao());
            ps.setString(5, pistas.getNome());
            ps.setString(6, pistas.getCidade());
            ps.setString(7, pistas.getPais());
            ps.setString(8, "-");
            ps.execute();
            System.out.println("Pista sem info cadastrada");
            sucesso = true;
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            connection.close();
        }
        return sucesso;
    }

    public List<Pistas> listarPistas(){
        Pistas pistas;
        List<Pistas> lista = new ArrayList<>();
        final String sql = "select * from dsrpt_pistas";
        connection = new ConexaoDB().conectar();
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                pistas = new Pistas(
                        rs.getInt("id"),
                        rs.getString("latitude"),
                        rs.getString("longitude"),
                        rs.getString("elevacao"),
                        rs.getString("nome"),
                        rs.getString("cidade"),
                        rs.getString("pais"),
                        rs.getString("info")
                );
                lista.add(pistas);
            }
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return lista;
    }

}

