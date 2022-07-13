package kz.bitlab.servlets;

import kz.bitlab.db.DBManager;
import kz.bitlab.db.User;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/apply")
public class ApplyServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response){

    }
    protected void doPost (HttpServletRequest request,HttpServletResponse response) throws IOException {
        String fullName = request.getParameter("user_fullName");
        int age = Integer.parseInt(request.getParameter("user_age"));
        String gender = request.getParameter("user_gender");
        User user = new User();
        user.setFullName(fullName);
        user.setAge(age);
        user.setGender(gender);
        DBManager.addUser(user);
        response.sendRedirect("/home");
    }
}