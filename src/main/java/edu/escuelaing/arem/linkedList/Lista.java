package edu.escuelaing.arem.linkedList;

public class Lista {

	private Nodo first=null;
	private Nodo end=null;
	
	public Lista () {
	}
	
	/**
	 * funcion que anade valores a la lista
	 * @param valor
	 */
	public void add(Double valor) {
		Nodo nuevo= new Nodo(valor);
		
		if (first==null) {// si la lista esta vacia
			first=nuevo;
			end=nuevo;
		}else {// si la lista no esta vacia
			//el nuevo se pone en a ultima posicion entonces el ultimo a punta al nuevo nodo
			end.setNext(nuevo);
			
			//el utimo nodo lo dejo como el nodo final
			this.end=nuevo;
		}
	}
	
	/**
	 * funcion que remueve valores de la lista por un indice
	 * @param index
	 */
	public void remove(int index) {//se va a remover por el indice
		int tamano=this.size();
		if (index <= tamano) {//si el indice existe es decir no es mayor que la cantidad de nodos
			int contador=1;
			Nodo nodo = first;
			while(contador<index) {
				nodo = nodo.getNext();
				contador++;
			}
			if (nodo==first && end==first && index==1) {//si solo hay un elemento
				this.first=null;
				this.end=null;
			}else  {
				Nodo anterior=first;
				Nodo actual=null;//el nodo que vamos a borrar
				Nodo siguiente=null;
				int cont=1; 
				while(cont < index) {
					cont++;
					if (cont==index) {
						actual=anterior.getNext();
						siguiente=actual.getNext();
					}else {
						anterior=anterior.getNext();
					}
				}
				if(index==1) {// si quiere eliminar el primero
					this.first= first.getNext();
				}else {//si quiere eliminar otro
					anterior.setNext(siguiente);
				}
				
			}
		}
	}
	
	/**
	 * funcion que da el valor dela lista por un indice 
	 * (sirve como iterador pues basta con hacer un ciclo de itere sobre el tamano de la lista y 
	 * vaya pidiendo cada elemento de la lista)
	 * @param index
	 * @return valor del nodo en ese indice
	 */
	public Double valorPorIndex(int index) {
		Double valor=0.0;
		int count=1;
		Nodo actual=first;
		while(count < index) {
			count++;
			actual=actual.getNext();
		}
		return actual.getValue();
	}

	/**
	 * funcion que calcula el tamanode la lista
	 * @return tamanode la lista
	 */
	public int size() {
		int res = 0; // tamanode la lista
		if (first != null) {//si la lista no esta vacia contamos
			res++;//porque sabemos que hay al menos un nodo
			Nodo nodo = first;
			while (nodo.getNext() != null) {
				nodo = nodo.getNext();
				res++;
			}
		}
		return res;
		
	}
	
}
