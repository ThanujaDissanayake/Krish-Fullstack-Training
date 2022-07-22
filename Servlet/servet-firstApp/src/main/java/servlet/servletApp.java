package servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/formdata")
public class servletApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public servletApp() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
	     
	    PrintWriter output = response.getWriter();
	    
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String medium=request.getParameter("medium");
        
        try {
        	 String[] subject = request.getParameterValues("subject");
             String selectedSub = "";
             if(subject!=null){
                 for(int i=0;i<subject.length;i++){
                 	selectedSub= selectedSub + subject[i]+ ", ";
                 }
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            Date date=null;
			try {
				date = formatter.parse(request.getParameter("dob"));
			} catch (ParseException e) {
				e.printStackTrace();
			}
                 
        	output.print("<html><body>");
        	output.print("<h3>Details Entered</h3><br/>");
              
        	output.print("Full Name: "+ username + "<br/>");
        	output.print("Phone Number: "+ "<br/>");
        	output.print("Gender: "+ gender +"<br/>");
        	output.print("Email Address: "+ email +"<br/>");
        	output.print("Birthday: "+ date +"<br/>");
        	output.print("Gender: "+ medium +"<br/>");
        	output.print("Selected Subjects: "+ selectedSub +"<br/>");
              
        	output.print("</body></html>");
             }
        }
        finally {
        	output.close();
        }
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
