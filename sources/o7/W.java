package o7;

import F5.j;
import Sg.C5541d;
import Sg.m;
import Sg.p;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.adjust.sdk.Constants;
import com.amazon.a.a.o.b.f;
import com.facebook.C3286a;
import com.facebook.C3459v;
import com.facebook.I;
import com.facebook.M;
import com.facebook.S;
import com.facebook.T;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import io.branch.rnbranch.RNBranchModule;
import io.intercom.android.sdk.models.AttributeType;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.U;
import l0.C2163a;
import l0.C2164b;
import o7.C3902s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import t7.C4049a;

public final class W {

    /* renamed from: a  reason: collision with root package name */
    public static final W f47163a = new W();

    /* renamed from: b  reason: collision with root package name */
    private static int f47164b;

    /* renamed from: c  reason: collision with root package name */
    private static long f47165c = -1;

    /* renamed from: d  reason: collision with root package name */
    private static long f47166d = -1;

    /* renamed from: e  reason: collision with root package name */
    private static long f47167e = -1;

    /* renamed from: f  reason: collision with root package name */
    private static String f47168f = "";

    /* renamed from: g  reason: collision with root package name */
    private static String f47169g = "";

    /* renamed from: h  reason: collision with root package name */
    private static String f47170h = "NoCarrier";

    /* renamed from: i  reason: collision with root package name */
    private static String f47171i = "";

    /* renamed from: j  reason: collision with root package name */
    private static Locale f47172j;

    public interface a {
        void a(JSONObject jSONObject);

        void b(C3459v vVar);
    }

    private W() {
    }

    public static final long A(Uri uri) {
        C6496s.h(uri, "contentUri");
        Cursor cursor = null;
        try {
            Cursor query = I.l().getContentResolver().query(uri, (String[]) null, (String) null, (String[]) null, (String) null);
            if (query == null) {
                return 0;
            }
            int columnIndex = query.getColumnIndex("_size");
            query.moveToFirst();
            long j10 = query.getLong(columnIndex);
            query.close();
            return j10;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* access modifiers changed from: private */
    public static final boolean A0(File file, String str) {
        return Pattern.matches("cpu[0-9]+", str);
    }

    public static final Locale B() {
        Locale O10 = O();
        if (O10 != null) {
            return O10;
        }
        Locale locale = Locale.getDefault();
        C6496s.g(locale, "getDefault()");
        return locale;
    }

    private final void B0(Context context) {
        if (C6496s.c(f47170h, "NoCarrier")) {
            try {
                Object systemService = context.getSystemService(AttributeType.PHONE);
                C6496s.f(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                C6496s.g(networkOperatorName, "telephonyManager.networkOperatorName");
                f47170h = networkOperatorName;
            } catch (Exception unused) {
            }
        }
    }

    private final String C() {
        C3286a e10 = C3286a.f39402l.e();
        if (e10 == null || e10.i() == null) {
            return "facebook";
        }
        return e10.i();
    }

    private final void C0(Context context) {
        if (f47165c == -1 || System.currentTimeMillis() - f47165c >= 1800000) {
            f47165c = System.currentTimeMillis();
            D0();
            B0(context);
            E0();
            y0();
        }
    }

    public static final JSONObject D() {
        Class<W> cls = W.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            String string = I.l().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", (String) null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    private final void D0() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            C6496s.g(displayName, "tz.getDisplayName(tz.inD…(Date()), TimeZone.SHORT)");
            f47168f = displayName;
            String id2 = timeZone.getID();
            C6496s.g(id2, "tz.id");
            f47169g = id2;
        } catch (AssertionError | Exception unused) {
        }
    }

    private final void E0() {
        try {
            if (s()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f47166d = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            }
            f47166d = l((double) f47166d);
        } catch (Exception unused) {
        }
    }

    public static final String F(String str) {
        String u10 = I.u();
        if (str == null) {
            return u10;
        }
        if (C6496s.c(str, "gaming")) {
            return p.D(u10, "facebook.com", "fb.gg", false, 4, (Object) null);
        }
        if (C6496s.c(str, "instagram")) {
            return p.D(u10, "facebook.com", "instagram.com", false, 4, (Object) null);
        }
        return u10;
    }

    public static final void F0(Runnable runnable) {
        try {
            I.t().execute(runnable);
        } catch (Exception unused) {
        }
    }

    private final M G(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", N(C()));
        bundle.putString("access_token", str);
        M y10 = M.f39311n.y((C3286a) null, (M.d) null);
        y10.J(bundle);
        y10.I(T.GET);
        return y10;
    }

    public static final void G0(JSONObject jSONObject, C3886b bVar, String str, boolean z10, Context context) {
        String str2;
        C6496s.h(jSONObject, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS);
        C6496s.h(context, "context");
        C3902s.b bVar2 = C3902s.b.ServiceUpdateCompliance;
        if (!C3902s.g(bVar2)) {
            jSONObject.put("anon_id", str);
        }
        jSONObject.put("application_tracking_enabled", !z10);
        jSONObject.put("advertiser_id_collection_enabled", I.k());
        if (bVar != null) {
            if (C3902s.g(bVar2)) {
                f47163a.c(jSONObject, bVar, str, context);
            }
            if (bVar.j() != null) {
                if (C3902s.g(bVar2)) {
                    f47163a.d(jSONObject, bVar, context);
                } else {
                    jSONObject.put("attribution", bVar.j());
                }
            }
            if (bVar.h() != null) {
                jSONObject.put("advertiser_id", bVar.h());
                jSONObject.put("advertiser_tracking_enabled", !bVar.l());
            }
            if (!bVar.l()) {
                String c10 = t5.W.c();
                if (c10.length() != 0) {
                    jSONObject.put("ud", c10);
                }
            }
            if (bVar.i() != null) {
                jSONObject.put("installer_package", bVar.i());
            }
        }
        j a10 = j.f30769b.a();
        if (a10 != null) {
            str2 = a10.e("campaign_ids");
        } else {
            str2 = null;
        }
        if (str2 != null) {
            jSONObject.put("campaign_ids", str2);
        }
    }

    public static final void H(String str, a aVar) {
        C6496s.h(str, "accessToken");
        C6496s.h(aVar, "callback");
        JSONObject a10 = O.a(str);
        if (a10 != null) {
            aVar.a(a10);
            return;
        }
        V v10 = new V(aVar, str);
        M G10 = f47163a.G(str);
        G10.E(v10);
        G10.l();
    }

    public static final void H0(JSONObject jSONObject, Context context) {
        Locale locale;
        String str;
        String str2;
        int i10;
        DisplayManager displayManager;
        C6496s.h(jSONObject, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS);
        C6496s.h(context, "appContext");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        f47163a.C0(context);
        String packageName = context.getPackageName();
        int i11 = 0;
        int i12 = -1;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            if (packageInfo != null) {
                i12 = packageInfo.versionCode;
                f47171i = packageInfo.versionName;
                jSONArray.put(packageName);
                jSONArray.put(i12);
                jSONArray.put(f47171i);
                jSONArray.put(Build.VERSION.RELEASE);
                jSONArray.put(Build.MODEL);
                try {
                    locale = context.getResources().getConfiguration().locale;
                } catch (Exception unused) {
                    locale = Locale.getDefault();
                }
                f47172j = locale;
                StringBuilder sb2 = new StringBuilder();
                Locale locale2 = f47172j;
                Display display = null;
                if (locale2 != null) {
                    str = locale2.getLanguage();
                } else {
                    str = null;
                }
                String str3 = "";
                if (str == null) {
                    str = str3;
                }
                sb2.append(str);
                sb2.append('_');
                Locale locale3 = f47172j;
                if (locale3 != null) {
                    str2 = locale3.getCountry();
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    str3 = str2;
                }
                sb2.append(str3);
                jSONArray.put(sb2.toString());
                jSONArray.put(f47168f);
                jSONArray.put(f47170h);
                double d10 = 0.0d;
                try {
                    Object systemService = context.getSystemService("display");
                    if (systemService instanceof DisplayManager) {
                        displayManager = (DisplayManager) systemService;
                    } else {
                        displayManager = null;
                    }
                    if (displayManager != null) {
                        display = displayManager.getDisplay(0);
                    }
                    if (display != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        display.getMetrics(displayMetrics);
                        int i13 = displayMetrics.widthPixels;
                        try {
                            i11 = displayMetrics.heightPixels;
                            d10 = (double) displayMetrics.density;
                        } catch (Exception unused2) {
                        }
                        i10 = i11;
                        i11 = i13;
                        jSONArray.put(i11);
                        jSONArray.put(i10);
                        jSONArray.put(new DecimalFormat("#.##").format(d10));
                        jSONArray.put(f47163a.z0());
                        jSONArray.put(f47166d);
                        jSONArray.put(f47167e);
                        jSONArray.put(f47169g);
                        jSONObject.put("extinfo", jSONArray.toString());
                    }
                } catch (Exception unused3) {
                }
                i10 = 0;
                jSONArray.put(i11);
                jSONArray.put(i10);
                jSONArray.put(new DecimalFormat("#.##").format(d10));
                jSONArray.put(f47163a.z0());
                jSONArray.put(f47166d);
                jSONArray.put(f47167e);
                jSONArray.put(f47169g);
                jSONObject.put("extinfo", jSONArray.toString());
            }
        } catch (PackageManager.NameNotFoundException unused4) {
        }
    }

    /* access modifiers changed from: private */
    public static final void I(a aVar, String str, S s10) {
        C6496s.h(aVar, "$callback");
        C6496s.h(str, "$accessToken");
        C6496s.h(s10, "response");
        if (s10.b() != null) {
            aVar.b(s10.b().h());
            return;
        }
        JSONObject d10 = s10.d();
        if (d10 != null) {
            O.b(str, d10);
            aVar.a(s10.d());
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final String I0(byte[] bArr) {
        C6496s.h(bArr, "bytes");
        return f47163a.U("SHA-1", bArr);
    }

    public static final String J0(String str) {
        if (str == null) {
            return null;
        }
        return f47163a.T("SHA-256", str);
    }

    public static final String K(Context context) {
        X.m(context, "context");
        return I.m();
    }

    public static final boolean K0(String str, String str2) {
        boolean z10;
        boolean z11;
        if (str == null || str.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (str2 == null || str2.length() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && z11) {
            return true;
        }
        if (z10 || z11) {
            return false;
        }
        return C6496s.c(str, str2);
    }

    public static final Method L(Class cls, String str, Class... clsArr) {
        C6496s.h(cls, "clazz");
        C6496s.h(str, "methodName");
        C6496s.h(clsArr, "parameterTypes");
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static final void L0(Parcel parcel, Map map) {
        C6496s.h(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    public static final Method M(String str, String str2, Class... clsArr) {
        C6496s.h(str, "className");
        C6496s.h(str2, "methodName");
        C6496s.h(clsArr, "parameterTypes");
        try {
            Class<?> cls = Class.forName(str);
            C6496s.g(cls, "clazz");
            return L(cls, str2, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final void M0(Parcel parcel, Map map) {
        C6496s.h(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    private final String N(String str) {
        if (C6496s.c(str, "instagram")) {
            return "id,name,profile_picture";
        }
        return "id,name,first_name,middle_name,last_name";
    }

    public static final Locale O() {
        try {
            return I.l().getResources().getConfiguration().locale;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Object P(JSONObject jSONObject, String str, String str2) {
        C6496s.h(jSONObject, "jsonObject");
        Object opt = jSONObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt == null || (opt instanceof JSONObject) || (opt instanceof JSONArray)) {
            return opt;
        }
        if (str2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt(str2, opt);
            return jSONObject2;
        }
        throw new C3459v("Got an unexpected non-JSON object.");
    }

    public static final String Q(Uri uri) {
        if (uri != null) {
            return uri.toString();
        }
        return null;
    }

    private final String S(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        StringBuilder sb2 = new StringBuilder();
        C6496s.g(digest, "digest");
        for (byte b10 : digest) {
            sb2.append(Integer.toHexString((b10 >> 4) & 15));
            sb2.append(Integer.toHexString(b10 & 15));
        }
        String sb3 = sb2.toString();
        C6496s.g(sb3, "builder.toString()");
        return sb3;
    }

    private final String T(String str, String str2) {
        byte[] bytes = str2.getBytes(C5541d.f65029b);
        C6496s.g(bytes, "this as java.lang.String).getBytes(charset)");
        return U(str, bytes);
    }

    private final String U(String str, byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            C6496s.g(instance, "hash");
            return S(instance, bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static final Object V(Object obj, Method method, Object... objArr) {
        C6496s.h(method, "method");
        C6496s.h(objArr, "args");
        try {
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final boolean W() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            U u10 = U.f71764a;
            String format = String.format("fb%s://applinks", Arrays.copyOf(new Object[]{I.m()}, 1));
            C6496s.g(format, "format(format, *args)");
            intent.setData(Uri.parse(format));
            Context l10 = I.l();
            PackageManager packageManager = l10.getPackageManager();
            String packageName = l10.getPackageName();
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            C6496s.g(queryIntentActivities, "packageManager.queryInte…nager.MATCH_DEFAULT_ONLY)");
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (C6496s.c(packageName, resolveInfo.activityInfo.packageName)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean X(Context context) {
        AutofillManager a10;
        C6496s.h(context, "context");
        if (Build.VERSION.SDK_INT >= 26 && (a10 = C2164b.a(context.getSystemService(C2163a.a()))) != null && a10.isAutofillSupported() && a10.isEnabled()) {
            return true;
        }
        return false;
    }

    public static final boolean Y(Context context) {
        C6496s.h(context, "context");
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        if (str != null) {
            C6496s.g(str, "DEVICE");
            if (new m(".+_cheets|cheets_.+").d(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean Z(Uri uri) {
        if (uri == null || !p.v("content", uri.getScheme(), true)) {
            return false;
        }
        return true;
    }

    public static final boolean a0(C3286a aVar) {
        if (aVar == null || !C6496s.c(aVar, C3286a.f39402l.e())) {
            return false;
        }
        return true;
    }

    public static final boolean b0() {
        Class<W> cls = W.class;
        if (C4049a.d(cls)) {
            return false;
        }
        try {
            JSONObject D10 = D();
            if (D10 == null) {
                return false;
            }
            try {
                JSONArray jSONArray = D10.getJSONArray("data_processing_options");
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    String string = jSONArray.getString(i10);
                    C6496s.g(string, "options.getString(i)");
                    String lowerCase = string.toLowerCase();
                    C6496s.g(lowerCase, "this as java.lang.String).toLowerCase()");
                    if (C6496s.c(lowerCase, "ldu")) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return false;
        }
    }

    private final void c(JSONObject jSONObject, C3886b bVar, String str, Context context) {
        if (Build.VERSION.SDK_INT < 31 || !d0(context)) {
            jSONObject.put("anon_id", str);
        } else if (!bVar.l()) {
            jSONObject.put("anon_id", str);
        }
    }

    public static final boolean c0(Uri uri) {
        if (uri == null || !p.v("file", uri.getScheme(), true)) {
            return false;
        }
        return true;
    }

    private final void d(JSONObject jSONObject, C3886b bVar, Context context) {
        if (Build.VERSION.SDK_INT < 31 || !d0(context)) {
            jSONObject.put("attribution", bVar.j());
        } else if (!bVar.l()) {
            jSONObject.put("attribution", bVar.j());
        }
    }

    private final boolean d0(Context context) {
        Method M10 = M("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (M10 == null) {
            return false;
        }
        Object V10 = V((Object) null, M10, context);
        if (!(V10 instanceof Integer) || !C6496s.c(V10, 0)) {
            return false;
        }
        return true;
    }

    public static final boolean e(Object obj, Object obj2) {
        if (obj != null) {
            return C6496s.c(obj, obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    public static final boolean e0(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    public static final JSONObject f(String str) {
        C6496s.h(str, "accessToken");
        JSONObject a10 = O.a(str);
        if (a10 != null) {
            return a10;
        }
        S k10 = f47163a.G(str).k();
        if (k10.b() != null) {
            return null;
        }
        return k10.d();
    }

    public static final boolean f0(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }

    public static final Uri g(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(Constants.SCHEME);
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String next : bundle.keySet()) {
                Object obj = bundle.get(next);
                if (obj instanceof String) {
                    builder.appendQueryParameter(next, (String) obj);
                }
            }
        }
        Uri build = builder.build();
        C6496s.g(build, "builder.build()");
        return build;
    }

    public static final boolean g0(Uri uri) {
        if (uri == null || (!p.v("http", uri.getScheme(), true) && !p.v(Constants.SCHEME, uri.getScheme(), true) && !p.v("fbstaging", uri.getScheme(), true))) {
            return false;
        }
        return true;
    }

    private final void h(Context context, String str) {
        int i10;
        boolean z10;
        CookieSyncManager.createInstance(context).sync();
        CookieManager instance = CookieManager.getInstance();
        String cookie = instance.getCookie(str);
        if (cookie != null) {
            for (String F02 : (String[]) p.F0(cookie, new String[]{";"}, false, 0, 6, (Object) null).toArray(new String[0])) {
                String[] strArr = (String[]) p.F0(F02, new String[]{f.f37530b}, false, 0, 6, (Object) null).toArray(new String[0]);
                if (strArr.length > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    String str2 = strArr[0];
                    int length = str2.length() - 1;
                    int i11 = 0;
                    boolean z11 = false;
                    while (i11 <= length) {
                        if (!z11) {
                            i10 = i11;
                        } else {
                            i10 = length;
                        }
                        if (C6496s.i(str2.charAt(i10), 32) <= 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z11) {
                            if (!z10) {
                                z11 = true;
                            } else {
                                i11++;
                            }
                        } else if (!z10) {
                            break;
                        } else {
                            length--;
                        }
                    }
                    sb2.append(str2.subSequence(i11, length + 1).toString());
                    sb2.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                    instance.setCookie(str, sb2.toString());
                }
            }
            instance.removeExpiredCookie();
        }
    }

    public static final Set h0(JSONArray jSONArray) {
        C6496s.h(jSONArray, "jsonArray");
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            String string = jSONArray.getString(i10);
            C6496s.g(string, "jsonArray.getString(i)");
            hashSet.add(string);
        }
        return hashSet;
    }

    public static final void i(Context context) {
        C6496s.h(context, "context");
        try {
            W w10 = f47163a;
            w10.h(context, "facebook.com");
            w10.h(context, ".facebook.com");
            w10.h(context, "https://facebook.com");
            w10.h(context, "https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    public static final List i0(JSONArray jSONArray) {
        C6496s.h(jSONArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(jSONArray.getString(i10));
        }
        return arrayList;
    }

    public static final void j(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final Map j0(String str) {
        C6496s.h(str, "str");
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                C6496s.g(next, SubscriberAttributeKt.JSON_NAME_KEY);
                String string = jSONObject.getString(next);
                C6496s.g(string, "jsonObject.getString(key)");
                hashMap.put(next, string);
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public static final String k(String str, String str2) {
        if (e0(str)) {
            return str2;
        }
        return str;
    }

    public static final void k0(String str, Exception exc) {
        if (I.D() && str != null && exc != null) {
            Log.d(str, exc.getClass().getSimpleName() + ": " + exc.getMessage());
        }
    }

    private final long l(double d10) {
        return Math.round(d10 / 1.073741824E9d);
    }

    public static final void l0(String str, String str2) {
        if (I.D() && str != null && str2 != null) {
            Log.d(str, str2);
        }
    }

    public static final HashSet m(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            String string = jSONArray.getString(i10);
            C6496s.g(string, "jsonArray.getString(i)");
            hashSet.add(string);
        }
        return hashSet;
    }

    public static final void m0(String str, String str2, Throwable th2) {
        if (I.D() && !e0(str)) {
            Log.d(str, str2, th2);
        }
    }

    public static final List n(JSONArray jSONArray) {
        C6496s.h(jSONArray, "jsonArray");
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                String string = jSONArray.getString(i10);
                C6496s.g(string, "jsonArray.getString(i)");
                arrayList.add(string);
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static final String n0(Map map) {
        C6496s.h(map, "map");
        String str = "";
        if (!map.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                }
                str = jSONObject.toString();
            } catch (JSONException unused) {
            }
            C6496s.g(str, "{\n      try {\n        va…\n        \"\"\n      }\n    }");
        }
        return str;
    }

    public static final Map o(JSONObject jSONObject) {
        C6496s.h(jSONObject, "jsonObject");
        HashMap hashMap = new HashMap();
        JSONArray names = jSONObject.names();
        if (names == null) {
            return hashMap;
        }
        int length = names.length();
        for (int i10 = 0; i10 < length; i10++) {
            try {
                String string = names.getString(i10);
                C6496s.g(string, "keys.getString(i)");
                Object obj = jSONObject.get(string);
                if (obj instanceof JSONObject) {
                    obj = o((JSONObject) obj);
                }
                C6496s.g(obj, "value");
                hashMap.put(string, obj);
            } catch (JSONException unused) {
            }
        }
        return hashMap;
    }

    public static final String o0(String str) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        return f47163a.T("MD5", str);
    }

    public static final Map p(JSONObject jSONObject) {
        C6496s.h(jSONObject, "jsonObject");
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            if (optString != null) {
                C6496s.g(next, SubscriberAttributeKt.JSON_NAME_KEY);
                hashMap.put(next, optString);
            }
        }
        return hashMap;
    }

    public static final boolean p0(Context context) {
        C6496s.h(context, "context");
        return X(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int q(java.io.InputStream r6, java.io.OutputStream r7) {
        /*
            java.lang.String r0 = "outputStream"
            kotlin.jvm.internal.C6496s.h(r7, r0)
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0029 }
            r1.<init>(r6)     // Catch:{ all -> 0x0029 }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x001d }
            r2 = 0
            r3 = r2
        L_0x0011:
            int r4 = r1.read(r0)     // Catch:{ all -> 0x001d }
            r5 = -1
            if (r4 == r5) goto L_0x0020
            r7.write(r0, r2, r4)     // Catch:{ all -> 0x001d }
            int r3 = r3 + r4
            goto L_0x0011
        L_0x001d:
            r7 = move-exception
            r0 = r1
            goto L_0x002a
        L_0x0020:
            r1.close()
            if (r6 == 0) goto L_0x0028
            r6.close()
        L_0x0028:
            return r3
        L_0x0029:
            r7 = move-exception
        L_0x002a:
            if (r0 == 0) goto L_0x002f
            r0.close()
        L_0x002f:
            if (r6 == 0) goto L_0x0034
            r6.close()
        L_0x0034:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.W.q(java.io.InputStream, java.io.OutputStream):int");
    }

    public static final Bundle q0(String str) {
        Bundle bundle = new Bundle();
        if (!e0(str)) {
            if (str != null) {
                for (String F02 : (String[]) p.F0(str, new String[]{"&"}, false, 0, 6, (Object) null).toArray(new String[0])) {
                    String[] strArr = (String[]) p.F0(F02, new String[]{f.f37530b}, false, 0, 6, (Object) null).toArray(new String[0]);
                    try {
                        if (strArr.length == 2) {
                            bundle.putString(URLDecoder.decode(strArr[0], Constants.ENCODING), URLDecoder.decode(strArr[1], Constants.ENCODING));
                        } else if (strArr.length == 1) {
                            bundle.putString(URLDecoder.decode(strArr[0], Constants.ENCODING), "");
                        }
                    } catch (UnsupportedEncodingException e10) {
                        k0("FacebookSDK", e10);
                    }
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return bundle;
    }

    public static final void r(URLConnection uRLConnection) {
        if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    public static final void r0(Bundle bundle, String str, List list) {
        C6496s.h(bundle, "b");
        if (list != null) {
            bundle.putString(str, TextUtils.join(f.f37529a, list));
        }
    }

    private final boolean s() {
        return C6496s.c("mounted", Environment.getExternalStorageState());
    }

    public static final boolean s0(Bundle bundle, String str, Object obj) {
        C6496s.h(bundle, "bundle");
        if (obj == null) {
            bundle.remove(str);
            return true;
        } else if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return true;
        } else if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
            return true;
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Number) obj).doubleValue());
            return true;
        } else if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
            return true;
        } else if (obj instanceof Integer) {
            bundle.putInt(str, ((Number) obj).intValue());
            return true;
        } else if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
            return true;
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Number) obj).longValue());
            return true;
        } else if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
            return true;
        } else if (obj instanceof String) {
            bundle.putString(str, (String) obj);
            return true;
        } else if (obj instanceof JSONArray) {
            bundle.putString(str, ((JSONArray) obj).toString());
            return true;
        } else if (!(obj instanceof JSONObject)) {
            return false;
        } else {
            bundle.putString(str, ((JSONObject) obj).toString());
            return true;
        }
    }

    public static final String t(int i10) {
        String bigInteger = new BigInteger(i10 * 5, new Random()).toString(32);
        C6496s.g(bigInteger, "BigInteger(length * 5, r).toString(32)");
        return bigInteger;
    }

    public static final void t0(Bundle bundle, String str, String str2) {
        C6496s.h(bundle, "b");
        if (!e0(str2)) {
            bundle.putString(str, str2);
        }
    }

    public static final String u(Context context) {
        if (context == null) {
            return "null";
        }
        if (context == context.getApplicationContext()) {
            return "unknown";
        }
        String simpleName = context.getClass().getSimpleName();
        C6496s.g(simpleName, "{\n      context.javaClass.simpleName\n    }");
        return simpleName;
    }

    public static final void u0(Bundle bundle, String str, Uri uri) {
        C6496s.h(bundle, "b");
        if (uri != null) {
            t0(bundle, str, uri.toString());
        }
    }

    public static final String v(Context context) {
        C6496s.h(context, "context");
        try {
            String n10 = I.n();
            if (n10 != null) {
                return n10;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i10 = applicationInfo.labelRes;
            if (i10 == 0) {
                return applicationInfo.nonLocalizedLabel.toString();
            }
            String string = context.getString(i10);
            C6496s.g(string, "context.getString(stringId)");
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    public static final Map v0(Parcel parcel) {
        C6496s.h(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < readInt; i10++) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (!(readString == null || readString2 == null)) {
                hashMap.put(readString, readString2);
            }
        }
        return hashMap;
    }

    public static final String w() {
        Context l10 = I.l();
        if (l10 == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = l10.getPackageManager().getPackageInfo(l10.getPackageName(), 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static final String w0(InputStream inputStream) {
        InputStreamReader inputStreamReader;
        BufferedInputStream bufferedInputStream;
        Throwable th2;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb2 = new StringBuilder();
                    char[] cArr = new char[2048];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read != -1) {
                            sb2.append(cArr, 0, read);
                        } else {
                            String sb3 = sb2.toString();
                            C6496s.g(sb3, "{\n      bufferedInputStr…gBuilder.toString()\n    }");
                            j(bufferedInputStream);
                            j(inputStreamReader);
                            return sb3;
                        }
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    j(bufferedInputStream);
                    j(inputStreamReader);
                    throw th2;
                }
            } catch (Throwable th4) {
                th2 = th4;
                inputStreamReader = null;
                j(bufferedInputStream);
                j(inputStreamReader);
                throw th2;
            }
        } catch (Throwable th5) {
            bufferedInputStream = null;
            th2 = th5;
            inputStreamReader = null;
            j(bufferedInputStream);
            j(inputStreamReader);
            throw th2;
        }
    }

    public static final Map x0(Parcel parcel) {
        C6496s.h(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < readInt; i10++) {
            hashMap.put(parcel.readString(), parcel.readString());
        }
        return hashMap;
    }

    public static final Date y(Bundle bundle, String str, Date date) {
        long j10;
        C6496s.h(date, "dateBase");
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            j10 = ((Number) obj).longValue();
        } else {
            if (obj instanceof String) {
                try {
                    j10 = Long.parseLong((String) obj);
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        if (j10 == 0) {
            return new Date(Long.MAX_VALUE);
        }
        return new Date(date.getTime() + (j10 * 1000));
    }

    private final void y0() {
        try {
            if (s()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f47167e = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            }
            f47167e = l((double) f47167e);
        } catch (Exception unused) {
        }
    }

    private final int z0() {
        int i10 = f47164b;
        if (i10 > 0) {
            return i10;
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new U());
            if (listFiles != null) {
                f47164b = listFiles.length;
            }
        } catch (Exception unused) {
        }
        if (f47164b <= 0) {
            f47164b = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return f47164b;
    }

    public final String E() {
        return f47169g;
    }

    public final Locale J() {
        return f47172j;
    }

    public final String R() {
        return f47171i;
    }

    public final long x() {
        return f47167e;
    }

    public final String z() {
        return f47170h;
    }
}
