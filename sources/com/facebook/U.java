package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.adjust.sdk.Constants;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import io.intercom.android.sdk.models.AttributeType;
import java.util.ArrayList;
import java.util.Date;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.J;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class U {

    /* renamed from: c  reason: collision with root package name */
    public static final a f39369c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private static final String f39370d = U.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private final String f39371a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f39372b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Date b(Bundle bundle, String str) {
            if (bundle == null) {
                return null;
            }
            long j10 = bundle.getLong(str, Long.MIN_VALUE);
            if (j10 == Long.MIN_VALUE) {
                return null;
            }
            return new Date(j10);
        }

        public final String a(Bundle bundle) {
            C6496s.h(bundle, "bundle");
            return bundle.getString("com.facebook.TokenCachingStrategy.ApplicationId");
        }

        public final Date c(Bundle bundle) {
            C6496s.h(bundle, "bundle");
            return b(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate");
        }

        public final Date d(Bundle bundle) {
            C6496s.h(bundle, "bundle");
            return b(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate");
        }

        public final C3293h e(Bundle bundle) {
            C6496s.h(bundle, "bundle");
            if (bundle.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource")) {
                return (C3293h) bundle.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource");
            }
            if (bundle.getBoolean("com.facebook.TokenCachingStrategy.IsSSO")) {
                return C3293h.FACEBOOK_APPLICATION_WEB;
            }
            return C3293h.WEB_VIEW;
        }

        public final String f(Bundle bundle) {
            C6496s.h(bundle, "bundle");
            return bundle.getString("com.facebook.TokenCachingStrategy.Token");
        }

        public final boolean g(Bundle bundle) {
            String string;
            if (bundle == null || (string = bundle.getString("com.facebook.TokenCachingStrategy.Token")) == null || string.length() == 0 || bundle.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0) == 0) {
                return false;
            }
            return true;
        }

        private a() {
        }
    }

    public U(Context context, String str) {
        C6496s.h(context, "context");
        str = (str == null || str.length() == 0) ? "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY" : str;
        this.f39371a = str;
        Context applicationContext = context.getApplicationContext();
        SharedPreferences sharedPreferences = (applicationContext != null ? applicationContext : context).getSharedPreferences(str, 0);
        C6496s.g(sharedPreferences, "context.getSharedPrefere…ey, Context.MODE_PRIVATE)");
        this.f39372b = sharedPreferences;
    }

    private final void b(String str, Bundle bundle) {
        String str2;
        String string;
        String string2 = this.f39372b.getString(str, "{}");
        if (string2 != null) {
            C6496s.g(string2, "checkNotNull(cache.getString(key, \"{}\"))");
            JSONObject jSONObject = new JSONObject(string2);
            String string3 = jSONObject.getString("valueType");
            if (string3 != null) {
                int i10 = 0;
                switch (string3.hashCode()) {
                    case -1573317553:
                        if (string3.equals("stringList")) {
                            JSONArray jSONArray = jSONObject.getJSONArray("value");
                            int length = jSONArray.length();
                            ArrayList arrayList = new ArrayList(length);
                            while (i10 < length) {
                                Object obj = jSONArray.get(i10);
                                if (obj == JSONObject.NULL) {
                                    str2 = null;
                                } else {
                                    C6496s.f(obj, "null cannot be cast to non-null type kotlin.String");
                                    str2 = (String) obj;
                                }
                                arrayList.add(i10, str2);
                                i10++;
                            }
                            bundle.putStringArrayList(str, arrayList);
                            return;
                        }
                        return;
                    case -1383386164:
                        if (string3.equals("bool[]")) {
                            JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                            int length2 = jSONArray2.length();
                            boolean[] zArr = new boolean[length2];
                            while (i10 < length2) {
                                zArr[i10] = jSONArray2.getBoolean(i10);
                                i10++;
                            }
                            bundle.putBooleanArray(str, zArr);
                            return;
                        }
                        return;
                    case -1374008726:
                        if (string3.equals("byte[]")) {
                            JSONArray jSONArray3 = jSONObject.getJSONArray("value");
                            int length3 = jSONArray3.length();
                            byte[] bArr = new byte[length3];
                            while (i10 < length3) {
                                bArr[i10] = (byte) jSONArray3.getInt(i10);
                                i10++;
                            }
                            bundle.putByteArray(str, bArr);
                            return;
                        }
                        return;
                    case -1361632968:
                        if (string3.equals("char[]")) {
                            JSONArray jSONArray4 = jSONObject.getJSONArray("value");
                            int length4 = jSONArray4.length();
                            char[] cArr = new char[length4];
                            for (int i11 = 0; i11 < length4; i11++) {
                                String string4 = jSONArray4.getString(i11);
                                if (string4 != null && string4.length() == 1) {
                                    cArr[i11] = string4.charAt(0);
                                }
                            }
                            bundle.putCharArray(str, cArr);
                            return;
                        }
                        return;
                    case -1325958191:
                        if (string3.equals("double")) {
                            bundle.putDouble(str, jSONObject.getDouble("value"));
                            return;
                        }
                        return;
                    case -1097129250:
                        if (string3.equals("long[]")) {
                            JSONArray jSONArray5 = jSONObject.getJSONArray("value");
                            int length5 = jSONArray5.length();
                            long[] jArr = new long[length5];
                            while (i10 < length5) {
                                jArr[i10] = jSONArray5.getLong(i10);
                                i10++;
                            }
                            bundle.putLongArray(str, jArr);
                            return;
                        }
                        return;
                    case -891985903:
                        if (string3.equals("string")) {
                            bundle.putString(str, jSONObject.getString("value"));
                            return;
                        }
                        return;
                    case -766441794:
                        if (string3.equals("float[]")) {
                            JSONArray jSONArray6 = jSONObject.getJSONArray("value");
                            int length6 = jSONArray6.length();
                            float[] fArr = new float[length6];
                            while (i10 < length6) {
                                fArr[i10] = (float) jSONArray6.getDouble(i10);
                                i10++;
                            }
                            bundle.putFloatArray(str, fArr);
                            return;
                        }
                        return;
                    case 104431:
                        if (string3.equals("int")) {
                            bundle.putInt(str, jSONObject.getInt("value"));
                            return;
                        }
                        return;
                    case 3029738:
                        if (string3.equals("bool")) {
                            bundle.putBoolean(str, jSONObject.getBoolean("value"));
                            return;
                        }
                        return;
                    case 3039496:
                        if (string3.equals("byte")) {
                            bundle.putByte(str, (byte) jSONObject.getInt("value"));
                            return;
                        }
                        return;
                    case 3052374:
                        if (string3.equals("char") && (string = jSONObject.getString("value")) != null && string.length() == 1) {
                            bundle.putChar(str, string.charAt(0));
                            return;
                        }
                        return;
                    case 3118337:
                        if (string3.equals("enum")) {
                            try {
                                Class cls = Class.forName(jSONObject.getString("enumType"));
                                C6496s.f(cls, "null cannot be cast to non-null type java.lang.Class<out kotlin.Enum<*>>");
                                bundle.putSerializable(str, Enum.valueOf(cls, jSONObject.getString("value")));
                                return;
                            } catch (ClassNotFoundException | IllegalArgumentException unused) {
                                return;
                            }
                        } else {
                            return;
                        }
                    case 3327612:
                        if (string3.equals(Constants.LONG)) {
                            bundle.putLong(str, jSONObject.getLong("value"));
                            return;
                        }
                        return;
                    case 97526364:
                        if (string3.equals(AttributeType.FLOAT)) {
                            bundle.putFloat(str, (float) jSONObject.getDouble("value"));
                            return;
                        }
                        return;
                    case 100361105:
                        if (string3.equals("int[]")) {
                            JSONArray jSONArray7 = jSONObject.getJSONArray("value");
                            int length7 = jSONArray7.length();
                            int[] iArr = new int[length7];
                            while (i10 < length7) {
                                iArr[i10] = jSONArray7.getInt(i10);
                                i10++;
                            }
                            bundle.putIntArray(str, iArr);
                            return;
                        }
                        return;
                    case 109413500:
                        if (string3.equals("short")) {
                            bundle.putShort(str, (short) jSONObject.getInt("value"));
                            return;
                        }
                        return;
                    case 1359468275:
                        if (string3.equals("double[]")) {
                            JSONArray jSONArray8 = jSONObject.getJSONArray("value");
                            int length8 = jSONArray8.length();
                            double[] dArr = new double[length8];
                            while (i10 < length8) {
                                dArr[i10] = jSONArray8.getDouble(i10);
                                i10++;
                            }
                            bundle.putDoubleArray(str, dArr);
                            return;
                        }
                        return;
                    case 2067161310:
                        if (string3.equals("short[]")) {
                            JSONArray jSONArray9 = jSONObject.getJSONArray("value");
                            int length9 = jSONArray9.length();
                            short[] sArr = new short[length9];
                            while (i10 < length9) {
                                sArr[i10] = (short) jSONArray9.getInt(i10);
                                i10++;
                            }
                            bundle.putShortArray(str, sArr);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void a() {
        this.f39372b.edit().clear().apply();
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        for (String next : this.f39372b.getAll().keySet()) {
            try {
                C6496s.g(next, SubscriberAttributeKt.JSON_NAME_KEY);
                b(next, bundle);
            } catch (JSONException e10) {
                J.a aVar = J.f47112e;
                V v10 = V.CACHE;
                String str = f39370d;
                C6496s.g(str, "TAG");
                aVar.a(v10, 5, str, "Error reading cached value for key: '" + next + "' -- " + e10);
                return null;
            }
        }
        return bundle;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U(Context context, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : str);
    }
}
