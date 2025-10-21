public class OrderedDoubleLinkedList<T extends Comparable<T>> extends DoubleLinkedList<T> implements OrderedListADT<T> {
	
	public void add(T elem){
		// COMPLETAR EL CODIGO Y CALCULAR EL COSTE : recorre toda la lista en peor caso coste O(n)
        Node<T> nuevo = new Node<T>(elem);
        if (isEmpty()){
            last = nuevo;
            last.next = last;
            last.prev = last;
        }
        else{
            Node<T>aux=last.next;
            boolean encontrado=false;
            while (!encontrado && aux!=last){
                if (elem.compareTo(aux.data)<=0){
                    nuevo.next = aux;
                    nuevo.prev = aux.prev;
                    aux.prev.next = nuevo;
                    aux.prev = nuevo;
                    encontrado=true;
                }
                aux=aux.next;
            }
            if (!encontrado) {
                if (elem.compareTo(last.data) <= 0) {
                    nuevo.next = last;
                    nuevo.prev = last.prev;
                    last.prev.next = nuevo;
                    last.prev = nuevo;
                } else {
                    nuevo.next = last.next;
                    nuevo.prev = last;
                    last.next.prev = nuevo;
                    last.next = nuevo;
                    last = nuevo;
                }
            }


        }
       count++;
	}
	
	public OrderedDoubleLinkedList<T> intersection(OrderedDoubleLinkedList<T> lista){
		// COMPLETAR EL CODIGO Y CALCULAR EL COSTE


	}

}

