package h04.selection;

import fopbot.Field;

/**
 * This is the interface FieldSelectionListener, which observates the Field selection events
 */
public interface FieldSelectionListener{
    /**
     *This is the void method onFieldSelection which will make the robot move
     * @param field the field we are selecting
     */
    void onFieldSelection(Field field);
}
