package com.google.android.gms.measurement.internal;

import Ea.e;
import Ga.C4293e;
import Pa.n;
import Pa.p;
import Pa.q;
import Pa.s;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.amazon.a.a.o.b.f;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.common.b;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzdg;
import com.google.android.gms.internal.measurement.zzou;
import com.google.android.gms.internal.measurement.zzpn;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import q3.C2432a;

public final class B5 extends C4601e3 {

    /* renamed from: i  reason: collision with root package name */
    private static final String[] f54464i = {"firebase_", "google_", "ga_"};

    /* renamed from: j  reason: collision with root package name */
    private static final String[] f54465j = {"_err"};

    /* renamed from: c  reason: collision with root package name */
    private SecureRandom f54466c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicLong f54467d = new AtomicLong(0);

    /* renamed from: e  reason: collision with root package name */
    private int f54468e;

    /* renamed from: f  reason: collision with root package name */
    private C2432a f54469f;

    /* renamed from: g  reason: collision with root package name */
    private Boolean f54470g;

    /* renamed from: h  reason: collision with root package name */
    private Integer f54471h = null;

    B5(E2 e22) {
        super(e22);
    }

    public static Bundle B(List list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A5 a52 = (A5) it.next();
            String str = a52.f54444e;
            if (str != null) {
                bundle.putString(a52.f54441b, str);
            } else {
                Long l10 = a52.f54443d;
                if (l10 != null) {
                    bundle.putLong(a52.f54441b, l10.longValue());
                } else {
                    Double d10 = a52.f54446g;
                    if (d10 != null) {
                        bundle.putDouble(a52.f54441b, d10.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    private static boolean B0(String str, String str2) {
        if (str.equals("*") || Arrays.asList(str.split(f.f37529a)).contains(str2)) {
            return true;
        }
        return false;
    }

    static boolean C0(String str) {
        return B0((String) F.f54678v0.a((Object) null), str);
    }

    private final Object D(int i10, Object obj, boolean z10, boolean z11, String str) {
        Bundle z12;
        long j10;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                j10 = 1;
            } else {
                j10 = 0;
            }
            return Long.valueOf(j10);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return E(String.valueOf(obj), i10, z10);
            }
            if (!z11 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if ((parcelable instanceof Bundle) && (z12 = z((Bundle) parcelable, (String) null)) != null && !z12.isEmpty()) {
                    arrayList.add(z12);
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    public static String E(String str, int i10, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i10) {
            return str;
        }
        if (!z10) {
            return null;
        }
        String substring = str.substring(0, str.offsetByCodePoints(0, i10));
        return substring + "...";
    }

    static boolean E0(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("_")) {
            return false;
        }
        return true;
    }

    private static void G(Bundle bundle, int i10, String str, Object obj) {
        if (q0(bundle, i10)) {
            bundle.putString("_ev", E(str, 40, true));
            if (obj != null) {
                C4536s.l(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", (long) String.valueOf(obj).length());
                }
            }
        }
    }

    static boolean G0(String str) {
        C4536s.f(str);
        if (str.charAt(0) != '_' || str.equals("_ep")) {
            return true;
        }
        return false;
    }

    public static boolean I0(String str) {
        for (String equals : f54465j) {
            if (equals.equals(str)) {
                return false;
            }
        }
        return true;
    }

    private final int J0(String str) {
        if (!r0("event param", str)) {
            return 3;
        }
        if (!j0("event param", (String[]) null, str)) {
            return 14;
        }
        if (!e0("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    private final int K0(String str) {
        if (!x0("event param", str)) {
            return 3;
        }
        if (!j0("event param", (String[]) null, str)) {
            return 14;
        }
        if (!e0("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    private static int L0(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        if ("_lgclid".equals(str)) {
            return 100;
        }
        return 36;
    }

    private static boolean O0(String str) {
        C4536s.l(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    static MessageDigest Q0() {
        int i10 = 0;
        while (i10 < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i10++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static void S(C4595d4 d4Var, Bundle bundle, boolean z10) {
        if (bundle != null && d4Var != null && (!bundle.containsKey("_sc") || z10)) {
            String str = d4Var.f55043a;
            if (str != null) {
                bundle.putString("_sn", str);
            } else {
                bundle.remove("_sn");
            }
            String str2 = d4Var.f55044b;
            if (str2 != null) {
                bundle.putString("_sc", str2);
            } else {
                bundle.remove("_sc");
            }
            bundle.putLong("_si", d4Var.f55045c);
        } else if (bundle != null && d4Var == null && z10) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static void T(D5 d52, int i10, String str, String str2, int i11) {
        U(d52, (String) null, i10, str, str2, i11);
    }

    static void U(D5 d52, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        q0(bundle, i10);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", (long) i11);
        }
        d52.a(str, "_err", bundle);
    }

    private final boolean U0() {
        Integer num;
        if (this.f54470g == null) {
            C2432a N02 = N0();
            boolean z10 = false;
            if (N02 == null) {
                return false;
            }
            Integer num2 = null;
            try {
                num = (Integer) N02.b().get(10000, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z10 = true;
                        }
                    } catch (CancellationException e10) {
                        e = e10;
                        num2 = num;
                        zzj().G().b("Measurement manager api exception", e);
                        this.f54470g = Boolean.FALSE;
                        num = num2;
                        zzj().F().b("Measurement manager api status result", num);
                        return this.f54470g.booleanValue();
                    } catch (ExecutionException e11) {
                        e = e11;
                        num2 = num;
                        zzj().G().b("Measurement manager api exception", e);
                        this.f54470g = Boolean.FALSE;
                        num = num2;
                        zzj().F().b("Measurement manager api status result", num);
                        return this.f54470g.booleanValue();
                    } catch (InterruptedException e12) {
                        e = e12;
                        num2 = num;
                        zzj().G().b("Measurement manager api exception", e);
                        this.f54470g = Boolean.FALSE;
                        num = num2;
                        zzj().F().b("Measurement manager api status result", num);
                        return this.f54470g.booleanValue();
                    } catch (TimeoutException e13) {
                        e = e13;
                        num2 = num;
                        zzj().G().b("Measurement manager api exception", e);
                        this.f54470g = Boolean.FALSE;
                        num = num2;
                        zzj().F().b("Measurement manager api status result", num);
                        return this.f54470g.booleanValue();
                    }
                }
                this.f54470g = Boolean.valueOf(z10);
            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e14) {
                e = e14;
                zzj().G().b("Measurement manager api exception", e);
                this.f54470g = Boolean.FALSE;
                num = num2;
                zzj().F().b("Measurement manager api status result", num);
                return this.f54470g.booleanValue();
            }
            zzj().F().b("Measurement manager api status result", num);
        }
        return this.f54470g.booleanValue();
    }

    private final void V(String str, String str2, String str3, Bundle bundle, List list, boolean z10) {
        int i10;
        String str4;
        int i11;
        String str5;
        String str6 = str2;
        Bundle bundle2 = bundle;
        List list2 = list;
        if (bundle2 != null) {
            int s10 = a().s();
            int i12 = 0;
            for (String str7 : new TreeSet(bundle.keySet())) {
                if (list2 == null || !list2.contains(str7)) {
                    if (!z10) {
                        i10 = K0(str7);
                    } else {
                        i10 = 0;
                    }
                    if (i10 == 0) {
                        i10 = J0(str7);
                    }
                } else {
                    i10 = 0;
                }
                if (i10 != 0) {
                    if (i10 == 3) {
                        str5 = str7;
                    } else {
                        str5 = null;
                    }
                    G(bundle2, i10, str7, str5);
                    bundle2.remove(str7);
                } else {
                    if (c0(bundle2.get(str7))) {
                        zzj().H().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str6, str3, str7);
                        i11 = 22;
                        str4 = str7;
                    } else {
                        String str8 = str3;
                        str4 = str7;
                        i11 = s(str, str2, str7, bundle2.get(str7), bundle, list, z10, false);
                    }
                    if (i11 != 0 && !"_ev".equals(str4)) {
                        G(bundle2, i11, str4, bundle2.get(str4));
                        bundle2.remove(str4);
                    } else if (G0(str4) && !i0(str4, p.f52147d)) {
                        int i13 = i12 + 1;
                        if (!X(231100000, true)) {
                            zzj().C().c("Item array not supported on client's version of Google Play Services (Android Only)", d().c(str6), d().a(bundle2));
                            q0(bundle2, 23);
                            bundle2.remove(str4);
                        } else if (i13 > s10) {
                            if (!zzou.zza() || !a().o(F.f54684y0)) {
                                zzj().C().c("Item cannot contain custom parameters", d().c(str6), d().a(bundle2));
                                q0(bundle2, 23);
                                bundle2.remove(str4);
                            } else {
                                X1 C10 = zzj().C();
                                C10.c("Item can't contain more than " + s10 + " item-scoped custom params", d().c(str6), d().a(bundle2));
                                q0(bundle2, 28);
                                bundle2.remove(str4);
                            }
                        }
                        i12 = i13;
                    }
                }
            }
        }
    }

    static boolean Y(Context context) {
        ActivityInfo receiverInfo;
        C4536s.l(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    static boolean Z(Context context, boolean z10) {
        C4536s.l(context);
        return w0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    static boolean a0(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) {
            return true;
        }
        return false;
    }

    static boolean b0(Bundle bundle, int i10) {
        int i11 = 0;
        if (bundle.size() <= i10) {
            return false;
        }
        for (String str : new TreeSet(bundle.keySet())) {
            i11++;
            if (i11 > i10) {
                bundle.remove(str);
            }
        }
        return true;
    }

    static boolean c0(Object obj) {
        if ((obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
            return true;
        }
        return false;
    }

    static boolean h0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            C4536s.l(str);
            if (!str.equals(str2)) {
                return true;
            }
            return false;
        } else if (!isEmpty || !isEmpty2) {
            if (isEmpty || !isEmpty2) {
                if (TextUtils.isEmpty(str3) || !str3.equals(str4)) {
                    return true;
                }
                return false;
            } else if (TextUtils.isEmpty(str4)) {
                return false;
            } else {
                if (TextUtils.isEmpty(str3) || !str3.equals(str4)) {
                    return true;
                }
                return false;
            }
        } else if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            if (!TextUtils.isEmpty(str4)) {
                return true;
            }
            return false;
        } else if (!str3.equals(str4)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean i0(String str, String[] strArr) {
        C4536s.l(strArr);
        for (String equals : strArr) {
            if (Objects.equals(str, equals)) {
                return true;
            }
        }
        return false;
    }

    static byte[] l0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static ArrayList o0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4604f fVar = (C4604f) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", fVar.f55060a);
            bundle.putString("origin", fVar.f55061b);
            bundle.putLong("creation_timestamp", fVar.f55063d);
            bundle.putString("name", fVar.f55062c.f54441b);
            n.b(bundle, C4536s.l(fVar.f55062c.o0()));
            bundle.putBoolean(AppStateModule.APP_STATE_ACTIVE, fVar.f55064e);
            String str = fVar.f55065f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            D d10 = fVar.f55066g;
            if (d10 != null) {
                bundle.putString("timed_out_event_name", d10.f54497a);
                C c10 = d10.f54498b;
                if (c10 != null) {
                    bundle.putBundle("timed_out_event_params", c10.r0());
                }
            }
            bundle.putLong("trigger_timeout", fVar.f55067h);
            D d11 = fVar.f55068i;
            if (d11 != null) {
                bundle.putString("triggered_event_name", d11.f54497a);
                C c11 = d11.f54498b;
                if (c11 != null) {
                    bundle.putBundle("triggered_event_params", c11.r0());
                }
            }
            bundle.putLong("triggered_timestamp", fVar.f55062c.f54442c);
            bundle.putLong("time_to_live", fVar.f55069j);
            D d12 = fVar.f55070k;
            if (d12 != null) {
                bundle.putString("expired_event_name", d12.f54497a);
                C c12 = d12.f54498b;
                if (c12 != null) {
                    bundle.putBundle("expired_event_params", c12.r0());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    private final boolean p0(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo e10 = C4293e.a(context).e(str, 64);
            if (e10 == null || (signatureArr = e10.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e11) {
            zzj().B().b("Error obtaining certificate", e11);
            return true;
        } catch (PackageManager.NameNotFoundException e12) {
            zzj().B().b("Package name not found", e12);
            return true;
        }
    }

    private static boolean q0(Bundle bundle, int i10) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i10);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int s(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Object r17, android.os.Bundle r18, java.util.List r19, boolean r20, boolean r21) {
        /*
            r13 = this;
            r7 = r13
            r8 = r16
            r0 = r17
            r1 = r18
            r13.i()
            boolean r2 = c0(r17)
            java.lang.String r3 = "param"
            r4 = 0
            if (r2 == 0) goto L_0x008a
            if (r21 == 0) goto L_0x0087
            java.lang.String[] r2 = Pa.p.f52146c
            boolean r2 = i0(r8, r2)
            if (r2 != 0) goto L_0x0020
            r0 = 20
            return r0
        L_0x0020:
            com.google.android.gms.measurement.internal.E2 r2 = r7.f55074a
            com.google.android.gms.measurement.internal.k4 r2 = r2.E()
            boolean r2 = r2.b0()
            if (r2 != 0) goto L_0x002f
            r0 = 25
            return r0
        L_0x002f:
            boolean r2 = r0 instanceof android.os.Parcelable[]
            if (r2 == 0) goto L_0x0038
            r5 = r0
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r5 = r5.length
            goto L_0x0043
        L_0x0038:
            boolean r5 = r0 instanceof java.util.ArrayList
            if (r5 == 0) goto L_0x008a
            r5 = r0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
        L_0x0043:
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 <= r6) goto L_0x008a
            com.google.android.gms.measurement.internal.V1 r9 = r13.zzj()
            com.google.android.gms.measurement.internal.X1 r9 = r9.H()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r10 = "Parameter array is too long; discarded. Value kind, name, array length"
            r9.d(r10, r3, r8, r5)
            if (r2 == 0) goto L_0x006a
            r2 = r0
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            int r5 = r2.length
            if (r5 <= r6) goto L_0x0083
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r6)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1.putParcelableArray(r8, r2)
            goto L_0x0083
        L_0x006a:
            boolean r2 = r0 instanceof java.util.ArrayList
            if (r2 == 0) goto L_0x0083
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r5 = r2.size()
            if (r5 <= r6) goto L_0x0083
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.List r2 = r2.subList(r4, r6)
            r5.<init>(r2)
            r1.putParcelableArrayList(r8, r5)
        L_0x0083:
            r1 = 17
            r9 = r1
            goto L_0x008b
        L_0x0087:
            r0 = 21
            return r0
        L_0x008a:
            r9 = r4
        L_0x008b:
            boolean r1 = E0(r15)
            r2 = 0
            if (r1 != 0) goto L_0x00a2
            boolean r1 = E0(r16)
            if (r1 == 0) goto L_0x0099
            goto L_0x00a2
        L_0x0099:
            com.google.android.gms.measurement.internal.h r1 = r13.a()
            int r1 = r1.m(r2, r4)
            goto L_0x00aa
        L_0x00a2:
            com.google.android.gms.measurement.internal.h r1 = r13.a()
            int r1 = r1.r(r2, r4)
        L_0x00aa:
            boolean r1 = r13.g0(r3, r8, r1, r0)
            if (r1 == 0) goto L_0x00b1
            return r9
        L_0x00b1:
            if (r21 == 0) goto L_0x013d
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto L_0x00c8
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r19
            r6 = r20
            r0.V(r1, r2, r3, r4, r5, r6)
            goto L_0x013c
        L_0x00c8:
            boolean r1 = r0 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x00fd
            r10 = r0
            android.os.Parcelable[] r10 = (android.os.Parcelable[]) r10
            int r11 = r10.length
            r12 = r4
        L_0x00d1:
            if (r12 >= r11) goto L_0x013c
            r0 = r10[r12]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x00eb
            com.google.android.gms.measurement.internal.V1 r1 = r13.zzj()
            com.google.android.gms.measurement.internal.X1 r1 = r1.H()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "All Parcelable[] elements must be of type Bundle. Value type, name"
            r1.c(r2, r0, r8)
            goto L_0x013d
        L_0x00eb:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r19
            r6 = r20
            r0.V(r1, r2, r3, r4, r5, r6)
            int r12 = r12 + 1
            goto L_0x00d1
        L_0x00fd:
            boolean r1 = r0 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x013d
            r10 = r0
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            int r11 = r10.size()
        L_0x0108:
            if (r4 >= r11) goto L_0x013c
            java.lang.Object r0 = r10.get(r4)
            int r12 = r4 + 1
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x012b
            com.google.android.gms.measurement.internal.V1 r1 = r13.zzj()
            com.google.android.gms.measurement.internal.X1 r1 = r1.H()
            if (r0 == 0) goto L_0x0123
            java.lang.Class r0 = r0.getClass()
            goto L_0x0125
        L_0x0123:
            java.lang.String r0 = "null"
        L_0x0125:
            java.lang.String r2 = "All ArrayList elements must be of type Bundle. Value type, name"
            r1.c(r2, r0, r8)
            goto L_0x013d
        L_0x012b:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r19
            r6 = r20
            r0.V(r1, r2, r3, r4, r5, r6)
            r4 = r12
            goto L_0x0108
        L_0x013c:
            return r9
        L_0x013d:
            r0 = 4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.B5.s(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    static Bundle[] s0(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    public static long t(long j10, long j11) {
        return (j10 + (j11 * 60000)) / 86400000;
    }

    static int t0() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(UtilsKt.MICROS_MULTIPLIER);
    }

    public static long v(C c10) {
        long j10 = 0;
        if (c10 == null) {
            return 0;
        }
        Iterator it = c10.iterator();
        while (it.hasNext()) {
            Object t02 = c10.t0((String) it.next());
            if (t02 instanceof Parcelable[]) {
                j10 += (long) ((Parcelable[]) t02).length;
            }
        }
        return j10;
    }

    static long w(byte[] bArr) {
        boolean z10;
        C4536s.l(bArr);
        int i10 = 0;
        if (bArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C4536s.o(z10);
        int length = bArr.length - 1;
        long j10 = 0;
        while (length >= 0 && length >= bArr.length - 8) {
            j10 += (((long) bArr[length]) & 255) << i10;
            i10 += 8;
            length--;
        }
        return j10;
    }

    private static boolean w0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null || !serviceInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static Bundle y(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String next : bundle2.keySet()) {
            Object obj = bundle2.get(next);
            if (obj instanceof Bundle) {
                bundle2.putBundle(next, new Bundle((Bundle) obj));
            } else {
                int i10 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i10 < parcelableArr.length) {
                        if (parcelableArr[i10] instanceof Bundle) {
                            parcelableArr[i10] = new Bundle((Bundle) parcelableArr[i10]);
                        }
                        i10++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i10 < list.size()) {
                        Object obj2 = list.get(i10);
                        if (obj2 instanceof Bundle) {
                            list.set(i10, new Bundle((Bundle) obj2));
                        }
                        i10++;
                    }
                }
            }
        }
        return bundle2;
    }

    static boolean y0(String str) {
        return B0((String) F.f54640c0.a((Object) null), str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.String} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle A(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, java.util.List r23, boolean r24) {
        /*
            r19 = this;
            r9 = r19
            r10 = r21
            r11 = r22
            r12 = r23
            java.lang.String[] r0 = Pa.q.f52151d
            boolean r13 = i0(r10, r0)
            if (r11 == 0) goto L_0x00ea
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>(r11)
            com.google.android.gms.measurement.internal.h r0 = r19.a()
            int r8 = r0.C()
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r22.keySet()
            r0.<init>(r1)
            java.util.Iterator r16 = r0.iterator()
            r17 = 0
            r18 = r17
        L_0x002e:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00e8
            java.lang.Object r0 = r16.next()
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            if (r12 == 0) goto L_0x0047
            boolean r0 = r12.contains(r7)
            if (r0 != 0) goto L_0x0044
            goto L_0x0047
        L_0x0044:
            r0 = r17
            goto L_0x0056
        L_0x0047:
            if (r24 != 0) goto L_0x004e
            int r0 = r9.K0(r7)
            goto L_0x0050
        L_0x004e:
            r0 = r17
        L_0x0050:
            if (r0 != 0) goto L_0x0056
            int r0 = r9.J0(r7)
        L_0x0056:
            if (r0 == 0) goto L_0x0066
            r1 = 3
            if (r0 != r1) goto L_0x005d
            r1 = r7
            goto L_0x005e
        L_0x005d:
            r1 = 0
        L_0x005e:
            G(r15, r0, r7, r1)
            r15.remove(r7)
            r9 = r8
            goto L_0x00a2
        L_0x0066:
            java.lang.Object r4 = r11.get(r7)
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r7
            r5 = r15
            r6 = r23
            r14 = r7
            r7 = r24
            r9 = r8
            r8 = r13
            int r0 = r0.s(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 17
            if (r0 != r1) goto L_0x0087
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            G(r15, r0, r14, r1)
            goto L_0x00a6
        L_0x0087:
            if (r0 == 0) goto L_0x00a6
            java.lang.String r1 = "_ev"
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto L_0x00a6
            r1 = 21
            if (r0 != r1) goto L_0x0097
            r7 = r10
            goto L_0x0098
        L_0x0097:
            r7 = r14
        L_0x0098:
            java.lang.Object r1 = r11.get(r14)
            G(r15, r0, r7, r1)
            r15.remove(r14)
        L_0x00a2:
            r8 = r9
            r9 = r19
            goto L_0x002e
        L_0x00a6:
            boolean r0 = G0(r14)
            if (r0 == 0) goto L_0x00a2
            int r0 = r18 + 1
            if (r0 <= r9) goto L_0x00e5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Event can't contain more than "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r2 = " params"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.android.gms.measurement.internal.V1 r2 = r19.zzj()
            com.google.android.gms.measurement.internal.X1 r2 = r2.C()
            com.google.android.gms.measurement.internal.R1 r3 = r19.d()
            java.lang.String r3 = r3.c(r10)
            com.google.android.gms.measurement.internal.R1 r4 = r19.d()
            java.lang.String r4 = r4.a(r11)
            r2.c(r1, r3, r4)
            r1 = 5
            q0(r15, r1)
            r15.remove(r14)
        L_0x00e5:
            r18 = r0
            goto L_0x00a2
        L_0x00e8:
            r14 = r15
            goto L_0x00eb
        L_0x00ea:
            r14 = 0
        L_0x00eb:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.B5.A(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    /* access modifiers changed from: package-private */
    public final boolean A0(String str) {
        i();
        if (C4293e.a(zza()).a(str) == 0) {
            return true;
        }
        zzj().A().b("Permission not granted", str);
        return false;
    }

    /* access modifiers changed from: package-private */
    public final D C(String str, String str2, Bundle bundle, String str3, long j10, boolean z10, boolean z11) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (q(str2) == 0) {
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            bundle3.putString("_o", str3);
            Bundle A10 = A(str, str2, bundle3, Ea.f.a("_o"), true);
            if (z10) {
                A10 = z(A10, str);
            }
            C4536s.l(A10);
            return new D(str2, new C(A10), str3, j10);
        }
        zzj().B().b("Invalid conditional property event name", d().g(str2));
        throw new IllegalArgumentException();
    }

    public final int D0() {
        if (this.f54471h == null) {
            this.f54471h = Integer.valueOf(b.f().a(zza()) / 1000);
        }
        return this.f54471h.intValue();
    }

    public final URL F(long j10, String str, String str2, long j11, String str3) {
        try {
            C4536s.f(str2);
            C4536s.f(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", new Object[]{String.format("v%s.%s", new Object[]{Long.valueOf(j10), Integer.valueOf(D0())}), str2, str, Long.valueOf(j11)});
            if (str.equals(a().L())) {
                format = format.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    format = format.concat("&");
                }
                format = format.concat(str3);
            }
            return new URL(format);
        } catch (MalformedURLException e10) {
            e = e10;
            zzj().B().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (IllegalArgumentException e11) {
            e = e11;
            zzj().B().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final long F0() {
        long j10;
        i();
        if (!y0(this.f55074a.w().A())) {
            return 0;
        }
        if (Build.VERSION.SDK_INT < 30) {
            j10 = 4;
        } else if (SdkExtensions.getExtensionVersion(30) < 4) {
            j10 = 8;
        } else if (t0() < ((Integer) F.f54627W.a((Object) null)).intValue()) {
            j10 = 16;
        } else {
            j10 = 0;
        }
        if (!A0("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j10 |= 2;
        }
        if (j10 == 0 && !U0()) {
            j10 |= 64;
        }
        if (j10 == 0) {
            return 1;
        }
        return j10;
    }

    /* access modifiers changed from: package-private */
    public final void H(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            zzj().G().b("Params already contained engagement", Long.valueOf(j11));
        }
        bundle.putLong("_et", j10 + j11);
    }

    public final boolean H0(String str) {
        List<ResolveInfo> queryIntentActivities;
        if (!TextUtils.isEmpty(str) && (queryIntentActivities = zza().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0)) != null && !queryIntentActivities.isEmpty()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void I(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String next : bundle2.keySet()) {
                if (!bundle.containsKey(next)) {
                    f().J(bundle, next, bundle2.get(next));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void J(Bundle bundle, String str, Object obj) {
        String str2;
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Bundle[]) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                if (obj != null) {
                    str2 = obj.getClass().getSimpleName();
                } else {
                    str2 = null;
                }
                zzj().H().c("Not putting event parameter. Invalid value type. name, type", d().f(str), str2);
            }
        }
    }

    public final void K(zzdg zzdg, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i10);
        try {
            zzdg.zza(bundle);
        } catch (RemoteException e10) {
            this.f55074a.zzj().G().b("Error returning int value to wrapper", e10);
        }
    }

    public final void L(zzdg zzdg, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j10);
        try {
            zzdg.zza(bundle);
        } catch (RemoteException e10) {
            this.f55074a.zzj().G().b("Error returning long value to wrapper", e10);
        }
    }

    public final void M(zzdg zzdg, Bundle bundle) {
        try {
            zzdg.zza(bundle);
        } catch (RemoteException e10) {
            this.f55074a.zzj().G().b("Error returning bundle value to wrapper", e10);
        }
    }

    public final long M0() {
        long andIncrement;
        long j10;
        if (this.f54467d.get() == 0) {
            synchronized (this.f54467d) {
                long nextLong = new Random(System.nanoTime() ^ zzb().currentTimeMillis()).nextLong();
                int i10 = this.f54468e + 1;
                this.f54468e = i10;
                j10 = nextLong + ((long) i10);
            }
            return j10;
        }
        synchronized (this.f54467d) {
            this.f54467d.compareAndSet(-1, 1);
            andIncrement = this.f54467d.getAndIncrement();
        }
        return andIncrement;
    }

    public final void N(zzdg zzdg, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzdg.zza(bundle);
        } catch (RemoteException e10) {
            this.f55074a.zzj().G().b("Error returning string value to wrapper", e10);
        }
    }

    /* access modifiers changed from: package-private */
    public final C2432a N0() {
        if (this.f54469f == null) {
            this.f54469f = C2432a.a(zza());
        }
        return this.f54469f;
    }

    public final void O(zzdg zzdg, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzdg.zza(bundle);
        } catch (RemoteException e10) {
            this.f55074a.zzj().G().b("Error returning bundle list to wrapper", e10);
        }
    }

    public final void P(zzdg zzdg, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z10);
        try {
            zzdg.zza(bundle);
        } catch (RemoteException e10) {
            this.f55074a.zzj().G().b("Error returning boolean value to wrapper", e10);
        }
    }

    /* access modifiers changed from: package-private */
    public final String P0() {
        byte[] bArr = new byte[16];
        R0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    public final void Q(zzdg zzdg, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzdg.zza(bundle);
        } catch (RemoteException e10) {
            this.f55074a.zzj().G().b("Error returning byte array to wrapper", e10);
        }
    }

    /* access modifiers changed from: package-private */
    public final void R(C4572a2 a2Var, int i10) {
        int i11 = 0;
        for (String str : new TreeSet(a2Var.f55003d.keySet())) {
            if (G0(str) && (i11 = i11 + 1) > i10) {
                zzj().C().c("Event can't contain more than " + i10 + " params", d().c(a2Var.f55000a), d().a(a2Var.f55003d));
                q0(a2Var.f55003d, 5);
                a2Var.f55003d.remove(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final SecureRandom R0() {
        i();
        if (this.f54466c == null) {
            this.f54466c = new SecureRandom();
        }
        return this.f54466c;
    }

    /* access modifiers changed from: package-private */
    public final boolean S0() {
        i();
        if (F0() == 1) {
            return true;
        }
        return false;
    }

    public final boolean T0() {
        try {
            zza().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void W(Parcelable[] parcelableArr, int i10, boolean z10) {
        C4536s.l(parcelableArr);
        for (Bundle bundle : parcelableArr) {
            int i11 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (G0(str) && !i0(str, p.f52147d) && (i11 = i11 + 1) > i10) {
                    if (z10) {
                        zzj().C().c("Param can't contain more than " + i10 + " item-scoped custom parameters", d().f(str), d().a(bundle));
                        q0(bundle, 28);
                    } else {
                        zzj().C().c("Param cannot contain item-scoped custom parameters", d().f(str), d().a(bundle));
                        q0(bundle, 23);
                    }
                    bundle.remove(str);
                }
            }
        }
    }

    public final boolean X(int i10, boolean z10) {
        Boolean R10 = this.f55074a.E().R();
        if (D0() >= i10 / 1000) {
            return true;
        }
        if (R10 == null || R10.booleanValue()) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ C4618h a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ C4713w c() {
        return super.c();
    }

    public final /* bridge */ /* synthetic */ R1 d() {
        return super.d();
    }

    /* access modifiers changed from: package-private */
    public final boolean d0(String str, double d10) {
        try {
            SharedPreferences.Editor edit = zza().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            edit.putString(Constants.DEEPLINK, str);
            edit.putLong(DiagnosticsEntry.TIMESTAMP_KEY, Double.doubleToRawLongBits(d10));
            return edit.commit();
        } catch (RuntimeException e10) {
            zzj().B().b("Failed to persist Deferred Deep Link. exception", e10);
            return false;
        }
    }

    public final /* bridge */ /* synthetic */ C4614g2 e() {
        return super.e();
    }

    /* access modifiers changed from: package-private */
    public final boolean e0(String str, int i10, String str2) {
        if (str2 == null) {
            zzj().C().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i10) {
            return true;
        } else {
            zzj().C().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
            return false;
        }
    }

    public final /* bridge */ /* synthetic */ B5 f() {
        return super.f();
    }

    /* access modifiers changed from: package-private */
    public final boolean f0(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (O0(str)) {
                return true;
            }
            if (this.f55074a.m()) {
                zzj().C().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", V1.q(str));
            }
            return false;
        } else if (TextUtils.isEmpty(str2)) {
            if (this.f55074a.m()) {
                zzj().C().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        } else if (O0(str2)) {
            return true;
        } else {
            zzj().C().b("Invalid admob_app_id. Analytics disabled.", V1.q(str2));
            return false;
        }
    }

    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    /* access modifiers changed from: package-private */
    public final boolean g0(String str, String str2, int i10, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i10) {
                zzj().H().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    /* access modifiers changed from: protected */
    public final void j() {
        i();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                zzj().G().a("Utils falling back to Random for random id");
            }
        }
        this.f54467d.set(nextLong);
    }

    /* access modifiers changed from: package-private */
    public final boolean j0(String str, String[] strArr, String str2) {
        return k0(str, strArr, (String[]) null, str2);
    }

    /* access modifiers changed from: package-private */
    public final boolean k0(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            zzj().C().b("Name is required and can't be null. Type", str);
            return false;
        }
        C4536s.l(str2);
        for (String startsWith : f54464i) {
            if (str2.startsWith(startsWith)) {
                zzj().C().c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !i0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && i0(str2, strArr2)) {
            return true;
        }
        zzj().C().c("Name is reserved. Type, name", str, str2);
        return false;
    }

    /* access modifiers changed from: package-private */
    public final int m0(String str) {
        if (!r0("user property", str)) {
            return 6;
        }
        if (!j0("user property", s.f52152a, str)) {
            return 15;
        }
        if (!e0("user property", 24, str)) {
            return 6;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final Object n0(String str, Object obj) {
        int m10;
        if ("_ev".equals(str)) {
            return D(a().r((String) null, false), obj, true, true, (String) null);
        }
        if (E0(str)) {
            m10 = a().r((String) null, false);
        } else {
            m10 = a().m((String) null, false);
        }
        return D(m10, obj, false, true, (String) null);
    }

    /* access modifiers changed from: protected */
    public final boolean o() {
        return true;
    }

    public final int p(int i10) {
        return b.f().h(zza(), d.f54103a);
    }

    /* access modifiers changed from: package-private */
    public final int q(String str) {
        if (!r0("event", str)) {
            return 2;
        }
        if (!k0("event", q.f52148a, q.f52149b, str)) {
            return 13;
        }
        if (!e0("event", 40, str)) {
            return 2;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final int r(String str, Object obj) {
        boolean z10;
        if ("_ldl".equals(str)) {
            z10 = g0("user property referrer", str, L0(str), obj);
        } else {
            z10 = g0("user property", str, L0(str), obj);
        }
        if (z10) {
            return 0;
        }
        return 7;
    }

    /* access modifiers changed from: package-private */
    public final boolean r0(String str, String str2) {
        if (str2 == null) {
            zzj().C().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            zzj().C().b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                int charCount = Character.charCount(codePointAt);
                while (charCount < length) {
                    int codePointAt2 = str2.codePointAt(charCount);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        charCount += Character.charCount(codePointAt2);
                    } else {
                        zzj().C().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            zzj().C().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final long u(Context context, String str) {
        i();
        C4536s.l(context);
        C4536s.f(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest Q02 = Q0();
        if (Q02 == null) {
            zzj().B().a("Could not get MD5 instance");
            return -1;
        }
        if (packageManager != null) {
            try {
                if (!p0(context, str)) {
                    Signature[] signatureArr = C4293e.a(context).e(zza().getPackageName(), 64).signatures;
                    if (signatureArr != null && signatureArr.length > 0) {
                        return w(Q02.digest(signatureArr[0].toByteArray()));
                    }
                    zzj().G().a("Could not get signatures");
                    return -1;
                }
            } catch (PackageManager.NameNotFoundException e10) {
                zzj().B().b("Package name not found", e10);
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final long u0(String str) {
        if (zza().getPackageManager() == null) {
            return 0;
        }
        int i10 = 0;
        try {
            ApplicationInfo c10 = C4293e.a(zza()).c(str, 0);
            if (c10 != null) {
                i10 = c10.targetSdkVersion;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            zzj().E().b("PackageManager failed to find running app: app_id", str);
        }
        return (long) i10;
    }

    /* access modifiers changed from: package-private */
    public final Object v0(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return D(L0(str), obj, true, false, (String) null);
        }
        return D(L0(str), obj, false, false, (String) null);
    }

    /* access modifiers changed from: package-private */
    public final Bundle x(Uri uri, boolean z10) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Uri uri2 = uri;
        if (uri2 == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str9 = uri2.getQueryParameter("utm_campaign");
                str8 = uri2.getQueryParameter("utm_source");
                str7 = uri2.getQueryParameter("utm_medium");
                str6 = uri2.getQueryParameter("gclid");
                if (z10) {
                    str5 = uri2.getQueryParameter("gbraid");
                } else {
                    str5 = null;
                }
                str4 = uri2.getQueryParameter("utm_id");
                str3 = uri2.getQueryParameter("dclid");
                str2 = uri2.getQueryParameter("srsltid");
                str = uri2.getQueryParameter("sfmc_id");
            } else {
                str9 = null;
                str8 = null;
                str7 = null;
                str6 = null;
                str5 = null;
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
            }
            if (TextUtils.isEmpty(str9) && TextUtils.isEmpty(str8) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str6) && ((!z10 || TextUtils.isEmpty(str5)) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str9)) {
                str10 = "sfmc_id";
                bundle.putString("campaign", str9);
            } else {
                str10 = "sfmc_id";
            }
            if (!TextUtils.isEmpty(str8)) {
                bundle.putString("source", str8);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString(Constants.MEDIUM, str7);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("gclid", str6);
            }
            if (z10 && !TextUtils.isEmpty(str5)) {
                bundle.putString("gbraid", str5);
            }
            String queryParameter = uri2.getQueryParameter("gad_source");
            if (z10 && !TextUtils.isEmpty(queryParameter)) {
                bundle.putString("gad_source", queryParameter);
            }
            String queryParameter2 = uri2.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("term", queryParameter2);
            }
            String queryParameter3 = uri2.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("content", queryParameter3);
            }
            String queryParameter4 = uri2.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("aclid", queryParameter4);
            }
            String queryParameter5 = uri2.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("cp1", queryParameter5);
            }
            String queryParameter6 = uri2.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("anid", queryParameter6);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("campaign_id", str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("dclid", str3);
            }
            String queryParameter7 = uri2.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("source_platform", queryParameter7);
            }
            String queryParameter8 = uri2.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("creative_format", queryParameter8);
            }
            String queryParameter9 = uri2.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("marketing_tactic", queryParameter9);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("srsltid", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                bundle.putString(str10, str);
            }
            return bundle;
        } catch (UnsupportedOperationException e10) {
            zzj().G().b("Install referrer url isn't a hierarchical URI", e10);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean x0(String str, String str2) {
        if (str2 == null) {
            zzj().C().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            zzj().C().b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                zzj().C().c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    zzj().C().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final Bundle z(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String next : bundle.keySet()) {
                Object n02 = n0(next, bundle.get(next));
                if (n02 == null) {
                    zzj().H().b("Param value can't be null", d().f(next));
                } else {
                    J(bundle2, next, n02);
                }
            }
        }
        return bundle2;
    }

    /* access modifiers changed from: package-private */
    public final boolean z0(String str, String str2) {
        if (zzpn.zza() && a().o(F.f54676u0) && !TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return a().K().equals(str);
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final /* bridge */ /* synthetic */ e zzb() {
        return super.zzb();
    }

    public final /* bridge */ /* synthetic */ C4583c zzd() {
        return super.zzd();
    }

    public final /* bridge */ /* synthetic */ V1 zzj() {
        return super.zzj();
    }

    public final /* bridge */ /* synthetic */ C4734z2 zzl() {
        return super.zzl();
    }
}
