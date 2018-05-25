package Demo_Polimorfismo_eng;

public class Main {

	public static void main(String[] args) {
		System.out.println("============ Case 1 ============");
		case1();
		System.out.println("============ Case 2 ============");
		case2();
		//System.out.println("============ Caso 3 ============");
		//caso3();
		System.out.println("============ Case 4 ============");
		case4();
		System.out.println("============ Case 5 ============");
		case5();

	}

	public static void case1() {
		
		ClassA a = new ClassA(); 
		System.out.println(a.getA()); 
		a = new ClassB();
		System.out.println(a.getA());
		a = new ClassC(); 
		System.out.println(a.getA());
	}

	public static void case2() {
		ClassA a = new ClassB();
		
		System.out.println(((ClassB) a).getB());
	}

	public static void case3() {
		ClassA a = new ClassD();
		//Downcast
		System.out.println(((ClassB) a).getB());
	}	
	
	public static void case4() {
		ClassA a = new ClassB(); 
		ClassB b = (ClassB) a;
		System.out.println(b.getB());
	}
	
	public static void case5() {
		//Upcasting
		System.out.println(((ClassA)(new ClassB())).getA());
				
	}

}
