package test.activemq;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class Sender {
    public static void main(String[] args) throws Exception {

        ConnectionFactory conectionFactory =
                new ActiveMQConnectionFactory("tcp://192.168.200.233:8210");
        Connection connection = conectionFactory.createConnection();
        connection.start();

        Session session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
        Destination destination = session.createQueue("my-queue");

        MessageProducer producer = session.createProducer(destination);
        for(int i=11; i<100; i++) {
            TextMessage message = session.createTextMessage("我的测试数据--"+i);
            System.out.println("发送数据");
            Thread.sleep(1000);
            producer.send(message);
        }
        //批量发送
        session.commit();
        session.close();
        connection.close();
    }
}
