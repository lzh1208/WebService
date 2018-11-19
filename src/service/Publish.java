package service;

import javax.xml.ws.Endpoint;

/**
 * Created by liuzehui on 2018/5/15.
 */
public class Publish {
    public static void main(String args[]){
        Object implementor = new TestWsImpl();
        String address = "http://localhost:8989/HelloWorld";     //发布到的地址
        Endpoint.publish(address, implementor);
        System.out.println("发布成功");
    }
}
