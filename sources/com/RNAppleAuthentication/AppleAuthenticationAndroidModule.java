package com.RNAppleAuthentication;

import android.app.Activity;
import androidx.fragment.app.C1773v;
import androidx.fragment.app.J;
import com.RNAppleAuthentication.a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import io.intercom.android.sdk.models.Participant;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;
import p4.C3929d;
import p4.h;

public class AppleAuthenticationAndroidModule extends ReactContextBaseJavaModule {
    private static final String E_NOT_CONFIGURED_ERROR = "E_NOT_CONFIGURED_ERROR";
    private static final String E_SIGNIN_CANCELLED_ERROR = "E_SIGNIN_CANCELLED_ERROR";
    private static final String E_SIGNIN_FAILED_ERROR = "E_SIGNIN_FAILED_ERROR";
    /* access modifiers changed from: private */
    public a configuration;
    private final ReactApplicationContext reactContext;

    class a implements C3929d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f36583a;

        a(Promise promise) {
            this.f36583a = promise;
        }

        public void a(String str, String str2, String str3, String str4) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("code", str);
            createMap.putString("id_token", str2);
            createMap.putString("state", str3);
            String c10 = AppleAuthenticationAndroidModule.this.configuration.c();
            if (!c10.isEmpty()) {
                createMap.putString("nonce", c10);
            }
            try {
                JSONObject jSONObject = new JSONObject(str4);
                WritableMap createMap2 = Arguments.createMap();
                if (jSONObject.has("name")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("name");
                    WritableMap createMap3 = Arguments.createMap();
                    if (jSONObject2.has("firstName")) {
                        createMap3.putString("firstName", jSONObject2.getString("firstName"));
                    }
                    if (jSONObject2.has("lastName")) {
                        createMap3.putString("lastName", jSONObject2.getString("lastName"));
                    }
                    if (createMap3.hasKey("firstName") || createMap3.hasKey("lastName")) {
                        createMap2.putMap("name", createMap3);
                    }
                }
                if (jSONObject.has("email")) {
                    createMap2.putString("email", jSONObject.getString("email"));
                }
                if (createMap2.hasKey("name") || createMap2.hasKey("email")) {
                    createMap.putMap(Participant.USER_TYPE, createMap2);
                }
            } catch (Exception unused) {
            }
            this.f36583a.resolve(createMap);
        }

        public void b() {
            this.f36583a.reject(AppleAuthenticationAndroidModule.E_SIGNIN_CANCELLED_ERROR);
        }

        public void c(Throwable th2) {
            this.f36583a.reject(AppleAuthenticationAndroidModule.E_SIGNIN_FAILED_ERROR, th2);
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f36585a;

        b(h hVar) {
            this.f36585a = hVar;
        }

        public void run() {
            this.f36585a.a();
        }
    }

    public AppleAuthenticationAndroidModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    private static String bytesToHex(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < bArr.length; i10++) {
            stringBuffer.append(Character.forDigit((bArr[i10] >> 4) & 15, 16));
            stringBuffer.append(Character.forDigit(bArr[i10] & 15, 16));
        }
        return stringBuffer.toString();
    }

    private J getFragmentManagerHelper() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || !(currentActivity instanceof C1773v)) {
            return null;
        }
        return ((C1773v) currentActivity).getSupportFragmentManager();
    }

    @ReactMethod
    public void configure(ReadableMap readableMap) {
        boolean z10;
        String str;
        String str2;
        String str3;
        String uuid;
        String string;
        String string2;
        a.c cVar = a.c.f36606a;
        a.b bVar = a.b.f36601a;
        String uuid2 = UUID.randomUUID().toString();
        if (readableMap.hasKey("nonceEnabled")) {
            z10 = readableMap.getBoolean("nonceEnabled");
        } else {
            z10 = true;
        }
        String str4 = "";
        if (readableMap.hasKey("clientId")) {
            str = readableMap.getString("clientId");
        } else {
            str = str4;
        }
        if (readableMap.hasKey("redirectUri")) {
            str2 = readableMap.getString("redirectUri");
        } else {
            str2 = str4;
        }
        if (readableMap.hasKey("scope") && (string2 = readableMap.getString("scope")) != null) {
            a.c.valueOf(string2);
        }
        if (readableMap.hasKey("responseType") && (string = readableMap.getString("responseType")) != null) {
            a.b.valueOf(string);
        }
        if (readableMap.hasKey("state")) {
            uuid2 = readableMap.getString("state");
        }
        if (z10) {
            if (readableMap.hasKey("nonce")) {
                uuid = readableMap.getString("nonce");
            } else {
                uuid = UUID.randomUUID().toString();
            }
            str4 = uuid;
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-256");
                instance.update(str4.getBytes());
                str3 = bytesToHex(instance.digest());
            } catch (Exception unused) {
            }
            this.configuration = new a.C0596a().b(str).e(str2).f(a.b.f36603c).g(a.c.f36608c).h(uuid2).d(str4).c(str3).a();
        }
        str3 = str4;
        this.configuration = new a.C0596a().b(str).e(str2).f(a.b.f36603c).g(a.c.f36608c).h(uuid2).d(str4).c(str3).a();
    }

    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("ALL", a.b.f36603c.toString());
        hashMap.put("CODE", a.b.f36601a.toString());
        hashMap.put("ID_TOKEN", a.b.f36602b.toString());
        HashMap hashMap2 = new HashMap();
        hashMap2.put("ALL", a.c.f36608c.toString());
        hashMap2.put("EMAIL", a.c.f36607b.toString());
        hashMap2.put("NAME", a.c.f36606a.toString());
        HashMap hashMap3 = new HashMap();
        hashMap3.put(E_NOT_CONFIGURED_ERROR, E_NOT_CONFIGURED_ERROR);
        hashMap3.put(E_SIGNIN_FAILED_ERROR, E_SIGNIN_FAILED_ERROR);
        hashMap3.put(E_SIGNIN_CANCELLED_ERROR, E_SIGNIN_CANCELLED_ERROR);
        hashMap3.put("ResponseType", hashMap);
        hashMap3.put("Scope", hashMap2);
        hashMap3.put("isSupported", true);
        return hashMap3;
    }

    public String getName() {
        return "RNAppleAuthModuleAndroid";
    }

    @ReactMethod
    public void signIn(Promise promise) {
        if (this.configuration == null) {
            promise.reject(E_NOT_CONFIGURED_ERROR);
            return;
        }
        J fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper == null) {
            promise.reject(E_NOT_CONFIGURED_ERROR);
            return;
        }
        h hVar = new h(fragmentManagerHelper, "SignInWithAppleButton-$id-SignInWebViewDialogFragment", this.configuration, (C3929d) new a(promise));
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject((Throwable) new RuntimeException("Activity is not found"));
        } else {
            currentActivity.runOnUiThread(new b(hVar));
        }
    }
}
