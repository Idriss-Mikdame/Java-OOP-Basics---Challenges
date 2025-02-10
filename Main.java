public class Main {
    public static void main(String[] args) {

        Personne obj1 = new Personne("idrss",22);
        obj1.Mymethed();
        System.out.println("--------------------------------");
        Student obj2 = new Student("idriss",22,"A");
        obj2.VarStudent();
        System.out.println("--------------------------------");
        BankAccount obj3 = new BankAccount(111,99);
        System.out.println(obj3.getAccountNumber());
        System.out.println(obj3.isBalance());
        obj3.setAccountNumber(222);
        obj3.setBalance(66);
        System.out.println(obj3.getAccountNumber());
        System.out.println(obj3.isBalance());

    }
}