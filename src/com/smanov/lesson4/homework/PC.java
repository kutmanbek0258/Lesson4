package com.smanov.lesson4.homework;

public class PC extends Computer implements Printable{
    private String processorModel;
    private String manufacturer;
    private int caseHeight;
    private int caseLength;
    private int powerConsumption;

    public PC(ProcessorArchitecture processorArchitecture,
              int cpuClockSpeed,
              RAMType ramType,
              int ramSize,
              MemoryType memoryType,
              int memoryVolume,
              String processorModel,
              String manufacturer,
              int caseHeight,
              int caseLength,
              int powerConsumption) {
        super(processorArchitecture, cpuClockSpeed, ramType, ramSize, memoryType, memoryVolume);
        this.processorModel = processorModel;
        this.manufacturer = manufacturer;
        this.caseHeight = caseHeight;
        this.caseLength = caseLength;
        this.powerConsumption = powerConsumption;
    }

    public String getProcessorModel() {
        return processorModel;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getCaseHeight() {
        return caseHeight;
    }

    public int getCaseLength() {
        return caseLength;
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
                "PC manufacturer: " + this.manufacturer + "\n" +
                "Case height: " + this.caseHeight + "mm\n" +
                "Case length: " + this.caseLength + "mm\n" +
                "Power consumption: " + this.powerConsumption + "Watt\n";
        System.out.println(info);
    }
}
