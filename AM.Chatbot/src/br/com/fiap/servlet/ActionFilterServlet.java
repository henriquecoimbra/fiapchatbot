package br.com.fiap.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import br.com.fiap.bean.Usuario;

/**
 * Servlet Filter implementation class ActionFilterServlet
 */
@WebFilter("/ActionFilterServlet")
public class ActionFilterServlet implements Filter {

    /**
     * Default constructor. 
     */
    public ActionFilterServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	       HttpServletRequest req = (HttpServletRequest) request;
	       
	        HttpSession session = req.getSession();
	        Usuario usuarioLogado = (Usuario) session.getAttribute("usuarioLogado");

	        String usuario = "<deslogado>";

	        if (usuarioLogado != null) {
	            usuario = usuarioLogado.getEmail();
	            chain.doFilter(request, response);
	        }else {
	        	RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
				dispatcher.forward(request, response);
	        }	       	

		        System.out.println("Usuario " + usuario + " acessando a URI "
		                + req.getRequestURI());

	      
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
