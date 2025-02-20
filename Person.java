class Person {
    String name;
    String lastName;
    int age;

    public Person(String name, int age, String lastname) {
        this.name = name;
        this.age = age;
        this.lastName = lastname;
    }
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.lastName = "k.a.";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String getLastName() {
        return lastName;
    }
    @Override
    public String toString() {
        return name + " " + lastName + " (" + age + ")";
    }
}