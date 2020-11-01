package com.student.tasks;

public class Time {
    int s,m,h;
    public Time(int h, int m, int s) {
        this.h = (h >=0 && h < 24) ? h : 0;
        this.m = (m >=0 && m < 60) ? m : 0;
        this.s = (s >=0 && s < 60) ? s : 0;
    }

    public Time(Time t) {
        h = t.h;
        m = t.m;
        s = t.s;
    }

    public void setHour(int num) {
        h = num >= 0 && num < 24 ? num : h;
    }

    public void setMinute(int num) {
        m = num >= 0 && num < 60 ? num : m;
    }

    public void setSecond(int num) {
        s = num >= 0 && num < 60 ? num : s;
    }

    public boolean equals(Time t) {
        return t.s == s && t.m == m && t.h == h;
    }

    public int difference(Time t) {
        return Math.abs(t.s+t.m*60+t.h*3600 - (s+m*60+h*3600));
    }

    public void changeTimeZone(int zone) {
        if(zone >= -11 && zone <= 12) {
            if(h+zone >= 24) {
                h += zone - 24;
            } else if (h+zone < 0) {
                h += zone + 24;
            } else h += zone;
        }
    }

    public void winter() {
        h -= 1;
        if(h == 24) h = 0;
    }

    public void summer() {
        h += 1;
        if(h == 24) h = 0;
    }

    public void printTime() {
        String h = (this.h >= 0 && this.h < 10) ? ""+0+this.h : ""+this.h;
        String m = (this.m >= 0 && this.m < 10) ? ":"+0+this.m : ":"+this.m;
        String s =
                    (this.s > 0 && this.s < 10) ? ":"+0+this.s  :
                    (this.s == 0) ? ""                          :
                    ":"+this.s;
        System.out.println("Time: " + h + m + s);
    }
}
