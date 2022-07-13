public class Main {
    public static void main(String[] args) {

        Gryffindor harry = new Gryffindor("Гарри", "Поттер", 11, 15, 8, 9, 6);
        Gryffindor hermione = new Gryffindor("Гермиона", "Грейнджер", 13, 12, 10, 8, 7);
        Gryffindor ron = new Gryffindor("Рон", "Уизли", 9,9,12,11,14);

        Hufflepuff zachariah = new Hufflepuff("Захария", "Смит", 12, 15, 16,12, 9);
        Hufflepuff cedric = new Hufflepuff("Седрик", "Диггори", 9, 10, 13,10,15);
        Hufflepuff jastin = new Hufflepuff("Джастин", "Финч-Флетчли", 8, 8,9,14,11);

        Ravenclaw zhou = new Ravenclaw("Чжоу", "Чанг", 7, 8, 14, 9,10,11);
        Ravenclaw padma = new Ravenclaw("Падма", "Патил", 14, 11, 12, 9, 7, 12);
        Ravenclaw marcus = new Ravenclaw("Маркус", "Белби", 15, 9, 9, 12, 13, 10);

        Slytherin draco = new Slytherin("Драко", "Малфой", 17, 15, 13, 12, 16, 14, 17);
        Slytherin graham = new Slytherin("Грэхэм", "Монтегю", 12, 8, 10, 11, 7, 9, 12);
        Slytherin gregory = new Slytherin("Грегори", "Гойл", 10, 7, 10, 6, 7, 9,8);

        harry.printStudent();
        hermione.compareStudentGryffindor(ron);
        cedric.compareStudentHufflepuff(jastin);
        padma.compareStudentRavenclaw(marcus);
        graham.compareStudentSlytherin(gregory);
        ron.compareAllStudent(draco);
    }
}