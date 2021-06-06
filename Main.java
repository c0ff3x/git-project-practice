/*Program that search files inside a path and list its content based on type of files
 * number, and other options.
 * @author Oscar Mora*/
public class Main {
	public static void main(String[] args){
		ReadFiles readContent = new ReadFiles("C:\\Users\\Bayot\\Documents\\Amesfort\\txts");
		readContent.returnNonRecursiveDirectoryContent();
	}
}
