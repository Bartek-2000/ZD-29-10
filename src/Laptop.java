public class Laptop extends Computer{
    private float time;

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    public Laptop(float cpuf, int ram, int hdd, boolean ssd, float price, float time) {
        super(cpuf, ram, hdd, ssd, price);
        this.time = time;
    }
    public String info(){
        return super.info() + ", Lifetime: " + time;

    }
}
