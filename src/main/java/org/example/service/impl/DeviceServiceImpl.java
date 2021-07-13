package org.example.service.impl;

import org.example.dao.DeviceDao;
import org.example.model.Device;
import org.example.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeviceServiceImpl implements DeviceService {

    @Autowired
    private DeviceDao deviceDao;


    @Override
    public List<Device> getDevice() {
        return  deviceDao.getDevice();
    }

    @Override
    public void updateDevice(Device device) {
        deviceDao.updateDevice(device);
    }

    @Override
    public void addDevice(Device device) {
        deviceDao.addDevice(device);
    }

    @Override
    public void deleteDevice(Integer id) {
        deviceDao.deleteDevice(id);
    }

    @Override
    public List<Device> getDeviceByName(String name) {
        return  deviceDao.getDeviceByName(name);
    }
}
