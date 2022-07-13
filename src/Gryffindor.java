import javax.xml.namespace.QName;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String surname, int powerOfWitchcraft, int transgressionRange, int nobility, int honor, int bravery) {
        super(name, surname, powerOfWitchcraft, transgressionRange);

        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
    public void printStudent() {
        System.out.println("Имя: " + getName() + " " + getSurname() +
                "; сила колдовства: " + getPowerOfWitchcraft() +
                "; расстояние трансгрессии: " + getTransgressionRange() +
                "; блвгородство: " + getNobility() +
                "; честь: " + getHonor() +
                "; храбрость: " + getBravery() + ".");
    }
    public void compareStudentGryffindor(Gryffindor student) {
        int sum = this.getNobility() + this.getHonor() + this.getBravery();
        int sum1 = student.getNobility() + student.getHonor() + student.getBravery();
        if (sum > sum1) {
            System.out.println(this.getName() + " " + this.getSurname() + " лучший Гриффиндорец, чем " + student.getName() + " " + student.getSurname() + ".");
        } else {
            System.out.println(student.getName() + " " + student.getSurname() + " лучший Гриффиндорец, чем " + this.getName() + " " + this.getSurname() + ".");
        }
    }
}
