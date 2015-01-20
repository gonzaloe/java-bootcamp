package topic_two.exercise1.FirstMavenApp;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Please introduce your name: " );
        Scanner intro = new Scanner(System.in);
        String name = intro.next();
        System.out.println("Hello " + name + "!, welcome to my Maven first application!");
    }
}
