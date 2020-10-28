
package flightControl;

import flightControl.logic.FlightControl;
import flightControl.ui.TextUI;
import java.util.Scanner;


public class Main {        
       
    public static void Main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlightControl flight = new FlightControl();
        TextUI text1 = new TextUI(flight, scanner);
        text1.start();
    }
}
