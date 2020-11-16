package controller;

import dao.PistasDAO;
import model.Pistas;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "PistaServlet", value = "/cadastroPista")
public class PistaServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String botao = request.getParameter("botao");
        String id = request.getParameter("id");
        String latitude = request.getParameter("latitude");
        String longitude = request.getParameter("longitude");
        String elevacao = request.getParameter("elevacao");
        String nome = request.getParameter("nome");
        String cidade = request.getParameter("cidade");
        String pais = request.getParameter("pais");
        String quesInfo = request.getParameter("quesInfo");
        String info = request.getParameter("info");

        RequestDispatcher dispatcher;

        PistasDAO dao = new PistasDAO();

        if(dao.validar(Integer.parseInt(id)) == null){
            if (quesInfo.equalsIgnoreCase("yes")){
                try {
                    dao.cadastrarComInfo(new Pistas(Integer.parseInt(id), latitude, longitude, elevacao, nome, cidade, pais, info));
                    dispatcher = request.getRequestDispatcher("cadastroPistaRealizado.html");
                    dispatcher.forward(request,response);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }else {
                try {
                    dao.cadastrarSemInfo(new Pistas(Integer.parseInt(id), latitude, longitude, elevacao, nome, cidade, pais, info));
                    dispatcher = request.getRequestDispatcher("cadastroPistaRealizado.html");
                    dispatcher.forward(request,response);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

        }else{
            dispatcher = request.getRequestDispatcher("cadastroExistente.html");
            dispatcher.forward(request,response);
        }
    }
}
