class Person{
    String name;
    int age;
    public void introduce()
    {
       name = "Mayur Shahani";
       age = 78;
       System.out.println("Hello My Name Is " + name + "and I am " + age + " years old");       
    }
}
  class Student extends Person{
    String School;

  }

public class Question_2 {
    public static void main(String[] args) {
        Student st = new Student();
        st.introduce();
    }
}
