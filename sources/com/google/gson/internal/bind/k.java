package com.google.gson.internal.bind;

import Pc.A;
import Sc.c;
import com.google.gson.e;
import com.google.gson.r;
import com.google.gson.s;
import com.google.gson.t;
import com.google.gson.u;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class k extends t {

    /* renamed from: c  reason: collision with root package name */
    private static final u f58242c = b(r.DOUBLE);

    /* renamed from: a  reason: collision with root package name */
    private final e f58243a;

    /* renamed from: b  reason: collision with root package name */
    private final s f58244b;

    class a implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f58245a;

        a(s sVar) {
            this.f58245a = sVar;
        }

        public t create(e eVar, com.google.gson.reflect.a aVar) {
            if (aVar.getRawType() == Object.class) {
                return new k(eVar, this.f58245a, (a) null);
            }
            return null;
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f58246a;

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
                f58246a = r0
                Sc.b r1 = Sc.b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f58246a     // Catch:{ NoSuchFieldError -> 0x001d }
                Sc.b r1 = Sc.b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f58246a     // Catch:{ NoSuchFieldError -> 0x0028 }
                Sc.b r1 = Sc.b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f58246a     // Catch:{ NoSuchFieldError -> 0x0033 }
                Sc.b r1 = Sc.b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f58246a     // Catch:{ NoSuchFieldError -> 0x003e }
                Sc.b r1 = Sc.b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f58246a     // Catch:{ NoSuchFieldError -> 0x0049 }
                Sc.b r1 = Sc.b.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.k.b.<clinit>():void");
        }
    }

    /* synthetic */ k(e eVar, s sVar, a aVar) {
        this(eVar, sVar);
    }

    public static u a(s sVar) {
        if (sVar == r.DOUBLE) {
            return f58242c;
        }
        return b(sVar);
    }

    private static u b(s sVar) {
        return new a(sVar);
    }

    private Object c(Sc.a aVar, Sc.b bVar) {
        int i10 = b.f58246a[bVar.ordinal()];
        if (i10 == 3) {
            return aVar.B0();
        }
        if (i10 == 4) {
            return this.f58244b.a(aVar);
        }
        if (i10 == 5) {
            return Boolean.valueOf(aVar.V());
        }
        if (i10 == 6) {
            aVar.t0();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + bVar);
    }

    private Object d(Sc.a aVar, Sc.b bVar) {
        int i10 = b.f58246a[bVar.ordinal()];
        if (i10 == 1) {
            aVar.b();
            return new ArrayList();
        } else if (i10 != 2) {
            return null;
        } else {
            aVar.f();
            return new A();
        }
    }

    public Object read(Sc.a aVar) {
        String str;
        boolean z10;
        Sc.b I02 = aVar.I0();
        Object d10 = d(aVar, I02);
        if (d10 == null) {
            return c(aVar, I02);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.M()) {
                if (d10 instanceof Map) {
                    str = aVar.j0();
                } else {
                    str = null;
                }
                Sc.b I03 = aVar.I0();
                Object d11 = d(aVar, I03);
                if (d11 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (d11 == null) {
                    d11 = c(aVar, I03);
                }
                if (d10 instanceof List) {
                    ((List) d10).add(d11);
                } else {
                    ((Map) d10).put(str, d11);
                }
                if (z10) {
                    arrayDeque.addLast(d10);
                    d10 = d11;
                }
            } else {
                if (d10 instanceof List) {
                    aVar.t();
                } else {
                    aVar.v();
                }
                if (arrayDeque.isEmpty()) {
                    return d10;
                }
                d10 = arrayDeque.removeLast();
            }
        }
    }

    public void write(c cVar, Object obj) {
        if (obj == null) {
            cVar.T();
            return;
        }
        t p10 = this.f58243a.p(obj.getClass());
        if (p10 instanceof k) {
            cVar.o();
            cVar.v();
            return;
        }
        p10.write(cVar, obj);
    }

    private k(e eVar, s sVar) {
        this.f58243a = eVar;
        this.f58244b = sVar;
    }
}
