package frames;

import constants.GEConstants;
import shapes.GEEllipse;
import shapes.GELine;
import shapes.GERectangle;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GEToolBar extends JToolBar{

    private ButtonGroup buttonGroup;

    private GEDrawingPanel drawingPanel;
    private GEToolBarHandler shapeToolBarHandler;

    public GEToolBar(String label) {
        super(label);
        buttonGroup = new ButtonGroup(); // for making each button single selected
        JRadioButton rButton = null;

        shapeToolBarHandler = new GEToolBarHandler();

        for(GEConstants.EToolBarButtons btn : GEConstants.EToolBarButtons.values()) {
            rButton = new JRadioButton();
            rButton.setIcon(new ImageIcon(GEConstants.IMG_URL +
                btn.toString() + GEConstants.TOOLBAR_BTN));
            rButton.setSelectedIcon(new ImageIcon(GEConstants.IMG_URL +
                btn.toString() + GEConstants.TOOLBAR_BTN_SLT));

            // add ActionListener to ToolBar
            rButton.addActionListener(shapeToolBarHandler);
            rButton.setActionCommand(btn.toString());

            this.add(rButton);
            buttonGroup.add(rButton);
        }
    }

    public void init(GEDrawingPanel dp) {
        this.drawingPanel = dp;
        this.clickDefaultButton();
    }

    private void clickDefaultButton() {
        JRadioButton rButton =
                (JRadioButton)this.getComponent(GEConstants.EToolBarButtons.Rectangle.ordinal());
        rButton.doClick();
    }

    // if other rButtons clicked, initialize a shape instance in the drawingPanel and set selected shape
    public class GEToolBarHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JRadioButton button = (JRadioButton)e.getSource();
            if(button.getActionCommand().equals(GEConstants.EToolBarButtons.Rectangle.toString())) {
                drawingPanel.setRectangle(new GERectangle());
                drawingPanel.setSelectShape(GEConstants.EToolBarButtons.Rectangle);
            } else if(button.getActionCommand().equals(GEConstants.EToolBarButtons.Ellipse.toString())) {
                drawingPanel.setEllipse(new GEEllipse());
                drawingPanel.setSelectShape(GEConstants.EToolBarButtons.Ellipse);
            } else if(button.getActionCommand().equals(GEConstants.EToolBarButtons.Line.toString())) {
                drawingPanel.setLine(new GELine());
                drawingPanel.setSelectShape(GEConstants.EToolBarButtons.Line);
            }
        }
    }
}