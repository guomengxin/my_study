import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;

public class SendEmail {
    //邮箱地址
    private static String myEmailAccount = "1048720262@qq.com";
    //邮箱授权码
    private static String myEmailPassword = "lzsufnfbdmbpbfaj";
    //邮箱服务器地址
    private static String myEmailSMTPHost = "smtp.qq.com";

    // 收件人邮箱（替换为自己知道的有效邮箱）
    public static String receiveMailAccount = "15200135761@163.com";

    public static void main(String[] args) throws Exception {
        SendEmail(receiveMailAccount);

    }

    /**
     * 发送邮件
     * @param receiveMail 目标邮箱
     */
    public static void  SendEmail(String receiveMail){
        // 1. 创建参数配置, 用于连接邮件服务器的参数配置
        Properties props = new Properties();
        // 使用的协议（JavaMail规范要求）
        props.setProperty("mail.transport.protocol", "smtp");
        // 发件人的邮箱的 SMTP 服务器地址
        props.setProperty("mail.smtp.host", myEmailSMTPHost);
        // 需要请求认证
        props.setProperty("mail.smtp.auth", "true");
        // 2. 根据配置创建会话对象, 用于和邮件服务器交互
        Session session = Session.getInstance(props);
        // 设置为debug模式, 可以查看详细的发送 log
        session.setDebug(true);
        // 3. 创建一封邮件
        MimeMessage message = createMimeMessage(session,receiveMail);
        try {
            // 4. 根据 Session 获取邮件传输对象
            Transport transport = session.getTransport();
            //创建连接
            transport.connect(myEmailAccount, myEmailPassword);
            // 6. 发送邮件, 发到所有的收件地址, message.getAllRecipients() 获取到的是在创建邮件对象时添加的所有收件人, 抄送人, 密送人
            transport.sendMessage(message, message.getAllRecipients());
            // 7. 关闭连接
            transport.close();
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        }


    }

    /**
     * 创建邮件
     * @param session
     * @param receiveMail
     * @return
     */
    private static MimeMessage createMimeMessage(Session session, String receiveMail) {
        // 1. 创建一封邮件
        MimeMessage message = new MimeMessage(session);
        try {
            // 2. From: 发件人
            message.setFrom(new InternetAddress(myEmailAccount, "昵称", "UTF-8"));
            // 3. To: 收件人（可以增加多个收件人、抄送、密送）
            message.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress(receiveMail, "XX用户", "UTF-8"));
            // 4. Subject: 邮件主题
            message.setSubject("调研文件", "UTF-8");
            //附件
            MimeBodyPart image = new MimeBodyPart();
            image.setDataHandler(new DataHandler(new FileDataSource("D:\\srv\\image.png")));
            image.setFileName("image.png");
            //拼装邮件正文
            MimeMultipart mimeMultipart = new MimeMultipart();
            mimeMultipart.addBodyPart(image);
            mimeMultipart.setSubType("related");//文本和图片内嵌成功
            message.setContent(mimeMultipart);
            // 6. 设置发件时间
            message.setSentDate(new Date());
            // 7. 保存设置
            message.saveChanges();
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return message;
    }
}
