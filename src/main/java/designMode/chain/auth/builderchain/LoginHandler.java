package designMode.chain.auth.builderchain;


import designMode.chain.auth.Member;

/**
 * Created by Tom.
 */
public class LoginHandler extends Handler {
    public void doHandler(Member member) {
        System.out.println("登录成功！");
        member.setRoleName("管理员");
        if(null != next) {
            next.doHandler(member);
        }
    }
}
