package h04.strategy;

import java.awt.*;

import fopbot.Field;
import fopbot.Robot;

/**
 *This is the interface MoveStrategy that gives a Strategy, which will make the robot move to the selected field
 */
public interface MoveStrategy {
    /**
     *this will be a method that is not going to return something called start
     * @param robot the robot that will be called to move to the selected place
     * @param field the selected field to which the robot would move
     */
      void start (Robot robot, Field field);

    }

