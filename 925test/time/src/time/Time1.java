package time;

public class Time1
{
    private int hour;
    private int minute;
    private int second;

    public void setTime(int h,int m,int s) 
    {
        if(h<0||h>=24||m<0||m>=60||s<0||s>=60)
        {
            throw new IllegalArgumentException("out of range");

        }
        this.hour=h;
        this.minute=m;
        this.second=s;
    }

    public String toUniversalString()
    {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toString()
    {
        return String.format("%d:%02d:%02d %s",((hour == 0 || hour == 12) ? 12 : hour % 12),minute, second, (hour < 12 ? "AM" : "PM"));
    }
}//end class Time1