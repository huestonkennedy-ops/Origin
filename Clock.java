public class Clock {
    private int seconds;
    private int hours;
    private int minutes;
    private int miliseconds;
    public Clock() {
        this(0, 0, 0, 0);
    }
    public Clock(int secs, int hours, int mins, int milis) {
        this.seconds = secs;
        this.hours = hours;
        this.minutes = mins;
        this.miliseconds = milis;
    }
    public void milAdvance() {
        if(this.miliseconds<999) {
            this.miliseconds+= 1;
        } else {
            this.miliseconds = 0;
            this.advance();
        }
    }
    public void advance() {
        if (this.seconds==59 && this.minutes==59) {
            this.seconds = 0;
            this.minutes = 0;
            this.hours += 1;
        } else if(this.seconds==59) {
            this.seconds = 0;
            this.minutes += 1;
        } else {
            this.seconds += 1;
        }
    }
    public String toString(){
        return(hours + ":" + minutes + ":" + seconds + ":" + miliseconds);
    }
}