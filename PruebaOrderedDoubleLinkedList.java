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
            l.add(4);
            l.add(3);
			l.remove(new Integer(7));

			
			System.out.print(" Lista ...............");
			l.visualizarNodos();
			System.out.println(" Num elementos: " + l.size());
					
			
			System.out.println("Prueba Find ...............");
			System.out.println("20? " + l.find(20));
			System.out.println("9? " + l.find(9));
			System.out.println("9? " + l.find(9));
			System.out.println("0? " + l.find(0));
			System.out.println("7? " + l.find(7));
			
			
			
			OrderedDoubleLinkedList<Persona> l2 = new OrderedDoubleLinkedList<Persona>();
			l2.add(new Persona("jon", "1111"));
			l2.add(new Persona("ana", "7777"));
			l2.add(new Persona("amaia", "3333"));
			l2.add(new Persona("unai", "8888"));
			l2.add(new Persona("pedro", "2222"));
			l2.add(new Persona("olatz", "5555"));

			l2.remove(new Persona("", "8888"));

			
			System.out.print(" Lista ...............");
			l2.visualizarNodos();
			System.out.println(" Num elementos: " + l2.size());
					
			
			System.out.println("Prueba Find ...............");
			System.out.println("2222? " + l2.find(new Persona("", "2222")));
			System.out.println("5555? " + l2.find(new Persona("", "5555")));
			System.out.println("7777? " + l2.find(new Persona("", "7777")));
			System.out.println("8888? " + l2.find(new Persona("", "8888")));

            OrderedDoubleLinkedList<Persona> l3 = new OrderedDoubleLinkedList<Persona>();
            l3.add(new Persona("olaf", "1111"));
            l3.add(new Persona("ana", "7723"));
            l3.add(new Persona("pedro", "2222"));
            l3.add(new Persona("unai", "8888"));
            l3.add(new Persona("pablo", "2232"));
            l3.add(new Persona("olatz", "5555"));
            System.out.print(" Lista ...............");
            l3.visualizarNodos();
            System.out.println(" Num elementos: " + l3.size());

            System.out.println("Intersection...............");
            l2.intersection(l3).visualizarNodos();



            OrderedDoubleLinkedList<Persona> l4 = new OrderedDoubleLinkedList<Persona>();
            System.out.println("Intersection...............");
            l3.intersection(l4).visualizarNodos();

            OrderedDoubleLinkedList<Persona> l5 = new OrderedDoubleLinkedList<Persona>();
            System.out.println("Intersection...............");
            l5.intersection(l4).visualizarNodos();

            OrderedDoubleLinkedList<Persona> l6 = new OrderedDoubleLinkedList<Persona>();
            l6.add(new Persona("olatz","5555"));
            System.out.println("Intersection...............");
            l3.intersection(l6).visualizarNodos();


            OrderedDoubleLinkedList<Persona> l7 = new OrderedDoubleLinkedList<Persona>();
            l7.add(new Persona("pedro","2222"));
            System.out.println("Intersection...............");
            l3.intersection(l7).visualizarNodos();
            System.out.println(" Num elementos: " + l3.intersection(l7).size());

        }
	}


