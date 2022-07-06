package exceptionpack;
import java.io.FileWriter;
import java.io.IOException;
public class FileWritingEx {

	 static FileWriter FileWriter;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileWriter = new FileWriter("hello.txt");
        String[]names=new String[] {"Ashwini","Rajendra"};
	}catch(IOException ex)
		{
		System.out.println("File Not Present Exception"+ex.getMessage());
		}
	}
}
