package h04.robot;

import fopbot.Field;
import fopbot.Robot;
import h04.selection.FieldSelectionListener;
import h04.strategy.MoveStrategy;
import h04.strategy.MoveStrategyWithCounter;

/**
 * This is the class MoveableRobot which is part of Robot and has the interface FieldSelectionListener
 */
public class MoveableRobot extends Robot implements FieldSelectionListener {
   private MoveStrategy moveStrategy;
   private MoveableRobot[] robot;

    /**
     * This is the constructorr of MoveableRobot which puts the robot in position (0,0)
     * @param moveStrategy is from type moveStrategy which will be used from other methods of the class
     */
    public MoveableRobot(MoveStrategy moveStrategy){
        super(0,0);
        this.moveStrategy=moveStrategy;
    }

    @Override
    public void onFieldSelection(Field field) {
            moveStrategy.start(this,field);
            if (moveStrategy instanceof MoveStrategyWithCounter){
               int Counter= ((MoveStrategyWithCounter) moveStrategy).getMoveCount();
               for(int x=0; x<Counter;x++) {
                   turnLeft();
               }
            }
        }


    }

