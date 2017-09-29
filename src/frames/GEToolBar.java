package frames;

import constants.GEConstants;

import javax.swing.*;

public class GEToolBar extends JToolBar{

    private JRadioButton radioButton;
    private GEDrawingPanel drawingPanel;

    public GEToolBar(String label) {
        super(label);

        ButtonGroup buttonGroup = new ButtonGroup(); // for making each button single selected

        for(GEConstants.EToolBarButtons btn : GEConstants.EToolBarButtons.values()) {
            radioButton = new JRadioButton();
            radioButton.setIcon(new ImageIcon(GEConstants.IMG_URL +
            btn.toString() + GEConstants.TOOLBAR_BTN));
            radioButton.setSelectedIcon(new ImageIcon(GEConstants.IMG_URL +
            btn.toString() + GEConstants.TOOLBAR_BTN_SLT));

            this.add(radioButton);
            buttonGroup.add(radioButton);
        }
    }

    private void clickDefault() {
        JRadioButton radioButton =
                (JRadioButton)this.getComponent(GEConstants.EToolBarButtons.Rectangle.ordinal());
        radioButton.doClick();
    }

    public void init(GEDrawingPanel dp) {
        this.drawingPanel = dp;
        this.clickDefault();
    }
}