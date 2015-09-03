package evertips.imczy.com.evertips.activity;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.LayoutRes;
import android.support.v4.app.FragmentActivity;
import android.view.Window;

import butterknife.ButterKnife;

/**
 * Created by chenzhiyong on 15/9/3.
 */
public abstract class AbsBaseActivity extends FragmentActivity {

    private Context mContext;
    private Handler mHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(getContentViewLayoutId());
        ButterKnife.bind(this);
        mContext = this;

        initData();
        initWidgets();
        initWidgetsActions();
    }

    @LayoutRes
    protected abstract int getContentViewLayoutId();

    protected abstract void initData();

    protected abstract void initWidgets();

    protected abstract void initWidgetsActions();


    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }

    public Context getContext() {
        return mContext;
    }

    public Handler getHandler() {
        if (mHandler == null) {
            synchronized (this) {
                if (mHandler == null) {
                    mHandler = new Handler(Looper.getMainLooper());
                }
            }
        }

        return mHandler;
    }
}
