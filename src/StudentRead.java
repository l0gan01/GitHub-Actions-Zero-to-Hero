import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentRead
{

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
	
		//read object from file
		
		FileInputStream is = new FileInputStream("dac");
		ObjectInputStream os  = new ObjectInputStream(is);
		
		Student s; 
		
		try
		{
		while((s= (Student) os.readObject())!=null)
		{       s.disp();
			if(s.mark>35)
				System.out.print("pass");
			else
				System.out.print("fail");
			
			System.out.println();
			
			
		}
		}catch(EOFException e)
		{
			System.out.println("end of object");
		}
		
		
		
		
		
	}
	
	
	
}
