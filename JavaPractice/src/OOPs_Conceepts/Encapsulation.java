package OOPs_Conceepts;

public class Encapsulation {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

		Encapsulation enp = new Encapsulation();
		enp.setName("Narasimha");
		System.out.println(enp.getName());

	}

}
