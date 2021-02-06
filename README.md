# Taller de Introducción a Heroku

# DESCRIPCION
Aplicacion web escrita en java con uso de spark e implementacion de Maven para autumatizacion, que permite el calculo de la media y la desvicacion estandar de un conjunto de n numeros reales leidos desde la pagina web.

# REQURIMIENTOS DE LA APLICACION
Calcular la media de n numeros reales

![](https://github.com/aosfandres/TallerHeroku-/blob/main/images/media.PNG)

Calcular la desviacion estandar de n numeros reales

![](https://github.com/aosfandres/TallerHeroku-/blob/main/images/desvi.PNG)

Hacer uso de una implemntacion propia de lista encadenada

![](https://github.com/aosfandres/TallerHeroku-/blob/main/images/lista.PNG)


Leer los datos por medio de una pagina web (con uso de spark)

# REQUISITOS
- Java 
- Maven 

# DISEÑO
El despliegue de la aplicacion esta hecho en Heroku el cual usa un Dyno para soportar la app y por medio del protocolo HTTP el cliente o usuario final puede hacer uso de la aplicacion.

![](https://github.com/aosfandres/TallerHeroku-/blob/main/images/diagrama.PNG)

# USO
Ingresar al aplicativo web por medio del despliege en Heroku

![](https://github.com/aosfandres/TallerHeroku-/blob/main/images/1.PNG)

Allí se presenta el formulario HTML que solicita al usuario los datos a ser evaluados. Ingresamos los datos, y seleccionamos calculate para obtener el resultado.

![](https://github.com/aosfandres/TallerHeroku-/blob/main/images/2.PNG)

![](https://github.com/aosfandres/TallerHeroku-/blob/main/images/3.PNG)

# PRUEBAS
Las pruebas están diseñadas para probar la correcta funcionalidad de la calculadora con los datos de prueba proporcionados, y la correcta funcionalidad de la aplicación con la lista implementada. 

![](https://github.com/aosfandres/TallerHeroku-/blob/main/images/4.PNG)


# DOCUMENTO LATEX
[Taller de Introducción a Heroku](https://github.com/aosfandres/TallerHeroku-/blob/main/LatexDocument.pdf)

# DOCUMENTACION (JAVADOC)
Para generar la documentacion con maven uasr mvn javdoc:javadoc en consola
[JAVADOC](https://github.com/aosfandres/TallerHeroku-/blob/main/JAVADOC.lnk)

# DESPLIEGUE

[![Deployed to Heroku](https://www.herokucdn.com/deploy/button.png)](https://fierce-falls-89370.herokuapp.com)

# INTEGRAION CONTINUA

[![CircleCI](https://circleci.com/gh/aosfandres/TallerHeroku-.svg?style=svg&circle-token=fa8c51f3bedd926b133267148a5e3c22e1617f4a)](https://app.circleci.com/pipelines/github/aosfandres/TallerHeroku-)

# AUTOR
Andres Orlando Sotelo Fajardo 

# LICENCIA

[LICENSE](https://github.com/aosfandres/TallerHeroku-/blob/master/LICENSE)