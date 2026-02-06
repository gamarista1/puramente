package com.google.gson.internal.bind;

import Sc.c;
import com.google.gson.e;
import com.google.gson.n;
import com.google.gson.r;
import com.google.gson.s;
import com.google.gson.t;
import com.google.gson.u;

public final class j extends t {

    /* renamed from: b  reason: collision with root package name */
    private static final u f58238b = b(r.LAZILY_PARSED_NUMBER);

    /* renamed from: a  reason: collision with root package name */
    private final s f58239a;

    class a implements u {
        a() {
        }

        public t create(e eVar, com.google.gson.reflect.a aVar) {
            if (aVar.getRawType() == Number.class) {
                return j.this;
            }
            return null;
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f58241a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                Sc.b[] r0 = Sc.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f58241a = r0
                Sc.b r1 = Sc.b.NULL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f58241a     // Catch:{ NoSuchFieldError -> 0x001d }
                Sc.b r1 = Sc.b.NUMBER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f58241a     // Catch:{ NoSuchFieldError -> 0x0028 }
                Sc.b r1 = Sc.b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.j.b.<clinit>():void");
        }
    }

    private j(s sVar) {
        this.f58239a = sVar;
    }

    public static u a(s sVar) {
        if (sVar == r.LAZILY_PARSED_NUMBER) {
            return f58238b;
        }
        return b(sVar);
    }

    private static u b(s sVar) {
        return new a();
    }

    /* renamed from: c */
    public Number read(Sc.a aVar) {
        Sc.b I02 = aVar.I0();
        int i10 = b.f58241a[I02.ordinal()];
        if (i10 == 1) {
            aVar.t0();
            return null;
        } else if (i10 == 2 || i10 == 3) {
            return this.f58239a.a(aVar);
        } else {
            throw new n("Expecting number, got: " + I02 + "; at path " + aVar.m());
        }
    }

    /* renamed from: d */
    public void write(c cVar, Number number) {
        cVar.L0(number);
    }
}
