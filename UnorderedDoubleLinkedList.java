public class UnorderedDoubleLinkedList<T> extends DoubleLinkedList<T> implements UnorderedListADT<T> {
	
public void addToFront(T elem){
	// a�ade un elemento al comienzo
		// COMPLETAR EL CODIGO Y CALCULAR EL COSTE: el coste es constante O(1)
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
		// COMPLETAR EL CODIGO Y CALCULAR EL COSTE: constante O(1)
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
		// COMPLETAR EL CODIGO Y CALCULAR EL COSTE : coste lineal O(n)
        if (isEmpty()) {return;}
        Node<T> nuevo = new Node<>(elem);
        if (last.next == last) {//un elemento
            if(last.data.equals(target)) {
                nuevo.prev = last;
                nuevo.next = last;
                last.next = nuevo;
                last.prev = nuevo;
                last=nuevo;
                count++;
            }
            return;
        }
        Node<T> aux = last.next;
        Boolean encontrado = false;
        while(aux!=last && !encontrado)
        {
            if(aux.data.equals(target))
            {
                nuevo.prev=aux;
                nuevo.next=aux.next;
                aux.next.prev=nuevo;
                aux.next=nuevo;
                count++;
                encontrado=true;
            }
            aux = aux.next;
        }
        if (!encontrado && last.data.equals(target))
        {
            nuevo.prev = last;
            nuevo.next = last.next;
            last.next.prev=nuevo;
            last.next=nuevo;
            last=nuevo;
            count++;
        }
	}

}

