import java.util.regex.Pattern;

public class Customer {

    String firstName;
    String lastName;
    String email;

    private final String emailRegex = "^(.+)@(.+).(.+)$";
    private final Pattern pattern = Pattern.compile(emailRegex);


    public Customer(String firstName, String lastName, String email){
        if(!pattern.matcher(email).matches()){
            throw new IllegalArgumentException("This is not valid email! try again!");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }


    public String toString(){
        return ("Your name is:" + firstName + " " + lastName + " and your email is: "+ email);
    }
}
