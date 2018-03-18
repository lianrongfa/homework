package cn.lianrf.prototype;

import java.io.*;

/**
 * Created by lianrongfa on 2018/3/18.
 */
public class Samsung extends Computer{

    private Cpu cpu;

    public Samsung() {
        this.cpu = new Cpu();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ObjectOutputStream obo = new ObjectOutputStream(outputStream);
            obo.writeObject(this);

            ObjectInputStream inputStream = new ObjectInputStream(new ByteArrayInputStream(outputStream.toByteArray()));

            Samsung o = (Samsung)inputStream.readObject();

            return o;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }
}
