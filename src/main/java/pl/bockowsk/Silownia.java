package pl.bockowsk;

import javax.inject.Inject;
import javax.inject.Named;


public class Silownia {

	@Inject
	@Named("Koks")
	private Klient jakisGosc;

	void otwarcie() {
        jakisGosc.cwiczy();
    }

	public static void main(String[] args) {
		Silownia platinium=new Silownia();
		platinium.otwarcie();
	}
}