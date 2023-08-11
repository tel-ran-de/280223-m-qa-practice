package com.startainstitute.summary_1108;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReflectionExample {

    public static void main(String[] args) {
        Car car = new Car();
        Class<Car> carClass = Car.class;
        System.out.println(Arrays.toString(carClass.getMethods()));

        @SuppressWarnings("unchecked")
        List<String> obj = (List<String>) Proxy.newProxyInstance(ReflectionExample.class.getClassLoader(), new Class[]{List.class}, new InvocationHandler() {

            private List<String> list = new ArrayList<>();

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                method.ar
//                if (method.getName().equals("add")) {
//                    return list.add((String) args[0]);
//                }
                if (method.getReturnType().equals(int.class)) {
                    return 0;
                }
                if (method.getReturnType().equals(boolean.class)) {
                    return false;
                }
                return null;
            }
        });
//        System.out.println(obj.toString());
        obj.add("foo"); // boolean
//        System.out.println("Size is " + obj.size()); // int
    }
}

class Car {

    public String getName() {
        return "Ford";
    }

    public String getModel() {
        return "";
    }
}
