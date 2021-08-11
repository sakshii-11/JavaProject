
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class logincheck
 */


@WebServlet("/logincheck")
public class logincheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public logincheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String plcode =request.getParameter("plcode");
		String plname=request.getParameter("plname");
		String plrun =request.getParameter("plrun");
		String plnotout=request.getParameter("plnotout");
		
		
		Plcode p = () -> 
			
			System.out.println("player code   " + plcode);
		;
		
		Plname pl = () -> 
			
			System.out.println("player name  " + plname);
		;
	
		Plrun pr = () -> 
		
		    System.out.println("player runs  " + plrun);
	    ;
     
        PlNotOut pn = () -> 
		
		    System.out.println("player not outs   " + plnotout);
     	;
  
  p.sayPl();
  pl.sayPL();
  pr.sayPLrun();
  pn.sayPlnotout();

        request.getSession().setAttribute("plcode", plcode);
	    request.getSession().setAttribute("plname",plname);
	    request.getSession().setAttribute("plrun", plrun);
	    request.getSession().setAttribute("plnotout",plnotout);
	    
			response.sendRedirect("member.jsp");
	}

}
