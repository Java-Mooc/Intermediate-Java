package Ficha_de_Demonstração_n1_Ex3_eng;

public class Main {

	public static void main(String[] args) {

		// Stand creation
		Stand s1;
		Stand s2;
		
		System.out.println("Step 1");
		s1 = new Stand();
		s1.setName("Stand1");
		System.out.println(s1.toString());
		Car c1 = new Car("CC-11-11","Available");
		Car c2 = new Car("CC-22-22","Available");
		Fleet f1 = new Fleet(c1,c2);
		s1.setFleet(f1);
		System.out.println(s1.toString());
		
		System.out.println("\nStep 2");
		s2 = new Stand(s1);
		System.out.println(s2.toString());
		s2.setName("Stand2");
		
		System.out.println("\nStep 3");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
		System.out.println("\nStep 4");
		s1.getFleet().get(0).setState("Rented");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
		System.out.println("\nStep 5");
		s2.rent(1);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
		System.out.println("\nStep 6");
		s1.returnCar(0);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
		System.out.println("How many available in Stand1: " + s1.howManyAvailable());
		System.out.println("How many available in Stand2: " + s2.howManyAvailable());

	}

}
