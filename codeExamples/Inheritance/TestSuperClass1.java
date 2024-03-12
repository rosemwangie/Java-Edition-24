/**
 * Super can be used to refer immediate parent class instance variable.
 */



 class Animal{
    String color="white";
}
class Dog extends Animal{
    String color="black";
    void printColor(){
        System.out.println(color);//prints color of Dog class
        System.out.println(super.color);//prints color of Animal class
    }
}
class TestSuperClass1{
    public static void main(String[] args){
        Dog d=new Dog();
        d.printColor();
    }
}

