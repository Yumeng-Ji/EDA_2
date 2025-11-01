import java.util.Iterator;

public class PruebaDoubleLinkedList {
	
	public static void visualizarNodos(UnorderedDoubleLinkedList<Integer> l) {
		Iterator<Integer> it = l.iterator();
		System.out.println();
		while (it.hasNext()) {
			Integer num = it.next();
			System.out.println(num);
		}
	}
	
	
	public static void main(String[] args)  {
		
		UnorderedDoubleLinkedList<Integer> l = new UnorderedDoubleLinkedList<Integer>();
		l.addToRear(1);
		l.addToRear(3);
		l.addToRear(6);
		l.addToRear(7);
		l.addToRear(9);
		l.addToRear(0);
		l.addToRear(20);
		l.addToFront(8);
		l.remove(new Integer(7));

		
		System.out.print("Lista ...............");
		visualizarNodos(l);
		System.out.println("Num elementos: " + l.size());


		System.out.println("Prueba Find ...............");
		System.out.println("9? " + l.find(9));
		System.out.println("0? " + l.find(0));
		System.out.println("7? " + l.find(7));
        System.out.println("2? " + l.find (2)) ;
        System.out.println("Last? " + l.last()) ;
        System.out.println("First? " + l.first()) ;
        System.out.println("Second? " + l.last.next.next.data) ;
        System.out.println("Last? " + l.last.next.prev.data);
        System.out.println();

        
        // Pruebas addToFront
        System.out.println("Prueba addToFront ...............");

        // Caso 1: addToFront en lista vacía
        System.out.println("Caso 1 - addToFront en lista vacía:");
        UnorderedDoubleLinkedList<Integer> l1 = new UnorderedDoubleLinkedList<Integer>();
        l1.addToFront(10);
        System.out.print("Lista después de addToFront(10): ");
        visualizarNodos(l1);
        System.out.println("First: " + l1.first());
        System.out.println("Last: " + l1.last());
        System.out.println("Size: " + l1.size());
        System.out.println();

        // Caso 2: addToFront en lista con un elemento
        System.out.println("Caso 2 - addToFront en lista con un elemento:");
        l1.addToFront(20);
        System.out.print("Lista después de addToFront(20): ");
        visualizarNodos(l1);
        System.out.println("First: " + l1.first());
        System.out.println("Last: " + l1.last());
        System.out.println("Size: " + l1.size());
        System.out.println();

        // Caso 3: addToFront en lista con múltiples elementos
        System.out.println("Caso 3 - addToFront en lista con múltiples elementos:");
        l1.addToFront(30);
        System.out.print("Lista después de addToFront(30): ");
        visualizarNodos(l1);
        System.out.println("First: " + l1.first());
        System.out.println("Last: " + l1.last());
        System.out.println("Size: " + l1.size());
        System.out.println();


        // Pruebas addToRear
        System.out.println("Prueba addToRear ...............");

        // Caso 1: addToRear en lista vacía
        System.out.println("Caso 1 - addToRear en lista vacía:");
        UnorderedDoubleLinkedList<Integer> l2 = new UnorderedDoubleLinkedList<Integer>();
        l2.addToRear(100);
        System.out.print("Lista después de addToRear(100): ");
        visualizarNodos(l2);
        System.out.println("First: " + l2.first());
        System.out.println("Last: " + l2.last());
        System.out.println("Size: " + l2.size());
        System.out.println();

        // Caso 2: addToRear en lista con un elemento
        System.out.println("Caso 2 - addToRear en lista con un elemento:");
        l2.addToRear(200);
        System.out.print("Lista después de addToRear(200): ");
        visualizarNodos(l2);
        System.out.println("First: " + l2.first());
        System.out.println("Last: " + l2.last());
        System.out.println("Size: " + l2.size());
        System.out.println();

        // Caso 3: addToRear en lista con múltiples elementos
        System.out.println("Caso 3 - addToRear en lista con múltiples elementos:");
        l2.addToRear(300);
        System.out.print("Lista después de addToRear(300): ");
        visualizarNodos(l2);
        System.out.println("First: " + l2.first());
        System.out.println("Last: " + l2.last());
        System.out.println("Size: " + l2.size());
        System.out.println();


        // Prueba addAfter
        System.out.println("Prueba addAfter ...............");

        // Caso 1: addAfter en lista vacía (no debería hacer nada)
        System.out.println("Caso 1 - addAfter en lista vacía:");
        UnorderedDoubleLinkedList<Integer> l3 = new UnorderedDoubleLinkedList<Integer>();
        l3.addAfter(50, 10);
        System.out.print("Lista después de addAfter(50, 10) en vacía: ");
        visualizarNodos(l3);
        System.out.println("Size: " + l3.size());
        System.out.println();

        // Caso 2: addAfter en lista con un elemento (target existe)
        System.out.println("Caso 2 - addAfter en lista con un elemento (target existe):");
        l3.addToRear(10);
        l3.addAfter(20, 10);
        System.out.print("Lista después de addAfter(20, 10): ");
        visualizarNodos(l3);
        System.out.println("First: " + l3.first());
        System.out.println("Last: " + l3.last());
        System.out.println("Size: " + l3.size());
        System.out.println();

        // Caso 3: addAfter en lista con un elemento (target no existe)
        System.out.println("Caso 3 - addAfter en lista con un elemento (target no existe):");
        l3.addAfter(30, 99);
        System.out.print("Lista después de addAfter(30, 99): ");
        visualizarNodos(l3);
        System.out.println("Size: " + l3.size());
        System.out.println();

        // Caso 4: addAfter en medio de la lista
        System.out.println("Caso 4 - addAfter en medio de la lista:");
        l3.addToRear(40);
        l3.addAfter(35, 20);
        System.out.print("Lista después de addAfter(35, 20): ");
        visualizarNodos(l3);
        System.out.println("Size: " + l3.size());
        System.out.println();

        // Caso 5: addAfter después del último elemento
        System.out.println("Caso 5 - addAfter después del último elemento:");
        l3.addAfter(50, 40);
        System.out.print("Lista después de addAfter(50, 40): ");
        visualizarNodos(l3);
        System.out.println("Last: " + l3.last());
        System.out.println("Size: " + l3.size());
        System.out.println();


        // Prueba removeFirst
        System.out.println("Prueba removeFirst ...............");

        // Caso 1: removeFirst en lista vacía
        System.out.println("Caso 1 - removeFirst en lista vacía:");
        UnorderedDoubleLinkedList<Integer> l4 = new UnorderedDoubleLinkedList<Integer>();
        Integer result1 = l4.removeFirst();
        System.out.println("Resultado: " + result1);
        System.out.println("Size: " + l4.size());
        System.out.println();

        // Caso 2: removeFirst en lista con un elemento
        System.out.println("Caso 2 - removeFirst en lista con un elemento:");
        l4.addToRear(100);
        Integer result2 = l4.removeFirst();
        System.out.println("Resultado: " + result2);
        System.out.println("Size: " + l4.size());
        System.out.println("isEmpty: " + l4.isEmpty());
        System.out.println();

        // Caso 3: removeFirst en lista con múltiples elementos
        System.out.println("Caso 3 - removeFirst en lista con múltiples elementos:");
        l4.addToRear(200);
        l4.addToRear(300);
        l4.addToRear(400);
        Integer result3 = l4.removeFirst();
        System.out.println("Resultado: " + result3);
        System.out.print("Lista después de removeFirst: ");
        visualizarNodos(l4);
        System.out.println("First: " + l4.first());
        System.out.println("Size: " + l4.size());
        System.out.println();


        // Prueba removeLast
        System.out.println("Prueba removeLast ...............");

        // Caso 1: removeLast en lista vacía
        System.out.println("Caso 1 - removeLast en lista vacía:");
        UnorderedDoubleLinkedList<Integer> l5 = new UnorderedDoubleLinkedList<Integer>();
        Integer result4 = l5.removeLast();
        System.out.println("Resultado: " + result4);
        System.out.println("Size: " + l5.size());
        System.out.println();

        // Caso 2: removeLast en lista con un elemento
        System.out.println("Caso 2 - removeLast en lista con un elemento:");
        l5.addToRear(500);
        Integer result5 = l5.removeLast();
        System.out.println("Resultado: " + result5);
        System.out.println("Size: " + l5.size());
        System.out.println("isEmpty: " + l5.isEmpty());
        System.out.println();

        // Caso 3: removeLast en lista con múltiples elementos
        System.out.println("Caso 3 - removeLast en lista con múltiples elementos:");
        l5.addToRear(600);
        l5.addToRear(700);
        l5.addToRear(800);
        Integer result6 = l5.removeLast();
        System.out.println("Resultado: " + result6);
        System.out.print("Lista después de removeLast: ");
        visualizarNodos(l5);
        System.out.println("Last: " + l5.last());
        System.out.println("Size: " + l5.size());
        System.out.println();


        // Prueba remove
        System.out.println("Prueba remove ...............");

        // Caso 1: remove en lista vacía
        System.out.println("Caso 1 - remove en lista vacía:");
        UnorderedDoubleLinkedList<Integer> l6 = new UnorderedDoubleLinkedList<Integer>();
        Integer result7 = l6.remove(100);
        System.out.println("Resultado: " + result7);
        System.out.println();

        // Caso 2: remove primer elemento
        System.out.println("Caso 2 - remove primer elemento:");
        l6.addToRear(100);
        l6.addToRear(200);
        l6.addToRear(300);
        Integer result8 = l6.remove(100);
        System.out.println("Resultado: " + result8);
        System.out.print("Lista después de remove(100): ");
        visualizarNodos(l6);
        System.out.println("First: " + l6.first());
        System.out.println("Size: " + l6.size());
        System.out.println();

        // Caso 3: remove elemento del medio
        System.out.println("Caso 3 - remove elemento del medio:");
        Integer result9 = l6.remove(200);
        System.out.println("Resultado: " + result9);
        System.out.print("Lista después de remove(200): ");
        visualizarNodos(l6);
        System.out.println("Size: " + l6.size());
        System.out.println();

        // Caso 4: remove último elemento
        System.out.println("Caso 4 - remove último elemento:");
        Integer result10 = l6.remove(300);
        System.out.println("Resultado: " + result10);
        System.out.print("Lista después de remove(300): ");
        visualizarNodos(l6);
        System.out.println("Size: " + l6.size());
        System.out.println("isEmpty: " + l6.isEmpty());
        System.out.println();

        // Caso 5: remove elemento no existente
        System.out.println("Caso 5 - remove elemento no existente:");
        l6.addToRear(400);
        Integer result11 = l6.remove(999);
        System.out.println("Resultado: " + result11);
        System.out.print("Lista después de remove(999): ");
        visualizarNodos(l6);
        System.out.println("Size: " + l6.size());
        System.out.println();


        // Prueba removeAll
        System.out.println("Prueba removeAll ...............");

        // Caso 1: removeAll en lista vacía
        System.out.println("Caso 1 - removeAll en lista vacía:");
        UnorderedDoubleLinkedList<Integer> l7 = new UnorderedDoubleLinkedList<Integer>();
        l7.removeAll(1);
        System.out.print("Lista después de removeAll(1) en vacía: ");
        visualizarNodos(l7);
        System.out.println("Size: " + l7.size());
        System.out.println();

        // Caso 2: removeAll con un elemento (que existe)
        System.out.println("Caso 2 - removeAll con un elemento (que existe):");
        l7.addToRear(1);
        l7.removeAll(1);
        System.out.print("Lista después de removeAll(1): ");
        visualizarNodos(l7);
        System.out.println("Size: " + l7.size());
        System.out.println("isEmpty: " + l7.isEmpty());
        System.out.println();

        // Caso 3: removeAll con múltiples ocurrencias
        System.out.println("Caso 3 - removeAll con múltiples ocurrencias:");
        l7.addToRear(1);
        l7.addToRear(2);
        l7.addToRear(1);
        l7.addToRear(3);
        l7.addToRear(1);
        l7.addToRear(4);
        l7.addToRear(1);
        System.out.print("Lista original: ");
        visualizarNodos(l7);
        l7.removeAll(1);
        System.out.print("Lista después de removeAll(1): ");
        visualizarNodos(l7);
        System.out.println("Size: " + l7.size());
        System.out.println();

        // Caso 4: removeAll elemento no existente
        System.out.println("Caso 4 - removeAll elemento no existente:");
        l7.removeAll(99);
        System.out.print("Lista después de removeAll(99): ");
        visualizarNodos(l7);
        System.out.println("Size: " + l7.size());
        System.out.println();


        // Prueba first
        System.out.println("Prueba first ...............");

        // Caso 1: first en lista vacía
        System.out.println("Caso 1 - first en lista vacía:");
        UnorderedDoubleLinkedList<Integer> l8 = new UnorderedDoubleLinkedList<Integer>();
        Integer first1 = l8.first();
        System.out.println("Resultado: " + first1);
        System.out.println();

        // Caso 2: first en lista con un elemento
        System.out.println("Caso 2 - first en lista con un elemento:");
        l8.addToRear(1000);
        Integer first2 = l8.first();
        System.out.println("Resultado: " + first2);
        System.out.println();

        // Caso 3: first en lista con múltiples elementos
        System.out.println("Caso 3 - first en lista con múltiples elementos:");
        l8.addToFront(900);
        Integer first3 = l8.first();
        System.out.println("Resultado: " + first3);
        System.out.println();


        // Prueba last
        System.out.println("Prueba last ...............");

        // Caso 1: last en lista vacía
        System.out.println("Caso 1 - last en lista vacía:");
        UnorderedDoubleLinkedList<Integer> l9 = new UnorderedDoubleLinkedList<Integer>();
        Integer last1 = l9.last();
        System.out.println("Resultado: " + last1);
        System.out.println();

        // Caso 2: last en lista con un elemento
        System.out.println("Caso 2 - last en lista con un elemento:");
        l9.addToRear(2000);
        Integer last2 = l9.last();
        System.out.println("Resultado: " + last2);
        System.out.println();

        // Caso 3: last en lista con múltiples elementos
        System.out.println("Caso 3 - last en lista con múltiples elementos:");
        l9.addToRear(3000);
        Integer last3 = l9.last();
        System.out.println("Resultado: " + last3);
        System.out.println();


        // Prueba contains
        System.out.println("Prueba contains ...............");

        // Caso 1: contains en lista vacía
        System.out.println("Caso 1 - contains en lista vacía:");
        UnorderedDoubleLinkedList<Integer> l10 = new UnorderedDoubleLinkedList<Integer>();
        boolean contains1 = l10.contains(100);
        System.out.println("contains(100): " + contains1);
        System.out.println();

        // Caso 2: contains elemento existente (primer elemento)
        System.out.println("Caso 2 - contains elemento existente (primer elemento):");
        l10.addToRear(100);
        l10.addToRear(200);
        l10.addToRear(300);
        boolean contains2 = l10.contains(100);
        System.out.println("contains(100): " + contains2);
        System.out.println();

        // Caso 3: contains elemento existente (elemento del medio)
        System.out.println("Caso 3 - contains elemento existente (elemento del medio):");
        boolean contains3 = l10.contains(200);
        System.out.println("contains(200): " + contains3);
        System.out.println();

        // Caso 4: contains elemento existente (último elemento)
        System.out.println("Caso 4 - contains elemento existente (último elemento):");
        boolean contains4 = l10.contains(300);
        System.out.println("contains(300): " + contains4);
        System.out.println();

        // Caso 5: contains elemento no existente
        System.out.println("Caso 5 - contains elemento no existente:");
        boolean contains5 = l10.contains(999);
        System.out.println("contains(999): " + contains5);
        System.out.println();


        // Prueba find()
        System.out.println("Prueba find ...............");

        // Caso 1: find en lista vacía
        System.out.println("Caso 1 - find en lista vacía:");
        UnorderedDoubleLinkedList<Integer> l11 = new UnorderedDoubleLinkedList<Integer>();
        Integer find1 = l11.find(100);
        System.out.println("find(100): " + find1);
        System.out.println();

        // Caso 2: find elemento existente
        System.out.println("Caso 2 - find elemento existente:");
        l11.addToRear(100);
        l11.addToRear(200);
        l11.addToRear(300);
        Integer find2 = l11.find(200);
        System.out.println("find(200): " + find2);
        System.out.println();

        // Caso 3: find elemento no existente
        System.out.println("Caso 3 - find elemento no existente:");
        Integer find3 = l11.find(999);
        System.out.println("find(999): " + find3);
        System.out.println();


        // Prueba clone
        System.out.println("Prueba clone ...............");

        // Caso 1: clone de lista vacía
        System.out.println("Caso 1 - clone de lista vacía:");
        UnorderedDoubleLinkedList<Integer> l12 = new UnorderedDoubleLinkedList<Integer>();
        UnorderedDoubleLinkedList<Integer> l13 = l12.clone();
        System.out.print("Original (vacía): ");
        visualizarNodos(l12);
        System.out.print("Clon (vacía): ");
        visualizarNodos(l13);
        System.out.println("Original isEmpty: " + l12.isEmpty());
        System.out.println("Clon isEmpty: " + l13.isEmpty());
        System.out.println();

        // Caso 2: clone de lista con elementos
        System.out.println("Caso 2 - clone de lista con elementos:");
        l12.addToRear(1);
        l12.addToRear(2);
        l12.addToRear(3);
        UnorderedDoubleLinkedList<Integer> l14 = l12.clone();
        System.out.print("Original: ");
        visualizarNodos(l12);
        System.out.print("Clon: ");
        visualizarNodos(l14);
        System.out.println("Original size: " + l12.size());
        System.out.println("Clon size: " + l14.size());
        System.out.println();

        // Caso 3: Verificar independencia del clon
        System.out.println("Caso 3 - Verificar independencia del clon:");
        l12.removeFirst(); // Modificar original
        l14.addToRear(4);  // Modificar clon
        System.out.print("Original después de removeFirst(): ");
        visualizarNodos(l12);
        System.out.print("Clon después de addToRear(4): ");
        visualizarNodos(l14);
        System.out.println("Original size: " + l12.size());
        System.out.println("Clon size: " + l14.size());
        System.out.println();


        // Prueba isEmpty
        System.out.println("Prueba isEmpty ...............");

        // Caso 1: isEmpty en lista vacía
        System.out.println("Caso 1 - isEmpty en lista vacía:");
        UnorderedDoubleLinkedList<Integer> l15 = new UnorderedDoubleLinkedList<Integer>();
        boolean empty1 = l15.isEmpty();
        System.out.println("isEmpty(): " + empty1);
        System.out.println();

        // Caso 2: isEmpty en lista con elementos
        System.out.println("Caso 2 - isEmpty en lista con elementos:");
        l15.addToRear(100);
        boolean empty2 = l15.isEmpty();
        System.out.println("isEmpty(): " + empty2);
        System.out.println();

        // Caso 3: isEmpty después de removeAll
        System.out.println("Caso 3 - isEmpty después de removeAll:");
        l15.removeAll(100);
        boolean empty3 = l15.isEmpty();
        System.out.println("isEmpty() después de removeAll: " + empty3);
        System.out.println();


        // Prueba size
        System.out.println("Prueba size ...............");

        // Caso 1: size en lista vacía
        System.out.println("Caso 1 - size en lista vacía:");
        UnorderedDoubleLinkedList<Integer> l16 = new UnorderedDoubleLinkedList<Integer>();
        int size1 = l16.size();
        System.out.println("size(): " + size1);
        System.out.println();

        // Caso 2: size después de addToFront
        System.out.println("Caso 2 - size después de addToFront:");
        l16.addToFront(1);
        l16.addToFront(2);
        int size2 = l16.size();
        System.out.println("size() después de 2 addToFront: " + size2);
        System.out.println();

        // Caso 3: size después de remove
        System.out.println("Caso 3 - size después de remove:");
        l16.remove(1);
        int size3 = l16.size();
        System.out.println("size() después de remove: " + size3);
        System.out.println();


        // Prueba iterator
        System.out.println("Prueba iterator ...............");

        // Caso 1: iterator en lista vacía
        System.out.println("Caso 1 - iterator en lista vacía:");
        UnorderedDoubleLinkedList<Integer> l17 = new UnorderedDoubleLinkedList<Integer>();
        Iterator<Integer> it1 = l17.iterator();
        System.out.println("hasNext() en lista vacía: " + it1.hasNext());
        System.out.println();

        // Caso 2: iterator en lista con elementos
        System.out.println("Caso 2 - iterator en lista con elementos:");
        l17.addToRear(10);
        l17.addToRear(20);
        l17.addToRear(30);
        Iterator<Integer> it2 = l17.iterator();
        System.out.println("Recorrido con iterator:");
        while (it2.hasNext()) {
            System.out.println("Elemento: " + it2.next());
        }
        System.out.println();

        // Caso 3: iterator después de modificar lista
        System.out.println("Caso 3 - iterator después de modificar lista:");
        l17.removeFirst();
        Iterator<Integer> it3 = l17.iterator();
        System.out.println("Recorrido después de removeFirst:");
        while (it3.hasNext()) {
            System.out.println("Elemento: " + it3.next());
        }
        System.out.println();
    }
}
