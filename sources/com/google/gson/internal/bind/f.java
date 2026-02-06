package com.google.gson.internal.bind;

import Pc.z;
import Sc.b;
import Sc.c;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.t;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;

class f extends t {

    /* renamed from: a  reason: collision with root package name */
    static final f f58218a = new f();

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f58219a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                Sc.b[] r0 = Sc.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f58219a = r0
                Sc.b r1 = Sc.b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f58219a     // Catch:{ NoSuchFieldError -> 0x001d }
                Sc.b r1 = Sc.b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f58219a     // Catch:{ NoSuchFieldError -> 0x0028 }
                Sc.b r1 = Sc.b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f58219a     // Catch:{ NoSuchFieldError -> 0x0033 }
                Sc.b r1 = Sc.b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f58219a     // Catch:{ NoSuchFieldError -> 0x003e }
                Sc.b r1 = Sc.b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f58219a     // Catch:{ NoSuchFieldError -> 0x0049 }
                Sc.b r1 = Sc.b.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.f.a.<clinit>():void");
        }
    }

    private f() {
    }

    private h b(Sc.a aVar, b bVar) {
        int i10 = a.f58219a[bVar.ordinal()];
        if (i10 == 3) {
            return new m(aVar.B0());
        }
        if (i10 == 4) {
            return new m((Number) new z(aVar.B0()));
        }
        if (i10 == 5) {
            return new m(Boolean.valueOf(aVar.V()));
        }
        if (i10 == 6) {
            aVar.t0();
            return j.f58350a;
        }
        throw new IllegalStateException("Unexpected token: " + bVar);
    }

    private h c(Sc.a aVar, b bVar) {
        int i10 = a.f58219a[bVar.ordinal()];
        if (i10 == 1) {
            aVar.b();
            return new g();
        } else if (i10 != 2) {
            return null;
        } else {
            aVar.f();
            return new k();
        }
    }

    /* renamed from: a */
    public h read(Sc.a aVar) {
        String str;
        boolean z10;
        if (aVar instanceof g) {
            return ((g) aVar).H1();
        }
        b I02 = aVar.I0();
        h c10 = c(aVar, I02);
        if (c10 == null) {
            return b(aVar, I02);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.M()) {
                if (c10 instanceof k) {
                    str = aVar.j0();
                } else {
                    str = null;
                }
                b I03 = aVar.I0();
                h c11 = c(aVar, I03);
                if (c11 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c11 == null) {
                    c11 = b(aVar, I03);
                }
                if (c10 instanceof g) {
                    ((g) c10).r(c11);
                } else {
                    ((k) c10).r(str, c11);
                }
                if (z10) {
                    arrayDeque.addLast(c10);
                    c10 = c11;
                }
            } else {
                if (c10 instanceof g) {
                    aVar.t();
                } else {
                    aVar.v();
                }
                if (arrayDeque.isEmpty()) {
                    return c10;
                }
                c10 = (h) arrayDeque.removeLast();
            }
        }
    }

    /* renamed from: d */
    public void write(c cVar, h hVar) {
        if (hVar == null || hVar.k()) {
            cVar.T();
        } else if (hVar.n()) {
            m d10 = hVar.d();
            if (d10.H()) {
                cVar.L0(d10.C());
            } else if (d10.D()) {
                cVar.R0(d10.v());
            } else {
                cVar.P0(d10.g());
            }
        } else if (hVar.h()) {
            cVar.n();
            Iterator it = hVar.a().iterator();
            while (it.hasNext()) {
                write(cVar, (h) it.next());
            }
            cVar.t();
        } else if (hVar.m()) {
            cVar.o();
            for (Map.Entry entry : hVar.b().t()) {
                cVar.M((String) entry.getKey());
                write(cVar, (h) entry.getValue());
            }
            cVar.v();
        } else {
            throw new IllegalArgumentException("Couldn't write " + hVar.getClass());
        }
    }
}
