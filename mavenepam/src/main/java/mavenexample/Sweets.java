package mavenexample;

public class Sweets extends Candy {

	Sweets(String varientName, String manufacturer) {
		this.vName = vName;
		this.mfacturer = mfacturer;
	}

	public void mygift() {
		System.out.println("sweet" + vName + "manufacturere" + mfacturer);
	}

}
