package io.branch.rnbranch;

import Ce.a;
import Fe.C3016e;
import Fe.C3020i;
import Fe.C3032v;
import Fe.K;
import Fe.T;
import Ge.a;
import Ie.d;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.util.Base64;
import android.util.Log;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import d2.C1926a;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Q7.a(name = "RNBranch")
public class RNBranchModule extends ReactContextBaseJavaModule {
    private static final long AGING_HASH_TTL = 3600000;
    public static final String GENERIC_ERROR = "RNBranch::Error";
    private static final String IDENT_FIELD_NAME = "ident";
    private static final String INIT_SESSION_ERROR = "INIT_SESSION_ERROR";
    private static final String INIT_SESSION_START = "INIT_SESSION_START";
    private static final String INIT_SESSION_SUCCESS = "INIT_SESSION_SUCCESS";
    public static final String NAME = "RNBranch";
    public static final String NATIVE_INIT_SESSION_FINISHED_EVENT = "io.branch.rnbranch.RNBranchModule.onInitSessionFinished";
    public static final String NATIVE_INIT_SESSION_FINISHED_EVENT_BRANCH_UNIVERSAL_OBJECT = "branch_universal_object";
    public static final String NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR = "error";
    public static final String NATIVE_INIT_SESSION_FINISHED_EVENT_LINK_PROPERTIES = "link_properties";
    public static final String NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS = "params";
    public static final String NATIVE_INIT_SESSION_FINISHED_EVENT_URI = "uri";
    public static final String NATIVE_INIT_SESSION_STARTED_EVENT = "io.branch.rnbranch.RNBranchModule.onInitSessionStarted";
    public static final String NATIVE_INIT_SESSION_STARTED_EVENT_URI = "uri";
    private static final String PLUGIN_NAME = "ReactNative";
    public static final String REACT_CLASS = "RNBranch";
    private static final String RN_INIT_SESSION_ERROR_EVENT = "RNBranch.initSessionError";
    private static final String RN_INIT_SESSION_START_EVENT = "RNBranch.initSessionStart";
    private static final String RN_INIT_SESSION_SUCCESS_EVENT = "RNBranch.initSessionSuccess";
    private static final String STANDARD_EVENT_ACHIEVE_LEVEL = "STANDARD_EVENT_ACHIEVE_LEVEL";
    private static final String STANDARD_EVENT_ADD_PAYMENT_INFO = "STANDARD_EVENT_ADD_PAYMENT_INFO";
    private static final String STANDARD_EVENT_ADD_TO_CART = "STANDARD_EVENT_ADD_TO_CART";
    private static final String STANDARD_EVENT_ADD_TO_WISHLIST = "STANDARD_EVENT_ADD_TO_WISHLIST";
    private static final String STANDARD_EVENT_CLICK_AD = "STANDARD_EVENT_CLICK_AD";
    private static final String STANDARD_EVENT_COMPLETE_REGISTRATION = "STANDARD_EVENT_COMPLETE_REGISTRATION";
    private static final String STANDARD_EVENT_COMPLETE_TUTORIAL = "STANDARD_EVENT_COMPLETE_TUTORIAL";
    private static final String STANDARD_EVENT_INITIATE_PURCHASE = "STANDARD_EVENT_INITIATE_PURCHASE";
    private static final String STANDARD_EVENT_INVITE = "STANDARD_EVENT_INVITE";
    private static final String STANDARD_EVENT_LOGIN = "STANDARD_EVENT_LOGIN";
    private static final String STANDARD_EVENT_PURCHASE = "STANDARD_EVENT_PURCHASE";
    private static final String STANDARD_EVENT_RATE = "STANDARD_EVENT_RATE";
    private static final String STANDARD_EVENT_RESERVE = "STANDARD_EVENT_RESERVE";
    private static final String STANDARD_EVENT_SEARCH = "STANDARD_EVENT_SEARCH";
    private static final String STANDARD_EVENT_SHARE = "STANDARD_EVENT_SHARE";
    private static final String STANDARD_EVENT_START_TRIAL = "STANDARD_EVENT_START_TRIAL";
    private static final String STANDARD_EVENT_SUBSCRIBE = "STANDARD_EVENT_SUBSCRIBE";
    private static final String STANDARD_EVENT_UNLOCK_ACHIEVEMENT = "STANDARD_EVENT_UNLOCK_ACHIEVEMENT";
    private static final String STANDARD_EVENT_VIEW_AD = "STANDARD_EVENT_VIEW_AD";
    private static final String STANDARD_EVENT_VIEW_CART = "STANDARD_EVENT_VIEW_CART";
    private static final String STANDARD_EVENT_VIEW_ITEM = "STANDARD_EVENT_VIEW_ITEM";
    private static final String STANDARD_EVENT_VIEW_ITEMS = "STANDARD_EVENT_VIEW_ITEMS";
    public static final String UNIVERSAL_OBJECT_NOT_FOUND_ERROR_CODE = "RNBranch::Error::BUONotFound";
    private static C3016e.h initListener = null;
    /* access modifiers changed from: private */
    public static JSONObject initSessionResult = null;
    private static Activity mActivity = null;
    private static boolean mInitialized = false;
    private static volatile boolean mNewIntent = true;
    private static JSONObject mRequestMetadata = new JSONObject();
    private static C3016e.g referralInitListener = null;
    private BroadcastReceiver mInitSessionFinishedEventReceiver = null;
    private BroadcastReceiver mInitSessionStartedEventReceiver = null;
    private a mUniversalObjectMap = new a(AGING_HASH_TTL);

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f44587a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.facebook.react.bridge.ReadableType[] r0 = com.facebook.react.bridge.ReadableType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f44587a = r0
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.String     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f44587a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Null     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f44587a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Boolean     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f44587a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Number     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f44587a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Map     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f44587a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Array     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.branch.rnbranch.RNBranchModule.a.<clinit>():void");
        }
    }

    class b implements C3016e.g {

        /* renamed from: a  reason: collision with root package name */
        private Activity f44588a = null;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f44589b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Uri f44590c;

        b(boolean z10, Uri uri) {
            this.f44589b = z10;
            this.f44590c = uri;
        }

        private void c(JSONObject jSONObject, Uri uri, Ce.a aVar, Ie.g gVar, C3020i iVar) {
            Intent intent = new Intent(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT);
            if (jSONObject != null) {
                intent.putExtra(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS, jSONObject.toString());
            }
            if (aVar != null) {
                intent.putExtra(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_BRANCH_UNIVERSAL_OBJECT, aVar);
            }
            if (gVar != null) {
                intent.putExtra(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_LINK_PROPERTIES, gVar);
            }
            if (this.f44589b && uri != null) {
                intent.putExtra("uri", uri.toString());
            }
            if (iVar != null) {
                intent.putExtra(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR, iVar.b());
            }
            C1926a.b(this.f44588a).d(intent);
        }

        /* access modifiers changed from: private */
        public C3016e.g d(Activity activity) {
            this.f44588a = activity;
            return this;
        }

        public void a(JSONObject jSONObject, C3020i iVar) {
            Object obj;
            Object obj2;
            Uri uri;
            Log.d("RNBranch", "onInitFinished referringParams " + jSONObject);
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            JSONObject jSONObject2 = jSONObject;
            Log.d("RNBranch", "onInitFinished");
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS, jSONObject2);
                if (iVar != null) {
                    obj = iVar.b();
                } else {
                    obj = JSONObject.NULL;
                }
                jSONObject3.put(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR, obj);
                if (!this.f44589b || (uri = this.f44590c) == null) {
                    obj2 = JSONObject.NULL;
                } else {
                    obj2 = uri.toString();
                }
                jSONObject3.put("uri", obj2);
            } catch (JSONException e10) {
                Log.e("RNBranch", e10.getMessage());
            }
            RNBranchModule.initSessionResult = jSONObject3;
            Ce.a j10 = Ce.a.j();
            Ie.g i10 = Ie.g.i();
            RNBranchModule.b();
            c(jSONObject2, this.f44590c, j10, i10, iVar);
        }
    }

    class c extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        RNBranchModule f44591a;

        c() {
        }

        /* access modifiers changed from: private */
        public BroadcastReceiver b(RNBranchModule rNBranchModule) {
            this.f44591a = rNBranchModule;
            return this;
        }

        public void onReceive(Context context, Intent intent) {
            String str;
            if (!RNBranchModule.initSessionResult.has(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR) || RNBranchModule.initSessionResult.isNull(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR)) {
                str = RNBranchModule.RN_INIT_SESSION_SUCCESS_EVENT;
            } else {
                str = RNBranchModule.RN_INIT_SESSION_ERROR_EVENT;
            }
            this.f44591a.sendRNEvent(str, RNBranchModule.convertJsonToMap(RNBranchModule.initSessionResult));
        }
    }

    class d extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        RNBranchModule f44593a;

        d() {
        }

        /* access modifiers changed from: private */
        public BroadcastReceiver b(RNBranchModule rNBranchModule) {
            this.f44593a = rNBranchModule;
            return this;
        }

        public void onReceive(Context context, Intent intent) {
            Uri uri = (Uri) intent.getParcelableExtra("uri");
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            if (uri != null) {
                writableNativeMap.putString("uri", uri.toString());
            } else {
                writableNativeMap.putNull("uri");
            }
            this.f44593a.sendRNEvent(RNBranchModule.RN_INIT_SESSION_START_EVENT, writableNativeMap);
        }
    }

    class e implements K.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f44595a;

        e(Promise promise) {
            this.f44595a = promise;
        }

        public void a(JSONObject jSONObject, C3020i iVar) {
            if (iVar == null) {
                this.f44595a.resolve(RNBranchModule.convertJsonToMap(jSONObject));
            } else {
                this.f44595a.reject(RNBranchModule.GENERIC_ERROR, iVar.b());
            }
        }
    }

    class f implements C3016e.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f44597a;

        f(Promise promise) {
            this.f44597a = promise;
        }

        public void a(JSONObject jSONObject, C3020i iVar) {
            if (iVar != null) {
                this.f44597a.reject("RNBranch::Error::setIdentityAsync failed", iVar.b());
            } else {
                this.f44597a.resolve(RNBranchModule.convertJsonToMap(jSONObject));
            }
        }
    }

    class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        Promise f44599a;

        /* renamed from: b  reason: collision with root package name */
        Context f44600b;

        /* renamed from: c  reason: collision with root package name */
        ReadableMap f44601c;

        /* renamed from: d  reason: collision with root package name */
        ReadableMap f44602d;

        /* renamed from: e  reason: collision with root package name */
        ReadableMap f44603e;

        /* renamed from: f  reason: collision with root package name */
        String f44604f;

        class a implements C3016e.C0512e {

            /* renamed from: a  reason: collision with root package name */
            private Promise f44606a = null;

            a() {
            }

            /* access modifiers changed from: private */
            public C3016e.C0512e f(Promise promise) {
                this.f44606a = promise;
                return this;
            }

            public void a() {
                if (this.f44606a != null) {
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putString("channel", (String) null);
                    writableNativeMap.putBoolean(MetricTracker.Action.COMPLETED, false);
                    writableNativeMap.putString(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR, (String) null);
                    this.f44606a.resolve(writableNativeMap);
                    this.f44606a = null;
                }
            }

            public void b() {
            }

            public void c(String str, String str2, C3020i iVar) {
                String str3;
                if (this.f44606a != null) {
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putString("channel", str2);
                    writableNativeMap.putBoolean(MetricTracker.Action.COMPLETED, true);
                    if (iVar != null) {
                        str3 = iVar.b();
                    } else {
                        str3 = null;
                    }
                    writableNativeMap.putString(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR, str3);
                    this.f44606a.resolve(writableNativeMap);
                    this.f44606a = null;
                }
            }

            public void d(String str) {
            }
        }

        g() {
        }

        /* access modifiers changed from: private */
        public Runnable b(ReadableMap readableMap, String str, ReadableMap readableMap2, ReadableMap readableMap3, Promise promise, Context context) {
            this.f44599a = promise;
            this.f44600b = context;
            this.f44601c = readableMap;
            this.f44604f = str;
            this.f44602d = readableMap2;
            this.f44603e = readableMap3;
            return this;
        }

        public void run() {
            String str;
            String str2 = "";
            if (this.f44601c.hasKey("messageHeader")) {
                str = this.f44601c.getString("messageHeader");
            } else {
                str = str2;
            }
            if (this.f44601c.hasKey("messageBody")) {
                str2 = this.f44601c.getString("messageBody");
            }
            Ie.i a10 = new Ie.i(this.f44600b, str, str2).t(this.f44600b.getResources().getDrawable(17301584), "Copy", "Added to clipboard").u(this.f44600b.getResources().getDrawable(17301583), "Show more").a(T.EMAIL).a(T.TWITTER).a(T.MESSAGE).a(T.FACEBOOK);
            Ce.a a11 = RNBranchModule.this.findUniversalObjectOrReject(this.f44604f, this.f44599a);
            if (a11 != null) {
                a11.L(RNBranchModule.this.getCurrentActivity(), RNBranchModule.createLinkProperties(this.f44602d, this.f44603e), a10, new a().f(this.f44599a));
            }
        }
    }

    class h implements C3016e.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f44608a;

        h(Promise promise) {
            this.f44608a = promise;
        }

        public void a(String str, C3020i iVar) {
            Log.d("RNBranch", "onLinkCreate " + str);
            if (iVar == null) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("url", str);
                this.f44608a.resolve(writableNativeMap);
            } else if (iVar.a() == -105) {
                this.f44608a.reject("RNBranch::Error::DuplicateResourceError", iVar.b());
            } else {
                this.f44608a.reject(RNBranchModule.GENERIC_ERROR, iVar.b());
            }
        }
    }

    class i implements a.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f44610a;

        i(Promise promise) {
            this.f44610a = promise;
        }

        public void a(byte[] bArr) {
            this.f44610a.resolve(Base64.encodeToString(bArr, 0));
        }

        public void onFailure(Exception exc) {
            Log.d("Failed to get QR Code", exc.getMessage());
            this.f44610a.reject("Failed to get QR Code", exc.getMessage());
        }
    }

    class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final int f44612a = 100;

        /* renamed from: b  reason: collision with root package name */
        final int f44613b = 300;

        /* renamed from: c  reason: collision with root package name */
        int f44614c = 1;

        /* renamed from: d  reason: collision with root package name */
        String f44615d;

        /* renamed from: e  reason: collision with root package name */
        WritableMap f44616e;

        /* renamed from: f  reason: collision with root package name */
        Handler f44617f;

        /* renamed from: g  reason: collision with root package name */
        ReactApplicationContext f44618g;

        j() {
        }

        /* access modifiers changed from: private */
        public Runnable b(ReactApplicationContext reactApplicationContext, Handler handler, String str, WritableMap writableMap) {
            this.f44617f = handler;
            this.f44615d = str;
            this.f44618g = reactApplicationContext;
            this.f44616e = writableMap;
            return this;
        }

        public void run() {
            try {
                Log.d("RNBranch", "Catalyst instance poller try " + Integer.toString(this.f44614c));
                if (this.f44618g.hasActiveCatalystInstance()) {
                    Log.d("RNBranch", "Catalyst instance active");
                    ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.f44618g.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(this.f44615d, this.f44616e);
                    return;
                }
                int i10 = this.f44614c + 1;
                this.f44614c = i10;
                if (i10 <= 300) {
                    this.f44617f.postDelayed(this, 100);
                } else {
                    Log.e("RNBranch", "Could not get Catalyst instance");
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public RNBranchModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        listenForInitSessionEventsToReactNative(reactApplicationContext);
    }

    static /* bridge */ /* synthetic */ C3016e.h b() {
        return null;
    }

    private static JSONArray convertArrayToJson(ReadableArray readableArray) {
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            int i11 = a.f44587a[readableArray.getType(i10).ordinal()];
            if (i11 == 1) {
                jSONArray.put(readableArray.getString(i10));
            } else if (i11 == 3) {
                jSONArray.put(readableArray.getBoolean(i10));
            } else if (i11 == 4) {
                jSONArray.put(readableArray.getDouble(i10));
            } else if (i11 == 5) {
                jSONArray.put(convertMapToJson(readableArray.getMap(i10)));
            } else if (i11 == 6) {
                jSONArray.put(convertArrayToJson(readableArray.getArray(i10)));
            }
        }
        return jSONArray;
    }

    private static WritableArray convertJsonToArray(JSONArray jSONArray) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object obj = jSONArray.get(i10);
            if (obj instanceof JSONObject) {
                writableNativeArray.pushMap(convertJsonToMap((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                writableNativeArray.pushArray(convertJsonToArray((JSONArray) obj));
            } else if (obj instanceof Boolean) {
                writableNativeArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                writableNativeArray.pushInt(((Integer) obj).intValue());
            } else if (obj instanceof Double) {
                writableNativeArray.pushDouble(((Double) obj).doubleValue());
            } else if (obj instanceof String) {
                writableNativeArray.pushString((String) obj);
            } else {
                writableNativeArray.pushString(obj.toString());
            }
        }
        return writableNativeArray;
    }

    /* access modifiers changed from: private */
    public static WritableMap convertJsonToMap(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONObject) {
                    writableNativeMap.putMap(next, convertJsonToMap((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    writableNativeMap.putArray(next, convertJsonToArray((JSONArray) obj));
                } else if (obj instanceof Boolean) {
                    writableNativeMap.putBoolean(next, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Integer) {
                    writableNativeMap.putInt(next, ((Integer) obj).intValue());
                } else if (obj instanceof Double) {
                    writableNativeMap.putDouble(next, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    writableNativeMap.putString(next, (String) obj);
                } else {
                    if (obj != null) {
                        if (obj != JSONObject.NULL) {
                            writableNativeMap.putString(next, obj.toString());
                        }
                    }
                    writableNativeMap.putNull(next);
                }
            }
        } catch (JSONException e10) {
            writableNativeMap.putString(NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR, "Failed to convert JSONObject to WriteableMap: " + e10.getMessage());
        }
        return writableNativeMap;
    }

    private static JSONObject convertMapToJson(ReadableMap readableMap) {
        JSONObject jSONObject = new JSONObject();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (a.f44587a[readableMap.getType(nextKey).ordinal()]) {
                case 1:
                    jSONObject.put(nextKey, readableMap.getString(nextKey));
                    break;
                case 2:
                    jSONObject.put(nextKey, JSONObject.NULL);
                    break;
                case 3:
                    jSONObject.put(nextKey, readableMap.getBoolean(nextKey));
                    break;
                case 4:
                    jSONObject.put(nextKey, readableMap.getDouble(nextKey));
                    break;
                case 5:
                    jSONObject.put(nextKey, convertMapToJson(readableMap.getMap(nextKey)));
                    break;
                case 6:
                    jSONObject.put(nextKey, convertArrayToJson(readableMap.getArray(nextKey)));
                    break;
            }
        }
        return jSONObject;
    }

    public static Ie.c createBranchEvent(String str, ReadableMap readableMap) {
        Ie.c cVar;
        try {
            cVar = new Ie.c(Ie.a.valueOf(str));
        } catch (IllegalArgumentException unused) {
            cVar = new Ie.c(str);
        }
        if (readableMap.hasKey(com.amazon.a.a.o.b.f37469a)) {
            String string = readableMap.getString(com.amazon.a.a.o.b.f37469a);
            Ie.e b10 = Ie.e.b(string);
            if (b10 != null) {
                cVar.j(b10);
            } else {
                Log.w("RNBranch", "Invalid currency " + string);
            }
        }
        if (readableMap.hasKey("transactionID")) {
            cVar.q(readableMap.getString("transactionID"));
        }
        if (readableMap.hasKey("revenue")) {
            cVar.m(Double.parseDouble(readableMap.getString("revenue")));
        }
        if (readableMap.hasKey("shipping")) {
            cVar.o(Double.parseDouble(readableMap.getString("shipping")));
        }
        if (readableMap.hasKey("tax")) {
            cVar.p(Double.parseDouble(readableMap.getString("tax")));
        }
        if (readableMap.hasKey("coupon")) {
            cVar.i(readableMap.getString("coupon"));
        }
        if (readableMap.hasKey("affiliation")) {
            cVar.h(readableMap.getString("affiliation"));
        }
        if (readableMap.hasKey(com.amazon.a.a.o.b.f37480c)) {
            cVar.l(readableMap.getString(com.amazon.a.a.o.b.f37480c));
        }
        if (readableMap.hasKey("searchQuery")) {
            cVar.n(readableMap.getString("searchQuery"));
        }
        if (readableMap.hasKey("alias")) {
            cVar.k(readableMap.getString("alias"));
        }
        if (readableMap.hasKey("customData")) {
            ReadableMap map = readableMap.getMap("customData");
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                if (map.getType(nextKey) == ReadableType.String) {
                    cVar.c(nextKey, map.getString(nextKey));
                } else {
                    Log.w("RNBranch", "customData values must be strings. Value for property " + nextKey + " is not a string type.");
                }
            }
        }
        return cVar;
    }

    public static Ie.g createLinkProperties(ReadableMap readableMap, ReadableMap readableMap2) {
        Ie.g gVar = new Ie.g();
        if (readableMap.hasKey("alias")) {
            gVar.l(readableMap.getString("alias"));
        }
        if (readableMap.hasKey("campaign")) {
            gVar.n(readableMap.getString("campaign"));
        }
        if (readableMap.hasKey("channel")) {
            gVar.o(readableMap.getString("channel"));
        }
        if (readableMap.hasKey("feature")) {
            gVar.q(readableMap.getString("feature"));
        }
        if (readableMap.hasKey("stage")) {
            gVar.s(readableMap.getString("stage"));
        }
        if (readableMap.hasKey("tags")) {
            ReadableArray array = readableMap.getArray("tags");
            for (int i10 = 0; i10 < array.size(); i10++) {
                gVar.b(array.getString(i10));
            }
        }
        if (readableMap2 != null) {
            ReadableMapKeySetIterator keySetIterator = readableMap2.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                gVar.a(nextKey, getReadableMapObjectForKey(readableMap2, nextKey).toString());
            }
        }
        return gVar;
    }

    public static void enableLogging() {
        C3016e.z();
    }

    /* access modifiers changed from: private */
    public Ce.a findUniversalObjectOrReject(String str, Promise promise) {
        Ce.a aVar = (Ce.a) this.mUniversalObjectMap.b(str);
        if (aVar == null) {
            promise.reject(UNIVERSAL_OBJECT_NOT_FOUND_ERROR_CODE, "BranchUniversalObject not found for ident " + str + ".");
        }
        return aVar;
    }

    public static void getAutoInstance(Context context) {
        C3016e.E0(PLUGIN_NAME, "6.8.0");
        C3016e.N(context);
    }

    private static Object getReadableMapObjectForKey(ReadableMap readableMap, String str) {
        int i10 = a.f44587a[readableMap.getType(str).ordinal()];
        if (i10 == 1) {
            return readableMap.getString(str);
        }
        if (i10 == 2) {
            return "Null";
        }
        if (i10 == 3) {
            return Boolean.valueOf(readableMap.getBoolean(str));
        }
        if (i10 != 4) {
            return "Unsupported Type";
        }
        if (readableMap.getDouble(str) % 1.0d == 0.0d) {
            return Integer.valueOf(readableMap.getInt(str));
        }
        return Double.valueOf(readableMap.getDouble(str));
    }

    public static void initSession(Uri uri, Activity activity, C3016e.h hVar) {
        Log.d("RNBranch", "initSession uri " + uri + " reactActivity " + activity + " anInitListener" + hVar);
        initSession(uri, activity);
    }

    private void listenForInitSessionEventsToReactNative(ReactApplicationContext reactApplicationContext) {
        this.mInitSessionFinishedEventReceiver = new c().b(this);
        C1926a.b(reactApplicationContext).c(this.mInitSessionFinishedEventReceiver, new IntentFilter(NATIVE_INIT_SESSION_FINISHED_EVENT));
        this.mInitSessionStartedEventReceiver = new d().b(this);
        C1926a.b(reactApplicationContext).c(this.mInitSessionStartedEventReceiver, new IntentFilter(NATIVE_INIT_SESSION_STARTED_EVENT));
    }

    private static void notifyJSOfInitSessionStart(Context context, Uri uri) {
        Log.d("RNBranch", "notifyJSOfInitSessionStart  " + uri);
        if (mNewIntent) {
            mNewIntent = false;
            Intent intent = new Intent(NATIVE_INIT_SESSION_STARTED_EVENT);
            if (uri != null) {
                intent.putExtra("uri", uri);
            }
            Log.d("RNBranch", "Broadcasting NATIVE_INIT_SESSION_STARTED_EVENT");
            C1926a.b(context).d(intent);
        }
    }

    public static void onNewIntent(Intent intent) {
        Log.d("RNBranch", "onNewIntent " + intent);
        mActivity.setIntent(intent);
        mNewIntent = true;
        reInitSession(mActivity);
    }

    public static void reInitSession(Activity activity) {
        C3016e.X();
        Intent intent = activity.getIntent();
        Log.d("RNBranch", "reInitSession intent " + intent);
        if (intent != null) {
            intent.putExtra("branch_force_new_session", true);
            notifyJSOfInitSessionStart(activity, intent.getData());
            C3016e.H0(activity).e(referralInitListener).d();
            return;
        }
        Log.w("RNBranch", "reInitSession was called but the Intent is null");
    }

    @ReactMethod
    public static void setPreinstallCampaign(String str) {
        C3016e.X().T0(str);
    }

    @ReactMethod
    public static void setPreinstallPartner(String str) {
        C3016e.X().U0(str);
    }

    public static void setRequestMetadata(String str, String str2) {
        if (str != null) {
            if (mRequestMetadata.has(str) && str2 == null) {
                mRequestMetadata.remove(str);
            }
            try {
                mRequestMetadata.put(str, str2);
            } catch (JSONException unused) {
            }
        }
    }

    private static C3016e setupBranch(Context context) {
        C3016e N10 = C3016e.N(context);
        if (!mInitialized) {
            Log.i("RNBranch", "Initializing Branch SDK v. 5.19.0");
            JSONObject jSONObject = mRequestMetadata;
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        N10.V0(next, mRequestMetadata.getString(next));
                    } catch (JSONException unused) {
                    }
                }
            }
            mInitialized = true;
        }
        return N10;
    }

    @ReactMethod
    public void addFacebookPartnerParameter(String str, String str2) {
        C3016e.X().h(str, str2);
    }

    @ReactMethod
    public void addSnapPartnerParameter(String str, String str2) {
        C3016e.X().j(str, str2);
    }

    @ReactMethod
    public void clearPartnerParameters() {
        C3016e.X().s();
    }

    public Ge.a createBranchQRCode(ReadableMap readableMap) {
        String string;
        Ge.a aVar = new Ge.a();
        if (readableMap.hasKey("codeColor")) {
            aVar.d(readableMap.getString("codeColor"));
        }
        if (readableMap.hasKey("backgroundColor")) {
            aVar.b(readableMap.getString("backgroundColor"));
        }
        if (readableMap.hasKey("centerLogo")) {
            aVar.c(readableMap.getString("centerLogo"));
        }
        if (readableMap.hasKey(Snapshot.WIDTH)) {
            aVar.g(Integer.valueOf(readableMap.getInt(Snapshot.WIDTH)));
        }
        if (readableMap.hasKey("margin")) {
            aVar.f(Integer.valueOf(readableMap.getInt("margin")));
        }
        if (readableMap.hasKey("imageFormat") && (string = readableMap.getString("imageFormat")) != null) {
            if (string.equals("JPEG")) {
                aVar.e(a.b.JPEG);
            } else {
                aVar.e(a.b.PNG);
            }
        }
        return aVar;
    }

    public Ce.a createBranchUniversalObject(ReadableMap readableMap) {
        Ce.a q10 = new Ce.a().q(readableMap.getString("canonicalIdentifier"));
        if (readableMap.hasKey(com.amazon.a.a.o.b.f37461S)) {
            q10.K(readableMap.getString(com.amazon.a.a.o.b.f37461S));
        }
        if (readableMap.hasKey("canonicalUrl")) {
            q10.s(readableMap.getString("canonicalUrl"));
        }
        if (readableMap.hasKey("contentDescription")) {
            q10.u(readableMap.getString("contentDescription"));
        }
        if (readableMap.hasKey("contentImageUrl")) {
            q10.w(readableMap.getString("contentImageUrl"));
        }
        if (readableMap.hasKey("locallyIndex")) {
            if (readableMap.getBoolean("locallyIndex")) {
                q10.G(a.b.PUBLIC);
            } else {
                q10.G(a.b.PRIVATE);
            }
        }
        if (readableMap.hasKey("publiclyIndex")) {
            if (readableMap.getBoolean("publiclyIndex")) {
                q10.y(a.b.PUBLIC);
            } else {
                q10.y(a.b.PRIVATE);
            }
        }
        if (readableMap.hasKey("contentIndexingMode")) {
            if (a.f44587a[readableMap.getType("contentIndexingMode").ordinal()] != 1) {
                Log.w("RNBranch", "contentIndexingMode must be a String");
            } else {
                String string = readableMap.getString("contentIndexingMode");
                if (string.equals("private")) {
                    q10.y(a.b.PRIVATE);
                } else if (string.equals("public")) {
                    q10.y(a.b.PUBLIC);
                } else {
                    Log.w("RNBranch", "Unsupported value for contentIndexingMode: " + string + ". Supported values are \"public\" and \"private\"");
                }
            }
        }
        if (readableMap.hasKey(com.amazon.a.a.o.b.f37469a) && readableMap.hasKey(com.amazon.a.a.o.b.f37501x)) {
            q10.J(readableMap.getDouble(com.amazon.a.a.o.b.f37501x), Ie.e.valueOf(readableMap.getString(com.amazon.a.a.o.b.f37469a)));
        }
        if (readableMap.hasKey("expirationDate")) {
            String string2 = readableMap.getString("expirationDate");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            try {
                Date parse = simpleDateFormat.parse(string2);
                Log.d("RNBranch", "Expiration date is " + parse.toString());
                q10.v(parse);
            } catch (ParseException unused) {
                Log.w("RNBranch", "Invalid expiration date format. Valid format is YYYY-mm-ddTHH:MM:SS, e.g. 2017-02-01T00:00:00. All times UTC.");
            }
        }
        if (readableMap.hasKey("keywords")) {
            ReadableArray array = readableMap.getArray("keywords");
            for (int i10 = 0; i10 < array.size(); i10++) {
                q10.b(array.getString(i10));
            }
        }
        if (readableMap.hasKey("metadata")) {
            ReadableMap map = readableMap.getMap("metadata");
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                q10.a(nextKey, getReadableMapObjectForKey(map, nextKey).toString());
                q10.i();
            }
        }
        if (readableMap.hasKey("type")) {
            q10.F(readableMap.getString("type"));
        }
        if (readableMap.hasKey("contentMetadata")) {
            q10.B(createContentMetadata(readableMap.getMap("contentMetadata")));
        }
        return q10;
    }

    public Ie.d createContentMetadata(ReadableMap readableMap) {
        Double d10;
        String str;
        Double d11;
        Integer num;
        Double d12;
        Ie.h productCategory;
        Ie.e eVar;
        Ie.d dVar = new Ie.d();
        if (readableMap.hasKey("contentSchema")) {
            dVar.g(Ie.b.valueOf(readableMap.getString("contentSchema")));
        }
        if (readableMap.hasKey("quantity")) {
            dVar.p(Double.valueOf(readableMap.getDouble("quantity")));
        }
        Double d13 = null;
        if (readableMap.hasKey(com.amazon.a.a.o.b.f37501x)) {
            double parseDouble = Double.parseDouble(readableMap.getString(com.amazon.a.a.o.b.f37501x));
            if (readableMap.hasKey(com.amazon.a.a.o.b.f37469a)) {
                eVar = Ie.e.valueOf(readableMap.getString(com.amazon.a.a.o.b.f37469a));
            } else {
                eVar = null;
            }
            dVar.i(Double.valueOf(parseDouble), eVar);
        }
        if (readableMap.hasKey("sku")) {
            dVar.s(readableMap.getString("sku"));
        }
        if (readableMap.hasKey("productName")) {
            dVar.n(readableMap.getString("productName"));
        }
        if (readableMap.hasKey("productBrand")) {
            dVar.j(readableMap.getString("productBrand"));
        }
        if (readableMap.hasKey("productCategory") && (productCategory = getProductCategory(readableMap.getString("productCategory"))) != null) {
            dVar.k(productCategory);
        }
        if (readableMap.hasKey("productVariant")) {
            dVar.o(readableMap.getString("productVariant"));
        }
        if (readableMap.hasKey("condition")) {
            dVar.l(d.b.valueOf(readableMap.getString("condition")));
        }
        if (readableMap.hasKey("ratingAverage") || readableMap.hasKey("ratingMax") || readableMap.hasKey("ratingCount")) {
            if (readableMap.hasKey("ratingAverage")) {
                d11 = Double.valueOf(readableMap.getDouble("ratingAverage"));
            } else {
                d11 = null;
            }
            if (readableMap.hasKey("ratingCount")) {
                num = Integer.valueOf(readableMap.getInt("ratingCount"));
            } else {
                num = null;
            }
            if (readableMap.hasKey("ratingMax")) {
                d12 = Double.valueOf(readableMap.getDouble("ratingMax"));
            } else {
                d12 = null;
            }
            dVar.q(d11, d12, num);
        }
        if (readableMap.hasKey("addressStreet") || readableMap.hasKey("addressCity") || readableMap.hasKey("addressRegion") || readableMap.hasKey("addressCountry") || readableMap.hasKey("addressPostalCode")) {
            if (readableMap.hasKey("addressStreet")) {
                str = readableMap.getString("addressStreet");
            } else {
                str = null;
            }
            if (readableMap.hasKey("addressCity")) {
                str = readableMap.getString("addressCity");
            }
            if (readableMap.hasKey("addressRegion")) {
                str = readableMap.getString("addressRegion");
            }
            if (readableMap.hasKey("addressCountry")) {
                str = readableMap.getString("addressCountry");
            }
            if (readableMap.hasKey("addressPostalCode")) {
                str = readableMap.getString("addressPostalCode");
            }
            dVar.f(str, (String) null, (String) null, (String) null, (String) null);
        }
        if (readableMap.hasKey("latitude") || readableMap.hasKey("longitude")) {
            if (readableMap.hasKey("latitude")) {
                d10 = Double.valueOf(readableMap.getDouble("latitude"));
            } else {
                d10 = null;
            }
            if (readableMap.hasKey("longitude")) {
                d13 = Double.valueOf(readableMap.getDouble("longitude"));
            }
            dVar.h(d10, d13);
        }
        if (readableMap.hasKey("imageCaptions")) {
            ReadableArray array = readableMap.getArray("imageCaptions");
            for (int i10 = 0; i10 < array.size(); i10++) {
                dVar.b(array.getString(i10));
            }
        }
        if (readableMap.hasKey("customMetadata")) {
            ReadableMap map = readableMap.getMap("customMetadata");
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                dVar.a(nextKey, map.getString(nextKey));
            }
        }
        return dVar;
    }

    @ReactMethod
    public void createUniversalObject(ReadableMap readableMap, Promise promise) {
        String uuid = UUID.randomUUID().toString();
        this.mUniversalObjectMap.c(uuid, createBranchUniversalObject(readableMap));
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString(IDENT_FIELD_NAME, uuid);
        promise.resolve(writableNativeMap);
    }

    @ReactMethod
    public void disableTracking(boolean z10) {
        C3016e.X().x(z10);
    }

    @ReactMethod
    public void generateShortUrl(String str, ReadableMap readableMap, ReadableMap readableMap2, Promise promise) {
        Ie.g createLinkProperties = createLinkProperties(readableMap, readableMap2);
        Ce.a findUniversalObjectOrReject = findUniversalObjectOrReject(str, promise);
        if (findUniversalObjectOrReject != null) {
            findUniversalObjectOrReject.e(mActivity, createLinkProperties, new h(promise));
        }
    }

    @ReactMethod
    public void getBranchQRCode(ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, ReadableMap readableMap4, Promise promise) {
        Ce.a createBranchUniversalObject = createBranchUniversalObject(readableMap2);
        Ie.g createLinkProperties = createLinkProperties(readableMap3, readableMap4);
        try {
            createBranchQRCode(readableMap).a(getReactApplicationContext().getCurrentActivity(), createBranchUniversalObject, createLinkProperties, new i(promise));
        } catch (IOException e10) {
            e10.printStackTrace();
            Log.d("Failed to get QR Code", e10.getMessage());
            promise.reject("Failed to get QR Code", e10.getMessage());
        }
    }

    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put(INIT_SESSION_SUCCESS, RN_INIT_SESSION_SUCCESS_EVENT);
        hashMap.put(INIT_SESSION_ERROR, RN_INIT_SESSION_ERROR_EVENT);
        hashMap.put(INIT_SESSION_START, RN_INIT_SESSION_START_EVENT);
        hashMap.put(STANDARD_EVENT_ADD_TO_CART, Ie.a.ADD_TO_CART.b());
        hashMap.put(STANDARD_EVENT_ADD_TO_WISHLIST, Ie.a.ADD_TO_WISHLIST.b());
        hashMap.put(STANDARD_EVENT_VIEW_CART, Ie.a.VIEW_CART.b());
        hashMap.put(STANDARD_EVENT_INITIATE_PURCHASE, Ie.a.INITIATE_PURCHASE.b());
        hashMap.put(STANDARD_EVENT_ADD_PAYMENT_INFO, Ie.a.ADD_PAYMENT_INFO.b());
        hashMap.put(STANDARD_EVENT_PURCHASE, Ie.a.PURCHASE.b());
        hashMap.put(STANDARD_EVENT_VIEW_AD, Ie.a.VIEW_AD.b());
        hashMap.put(STANDARD_EVENT_CLICK_AD, Ie.a.CLICK_AD.b());
        hashMap.put(STANDARD_EVENT_SEARCH, Ie.a.SEARCH.b());
        hashMap.put(STANDARD_EVENT_VIEW_ITEM, Ie.a.VIEW_ITEM.b());
        hashMap.put(STANDARD_EVENT_VIEW_ITEMS, Ie.a.VIEW_ITEMS.b());
        hashMap.put(STANDARD_EVENT_RATE, Ie.a.RATE.b());
        hashMap.put(STANDARD_EVENT_SHARE, Ie.a.SHARE.b());
        hashMap.put(STANDARD_EVENT_COMPLETE_REGISTRATION, Ie.a.COMPLETE_REGISTRATION.b());
        hashMap.put(STANDARD_EVENT_COMPLETE_TUTORIAL, Ie.a.COMPLETE_TUTORIAL.b());
        hashMap.put(STANDARD_EVENT_ACHIEVE_LEVEL, Ie.a.ACHIEVE_LEVEL.b());
        hashMap.put(STANDARD_EVENT_UNLOCK_ACHIEVEMENT, Ie.a.UNLOCK_ACHIEVEMENT.b());
        hashMap.put(STANDARD_EVENT_INVITE, Ie.a.INVITE.b());
        hashMap.put(STANDARD_EVENT_LOGIN, Ie.a.LOGIN.b());
        hashMap.put(STANDARD_EVENT_RESERVE, Ie.a.RESERVE.b());
        hashMap.put(STANDARD_EVENT_SUBSCRIBE, Ie.a.SUBSCRIBE.b());
        hashMap.put(STANDARD_EVENT_START_TRIAL, Ie.a.START_TRIAL.b());
        return hashMap;
    }

    @ReactMethod
    public void getFirstReferringParams(Promise promise) {
        promise.resolve(convertJsonToMap(C3016e.X().U()));
    }

    @ReactMethod
    public void getLatestReferringParams(boolean z10, Promise promise) {
        C3016e X10 = C3016e.X();
        if (z10) {
            promise.resolve(convertJsonToMap(X10.a0()));
        } else {
            promise.resolve(convertJsonToMap(X10.Z()));
        }
    }

    public String getName() {
        return "RNBranch";
    }

    public Ie.h getProductCategory(String str) {
        for (Ie.h hVar : (Ie.h[]) Ie.h.class.getEnumConstants()) {
            if (str.equals(hVar.b())) {
                return hVar;
            }
        }
        Log.w("RNBranch", "Could not find product category " + str);
        return null;
    }

    @ReactMethod
    public void isTrackingDisabled(Promise promise) {
        promise.resolve(Boolean.valueOf(C3016e.X().r0()));
    }

    @ReactMethod
    public void lastAttributedTouchData(int i10, Promise promise) {
        C3016e.X().Y(new e(promise), i10);
    }

    @ReactMethod
    public void logEvent(ReadableArray readableArray, String str, ReadableMap readableMap, Promise promise) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < readableArray.size()) {
            Ce.a findUniversalObjectOrReject = findUniversalObjectOrReject(readableArray.getString(i10), promise);
            if (findUniversalObjectOrReject != null) {
                arrayList.add(findUniversalObjectOrReject);
                i10++;
            } else {
                return;
            }
        }
        Ie.c createBranchEvent = createBranchEvent(str, readableMap);
        createBranchEvent.a(arrayList);
        createBranchEvent.f(mActivity);
        promise.resolve((Object) null);
    }

    @ReactMethod
    public void logout() {
        C3016e.X().w0();
    }

    @ReactMethod
    public void notifyNativeToInit() {
        Log.d("RNBranch", "notifyNativeToInit");
        C3016e.y0();
    }

    public void onCatalystInstanceDestroy() {
        Log.d("RNBranch", "onCatalystInstanceDestroy ");
        C1926a.b(getReactApplicationContext()).e(this.mInitSessionFinishedEventReceiver);
        C1926a.b(getReactApplicationContext()).e(this.mInitSessionStartedEventReceiver);
    }

    @ReactMethod
    public void openURL(String str, ReadableMap readableMap) {
        Log.d("RNBranch", "openURL url: " + str);
        if (mActivity == null) {
            Log.e("RNBranch", "Branch native Android SDK not initialized in openURL");
            return;
        }
        Activity activity = mActivity;
        Intent intent = new Intent(activity, activity.getClass());
        intent.setData(Uri.parse(str));
        intent.putExtra("branch_force_new_session", true);
        mActivity.startActivity(intent);
    }

    @ReactMethod
    public void redeemInitSessionResult(Promise promise) {
        promise.resolve(convertJsonToMap(initSessionResult));
    }

    @ReactMethod
    public void registerView(String str, Promise promise) {
        Ce.a findUniversalObjectOrReject = findUniversalObjectOrReject(str, promise);
        if (findUniversalObjectOrReject != null) {
            findUniversalObjectOrReject.o();
            promise.resolve((Object) null);
        }
    }

    @ReactMethod
    public void releaseUniversalObject(String str) {
        this.mUniversalObjectMap.d(str);
    }

    public void sendRNEvent(String str, WritableMap writableMap) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Handler handler = new Handler(reactApplicationContext.getMainLooper());
        Runnable a10 = new j().b(reactApplicationContext, handler, str, writableMap);
        Log.d("RNBranch", "sendRNEvent");
        handler.post(a10);
    }

    @ReactMethod
    public void setConsumerProtectionAttributionLevel(String str) {
        C3032v vVar;
        C3016e X10 = C3016e.X();
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 2169487:
                if (str.equals("FULL")) {
                    c10 = 0;
                    break;
                }
                break;
            case 2402104:
                if (str.equals("NONE")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1782520193:
                if (str.equals("MINIMAL")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1801667486:
                if (str.equals("REDUCED")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                vVar = C3032v.FULL;
                break;
            case 1:
                vVar = C3032v.NONE;
                break;
            case 2:
                vVar = C3032v.MINIMAL;
                break;
            case 3:
                vVar = C3032v.REDUCED;
                break;
            default:
                Log.w("RNBranch", "Invalid attribution level: " + str);
                return;
        }
        X10.K0(vVar);
    }

    @ReactMethod
    public void setDMAParamsForEEA(boolean z10, boolean z11, boolean z12) {
        C3016e.X().M0(z10, z11, z12);
    }

    @ReactMethod
    public void setIdentity(String str) {
        C3016e.X().O0(str);
    }

    @ReactMethod
    public void setIdentityAsync(String str, Promise promise) {
        C3016e.X().P0(str, new f(promise));
    }

    @ReactMethod
    public void setRequestMetadataKey(String str, String str2) {
        C3016e.X().V0(str, str2);
    }

    @ReactMethod
    public void showShareSheet(String str, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, Promise promise) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        new Handler(reactApplicationContext.getMainLooper()).post(new g().b(readableMap, str, readableMap2, readableMap3, promise, reactApplicationContext));
    }

    @ReactMethod
    public void validateSDKIntegration() {
        Je.i.k(mActivity);
    }

    public static void initSession(Uri uri, Activity activity) {
        Log.d("RNBranch", "initSession uri " + uri + " reactActivity " + activity);
        setupBranch(activity.getApplicationContext());
        mActivity = activity;
        referralInitListener = new b(mNewIntent, uri).d(activity);
        notifyJSOfInitSessionStart(activity, uri);
        C3016e.l f10 = C3016e.H0(activity).e(referralInitListener).f(uri);
        Log.d("RNBranch", "sessionBuilder " + f10);
        f10.b();
    }
}
