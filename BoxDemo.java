class Box{
double width,height,depth;
}
class BoxDemo{
public static void main(String args[]){
Box mybox1 = new Box();
Box mybox2 = new Box();
double vol;
mybox1.width = 10;
mybox1.height = 20;
mybox1.depth = 30;
mybox2.width = 100;
mybox2.height = 200;
mybox2.depth = 300;
vol  = mybox1.width * mybox1.height * mybox1.depth;
System.out.println("Volume of first box is " + vol);
vol  = mybox2.width * mybox2.height * mybox2.depth;
System.out.println("Volume of second box is " + vol);

System.out.println("Name : Kashvi Agarwal");
System.out.println("USN : 1BM23CS142");
}
}