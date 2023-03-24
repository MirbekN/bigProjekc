import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        while (true) {
            System.out.println(
                    "1-> Install What's up\n "
                            + "2-> Go to profile\n" +
                            "3-> Get all What's up status\n" +
                            "4-> Change profile photo \n"
                            + "5-> Change What's up status\n" +
                            "6-> Add contact\n" +
                            "7-> Send messege\n" +
                            "8-> Delete What's up\n" +
                            "9-> Print all users");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.next();
            WhatsUp whatsUp = new WhatsUp();
            switch (choice) {
                case "1":
                    whatsUp.install();
                    break;
                case "2":
                    whatsUp.goToProfile();
                    break;
                case "3":
                    whatsUp.getAllStatus();
                    break;
                case "4":
                    whatsUp.changeProfilePhoto();
                    break;
                case "5":
                    whatsUp.changeStatus();
                    break;
                case "6":
                    whatsUp.getUzer();
                    break;
                case "7":
                    whatsUp.sendMessage();
                    break;
                case "8":
                    whatsUp.deleteWhatsUp();
                    break;
                case "9":
                    whatsUp.printAllUsers();
                    break;
                default:
                    System.out.println("Invalid choice\n**********************");
                    break;
            }
        }
    }
}

