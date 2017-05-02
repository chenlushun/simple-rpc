package simple.rpc.provider;

import java.util.Date;

/**
 * Created by Alex on 2017/5/3.
 *
 * @author Alex
 */
public class SayHelloServiceImpl implements SayHelloService {

    @Override
    public String sayHello(String str) {
        return new Date() + ":" + str;
    }
}
