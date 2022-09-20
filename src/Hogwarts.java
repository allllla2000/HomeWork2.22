public abstract class Hogwarts {
      int magic;
      int transgression;
      String fullName;


    public static void compareStudents(Hogwarts studentOne, Hogwarts studentTwo) {
        int powerOne = studentOne.magic + studentOne.transgression;
        int powerTwo = studentTwo.magic + studentTwo.transgression;
        if (powerOne > powerTwo) {
            System.out.println (studentOne.fullName + " сильнее, чем " + studentTwo.fullName);
        } else if (powerTwo > powerOne) {
            System.out.println(studentTwo.fullName + " сильнее, чем " + studentOne.fullName);
        } else {
            System.out.println(studentOne.fullName + " так же силен, как " + studentTwo.fullName);
        }

    }



    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
            if (magic < 0 || magic > 100){
                throw new RuntimeException("Неверное значение");
            }
        this.magic = magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        if (transgression < 0 || transgression > 100){
            throw new RuntimeException("Неверное значение");
        }
        this.transgression = transgression;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
