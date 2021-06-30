package io.mostafa.cutomermanagement.web;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class verify
 */
@WebFilter("/addnewcustomer")
public class verify implements Filter {

    /**
     * Default constructor. 
     */
    public verify() {
       
    }

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest) request;
		String verify=req.getParameter("verify");
		String username=req.getParameter("username");
		String tax_number=req.getParameter("tax_number");
		String city=req.getParameter("city");
		String country=req.getParameter("country");
		String address=req.getParameter("address");
		boolean numberOrstring=true;
		for(int i=0;i<tax_number.length();i++) {
			if(tax_number.charAt(i)<='9'&&tax_number.charAt(i)>='0')
				continue;
			else {
				numberOrstring=false;
			}
				
		}
		if(verify!=null&&!username.equals("")&&!tax_number.equals("")&&!city.equals("")&&!country.equals("")&&!address.equals("")&&numberOrstring==true)
		{
			
			chain.doFilter(request, response);
		}
		else
		{
			response.getWriter().println("please fill all information in the form and check if the tax_number is numeric or not ");
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
