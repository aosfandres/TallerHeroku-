package edu.escuelaing.arem;

import static spark.Spark.*;

import edu.escuelaing.arem.calculo.Calculadora;
import edu.escuelaing.arem.linkedList.Lista;
import spark.Request;
import spark.Response;

public class App {

	/**
     * This main method uses SparkWeb static methods and lambda functions to
     * create a simple Hello World web app. It maps the lambda function to the
     * /hello relative URL.
     */
    public static void main(String[] args) {
        port(getPort());
        get("/", (req, res) -> inputDataPage(req, res));
        get("/results", (req, res) -> resultsPage(req, res));
    }

    /**
     * Esta funcion se encarga de brindar el formulario html para la insaersion de los datos por parte del usuario
     * @param req
     * @param res
     * @return
     */
    private static String inputDataPage(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h2>App para calcular la media y desviasion estandar de n numeros reales</h2>"
                + "<form action=\"/results\">"
                + "Ingresa tus numeros a continuacion separados por coma (,)<br>"
                + "<br><br>"
                + "<input type=\"text\" name=\"values\" value=\"\">"
                + "<br><br>"
                + "<input type=\"submit\" value=\"Calculate\">"
                + "</form>"
                + "<p>si vas a digitar decimales recuerda separalos por punto (.)</p>"
                + "</body>"
                + "</html>";
        return pageContent;
    }
    
    /**
     * Este metodo se encarga de recibir los valores e imprimir el respectivo calculo
     * @param req
     * @param res
     * @return formulario html con el calculo realizado
     */

    private static String resultsPage(Request req, Response res) {
		Lista lista = new Lista();
		String[] numeros = req.queryParams("values").split(",");
		for (String i : numeros) {
			lista.add(Double.parseDouble(i));
		}
		String pageContent = "<!DOCTYPE html>" + "<html>" + "<body>"
				+ "<h2>App para calcular la media y desviasion estandar de n numeros reales</h2>"
				+ "<form action=\"/results\">" + "Tu resultado es <br>" 
				+ "<h4>"+ "La media es: " + Calculadora.media(lista) + "<h4>"
				+ "<h4>"+ "La desviacion estandar es: " + Calculadora.desviacion(lista) + "<h4>"
				+ "</body>" + "</html>";

		return pageContent;
	}

    /**
     * This method reads the default port as specified by the PORT variable in
     * the environment.
     *
     * Heroku provides the port automatically so you need this to run the
     * project on Heroku.
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }
}
