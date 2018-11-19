package service;

import javax.jws.WebMethod;
import javax.jws.WebService;
/**
 * Created by liuzehui on 2018/5/15.
 */

@WebService
public class TestWsImpl implements TestWs {
    @WebMethod
    @Override
    public String sayHello(String name){
        String str="欢迎你："+name;
        System.out.println(str);
        return str;
    }
}
