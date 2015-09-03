package evertips.imczy.com.evertips.constants;

import com.evernote.client.android.EvernoteSession;

/**
 * Created by chenzhiyong on 15/9/3.
 */
public interface Config {

    // 测试环境
    EvernoteSession.EvernoteService EVERNOTE_SERVICE = EvernoteSession.EvernoteService.SANDBOX;
    // 正式环境
//    EvernoteSession.EvernoteService EVERNOTE_SERVICE = EvernoteSession.EvernoteService.PRODUCTION;

    boolean EVERNOTE_SUPPORT_APP_LINKED_NOTEBOOKS = true;


    boolean IS_LOG = true;
}
