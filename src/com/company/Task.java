package com.company;

public class Task {
    private String title;
    private boolean isActive;
    private int start;
    private int end;
    private int repeat;



    public void setTime(int time) {
        start = time;
        end = time;
        repeat = 0;
    }
    public Task(String title, int start, int end, int repeat) {
        setTitle(title);
        setTime(start, end, repeat);
    }

    public Task(String title, int start) {
        setTitle(title);
        setTime(start);
    }


    public void setTime(int start, int end, int repeat) {
        this.start = start;
        this.end = end;
        this.repeat = repeat;
    }
    public int getTime() {
        return start;
    }

    public int getStartTime() {
        return start;
    }
    public int getEndTime() {
        return end;
    }
    public int getRepeatInterval() {
        return repeat;
    }
    public boolean isRepeated() {
        return repeat > 0;
    }

    public int nextTimeAfter(int time) {
        if (isActive == false || time < 0) {
        return -1;}
        if (repeat == 0 && time >= start) {
            return -1;
        }

        int begin = start;
        while (begin <= time) {
            begin +=repeat;
        }
        if (begin > end) {
            return -1;
        }

        return begin;
    }



    @Override
    public String toString() {

        return super.toString();
    }



    public void setActive(boolean active) {

        isActive = active;
    }

    public boolean isActive() {

        return isActive;
    }

    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }

}
