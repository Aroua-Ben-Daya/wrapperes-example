package aroua.wrappers;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
public class MyFilter1 implements Filter
{
    public void init (FilterConfig filterConfig) // Définition de la méthode init() qui initialise le filtre
    {
    	System.out.println(" init Filter method is called");
    }

    public void destroy () // Définition de la méthode destroy() qui détruit le filtre
    {
    }

   
    public void doFilter (ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException
    {
    	
    	//transformer notre requet en HTtprequest pour ecrire sur notre page
    	HttpServletResponse resp = (HttpServletResponse) response;
    	
        resp.setContentType ("text/html"); // Définition du type de contenu de la réponse comme étant du HTML
        PrintWriter out = resp.getWriter ();  // Récupération du flux de sortie de la ServletResponse et création d'un objet PrintWriter pour écrire la réponse
        out.println("<b> <i>Filtering request and passing it to Wrapper class</i> </b> <br/>"); // Écriture d'un message dans la réponse

     // Appel du constructeur de la classe RequestWrapper1 pour envelopper la ServletRequest 
        RequestWrapper1 requestWrapper = new RequestWrapper1 (request);

        
        out.println("<b> <i>Filtering request and passing it to Wrapper class</i> </b> <br/>");
        
        ResponseWrapper1 reponsewrapper = new ResponseWrapper1(response);
        
        
        // Cette méthode appelle le prochain filtre dans la chaîne, ou la ressource finale (comme une servlet) si aucun filtre suivant n'est disponible.
        chain.doFilter (requestWrapper, response);
    }
}