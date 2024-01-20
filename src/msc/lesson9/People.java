package msc.lesson9;

public class People {
    private String name;
    private int age;
    private String gender;

    //public People(){
    //}

    public People(String name,int age, String gender){ // приняли параметры, далее нужно их сохранить
        this.name = name; //this.name - общий класс, просто name - параметр передаваемый в скобках
        this.age = age; // то есть age передает свое значение, пришедшее с параметра, в переменную экземпляра
        this.gender = gender;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }





}
