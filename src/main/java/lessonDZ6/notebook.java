package lessonDZ6;

public class notebook {
    String firmNane;
    String model;
    String color;
    String cpu;
    String hddValues;
    String screenSize;
    String typeScreen;
    String os;

    public notebook(String firmNane, String model, String color, String cpu, String hddValues, String screenSize, String typeScreen, String os) {
        this.firmNane = firmNane;
        this.model = model;
        this.color = color;
        this.cpu = cpu;
        this.hddValues = hddValues;
        this.screenSize = screenSize;
        this.typeScreen = typeScreen;
        this.os = os;
    }

    @Override
    public String toString() {
        return "NB{" + firmNane + " |" +
                ", model='" + model + " |" +
                ", color='" + color + " |" +
                ", CPU='" + cpu + " |" +
                ", hddValues='" + hddValues + " |" +
                ", screenSize='" + screenSize + " |" +
                ", typeScreen='" + typeScreen + " |" +
                ", OS='" + os + " |" +
                '}';
    }

    public String getFirmNane() {
        return firmNane;
    }

    public void setFirmNane(String firmNane) {
        this.firmNane = firmNane;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getHddValues() {
        return hddValues;
    }

    public void setHddValues(String hddValues) {
        this.hddValues = hddValues;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getTypeScreen() {
        return typeScreen;
    }

    public void setTypeScreen(String typeScreen) {
        this.typeScreen = typeScreen;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}
