package E0;

import Ef.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;
import mf.C6559l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f1718a;

    /* renamed from: b  reason: collision with root package name */
    private final a f1719b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1720c;

    /* renamed from: d  reason: collision with root package name */
    private final a[] f1721d;

    /* renamed from: e  reason: collision with root package name */
    private int f1722e;

    /* renamed from: f  reason: collision with root package name */
    private final float[] f1723f;

    /* renamed from: g  reason: collision with root package name */
    private final float[] f1724g;

    /* renamed from: h  reason: collision with root package name */
    private final float[] f1725h;

    public enum a {
        Lsq2,
        Impulse
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1729a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                E0.c$a[] r0 = E0.c.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                E0.c$a r1 = E0.c.a.Impulse     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                E0.c$a r1 = E0.c.a.Lsq2     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f1729a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: E0.c.b.<clinit>():void");
        }
    }

    public c(boolean z10, a aVar) {
        this.f1718a = z10;
        this.f1719b = aVar;
        if (!z10 || !aVar.equals(a.Lsq2)) {
            int i10 = b.f1729a[aVar.ordinal()];
            int i11 = 2;
            if (i10 != 1) {
                if (i10 == 2) {
                    i11 = 3;
                } else {
                    throw new C6535s();
                }
            }
            this.f1720c = i11;
            this.f1721d = new a[20];
            this.f1723f = new float[20];
            this.f1724g = new float[20];
            this.f1725h = new float[3];
            return;
        }
        throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
    }

    private final float b(float[] fArr, float[] fArr2, int i10) {
        try {
            return e.i(fArr2, fArr, i10, 2, this.f1725h)[1];
        } catch (IllegalArgumentException unused) {
            return 0.0f;
        }
    }

    public final void a(long j10, float f10) {
        int i10 = (this.f1722e + 1) % 20;
        this.f1722e = i10;
        e.j(this.f1721d, i10, j10, f10);
    }

    public final float c() {
        float f10;
        a aVar;
        float[] fArr = this.f1723f;
        float[] fArr2 = this.f1724g;
        int i10 = this.f1722e;
        a aVar2 = this.f1721d[i10];
        if (aVar2 == null) {
            return 0.0f;
        }
        int i11 = 0;
        a aVar3 = aVar2;
        while (true) {
            a aVar4 = this.f1721d[i10];
            if (aVar4 != null) {
                float b10 = (float) (aVar2.b() - aVar4.b());
                float abs = (float) Math.abs(aVar4.b() - aVar3.b());
                if (this.f1719b == a.Lsq2 || this.f1718a) {
                    aVar = aVar4;
                } else {
                    aVar = aVar2;
                }
                if (b10 > 100.0f || abs > 40.0f) {
                    break;
                }
                fArr[i11] = aVar4.a();
                fArr2[i11] = -b10;
                if (i10 == 0) {
                    i10 = 20;
                }
                i10--;
                i11++;
                if (i11 >= 20) {
                    break;
                }
                aVar3 = aVar;
            } else {
                break;
            }
        }
        if (i11 < this.f1720c) {
            return 0.0f;
        }
        int i12 = b.f1729a[this.f1719b.ordinal()];
        if (i12 == 1) {
            f10 = e.f(fArr, fArr2, i11, this.f1718a);
        } else if (i12 == 2) {
            f10 = b(fArr, fArr2, i11);
        } else {
            throw new C6535s();
        }
        return f10 * ((float) 1000);
    }

    public final float d(float f10) {
        boolean z10;
        if (f10 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            G0.a.b("maximumVelocity should be a positive value. You specified=" + f10);
        }
        float c10 = c();
        if (c10 == 0.0f || Float.isNaN(c10)) {
            return 0.0f;
        }
        if (c10 > 0.0f) {
            return m.g(c10, f10);
        }
        return m.c(c10, -f10);
    }

    public final void e() {
        C6559l.A(this.f1721d, (Object) null, 0, 0, 6, (Object) null);
        this.f1722e = 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(boolean z10, a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? a.Lsq2 : aVar);
    }
}
