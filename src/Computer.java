public class Computer {
    private float cpuf;
    private int ram;
    private int hdd;
    private boolean ssd;
    private float price;

    public Computer(float cpuf, int ram, int hdd, boolean ssd, float price) {
        this.cpuf = cpuf;
        this.ram = ram;
        this.hdd = hdd;
        this.ssd = ssd;
        this.price = price;
    }

    public float getCpuf() {
        return cpuf;
    }

    public void setCpuf(float cpuf) {
        this.cpuf = cpuf;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public boolean isSsd() {
        return ssd;
    }

    public void setSsd(boolean ssd) {
        this.ssd = ssd;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public String info(){
        return "CPU fequency: "+cpuf + ", RAM: " +ram+ ", HDD: "+ hdd+ ", SSD: "+ssd+ ", Price: "+ price;
    }
}
