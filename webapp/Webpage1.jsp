<html>
    <head>
        <title>ServletRequest Wrapper Demo</title> <!-- Titre de la page HTML -->
    </head>

    <body>
        <b> Please enter your name : ? </b>  <!-- Balise HTML pour afficher un texte -->
        <br />
        <br />
        <br />

		<!-- Balise HTML pour d�finir le d�but d'un formulaire, l'action sp�cifie le servlet vers lequel les donn�es du formulaire seront envoy�es -->
        <form action="MyServ">
            Name : <input type="text" name="username" /> City : <input type="text" name="cityname" />
            <input type="submit" name="submit" />
        </form>
    </body>
</html>