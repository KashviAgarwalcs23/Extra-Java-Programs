class Square{
int side;
Square(){
side =45;
}
void calArea()
{
int area = side*side;
System.out.println("Area : " + area);
}
void calperimeter(){
int perimeter = 4*side;
System.out.println("Perimeter : " + perimeter);
}
public static void main(String args[]){
Square sq = new Square();
sq.calArea();
sq.calperimeter();
System.out.println("Name : Kashvi Agarwal");
System.out.println("USN : 1BM23CS142");
}
}
