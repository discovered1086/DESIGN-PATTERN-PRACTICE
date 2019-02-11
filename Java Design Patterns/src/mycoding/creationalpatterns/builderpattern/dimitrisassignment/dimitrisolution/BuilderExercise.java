package mycoding.creationalpatterns.builderpattern.dimitrisassignment.dimitrisolution;

/**
 * Created by CO21321 on 2/28/2018.
 */


public class BuilderExercise
{
    private Class theClass = new Class();

    public BuilderExercise(String rootName)
    {
        theClass.name = rootName;
    }

    public BuilderExercise addField(String name, String type)
    {
        theClass.fields.add(new Field(name, type));
        return this;
    }

    @Override
    public String toString() {
        return theClass.toString();
    }
}

