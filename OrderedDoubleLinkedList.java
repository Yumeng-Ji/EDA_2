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
	
	 public OrderedDoubleLinkedList<T> intersection(OrderedDoubleLinkedList<T> lista) {
		 //el coste es O(n+m) porque recorre toda la lista  1 y 2 en el peor caso ,
		 //donde n es el numero de elements de this & m es el numero de elementos de la lista
        OrderedDoubleLinkedList<T> intersection = new OrderedDoubleLinkedList<>();

        if (this.last == null || lista.last == null) {
            return intersection;
        }

        Node<T> aux = this.last.next;
        Node<T> actual = lista.last.next;
       boolean auxTerminado = false;
       boolean actualTerminado = false;
        int iterAux = 0;
        int iterAct=0;
        int maxAux = this.size();
        int maxAct = lista.size();

        while((iterAux < maxAux) && (iterAct < maxAct)) {
            int compare = actual.data.compareTo(aux.data);
            System.out.println("Comparing "+actual.data+" to "+aux.data);
            if (compare == 0) {
				Node <T> dato = new Node (aux.data);
				if (intersection.isEmpty())
				{
					intersection.last= dato;
					intersection.last.next=last;
					intersection.last.prev=last;
				}
                else{
					dato.prev=intersection.last;
					dato.next=intersection.last.next;
					intersection.last.next.prev=dato;
					intersection.last.next=dato;
					intersection.last=dato;
				}
                actual = actual.next;
                aux = aux.next;
                iterAux++;
                iterAct++;
            } else if (compare > 0) {
                aux = aux.next;
                iterAux++;

            } else if (compare < 0) {
               actual = actual.next;
               iterAct++;
            }
        }


        return intersection;
    }

}



