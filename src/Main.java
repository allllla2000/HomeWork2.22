public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry Potter", 85, 98, 36, 24, 56);
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger", 27, 87, 84, 91, 22);
        Gryffindor ronWeasley = new Gryffindor("Ron Weasley", 34, 78, 87, 10, 77);
        Kogtevran joeJang = new Kogtevran("Joe Jang", 43, 66, 71, 11, 78, 90);
        Kogtevran padmaPatil = new Kogtevran("Padma Patil", 18, 50, 52, 71, 87, 99);
        Kogtevran marcusBelby = new Kogtevran("Marcus Belby", 84, 89, 12, 62, 33, 80);
        Puffendui zacharySmith = new Puffendui("Zachary Smith", 47, 89, 22, 59, 83);
        Puffendui cedricDiggery = new Puffendui("Cedric Diggery", 82, 86, 18, 39, 81);
        Puffendui justinFinch = new Puffendui("Justin Finch", 73, 92, 58, 28, 44);
        Slytherin dracoeMalfoy = new Slytherin("Dracoe Malfoy", 86, 38, 66, 38, 19, 94, 78);
        Slytherin grahamMontegue = new Slytherin("Graham Montegue", 84, 92, 49, 98, 73, 22, 88);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 46, 27, 93, 34, 99, 73, 47);
        System.out.println(harryPotter);
        System.out.println(padmaPatil);
        System.out.println(zacharySmith);
        System.out.println(gregoryGoyle);
        harryPotter.compareStudents(hermioneGranger);
        hermioneGranger.compareStudents(ronWeasley);
        Hogwarts.compareStudents(hermioneGranger, padmaPatil);
        Hogwarts.compareStudents(grahamMontegue, joeJang);






    }
}