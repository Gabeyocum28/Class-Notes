package Core;


public abstract class Person {

    private static int nextId = 1;
    private static int generateId() {
        return nextId++;
    }
    private int id;
    private String name;
    private int age;


    public Person(String name, int age) {
        id = generateId();
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString(){
        return String.format("[%s] name: %s, age: %d", this.getClass().getName(),
                this.name, this.age);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Person p = (Person) obj;

        return (this.name.equals(p.name) && this.age == p.age);
    }

    @Override
    public int hashCode() {

        return (this.name.hashCode() * this.age);
    }

    public final int getPriority() {
        return this.getAgePriority() * this.getCategoryPriority();
    }

    protected abstract int getAgePriority();

    protected abstract int getCategoryPriority();
}
