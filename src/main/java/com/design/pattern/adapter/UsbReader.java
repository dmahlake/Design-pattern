package com.design.pattern.adapter;

public class UsbReader implements UsbAdapter{

    MemoryCard memoryCard;

    public UsbReader(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void connectUsbCable() {
        this.memoryCard.insert();
        this.memoryCard.copyData();
    }
}
