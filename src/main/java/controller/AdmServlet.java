package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AdmServlet", value = "/adm")
public class AdmServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String button = request.getParameter("button");
        RequestDispatcher dispatcher;

        if(button.equalsIgnoreCase("Cadastrar Usuario")){
            dispatcher = request.getRequestDispatcher("cadastroUsuario.html");
        }else{
            dispatcher = request.getRequestDispatcher("cadastroPista.html");
        }
        dispatcher.forward(request,response);
    }
}
