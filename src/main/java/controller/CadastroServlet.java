package controller;

import dao.UsuarioDAO;
import model.Usuario;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "CadastroServlet", value = "/cadastro")
public class CadastroServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String button = request.getParameter("button");
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String userType = request.getParameter("userType");

        RequestDispatcher dispatcher;

        UsuarioDAO dao = new UsuarioDAO();

        if(dao.logar(Integer.parseInt(id),password) != null){
            try {
                dao.cadastrar(new Usuario(Integer.parseInt(id), name, password, userType));
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }else{
            dispatcher = request.getRequestDispatcher("cadastroExistente.html");
            dispatcher.forward(request,response);
        }
    }
}
