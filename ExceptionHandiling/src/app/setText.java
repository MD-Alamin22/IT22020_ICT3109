package app;

//package app;

import exceptions.MyException;

public class setText {
    public static void main(String args[]) {
        try {
            throw new MyException("This is a custom exception");
        } catch (MyException ex) {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
}
