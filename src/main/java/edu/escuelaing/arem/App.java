package edu.escuelaing.arem;


import static spark.Spark.*;



public class App {

	 public static void main(String[] args) {
	 port(getPort());
	 get("/hello", (req, res) -> "Hello Adres");
	 }
	 static int getPort() {
	 if (System.getenv("PORT") != null) {
	 return Integer.parseInt(System.getenv("PORT"));
	 }
	 return 4567; //returns default port if heroku-port isn't set( i.e. on localhost)
	 }
}
