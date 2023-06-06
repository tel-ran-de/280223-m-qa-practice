package com.startainstitute.oop;

@SuppressWarnings("unused")
public class JavaTypesOverview {

    public static void main(String[] args) {
        // primitive types (add more)
        boolean boolVal = true;
        int intVal = 54;
        byte byteVal = (byte) 2;
        short shortVal = (short) 2;
        // long , char, double, float

        int[] arr = new int[]{1, 2, 3};
        Integer[] arrBig = new Integer[]{(Integer) 1, (Integer) 2, (Integer) 3};
        // int -> 4 byte -> 2 ^ 32 -> 2 * 10 ^ 9
        // Integer -> 12 byte -> (4 hashcode + class reference 4 + header)
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // objects (String, arrays)
        Integer objInteger = 12;
        Object[] studentAntonArr = new Object[]{"Anton", 2389L, "4.99"};

        String arrName = (String) studentAntonArr[0];


        Student anton = new Student("Anton");
        int hashCode = anton.hashCode();
        Class<?> studentCls = anton.getClass();


        String name = anton.getName();
        Student vika = new Student("Vika");
        Object objectVal = new Object();

        // common methods
//        int hashCode = objectVal.hashCode();
        Class<?> cls = objectVal.getClass();
        String stringRepresentation = objectVal.toString();
        System.out.println("An objectVal.toString() is " + stringRepresentation);

        // 1. An Object is an instance of a Class;
        // 2. Java has primitive types and objects in memory only.
        // 3. Objects take more space compared to primitives.
        // 4. Objects are the way to use abstractions.
    }

    private Number createNumber() {
        Double d = (Double) 1.2;

        int hashCode = d.hashCode();
        return d;
    }

    private int createNumberPrimitive() {
        return (int) 12.2;
    }

    private Human createHuman() {
        return null;
    }
}

interface Human {

    String getName();
}

class Student {

    private final String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


