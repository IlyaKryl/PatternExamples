package CreationalPatterns.Prototype;

public class RobotConveyor {
    public static void main(String[] args) {
        Robot master = new Robot(1, "iRobot", 1.4);

        System.out.println(master);

        RobotFactory factory = new RobotFactory(master);
        Robot masterCopy = factory.cloneRobot();

        System.out.println(masterCopy);
    }
}
