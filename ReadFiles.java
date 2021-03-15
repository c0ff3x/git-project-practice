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
public class ReadFiles {
	private String path = null;

	public ReadFiles(String readPath){
		path = readPath;
	}

	public String getPath(){
		return path;
	}

	public int getNumberFilesOfNType(String fileType, String folderPath){
		return numberOfFiles;
	}

}
