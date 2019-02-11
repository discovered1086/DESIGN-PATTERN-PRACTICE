package trainings.creational.builder.dimitristraining;

// builder inheritance with recursive generics


class PersonBuilderUpdated<SELF extends PersonBuilderUpdated<SELF>>
{
    protected Person person = new Person();

    // critical to return SELF here
    public SELF withName(String name)
    {
        person.name = name;
        return self();
    }

    protected SELF self()
    {
        // unchecked cast, but actually safe
        // proof: try sticking a non-PersonBuilder
        //        as SELF parameter; it won't work!
        return (SELF) this;
    }

    public Person build()
    {
        return person;
    }
}

class EmployeeBuilder
        extends PersonBuilderUpdated<EmployeeBuilder>
{
    public EmployeeBuilder worksAs(String position)
    {
        person.position = position;
        return self();
    }

    @Override
    protected EmployeeBuilder self()
    {
        return this;
    }
}

public class RecursiveGenericsDemo {
    public static void main(String[] args)
    {
        EmployeeBuilder eb = new EmployeeBuilder()
                .withName("Dmitri")
                .worksAs("Quantitative Analyst");
        System.out.println(eb.build());
    }
}
