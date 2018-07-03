package com.wptdxii.playground.design_pattern.singleton;


import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Client {
    private static final String FILE_NAME = "dispose.iml";

    public static void main(String[] args) {
        testEagerSingleton();
        testLazySingleton();
        testDCLSingleton();
        testHolderSingleton();
        testEnumSingleton();
    }

    private static void testEagerSingleton() {
        EagerSingleton instance = EagerSingleton.getInstance();
        System.out.println(instance);
        dispose(instance);
    }

    private static void testLazySingleton() {
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println(instance);

        dispose(instance);
    }

    private static void testDCLSingleton() {
        DCLSingleton instance = DCLSingleton.getInstance();
        System.out.println(instance);

        dispose(instance);
    }

    private static void testHolderSingleton() {
        HolderSingleton instance = HolderSingleton.getInstance();
        System.out.println(instance);

        dispose(instance);
//        HolderSingleton result = reflect(instance);
//        System.out.println("reflect@" + result);
    }

    private static void testEnumSingleton() {
        System.out.println(EnumSingleton.INSTANCE);
        dispose(EnumSingleton.INSTANCE);

//        EnumSingleton result = reflect(EnumSingleton.INSTANCE);
//        System.out.println(result);
    }

    /**
     * serialize then deserialize
     *
     * @param instance
     * @param <T>
     * @return
     */
    private static <T extends Serializable> void dispose(T instance) {
        T result;
        try {
            FileOutputStream fos = new FileOutputStream(FILE_NAME);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(instance);
            oos.flush();
            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream(FILE_NAME);
            ObjectInputStream ois = new ObjectInputStream(fis);
            result = (T) ois.readObject();
            ois.close();
            fis.close();

            System.out.println(result);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * get instance through Reflection
     *
     * @param t
     * @param <T>
     * @return
     */
    private static <T extends Serializable> T reflect(T t) {
        T result = null;
        try {
            Constructor constructor = t.getClass().getDeclaredConstructor();
            constructor.setAccessible(true);
            result = (T) constructor.newInstance();
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return result;
    }
}
