package h04.strategy;

import fopbot.Field;
import fopbot.Robot;

/**
 * This is the class MoveByTeleport, which will implement the interface MoveStrategy and will make the robot move to the desired position
 */
public class MoveByTeleport implements MoveStrategy{
    @Override
    public void start(Robot robot, Field field) {
        robot.setField(field.getX(), field.getY());
    }
}
