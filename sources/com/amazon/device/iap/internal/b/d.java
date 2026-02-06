package com.amazon.device.iap.internal.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import com.amazon.a.a.o.f;
import com.amazon.device.iap.internal.util.b;
import com.amazon.device.iap.internal.util.c;
import com.amazon.device.iap.model.Receipt;
import com.revenuecat.purchases.common.Constants;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f37889a = "d";
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final String f37890b;

    /* renamed from: c  reason: collision with root package name */
    private static final String f37891c;

    /* renamed from: d  reason: collision with root package name */
    private static final String f37892d = "LAST_CLEANING_TIME";
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static int f37893e = 604800000;

    /* renamed from: f  reason: collision with root package name */
    private static final d f37894f = new d();

    static {
        StringBuilder sb2 = new StringBuilder();
        Class<d> cls = d.class;
        sb2.append(cls.getName());
        sb2.append("_PREFS");
        f37890b = sb2.toString();
        f37891c = cls.getName() + "_CLEANER_PREFS";
    }

    private void e() {
        b.a(f37889a, "enter old receipts cleanup! ");
        final Context b10 = com.amazon.device.iap.internal.d.f().b();
        f.a((Object) b10, "context");
        a(System.currentTimeMillis());
        new Handler().post(new Runnable() {
            /* JADX WARNING: Can't wrap try/catch for region: R(3:12|13|19) */
            /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
                r4 = com.amazon.device.iap.internal.b.d.b();
                com.amazon.device.iap.internal.util.b.a(r4, "house keeping - try remove Receipt:" + r3 + " since it's invalid ");
                r9.f37896b.a(r3);
             */
            /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x006c */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r9 = this;
                    java.lang.String r0 = "house keeping - try remove Receipt:"
                    java.lang.String r1 = com.amazon.device.iap.internal.b.d.f37889a     // Catch:{ all -> 0x006a }
                    java.lang.String r2 = "perform house keeping! "
                    com.amazon.device.iap.internal.util.b.a(r1, r2)     // Catch:{ all -> 0x006a }
                    android.content.Context r1 = r0     // Catch:{ all -> 0x006a }
                    java.lang.String r2 = com.amazon.device.iap.internal.b.d.f37890b     // Catch:{ all -> 0x006a }
                    r3 = 0
                    android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)     // Catch:{ all -> 0x006a }
                    java.util.Map r2 = r1.getAll()     // Catch:{ all -> 0x006a }
                    java.util.Set r2 = r2.keySet()     // Catch:{ all -> 0x006a }
                    java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x006a }
                L_0x0022:
                    boolean r3 = r2.hasNext()     // Catch:{ all -> 0x006a }
                    if (r3 == 0) goto L_0x00a5
                    java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x006a }
                    java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x006a }
                    r4 = 0
                    java.lang.String r4 = r1.getString(r3, r4)     // Catch:{ b -> 0x006c }
                    com.amazon.device.iap.internal.b.c r4 = com.amazon.device.iap.internal.b.c.a(r4)     // Catch:{ b -> 0x006c }
                    long r5 = java.lang.System.currentTimeMillis()     // Catch:{ b -> 0x006c }
                    long r7 = r4.d()     // Catch:{ b -> 0x006c }
                    long r5 = r5 - r7
                    int r4 = com.amazon.device.iap.internal.b.d.f37893e     // Catch:{ b -> 0x006c }
                    long r7 = (long) r4     // Catch:{ b -> 0x006c }
                    int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                    if (r4 <= 0) goto L_0x0022
                    java.lang.String r4 = com.amazon.device.iap.internal.b.d.f37889a     // Catch:{ b -> 0x006c }
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ b -> 0x006c }
                    r5.<init>()     // Catch:{ b -> 0x006c }
                    r5.append(r0)     // Catch:{ b -> 0x006c }
                    r5.append(r3)     // Catch:{ b -> 0x006c }
                    java.lang.String r6 = " since it's too old"
                    r5.append(r6)     // Catch:{ b -> 0x006c }
                    java.lang.String r5 = r5.toString()     // Catch:{ b -> 0x006c }
                    com.amazon.device.iap.internal.util.b.a(r4, r5)     // Catch:{ b -> 0x006c }
                    com.amazon.device.iap.internal.b.d r4 = com.amazon.device.iap.internal.b.d.this     // Catch:{ b -> 0x006c }
                    r4.a((java.lang.String) r3)     // Catch:{ b -> 0x006c }
                    goto L_0x0022
                L_0x006a:
                    r0 = move-exception
                    goto L_0x008d
                L_0x006c:
                    java.lang.String r4 = com.amazon.device.iap.internal.b.d.f37889a     // Catch:{ all -> 0x006a }
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x006a }
                    r5.<init>()     // Catch:{ all -> 0x006a }
                    r5.append(r0)     // Catch:{ all -> 0x006a }
                    r5.append(r3)     // Catch:{ all -> 0x006a }
                    java.lang.String r6 = " since it's invalid "
                    r5.append(r6)     // Catch:{ all -> 0x006a }
                    java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x006a }
                    com.amazon.device.iap.internal.util.b.a(r4, r5)     // Catch:{ all -> 0x006a }
                    com.amazon.device.iap.internal.b.d r4 = com.amazon.device.iap.internal.b.d.this     // Catch:{ all -> 0x006a }
                    r4.a((java.lang.String) r3)     // Catch:{ all -> 0x006a }
                    goto L_0x0022
                L_0x008d:
                    java.lang.String r1 = com.amazon.device.iap.internal.b.d.f37889a
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "Error in running cleaning job:"
                    r2.append(r3)
                    r2.append(r0)
                    java.lang.String r0 = r2.toString()
                    com.amazon.device.iap.internal.util.b.a(r1, r0)
                L_0x00a5:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.iap.internal.b.d.AnonymousClass1.run():void");
            }
        });
    }

    private long f() {
        Context b10 = com.amazon.device.iap.internal.d.f().b();
        f.a((Object) b10, "context");
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = b10.getSharedPreferences(f37891c, 0).getLong(f37892d, 0);
        if (j10 != 0) {
            return j10;
        }
        a(currentTimeMillis);
        return currentTimeMillis;
    }

    public void a(String str, String str2, String str3, String str4) {
        String str5 = f37889a;
        b.a(str5, "enter saveReceipt for receipt [" + str4 + "]");
        try {
            f.a(str2, "userId");
            f.a(str3, com.amazon.a.a.o.b.f37447E);
            f.a(str4, "receiptString");
            Context b10 = com.amazon.device.iap.internal.d.f().b();
            f.a((Object) b10, "context");
            c cVar = new c(str2, str4, str, System.currentTimeMillis());
            SharedPreferences.Editor edit = b10.getSharedPreferences(f37890b, 0).edit();
            edit.putString(str3, cVar.e());
            edit.commit();
        } catch (Throwable th2) {
            String str6 = f37889a;
            b.a(str6, "error in saving pending receipt:" + str + "/" + str4 + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + th2.getMessage());
        }
        String str7 = f37889a;
        b.a(str7, "leaving saveReceipt for receipt id [" + str3 + "]");
    }

    public Set<Receipt> b(String str) {
        Context b10 = com.amazon.device.iap.internal.d.f().b();
        f.a((Object) b10, "context");
        String str2 = f37889a;
        b.a(str2, "enter getLocalReceipts for user[" + str + "]");
        HashSet hashSet = new HashSet();
        if (!f.a(str)) {
            Map<String, ?> all = b10.getSharedPreferences(f37890b, 0).getAll();
            for (String next : all.keySet()) {
                String str3 = (String) all.get(next);
                try {
                    c a10 = c.a(str3);
                    hashSet.add(c.a(new JSONObject(a10.c()), str, a10.b()));
                } catch (com.amazon.device.iap.internal.a.f unused) {
                    a(next);
                    String str4 = f37889a;
                    b.b(str4, "failed to verify signature:[" + str3 + "]");
                } catch (JSONException unused2) {
                    a(next);
                    String str5 = f37889a;
                    b.b(str5, "failed to convert string to JSON object:[" + str3 + "]");
                } catch (Throwable unused3) {
                    String str6 = f37889a;
                    b.b(str6, "failed to load the receipt from SharedPreference:[" + str3 + "]");
                }
            }
            String str7 = f37889a;
            b.a(str7, "leaving getLocalReceipts for user[" + str + "], " + hashSet.size() + " local receipts found.");
            if (System.currentTimeMillis() - f() > ((long) f37893e)) {
                e();
            }
            return hashSet;
        }
        b.b(str2, "empty UserId: " + str);
        throw new RuntimeException("Invalid UserId:" + str);
    }

    public String c(String str) {
        Context b10 = com.amazon.device.iap.internal.d.f().b();
        f.a((Object) b10, "context");
        if (!f.a(str)) {
            String string = b10.getSharedPreferences(f37890b, 0).getString(str, (String) null);
            if (string != null) {
                try {
                    return c.a(string).b();
                } catch (b unused) {
                }
            }
            return null;
        }
        String str2 = f37889a;
        b.b(str2, "empty receiptId: " + str);
        throw new RuntimeException("Invalid ReceiptId:" + str);
    }

    public void a(String str) {
        String str2 = f37889a;
        b.a(str2, "enter removeReceipt for receipt[" + str + "]");
        Context b10 = com.amazon.device.iap.internal.d.f().b();
        f.a((Object) b10, "context");
        SharedPreferences.Editor edit = b10.getSharedPreferences(f37890b, 0).edit();
        edit.remove(str);
        edit.commit();
        b.a(str2, "leave removeReceipt for receipt[" + str + "]");
    }

    private void a(long j10) {
        Context b10 = com.amazon.device.iap.internal.d.f().b();
        f.a((Object) b10, "context");
        SharedPreferences.Editor edit = b10.getSharedPreferences(f37891c, 0).edit();
        edit.putLong(f37892d, j10);
        edit.commit();
    }

    public static d a() {
        return f37894f;
    }
}
