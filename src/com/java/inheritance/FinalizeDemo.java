package com.java.inheritance;

class ClassA{
    String str;
    int num;

    public ClassA(String str, int num) {
        this.str = str;
        this.num = num;
    }
    protected void finalize(){
        System.out.println("inside finalize method..");
    }

    @Override
    public String toString() {
        return "ClassA [str=" + str + ", num=" + num + "]";
    }
    
}
public class FinalizeDemo {
    public static void main(String[] args) {
        ClassA obj = new ClassA("piyush", 12);
        obj = null;
        System.out.println("garbage collector called");
        System.gc();
        // obj.finalize();
    }
}
