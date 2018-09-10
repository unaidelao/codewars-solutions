/**
 * Welcome to the city - Java
 * 
 * Create a method sayHello/say_hello/SayHello that takes as input a name, city, and state to
 * welcome a person. Note that name will be an array consisting of one or more values that should
 * be joined together with one space betweeen each, and the length of the name array in test cases
 * will vary.
 */
public class WelcomeToTheCity{
    public String sayHello(String [] name, String city, String state){
        String completeName = "";
    
        for (int i = 0; i < name.length; i++) {
            completeName += " " + name[i];
        }
        return String.format("Hello,%s! Welcome to %s, %s!", completeName, city, state);
    }
}