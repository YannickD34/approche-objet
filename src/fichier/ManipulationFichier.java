package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ManipulationFichier {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("/Users/yannickdubreuil/Desktop/6 - Java objet/J7 - autoformation/recensement.csv");
		
		Path pathDestination = Paths.get("/Users/yannickdubreuil/Desktop/6 - Java objet/J7 - autoformation/recensement2.csv");
		if(Files.exists(pathDestination)) { // Si le fichier existe déjà on le détruit pour le recréer ensuite (vide)
			Files.delete(pathDestination);
		}
		Files.createFile(pathDestination);
		Files.writeString(pathDestination, "Nom de la commune;Code commune;Population totale;\n", StandardCharsets.UTF_8, StandardOpenOption.APPEND);

		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

		for(String line : lines) { // On parcourt notre fichier d'origine ligne par ligne
			if (line.equals(lines.get(0))) { // Sauf la première ligne qui est la légende
				continue;
			}
			String[] elements = line.split(";"); // On découpe notre ligne par éléments séparés par des ;
			String population = elements[9].trim().replace(" ", ""); // On enlève l'espace dans la population
			int pop = Integer.parseInt(population);  // On transforme la population en int pour pouvoir le comparer avec 25k
			if (pop > 25000) {
				//System.out.println("Nom de la ville : " + elements[6] + " - Code du département : " + elements[2] + " - Population totale : " + elements[9]);
				Files.writeString(pathDestination, elements[6] + ";" + elements[2] + ";" + elements[9] + ";\n", StandardCharsets.UTF_8, StandardOpenOption.APPEND);
				// On ajoute dans le fichier de destination les informations souhaitées séparées de ; pour coller au format csv
			}
			
		}
		
	}

}
