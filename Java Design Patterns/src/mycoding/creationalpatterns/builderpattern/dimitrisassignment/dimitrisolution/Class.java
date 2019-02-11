package mycoding.creationalpatterns.builderpattern.dimitrisassignment.dimitrisolution;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CO21321 on 2/28/2018.
 */
public class Class {

    public String name;
    public List<Field> fields = new ArrayList<>();

    public Class() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String nl = System.lineSeparator();
        sb.append("public class ").append(name).append(nl)
                .append("{").append(nl);
        for (Field f : fields)
            sb.append("  ").append(f).append(nl);
        sb.append("}").append(nl);
        return sb.toString();
    }

}
