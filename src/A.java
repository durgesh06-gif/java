public class A {
    public static void main(String[] args){
        System.out.println("hello");
        System.out.println("this is java");

// Data Type Primitive
        //int
        int age= 30;
        System.out.println(age);

        //double
        double gpa=3.43;
        double price=12.3;
        double pi=3.14159;
        System.out.println(pi);
        System.out.println(gpa);
        System.out.println(price);

        //char
        char grade='A';
        System.out.println(grade);

        //boolean use camle case the first char should be
        // lowere case an second should start with upper case
        boolean isStd=true;
        boolean forsale=false;
        System.out.println(isStd);

        if(isStd){
            System.out.println("u r a student");
        }
        else{
            System.out.println("not student");
        }

//Reference Data Type

        //String
        String name="jhon sir";
        String  car="BMW";
        System.out.println("your name is:"+name);
        System.out.println("you have :"+car);
        System.out.println("your are"+" " +age+" "+"year old");
    }
}
