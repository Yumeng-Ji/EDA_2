import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoubleLinkedList<T> implements ListADT<T> {

    // Atributos
    protected Node<T> last;  // apuntador al último
    protected String descr;  // descripción
    protected int count;

    // Constructor
    public DoubleLinkedList() {
        last = null;
        descr = "";
        count = 0;
    }

    public void setDescr(String nom) {
        descr = nom;
    }

    public String getDescr() {
        return descr;
    }

    public T removeFirst() {
        // Elimina el primer elemento de la lista
        // Precondici�n: la lista no vacía
        // COMPLETAR EL CODIGO Y CALCULAR EL COSTE: constante O(1)
        if (isEmpty()) {
            return null;
        }
        T result = last.next.data;
        if (last.next == last) { // solo un elemento
            last = null;
        }
        else {
            Node<T> first = last.next;
           first.next.prev=last;
           last.next=first.next;
        }
        count--;
        return result;
    }

    public T removeLast() {
        // Elimina el último elemento de la lista
        // Precondici�n: Lista no vacía
        // COMPLETAR EL CODIGO Y CALCULAR EL COSTE : constante O(1)
        if (isEmpty()) {
            return null;
        }
        T result = last.data;
        if (last.next == last) { //solo un elemento
            last = null; //lista vacía
        }
        else {
            last.prev.next = last.next;
            last.next.prev = last.prev;
            last = last.prev;
        }
        count--;
        return result;
    }


    public T remove(T elem) {
        //Elimina un elemento concreto de la lista
        // COMPLETAR EL CODIGO Y CALCULAR EL COSTE: coste lineal O(n) , recorre toda la lista en el caso peor
        if (isEmpty()) {
            return null;
        }
        if (last.next == last) {//un elemento
            if (last.data.equals(elem)) {
                T result = last.data;
                last = null;
                count--;
                return result;
            }
            return null;
        }

        Boolean enc = false;
        Node<T> aux = last.next;
        while (aux != last && !enc) {
            if (aux.data.equals(elem)) {
                aux.next.prev = aux.prev;
                aux.prev.next = aux.next;
                enc = true;
                count--;
                return aux.data;
            }
            aux = aux.next;

        }
        if (!enc && last.data.equals(elem)) {
            T result = last.data;
            last.next.prev = last.prev;
            last.prev.next = last.next;
            last = last.prev;
            count--;
            return result;

        }
        return null;
    }

	
	public void removeAll(T elem) {
	//Elimina todas las apariciones de un elemento de la lista
		// COMPLETAR EL CODIGO Y CALCULAR EL COSTE: conste lineal O(n) , recorre toda la lista
        if (isEmpty()) {return;}
        if (last.next == last) {//un elemento
            if (last.data.equals(elem)) {
                last = null;
                count--;
            }
        }
        Node<T> aux = last.next; // primer elemento
        while (aux != last ) { //toda la lista menos ultimo
            if (aux.data.equals(elem)) {
                aux.prev.next = aux.next;
                aux.next.prev = aux.prev;
                count--;
            }
            aux = aux.next;

        }
        if (last.data.equals(elem)) {
            if (count==1){
                last = null;
            }
            else{
                last.prev.next=last.next;
                last.next.prev=last.prev;
                last=last.prev;
            }
            count--;
        }


	}

	public T first() {
	//Da acceso al primer elemento de la lista
	      // COMPLETAR EL CODIGO Y CALCULAR EL COSTE: constante O(1)
		 if (isEmpty()) {return null;}
        else{return last.next.data;}
	}

	public T last() {
	//Da acceso al último elemento de la lista
	      // COMPLETAR EL CODIGO Y CALCULAR EL COSTE: constante O(1)
		if (isEmpty()){return null;}
		else {return last.data;}
	}

	public DoubleLinkedList<T> clone(){
		// Devuelve una copia de la lista (no duplica el puntero)
		// COMPLETAR EL CODIGO Y CALCULAR EL COSTE : coste lineal O(n)
        DoubleLinkedList<T> copia = new DoubleLinkedList<>();
        if (isEmpty()){return copia;}
        Node<T> aux = last.prev;
        copia.last = new Node<T>(last.data);
        copia.last.next = copia.last;
        copia.last.prev = copia.last;
        Node<T> copy = copia.last;
        while (aux != last){ // mismo metodo que add to rear
            Node <T> elem = new Node<T> (aux.data);
            elem.prev= copia.last;
            elem.next= copy;
            copy.prev = elem;
            copia.last.next = elem;
            aux = aux.prev;
            copy = copy.prev;
        }
        copia.setDescr(this.descr);
        return copia;

	} 


	public boolean contains(T elem) {
	//Determina si la lista contiene un elemento concreto
		// COMPLETAR EL CODIGO Y CALCULAR EL COSTE: en el peor caso recorre toda la lista, coste O(n)

        if (isEmpty()){
            return false;
        }
        Boolean enc = false;
        Node<T> aux = last.next;
        while(aux!=last && !enc)
            {
                if(aux.data.equals(elem) )
                {
                    enc = true;
                    return true;
                }
                aux = aux.next;

            }
        if (!enc && last.data.equals(elem)){
            return true;
        }
        return false;

		      
	}

	public T find(T elem) {
	//Determina si la lista contiene un elemento concreto, y develve su referencia, null en caso de que no est�
		// COMPLETAR EL CODIGO Y CALCULAR EL COSTE : lineal O(n)
        if (isEmpty()){return null;}
        Node<T> aux = last.next;
        Boolean enc = false;
        while (aux!=last && !enc)
        {
            if (aux.data.equals(elem))
            {
                enc = true;
                return aux.data;
            }
            aux = aux.next;
        }
        if (!enc && last.data.equals(elem))
        {
            return last.data;
        }
        return null;


	}

	public boolean isEmpty(){ 
	//Determina si la lista est� vac�a
	 // COMPLETAR EL CODIGO Y CALCULAR EL COSTE : constante O(1)
		return (count==0);
}
	
	public int size(){ 
	//Determina el n�mero de elementos de la lista
	 // COMPLETAR EL CODIGO Y CALCULAR EL COSTE : constante O(1)
		return count;
}
	
	/** Return an iterator to the stack that iterates through the items . */ 
	public Iterator<T> iterator() { return new ListIterator(); } 

	   // an iterator, doesn't implement remove() since it's optional 
	   private class ListIterator implements Iterator<T> {
        private Node<T> actual;
        private int recorrido;

        public ListIterator() { // coste constante O(1)
           if (!isEmpty()){
            actual=last.next;
            recorrido=0;}
           else{
               actual=null;
           }
        }
        public boolean hasNext() { //coste constante O(1)
          if (actual!=null && recorrido<count){
              return true;
          }
          return false;
        }
        public T next() { //coste constante O(1)
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T RESULT = actual.data;
            actual = actual.next;
            recorrido++;
            return RESULT;

        }
        public void remove() {}

		// COMPLETAR EL CODIGO Y CALCULAR EL COSTE



	   } // private class
		
		
         public void visualizarNodos() {
			System.out.println(this.toString());
		}

		@Override
		public String toString() {
			String result = new String();
			Iterator<T> it = iterator();
			while (it.hasNext()) {
				T elem = it.next();
				result = result + "[" + elem.toString() + "] \n";
			}	
			return "DoubleLinkedList " + result + "]";
		}

}

