package client.test;

/**
 * Created by liuzehui on 2018/5/15.
 */
import client.TestWsImpl;
import client.TestWsImplService;
public class client {
    public static void main(String args[]){
    TestWsImplService testWsImplService =new TestWsImplService();
    TestWsImpl testWs= testWsImplService.getTestWsImplPort();
    String returnStr=  testWs.sayHello("先知后觉");
    System.out.println(returnStr);
}
}
