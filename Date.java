public class Date {
    private int year;
    private int month;
    private int day;
    public Date(int year) {
        this(year, 1, 1);
    }
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public int getDay() {
        return this.day;
    }
    public int getMonth() {
        return this.month;
    }
    public int getYear() {
        return this.year;
    }
    public void advance() {
        if (this.day==31 && this.month==12) {
            this.day = 1;
            this.month = 1;
            this.year += 1;
        } else if(day==31) {
            this.day = 1;
            this.month += 1;
        } else {
            this.day += 1;
        }
    }
    public String toString() {
        return(this.year + "." + this.month + "." + this.day);
    }
    public boolean equals(Object compared) {
        if(compared == this) {
            return true;
        }
        if (!(compared instanceof Date)) {
            return false;
        }
        if (compared.toString().equals(this.toString())) {
            return true;
        } else {
            return false;
        }
    }
}