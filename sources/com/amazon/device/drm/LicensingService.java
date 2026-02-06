package com.amazon.device.drm;

import android.content.Context;
import android.util.Log;
import com.amazon.a.a;
import com.amazon.device.drm.a.d;
import com.amazon.device.drm.model.RequestId;

public class LicensingService {
    private static final String APPSTORE_SDK_NAME = "Amazon Digital Rights Management Android SDK :2.9.0.0";
    public static final String SDK_VERSION = "2.9.0.0";
    private static final String TAG = "LicensingService";

    public LicensingService() {
        Log.i(TAG, "Amazon DigitalRightsManagement SDK initializing. SDK Version 2.9.0.0");
    }

    public static String getAppstoreSDKMode() {
        return d.d().a();
    }

    public static RequestId verifyLicense(Context context, LicensingListener licensingListener) {
        d d10 = d.d();
        Context applicationContext = context.getApplicationContext();
        a.a(applicationContext);
        d10.a(applicationContext, licensingListener);
        return d10.e();
    }
}
