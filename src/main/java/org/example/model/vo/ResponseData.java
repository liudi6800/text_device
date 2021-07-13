package org.example.model.vo;

public class ResponseData {
    private Integer code;
    private String message;
    private Object data;

    private ResponseData(){

    }

    public static ResponseData  successData(Object data){
        ResponseData re=new ResponseData();
        re.setData(data);
        re.setCode(200);
        re.setMessage("请求成功");
        return re;
    }

    public static ResponseData errorData(Integer code,String message){
        ResponseData re=new ResponseData();
        re.setData(null);
        re.setCode(code);
        re.setMessage(message);
        return re;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
