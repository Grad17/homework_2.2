public class Hogwarts {

    private String name;
    private String surname;
    private int powerOfWitchcraft;
    private int transgressionRange;

    public Hogwarts(String name, String surname, int powerOfWitchcraft, int transgressionRange) {
        this.name = name;
        this.surname = surname;
        this.powerOfWitchcraft = powerOfWitchcraft;
        this.transgressionRange = transgressionRange;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPowerOfWitchcraft() {
        return powerOfWitchcraft;
    }

    public void setPowerOfWitchcraft(int powerOfWitchcraft) {
        this.powerOfWitchcraft = powerOfWitchcraft;
    }

    public int getTransgressionRange() {
        return transgressionRange;
    }

    public void setTransgressionRange(int transgressionRange) {
        this.transgressionRange = transgressionRange;
    }
    public void printStudent() {
        System.out.println("Имя: " + getName() + " " + getSurname() +
                "; Сила колдовства: " + getPowerOfWitchcraft() +
                "; расстояние трансгрессии: " + getTransgressionRange() );
    }
    public void compareAllStudent(Hogwarts student){
        int sum = this.getPowerOfWitchcraft() + this.getTransgressionRange();
        int sum1 = student.getPowerOfWitchcraft() + student.getTransgressionRange();
        if (sum>sum1){
            System.out.println(this.getName()+ " " + this.getSurname()+ " обладает большей мощностью магии, чем " + student.getName()+ " " +student.getSurname() + ".");
        } else {
            System.out.println(student.getName()+ " " + student.getSurname()+ " обладает большей мощностью магии, чем " + this.getName()+ " " +this.getSurname() + ".");
        }
    }
}
