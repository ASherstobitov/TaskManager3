package com.company;

import java.util.Arrays;

public class ArrayTaskList extends AbstractTaskList {
    private Task[] array;
    private static final int DEFAULT_CAPACITY = 10;

    public ArrayTaskList() {
        this.array = new Task[10];
        this.size = 0;
    }

    public ArrayTaskList(int capacity) {
        this.array = new Task[capacity];
        this.size = 0;
    }

    public void add(Task element) {
        if (this.size == this.array.length) {
            this.increaseCapacity();
        }

        this.array[this.size] = element;
        ++this.size;
    }

    private void increaseCapacity() {

        this.array = Arrays.copyOf(this.array, this.size * 2);
    }

    public Task getTask(int index) {
        if (index >= 0 && index < this.size) {
            return this.array[index];
        } else {
            throw new IndexOutOfBoundsException("Выход за граници списка");
        }
    }


    public void removeAt(int index) {
        if (index >= 0 && index < this.size) {
            for(int i = index; i < this.size - 1; ++i) {
                this.array[i] = this.array[i + 1];
            }

            --this.size;
        } else {
            throw new IndexOutOfBoundsException("Выход за граници списка");
        }
    }

    public void remove(Task value) {
        for(int i = 0; i < this.size; ++i) {
            if (this.array[i] == value) {
                this.removeAt(i);
            }
        }
    }

}

