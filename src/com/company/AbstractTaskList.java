package com.company;

public abstract class AbstractTaskList {

    protected int size;

    public abstract void add(Task task);

    public abstract void remove(Task task);

    public int size() {
        return this.size;
    }

    public abstract Task getTask(int index);

}


