package h04.strategy;

import fopbot.Field;
import fopbot.Robot;

/**
 * Move strategy that moves the robot step by step to the selected field
 * and counts the number of performed moves.
 */
public class MoveByWalk implements MoveStrategyWithCounter {

    private int countingMoves = 0;

    @Override
    public void start(Robot robot, Field field) {

        countingMoves = 0; // reset for each start

        if (robot.getX() < field.getX()) {
            while (!robot.isFacingRight()) {
                robot.turnLeft();
            }
            while (robot.getX() != field.getX()) {
                robot.move();
                countingMoves++;
            }
        } else if (robot.getX() > field.getX()) {
            while (!robot.isFacingLeft()) {
                robot.turnLeft();
            }
            while (robot.getX() != field.getX()) {
                robot.move();
                countingMoves++;
            }
        }

        if (robot.getY() < field.getY()) {
            while (!robot.isFacingUp()) {
                robot.turnLeft();
            }
            while (robot.getY() != field.getY()) {
                robot.move();
                countingMoves++;
            }
        } else if (robot.getY() > field.getY()) {
            while (!robot.isFacingDown()) {
                robot.turnLeft();
            }
            while (robot.getY() != field.getY()) {
                robot.move();
                countingMoves++;
            }
        }
    }

    @Override
    public int getMoveCount() {
        return countingMoves;
    }
}


