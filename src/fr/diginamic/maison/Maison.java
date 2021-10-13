package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {
	
	private Piece[] pieces;
	
	public Maison(Piece[] pieces) {
		super();
		this.pieces = pieces;
	}

	public void ajouterPiece(Piece piece) {
		if (piece != null && piece.getSuperficie() > 0 && piece.getEtage() >= 0) {
			pieces = Arrays.copyOf(pieces, pieces.length+1);
			pieces[pieces.length-1] = piece;
		}
	}
	
	public double superficieTotale() {
		double res = 0.0d;
		for (int i = 0; i < pieces.length; i++) {
			res += pieces[i].getSuperficie();
		}
		return res;
	}
	
	public double superficieEtage(int etage) {
		double res = 0.0d;
		for (int i = 0; i < pieces.length; i++) {
			if (pieces[i].getEtage() == etage) {
				res += pieces[i].getSuperficie();
			}
		}
		return res;
	}
	
	public double superficiePieceDonnee(String piece) {
		double res = 0.0d;
		for (int i = 0; i < pieces.length; i++) {
			if (pieces[i].getType().equals(piece)) {
				res += pieces[i].getSuperficie();
			}
		}
		return res;
	}
	
	public int nombreDePieces(String piece) {
		int res = 0;
		for (int i = 0; i < pieces.length; i++) {
			if (pieces[i].getType().equals(piece)) {
				res++;
			}
		}
		return res;
	}

	@Override
	public String toString() {
		return "Maison [pieces=" + Arrays.toString(pieces) + "]";
	}

	public Piece[] getPieces() {
		return pieces;
	}

	public void setPieces(Piece[] pieces) {
		this.pieces = pieces;
	}

}
