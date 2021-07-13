package org.example.controller;

import org.example.model.Device;
import org.example.model.vo.ResponseData;
import org.example.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/device")
public class DeviceController {


    @Autowired
    private DeviceService deviceService;


    @GetMapping("getDevice")
    public ResponseData getDevice(){
        List<Device> list= deviceService.getDevice();
        return ResponseData.successData(list);
    }

    @GetMapping("getDeviceByName")
    public ResponseData getDeviceByName(String name){
        List<Device> list= deviceService.getDeviceByName(name);
        return ResponseData.successData(list);
    }

    @GetMapping("updateDevice")
    public ResponseData  updateDevice(Device device){
        deviceService.updateDevice(device);
        return ResponseData.successData(null);
    }


    @GetMapping("addDevice")
    public ResponseData  addDevice(Device device){
        deviceService.addDevice(device);
        return ResponseData.successData(null);
    }

    @GetMapping("deleteDevice")
    public ResponseData  deleteDevice(Integer  id){
        if(id==null){
           return ResponseData.errorData(1,"非法参数") ;
        }
        deviceService.deleteDevice(id);
        return ResponseData.successData(null);
    }
}
