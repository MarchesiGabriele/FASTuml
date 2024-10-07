package converter;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class ConverterMain {

	private List<String> lines;

	ConverterMain(String filetxt) {
		String percorsoFile = "resources/" + filetxt; // Cambia con il percorso effettivo
		try {
			lines = Files.readAllLines(Paths.get(percorsoFile));
			lines.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
