package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("/Users/yannickdubreuil/Desktop/6 - Java objet/J7 - autoformation/recensement.csv");
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		ArrayList<Ville> villes = new ArrayList<>();
		
		for(String line : lines) { // Parcours des lignes du fichier recensement.csv
			
			if (line.equals(lines.get(0))) { // On saute l'entête du fichier (la légende)
				continue;
			}
		
			// On commence par découper la ligne en morceaux sur la base du caractère séparateur « ; »
			// De plus on ne récupère que les morceaux qui nous intéressent
			// En l’occurrence on ignore les morceaux 3 et 4 dont on a pas besoin dans le TP
			String[] morceaux = line.split(";");
			String codeRegion = morceaux[0];
			String nomRegion = morceaux[1];
			String codeDepartement = morceaux[2];
			String codeCommune = morceaux[5];
			String nomCommune = morceaux[6];
			String population = morceaux[7];

			// Pour la population, avant la conversion en int, il faut d’abord supprimer les espaces qui se trouvent à l’intérieur.
			int populationTotale = Integer.parseInt(population.replace(" ", "").trim());
			
			// On crée enfin la ville avec toutes les données utiles
			Ville ville = new Ville(Integer.parseInt(codeRegion.trim()), nomRegion, codeDepartement, Integer.parseInt(codeCommune.trim()), nomCommune, populationTotale);
			villes.add(ville);
			
		}
		// System.out.println(villes.size()); // Vérification du nombre total de villes ajoutées a notre ArrayList
		
		// Recherche dans la liste la ville de Montpellier et affiche toutes les informations la concernant
		for(Ville ville : villes) {
			if (ville.getNomCommune().equals("Montpellier")) {
				System.out.println("Montpellier : " + ville);
			}
		}
		
		// Exploite les données dont on dispose pour afficher la population de tout le département de l’Hérault
		int populationHerault = 0;
		for(Ville ville : villes) {
			if (ville.getCodeDepartement().equals("34")) {
				populationHerault += ville.getPopulationTotale();
			}
		}
		System.out.println("\nPopulation de tout le département de l'Hérault (34) : " + populationHerault);
		
		// Affiche la plus petite ville du département
		Ville villeLaPlusPetiteHerault = villes.get(0);
		for(Ville ville : villes) {
			if (ville.getCodeDepartement().equals("34") && ville.getPopulationTotale() < villeLaPlusPetiteHerault.getPopulationTotale()) {
				villeLaPlusPetiteHerault = ville;
			}
		}
		System.out.println("\nVille la plus petite de l'Hérault (34) : " + villeLaPlusPetiteHerault);
		
		// Affiche la population de toute la région Occitanie
		int populationOccitanie = 0;
		for(Ville ville : villes) {
			if (ville.getNomRegion().equals("Occitanie")) {
				//System.out.print(ville.getNomCommune() + " ");
				populationOccitanie += ville.getPopulationTotale();
			}
		}
		System.out.println("\nPopulation de toute la région Occitanie : " + populationOccitanie);
	}

}
