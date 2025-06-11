
import com.sun.jdi.event.ThreadStartEvent;



public class OOPS {
    public static void main(String[] args) {
        //Craete a object for the class
        Pen reyonds = new Pen();
        reyonds.setColor("blue");
        reyonds.price = 10;
        reyonds.setType("Ball");
        System.out.println(reyonds.color);
        System.out.println(reyonds.price);
        System.out.println(reyonds.type);
        // reyonds.tip = 10;
        reyonds.setTip(5);
        int tip = reyonds.getTip(); //getter
        System.out.println("Reyonds tip = "+tip);


        //
        BankAccount newAcc = new BankAccount();
        newAcc.username = "srisha";
        //newAcc.password = "abcd"; -> Field not visible due to it being private
        newAcc.setPassword("agsydwdh");
        //can use via func but cant access it



        //
        Student s1 = new Student();
        // Student s2 = new Student("srisha");   //can include argument in constructor
        // System.out.println(s2.name);
        s1.name = "Srisha";
        s1.roll = 1;
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
         for(int i =0; i < 3; i++){
            System.out.print(s1.marks[i]+" ");
        }

        //Copy Constructor
        Student s3 = new Student(s1);   //s3 copy of s1
        s1.marks[2] = 98;

        System.out.println(s3.name);

        for(int i =0; i < 3; i++){
            System.out.print(s3.marks[i]+" ");
        }



    }
}

class Pen{

    //Atrributes
    String color;
    private int tip;
    int price;
    String type;

    //Behaviour -> Functions -> can change the attributes
    void setColor(String newColor){  //setter
        color = newColor;
    }

    void setPrice(int newPrice){  //setter
        price = newPrice;
    }

    void setType(String newType){  //setter
        type = newType;
    }

    String getColor(){  //getter
        return this.color;
    }

    void setTip(int tip){  //setter
        this.tip = tip;   //this is a reference to obj -> used when external variable name is same
    }

    int getTip(){  //getter
        return this.tip;
    }



}


class Student{
    //attr-
    String name;
    int roll;
    String gender;
    Float grade;
    int marks[];

    Student(){   //non paramterized constructor
        marks = new int[3];
        System.out.println("Constructor is called....");

    }

    Student(String name){   //paramterrized constructor
        //constructor
        marks = new int[3];
        this.name = name;
    }


    //shallow copy constructor

    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

//     But when you do this.marks = s1.marks, you are not copying the marks themselves.

// Instead, you are sharing the same array between both students.

// So both students now point to the same memory for marks.

    //deep copy constructor

    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i =0; i < marks.length; i++){
            this.marks[i] = s1.marks[i];
            //This ensures the values are the same, but the array is not shared.
        }
    }


    //Constructor over;loading

    //beh
    void setName(String newName){
        name = newName;
    }

    void setGender(String newGender){
        gender = newGender;
    }

    void setGrade(Float newGrade){
        grade = newGrade;
    }

}

class BankAccount{
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
}



