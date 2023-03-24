import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import WhatsUpUsers.Group;
import WhatsUpUsers.Image;
import WhatsUpUsers.Status;

public class WhatsUp {
    private ArrayList<Group> users;
    List<Image> images = new ArrayList<>();
    List<Status>statuses=new ArrayList<>();
    List<Group> groups = new ArrayList<>();

    public WhatsUp() {
        this.users = new ArrayList<Group>();
    }
   public ArrayList<Group> getUzer(){
        return users;
   }

    public Group install() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter person's name:");
        String name = scanner.nextLine();

        System.out.println("Enter person's phone number:");
        int phoneNumber = scanner.nextInt();

        System.out.println("Enter person's password:");
        String password = scanner.next();

        Group person = new Group();
        person.setName(name);
        person.setPhoneNumber(phoneNumber);
        person.setPasword(password);
        person.setImage(new Image("default/path/to/image"));
        person.setStatus(new Status("default/path/to/status"));

        // Добавить созданного пользователя в список
        groups.add(person);
        return person;
    }


    public void goToProfile() {

    }

    public void getAllStatus() {

    }

    public void changeProfilePhoto() {
                    Scanner scanner = new Scanner(System.in);
            System.out.println("Enter person's phone number:");
            int phoneNumber = scanner.nextInt();

            System.out.println("Enter person's name:");
            String name = scanner.next();

            System.out.println("Enter person's password:");
            String password = scanner.next();

            Group user = findUserByNameNumberAndPassword(name, phoneNumber, password);
            if (user == null) {
                System.out.println("User not found!");
                return;
            }
            System.out.println("User found! Name: " + user.getName() + ", Phone number: " + user.getPhoneNumber());

            System.out.println("Enter new photo path:");
            String photoPath = scanner.next();
            Image newPhoto = new Image(photoPath);
            user.setImage(newPhoto);
            System.out.println("Profile photo changed successfully!");
        }


    private Group findUserByNameNumberAndPassword(String name, int phoneNumber, String password) {
        for (Group user : groups) {
            if (user.getName().equals(name) && user.getPhoneNumber() == phoneNumber && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    public void changeStatus() {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter person's phone number:");
            int phoneNumber = scanner.nextInt();

            System.out.println("Enter person's name:");
            String name = scanner.next();


            System.out.println("Enter person's password:");
            String password = scanner.next();

            Group user = findUserByNameNumberAndPassword(name, phoneNumber, password);
            if (user == null) {
                System.out.println("User not found!");
                return;
            }
            System.out.println("Enter new photo path:");
            String photoPath = scanner.next();


            Status newStatus = new Status(photoPath);


            user.setStatus(newStatus);

            System.out.println("Profile photo changed successfully!");
        }


    public void addContact() {

    }

    public void sendMessage() {

    }


    public void deleteWhatsUp() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter person's name:");
        String name = scanner.nextLine();

        System.out.println("Enter person's phone number:");
        int phoneNumber = scanner.nextInt();

        System.out.println("Enter person's password:");
        String password = scanner.next();

        Group userToRemove = findUserByNameNumberAndPassword(name, phoneNumber, password);
        if (userToRemove == null) {
            System.out.println("User not found!");
            return;
        }

        users.remove(userToRemove);
        System.out.println("User removed successfully!");
    }
    public void printAllUsers() {
        for (Group user : groups) {
            System.out.println(user.getName() + " - " + user.getPhoneNumber()+user.getId()+user.getImage()+user.getStatus());
        }
    }
}
