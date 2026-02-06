package io.invertase.firebase.utils;

import android.app.Activity;
import android.content.IntentSender;
import android.os.Environment;
import android.provider.Settings;
import android.util.Log;
import com.amazon.a.a.o.b;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.a;
import io.branch.rnbranch.RNBranchModule;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class ReactNativeFirebaseUtilsModule extends ReactNativeFirebaseModule {
    private static final String FIREBASE_TEST_LAB = "firebase.test.lab";
    private static final String KEY_CACHE_DIRECTORY = "CACHES_DIRECTORY";
    private static final String KEY_DOCUMENT_DIRECTORY = "DOCUMENT_DIRECTORY";
    private static final String KEY_EXTERNAL_DIRECTORY = "EXTERNAL_DIRECTORY";
    private static final String KEY_EXT_STORAGE_DIRECTORY = "EXTERNAL_STORAGE_DIRECTORY";
    private static final String KEY_LIBRARY_DIRECTORY = "LIBRARY_DIRECTORY";
    private static final String KEY_MAIN_BUNDLE = "MAIN_BUNDLE";
    private static final String KEY_MOVIES_DIRECTORY = "MOVIES_DIRECTORY";
    private static final String KEY_PICS_DIRECTORY = "PICTURES_DIRECTORY";
    private static final String KEY_TEMP_DIRECTORY = "TEMP_DIRECTORY";
    private static final String TAG = "Utils";

    public ReactNativeFirebaseUtilsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, TAG);
    }

    private WritableMap getPlayServicesStatusMap() {
        WritableMap createMap = Arguments.createMap();
        a o10 = a.o();
        int g10 = o10.g(getContext());
        createMap.putInt("status", g10);
        if (g10 == 0) {
            createMap.putBoolean("isAvailable", true);
        } else {
            createMap.putBoolean("isAvailable", false);
            createMap.putString(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR, o10.e(g10));
            createMap.putBoolean("isUserResolvableError", o10.j(g10));
            createMap.putBoolean("hasResolution", new ConnectionResult(g10).r0());
        }
        return createMap;
    }

    private int isGooglePlayServicesAvailable() {
        return a.o().g(getContext());
    }

    private static Boolean isRunningInTestLab() {
        return Boolean.valueOf(b.f37475af.equals(Settings.System.getString(io.invertase.firebase.app.a.a().getContentResolver(), FIREBASE_TEST_LAB)));
    }

    @ReactMethod
    public void androidGetPlayServicesStatus(Promise promise) {
        promise.resolve(getPlayServicesStatusMap());
    }

    @ReactMethod
    public void androidMakePlayServicesAvailable() {
        Activity activity;
        if (isGooglePlayServicesAvailable() != 0 && (activity = getActivity()) != null) {
            a.o().p(activity);
        }
    }

    @ReactMethod
    public void androidPromptForPlayServices() {
        Activity activity;
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable();
        a o10 = a.o();
        if (isGooglePlayServicesAvailable != 0 && o10.j(isGooglePlayServicesAvailable) && (activity = getActivity()) != null) {
            o10.l(activity, isGooglePlayServicesAvailable, isGooglePlayServicesAvailable).show();
        }
    }

    @ReactMethod
    public void androidResolutionForPlayServices() {
        Activity activity;
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable();
        ConnectionResult connectionResult = new ConnectionResult(isGooglePlayServicesAvailable);
        if (!connectionResult.s0() && connectionResult.r0() && (activity = getActivity()) != null) {
            try {
                connectionResult.t0(activity, isGooglePlayServicesAvailable);
            } catch (IntentSender.SendIntentException e10) {
                Log.d(TAG, "resolutionForPlayServices", e10);
            }
        }
    }

    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("isRunningInTestLab", isRunningInTestLab());
        hashMap.put("androidPlayServices", getPlayServicesStatusMap());
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        hashMap.put(KEY_MAIN_BUNDLE, "");
        hashMap.put(KEY_LIBRARY_DIRECTORY, reactApplicationContext.getFilesDir().getAbsolutePath());
        hashMap.put(KEY_TEMP_DIRECTORY, reactApplicationContext.getCacheDir().getAbsolutePath());
        hashMap.put(KEY_CACHE_DIRECTORY, reactApplicationContext.getCacheDir().getAbsolutePath());
        File externalFilesDir = reactApplicationContext.getExternalFilesDir((String) null);
        if (externalFilesDir != null) {
            hashMap.put(KEY_DOCUMENT_DIRECTORY, externalFilesDir.getAbsolutePath());
        } else {
            hashMap.put(KEY_DOCUMENT_DIRECTORY, reactApplicationContext.getFilesDir().getAbsolutePath());
        }
        if (!hashMap.containsKey(KEY_DOCUMENT_DIRECTORY)) {
            hashMap.put(KEY_DOCUMENT_DIRECTORY, reactApplicationContext.getFilesDir().getAbsolutePath());
        }
        hashMap.put(KEY_PICS_DIRECTORY, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath());
        hashMap.put(KEY_MOVIES_DIRECTORY, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES).getAbsolutePath());
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            hashMap.put(KEY_EXT_STORAGE_DIRECTORY, externalStorageDirectory.getAbsolutePath());
        }
        if (externalFilesDir != null) {
            hashMap.put(KEY_EXTERNAL_DIRECTORY, externalFilesDir.getAbsolutePath());
        }
        return hashMap;
    }
}
