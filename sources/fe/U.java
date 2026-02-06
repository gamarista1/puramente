package Fe;

import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.display.DisplayManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.huawei.hms.ads.identifier.AdvertisingIdClient;
import io.intercom.android.sdk.models.AttributeType;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import kotlin.Pair;
import qf.C6658d;
import qf.h;

abstract class U {

    /* renamed from: a  reason: collision with root package name */
    private String f30996a = null;

    /* renamed from: b  reason: collision with root package name */
    private int f30997b = 0;

    class a implements C6658d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f30998a;

        a(e eVar) {
            this.f30998a = eVar;
        }

        public qf.g getContext() {
            return h.f72645a;
        }

        public void resumeWith(Object obj) {
            e eVar;
            String str;
            if (obj != null) {
                try {
                    AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) obj;
                    boolean isLimitAdTrackingEnabled = info.isLimitAdTrackingEnabled();
                    if (!isLimitAdTrackingEnabled) {
                        str = info.getId();
                    } else {
                        str = null;
                    }
                    U.this.J(isLimitAdTrackingEnabled ? 1 : 0);
                    U.this.I(str);
                } catch (Exception e10) {
                    C3023l.b("Error in continuation: " + e10);
                    eVar = this.f30998a;
                    if (eVar == null) {
                        return;
                    }
                } catch (Throwable th2) {
                    e eVar2 = this.f30998a;
                    if (eVar2 != null) {
                        eVar2.a();
                    }
                    throw th2;
                }
            }
            eVar = this.f30998a;
            if (eVar == null) {
                return;
            }
            eVar.a();
        }
    }

    class b implements C6658d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f31000a;

        b(e eVar) {
            this.f31000a = eVar;
        }

        public qf.g getContext() {
            return h.f72645a;
        }

        public void resumeWith(Object obj) {
            e eVar;
            String str;
            if (obj != null) {
                try {
                    AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) obj;
                    boolean isLimitAdTrackingEnabled = info.isLimitAdTrackingEnabled();
                    if (!isLimitAdTrackingEnabled) {
                        str = info.getId();
                    } else {
                        str = null;
                    }
                    U.this.J(isLimitAdTrackingEnabled ? 1 : 0);
                    U.this.I(str);
                } catch (Exception e10) {
                    C3023l.b("Error in continuation: " + e10);
                    eVar = this.f31000a;
                    if (eVar == null) {
                        return;
                    }
                } catch (Throwable th2) {
                    e eVar2 = this.f31000a;
                    if (eVar2 != null) {
                        eVar2.a();
                    }
                    throw th2;
                }
            }
            eVar = this.f31000a;
            if (eVar == null) {
                return;
            }
            eVar.a();
        }
    }

    class c implements C6658d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f31002a;

        c(e eVar) {
            this.f31002a = eVar;
        }

        public qf.g getContext() {
            return h.f72645a;
        }

        public void resumeWith(Object obj) {
            e eVar;
            if (obj != null) {
                try {
                    Pair pair = (Pair) obj;
                    U.this.J(((Integer) pair.a()).intValue());
                    if (((Integer) pair.a()).intValue() == 0) {
                        U.this.I((String) pair.b());
                    } else {
                        U.this.I((String) pair.b());
                    }
                } catch (Exception e10) {
                    C3023l.b("Error in continuation: " + e10);
                    eVar = this.f31002a;
                    if (eVar == null) {
                        return;
                    }
                } catch (Throwable th2) {
                    e eVar2 = this.f31002a;
                    if (eVar2 != null) {
                        eVar2.a();
                    }
                    throw th2;
                }
            }
            eVar = this.f31002a;
            if (eVar == null) {
                return;
            }
            eVar.a();
        }
    }

    class d implements C6658d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f31004a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f31005b;

        d(Context context, f fVar) {
            this.f31004a = context;
            this.f31005b = fVar;
        }

        public qf.g getContext() {
            return h.f72645a;
        }

        public void resumeWith(Object obj) {
            if (obj != null) {
                C3023l.l("fetchInstallReferrer resumeWith got result: " + obj);
                Be.a aVar = (Be.a) obj;
                C3014c.b(this.f31004a, aVar.d(), aVar.e(), aVar.b(), aVar.a(), Boolean.valueOf(aVar.g()), aVar.c(), aVar.f());
            } else {
                C3023l.l("fetchInstallReferrer resumeWith got null result");
            }
            f fVar = this.f31005b;
            if (fVar != null) {
                fVar.a();
            }
        }
    }

    interface e {
        void a();
    }

    interface f {
        void a();
    }

    static class g {

        /* renamed from: a  reason: collision with root package name */
        private String f31007a = "bnc_no_value";

        /* renamed from: b  reason: collision with root package name */
        private boolean f31008b;

        g(Context context, boolean z10) {
            String str;
            String str2;
            this.f31008b = !z10;
            boolean isEmpty = TextUtils.isEmpty(C.d().f().e());
            if (context == null || z10 || !isEmpty) {
                str = null;
            } else {
                str = Settings.Secure.getString(context.getContentResolver(), "android_id");
            }
            if (str == null) {
                if (z10) {
                    str2 = UUID.randomUUID().toString();
                } else {
                    String R10 = E.G(context).R();
                    if (TextUtils.isEmpty(R10) || R10.equals("bnc_no_value")) {
                        R10 = UUID.randomUUID().toString();
                        E.G(context).W0(R10);
                    }
                    str2 = R10;
                }
                this.f31008b = false;
            }
            this.f31007a = str;
        }

        /* access modifiers changed from: package-private */
        public String a() {
            return this.f31007a;
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            return this.f31008b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            g gVar = (g) obj;
            if (!this.f31007a.equals(gVar.f31007a) || this.f31008b != gVar.f31008b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i10;
            int i11 = ((this.f31008b ? 1 : 0) + true) * 31;
            String str = this.f31007a;
            if (str == null) {
                i10 = 0;
            } else {
                i10 = str.hashCode();
            }
            return i11 + i10;
        }
    }

    U() {
    }

    static g A(Context context, boolean z10) {
        return new g(context, z10);
    }

    static boolean B(Context context) {
        return "wifi".equalsIgnoreCase(k(context));
    }

    static boolean C() {
        return w().equalsIgnoreCase("amazon");
    }

    static boolean D(Context context) {
        Class<com.google.android.gms.common.a> cls = com.google.android.gms.common.a.class;
        try {
            int i10 = com.google.android.gms.common.a.f53899d;
            Object invoke = cls.getDeclaredMethod("isGooglePlayServicesAvailable", new Class[]{Context.class}).invoke(cls.getDeclaredMethod("getInstance", (Class[]) null).invoke((Object) null, (Object[]) null), new Object[]{context});
            if (!(invoke instanceof Integer) || ((Integer) invoke).intValue() != 0) {
                return false;
            }
            return true;
        } catch (Exception e10) {
            C3023l.b("Caught Exception isGooglePlayServicesAvailable: " + e10.getMessage());
            return false;
        }
    }

    static boolean E() {
        return w().equalsIgnoreCase("huawei");
    }

    static boolean F(Context context) {
        if (!E() || D(context)) {
            return false;
        }
        return true;
    }

    static boolean G(Context context) {
        if (context == null) {
            return false;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                return false;
            }
            return !packageManager.queryIntentActivities(launchIntentForPackage, 65536).isEmpty();
        } catch (Exception e10) {
            C3023l.b("Caught Exception, error obtaining PackageInfo " + e10.getMessage());
            return false;
        }
    }

    private void H(Context context, e eVar) {
        C3023l.l("Begin setFireAdId");
        Ae.a.a(context, new c(eVar));
    }

    private void b(Context context, e eVar) {
        C3023l.l("Begin fetchGoogleAdId");
        if (Ie.f.a("com.google.android.gms.ads.identifier.AdvertisingIdClient")) {
            Ae.a.b(context, new b(eVar));
            return;
        }
        if (eVar != null) {
            eVar.a();
        }
        C3023l.l("Play Store advertising service not found. If not expected, import com.google.android.gms.ads.identifier.AdvertisingIdClient into your gradle dependencies");
    }

    private void c(Context context, e eVar) {
        C3023l.l("Begin fetchHuaweiAdId");
        if (Ie.f.a("com.huawei.hms.ads.identifier.AdvertisingIdClient")) {
            Ae.a.c(context, new a(eVar));
            return;
        }
        if (eVar != null) {
            eVar.a();
        }
        C3023l.l("Huawei advertising service not found. If not expected, import com.huawei.hms.ads.identifier.AdvertisingIdClient into your gradle dependencies");
    }

    static int f() {
        return Build.VERSION.SDK_INT;
    }

    static String g(Context context) {
        String l10 = E.G(context).l();
        if (!TextUtils.isEmpty(l10) && !l10.equals("bnc_no_value")) {
            return l10;
        }
        String uuid = UUID.randomUUID().toString();
        E.G(context).v0(uuid);
        return uuid;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0033 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String h(android.content.Context r2) {
        /*
            if (r2 == 0) goto L_0x002b
            android.content.pm.PackageManager r0 = r2.getPackageManager()     // Catch:{ Exception -> 0x0012 }
            java.lang.String r2 = r2.getPackageName()     // Catch:{ Exception -> 0x0012 }
            r1 = 0
            android.content.pm.PackageInfo r2 = r0.getPackageInfo(r2, r1)     // Catch:{ Exception -> 0x0012 }
            java.lang.String r2 = r2.versionName     // Catch:{ Exception -> 0x0012 }
            goto L_0x002d
        L_0x0012:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Caught Exception, error obtaining AppVersion "
            r0.append(r1)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            Fe.C3023l.b(r2)
        L_0x002b:
            java.lang.String r2 = ""
        L_0x002d:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x0035
            java.lang.String r2 = "bnc_no_value"
        L_0x0035:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Fe.U.h(android.content.Context):java.lang.String");
    }

    static String i() {
        return System.getProperty("os.arch");
    }

    static String j(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(AttributeType.PHONE);
        if (telephonyManager == null) {
            return null;
        }
        String networkOperatorName = telephonyManager.getNetworkOperatorName();
        if (TextUtils.isEmpty(networkOperatorName)) {
            return null;
        }
        return networkOperatorName;
    }

    static String k(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context == null || context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            return null;
        }
        if (activeNetworkInfo.getType() == 1) {
            return "wifi";
        }
        return "mobile";
    }

    static String l() {
        return Build.DISPLAY;
    }

    static long m(Context context) {
        if (context != null) {
            try {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
            } catch (Exception e10) {
                C3023l.b("Caught Exception, error obtaining FirstInstallTime " + e10.getMessage());
            }
        }
        return 0;
    }

    static String n() {
        return Locale.getDefault().getCountry();
    }

    static String o() {
        return Locale.getDefault().getLanguage();
    }

    static long q(Context context) {
        if (context != null) {
            try {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
            } catch (Exception e10) {
                C3023l.b("Caught Exception, error obtaining LastUpdateTime " + e10.getMessage());
            }
        }
        return 0;
    }

    static String r() {
        String str = "";
        try {
            for (T inetAddresses : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                Iterator<T> it = Collections.list(inetAddresses.getInetAddresses()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    InetAddress inetAddress = (InetAddress) it.next();
                    if (!inetAddress.isLoopbackAddress()) {
                        String hostAddress = inetAddress.getHostAddress();
                        if (hostAddress.indexOf(58) < 0) {
                            str = hostAddress;
                            break;
                        }
                    }
                }
            }
        } catch (Exception e10) {
            C3023l.b("Caught Exception SystemObserver getLocalIPAddress: " + e10.getMessage());
        }
        return str;
    }

    static String s() {
        return Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry();
    }

    static String t(Context context) {
        if (!C()) {
            return "Android";
        }
        if (context == null) {
            if (x().contains("AFT")) {
                return "AMAZON_FIRE_TV";
            }
            return "AMAZON_FIRE";
        } else if (context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv")) {
            return "AMAZON_FIRE_TV";
        } else {
            return "AMAZON_FIRE";
        }
    }

    static String u() {
        return Build.VERSION.RELEASE;
    }

    static String v(Context context) {
        if (context != null) {
            try {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            } catch (Exception e10) {
                C3023l.b("Caught Exception, error obtaining PackageName " + e10.getMessage());
            }
        }
        return "";
    }

    static String w() {
        return Build.MANUFACTURER;
    }

    static String x() {
        return Build.MODEL;
    }

    static DisplayMetrics y(Context context) {
        DisplayManager displayManager;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display display = null;
        if (!(context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null)) {
            display = displayManager.getDisplay(0);
        }
        if (display != null) {
            display.getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    static String z(Context context) {
        UiModeManager uiModeManager;
        if (context != null) {
            try {
                uiModeManager = (UiModeManager) context.getSystemService("uimode");
            } catch (Exception e10) {
                C3023l.b("Caught Exception SystemObserver getUIMode" + e10.getMessage());
                return "UI_MODE_TYPE_UNDEFINED";
            }
        } else {
            uiModeManager = null;
        }
        if (uiModeManager == null) {
            return "UI_MODE_TYPE_UNDEFINED";
        }
        switch (uiModeManager.getCurrentModeType()) {
            case 1:
                return "UI_MODE_TYPE_NORMAL";
            case 2:
                return "UI_MODE_TYPE_DESK";
            case 3:
                return "UI_MODE_TYPE_CAR";
            case 4:
                return "UI_MODE_TYPE_TELEVISION";
            case 5:
                return "UI_MODE_TYPE_APPLIANCE";
            case 6:
                return "UI_MODE_TYPE_WATCH";
            default:
                return "UI_MODE_TYPE_UNDEFINED";
        }
    }

    /* access modifiers changed from: package-private */
    public void I(String str) {
        this.f30996a = str;
    }

    /* access modifiers changed from: package-private */
    public void J(int i10) {
        this.f30997b = i10;
    }

    public void a(Context context, e eVar) {
        if (C()) {
            H(context, eVar);
        } else if (F(context)) {
            c(context, eVar);
        } else {
            b(context, eVar);
        }
    }

    public void d(Context context, f fVar) {
        C3023l.l("Begin fetchInstallReferrer");
        try {
            Ae.c.b(context, new d(context, fVar));
        } catch (Exception e10) {
            C3023l.b("Caught Exception SystemObserver fetchInstallReferrer " + e10.getMessage());
            if (fVar != null) {
                fVar.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public String e() {
        return this.f30996a;
    }

    /* access modifiers changed from: package-private */
    public int p() {
        return this.f30997b;
    }
}
