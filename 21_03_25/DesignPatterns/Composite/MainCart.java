package Composite;

public class MainCart {
    private static final Prodotto cart = Creator.getCarrello();
	private static final Prodotto lib = Creator.getLibro();
	private static final Prodotto eb = Creator.getEbook();

	public static void main(final String[] args) {
		System.out.println("\nChiama print su lib");
		lib.print();
		System.out.println("Peso di lib " + lib.getPeso());

		System.out.println("\nInserimento di Libri in Carrello");
		cart.add(lib);
		cart.add(eb);

		System.out.println("\n");
		cart.print();
		System.out.println("\nPeso del Carrello " + cart.getPeso());
	}
}
