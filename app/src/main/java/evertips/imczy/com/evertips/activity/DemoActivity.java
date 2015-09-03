package evertips.imczy.com.evertips.activity;

import butterknife.OnClick;
import evertips.imczy.com.android_util.common.LogUtil;
import evertips.imczy.com.evertips.R;

/**
 * Created by chenzhiyong on 15/9/3.
 */
public class DemoActivity extends AbsBaseActivity {
    public static final String TAG = "DemoActivity";

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.demo_activity;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initWidgets() {

    }

    @Override
    protected void initWidgetsActions() {

    }

    @OnClick(R.id.login_btm)
    void login() {
        LogUtil.d(TAG, "do login");
    }

    @OnClick(R.id.login_out_btn)
    void loginOut() {
        LogUtil.d(TAG, "dp login out");

    }
}
