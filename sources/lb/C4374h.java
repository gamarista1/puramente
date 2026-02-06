package Lb;

import Gb.c;
import Gb.g;
import Sb.d;
import ub.C5230g;

/* renamed from: Lb.h  reason: case insensitive filesystem */
public class C4374h extends C4373g {

    /* renamed from: Lb.h$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f51753a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                Gb.g[] r0 = Gb.g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f51753a = r0
                Gb.g r1 = Gb.g.DEBUG     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f51753a     // Catch:{ NoSuchFieldError -> 0x001d }
                Gb.g r1 = Gb.g.INFO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f51753a     // Catch:{ NoSuchFieldError -> 0x0028 }
                Gb.g r1 = Gb.g.WARN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f51753a     // Catch:{ NoSuchFieldError -> 0x0033 }
                Gb.g r1 = Gb.g.ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f51753a     // Catch:{ NoSuchFieldError -> 0x003e }
                Gb.g r1 = Gb.g.NONE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Lb.C4374h.a.<clinit>():void");
        }
    }

    public void I(B b10) {
        this.f51738d = b10;
    }

    public void J(B b10) {
        this.f51737c = b10;
    }

    public synchronized void K(C5230g gVar) {
        this.f51746l = gVar;
    }

    public synchronized void L(g gVar) {
        try {
            b();
            int i10 = a.f51753a[gVar.ordinal()];
            if (i10 == 1) {
                this.f51743i = d.a.DEBUG;
            } else if (i10 == 2) {
                this.f51743i = d.a.INFO;
            } else if (i10 == 3) {
                this.f51743i = d.a.WARN;
            } else if (i10 == 4) {
                this.f51743i = d.a.ERROR;
            } else if (i10 == 5) {
                this.f51743i = d.a.NONE;
            } else {
                throw new IllegalArgumentException("Unknown log level: " + gVar);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized void M(long j10) {
        b();
        if (j10 < 1048576) {
            throw new c("The minimum cache size must be at least 1MB");
        } else if (j10 <= 104857600) {
            this.f51745k = j10;
        } else {
            throw new c("Firebase Database currently doesn't support a cache size larger than 100MB");
        }
    }

    public synchronized void N(boolean z10) {
        b();
        this.f51744j = z10;
    }

    public synchronized void O(String str) {
        b();
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Session identifier is not allowed to be empty or null!");
        }
        this.f51740f = str;
    }
}
