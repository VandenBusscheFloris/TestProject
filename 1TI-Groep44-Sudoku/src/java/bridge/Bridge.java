package bridge;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import javax.json.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Bridge", urlPatterns = {"/API/*"})
public class Bridge extends HttpServlet {
private static String prefix = "/1TI-Groep44-Sudoku/API/";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String operation = request.getRequestURI().substring(prefix.length());
            String height = request.getParameter("height");
            String width = request.getParameter("width");
            String difficulty = request.getParameter("difficulty");
            
            JsonObject json = Json.createObjectBuilder()
                    .add("operation", operation)
                    .add("size", width +"x"+height)
                    .add("difficulty", difficulty)
                    .build();
            out.println(json);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
