package com.codecool.dynamicArrayDojo;

// put your code here!
public class DynamicIntArray {
    int length;
    int[] data = new int[length];

    public DynamicIntArray(int x) {
        length=x;
        data = new int[length];
    }

    public DynamicIntArray() {
        length = 0;
        data = new int[length];
    }

    public void add(int element) {
        int[] result = new int[this.data.length+1];
        for (int i=0; i<this.data.length; i++) {
            result[i] = this.data[i];
        }
        result[result.length-1] = element;
        this.data = new int[result.length];
        for (int i=0; i<result.length; i++) {
            this.data[i] = result[i];
        }
    }

    public void remove(int element) {
        int[] result = new int[this.data.length-1];
        for (int i=0; i<element; i++) {
            result[i] = this.data[i];
        }
        for (int i=element; i<result.length; i++) {
            result[i] = this.data[i+1];
        }
        this.data = new int[result.length];
        for (int i=0; i<result.length; i++) {
            this.data[i] = result[i];
        }
    }

    public void insert(int index, int value) {
        int[] result = new int[this.data.length+1];
        if (index>this.data.length) {
            index = this.data.length;
        }
        for (int i=0; i<index; i++) {
            result[i] = this.data[i];
        }
        result[index] = value;
        for (int i=index; i<this.data.length; i++) {
            result[i+1] = this.data[i];
        }
        this.data = new int[result.length];
        for (int i=0; i<result.length; i++) {
            this.data[i] = result[i];
        }
    }

    public String toString() {
        String result = "";
        for (int i=0; i<this.data.length; i++) {
            result += " " + this.data[i];
        }
        return result;
    }

}
