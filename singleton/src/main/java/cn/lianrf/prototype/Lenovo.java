package cn.lianrf.prototype;

/**
 * Created by lianrongfa on 2018/3/18.
 */
public class Lenovo extends Computer {
    private Cpu cpu;

    public Lenovo(){
        this.cpu =new Cpu();
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }
}
