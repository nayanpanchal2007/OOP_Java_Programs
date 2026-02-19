class Time {
    int hours;
    int minutes;

    void setTime(int h, int m) {
        hours = h;
        minutes = m;
    }

    void displayTime() {
        System.out.println(hours + " hours " + minutes + " minutes ");
    }

    void addTime(Time t1, Time t2) {
        hours = t1.hours + t2.hours;
        minutes = t1.minutes + t2.minutes;

        if (minutes >= 60) {
            hours += minutes / 60;
            minutes %= 60;
        }
    }
}

public class Time_Practical {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time();
        Time result = new Time();

        t1.setTime(2, 45);
        t2.setTime(3, 30);

        System.out.print("Time 1:- ");
        t1.displayTime();

        System.out.print("Time 2:- ");
        t2.displayTime();

        result.addTime(t1, t2);

        System.out.print("Total time:- ");
        result.displayTime();

    }    
}
