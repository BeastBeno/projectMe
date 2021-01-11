package domaine;

import java.util.ArrayList;

public class Me implements SoftwareEngineering{
    /*
This is an original description of my personalty through some lines of code
From my logic sense to my best habits passing through my bad ones,
this project resume it all
 */
    private final String name;
    private final ArrayList<String> selfDescription;

    public Me(){
        name = "Dietz-Benony AWOUSSI";
        selfDescription = new ArrayList<>();
        selfDescription();
    }

    private void selfDescription(){
        for(MyQualities myQualities: MyQualities.values())
            selfDescription.add(myQualities.getDescription());
    }

    public ArrayList<String> getSelfDescription() {
        return selfDescription;
    }

    @Override
    public void engineeringKnowledge() {

    }

    @Override
    public void problemAnalysis() {

    }

    @Override
    public void investigation() {

    }

    @Override
    public void design() {

    }

    @Override
    public void usingEngineeringTools() {

    }

    @Override
    public void individualAndTeamWork() {

    }

    @Override
    public void communication() {

    }

    @Override
    public void professionalism() {

    }

    @Override
    public void engineeringImpactOnSocietyAndEnvironment() {

    }

    @Override
    public void ethicsAndFairness() {

    }

    @Override
    public void economicsAndProjectManagement() {

    }

    @Override
    public void continuousLearning() {

    }

    public String getName() {
        return name;
    }
}
