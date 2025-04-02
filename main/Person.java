package main;

public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;
    private String eyeColor;
    private String gender;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Person p = new Person("James Bond",42,183,82,"Brown", "MALE");
        System.out.println("Name:" + p.getName());
        System.out.println("Age:" + p.getAge());
        System.out.println("Height (cm):" + p.getHeight());
        System.out.println("Weight (kg):" + p.getWeight());
        System.out.println("Eye Color:" + p.getEyeColor());
        System.out.println("Gender:" + p.getGender());
    }


    public Person(String name, int age, int height,int weight, String eyeColor, String gender) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.gender = gender;
    }

    public Person() {
        super();
    }




    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getEyeColor() {
        return eyeColor;
    }
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }




}
