package org.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.model.Device;

import java.util.List;

@Mapper
public interface DeviceDao {
    List<Device> getDevice();

    void updateDevice(Device device);

    void addDevice(Device device);

    void deleteDevice(Integer id);

    List<Device> getDeviceByName(String name);
}
