package fr.diginamic.maison;

public class Chambre extends Piece {

	public Chambre(double superficie, int etage) {
		super(superficie, etage);
	}
	
	@Override
	public String toString() {
		return "Chambre";
	}
	
	@Override
	public String getType() {
		return "Chambre";
	}
	
	

}
