
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import baseDeDonnees.*;

/**
 * Servlet implementation class calc
 */
@WebServlet("/Connection")
public class Connection extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Interface inter = Interface.getInstance();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Connection() {
        super();
        // TODO Auto-generated constructor stub
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("pseudo")!=null && request.getParameter("password")!=null && inter.connection(request.getParameter("pseudo"), request.getParameter("password"))){
			System.out.println("connected");
			request.setAttribute("nom", request.getParameter("pseudo"));
			request.getRequestDispatcher("Connected.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("Account.html").forward(request, response);;
		}
	}

}
