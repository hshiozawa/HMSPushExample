package com.hjm.hmspushexample;

import android.util.Log;

import com.huawei.hms.push.HmsMessageService;
import com.huawei.hms.push.RemoteMessage;

public class DemoHmsMessageService extends HmsMessageService {
    private static final String TAG = DemoHmsMessageService.class.getName();

    @Override
    public void onMessageReceived(RemoteMessage message) {
        super.onMessageReceived(message);
        Log.i(TAG, "onMessageReceived: message=" + message);
    }

    @Override
    public void onNewToken(String newToken) {
        Log.i(TAG, "onNewToken: newToken=" + newToken);
    }
}