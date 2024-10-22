package converter;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class ConverterMain {

	private List<String> linesInput;
	private List<String> linesOutput;

	ConverterMain(String filetxt) {
		String percorsoFile = "resources/" + filetxt; // Cambia con il percorso effettivo
		try {
			linesInput = Files.readAllLines(Paths.get(percorsoFile));
			//lines.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//generazione delle classi
	
	
}
