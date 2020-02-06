package task_maven;

public class Chocolates extends Candy {

	Chocolates(String varientName, String manufacturer) {
		this.vName = varientName;
		this.mfacturer = manufacturer;
	}

	public void mygift() {
		System.out.println(" chocolate " + vName + "manufacturer " + mfacturer);
	}

}
