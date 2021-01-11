package view;

import domaine.Controller;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private final Controller controller;
    public MainWindow()
    {
        this.controller = new Controller();
        System.out.println(controller.testFunction());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PresentationPanel presentationPanel = new PresentationPanel(this);
        setLayout(new GridLayout(0,2));
        add(presentationPanel);
        //getContentPane().add(presentationPanel, BorderLayout.CENTER);
        setSize(1280,800);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public Controller getController() {
        return controller;
    }
}
