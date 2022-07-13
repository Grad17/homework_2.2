public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, String surname, int powerOfWitchcraft, int transgressionRange, int diligence, int loyal, int honest) {
        super(name, surname, powerOfWitchcraft, transgressionRange);

        this.diligence = diligence;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }
    public void printStudent() {
        System.out.println("Имя: " + getName() + " " + getSurname() +
                "; Сила колдовства: " + getPowerOfWitchcraft() +
                "; расстояние трансгрессии: " + getTransgressionRange() +
                "; трудолюбие: " + getDiligence() +
                "; верность: " + getLoyal() +
                "; чесность: " + getHonest() + ".");
    }
    public void compareStudentHufflepuff(Hufflepuff student) {
        int sum = this.getDiligence() + this.getHonest() + this.getLoyal();
        int sum1 = student.getDiligence() + student.getHonest() + student.getLoyal();
        if (sum > sum1) {
            System.out.println(this.getName() + " " + this.getSurname() + " лучший Пуффендуец, чем " + student.getName() + " " + student.getSurname() + ".");
        } else {
            System.out.println(student.getName() + " " + student.getSurname() + " лучший Пуффендуец, чем " + this.getName() + " " + this.getSurname() + ".");
        }
    }
}
