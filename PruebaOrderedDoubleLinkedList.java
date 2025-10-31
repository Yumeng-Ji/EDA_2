public class PruebaOrderedDoubleLinkedList {
		
		public static void main(String[] args)  {
			
			OrderedDoubleLinkedList<Integer> l = new OrderedDoubleLinkedList<Integer>();
			l.add(1);
			l.add(3);
			l.add(6);
			l.add(7);
			l.add(9);
			l.add(0);
			l.add(20);
			l.remove(new Integer(7));

			
			System.out.print("Lista ...............");
			l.visualizarNodos();
			System.out.println("Num elementos: " + l.size());
            System.out.println();
			
			System.out.println("Prueba Find ...............");
			System.out.println("20? " + l.find(20));
			System.out.println("9? " + l.find(9));
			System.out.println("9? " + l.find(9));
			System.out.println("0? " + l.find(0));
			System.out.println("7? " + l.find(7));
            System.out.println();
			
			
			OrderedDoubleLinkedList<Persona> l2 = new OrderedDoubleLinkedList<Persona>();
			l2.add(new Persona("jon", "1111"));
			l2.add(new Persona("ana", "7777"));
			l2.add(new Persona("amaia", "3333"));
			l2.add(new Persona("unai", "8888"));
			l2.add(new Persona("pedro", "2222"));
			l2.add(new Persona("olatz", "5555"));

			l2.remove(new Persona("", "8888"));

			System.out.print("Lista l2 ...............");
			l2.visualizarNodos();
			System.out.println("Num elementos: " + l2.size());
            System.out.println();
			
			System.out.println("Prueba Find ...............");
			System.out.println("2222? " + l2.find(new Persona("", "2222")));
			System.out.println("5555? " + l2.find(new Persona("", "5555")));
			System.out.println("7777? " + l2.find(new Persona("", "7777")));	
			System.out.println("8888? " + l2.find(new Persona("", "8888")));
            System.out.println();

            // PRUEBAS DE INTERSECCIÓN

            // Caso 1: Intersección normal con elementos comunes
            OrderedDoubleLinkedList<Persona> l3 = new OrderedDoubleLinkedList<Persona>();
            l3.add(new Persona("olaf", "1111"));
            l3.add(new Persona("ana", "7723"));
            l3.add(new Persona("pedro", "2222"));
            l3.add(new Persona("unai", "8888"));
            l3.add(new Persona("pablo", "2232"));
            l3.add(new Persona("olatz", "5555"));
            System.out.print("Lista l3 ...............");
            l3.visualizarNodos();
            System.out.println("Num elementos: " + l3.size());
            System.out.println();

            System.out.println("Caso 1 - Intersección l2 ∩ l3 (elementos comunes):");
            l2.intersection(l3).visualizarNodos();
            System.out.println("Num elementos: " + l2.intersection(l3).size());
            System.out.println();

            // Caso 2: Intersección con lista vacía
            OrderedDoubleLinkedList<Persona> l4 = new OrderedDoubleLinkedList<Persona>();
            System.out.println("Caso 2 - Intersección l3 ∩ l4 (lista vacía):");
            System.out.print("Lista l4 ...............");
            l4.visualizarNodos();
            l3.intersection(l4).visualizarNodos();
            System.out.println("Num elementos: " + l3.intersection(l4).size());
            System.out.println();

            // Caso 3: Intersección de dos listas vacías
            OrderedDoubleLinkedList<Persona> l5 = new OrderedDoubleLinkedList<Persona>();
            System.out.println("Caso 3 - Intersección l5 ∩ l4 (ambas vacías):");
            System.out.print("Lista l5 ...............");
            l5.visualizarNodos();
            l5.intersection(l4).visualizarNodos();
            System.out.println("Num elementos: " + l5.intersection(l4).size());
            System.out.println();

            // Caso 4: Intersección con un solo elemento común
            OrderedDoubleLinkedList<Persona> l6 = new OrderedDoubleLinkedList<Persona>();
            l6.add(new Persona("olatz","5555"));
            System.out.print("Lista l6 ...............");
            l6.visualizarNodos();
            System.out.println("Caso 4 - Intersección l3 ∩ l6 (un elemento común):");
            l3.intersection(l6).visualizarNodos();
            System.out.println("Num elementos: " + l3.intersection(l6).size());
            System.out.println();

            // Caso 5: Intersección con otro elemento común
            OrderedDoubleLinkedList<Persona> l7 = new OrderedDoubleLinkedList<Persona>();
            l7.add(new Persona("pedro","2222"));
            System.out.print("Lista l7 ...............");
            l7.visualizarNodos();
            System.out.println("Caso 5 - Intersección l3 ∩ l7 (un elemento común):");
            l3.intersection(l7).visualizarNodos();
            System.out.println("Num elementos: " + l3.intersection(l7).size());
            System.out.println();

            // Caso 6: Intersección sin elementos comunes
            OrderedDoubleLinkedList<Persona> l8 = new OrderedDoubleLinkedList<Persona>();
            l8.add(new Persona("maria", "9999"));
            l8.add(new Persona("carlos", "4444"));
            System.out.print("Lista l8 ...............");
            l8.visualizarNodos();
            System.out.println("Caso 6 - Intersección l2 ∩ l8 (sin elementos comunes):");
            l2.intersection(l8).visualizarNodos();
            System.out.println("Num elementos: " + l2.intersection(l8).size());
            System.out.println();

            // Caso 7: Intersección consigo misma (debería devolver todos los elementos)
            System.out.println("Caso 7 - Intersección l2 ∩ l2 (misma lista):");
            l2.intersection(l2).visualizarNodos();
            System.out.println("Num elementos: " + l2.intersection(l2).size());
            System.out.println();

            // Caso 8: Intersección con subconjunto
            OrderedDoubleLinkedList<Persona> l9 = new OrderedDoubleLinkedList<Persona>();
            l9.add(new Persona("pedro", "2222"));
            l9.add(new Persona("olatz", "5555"));
            l9.add(new Persona("amaia", "3333"));
            System.out.print("Lista l9 ...............");
            l9.visualizarNodos();
            System.out.println("Caso 8 - Intersección l2 ∩ l9 (subconjunto):");
            l2.intersection(l9).visualizarNodos();
            System.out.println("Num elementos: " + l2.intersection(l9).size());
            System.out.println();

            // Caso 9: Intersección con Integer (para probar otro tipo de dato)
            OrderedDoubleLinkedList<Integer> l10 = new OrderedDoubleLinkedList<Integer>();
            l10.add(1);
            l10.add(3);
            l10.add(5);
            l10.add(7);

            OrderedDoubleLinkedList<Integer> l11 = new OrderedDoubleLinkedList<Integer>();
            l11.add(2);
            l11.add(3);
            l11.add(6);
            l11.add(7);

            System.out.println("Caso 9 - Intersección con Integer:");
            System.out.print("Lista l10 ...............");
            l10.visualizarNodos();
            System.out.print("Lista l11 ...............");
            l11.visualizarNodos();
            System.out.print("Intersección l10 ∩ l11: ");
            System.out.println();
            l10.intersection(l11).visualizarNodos();
            System.out.println("Num elementos: " + l10.intersection(l11).size());
        }
}


