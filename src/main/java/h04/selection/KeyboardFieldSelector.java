package h04.selection;

import fopbot.*;

import java.awt.*;

/**
 * This is the class KeyboardFieldSelector, which implements the two Interfaces: FieldSelector and KeyPressListener
 */
public class KeyboardFieldSelector implements FieldSelector, KeyPressListener {

    private FieldSelectionListener fieldSelectionListener;
    private int count=0;
    private int x=0;
    private int y=0;
    private Field previouslycolourfield = null;
    @Override
    public void setFieldSelectionListener(FieldSelectionListener fieldSelectionListener) {
        this.fieldSelectionListener=fieldSelectionListener;
    }

    @Override
    public void onKeyPress(KeyPressEvent event) {

        if (count == 0) {
            event.getWorld().setFieldColor(x, y, Color.RED);
            count++;
            return;
        }

        if (event.getKey() == Key.UP) {
            event.getWorld().setFieldColor(x, y, null);
                y++;
                if (y > World.getHeight() -1) {
                    y = 0;
                }
                event.getWorld().setFieldColor(x,y,Color.RED);
            }
        if (event.getKey() == Key.DOWN) {
            event.getWorld().setFieldColor(x, y, null);
                y -= 1;
                if (y < 0) {
                    y = World.getHeight() - 1;
                }
                event.getWorld().setFieldColor(x,y,Color.RED);
            }

            if (event.getKey() == Key.RIGHT) {
                event.getWorld().setFieldColor(x, y, null);
                x++;
                if (x > World.getWidth()-1) {
                    x = 0;
                }
                event.getWorld().setFieldColor(x,y,Color.RED);
            }

            if (event.getKey() == Key.LEFT) {
                event.getWorld().setFieldColor(x, y, null);
                x--;
                if (x < 0) {
                    x = World.getWidth() - 1;
                }
                event.getWorld().setFieldColor(x,y,Color.RED);
            }

            if (event.getKey() == Key.SPACE) {
                fieldSelectionListener.onFieldSelection(event.getWorld().getField(x, y));
            }


        }

    /**
     * This is the method KeyboardFieldSelector which puts the actual object from the input Handler like a Key Press Listener
     */
     public KeyboardFieldSelector() {
            World.addKeyPressListener(this);
        }


}
