package fr.diginamic.maison;

public class Wc extends Piece {

	public Wc(double superficie, int etage) {
		super(superficie, etage);
	}
	
	@Override
	public String toString() {
		return "Wc";
	}

	@Override
	public String getType() {
		return "Wc";
	}

}
