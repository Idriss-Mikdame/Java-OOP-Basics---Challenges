public class Student {
    String Name,gard;
    int Age;

    public Student(String name, int age, String gard) {
        this.Name = name;
        this.Age = age;
        this.gard = gard;
    }

    public   void VarStudent(){
        System.out.println("Name : "+Name);
        System.out.println("Age  : "+Age);
        System.out.println("Gard :"+gard);
    }
}
