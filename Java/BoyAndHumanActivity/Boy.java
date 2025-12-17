class Boy extends Human {
    int age = 10;
    // age = super.age;
    //Overriding method
    public void eat() {
        System.out.println("Boy is eating");
    }
    
    public static void main( String args[]) {
        Boy obj = new Boy();
        //This will call the child class version of eat()
        // obj.eat();
        System.out.println(obj.age);
    }
}
