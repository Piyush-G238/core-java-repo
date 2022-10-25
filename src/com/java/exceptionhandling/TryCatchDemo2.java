package com.java.exceptionhandling;

class ClassDemo {
    int a;
    String str;

    public ClassDemo(int a, String str) {
        this.a = a;
        this.str = str;
    }

    @Override
    public String toString() {
        return "ClassDemo [a=" + a + ", str=" + str + "]";
    }

}

public class TryCatchDemo2 {
    public static void main(String[] args) {
        try {
            ClassDemo obj = new ClassDemo(12, "Alphabets");
            int res = obj.a / 10;
            obj = null;
            System.out.println(res);
        } 
        catch (NullPointerException e) {
            e.printStackTrace();
        } 
        catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
