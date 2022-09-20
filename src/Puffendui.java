public class Puffendui extends Hogwarts {

    private int hardworking;
    private int loyalty;
    private int honesty;

    public Puffendui(String fullName, int magic, int transgression, int hardworking, int loyalty, int honesty) {
        if (hardworking < 0 || hardworking > 100) {
            throw new RuntimeException("Значение hardworking задано неверно");
        }
        if (loyalty < 0 || loyalty > 100) {
            throw new RuntimeException("Значение loyalty задано неверно");
        }
        if (honesty < 0 || honesty > 100) {
            throw new RuntimeException("Значение honesty задано неверно");
        }
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
        this.fullName = fullName;
        this.magic = magic;
        this.transgression = transgression;
    }

    public void compareStudents(Puffendui studentTwo) {
        int powerOne = this.hardworking + this.loyalty + this.honesty;
        int powerTwo = studentTwo.hardworking + studentTwo.loyalty + studentTwo.honesty;
        if (powerOne > powerTwo) {
            System.out.println(this.fullName + " сильнее, чем " + studentTwo.fullName);
        } else if (powerTwo > powerOne) {
            System.out.println(studentTwo.fullName + " сильнее, чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " так же силен, как " + studentTwo.fullName);
        }
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return "Я учусь на факультете Puffendui. Мои качества: " +
                "\nfullName = " + fullName +
                "\nhardworking = " + hardworking +
                "\nloyalty = " + loyalty +
                "\nhonesty = " + honesty +
                "\nmagic = " + magic +
                "\ntransgression = " + transgression;
    }
}

