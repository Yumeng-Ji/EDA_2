public class UnorderedDoubleLinkedList<T> extends DoubleLinkedList<T> implements UnorderedListADT<T> {
	
public void addToFront(T elem){
	// a�ade un elemento al comienzo
		// COMPLETAR EL CODIGO Y CALCULAR EL COSTE
        Node<T> nuevo = new Node<>(elem);
        if (isEmpty()) {
            last = nuevo;
            last.next =last;
            last.prev =last;
        }
        else {
            nuevo.next = last.next;
            nuevo.prev =last;
            last.next.prev = nuevo;
            last.next = nuevo;
        }
        count ++;

	}

	public void addToRear(T elem) {
	// a�ade un elemento al final 
		// COMPLETAR EL CODIGO Y CALCULAR EL COSTE
        Node<T> nuevo = new Node<>(elem);
        if (isEmpty()) {
            last = nuevo;
            last.next =last;
            last.prev =last;
        }
        else {
            nuevo.next = last.next;
            nuevo.prev=last;
            last.next.prev = nuevo;
            last.next = nuevo;
            last=nuevo;
        }
        count++;

	}
	
	public void addAfter(T elem, T target) {
	// A�ade elem detr�s de otro elemento concreto, target,  que ya se encuentra en la lista
		// COMPLETAR EL CODIGO Y CALCULAR EL COSTE
	}

}

