package domaine;

import org.javatuples.Pair;

import java.awt.*;

public class Controller {

    private final Me me;
    private Drawer drawer;
    private QualitiesDrawer qualitiesDrawer;

    public Controller(){
        me = new Me();
        qualitiesDrawer = new QualitiesDrawer();
        drawer = new Drawer(qualitiesDrawer);

    }

    public String testFunction(){
        MyShape test = new MyShape(me.getSelfDescription());
        String res = "ggrgr";
        for(Pair position : test.getDescriptionPosition()){
            res += position + " ; ";
        }
        return res;
    }

    //Make a shape with the qualities
    public String describeMe(){
        String selfDescription = "Auteur : "+me.getName()+"\n";
        return selfDescription+me.getSelfDescription().toString();
    }

    public void drawQualities(Graphics g){
        drawer.draw(g, me);
    }
}
