package h04.robot;

import fopbot.Field;
import fopbot.Robot;
import h04.selection.FieldSelectionListener;
import h04.strategy.MoveStrategy;

import java.awt.*;

/**
 * This is the Class RobotMover which implements the interface FieldSelectionListener
 */
public class RobotMover implements FieldSelectionListener {
   private MoveStrategy moveStrategy;
    private fopbot.Robot[] robots =new Robot[0];

    /**
     * This is the constructor for RobotMover
     * @param moveStrategy is from type moveStrategy which will be used from other methods of the class
     */
    public RobotMover(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    /**
     * This is the method addRobot, which will add robots to the array
     * @param robot is the robot we will be using for this
     */
    public void addRobot(Robot robot) {
        int x=0;
        Robot[] robottemp= robots;
        robots= new Robot[robottemp.length+1];
        for(int i=0; i<robots.length;i++){
            if (x<robottemp.length){
                robots[i]=robottemp[x];
                    x++;
            } else {
                robots[x]=robot;
            }

        }



    }

    @Override
    public void onFieldSelection(Field field) {
        for (Robot robot: robots) {
            moveStrategy.start(robot,field);
        }
    }
}
