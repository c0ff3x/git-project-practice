/*
  This class reads a path a return its kind ofcontent, it detects what kind
  of files the directory has and return the name of the dir with the types 
  of its content (if the dir has another dirs, the class would return the
  the type of files that the fir has with the name of its parent dir).
  The format to return is:
  name_directory: [type_content1, type_content2: type_content3]
  If the directory has others directories inside it, then the format returned
  is:
  name_directory:
  	name_directory: [type_content1 -> num_of_files, type_content2 -> num_of_files, type_content3 -> num_of_files]
  	name_directory: [type_content1 -> num_of_files, type_content2 -> num_of_files, type_content3 -> num_of_files]
  		name_directory: [type_content1 -> num_of_files, type_content2 -> num_of_files, type_content3 -> num_of_files]
  		name_directory: [type_content1 -> num_of_files, type_content2 -> num_of_files, type_content3 -> num_of_files]
  	name_directory: [type_content1 -> num_of_files, type_content2 -> num_of_files, type_content3 -> num_of_files]
*/
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;
///list directory recursively
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFiles {
	private String path = null;
	Scanner keyboardInput = new Scanner(System.in);

	public ReadFiles(String readPath){
		path = readPath;
	}

	public String getPath(){
		return path;
	}

	public void setPath(String newPath){
		if (!path.isEmpty()){
			System.out.printf("¡Warning! This will re-write the following path: %s%n Do you wish to continue [y]continue, [n] not re-write (whit will keep the showed path.)", path);
			//read the response of the user
			char userInput = keyboardInput.next().charAt(0);
			if (userInput == 'y'){
				path = newPath;
			}
		}
	}

	public int getNumberFilesOfNType(String fileType, String folderPath){
		int numberOfFiles = 0;
		return numberOfFiles;
	}

	public void returnNonRecursiveDirectoryContent(){
		try{
			Files.list(new File(path).toPath()).limit(100).forEach(dirElement -> {
			System.out.println(dirElement);
			});
		} catch(IOException except){
			System.err.println("Could not show the content of the path, the directory may not even exists or the path must be wrong.");
		}
	}

	public void returnRecursiveDirectoryContent(){
		try (Stream<Path> paths = Files.walk(Paths.get(path))){
			paths.filter(Files::isRegularFile).forEach(System.out::println);
		} catch(IOException filenotfound){
			System.out.println("Could not list contents of the direcoty");
		}
	}
}
