package ArithmeticCalculator;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ArithmeticCalculatorServlet extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        request.setAttribute("result", " ---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String firstnum = request.getParameter("first_num");
        String secondnum = request.getParameter("second_num");
        String action = request.getParameter("arithmetic");
        int arithmetic = 0;
        
        request.setAttribute("firstnum", firstnum);
        request.setAttribute("secondnum", secondnum);
        
        
        if(firstnum == null || firstnum.equals("") || secondnum == null || secondnum.equals(""))
        {
            request.setAttribute("result", " Invalid");
        }
        else
        {
            switch(action)
            {
                case "+": 
                    arithmetic = Integer.parseInt(firstnum) + Integer.parseInt(secondnum);
                    request.setAttribute("result", " " + arithmetic);
                    break;
                case "-":
                    arithmetic = Integer.parseInt(firstnum) - Integer.parseInt(secondnum);
                    request.setAttribute("result", " " + arithmetic);
                    break;
                case "*":
                    arithmetic = Integer.parseInt(firstnum) * Integer.parseInt(secondnum);
                    request.setAttribute("result", " " + arithmetic);
                    break;
                case "%":
                    arithmetic = Integer.parseInt(firstnum) % Integer.parseInt(secondnum);
                    request.setAttribute("result", " " + arithmetic);
                    break;
            }
        }
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

}
