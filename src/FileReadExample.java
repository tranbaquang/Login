import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileReadExample {

	public static void main(String[] args) {
		try {
			FileReader userVerify = new FileReader("user.txt");
			FileReader passVerify = new FileReader("password.txt");
			
			Scanner scan = new Scanner(System.in);
			String user;
			String password;
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
