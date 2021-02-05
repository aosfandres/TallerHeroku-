package edu.escuelaing.arem.linkedList;

public class Nodo {
	
	private Nodo next=null;
	private Double value=null;
	
	
	/**
	 * constructor
	 * @param val
	 */
	public Nodo (Double val) {
		this.value= val;
	}

	
	/**
	 * funcion que retorna el nodo siguiente
	 * @return nodo siguiente a el mismo nodo
	 */
	public Nodo getNext() {
		return next;
	}

	/**
	 * funcion que cambia el nodo siguiente a un nodo
	 * @param next
	 */
	public void setNext(Nodo next) {
		this.next = next;
	}

	/**
	 * funcion que devuelve el valor de un nodo
	 * @return valor del nodo
	 */
	public Double getValue() {
		return value;
	}

	/**
	 * funcion que cambia el valor de un nodo
	 * @param value
	 */
	public void setValue(Double value) {
		this.value = value;
	}
	
	

}
