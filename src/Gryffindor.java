public class Gryffindor extends Hogwarts {
    private int nobelness;
    private int honor;
    private int bravery;

    public void compareStudents(Gryffindor studentTwo) {
        int powerOne = this.nobelness + this.honor + this.bravery;
        int powerTwo = studentTwo.nobelness + studentTwo.honor + studentTwo.bravery;
        if (powerOne > powerTwo) {
            System.out.println(this.fullName + " сильнее, чем " + studentTwo.fullName);
        } else if (powerTwo > powerOne) {
            System.out.println(studentTwo.fullName + " сильнее, чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " так же силен, как " + studentTwo.fullName);
        }
    }


    public Gryffindor(String fullName, int magic, int transgression, int nobelness, int honor, int bravery) {
        if (nobelness < 0 || nobelness > 100) {
            throw new RuntimeException("Значение nobelness задано неверно");
        }
        if (honor < 0 || honor > 100) {
                throw new RuntimeException("Значение honor задано неверно");
        }
        if (bravery < 0 || bravery > 100) {
                throw new RuntimeException("Значение bravery задано неверно");
        }
        this.nobelness = nobelness;
        this.honor = honor;
        this.bravery = bravery;
        this.fullName = fullName;
        this.magic = magic;
        this.transgression = transgression;
    }

    public int getNobelness() {
        return nobelness;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return "Я учусь на факультете Gryffindor. Мои качества:" +
                "\nfullName = " + fullName +
                "\nnobelness = " + nobelness +
                "\nhonor = " + honor +
                "\nbravery = " + bravery +
                "\nmagic = " + magic +
                "\ntransgression = " + transgression;
    }
}
