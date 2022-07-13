public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, String surname, int powerOfWitchcraft, int transgressionRange, int mind, int wisdom, int wit, int creativity) {
        super(name, surname, powerOfWitchcraft, transgressionRange);

        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    public void printStudent() {
        System.out.println("Имя: " + getName() + " " + getSurname() +
                "; Сила колдовства: " + getPowerOfWitchcraft() +
                "; расстояние трансгрессии: " + getTransgressionRange() +
                "; ум: " + getMind() +
                "; мудрость: " + getWisdom() +
                "; остроумие: " + getWit() +
                "; креативность: " + getCreativity() + ".");
    }
    public void compareStudentRavenclaw(Ravenclaw student) {
        int sum = this.getWisdom() + this.getWit() + this.getCreativity() + this.getMind();
        int sum1 = student.getWisdom() + student.getWit() + student.getCreativity() + student.getMind();
        if (sum > sum1) {
            System.out.println(this.getName() + " " + this.getSurname() + " лучший Когтевранец, чем " + student.getName() + " " + student.getSurname() + ".");
        } else {
            System.out.println(student.getName() + " " + student.getSurname() + " лучший Когтевранец, чем " + this.getName() + " " + this.getSurname() + ".");
        }
    }
}
