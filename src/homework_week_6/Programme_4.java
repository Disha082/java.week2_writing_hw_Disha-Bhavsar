package homework_week_6;
/**
 * Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Programme_4 {
    String name = "Disha";
    double b = 20.2;
    static boolean a = true;
    static boolean c = false;

    public static void main(String[] args) {
        Programme_4 programme_4 =new Programme_4();
        programme_4.instancemethod();
        staticmethod();


    }
    public void instancemethod(){
        System.out.println(name);
        System.out.println(b);
        System.out.println(a);
        System.out.println(c);



    }
    public static void staticmethod(){
        Programme_4 programme_4 =new Programme_4();
        System.out.println(programme_4.name);
        System.out.println(programme_4.b);
        System.out.println(a);
        System.out.println(c);

    }



}
