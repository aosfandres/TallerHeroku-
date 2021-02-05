package edu.escuelaing.arem.calculo;

import edu.escuelaing.arem.linkedList.Lista;

public class Calculadora {

	/**
	 * Funcion que calcula la media de una lista de numeros
	 * @param lista
	 * @return media de la lista
	 */
	public static Double media(Lista lista) {
		Double acumulado = 0.0;
		//lista tiene la funcion de retornar el valor de un determinado indice, entonces recorro cada uno de los indices y los sumo
		for (int i=1; i <= lista.size();++i) {
			acumulado+=lista.valorPorIndex(i);
		}
		return acumulado / lista.size();
	}
	
	/**
	 * funcion que calcula la desviasion estandar de una lista de numeros
	 * @param lista
	 * @return la desviacion estandar de la lista
	 */
	public static Double desviacion(Lista lista) {
		Double resultado = 0.0;
		Double media = media(lista);
		
		for (int i = 1; i <= lista.size(); i++) {
			resultado += (double) Math.pow((lista.valorPorIndex(i) - media), 2);

		}
		return (Double) Math.sqrt(resultado / ( lista.size()- 1));
	}
	
}
