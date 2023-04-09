package lessonDZ6;

public class Notebook {
    String firmName;
    String model;
    String color;
    String cpu;
    String ram;
    String hddValues;
    String screenSize;
    String typeScreen;
    String os;

    public Notebook(String firmName, String model, String color, String cpu, String ram, String hddValues, String screenSize, String typeScreen, String os) {
        this.firmName = firmName;
        this.model = model;
        this.color = color;
        this.cpu = cpu;
        this.ram = ram;
        this.hddValues = hddValues;
        this.screenSize = screenSize;
        this.typeScreen = typeScreen;
        this.os = os;
    }
//    public Notebook(String firmNane, String model, String color, String cpu, String ram, String hddValues, String screenSize, String typeScreen, String os) {
//        this.firmNane = firmNane;
//        this.model = model;
//        this.color = color;
//        this.cpu = cpu;
//        this.ram = ram;
//        this.hddValues = hddValues;
//        this.screenSize = screenSize;
//        this.typeScreen = typeScreen;
//        this.os = os;
//    }

    @Override
    public String toString() {
        return "NB{" + firmName + " |" +
                " model=" + model + " |" +
                " color=" + color + " |" +
                " CPU=" + cpu + " |" +
                " RAM=" + ram + " |" +
                " hddValues=" + hddValues + " |" +
                " typeScreen=" + typeScreen + " |" +
                " screenSize=" + screenSize + " |" +
                " OS=" + os +
                '}';
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
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

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String printShot() {
        return "NB{" + firmName + " |" +
                model + " |" +
                color + " |" +
                cpu + "Gg |" +
                ram + "Gb |" +
                hddValues + "Gb |" +
                typeScreen + " |" +
                screenSize + "'' |" +
                os +
                '}';
    }
}
