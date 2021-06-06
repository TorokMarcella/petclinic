package petDoctor.FajlMuveletek;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class FajlBeolvas {
	
	// FÁJLBEOLVASÁS
		private static final String PATH = ".csv";		//	csv útvonal
		
		private static List<String> readFile(){
			try {
				Path path = Paths.get(PATH);
				List<String> rows = Files.readAllLines(path, Charset.forName("UTF-8"));
			}catch(IOException e){
				System.out.println("Hiba történt a fájl olvasása közben! " + e.getMessage());
		}
			return Collections.EMPTY_LIST;
		}

}
