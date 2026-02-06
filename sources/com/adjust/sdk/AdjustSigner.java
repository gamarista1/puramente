package com.adjust.sdk;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

public class AdjustSigner {
    private static volatile Object signerInstance;

    private AdjustSigner() {
    }

    private static void getSignerInstance() {
        if (signerInstance == null) {
            synchronized (AdjustSigner.class) {
                try {
                    if (signerInstance == null) {
                        signerInstance = Reflection.createDefaultInstance("com.adjust.sdk.sig.Signer");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static boolean isPresent() {
        getSignerInstance();
        return signerInstance != null;
    }

    public static void onResume(ILogger iLogger) {
        getSignerInstance();
        if (signerInstance != null) {
            try {
                Reflection.invokeInstanceMethod(signerInstance, "onResume", (Class[]) null, new Object[0]);
            } catch (Exception e10) {
                iLogger.warn("Invoking Signer onResume() received an error [%s]", e10.getMessage());
            }
        }
    }

    public static Map<String, String> sign(Map<String, String> map, Map<String, String> map2, Context context, ILogger iLogger) {
        Class<Map> cls = Map.class;
        getSignerInstance();
        HashMap hashMap = new HashMap();
        if (signerInstance != null) {
            try {
                iLogger.debug("Signing all the parameters", new Object[0]);
                Reflection.invokeInstanceMethod(signerInstance, "sign", new Class[]{Context.class, cls, cls, cls}, context, map, map2, hashMap);
            } catch (Exception e10) {
                iLogger.warn("Invoking Signer sign() for %s received an error [%s]", e10.getMessage());
            }
        }
        return hashMap;
    }
}
