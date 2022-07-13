public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustOfPower;

    public Slytherin(String name, String surname, int powerOfWitchcraft, int transgressionRange, int cunning, int determination, int ambition, int resourcefulness, int lustOfPower) {
        super(name, surname, powerOfWitchcraft, transgressionRange);

        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustOfPower = lustOfPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustOfPower() {
        return lustOfPower;
    }

    public void setLustOfPower(int lustOfPower) {
        this.lustOfPower = lustOfPower;
    }
    public void printStudent() {
        System.out.println("Имя: " + getName() + " " + getSurname() +
                "; Сила колдовства: " + getPowerOfWitchcraft() +
                "; расстояние трансгрессии: " + getTransgressionRange() +
                "; хитрость: " + getCunning() +
                "; решительность: " + getDetermination() +
                "; амбициозность: " + getAmbition() +
                "; находчивость: " + getResourcefulness() +
                "; жажда власти: " + getLustOfPower() + ".");
    }
    public void compareStudentSlytherin(Slytherin student) {
        int sum = this.getAmbition() + this.getLustOfPower() + this.getResourcefulness() + this.getDetermination()+this.getCunning();
        int sum1 = student.getAmbition() + student.getLustOfPower() + student.getResourcefulness() + student.getDetermination()+student.getCunning();
        if (sum > sum1) {
            System.out.println(this.getName() + " " + this.getSurname() + " лучший Слизеринец, чем " + student.getName() + " " + student.getSurname() + ".");
        } else {
            System.out.println(student.getName() + " " + student.getSurname() + " лучший Слизеринец, чем " + this.getName() + " " + this.getSurname() + ".");
        }
    }
}
