package D5;

import Sg.p;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import com.amazon.a.a.o.b;
import com.facebook.I;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import org.json.JSONException;
import org.json.JSONObject;
import t7.C4049a;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final q f30515a = new q();

    /* renamed from: b  reason: collision with root package name */
    private static final HashMap f30516b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final HashMap f30517c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private static final String f30518d = I.l().getPackageName();

    /* renamed from: e  reason: collision with root package name */
    private static final SharedPreferences f30519e = I.l().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);

    /* renamed from: f  reason: collision with root package name */
    private static final SharedPreferences f30520f = I.l().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    private q() {
    }

    public static final Object a(Context context, IBinder iBinder) {
        Class<q> cls = q.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(context, "context");
            return f30515a.n(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", (Object) null, new Object[]{iBinder});
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final void b() {
        Class<q> cls = q.class;
        if (!C4049a.d(cls)) {
            try {
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                SharedPreferences sharedPreferences = f30519e;
                long j10 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0);
                if (j10 == 0) {
                    sharedPreferences.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                } else if (currentTimeMillis - j10 > 604800) {
                    sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    private final ArrayList c(ArrayList arrayList) {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            ArrayList arrayList2 = new ArrayList();
            SharedPreferences.Editor edit = f30520f.edit();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String string = jSONObject.getString("productId");
                    long j10 = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (currentTimeMillis - (j10 / 1000) <= 86400) {
                        if (!C6496s.c(f30520f.getString(string, ""), string2)) {
                            edit.putString(string, string2);
                            arrayList2.add(str);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
            edit.apply();
            return arrayList2;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    private final Class d(Context context, String str) {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            HashMap hashMap = f30517c;
            Class cls = (Class) hashMap.get(str);
            if (cls != null) {
                return cls;
            }
            Class b10 = u.b(context, str);
            if (b10 != null) {
                hashMap.put(str, b10);
            }
            return b10;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.reflect.Method e(java.lang.Class r7, java.lang.String r8) {
        /*
            r6 = this;
            boolean r0 = t7.C4049a.d(r6)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.HashMap r0 = f30516b     // Catch:{ all -> 0x0034 }
            java.lang.Object r2 = r0.get(r8)     // Catch:{ all -> 0x0034 }
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch:{ all -> 0x0034 }
            if (r2 == 0) goto L_0x0013
            return r2
        L_0x0013:
            int r2 = r8.hashCode()     // Catch:{ all -> 0x0034 }
            java.lang.Class<android.os.Bundle> r3 = android.os.Bundle.class
            java.lang.String r4 = "TYPE"
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            switch(r2) {
                case -1801122596: goto L_0x006d;
                case -1450694211: goto L_0x005a;
                case -1123215065: goto L_0x004a;
                case -594356707: goto L_0x0037;
                case -573310373: goto L_0x0021;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x0075
        L_0x0021:
            java.lang.String r2 = "getSkuDetails"
            boolean r2 = r8.equals(r2)     // Catch:{ all -> 0x0034 }
            if (r2 != 0) goto L_0x002a
            goto L_0x0075
        L_0x002a:
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0034 }
            kotlin.jvm.internal.C6496s.g(r2, r4)     // Catch:{ all -> 0x0034 }
            java.lang.Class[] r2 = new java.lang.Class[]{r2, r5, r5, r3}     // Catch:{ all -> 0x0034 }
            goto L_0x0080
        L_0x0034:
            r7 = move-exception
            goto L_0x009c
        L_0x0037:
            java.lang.String r2 = "getPurchaseHistory"
            boolean r2 = r8.equals(r2)     // Catch:{ all -> 0x0034 }
            if (r2 != 0) goto L_0x0040
            goto L_0x0075
        L_0x0040:
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0034 }
            kotlin.jvm.internal.C6496s.g(r2, r4)     // Catch:{ all -> 0x0034 }
            java.lang.Class[] r2 = new java.lang.Class[]{r2, r5, r5, r5, r3}     // Catch:{ all -> 0x0034 }
            goto L_0x0080
        L_0x004a:
            java.lang.String r2 = "asInterface"
            boolean r2 = r8.equals(r2)     // Catch:{ all -> 0x0034 }
            if (r2 != 0) goto L_0x0053
            goto L_0x0075
        L_0x0053:
            java.lang.Class<android.os.IBinder> r2 = android.os.IBinder.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch:{ all -> 0x0034 }
            goto L_0x0080
        L_0x005a:
            java.lang.String r2 = "isBillingSupported"
            boolean r2 = r8.equals(r2)     // Catch:{ all -> 0x0034 }
            if (r2 != 0) goto L_0x0063
            goto L_0x0075
        L_0x0063:
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0034 }
            kotlin.jvm.internal.C6496s.g(r2, r4)     // Catch:{ all -> 0x0034 }
            java.lang.Class[] r2 = new java.lang.Class[]{r2, r5, r5}     // Catch:{ all -> 0x0034 }
            goto L_0x0080
        L_0x006d:
            java.lang.String r2 = "getPurchases"
            boolean r2 = r8.equals(r2)     // Catch:{ all -> 0x0034 }
            if (r2 != 0) goto L_0x0077
        L_0x0075:
            r2 = r1
            goto L_0x0080
        L_0x0077:
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0034 }
            kotlin.jvm.internal.C6496s.g(r2, r4)     // Catch:{ all -> 0x0034 }
            java.lang.Class[] r2 = new java.lang.Class[]{r2, r5, r5, r5}     // Catch:{ all -> 0x0034 }
        L_0x0080:
            if (r2 != 0) goto L_0x008b
            java.lang.Class[] r2 = new java.lang.Class[]{r1}     // Catch:{ all -> 0x0034 }
            java.lang.reflect.Method r7 = D5.u.c(r7, r8, r2)     // Catch:{ all -> 0x0034 }
            goto L_0x0096
        L_0x008b:
            int r3 = r2.length     // Catch:{ all -> 0x0034 }
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)     // Catch:{ all -> 0x0034 }
            java.lang.Class[] r2 = (java.lang.Class[]) r2     // Catch:{ all -> 0x0034 }
            java.lang.reflect.Method r7 = D5.u.c(r7, r8, r2)     // Catch:{ all -> 0x0034 }
        L_0x0096:
            if (r7 == 0) goto L_0x009b
            r0.put(r8, r7)     // Catch:{ all -> 0x0034 }
        L_0x009b:
            return r7
        L_0x009c:
            t7.C4049a.b(r7, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.q.e(java.lang.Class, java.lang.String):java.lang.reflect.Method");
    }

    private final ArrayList f(Context context, Object obj, String str) {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (o(context, obj, str)) {
                int i10 = 0;
                String str2 = null;
                boolean z10 = false;
                do {
                    Object n10 = n(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, new Object[]{6, f30518d, str, str2, new Bundle()});
                    if (n10 != null) {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) n10;
                        if (bundle.getInt("RESPONSE_CODE") == 0) {
                            ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                            if (stringArrayList != null) {
                                Iterator<String> it = stringArrayList.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    String next = it.next();
                                    try {
                                        if (currentTimeMillis - (new JSONObject(next).getLong("purchaseTime") / 1000) > 1200) {
                                            z10 = true;
                                            break;
                                        }
                                        arrayList.add(next);
                                        i10++;
                                    } catch (JSONException unused) {
                                    }
                                }
                                str2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                                if (i10 >= 30 || str2 == null) {
                                    break;
                                }
                            }
                        }
                    }
                    str2 = null;
                } while (!z10);
            }
            return arrayList;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r3 = f30515a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList g(android.content.Context r6, java.lang.Object r7) {
        /*
            java.lang.Class<D5.q> r0 = D5.q.class
            boolean r1 = t7.C4049a.d(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            java.lang.String r1 = "context"
            kotlin.jvm.internal.C6496s.h(r6, r1)     // Catch:{ all -> 0x0036 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0036 }
            r1.<init>()     // Catch:{ all -> 0x0036 }
            if (r7 != 0) goto L_0x0017
            return r1
        L_0x0017:
            D5.q r3 = f30515a     // Catch:{ all -> 0x0036 }
            java.lang.String r4 = "com.android.vending.billing.IInAppBillingService"
            java.lang.Class r4 = r3.d(r6, r4)     // Catch:{ all -> 0x0036 }
            if (r4 != 0) goto L_0x0022
            return r1
        L_0x0022:
            java.lang.String r5 = "getPurchaseHistory"
            java.lang.reflect.Method r4 = r3.e(r4, r5)     // Catch:{ all -> 0x0036 }
            if (r4 != 0) goto L_0x002b
            return r1
        L_0x002b:
            java.lang.String r1 = "inapp"
            java.util.ArrayList r6 = r3.f(r6, r7, r1)     // Catch:{ all -> 0x0036 }
            java.util.ArrayList r6 = r3.c(r6)     // Catch:{ all -> 0x0036 }
            return r6
        L_0x0036:
            r6 = move-exception
            t7.C4049a.b(r6, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.q.g(android.content.Context, java.lang.Object):java.util.ArrayList");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a A[EDGE_INSN: B:26:0x005a->B:22:0x005a ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.ArrayList h(android.content.Context r13, java.lang.Object r14, java.lang.String r15) {
        /*
            r12 = this;
            boolean r0 = t7.C4049a.d(r12)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0051 }
            r0.<init>()     // Catch:{ all -> 0x0051 }
            if (r14 != 0) goto L_0x0010
            return r0
        L_0x0010:
            boolean r2 = r12.o(r13, r14, r15)     // Catch:{ all -> 0x0051 }
            if (r2 == 0) goto L_0x005a
            r2 = 0
            r3 = r1
        L_0x0018:
            r4 = 3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0051 }
            java.lang.String r5 = f30518d     // Catch:{ all -> 0x0051 }
            java.lang.Object[] r11 = new java.lang.Object[]{r4, r5, r15, r3}     // Catch:{ all -> 0x0051 }
            java.lang.String r8 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r9 = "getPurchases"
            r6 = r12
            r7 = r13
            r10 = r14
            java.lang.Object r3 = r6.n(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0051 }
            if (r3 == 0) goto L_0x0053
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ all -> 0x0051 }
            java.lang.String r4 = "RESPONSE_CODE"
            int r4 = r3.getInt(r4)     // Catch:{ all -> 0x0051 }
            if (r4 != 0) goto L_0x0053
            java.lang.String r4 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r4 = r3.getStringArrayList(r4)     // Catch:{ all -> 0x0051 }
            if (r4 == 0) goto L_0x005a
            int r5 = r4.size()     // Catch:{ all -> 0x0051 }
            int r2 = r2 + r5
            r0.addAll(r4)     // Catch:{ all -> 0x0051 }
            java.lang.String r4 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r3 = r3.getString(r4)     // Catch:{ all -> 0x0051 }
            goto L_0x0054
        L_0x0051:
            r13 = move-exception
            goto L_0x005b
        L_0x0053:
            r3 = r1
        L_0x0054:
            r4 = 30
            if (r2 >= r4) goto L_0x005a
            if (r3 != 0) goto L_0x0018
        L_0x005a:
            return r0
        L_0x005b:
            t7.C4049a.b(r13, r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.q.h(android.content.Context, java.lang.Object, java.lang.String):java.util.ArrayList");
    }

    public static final ArrayList i(Context context, Object obj) {
        Class<q> cls = q.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(context, "context");
            q qVar = f30515a;
            return qVar.c(qVar.h(context, obj, "inapp"));
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final ArrayList j(Context context, Object obj) {
        Class<q> cls = q.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(context, "context");
            q qVar = f30515a;
            return qVar.c(qVar.h(context, obj, "subs"));
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final Map k(Context context, ArrayList arrayList, Object obj, boolean z10) {
        Class<q> cls = q.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(context, "context");
            C6496s.h(arrayList, "skuList");
            Map p10 = f30515a.p(arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!p10.containsKey(str)) {
                    arrayList2.add(str);
                }
            }
            p10.putAll(f30515a.l(context, arrayList2, obj, z10));
            return p10;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    private final Map l(Context context, ArrayList arrayList, Object obj, boolean z10) {
        String str;
        if (C4049a.d(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (obj != null) {
                if (!arrayList.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
                    String str2 = f30518d;
                    if (z10) {
                        str = "subs";
                    } else {
                        str = "inapp";
                    }
                    Object n10 = n(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, new Object[]{3, str2, str, bundle});
                    if (n10 != null) {
                        Bundle bundle2 = (Bundle) n10;
                        if (bundle2.getInt("RESPONSE_CODE") == 0) {
                            ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                            if (stringArrayList != null && arrayList.size() == stringArrayList.size()) {
                                int size = arrayList.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    Object obj2 = arrayList.get(i10);
                                    C6496s.g(obj2, "skuList[i]");
                                    String str3 = stringArrayList.get(i10);
                                    C6496s.g(str3, "skuDetailsList[i]");
                                    linkedHashMap.put(obj2, str3);
                                }
                            }
                            q(linkedHashMap);
                        }
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    private final Object n(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method e10;
        if (C4049a.d(this)) {
            return null;
        }
        try {
            Class d10 = d(context, str);
            if (d10 == null || (e10 = e(d10, str2)) == null) {
                return null;
            }
            return u.e(d10, e10, obj, Arrays.copyOf(objArr, objArr.length));
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    private final boolean o(Context context, Object obj, String str) {
        if (C4049a.d(this) || obj == null) {
            return false;
        }
        try {
            Object n10 = n(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, f30518d, str});
            if (n10 == null || ((Integer) n10).intValue() != 0) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return false;
        }
    }

    private final Map p(ArrayList arrayList) {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                String string = f30519e.getString(str, (String) null);
                if (string != null) {
                    List F02 = p.F0(string, new String[]{";"}, false, 2, 2, (Object) null);
                    if (currentTimeMillis - Long.parseLong((String) F02.get(0)) < 43200) {
                        C6496s.g(str, "sku");
                        linkedHashMap.put(str, F02.get(1));
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    private final void q(Map map) {
        if (!C4049a.d(this)) {
            try {
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                SharedPreferences.Editor edit = f30519e.edit();
                for (Map.Entry entry : map.entrySet()) {
                    edit.putString((String) entry.getKey(), currentTimeMillis + ';' + ((String) entry.getValue()));
                }
                edit.apply();
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public final boolean m(String str) {
        if (C4049a.d(this)) {
            return false;
        }
        try {
            C6496s.h(str, "skuDetail");
            try {
                String optString = new JSONObject(str).optString(b.f37493p);
                if (optString == null || optString.length() <= 0) {
                    return false;
                }
                return true;
            } catch (JSONException unused) {
                return false;
            }
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return false;
        }
    }
}
