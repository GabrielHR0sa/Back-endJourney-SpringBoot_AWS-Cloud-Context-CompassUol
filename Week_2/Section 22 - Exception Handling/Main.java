import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Construindo um código com elementos que bloqueiam a inserção de informações erradas do usuário

        Scanner scanner = new Scanner(System.in);

        User user = new User();
        System.out.println("We are setting up your user account");

        System.out.println("Your username is currently " + user.getUsername() + ". Please update it here!");
        String username = scanner.nextLine();
        if (username.isBlank()) {
            System.out.println("Sorry, that is an invalid usarname");
        } else {
            user.setUsername(username);
        }

        System.out.println("Your age is currently " + 0 + ". Please update it here!");
        if (scanner.hasNextInt()) {

            int age = scanner.nextInt();
            if (age < 0) {
                System.out.println("Sorry, that is an invalid age");
            } else {
                user.setAge(age);
            }
            scanner.close();

            System.out.println("Your name is: " + username);
            System.out.println("Your age is: " + age);

        } else {
            scanner.nextLine();
        }

    }

}
