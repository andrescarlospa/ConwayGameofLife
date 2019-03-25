package oclc.codekata.gameoflife;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

/**
 * Utils
 * 
 * @author Andres Panamito
 *
 */
public class Util {

	/**
	 * Read file and build a Character Array
	 * @param file name
	 * @return data
	 */
	public static Character[][] loadStateData(String file) {
		Path path;
		try {
			path = Paths.get(Util.class.getClassLoader().getResource(file).toURI());
			Character[][] data = new Character[(int) Files.lines(path).count()][];
			Stream<String> lines = Files.lines(path);
			AtomicInteger counter = new AtomicInteger(0);
			lines.forEach(l->{
				data[counter.getAndIncrement()] = l.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
			});
			lines.close();
			return data;
		} catch (URISyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
