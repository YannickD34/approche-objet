package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {
	
	private double[] tab = new double[0];
	
	public void ajout(double nombre) {
		tab = Arrays.copyOf(tab, tab.length+1);
		tab[tab.length-1] = nombre;
	}
	
	public double calcul() {
		double somme = 0.0d;
		for (int i = 0; i < tab.length; i++) {
			somme += tab[i];
		}
		return somme / tab.length;
	}
	
	@Override
	public String toString() {
		return "CalculMoyenne tab=" + Arrays.toString(tab);
	}
	
	public double[] getTab() {
		return tab;
	}

	public void setTab(double[] tab) {
		this.tab = tab;
	}

}
