import java.io.FileWriter;
import java.util.Scanner;

public class FileWriterExample {
	public static void main(String args[]) {
		try {
			FileWriter userData = new FileWriter("user.txt");
			FileWriter passData = new FileWriter("password.txt");
			Scanner scan = new Scanner(System.in);
			String user;
			String password;
			String rePassword;
			do {
				System.out.println(">>>>>Register an account<<<<<");
				System.out.print("User name: ");
				user = scan.nextLine();
				System.out.print("Password: ");
				password = scan.nextLine();
				System.out.print("Re-enter Password: ");
				rePassword = scan.nextLine();
			} while (user.equals("") || !password.equals(rePassword) || password.equals(""));
			userData.write(user + "\n");
			passData.write(password + "\n");
			userData.write(user + "\n");
			passData.write(password + "\n");
			userData.close();
			passData.close();
//			if (!user.equals("") && password.equals(rePassword)) {
//				userData.write(user);
//				passData.write(password);
//				userData.close();
//				passData.close();
//			}   	

		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Successful account registration !");
	}
}
