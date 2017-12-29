package pl.bockowsk;

public class Silownia {

	private Klient jakisGosc = new Cienias();

	void otwarcie() {
        jakisGosc.cwiczy();
    }

	public static void main(String[] args) {
		Silownia platinium=new Silownia();
		platinium.otwarcie();
	}
}