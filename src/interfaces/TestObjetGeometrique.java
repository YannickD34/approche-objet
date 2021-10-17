package interfaces;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		
		ObjetGeometrique[] objetsGeometriques = new ObjetGeometrique[2];
		objetsGeometriques[0] = new Cercle(5.0d);
		objetsGeometriques[1] = new Rectangle(5.0d, 10.0d);
		
		for (int i = 0; i < objetsGeometriques.length; i++) {
			System.out.println("Périmètre : " + objetsGeometriques[i].perimetre());
			System.out.println("Surface   : " + objetsGeometriques[i].surface() + "\n");
		}

	}

}
