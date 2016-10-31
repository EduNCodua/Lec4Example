package com.company;

/**
 * Created by makovetskyi on 10/31/2016.
 */
public class GFiveObjects<T> {

    private Object[] objects = new Object[5];

    public void setObject(T o, int index) {
        objects[index] = o;
    }

    public T getObject(int index) {
        return (T) objects[index];
    }

    public void print() {
        for (Object o : objects) {
            System.out.println(o);
        }
    }

    public int find(T target) {
        for (int i = 0; i < 5; i++) {
            if (target.equals(objects[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean isClassOfAll(Class clazz) {
        for (Object o : objects) {
            if (o.getClass() != clazz) {
                return false;
            }
        }
        return true;
    }

//    private T[] objects = (T[]) new Object[5];
//
//    public void setObject(T o, int index) {
//        objects[index] = o;
//    }
//
//    public T getObject(int index) {
//        return objects[index];
//    }
//
//    public void print() {
//        for (T o : objects) {
//            System.out.println(o);
//        }
//    }
//
//    public int find(T target) {
//        for (int i = 0; i < 5; i++) {
//            if (target.equals(objects[i])) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    public boolean isClassOfAll(Class clazz) {
//        for (T o : objects) {
//            if (o.getClass() != clazz) {
//                return false;
//            }
//        }
//        return true;
//    }

}
