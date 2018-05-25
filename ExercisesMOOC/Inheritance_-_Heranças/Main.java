package Ficha2_ex2_eng;

public class Main {

	public static void main(String[] args) {
		System.out.println("========= Person ========");
		Person p1 = new Person("Hugo", "Elvas", "987654321");
		System.out.println(p1.toString());
		
		System.out.println("========= Provider1 ========");
		Provider f1 = new Provider("João", "Lisboa", "912345678", 200, 100);
		System.out.println(f1.toString());
		
		System.out.println("========= Employee1 ========");
		Employee e1 = new Employee("Jorge", "Santarém", "987654321", 10, 500, 13);
		System.out.println(e1.toString());
		System.out.println(e1.calculateSalary());
		
		System.out.println("========= Administrator1 ========");
		Administrator a1 = new Administrator("Mário", "Porto", "987654321", 1, 800, 15, 200);
		System.out.println(a1.toString());
		System.out.println(a1.calculateSalary());
		
		System.out.println("========= Worker1 ========");
		Worker o1 = new Worker("Joana", "Braga", "987654321", 10, 500, 13, 20, 30);
		System.out.println(o1.toString());
		System.out.println(o1.calculateSalary());
		
		System.out.println("========= Seller1 ========");
		Seller v1 = new Seller("Elias", "Faro", "987654321", 10, 500, 13, 20, 30);
		System.out.println(v1.toString());
		System.out.println(v1.calculateSalary());
		

	}

}
