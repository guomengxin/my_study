package test.gjjzxsbTest;

import cn.hutool.http.webservice.SoapClient;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

public class Test {
    /*public static void main(String[] args) {
        SoapClient client = SoapClient.create("http://localhost:8088/base/services/companyInfo?wsdl");
        client.setMethod("receivingCompanyDoc","http://webService.web1.zkdn.com");
        //client.setMethod("test");
        String send = client.send();
        System.out.println(send);
    }*/
    /*public static void main(String[] args) throws RemoteException, MalformedURLException {
        Service service = new Service();
        try {

            Call call = (Call) service.createCall();
            //设置地址
            call.setTargetEndpointAddress(new java.net.URL("http://localhost:8088/base/services/companyInfo?wsdl"));
            //设置要执行的方法
            call.setOperationName(new QName("http://webService.web1.zkdn.com","receivingCompanyDoc"));
            //设置要传入参数,如果没有要传入的参数，则不要写这个
//            call.addParameter("msg", org.apache.axis.Constants.XSD_STRING,javax.xml.rpc.ParameterMode.IN);
            call.addParameter("docs", org.apache.axis.encoding.XMLType.XSD_STRING,

                    javax.xml.rpc.ParameterMode.IN);//接口的参数
            //设置返回的类型
            call.setReturnType(org.apache.axis.Constants.XSD_STRING);

            String name =docs();

            //执行，调用webservice
            String result = (String) call.invoke(new Object[]{name});
            System.out.println("返回的结果是："+result);

        } catch (ServiceException e) {
            e.printStackTrace();
        }
    }*/
    public static String docs(){
        StringBuffer xml=new StringBuffer();
        xml.append("<info><Authorization>");
        xml.append("<One-Org>");
        //推送类型
        xml.append("<organ_flag>0</organ_flag>");
        //社会统一信用代码
        xml.append("<uni_scid></uni_scid>");
        //组织机构代码
        xml.append("<organ_code>59768289-1</organ_code>");
        //用户名
        xml.append("<login_name>li</login_name>");
        //密码
        xml.append("<password>123456</password>");
        //联系人
        xml.append("<contact_name>li</contact_name>");
        //联系电话
        xml.append("<contact_phone>15701311232</contact_phone>");
        //传真
        xml.append("<contact_fax>854235</contact_fax>");
        //邮箱
        xml.append("<contact_email>1098910703@qq.com</contact_email>");
        xml.append("</One-Org>");
        xml.append("</Authorization></info>");
        return xml.toString();
    }
}
