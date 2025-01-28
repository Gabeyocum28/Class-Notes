package School;

import School.Person;

public class Student extends Person {
    private YearInSchool year;
    private float gpa;

    public Student(String name, int age, YearInSchool year, float gpa) {
        super(name, age);
        setYear(year);

    }

    public Student(Student other){
        super (other);
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public YearInSchool getYear() {

        return year;
    }

    public void setYear(YearInSchool year) {

        this.year = year;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("year: %s, gpa: %d", this.year, this.gpa);
    }

    @Override
    public boolean equals(Object obj) {
        var result = super.equals(obj);
        if (!result) {
            return false;
        }

        Student s = (Student) obj;

        return (this.year == s.year && this.gpa == s.gpa);
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = (hash ^ this.year.hashCode()) * ((int)this.gpa);
        return hash;
    }

    @Override
    protected int getAgePriority() {
        //return this.getGpa() / 10;
    }

    @Override
    protected int getCategoryPriority() {
        return 5;
    }
}
