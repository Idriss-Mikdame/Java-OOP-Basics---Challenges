public class Personne {
    String names;
    int age;

    public Personne(String names, int age) {
        this.names = names;
        this.age = age;
    }

    public  void Mymethed() {
        System.out.println("Hi, my name is " +names+ " and I am " +age+" years old.");
    }
}
