package mycoding.creationalpatterns.builderpattern.dimitrisassignment.dimitrisolution;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by CO21321 on 2/28/2018.
 */
public class Evaluate
{
    private String preprocess(String text)
    {
        return text.replace("\r\n", "\n").trim();
    }

    @Test
    public void emptyTest() {
        BuilderExercise cb = new BuilderExercise("Foo");
        assertEquals("public class Foo\n{\n}",
                preprocess(cb.toString()));
    }

    @Test
    public void personTest()
    {
        BuilderExercise cb = new BuilderExercise("Person")
                .addField("name", "String")
                .addField("age", "int");
        assertEquals("public class Person\n{\n" +
                        "  public String name;\n" +
                        "  public int age;\n}",
                preprocess(cb.toString()));
    }
}