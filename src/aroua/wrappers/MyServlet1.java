package aroua.wrappers;
import javax.servlet.*;
import java.io.*;
import java.util.Locale;
public class MyServlet1 extends GenericServlet
{
	private static final long serialVersionUID = 1L; // Numéro de version de la classe

	public void service (ServletRequest request, ServletResponse response) throws ServletException, IOException
    {
        response.setContentType ("text/html");// Définition du type de contenu de la réponse comme étant du HTML
        String name = request.getParameter ("username");// Récupération du paramètre "username" du ServletRequest et stockage dans la variable 'name'
        PrintWriter out = response.getWriter (); // Récupération du flux de sortie de la ServletResponse et création d'un objet PrintWriter pour écrire la réponse
        Locale loc = response.getLocale ();
        out.println ("Locale set for this application is " + loc.toString ());
        
        //affichage
        out.println("hello from servlet");
        out.println (name);// Écriture du contenu de 'name' dans le flux de sortie
    
    }
}