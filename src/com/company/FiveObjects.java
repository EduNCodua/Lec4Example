package com.company;

/**
 * Created by makovetskyi on 10/31/2016.
 */
public class FiveObjects {

    private Object[] objects = new Object[5];

    public void setObject(Object o, int index) {
        objects[index] = o;
    }

    public Object getObject(int index) {
        return objects[index];
    }

    public void print() {
        for (Object o : objects) {
            System.out.println(o);
        }
    }

    public int find(Object target) {
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

}
