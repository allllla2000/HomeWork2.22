public class Kogtevran extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wittiness;
    private int creativity;

    public void compareStudents(Kogtevran studentTwo) {
        int powerOne = this.intelligence + this.wisdom + this.wittiness + this.creativity;
        int powerTwo = studentTwo.intelligence + studentTwo.wisdom + studentTwo.wittiness + studentTwo.creativity;
        if (powerOne > powerTwo) {
            System.out.println(this.fullName + " сильнее, чем " + studentTwo.fullName);
        } else if (powerTwo > powerOne) {
            System.out.println(studentTwo.fullName + " сильнее, чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " так же силен, как " + studentTwo.fullName);}
    }


    public Kogtevran(String fullName, int magic, int transgression, int intelligence, int wisdom, int wittiness, int creativity) {
        if (intelligence < 0 || intelligence > 100) {
            throw new RuntimeException("Значение intelligence задано неверно");
        }
        if (wisdom < 0 || wisdom > 100) {
            throw new RuntimeException("Значение wisdom задано неверно");
        }
        if (wittiness < 0 || wittiness > 100) {
            throw new RuntimeException("Значение wittiness задано неверно");
        }
        if (creativity < 0 || creativity > 100) {
            throw new RuntimeException("Значение creativity задано неверно");
        }

        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wittiness = wittiness;
        this.creativity = creativity;
        this.fullName = fullName;
        this.magic = magic;
        this.transgression = transgression;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWittiness() {
        return wittiness;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return "\nЯ учусь на факультете Kogtevran. Мои качества:" +
                "\nfullName = " + fullName +
                "\nintelligence = " + intelligence +
                "\nwisdom = " + wisdom +
                "\nwittiness = " + wittiness +
                "\ncreativity = " + creativity +
                "\nmagic = " + magic +
                "\ntransgression = " + transgression;
    }
}

