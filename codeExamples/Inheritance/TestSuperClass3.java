/**
 *  super is used to invoke parent class constructor.
 */

 class Animal2{
    Animal2(){System.out.println("animal is created");}
}
class Dog2 extends Animal2{
    Dog2(){
        super();
        System.out.println("dog is created");
    }
}
class TestSuperClass3{
    public static void main(String[] args){
        Dog2 d=new Dog2();

    }
}
