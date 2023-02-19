package CreateProject;
import java.util.*;

public class passwordGenerator {
    public static void main(String[] args) {
        
        System.out.println("Give the length of your password");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(generateRandomPassword(n));
    }

    public static String generateRandomPassword(int n){
        
        if(n < 8){
            return "Password cannot be less than 8 characters";
        }

        String specialChars = "!@#$%^&*";
        String combinedLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*";

        Random random = new Random();

        String password = "";
        password += (char)(random.nextInt(26)+'A');
        password += (char)(random.nextInt(26)+'a');
        password += random.nextInt(10);
        password += specialChars.charAt(random.nextInt(specialChars.length()));

        for(int i=4; i<=n; i++){
            password += combinedLetter.charAt(random.nextInt(combinedLetter.length()));
        }

        return password;
    }
}
