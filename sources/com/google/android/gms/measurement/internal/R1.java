package com.google.android.gms.measurement.internal;

import Pa.h;
import Pa.p;
import Pa.q;
import Pa.s;
import android.os.Bundle;
import com.amazon.a.a.o.b.f;
import com.google.android.gms.common.internal.C4536s;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public final class R1 {

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReference f54844b = new AtomicReference();

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicReference f54845c = new AtomicReference();

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicReference f54846d = new AtomicReference();

    /* renamed from: a  reason: collision with root package name */
    private final h f54847a;

    public R1(h hVar) {
        this.f54847a = hVar;
    }

    private static String d(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        boolean z10;
        String str2;
        C4536s.l(strArr);
        C4536s.l(strArr2);
        C4536s.l(atomicReference);
        if (strArr.length == strArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        C4536s.a(z10);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (Objects.equals(str, strArr[i10])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        if (strArr3[i10] == null) {
                            strArr3[i10] = strArr2[i10] + "(" + strArr[i10] + ")";
                        }
                        str2 = strArr3[i10];
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    private final String e(Object[] objArr) {
        String str;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (Bundle bundle : objArr) {
            if (bundle instanceof Bundle) {
                str = a(bundle);
            } else {
                str = String.valueOf(bundle);
            }
            if (str != null) {
                if (sb2.length() != 1) {
                    sb2.append(", ");
                }
                sb2.append(str);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* access modifiers changed from: protected */
    public final String a(Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        if (!this.f54847a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Bundle[{");
        for (String next : bundle.keySet()) {
            if (sb2.length() != 8) {
                sb2.append(", ");
            }
            sb2.append(f(next));
            sb2.append(f.f37530b);
            Object obj = bundle.get(next);
            if (obj instanceof Bundle) {
                str = e(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                str = e((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                str = e(((ArrayList) obj).toArray());
            } else {
                str = String.valueOf(obj);
            }
            sb2.append(str);
        }
        sb2.append("}]");
        return sb2.toString();
    }

    /* access modifiers changed from: protected */
    public final String b(D d10) {
        String str = null;
        if (d10 == null) {
            return null;
        }
        if (!this.f54847a.zza()) {
            return d10.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("origin=");
        sb2.append(d10.f54499c);
        sb2.append(",name=");
        sb2.append(c(d10.f54497a));
        sb2.append(",params=");
        C c10 = d10.f54498b;
        if (c10 != null) {
            if (!this.f54847a.zza()) {
                str = c10.toString();
            } else {
                str = a(c10.r0());
            }
        }
        sb2.append(str);
        return sb2.toString();
    }

    /* access modifiers changed from: protected */
    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f54847a.zza()) {
            return str;
        }
        return d(str, q.f52150c, q.f52148a, f54844b);
    }

    /* access modifiers changed from: protected */
    public final String f(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f54847a.zza()) {
            return str;
        }
        return d(str, p.f52145b, p.f52144a, f54845c);
    }

    /* access modifiers changed from: protected */
    public final String g(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f54847a.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return d(str, s.f52153b, s.f52152a, f54846d);
        }
        return "experiment_id" + "(" + str + ")";
    }
}
