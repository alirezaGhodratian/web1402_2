public class Time
{
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void SetTime (int hour , int minute ,int second )
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour+":"+minute+":"+second+
                '}';
    }

    public Time nextSecond()
    {
        Time b =new Time(this.hour,this.minute,this.second);
        b.setSecond(second+1);

        if(b.getSecond()==60)
        {
            b.setSecond(0);
            b.setMinute(minute+1);

        }
        if(b.getMinute()==60)
        {
            b.setMinute(0);
            b.setHour(hour+1);

        }

        return b;

    }

    public Time previousSecond()
    {
        Time b =new Time(this.hour,this.minute,this.second);
        b.setSecond(second-1);

        if(b.getSecond()==0)
        {
            b.setSecond(59);
            b.setMinute(minute-1);

        }
        if(b.getMinute()==0)
        {
            b.setMinute(59);
            b.setHour(hour-1);

        }

        return b;

    }



}
