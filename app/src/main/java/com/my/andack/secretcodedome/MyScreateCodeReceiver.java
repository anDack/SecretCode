package com.my.andack.secretcodedome;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.SmsManager;
import android.telephony.SmsMessage;
import android.widget.Toast;

/**
 * Created by anDack on 2017/1/3.
 * 邮箱：1160083806@qq.com
 * <p>                      _oo0oo_
 * <p>                   o8888888o
 * <p>                    88" . "88
 * <p>                   (| -_- |)
 * <p>                    0\  =  /0
 * <p>                  ___/`---'\___
 * <p>                .' \\|     |// '.
 * <p>               / \\|||  :  |||// \
 * <p>              / _||||| -:- |||||- \
 * <p>             |   | \\\  -  /// |   |
 * <p>             | \_|  ''\---/''  |_/ |
 * <p>             \  .-\__  '-'  ___/-. /
 * <p>           ___'. .'  /--.--\  `. .'___
 * <p>        ."" '<  `.___\_<|>_/___.' >' "".
 * <p>       | | :  `- \`.;`\ _ /`;.`/ - ` : | |
 * <p>       \  \ `_.   \_ __\ /__ _/   .-` /  /
 * <p>   =====`-.____`.___ \_____/___.-`___.-'=====
 * <p>                     `=---='
 * <p>
 * <p>
 * <p>   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * <p>
 * <p>            佛祖保佑         永无BUG
 */

public class MyScreateCodeReceiver extends BroadcastReceiver {
    private SmsManager smsManager;
    private String sender;//通过SharePrance登录
    private String content;
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"调用暗码成功",Toast.LENGTH_SHORT).show();
//        Intent intent1=new Intent();
//        intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        intent1.setClassName("com.my.andack.bescreatecodeget","com.my.andack.bescreatecodeget.MainActivity");
//        context.startActivity(intent1);
        smsManager=SmsManager.getDefault();

        smsManager.sendTextMessage(sender,null,content,null,null);
    }
}
