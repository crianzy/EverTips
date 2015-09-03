package evertips.imczy.com.evertips;

import com.evernote.client.android.EvernoteSession;

import evertips.imczy.com.android_util.common.LogUtil;
import evertips.imczy.com.evertips.constants.ApiConstants;
import evertips.imczy.com.evertips.constants.Config;

/**
 * Created by chenzhiyong on 15/9/3.
 */
public class Application extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initEvernote();

        LogUtil.setIsLog(Config.IS_LOG);
    }

    private void initEvernote() {
        new EvernoteSession.Builder(this)
                .setEvernoteService(Config.EVERNOTE_SERVICE)
                .setSupportAppLinkedNotebooks(Config.EVERNOTE_SUPPORT_APP_LINKED_NOTEBOOKS)
                .setForceAuthenticationInThirdPartyApp(true)
//                .setLocale(Locale.SIMPLIFIED_CHINESE)
                .build(ApiConstants.CONSUMER_KEY, ApiConstants.CONSUMER_SECRET)
                .asSingleton();
    }

}
