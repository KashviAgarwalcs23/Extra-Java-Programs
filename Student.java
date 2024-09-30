class Student{
String name,rollno;
int age;
Student(){
name = "Kashvi Agarwal";
rollno = "1BM23CS142";
age = 18;
}
void display(){
System.out.println("Student's name : " + name);
System.out.println("Student's rollno : " + rollno);
System.out.println("Student's age : " + age);
}
public static void main(String args[]){
Student s1 = new Student();
s1.display();
}
}