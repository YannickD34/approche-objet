package fr.diginamic.entites;

public class Cercle {
	
	private double rayon;

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}
	
	public double calculPerimetre() {
		return Math.PI * rayon * 2;
	}
	
	public double calculSurface() {
		return Math.PI * rayon * rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

}
