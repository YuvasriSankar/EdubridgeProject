
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExamples {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//relative path---path which is within the project folder
		//absolute path---path which is starting from the 
		//c , d , f drive in our machines
		
		Path path=Paths.get("one","two");
		File file=path.toFile();
		
		//absolute path
		Path path1=Paths.get("D:\\","java\\","ExecutorService and executor example.java");
		
		File file2=path1.toFile();
		
		//FileReader reader =new FileReader(file2);
		
		File file1=new File("hello.txt");
		System.out.println(file1.exists());
		
		file1.createNewFile();
		
		System.out.println(file1.exists());
		System.out.println(file1.canWrite());
		System.out.println(file1.isFile()+" "+file1.getParent()+" "+file1.getName());
		FileWriter writer=new FileWriter(file1);
		writer.write("File is write mode");
		writer.close();
	}
}
