package h04.selection;

/**
 * The interface FieldSelector is used to do selection of a field in the world.
 */
public interface FieldSelector {
    /**
     *This method will register a selected Field with the Field Selector
     * @param fieldSelectionListener this is the parameter fieldSelectionListener which is from FieldSelectionListener
     */
    void setFieldSelectionListener(FieldSelectionListener fieldSelectionListener);
}
