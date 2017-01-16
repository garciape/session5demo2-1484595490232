package wasdev.sample.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.*;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet("/SimpleServlet")
public class SimpleServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        
        // response.getWriter().print("Hello World!");
        
        ArrayList<String> sports = new ArrayList<String>();
	  	sports.add("Football");
   		 sports.add("Boxing");

		for(String sport : sports) {
     			response.getWriter().print(sport); 
     			response.getWriter().write("<br/>");
     			
		}
		
			//Major cities and the year they were founded
		HashMap<String, Integer> majorCities = new HashMap<String, Integer>();

		majorCities.put("New York", 1624);
		majorCities.put("London", 43);
		majorCities.put("Mexico City", 1521);
		majorCities.put("Sao Paulo", 1554);


		for (String city : majorCities.keySet() ) {

			response.getWriter().print(city + " was founded in " + majorCities.get(city));
			response.getWriter().write("<br/>");
     		

		}
        
    }

}
