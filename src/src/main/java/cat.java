public class cat {
    String name;
    private int age;
    public void meow() {
        System.out.print("Meow");
    }
    public int getAge(){
        return age;
    }
    public cat(String name, int age){
     this.name= name;
     this.age = age;
    }
}
