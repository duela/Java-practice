
    import java.util.Scanner;

    public class UsernameAndPasswordValidator {
        public static boolean is_valid(String username, String password) {
            // Write your code below
            if("qweasd".equals(password) && "user".equals(username)){
                return true;
            }
            else return "admin".equals(username);

        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter username: ");
            String user = scanner.nextLine();
            System.out.print("Enter password: ");
            String pass = scanner.nextLine();
            boolean res = is_valid(user, pass);
            System.out.println(res);
        }
    }


