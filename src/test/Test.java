package test;

/**
 * Created by Ксения on 30.05.2015.
 */
public class Test {
    String name;

    public Test(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

    }
}

class Test2 extends Test {

    public Test2(String name) {
        super(name);
        this.name = name;
    }
}