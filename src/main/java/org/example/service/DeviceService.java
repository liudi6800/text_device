package org.example.service;

import org.example.model.Device;

import java.util.List;

public interface DeviceService {
    List<Device> getDevice();

    void updateDevice(Device device);

    void addDevice(Device device);

    void deleteDevice(Integer id);

    List<Device> getDeviceByName(String name);
}
