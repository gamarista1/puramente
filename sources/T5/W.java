package t5;

import Sg.m;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import com.facebook.I;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C6496s;
import t7.C4049a;
import u5.d;

public final class W {

    /* renamed from: a  reason: collision with root package name */
    public static final W f48203a = new W();

    /* renamed from: b  reason: collision with root package name */
    private static final String f48204b = W.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    private static SharedPreferences f48205c;

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicBoolean f48206d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentHashMap f48207e = new ConcurrentHashMap();

    /* renamed from: f  reason: collision with root package name */
    private static final ConcurrentHashMap f48208f = new ConcurrentHashMap();

    private W() {
    }

    public static final String c() {
        Class<W> cls = W.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            if (!f48206d.get()) {
                f48203a.e();
            }
            HashMap hashMap = new HashMap();
            hashMap.putAll(f48207e);
            hashMap.putAll(f48203a.d());
            return o7.W.n0(hashMap);
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    private final Map d() {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            Set b10 = d.f48587d.b();
            for (String str : f48208f.keySet()) {
                if (b10.contains(str)) {
                    hashMap.put(str, f48208f.get(str));
                }
            }
            return hashMap;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    private final synchronized void e() {
        if (!C4049a.d(this)) {
            try {
                AtomicBoolean atomicBoolean = f48206d;
                if (!atomicBoolean.get()) {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(I.l());
                    C6496s.g(defaultSharedPreferences, "getDefaultSharedPreferen….getApplicationContext())");
                    f48205c = defaultSharedPreferences;
                    SharedPreferences sharedPreferences = null;
                    if (defaultSharedPreferences == null) {
                        C6496s.v("sharedPreferences");
                        defaultSharedPreferences = null;
                    }
                    String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
                    if (string == null) {
                        string = "";
                    }
                    SharedPreferences sharedPreferences2 = f48205c;
                    if (sharedPreferences2 == null) {
                        C6496s.v("sharedPreferences");
                    } else {
                        sharedPreferences = sharedPreferences2;
                    }
                    String string2 = sharedPreferences.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
                    if (string2 == null) {
                        string2 = "";
                    }
                    f48207e.putAll(o7.W.j0(string));
                    f48208f.putAll(o7.W.j0(string2));
                    atomicBoolean.set(true);
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public static final void f() {
        Class<W> cls = W.class;
        if (!C4049a.d(cls)) {
            try {
                if (!f48206d.get()) {
                    f48203a.e();
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    private final boolean g(String str) {
        if (C4049a.d(this)) {
            return false;
        }
        try {
            return new m("[A-Fa-f0-9]{64}").d(str);
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return false;
        }
    }

    private final String h(String str, String str2) {
        String str3;
        int i10;
        boolean z10;
        if (C4049a.d(this)) {
            return null;
        }
        try {
            int length = str2.length() - 1;
            int i11 = 0;
            boolean z11 = false;
            while (true) {
                if (i11 > length) {
                    break;
                }
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
            String lowerCase = str2.subSequence(i11, length + 1).toString().toLowerCase();
            C6496s.g(lowerCase, "this as java.lang.String).toLowerCase()");
            if (C6496s.c("em", str)) {
                if (Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                    return lowerCase;
                }
                Log.e(f48204b, "Setting email failure: this is not a valid email address");
                return "";
            } else if (C6496s.c("ph", str)) {
                return new m("[^0-9]").e(lowerCase, "");
            } else {
                if (!C6496s.c("ge", str)) {
                    return lowerCase;
                }
                if (lowerCase.length() > 0) {
                    str3 = lowerCase.substring(0, 1);
                    C6496s.g(str3, "this as java.lang.String…ing(startIndex, endIndex)");
                } else {
                    str3 = "";
                }
                if (!C6496s.c("f", str3)) {
                    if (!C6496s.c("m", str3)) {
                        Log.e(f48204b, "Setting gender failure: the supported value for gender is f or m");
                        return "";
                    }
                }
                return str3;
            }
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a8, code lost:
        if (r7 != null) goto L_0x00ac;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i(java.util.Map r12) {
        /*
            java.lang.Class<t5.W> r0 = t5.W.class
            boolean r1 = t7.C4049a.d(r0)
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.String r1 = "ud"
            kotlin.jvm.internal.C6496s.h(r12, r1)     // Catch:{ all -> 0x001c }
            java.util.concurrent.atomic.AtomicBoolean r1 = f48206d     // Catch:{ all -> 0x001c }
            boolean r1 = r1.get()     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x001f
            t5.W r1 = f48203a     // Catch:{ all -> 0x001c }
            r1.e()     // Catch:{ all -> 0x001c }
            goto L_0x001f
        L_0x001c:
            r12 = move-exception
            goto L_0x0109
        L_0x001f:
            java.util.Set r12 = r12.entrySet()     // Catch:{ all -> 0x001c }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x001c }
        L_0x0027:
            boolean r1 = r12.hasNext()     // Catch:{ all -> 0x001c }
            if (r1 == 0) goto L_0x00fb
            java.lang.Object r1 = r12.next()     // Catch:{ all -> 0x001c }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x001c }
            java.lang.Object r2 = r1.getKey()     // Catch:{ all -> 0x001c }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x001c }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x001c }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x001c }
            t5.W r3 = f48203a     // Catch:{ all -> 0x001c }
            int r4 = r1.length()     // Catch:{ all -> 0x001c }
            r5 = 1
            int r4 = r4 - r5
            r6 = 0
            r7 = r6
            r8 = r7
        L_0x004a:
            if (r7 > r4) goto L_0x006f
            if (r8 != 0) goto L_0x0050
            r9 = r7
            goto L_0x0051
        L_0x0050:
            r9 = r4
        L_0x0051:
            char r9 = r1.charAt(r9)     // Catch:{ all -> 0x001c }
            r10 = 32
            int r9 = kotlin.jvm.internal.C6496s.i(r9, r10)     // Catch:{ all -> 0x001c }
            if (r9 > 0) goto L_0x005f
            r9 = r5
            goto L_0x0060
        L_0x005f:
            r9 = r6
        L_0x0060:
            if (r8 != 0) goto L_0x0069
            if (r9 != 0) goto L_0x0066
            r8 = r5
            goto L_0x004a
        L_0x0066:
            int r7 = r7 + 1
            goto L_0x004a
        L_0x0069:
            if (r9 != 0) goto L_0x006c
            goto L_0x006f
        L_0x006c:
            int r4 = r4 + -1
            goto L_0x004a
        L_0x006f:
            int r4 = r4 + 1
            java.lang.CharSequence r1 = r1.subSequence(r7, r4)     // Catch:{ all -> 0x001c }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x001c }
            java.lang.String r1 = r3.h(r2, r1)     // Catch:{ all -> 0x001c }
            java.lang.String r1 = o7.W.J0(r1)     // Catch:{ all -> 0x001c }
            java.util.concurrent.ConcurrentHashMap r3 = f48208f     // Catch:{ all -> 0x001c }
            boolean r4 = r3.containsKey(r2)     // Catch:{ all -> 0x001c }
            if (r4 == 0) goto L_0x00f6
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x001c }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x001c }
            java.lang.String r4 = ","
            if (r3 == 0) goto L_0x00aa
            Sg.m r7 = new Sg.m     // Catch:{ all -> 0x001c }
            r7.<init>((java.lang.String) r4)     // Catch:{ all -> 0x001c }
            java.util.List r7 = r7.g(r3, r6)     // Catch:{ all -> 0x001c }
            if (r7 == 0) goto L_0x00aa
            java.util.Collection r7 = (java.util.Collection) r7     // Catch:{ all -> 0x001c }
            java.lang.String[] r8 = new java.lang.String[r6]     // Catch:{ all -> 0x001c }
            java.lang.Object[] r7 = r7.toArray(r8)     // Catch:{ all -> 0x001c }
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch:{ all -> 0x001c }
            if (r7 != 0) goto L_0x00ac
        L_0x00aa:
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ all -> 0x001c }
        L_0x00ac:
            int r8 = r7.length     // Catch:{ all -> 0x001c }
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r7, r8)     // Catch:{ all -> 0x001c }
            java.util.Set r8 = mf.Y.h(r8)     // Catch:{ all -> 0x001c }
            boolean r9 = r8.contains(r1)     // Catch:{ all -> 0x001c }
            if (r9 == 0) goto L_0x00bc
            return
        L_0x00bc:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x001c }
            r9.<init>()     // Catch:{ all -> 0x001c }
            int r10 = r7.length     // Catch:{ all -> 0x001c }
            if (r10 != 0) goto L_0x00c8
            r9.append(r1)     // Catch:{ all -> 0x001c }
            goto L_0x00eb
        L_0x00c8:
            int r10 = r7.length     // Catch:{ all -> 0x001c }
            r11 = 5
            if (r10 >= r11) goto L_0x00d6
            r9.append(r3)     // Catch:{ all -> 0x001c }
            r9.append(r4)     // Catch:{ all -> 0x001c }
            r9.append(r1)     // Catch:{ all -> 0x001c }
            goto L_0x00eb
        L_0x00d6:
            if (r5 >= r11) goto L_0x00e3
            r3 = r7[r5]     // Catch:{ all -> 0x001c }
            r9.append(r3)     // Catch:{ all -> 0x001c }
            r9.append(r4)     // Catch:{ all -> 0x001c }
            int r5 = r5 + 1
            goto L_0x00d6
        L_0x00e3:
            r9.append(r1)     // Catch:{ all -> 0x001c }
            r1 = r7[r6]     // Catch:{ all -> 0x001c }
            r8.remove(r1)     // Catch:{ all -> 0x001c }
        L_0x00eb:
            java.util.concurrent.ConcurrentHashMap r1 = f48208f     // Catch:{ all -> 0x001c }
            java.lang.String r3 = r9.toString()     // Catch:{ all -> 0x001c }
            r1.put(r2, r3)     // Catch:{ all -> 0x001c }
            goto L_0x0027
        L_0x00f6:
            r3.put(r2, r1)     // Catch:{ all -> 0x001c }
            goto L_0x0027
        L_0x00fb:
            t5.W r12 = f48203a     // Catch:{ all -> 0x001c }
            java.lang.String r1 = "com.facebook.appevents.UserDataStore.internalUserData"
            java.util.concurrent.ConcurrentHashMap r2 = f48208f     // Catch:{ all -> 0x001c }
            java.lang.String r2 = o7.W.n0(r2)     // Catch:{ all -> 0x001c }
            r12.o(r1, r2)     // Catch:{ all -> 0x001c }
            return
        L_0x0109:
            t7.C4049a.b(r12, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.W.i(java.util.Map):void");
    }

    public static final void j(Bundle bundle) {
        Class<W> cls = W.class;
        if (!C4049a.d(cls)) {
            try {
                C4021N.f48172b.c().execute(new U(bundle));
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final void k(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        Class<W> cls = W.class;
        if (!C4049a.d(cls)) {
            try {
                Bundle bundle = new Bundle();
                if (str != null) {
                    bundle.putString("em", str);
                }
                if (str2 != null) {
                    bundle.putString("fn", str2);
                }
                if (str3 != null) {
                    bundle.putString("ln", str3);
                }
                if (str4 != null) {
                    bundle.putString("ph", str4);
                }
                if (str5 != null) {
                    bundle.putString("db", str5);
                }
                if (str6 != null) {
                    bundle.putString("ge", str6);
                }
                if (str7 != null) {
                    bundle.putString("ct", str7);
                }
                if (str8 != null) {
                    bundle.putString("st", str8);
                }
                if (str9 != null) {
                    bundle.putString("zp", str9);
                }
                if (str10 != null) {
                    bundle.putString("country", str10);
                }
                if (str11 != null) {
                    bundle.putString("external_id", str11);
                }
                j(bundle);
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static /* synthetic */ void l(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i10, Object obj) {
        String str12;
        Class<W> cls = W.class;
        if (!C4049a.d(cls)) {
            if ((i10 & 1024) != 0) {
                str12 = null;
            } else {
                str12 = str11;
            }
            try {
                k(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str12);
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void m(Bundle bundle) {
        Class<W> cls = W.class;
        if (!C4049a.d(cls)) {
            try {
                if (!f48206d.get()) {
                    Log.w(f48204b, "initStore should have been called before calling setUserData");
                    f48203a.e();
                }
                W w10 = f48203a;
                w10.n(bundle);
                w10.o("com.facebook.appevents.UserDataStore.userData", o7.W.n0(f48207e));
                w10.o("com.facebook.appevents.UserDataStore.internalUserData", o7.W.n0(f48208f));
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    private final void n(Bundle bundle) {
        if (!C4049a.d(this) && bundle != null) {
            try {
                for (String next : bundle.keySet()) {
                    Object obj = bundle.get(next);
                    if (obj != null) {
                        String obj2 = obj.toString();
                        if (g(obj2)) {
                            ConcurrentHashMap concurrentHashMap = f48207e;
                            String lowerCase = obj2.toLowerCase();
                            C6496s.g(lowerCase, "this as java.lang.String).toLowerCase()");
                            concurrentHashMap.put(next, lowerCase);
                        } else {
                            C6496s.g(next, SubscriberAttributeKt.JSON_NAME_KEY);
                            String J02 = o7.W.J0(h(next, obj2));
                            if (J02 != null) {
                                f48207e.put(next, J02);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    private final void o(String str, String str2) {
        if (!C4049a.d(this)) {
            try {
                I.t().execute(new V(str, str2));
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void p(String str, String str2) {
        Class<W> cls = W.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(str, "$key");
                C6496s.h(str2, "$value");
                if (!f48206d.get()) {
                    f48203a.e();
                }
                SharedPreferences sharedPreferences = f48205c;
                if (sharedPreferences == null) {
                    C6496s.v("sharedPreferences");
                    sharedPreferences = null;
                }
                sharedPreferences.edit().putString(str, str2).apply();
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }
}
