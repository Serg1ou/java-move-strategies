package h04.selection;

import fopbot.*;

import java.io.ObjectInput;

/**
 * This is the class MouseFieldSelector which implements the two interfaces FieldSelector and FieldClickListener
 */
public class MouseFieldSelector implements FieldSelector, FieldClickListener {
private FieldSelectionListener fieldSelectionListener;
    private int count=0;
    private Field previouslyfield =null;


    @Override
    public void setFieldSelectionListener(FieldSelectionListener fieldSelectionListener) {
    this.fieldSelectionListener=fieldSelectionListener;
    }

    @Override
    public void onFieldClick(FieldClickEvent event) {

        if (count>0 && previouslyfield==event.getField()){
        fieldSelectionListener.onFieldSelection(event.getField());

    }
        count++;
        previouslyfield=event.getField();

}

    /**
     * This is the method MouseFieldSelector which puts the actual object from the input Handler like a Field Click Listener
     */
    public  MouseFieldSelector(){
    World.addFieldClickListener(this);
}
}
