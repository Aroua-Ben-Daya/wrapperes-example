package aroua.wrappers;

import java.util.Locale;

import javax.servlet.ServletResponse;
import javax.servlet.ServletResponseWrapper;

public class ResponseWrapper1 extends ServletResponseWrapper
{
    public ResponseWrapper1 (ServletResponse res)
    {
        //Calling the ServletResponseWrapper superclass constructor i.e. ServletResponse interface.
        super (res);
    }
    public Locale getLocale () // Définition de la méthode getLocale() qui remplace la méthode du même nom de la classe mère ServletResponseWrapper
    {
        System.out.println ("Wrapper class called by Filter"); // Affichage d'un message indiquant que la classe Wrapper est appelée par le filtre
     // Appel de la méthode getLocale() de la classe mère ServletResponseWrapper
        Locale loc = super.getLocale ();
        
     // Récupération du code pays et du code de langue de la locale
        String country = loc.getCountry ();
        String language = loc.getLanguage ();
        
        // Vérification si le pays est différent des États-Unis
        if (!country.equals ("US"))
        {
        // Création d'une nouvelle locale avec la langue anglaise et le pays États-Unis
         Locale loc1 = new Locale ("English, US");
         loc = loc1;
        }
        // Affichage du code pays et du code de langue de la locale
        System.out.println (country);
        System.out.println (language);
        
     // Renvoie de la locale (modifiée ou non)
        return loc;
    }
}