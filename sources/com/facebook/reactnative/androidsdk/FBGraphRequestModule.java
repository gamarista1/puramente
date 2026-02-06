package com.facebook.reactnative.androidsdk;

import android.os.Bundle;
import android.util.SparseArray;
import com.facebook.C3286a;
import com.facebook.C3293h;
import com.facebook.C3462y;
import com.facebook.M;
import com.facebook.Q;
import com.facebook.S;
import com.facebook.T;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Q7.a(name = "FBGraphRequest")
public class FBGraphRequestModule extends ReactContextBaseJavaModule {
    public static final String NAME = "FBGraphRequest";
    /* access modifiers changed from: private */
    public SparseArray<WritableMap> mResponses = new SparseArray<>();

    private class a implements Q.a {

        /* renamed from: a  reason: collision with root package name */
        private int f42363a;

        /* renamed from: b  reason: collision with root package name */
        private Callback f42364b;

        public a(int i10, Callback callback) {
            this.f42363a = i10;
            this.f42364b = callback;
        }

        public void a(Q q10) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("result", "batch finished executing or timed out");
            this.f42364b.invoke(null, createMap, FBGraphRequestModule.this.mResponses.get(this.f42363a));
            FBGraphRequestModule.this.mResponses.remove(this.f42363a);
        }
    }

    private class b implements M.b {

        /* renamed from: a  reason: collision with root package name */
        private String f42366a;

        /* renamed from: b  reason: collision with root package name */
        private int f42367b;

        public b(int i10, int i11) {
            this.f42366a = String.valueOf(i10);
            this.f42367b = i11;
        }

        public void a(S s10) {
            WritableArray createArray = Arguments.createArray();
            createArray.pushMap(FBGraphRequestModule.this.buildFacebookRequestError(s10.b()));
            createArray.pushMap(FBGraphRequestModule.this.buildGraphResponse(s10));
            ((WritableMap) FBGraphRequestModule.this.mResponses.get(this.f42367b)).putArray(this.f42366a, createArray);
        }
    }

    public FBGraphRequestModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* access modifiers changed from: private */
    public WritableMap buildFacebookRequestError(C3462y yVar) {
        if (yVar == null) {
            return null;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("requestStatusCode", yVar.k());
        createMap.putInt("errorCode", yVar.c());
        createMap.putInt("subErrorCode", yVar.l());
        if (yVar.e() != null) {
            createMap.putString("errorType", yVar.e());
        }
        if (yVar.d() != null) {
            createMap.putString(com.amazon.a.a.o.b.f37483f, yVar.d());
        }
        if (yVar.g() != null) {
            createMap.putString("errorUserTitle", yVar.g());
        }
        if (yVar.f() != null) {
            createMap.putString("errorUserMessage", yVar.f());
        }
        if (yVar.j() != null) {
            createMap.putString("requestResultBody", yVar.j().toString());
        }
        if (yVar.i() != null) {
            createMap.putString("requestResult", yVar.i().toString());
        }
        if (yVar.b() != null) {
            createMap.putString("batchRequestResult", yVar.b().toString());
        }
        if (yVar.h() != null) {
            createMap.putString("exception", yVar.h().toString());
        }
        return createMap;
    }

    /* access modifiers changed from: private */
    public WritableMap buildGraphResponse(S s10) {
        if (s10.c() != null) {
            return convertJSONObject(s10.c());
        }
        return Arguments.createMap();
    }

    private Bundle buildParameters(ReadableMap readableMap) {
        Bundle bundle = new Bundle();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            ReadableMap map = readableMap.getMap(nextKey);
            if (map.hasKey("string")) {
                bundle.putString(nextKey, map.getString("string"));
            }
        }
        return bundle;
    }

    private M buildRequest(ReadableMap readableMap) {
        M m10 = new M();
        m10.H(readableMap.getString("graphPath"));
        setConfig(m10, readableMap.getMap("config"));
        return m10;
    }

    private WritableArray convertJSONArray(JSONArray jSONArray) {
        WritableArray createArray = Arguments.createArray();
        int i10 = 0;
        while (i10 < jSONArray.length()) {
            try {
                Object obj = jSONArray.get(i10);
                if (obj instanceof JSONObject) {
                    createArray.pushMap(convertJSONObject((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    createArray.pushArray(convertJSONArray((JSONArray) obj));
                } else if (obj instanceof String) {
                    createArray.pushString((String) obj);
                } else if (obj instanceof Integer) {
                    createArray.pushInt(((Integer) obj).intValue());
                } else if (obj instanceof Boolean) {
                    createArray.pushBoolean(((Boolean) obj).booleanValue());
                } else if (obj instanceof Double) {
                    createArray.pushDouble(((Double) obj).doubleValue());
                }
                i10++;
            } catch (JSONException unused) {
            }
        }
        return createArray;
    }

    private WritableMap convertJSONObject(JSONObject jSONObject) {
        WritableMap createMap = Arguments.createMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONObject) {
                    createMap.putMap(next, convertJSONObject((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    createMap.putArray(next, convertJSONArray((JSONArray) obj));
                } else if (obj instanceof String) {
                    createMap.putString(next, (String) obj);
                } else if (obj instanceof Integer) {
                    createMap.putInt(next, ((Integer) obj).intValue());
                } else if (obj instanceof Boolean) {
                    createMap.putBoolean(next, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Double) {
                    createMap.putDouble(next, ((Double) obj).doubleValue());
                }
            } catch (JSONException unused) {
            }
        }
        return createMap;
    }

    private void setConfig(M m10, ReadableMap readableMap) {
        if (readableMap == null) {
            m10.D(C3286a.d());
            return;
        }
        if (readableMap.hasKey("parameters")) {
            m10.J(buildParameters(readableMap.getMap("parameters")));
        }
        if (readableMap.hasKey("httpMethod")) {
            m10.I(T.valueOf(readableMap.getString("httpMethod")));
        }
        if (readableMap.hasKey(DiagnosticsEntry.VERSION_KEY)) {
            m10.L(readableMap.getString(DiagnosticsEntry.VERSION_KEY));
        }
        if (readableMap.hasKey("accessToken")) {
            m10.D(new C3286a(readableMap.getString("accessToken"), C3286a.d().c(), C3286a.d().o(), (Collection) null, (Collection) null, (Collection) null, (C3293h) null, (Date) null, (Date) null, (Date) null));
        } else {
            m10.D(C3286a.d());
        }
    }

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void start(ReadableArray readableArray, int i10, Callback callback) {
        int i11;
        int i12;
        Q q10 = new Q();
        synchronized (this) {
            i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                if (this.mResponses.get(i12) == null) {
                    this.mResponses.put(i12, Arguments.createMap());
                } else {
                    i12 = i13;
                }
            }
            while (true) {
            }
        }
        for (i11 = 0; i11 < readableArray.size(); i11++) {
            M buildRequest = buildRequest(readableArray.getMap(i11));
            buildRequest.E(new b(i11, i12));
            q10.add(buildRequest);
        }
        q10.S(i10);
        q10.d(new a(i12, callback));
        q10.m();
    }
}
