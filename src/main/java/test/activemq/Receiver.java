package test.activemq;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class Receiver {
    public static void main(String[] args) throws Exception {
        //创建连接工厂
        ConnectionFactory cf = new ActiveMQConnectionFactory("tcp://192.168.200.233:8210");
        //在连接工厂中创建与JMS的连接
        Connection connection = cf.createConnection();
        connection.start();

        //创建一路会话，session.AUTO_ACKNOWLEDGE表示自动签收
        //当session.commit执行的时候，表示消息接收成功
        Session session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
        //获得消息的目的的
        Destination destination = session.createQueue("my-queue");

        MessageConsumer consumer = session.createConsumer(destination);
        int i=0;
        while(true) {
            i++;
            TextMessage message = (TextMessage)consumer.receive();
            System.out.println("收到消息：");
            message.acknowledge();
            session.commit();
            System.out.println("收到消息："+message.getText());
        }
    }

}
