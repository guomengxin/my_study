package designMode.adapter.demo.passport.adapterv2.adapters;

import designMode.adapter.demo.passport.ResultMsg;


/**
 * Created by Tom.
 */
public class LoginForTokenAdapter extends AbstraceAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return super.loginForRegist(id,null);
    }

}
