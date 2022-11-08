public class Author {
    private String name;
    private int age;
    private char gender;

    public Author(String name, int age, char gender) {
        this.name = name;
        this.age=age;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public char getGender() {
        return gender;
    }
    public String toString() {
        String info = this.name + "(" + this.gender + ") at " + this.age;
        return info;

    }
    public void getInfo(){
        System.out.println("name = " + name);
        System.out.println("gender = " + gender);
        System.out.println("age = " + age);
    }
}

