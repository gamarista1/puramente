package j4;

import Ug.G;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import k4.C3663e;
import kotlin.jvm.internal.C6496s;
import n4.C3856c;

/* renamed from: j4.c  reason: case insensitive filesystem */
public final class C3616c {

    /* renamed from: a  reason: collision with root package name */
    private final G f44634a;

    /* renamed from: b  reason: collision with root package name */
    private final G f44635b;

    /* renamed from: c  reason: collision with root package name */
    private final G f44636c;

    /* renamed from: d  reason: collision with root package name */
    private final G f44637d;

    /* renamed from: e  reason: collision with root package name */
    private final C3856c.a f44638e;

    /* renamed from: f  reason: collision with root package name */
    private final C3663e f44639f;

    /* renamed from: g  reason: collision with root package name */
    private final Bitmap.Config f44640g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f44641h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f44642i;

    /* renamed from: j  reason: collision with root package name */
    private final Drawable f44643j;

    /* renamed from: k  reason: collision with root package name */
    private final Drawable f44644k;

    /* renamed from: l  reason: collision with root package name */
    private final Drawable f44645l;

    /* renamed from: m  reason: collision with root package name */
    private final C3615b f44646m;

    /* renamed from: n  reason: collision with root package name */
    private final C3615b f44647n;

    /* renamed from: o  reason: collision with root package name */
    private final C3615b f44648o;

    public C3616c(G g10, G g11, G g12, G g13, C3856c.a aVar, C3663e eVar, Bitmap.Config config, boolean z10, boolean z11, Drawable drawable, Drawable drawable2, Drawable drawable3, C3615b bVar, C3615b bVar2, C3615b bVar3) {
        this.f44634a = g10;
        this.f44635b = g11;
        this.f44636c = g12;
        this.f44637d = g13;
        this.f44638e = aVar;
        this.f44639f = eVar;
        this.f44640g = config;
        this.f44641h = z10;
        this.f44642i = z11;
        this.f44643j = drawable;
        this.f44644k = drawable2;
        this.f44645l = drawable3;
        this.f44646m = bVar;
        this.f44647n = bVar2;
        this.f44648o = bVar3;
    }

    public static /* synthetic */ C3616c b(C3616c cVar, G g10, G g11, G g12, G g13, C3856c.a aVar, C3663e eVar, Bitmap.Config config, boolean z10, boolean z11, Drawable drawable, Drawable drawable2, Drawable drawable3, C3615b bVar, C3615b bVar2, C3615b bVar3, int i10, Object obj) {
        C3616c cVar2 = cVar;
        int i11 = i10;
        return cVar.a((i11 & 1) != 0 ? cVar2.f44634a : g10, (i11 & 2) != 0 ? cVar2.f44635b : g11, (i11 & 4) != 0 ? cVar2.f44636c : g12, (i11 & 8) != 0 ? cVar2.f44637d : g13, (i11 & 16) != 0 ? cVar2.f44638e : aVar, (i11 & 32) != 0 ? cVar2.f44639f : eVar, (i11 & 64) != 0 ? cVar2.f44640g : config, (i11 & 128) != 0 ? cVar2.f44641h : z10, (i11 & 256) != 0 ? cVar2.f44642i : z11, (i11 & 512) != 0 ? cVar2.f44643j : drawable, (i11 & 1024) != 0 ? cVar2.f44644k : drawable2, (i11 & 2048) != 0 ? cVar2.f44645l : drawable3, (i11 & 4096) != 0 ? cVar2.f44646m : bVar, (i11 & 8192) != 0 ? cVar2.f44647n : bVar2, (i11 & 16384) != 0 ? cVar2.f44648o : bVar3);
    }

    public final C3616c a(G g10, G g11, G g12, G g13, C3856c.a aVar, C3663e eVar, Bitmap.Config config, boolean z10, boolean z11, Drawable drawable, Drawable drawable2, Drawable drawable3, C3615b bVar, C3615b bVar2, C3615b bVar3) {
        return new C3616c(g10, g11, g12, g13, aVar, eVar, config, z10, z11, drawable, drawable2, drawable3, bVar, bVar2, bVar3);
    }

    public final boolean c() {
        return this.f44641h;
    }

    public final boolean d() {
        return this.f44642i;
    }

    public final Bitmap.Config e() {
        return this.f44640g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3616c) {
            C3616c cVar = (C3616c) obj;
            if (!C6496s.c(this.f44634a, cVar.f44634a) || !C6496s.c(this.f44635b, cVar.f44635b) || !C6496s.c(this.f44636c, cVar.f44636c) || !C6496s.c(this.f44637d, cVar.f44637d) || !C6496s.c(this.f44638e, cVar.f44638e) || this.f44639f != cVar.f44639f || this.f44640g != cVar.f44640g || this.f44641h != cVar.f44641h || this.f44642i != cVar.f44642i || !C6496s.c(this.f44643j, cVar.f44643j) || !C6496s.c(this.f44644k, cVar.f44644k) || !C6496s.c(this.f44645l, cVar.f44645l) || this.f44646m != cVar.f44646m || this.f44647n != cVar.f44647n || this.f44648o != cVar.f44648o) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final G f() {
        return this.f44636c;
    }

    public final C3615b g() {
        return this.f44647n;
    }

    public final Drawable h() {
        return this.f44644k;
    }

    public int hashCode() {
        int i10;
        int i11;
        int hashCode = ((((((((((((((((this.f44634a.hashCode() * 31) + this.f44635b.hashCode()) * 31) + this.f44636c.hashCode()) * 31) + this.f44637d.hashCode()) * 31) + this.f44638e.hashCode()) * 31) + this.f44639f.hashCode()) * 31) + this.f44640g.hashCode()) * 31) + Boolean.hashCode(this.f44641h)) * 31) + Boolean.hashCode(this.f44642i)) * 31;
        Drawable drawable = this.f44643j;
        int i12 = 0;
        if (drawable != null) {
            i10 = drawable.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (hashCode + i10) * 31;
        Drawable drawable2 = this.f44644k;
        if (drawable2 != null) {
            i11 = drawable2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        Drawable drawable3 = this.f44645l;
        if (drawable3 != null) {
            i12 = drawable3.hashCode();
        }
        return ((((((i14 + i12) * 31) + this.f44646m.hashCode()) * 31) + this.f44647n.hashCode()) * 31) + this.f44648o.hashCode();
    }

    public final Drawable i() {
        return this.f44645l;
    }

    public final G j() {
        return this.f44635b;
    }

    public final G k() {
        return this.f44634a;
    }

    public final C3615b l() {
        return this.f44646m;
    }

    public final C3615b m() {
        return this.f44648o;
    }

    public final Drawable n() {
        return this.f44643j;
    }

    public final C3663e o() {
        return this.f44639f;
    }

    public final G p() {
        return this.f44637d;
    }

    public final C3856c.a q() {
        return this.f44638e;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C3616c(Ug.G r16, Ug.G r17, Ug.G r18, Ug.G r19, n4.C3856c.a r20, k4.C3663e r21, android.graphics.Bitmap.Config r22, boolean r23, boolean r24, android.graphics.drawable.Drawable r25, android.graphics.drawable.Drawable r26, android.graphics.drawable.Drawable r27, j4.C3615b r28, j4.C3615b r29, j4.C3615b r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
            r15 = this;
            r0 = r31
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000f
            Ug.I0 r1 = Ug.Z.c()
            Ug.I0 r1 = r1.D1()
            goto L_0x0011
        L_0x000f:
            r1 = r16
        L_0x0011:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x001a
            Ug.G r2 = Ug.Z.b()
            goto L_0x001c
        L_0x001a:
            r2 = r17
        L_0x001c:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0025
            Ug.G r3 = Ug.Z.b()
            goto L_0x0027
        L_0x0025:
            r3 = r18
        L_0x0027:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0030
            Ug.G r4 = Ug.Z.b()
            goto L_0x0032
        L_0x0030:
            r4 = r19
        L_0x0032:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x0039
            n4.c$a r5 = n4.C3856c.a.f46857b
            goto L_0x003b
        L_0x0039:
            r5 = r20
        L_0x003b:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0042
            k4.e r6 = k4.C3663e.AUTOMATIC
            goto L_0x0044
        L_0x0042:
            r6 = r21
        L_0x0044:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x004d
            android.graphics.Bitmap$Config r7 = o4.l.f()
            goto L_0x004f
        L_0x004d:
            r7 = r22
        L_0x004f:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x0055
            r8 = 1
            goto L_0x0057
        L_0x0055:
            r8 = r23
        L_0x0057:
            r9 = r0 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x005d
            r9 = 0
            goto L_0x005f
        L_0x005d:
            r9 = r24
        L_0x005f:
            r10 = r0 & 512(0x200, float:7.175E-43)
            r11 = 0
            if (r10 == 0) goto L_0x0066
            r10 = r11
            goto L_0x0068
        L_0x0066:
            r10 = r25
        L_0x0068:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x006e
            r12 = r11
            goto L_0x0070
        L_0x006e:
            r12 = r26
        L_0x0070:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            r11 = r27
        L_0x0077:
            r13 = r0 & 4096(0x1000, float:5.74E-42)
            if (r13 == 0) goto L_0x007e
            j4.b r13 = j4.C3615b.ENABLED
            goto L_0x0080
        L_0x007e:
            r13 = r28
        L_0x0080:
            r14 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r14 == 0) goto L_0x0087
            j4.b r14 = j4.C3615b.ENABLED
            goto L_0x0089
        L_0x0087:
            r14 = r29
        L_0x0089:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0090
            j4.b r0 = j4.C3615b.ENABLED
            goto L_0x0092
        L_0x0090:
            r0 = r30
        L_0x0092:
            r16 = r15
            r17 = r1
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r8
            r25 = r9
            r26 = r10
            r27 = r12
            r28 = r11
            r29 = r13
            r30 = r14
            r31 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.C3616c.<init>(Ug.G, Ug.G, Ug.G, Ug.G, n4.c$a, k4.e, android.graphics.Bitmap$Config, boolean, boolean, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, j4.b, j4.b, j4.b, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
