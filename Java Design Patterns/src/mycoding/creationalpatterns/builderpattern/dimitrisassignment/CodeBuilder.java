package mycoding.creationalpatterns.builderpattern.dimitrisassignment;

/**A Builder class used to build the code string object
 * Created by CO21321 on 2/28/2018.
 */
public class CodeBuilder {

    protected StringBuilder code=new StringBuilder();

    public CodeBuilder(String className) {
        code.append("public class ").append(className).append("{").append("\n");
    }

    public CodeBuilder addField(String name, String type) {
        //code.append("\tpublic ").append(type).append(" ").append(name).append(";\n");
        code.append(String.format("\t public %s %s;\n",type,name));
        return this;
    }

    @Override
    public String toString() {
        code.append("}");
        return code.toString();
    }

}
