/*
 * File type and file extention are terms used interchangeably here.
  This class reads a path a return its kind of content, it detects what kind
  of files the directory has and return the name of the dir with the types 
  of its content (if the dir has another dirs, the class would return the
  the type of files that the dir has with the name of its parent dir if
  specified).
  The format to return is:
  name_directory: [type_content1 -> num_of_files, type_content2 ->num_of_files, type_content3 -> num_of_files]
  If the directory has others directories inside it, then the format returned
  is (if specified):
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

public class ReadFiles {
	private String path = null;
	Scanner keyboardInput = new Scanner(System.in);
	private String[] uniqueFilesTypes;

	public ReadFiles(String readPath){
		if (readPath != null && !readPath.isEmpty()){
			path = readPath;
		} else {
			System.out.println("path should not be empty, is you call some method to perform some"
					+ " operation you\'ll be asked for a path before continue.");
		}
	}


	public String getPath(){
		return path;
	}


	/*
	 * Remenber: some comments may look redundant but if you plan to abandon the project for certain time
	 * and back again later, these "redundant comments" may be helpful to remember what your code is doing.
	 *
	 * Sets a new path if wished to work on another directory.*/
	public void setPath(String newPath){
		if (newPath != null && !newPath.isEmpty()){
			System.out.printf("¡Warning! This will re-write the following path: %s%n Do you wish to continue [y]continue, [n] not re-write (whit will keep the showed path.)", path);
			//read the response of the user
			char userInput = keyboardInput.next().charAt(0);
			if (userInput == 'y'){
				path = newPath;
			}
		}
	}


	/*Returns number of files of a specific type
	 * @param fileExtention: the type of files wished to count inside the directory
	 *
	 * @return number of files of fileExtention found.
	 * */
	public int getNumberFilesOfNType(String fileExtention, String filePath){
		int numberOfFiles = 0;
		return numberOfFiles;
	}

	/*
	 * ¡You should choose between document your code in English or Spanish, remember do not mix
	 * different languages in one file!
	 *
	 * Lista de manera no recursiva un directorio retornando un flujo de objetos con la ruta de los
	 * archivos contenidos en el directorio especificado
	 * Lists in a non-recursive way the content of a directory returning a lazily populated stream
	 * of paths of the files on it.
	 * 
	 * */
	public void returnNonRecursiveDirectoryContent(){
		try{
			Files.list(new File(path).toPath()).limit(100).forEach(dirElement -> {
			System.out.println(dirElement);
			});
		} catch(IOException except){
			System.err.println("Could not show the content of the path, the directory may not even exists or the path must be wrong.");
		}
	}


	private boolean isTypeFile(String textFilePath){
		return false;
	}

	/*
	 * Remember: ¡PRIVATE METHODS shuold not be documented in public documentation, this
	 * is done only for demotration purposes or if the code is private, and you want to remember
	 * what the code is doing!
	 *
	 * Depeding on the OS, returns if the path is valid.*/
	private boolean isValidPath(){
		return false;
	}
}
