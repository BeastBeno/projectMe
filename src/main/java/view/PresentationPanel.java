package view;

import javax.swing.*;
import java.awt.*;

public class PresentationPanel extends JPanel {
    private MainWindow mainWindow;
    public PresentationPanel(MainWindow mainWindow){
        this.mainWindow = mainWindow;
    }
    @Override
    protected void paintComponent(Graphics gc)
    {
        super.paintComponent(gc);
        setBackground(new Color(102,102,102));
        this.mainWindow.getController().drawQualities(gc);

    }
}
