package domaine;

import java.awt.*;

public class Drawer {

    QualitiesDrawer qualitiesDrawer;
    public Drawer(QualitiesDrawer qualitiesDrawer){
        this.qualitiesDrawer = qualitiesDrawer;
    }

    public void draw(Graphics g, Me me){
        qualitiesDrawer.draw(g, me);
    }
}
