package com.kingshuk.designpatterns.creationalpatterns.builderpattern.dimitrisassignment;

/**A harness class to test the code builder exercise
 * Created by CO21321 on 2/28/2018.
 */
public class CodeBuilderHarness {
    public static void main(String[] args) {
        CodeBuilder cb = new CodeBuilder("Employee").addField("name", "String").addField("salary", "int");
        System.out.println(cb);
    }
}
