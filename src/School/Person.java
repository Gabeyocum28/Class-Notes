package School;


public abstract class Person {

    private int id;
    private String name;


    public Person(String name, int age) {
        setId(id);
        setName(name);
    }

    public Person(Person other) {
        setName(other.getName());
        setId(other.getId());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString(){
        return String.format("[%s] name: %s, id: %d", this.getClass().getName(),
                this.name, this.id);
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

        return (this.name.equals(p.name) && this.id == p.id);
    }

    @Override
    public int hashCode() {

        return (this.name.hashCode() * this.id);
    }

    public final int getPriority() {
        return this.getAgePriority() * this.getCategoryPriority();
    }

    protected abstract int getAgePriority();

    protected abstract int getCategoryPriority();
}
