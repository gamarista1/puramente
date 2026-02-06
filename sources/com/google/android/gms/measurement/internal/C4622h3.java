package com.google.android.gms.measurement.internal;

import Pa.o;
import android.os.Bundle;
import com.amazon.a.a.o.b.f;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.h3  reason: case insensitive filesystem */
public final class C4622h3 {

    /* renamed from: c  reason: collision with root package name */
    public static final C4622h3 f55119c = new C4622h3((Boolean) null, (Boolean) null, 100);

    /* renamed from: a  reason: collision with root package name */
    private final EnumMap f55120a;

    /* renamed from: b  reason: collision with root package name */
    private final int f55121b;

    /* renamed from: com.google.android.gms.measurement.internal.h3$a */
    public enum a {
        AD_STORAGE("ad_storage"),
        ANALYTICS_STORAGE("analytics_storage"),
        AD_USER_DATA("ad_user_data"),
        AD_PERSONALIZATION("ad_personalization");
        

        /* renamed from: a  reason: collision with root package name */
        public final String f55127a;

        private a(String str) {
            this.f55127a = str;
        }
    }

    private C4622h3(EnumMap enumMap, int i10) {
        EnumMap enumMap2 = new EnumMap(a.class);
        this.f55120a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f55121b = i10;
    }

    static char a(o oVar) {
        if (oVar == null) {
            return '-';
        }
        int ordinal = oVar.ordinal();
        if (ordinal == 1) {
            return '+';
        }
        if (ordinal == 2) {
            return '0';
        }
        if (ordinal != 3) {
            return '-';
        }
        return '1';
    }

    static o c(char c10) {
        if (c10 == '+') {
            return o.POLICY;
        }
        if (c10 == '0') {
            return o.DENIED;
        }
        if (c10 != '1') {
            return o.UNINITIALIZED;
        }
        return o.GRANTED;
    }

    static o d(Boolean bool) {
        if (bool == null) {
            return o.UNINITIALIZED;
        }
        if (bool.booleanValue()) {
            return o.GRANTED;
        }
        return o.DENIED;
    }

    static o e(String str) {
        if (str == null) {
            return o.UNINITIALIZED;
        }
        if (str.equals("granted")) {
            return o.GRANTED;
        }
        if (str.equals("denied")) {
            return o.DENIED;
        }
        return o.UNINITIALIZED;
    }

    public static C4622h3 f(o oVar, o oVar2, int i10) {
        EnumMap enumMap = new EnumMap(a.class);
        enumMap.put(a.AD_STORAGE, oVar);
        enumMap.put(a.ANALYTICS_STORAGE, oVar2);
        return new C4622h3(enumMap, -10);
    }

    public static C4622h3 g(Bundle bundle, int i10) {
        if (bundle == null) {
            return new C4622h3((Boolean) null, (Boolean) null, i10);
        }
        EnumMap enumMap = new EnumMap(a.class);
        for (a aVar : C4629i3.STORAGE.f55144a) {
            enumMap.put(aVar, e(bundle.getString(aVar.f55127a)));
        }
        return new C4622h3(enumMap, i10);
    }

    public static C4622h3 i(String str, int i10) {
        EnumMap enumMap = new EnumMap(a.class);
        if (str == null) {
            str = "";
        }
        a[] a10 = C4629i3.STORAGE.a();
        for (int i11 = 0; i11 < a10.length; i11++) {
            a aVar = a10[i11];
            int i12 = i11 + 2;
            if (i12 < str.length()) {
                enumMap.put(aVar, c(str.charAt(i12)));
            } else {
                enumMap.put(aVar, o.UNINITIALIZED);
            }
        }
        return new C4622h3(enumMap, i10);
    }

    static String j(int i10) {
        if (i10 == -30) {
            return "TCF";
        }
        if (i10 == -20) {
            return "API";
        }
        if (i10 == -10) {
            return "MANIFEST";
        }
        if (i10 == 0) {
            return "1P_API";
        }
        if (i10 == 30) {
            return "1P_INIT";
        }
        if (i10 == 90) {
            return "REMOTE_CONFIG";
        }
        if (i10 != 100) {
            return "OTHER";
        }
        return "UNKNOWN";
    }

    public static String k(Bundle bundle) {
        String string;
        a[] b10 = C4629i3.STORAGE.f55144a;
        int length = b10.length;
        int i10 = 0;
        while (true) {
            Boolean bool = null;
            if (i10 >= length) {
                return null;
            }
            a aVar = b10[i10];
            if (bundle.containsKey(aVar.f55127a) && (string = bundle.getString(aVar.f55127a)) != null) {
                if (string.equals("granted")) {
                    bool = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    bool = Boolean.FALSE;
                }
                if (bool == null) {
                    return string;
                }
            }
            i10++;
        }
    }

    public static boolean l(int i10, int i11) {
        if (i10 == -20 && i11 == -30) {
            return true;
        }
        return (i10 == -30 && i11 == -20) || i10 == i11 || i10 < i11;
    }

    public static C4622h3 q(String str) {
        return i(str, 100);
    }

    static String r(o oVar) {
        int ordinal = oVar.ordinal();
        if (ordinal == 2) {
            return "denied";
        }
        if (ordinal != 3) {
            return null;
        }
        return "granted";
    }

    public final boolean A() {
        return m(a.AD_STORAGE);
    }

    public final boolean B() {
        return m(a.ANALYTICS_STORAGE);
    }

    public final boolean C() {
        for (o oVar : this.f55120a.values()) {
            if (oVar != o.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final int b() {
        return this.f55121b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4622h3)) {
            return false;
        }
        C4622h3 h3Var = (C4622h3) obj;
        for (a aVar : C4629i3.STORAGE.f55144a) {
            if (this.f55120a.get(aVar) != h3Var.f55120a.get(aVar)) {
                return false;
            }
        }
        if (this.f55121b == h3Var.f55121b) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C4622h3 h(com.google.android.gms.measurement.internal.C4622h3 r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.google.android.gms.measurement.internal.h3$a> r1 = com.google.android.gms.measurement.internal.C4622h3.a.class
            r0.<init>(r1)
            com.google.android.gms.measurement.internal.i3 r1 = com.google.android.gms.measurement.internal.C4629i3.STORAGE
            com.google.android.gms.measurement.internal.h3$a[] r1 = r1.f55144a
            int r2 = r1.length
            r3 = 0
        L_0x000f:
            if (r3 >= r2) goto L_0x004d
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.f55120a
            java.lang.Object r5 = r5.get(r4)
            Pa.o r5 = (Pa.o) r5
            java.util.EnumMap r6 = r9.f55120a
            java.lang.Object r6 = r6.get(r4)
            Pa.o r6 = (Pa.o) r6
            if (r5 != 0) goto L_0x0026
            goto L_0x0035
        L_0x0026:
            if (r6 != 0) goto L_0x0029
            goto L_0x0045
        L_0x0029:
            Pa.o r7 = Pa.o.UNINITIALIZED
            if (r5 != r7) goto L_0x002e
            goto L_0x0035
        L_0x002e:
            if (r6 != r7) goto L_0x0031
            goto L_0x0045
        L_0x0031:
            Pa.o r7 = Pa.o.POLICY
            if (r5 != r7) goto L_0x0037
        L_0x0035:
            r5 = r6
            goto L_0x0045
        L_0x0037:
            if (r6 != r7) goto L_0x003a
            goto L_0x0045
        L_0x003a:
            Pa.o r7 = Pa.o.DENIED
            if (r5 == r7) goto L_0x0044
            if (r6 != r7) goto L_0x0041
            goto L_0x0044
        L_0x0041:
            Pa.o r5 = Pa.o.GRANTED
            goto L_0x0045
        L_0x0044:
            r5 = r7
        L_0x0045:
            if (r5 == 0) goto L_0x004a
            r0.put(r4, r5)
        L_0x004a:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x004d:
            com.google.android.gms.measurement.internal.h3 r9 = new com.google.android.gms.measurement.internal.h3
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4622h3.h(com.google.android.gms.measurement.internal.h3):com.google.android.gms.measurement.internal.h3");
    }

    public final int hashCode() {
        int i10 = this.f55121b * 17;
        for (o hashCode : this.f55120a.values()) {
            i10 = (i10 * 31) + hashCode.hashCode();
        }
        return i10;
    }

    public final boolean m(a aVar) {
        if (((o) this.f55120a.get(aVar)) == o.DENIED) {
            return false;
        }
        return true;
    }

    public final boolean n(C4622h3 h3Var, a... aVarArr) {
        for (a aVar : aVarArr) {
            if (!h3Var.m(aVar) && m(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final Bundle o() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f55120a.entrySet()) {
            String r10 = r((o) entry.getValue());
            if (r10 != null) {
                bundle.putString(((a) entry.getKey()).f55127a, r10);
            }
        }
        return bundle;
    }

    public final C4622h3 p(C4622h3 h3Var) {
        EnumMap enumMap = new EnumMap(a.class);
        for (a aVar : C4629i3.STORAGE.f55144a) {
            o oVar = (o) this.f55120a.get(aVar);
            if (oVar == o.UNINITIALIZED) {
                oVar = (o) h3Var.f55120a.get(aVar);
            }
            if (oVar != null) {
                enumMap.put(aVar, oVar);
            }
        }
        return new C4622h3(enumMap, this.f55121b);
    }

    public final boolean s(C4622h3 h3Var, a... aVarArr) {
        for (a aVar : aVarArr) {
            o oVar = (o) this.f55120a.get(aVar);
            o oVar2 = (o) h3Var.f55120a.get(aVar);
            o oVar3 = o.DENIED;
            if (oVar == oVar3 && oVar2 != oVar3) {
                return true;
            }
        }
        return false;
    }

    public final o t() {
        o oVar = (o) this.f55120a.get(a.AD_STORAGE);
        if (oVar == null) {
            return o.UNINITIALIZED;
        }
        return oVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(j(this.f55121b));
        for (a aVar : C4629i3.STORAGE.f55144a) {
            sb2.append(f.f37529a);
            sb2.append(aVar.f55127a);
            sb2.append(f.f37530b);
            o oVar = (o) this.f55120a.get(aVar);
            if (oVar == null) {
                oVar = o.UNINITIALIZED;
            }
            sb2.append(oVar);
        }
        return sb2.toString();
    }

    public final boolean u(C4622h3 h3Var) {
        return s(h3Var, (a[]) this.f55120a.keySet().toArray(new a[0]));
    }

    public final o v() {
        o oVar = (o) this.f55120a.get(a.ANALYTICS_STORAGE);
        if (oVar == null) {
            return o.UNINITIALIZED;
        }
        return oVar;
    }

    public final Boolean w() {
        o oVar = (o) this.f55120a.get(a.AD_STORAGE);
        if (oVar == null) {
            return null;
        }
        int ordinal = oVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return Boolean.FALSE;
            }
            if (ordinal != 3) {
                return null;
            }
        }
        return Boolean.TRUE;
    }

    public final Boolean x() {
        o oVar = (o) this.f55120a.get(a.ANALYTICS_STORAGE);
        if (oVar == null) {
            return null;
        }
        int ordinal = oVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return Boolean.FALSE;
            }
            if (ordinal != 3) {
                return null;
            }
        }
        return Boolean.TRUE;
    }

    public final String y() {
        int ordinal;
        StringBuilder sb2 = new StringBuilder("G1");
        for (a aVar : C4629i3.STORAGE.a()) {
            o oVar = (o) this.f55120a.get(aVar);
            char c10 = '-';
            if (!(oVar == null || (ordinal = oVar.ordinal()) == 0)) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        c10 = '0';
                    } else if (ordinal != 3) {
                    }
                }
                c10 = '1';
            }
            sb2.append(c10);
        }
        return sb2.toString();
    }

    public final String z() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (a aVar : C4629i3.STORAGE.a()) {
            sb2.append(a((o) this.f55120a.get(aVar)));
        }
        return sb2.toString();
    }

    public C4622h3(Boolean bool, Boolean bool2, int i10) {
        EnumMap enumMap = new EnumMap(a.class);
        this.f55120a = enumMap;
        enumMap.put(a.AD_STORAGE, d(bool));
        enumMap.put(a.ANALYTICS_STORAGE, d(bool2));
        this.f55121b = i10;
    }
}
