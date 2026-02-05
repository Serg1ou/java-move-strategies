package h04;

import fopbot.Robot;
import fopbot.RobotFamily;
import fopbot.World;
import h04.robot.MoveableRobot;
import h04.robot.RobotMover;
import h04.selection.KeyboardFieldSelector;
import h04.selection.MouseFieldSelector;
import h04.strategy.MoveByTeleport;
import h04.strategy.MoveByWalk;

import static org.tudalgo.algoutils.student.Student.crash;

/**
 * Main entry point in executing the program.
 */
public class
Main {
    /**
     * Main entry point in executing the program.
     *
     * @param args program arguments, currently ignored
     */
    public static void main(String[] args) {
        World.setVisible(true);
      main01();
      main02();
    }

    /**
     * This is the method main01 you will have robots which will use the mouseFieldSelector, moveByWalk and RobotMover
     */
    public static void main01() {
        MouseFieldSelector mouseFieldSelector = new MouseFieldSelector();
        MoveByWalk moveByWalk = new MoveByWalk();
        RobotMover robotMover = new RobotMover(moveByWalk);
        mouseFieldSelector.setFieldSelectionListener(robotMover);

        Robot robot1 = new Robot(3, 8, RobotFamily.SQUARE_RED);
        Robot robot2 = new Robot(4, 9, RobotFamily.SQUARE_WHITE);
        Robot robot3 = new Robot(7, 3, RobotFamily.SQUARE_BLACK);

        Robot[] robots = new Robot[] {robot1, robot2, robot3};

        for (Robot robot : robots) {robotMover.addRobot(robot);}
    }

    /**
     * This method main02 would use the methods moveByTeleport,moveableRobot and keyboardFieldSelector
     */
    public static void main02() {
        KeyboardFieldSelector keyboardFieldSelector = new KeyboardFieldSelector();
        MoveByTeleport moveByTeleport = new MoveByTeleport();
        MoveableRobot moveableRobot = new MoveableRobot(moveByTeleport);
        keyboardFieldSelector.setFieldSelectionListener(moveableRobot);
    }

}
