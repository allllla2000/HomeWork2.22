public class Slytherin extends Hogwarts {
    private int smart;
    private int determination;
    private int ambitions;
    private int ingenuity;
    private int hungryForThePower;

    public Slytherin(String fullName, int magic, int transgression, int smart, int determination, int amitions, int ingenuity, int hungryForThePower) {
        if (smart < 0 || smart > 100) {
            throw new RuntimeException("Значение smart задано неверно");
        }
        if (determination < 0 || determination > 100) {
            throw new RuntimeException("Значение determination задано неверно");
        }
        if (amitions < 0 || amitions > 100) {
            throw new RuntimeException("Значение amitions задано неверно");
        }
        if (ingenuity < 0 || ingenuity > 100) {
            throw new RuntimeException("Значение ingenuity задано неверно");

        }
        if (hungryForThePower < 0 || hungryForThePower > 100) {
            throw new RuntimeException("Значение hungryForThePower передано неверно");
        }
        this.smart = smart;
        this.determination = determination;
        this.ambitions = ambitions;
        this.ingenuity = ingenuity;
        this.hungryForThePower = hungryForThePower;
        this.fullName = fullName;
        this.magic = magic;
        this.transgression = transgression;
    }

    public void compareStudents(Slytherin studentTwo) {
        int powerOne = this.smart + this.determination + this.ambitions + this.ingenuity + this.hungryForThePower;
        int powerTwo = studentTwo.smart + studentTwo.determination + studentTwo.ambitions + studentTwo.ingenuity + studentTwo.hungryForThePower;
        if (powerOne > powerTwo) {
            System.out.println(this.fullName + " сильнее, чем " + studentTwo.fullName);
        } else if (powerTwo > powerOne) {
            System.out.println(studentTwo.fullName + " сильнее, чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " так же силен, как " + studentTwo.fullName);
        }
    }

    @Override
    public String toString() {
        return "Я учусь на факультете Slytherin. Мои качества:" +
                "\nfullName = " + fullName +
                "\nsmart = " + smart +
                "\ndetermination = " + determination +
                "\nambitions = " + ambitions +
                "\ningenuity = " + ingenuity +
                "\nhungryForThePower = " + hungryForThePower;
    }
}
