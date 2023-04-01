package inheritance;

public class test {

	public static void main(String[] args) {
		Employee empl = new Employee();
//		Person prsn = new Person();
		Person prsn = new Person("jamal");
//		prsn.setAge(25);
		//when comment kicked, then will overwritten karim
//		prsn.setName("karim");
//		System.out.println(prsn.getAge());
		System.out.println(prsn.getName());
	}

}
