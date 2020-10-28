package application;

public class Program {

public static void main(String[] args) throws Exception {
        AverageSensor ka = new AverageSensor();
        ka.addSensor( new StandardSensor(3) );
        ka.addSensor( new StandardSensor(7) );
        ka.readings();
}

}
