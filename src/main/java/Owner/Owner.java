package Owner;

public class Owner {

    private int age;

    public Owner(int age) {
        this.age = age;
    }

    void celebrateBirthday() {
        this.age++;
    }

    public int getAge() {
        return age;
    }
}
