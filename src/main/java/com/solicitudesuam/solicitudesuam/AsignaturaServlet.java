package com.solicitudesuam.solicitudesuam;

import Model.Asignatura;
import  jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.IDAO;
import service.ImplIDAO;

import java.io.IOException;
import java.util.List;

@WebServlet("/asignaturas")
public class AsignaturaServlet extends HttpServlet {
    private IDAO dao;

    @Override
    public void init() throws ServletException {
        super.init();
        dao = new ImplIDAO();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Obtener todas las asignaturas utilizando el método getAll del DAO
        List<Asignatura> asignaturas = dao.getAll("Asignatura.findAll", Asignatura.class);

        // Pasar las asignaturas al JSP para su visualización
        req.setAttribute("asignaturas", asignaturas);
        req.getRequestDispatcher("asignaturas.jsp").forward(req, resp);
    }
}