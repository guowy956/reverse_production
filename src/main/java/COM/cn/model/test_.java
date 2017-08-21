package COM.cn.model;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.json.JSONObject;

/**
 * cehsi
 *
 * @author guowy
 * @create 2017-05-24 16:10
 **/

public class test_ {

    public static void main(String[] args) {
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient("http://localhost:8080/soap/roles?wsdl");
        Object[] objects = null ;
        try {
            objects = client.invoke("getList");
        } catch (Exception e) {
            e.printStackTrace();
        }
        //输出调用结果
        System.out.println(objects[0].getClass());
    }
}
