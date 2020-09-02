package Cohort3.com.Examples;
// Scope class to demonstrate field and local variable scopes.

public class Scope {
    //field that is accessible to all methods of this class
    private static int x = 1;

    // method main creates and initialises local variable x
    // and calls methods useLocalVariable and useField
    public static void main(String[]args){
        int x = 5; //method's local variable x shadows field x

        System.out.printf("local x in main is %d%n", x);

        useLocalVariable(); //useLocalVariable has local x
        useField(); //useField uses class scope's field x
        useLocalVariable(); //useLocalVariable re-initializes local x
        useField(); //class scope's field x retain its value

        System.out.printf("%n local x in main is %d%n", x);
    }
    //create and initialize local variable x during each call
    public static void useLocalVariable(){
        int x = 25; // initialized each time useLocalVariable

        System.out.printf("%n local x on entering method useLocalVariable is %d%n ", x);
        ++x; // modifies this method's local variable x
        System.out.printf("local x before exciting method useLocalVariable is %d%n", x);
    }
    //modify class scope's field x during each call
    public static void useField(){
        System.out.printf("%n field x on entering method useField is %d%n", x);
        x *= 10; // modifies class scope's field x
        System.out.printf("field x before exiting method useField is %d%n ", x);
    }

}
