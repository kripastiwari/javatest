package java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestReadFile {
	
	public static void main(String args[]) throws Exception {

		String fileName = "C:\\Users\\KRIPA\\Desktop\\k.txt";
		List<String> list = new ArrayList<>();
		
		//read file into stream, try-with-resourcess
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
			
			list = stream
					.filter(line -> !line.startsWith("s"))
					.map(String::toUpperCase)
					.collect(Collectors.toList());


			list.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
			// throw new Exception(); 
			 System.out.println("in finally");
			
		}

	}

}
