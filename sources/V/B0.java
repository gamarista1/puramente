package V;

import I.a;
import kotlin.jvm.internal.C6496s;

public final class B0 {

    /* renamed from: a  reason: collision with root package name */
    private final a f6454a;

    /* renamed from: b  reason: collision with root package name */
    private final a f6455b;

    /* renamed from: c  reason: collision with root package name */
    private final a f6456c;

    /* renamed from: d  reason: collision with root package name */
    private final a f6457d;

    /* renamed from: e  reason: collision with root package name */
    private final a f6458e;

    public B0(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        this.f6454a = aVar;
        this.f6455b = aVar2;
        this.f6456c = aVar3;
        this.f6457d = aVar4;
        this.f6458e = aVar5;
    }

    public final a a() {
        return this.f6458e;
    }

    public final a b() {
        return this.f6454a;
    }

    public final a c() {
        return this.f6457d;
    }

    public final a d() {
        return this.f6456c;
    }

    public final a e() {
        return this.f6455b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B0)) {
            return false;
        }
        B0 b02 = (B0) obj;
        if (C6496s.c(this.f6454a, b02.f6454a) && C6496s.c(this.f6455b, b02.f6455b) && C6496s.c(this.f6456c, b02.f6456c) && C6496s.c(this.f6457d, b02.f6457d) && C6496s.c(this.f6458e, b02.f6458e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.f6454a.hashCode() * 31) + this.f6455b.hashCode()) * 31) + this.f6456c.hashCode()) * 31) + this.f6457d.hashCode()) * 31) + this.f6458e.hashCode();
    }

    public String toString() {
        return "Shapes(extraSmall=" + this.f6454a + ", small=" + this.f6455b + ", medium=" + this.f6456c + ", large=" + this.f6457d + ", extraLarge=" + this.f6458e + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ B0(I.a r4, I.a r5, I.a r6, I.a r7, I.a r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x000a
            V.A0 r4 = V.A0.f6440a
            I.a r4 = r4.b()
        L_0x000a:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x0014
            V.A0 r5 = V.A0.f6440a
            I.a r5 = r5.e()
        L_0x0014:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x001f
            V.A0 r5 = V.A0.f6440a
            I.a r6 = r5.d()
        L_0x001f:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x002a
            V.A0 r5 = V.A0.f6440a
            I.a r7 = r5.c()
        L_0x002a:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0035
            V.A0 r5 = V.A0.f6440a
            I.a r8 = r5.a()
        L_0x0035:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V.B0.<init>(I.a, I.a, I.a, I.a, I.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
