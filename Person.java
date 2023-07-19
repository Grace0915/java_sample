public class Person {
    public enum Gender {
        MALE,
        FEMALE
    }

    private Gender gender;

    public Person(Gender gender) {
        this.gender = gender;
    }

    public void speak() {
        if (gender == Gender.MALE) {
            System.out.println("I'm a man");
        } else if (gender == Gender.FEMALE) {
            System.out.println("I'm a woman");
        }
    }

    public static void main(String[] args) {
        Person malePerson = new Person(Gender.MALE);
        Person femalePerson = new Person(Gender.FEMALE);

        malePerson.speak();
        femalePerson.speak();
    }
}
