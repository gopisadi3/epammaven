package mavenexample;

public class Chocolates extends Candies {

	Chocolates(String varientName, String manufacturer) {
		this.vName = varientName;
		this.mfacturer = manufacturer;
	}

	public void mygift() {
		System.out.println( vName );
		System.out.println(  mfacturer);
	}

}
