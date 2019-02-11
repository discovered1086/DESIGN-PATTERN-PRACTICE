package mycoding.creationalpatterns.builderpattern.dimitrisassignment.dimitrisolution;

/**
 * Created by CO21321 on 2/28/2018.
 */
public class Field {
    public String type, name;

    public Field(String name, String type) {
        this.type = type;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("public %s %s;", type, name);
    }

}
