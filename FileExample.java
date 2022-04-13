
	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;

	public class FileExample {

		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			File file=new File("hello.txt");
			System.out.println(file.exists());
			
			file.createNewFile();
			
			System.out.println(file.exists());
			System.out.println(file.canWrite());
			System.out.println(file.isFile()+" "+file.getParent()+" "+file.getName());
			FileWriter writer=new FileWriter(file);
			writer.write("File is write mode");
			writer.close();
		}

	}

