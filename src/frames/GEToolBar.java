package frames;

import constants.GEConstants;

import javax.swing.*;

public class GEToolBar extends JToolBar{

    private JRadioButton radioButton;

    public GEToolBar(String label) {
        super(label);

        ButtonGroup buttonGroup = new ButtonGroup();

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
}