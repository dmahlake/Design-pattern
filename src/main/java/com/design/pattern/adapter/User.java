package com.design.pattern.adapter;

public class User {

    public static void main(String[] args) {
         UsbAdapter usbAdapter = new UsbReader(new MemoryCard());
         usbAdapter.connectUsbCable();
    }
}
