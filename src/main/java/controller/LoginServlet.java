package controller;

import dao.UsuarioDAO;
import model.Usuario;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet",value="/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String button = request.getParameter("button");
        String id = request.getParameter("id");
        String password = request.getParameter("password");
        RequestDispatcher dispatcher;

        UsuarioDAO dao = new UsuarioDAO();
        Usuario usuario = dao.logar(Integer.parseInt(id),password);

        if(usuario != null){//user existe
            if(usuario.getUserType().equalsIgnoreCase("cli")){ //usuario é um cliente
                dispatcher = request.getRequestDispatcher("jogar.jsp");
            }else { //usuario é um adm
                dispatcher = request.getRequestDispatcher("menuADM.html");
            }

        }else{
            //deu ruim no login
            dispatcher = request.getRequestDispatcher("loginInvalido.jsp");
        }
        dispatcher.forward(request,response);
    }

}


