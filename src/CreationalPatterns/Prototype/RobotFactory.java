package CreationalPatterns.Prototype;

public class RobotFactory {
    Robot robot;

    public RobotFactory(Robot robot) {
        this.robot = robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }

    Robot cloneRobot() {
        return (Robot) robot.copy();
    }
}
