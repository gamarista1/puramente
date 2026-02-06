package com.ReactNativeBlobUtil;

import android.net.Uri;
import android.util.Base64;
import com.adjust.sdk.Constants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import rh.C6703A;
import s4.C3986c;

public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public static X509TrustManager f36775a;

    class a implements HostnameVerifier {
        a() {
        }

        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }

    public static void a(String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("event", "warn");
        createMap.putString("detail", str);
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) e.f36648b.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("ReactNativeBlobUtilMessage", createMap);
    }

    public static String b(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : digest) {
                sb2.append(String.format(Locale.ROOT, "%02x", new Object[]{Integer.valueOf(b10 & 255)}));
            }
            return sb2.toString();
        } catch (Exception e10) {
            e10.printStackTrace();
        } catch (Throwable unused) {
        }
        return null;
    }

    public static C6703A.a c(C6703A a10) {
        try {
            X509TrustManager x509TrustManager = f36775a;
            if (x509TrustManager != null) {
                TrustManager[] trustManagerArr = {x509TrustManager};
                SSLContext instance = SSLContext.getInstance("SSL");
                instance.init((KeyManager[]) null, trustManagerArr, new SecureRandom());
                SSLSocketFactory socketFactory = instance.getSocketFactory();
                C6703A.a B10 = a10.B();
                B10.V(socketFactory, f36775a);
                B10.P(new a());
                return B10;
            }
            throw new IllegalStateException("Use of own trust manager but none defined");
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public static boolean d(String str) {
        if (str == null || !str.startsWith("bundle-assets://")) {
            return false;
        }
        return true;
    }

    public static boolean e(String str) {
        if (str == null || !str.startsWith("content://")) {
            return false;
        }
        return true;
    }

    public static String f(String str) {
        if (str == null) {
            return null;
        }
        if (!str.matches("\\w+\\:.*")) {
            return str;
        }
        if (str.startsWith("file://")) {
            return str.replace("file://", "");
        }
        Uri parse = Uri.parse(str);
        if (str.startsWith("bundle-assets://")) {
            return str;
        }
        return C3986c.c(e.f36648b, parse);
    }

    public static byte[] g(String str, String str2) {
        if (str2.equalsIgnoreCase("ascii")) {
            return str.getBytes(Charset.forName("US-ASCII"));
        }
        if (str2.toLowerCase(Locale.ROOT).contains("base64")) {
            return Base64.decode(str, 2);
        }
        if (str2.equalsIgnoreCase("utf8")) {
            return str.getBytes(Charset.forName(Constants.ENCODING));
        }
        return str.getBytes(Charset.forName("US-ASCII"));
    }
}
