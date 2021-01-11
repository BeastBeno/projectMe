package domaine;

import org.javatuples.Pair;

import java.util.ArrayList;

public class MyShape {
    double theta = 0;
    private final ArrayList<String> selfDescription;
    private final ArrayList<Pair> descriptionPosition;

    public MyShape(ArrayList<String> selfDescription){
        descriptionPosition = new ArrayList<>();
        this.selfDescription = selfDescription;
        initPosition();
    }

    private void initPosition(){
            for(int i = 0 ; i < selfDescription.size(); i++){
                descriptionPosition.add(findNextPositionInCircle());
            }
    }
    private Pair findNextPositionInCircle(){
        /*
        Initialization of the shape coordinate
        Here is a circle
     */
        int x0 = 300;
        int raduis = 200;
        int X = (int)(x0 + raduis * Math.cos(theta));
        int y0 = 300;
        int Y = (int)(y0 + raduis * Math.sin(theta));
        Pair<Integer, Integer> coordinates = new Pair<>(X, Y);
        theta += 2* Math.PI / (double)selfDescription.size();
        return coordinates;
    }

    public ArrayList<Pair> getDescriptionPosition() {
        return descriptionPosition;
    }
}
