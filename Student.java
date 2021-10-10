package m1_testing_alvaro_garcia;

public class Student {

    //Atrtibutes
    public String name;
    public String surname;
    public int age;
    public int telefono;

    //Builder
    //Empty builder.
    public Student(){}

    //Full builder
    public Student(String name, String surname, int age, int telefono){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.telefono = telefono;

    }


    //Methods getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "M1_Challenge.Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", telefono=" + telefono +
                '}';
    }
}
