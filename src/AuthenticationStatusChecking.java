import java.util.Scanner;

public class AuthenticationStatusChecking {
    private User user;
    public enum AuthenticationStatus {
        SUCCESS, FAIL;
    }

    public AuthenticationStatusChecking(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @SuppressWarnings("resource")

    public AuthenticationStatus login() {
        Scanner input = new Scanner(System.in);
        System.out.println("MAIL ADDRESS : ");
        String mail = input.nextLine();
        System.out.println("Password : "); 
        String password = input.nextLine();

        if(user.getEmail().equals(mail) && user.getPassword().equals(password)) {
            return AuthenticationStatus.SUCCESS;
        } else {
            return AuthenticationStatus.FAIL;
        }
    }

    
}
