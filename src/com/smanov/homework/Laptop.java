package com.smanov.homework;

public class Laptop extends Computer implements Printable{
    private String processorModel;
    private String manufacturer;
    private String model;
    private int displayDiagonal;
    private int screenResolutionX;
    private int screenResolutionY;
    private int batteryVolume;
    private int powerConsumption;

    public Laptop(ProcessorArchitecture processorArchitecture,
                  int cpuClockSpeed,
                  RAMType ramType,
                  int ramSize,
                  MemoryType memoryType,
                  int memoryVolume,
                  String processorModel,
                  String manufacturer,
                  String model,
                  int displayDiagonal,
                  int screenResolutionX,
                  int screenResolutionY,
                  int batteryVolume,
                  int powerConsumption) {
        super(processorArchitecture, cpuClockSpeed, ramType, ramSize, memoryType, memoryVolume);
        this.processorModel = processorModel;
        this.manufacturer = manufacturer;
        this.model = model;
        this.displayDiagonal = displayDiagonal;
        this.screenResolutionX = screenResolutionX;
        this.screenResolutionY = screenResolutionY;
        this.batteryVolume = batteryVolume;
        this.powerConsumption = powerConsumption;
    }

    public String getProcessorModel() {
        return processorModel;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getDisplayDiagonal() {
        return displayDiagonal;
    }

    public int getScreenResolutionX() {
        return screenResolutionX;
    }

    public int getScreenResolutionY() {
        return screenResolutionY;
    }

    public int getBatteryVolume() {
        return batteryVolume;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    @Override
    public void print() {
        String info;
        info = "Processor Architecture: " + String.valueOf(super.getProcessorArchitecture()) + "\n" +
                "CPU clock speed: " + String.valueOf(super.getCpuClockSpeed()) + "GHz\n" +
                "RAM type: " + String.valueOf(super.getRamType()) + "\n" +
                "RAM size: " + String.valueOf(super.getRamSize()) + "MB\n" +
                "Memory type: " + String.valueOf(super.getMemoryType()) + "\n" +
                "Memory volume: " + String.valueOf(super.getMemoryVolume()) + "MB\n" +
                "Processor model: " + this.processorModel + "\n" +
                "Phone manufacturer: " + this.manufacturer + "\n" +
                "Model: " + this.model + "\n" +
                "Display diagonal: " + this.displayDiagonal + "inch\n" +
                "screen resolution: " + this.screenResolutionX + "x" +this.screenResolutionY + "\n" +
                "battery volume: " + this.batteryVolume + "\n" +
                "power consumption: " + this.powerConsumption + "\n";
        System.out.println(info);
    }
}
