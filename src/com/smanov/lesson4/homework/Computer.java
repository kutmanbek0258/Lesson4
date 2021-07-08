package com.smanov.lesson4.homework;

public class Computer {
    private ProcessorArchitecture processorArchitecture;
    private int cpuClockSpeed;
    private RAMType ramType;
    private int ramSize;
    private MemoryType memoryType;
    private int memoryVolume;

    public Computer() {}

    public Computer(ProcessorArchitecture processorArchitecture, int cpuClockSpeed, RAMType ramType, int ramSize, MemoryType memoryType, int memoryVolume) {
        this.processorArchitecture = processorArchitecture;
        this.cpuClockSpeed = cpuClockSpeed;
        this.ramType = ramType;
        this.ramSize = ramSize;
        this.memoryType = memoryType;
        this.memoryVolume = memoryVolume;
    }

    public ProcessorArchitecture getProcessorArchitecture() {
        return processorArchitecture;
    }

    public int getCpuClockSpeed() {
        return cpuClockSpeed;
    }

    public RAMType getRamType() {
        return ramType;
    }

    public int getRamSize() {
        return ramSize;
    }

    public MemoryType getMemoryType() {
        return memoryType;
    }

    public int getMemoryVolume() {
        return memoryVolume;
    }
}
