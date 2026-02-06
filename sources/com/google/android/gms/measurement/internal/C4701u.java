package com.google.android.gms.measurement.internal;

import Pa.o;
import android.os.Bundle;
import com.amazon.a.a.o.b.f;
import com.google.android.gms.measurement.internal.C4622h3;
import com.revenuecat.purchases.common.Constants;
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.u  reason: case insensitive filesystem */
public final class C4701u {

    /* renamed from: f  reason: collision with root package name */
    private static final C4701u f55356f = new C4701u((Boolean) null, 100);

    /* renamed from: a  reason: collision with root package name */
    private final int f55357a;

    /* renamed from: b  reason: collision with root package name */
    private final String f55358b;

    /* renamed from: c  reason: collision with root package name */
    private final Boolean f55359c;

    /* renamed from: d  reason: collision with root package name */
    private final String f55360d;

    /* renamed from: e  reason: collision with root package name */
    private final EnumMap f55361e;

    C4701u(Boolean bool, int i10) {
        this(bool, i10, (Boolean) null, (String) null);
    }

    static C4701u b(o oVar, int i10) {
        EnumMap enumMap = new EnumMap(C4622h3.a.class);
        enumMap.put(C4622h3.a.AD_USER_DATA, oVar);
        return new C4701u(enumMap, -10, (Boolean) null, (String) null);
    }

    public static C4701u c(Bundle bundle, int i10) {
        Boolean bool = null;
        if (bundle == null) {
            return new C4701u((Boolean) null, i10);
        }
        EnumMap enumMap = new EnumMap(C4622h3.a.class);
        for (C4622h3.a aVar : C4629i3.DMA.a()) {
            enumMap.put(aVar, C4622h3.e(bundle.getString(aVar.f55127a)));
        }
        if (bundle.containsKey("is_dma_region")) {
            bool = Boolean.valueOf(bundle.getString("is_dma_region"));
        }
        return new C4701u(enumMap, i10, bool, bundle.getString("cps_display_str"));
    }

    public static C4701u d(String str) {
        if (str == null || str.length() <= 0) {
            return f55356f;
        }
        String[] split = str.split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        int parseInt = Integer.parseInt(split[0]);
        EnumMap enumMap = new EnumMap(C4622h3.a.class);
        C4622h3.a[] a10 = C4629i3.DMA.a();
        int length = a10.length;
        int i10 = 1;
        int i11 = 0;
        while (i11 < length) {
            enumMap.put(a10[i11], C4622h3.c(split[i10].charAt(0)));
            i11++;
            i10++;
        }
        return new C4701u(enumMap, parseInt, (Boolean) null, (String) null);
    }

    public static Boolean e(Bundle bundle) {
        o e10;
        if (bundle == null || (e10 = C4622h3.e(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int i10 = C4719x.f55396a[e10.ordinal()];
        if (i10 == 3) {
            return Boolean.FALSE;
        }
        if (i10 != 4) {
            return null;
        }
        return Boolean.TRUE;
    }

    private final String l() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f55357a);
        for (C4622h3.a aVar : C4629i3.DMA.a()) {
            sb2.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
            sb2.append(C4622h3.a((o) this.f55361e.get(aVar)));
        }
        return sb2.toString();
    }

    public final int a() {
        return this.f55357a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4701u)) {
            return false;
        }
        C4701u uVar = (C4701u) obj;
        if (this.f55358b.equalsIgnoreCase(uVar.f55358b) && Objects.equals(this.f55359c, uVar.f55359c)) {
            return Objects.equals(this.f55360d, uVar.f55360d);
        }
        return false;
    }

    public final Bundle f() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f55361e.entrySet()) {
            String r10 = C4622h3.r((o) entry.getValue());
            if (r10 != null) {
                bundle.putString(((C4622h3.a) entry.getKey()).f55127a, r10);
            }
        }
        Boolean bool = this.f55359c;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.f55360d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final o g() {
        o oVar = (o) this.f55361e.get(C4622h3.a.AD_USER_DATA);
        if (oVar == null) {
            return o.UNINITIALIZED;
        }
        return oVar;
    }

    public final Boolean h() {
        return this.f55359c;
    }

    public final int hashCode() {
        int i10;
        int i11;
        Boolean bool = this.f55359c;
        if (bool == null) {
            i10 = 3;
        } else if (bool == Boolean.TRUE) {
            i10 = 7;
        } else {
            i10 = 13;
        }
        String str = this.f55360d;
        if (str == null) {
            i11 = 17;
        } else {
            i11 = str.hashCode();
        }
        return this.f55358b.hashCode() + (i10 * 29) + (i11 * 137);
    }

    public final String i() {
        return this.f55360d;
    }

    public final String j() {
        return this.f55358b;
    }

    public final boolean k() {
        for (o oVar : this.f55361e.values()) {
            if (oVar != o.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(C4622h3.j(this.f55357a));
        for (C4622h3.a aVar : C4629i3.DMA.a()) {
            sb2.append(f.f37529a);
            sb2.append(aVar.f55127a);
            sb2.append(f.f37530b);
            o oVar = (o) this.f55361e.get(aVar);
            if (oVar == null) {
                sb2.append("uninitialized");
            } else {
                int i10 = C4719x.f55396a[oVar.ordinal()];
                if (i10 == 1) {
                    sb2.append("uninitialized");
                } else if (i10 == 2) {
                    sb2.append("eu_consent_policy");
                } else if (i10 == 3) {
                    sb2.append("denied");
                } else if (i10 == 4) {
                    sb2.append("granted");
                }
            }
        }
        if (this.f55359c != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(this.f55359c);
        }
        if (this.f55360d != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(this.f55360d);
        }
        return sb2.toString();
    }

    C4701u(Boolean bool, int i10, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(C4622h3.a.class);
        this.f55361e = enumMap;
        enumMap.put(C4622h3.a.AD_USER_DATA, C4622h3.d(bool));
        this.f55357a = i10;
        this.f55358b = l();
        this.f55359c = bool2;
        this.f55360d = str;
    }

    private C4701u(EnumMap enumMap, int i10, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(C4622h3.a.class);
        this.f55361e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f55357a = i10;
        this.f55358b = l();
        this.f55359c = bool;
        this.f55360d = str;
    }
}
