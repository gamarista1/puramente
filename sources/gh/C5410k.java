package Gh;

import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import mf.O;
import yf.C6798l;

/* renamed from: Gh.k  reason: case insensitive filesystem */
public final class C5410k {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f63310a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f63311b;

    /* renamed from: c  reason: collision with root package name */
    private final M f63312c;

    /* renamed from: d  reason: collision with root package name */
    private final Long f63313d;

    /* renamed from: e  reason: collision with root package name */
    private final Long f63314e;

    /* renamed from: f  reason: collision with root package name */
    private final Long f63315f;

    /* renamed from: g  reason: collision with root package name */
    private final Long f63316g;

    /* renamed from: h  reason: collision with root package name */
    private final Map f63317h;

    public C5410k(boolean z10, boolean z11, M m10, Long l10, Long l11, Long l12, Long l13, Map map) {
        C6496s.h(map, "extras");
        this.f63310a = z10;
        this.f63311b = z11;
        this.f63312c = m10;
        this.f63313d = l10;
        this.f63314e = l11;
        this.f63315f = l12;
        this.f63316g = l13;
        this.f63317h = O.y(map);
    }

    public static /* synthetic */ C5410k b(C5410k kVar, boolean z10, boolean z11, M m10, Long l10, Long l11, Long l12, Long l13, Map map, int i10, Object obj) {
        boolean z12;
        boolean z13;
        M m11;
        Long l14;
        Long l15;
        Long l16;
        Long l17;
        Map map2;
        C5410k kVar2 = kVar;
        int i11 = i10;
        if ((i11 & 1) != 0) {
            z12 = kVar2.f63310a;
        } else {
            z12 = z10;
        }
        if ((i11 & 2) != 0) {
            z13 = kVar2.f63311b;
        } else {
            z13 = z11;
        }
        if ((i11 & 4) != 0) {
            m11 = kVar2.f63312c;
        } else {
            m11 = m10;
        }
        if ((i11 & 8) != 0) {
            l14 = kVar2.f63313d;
        } else {
            l14 = l10;
        }
        if ((i11 & 16) != 0) {
            l15 = kVar2.f63314e;
        } else {
            l15 = l11;
        }
        if ((i11 & 32) != 0) {
            l16 = kVar2.f63315f;
        } else {
            l16 = l12;
        }
        if ((i11 & 64) != 0) {
            l17 = kVar2.f63316g;
        } else {
            l17 = l13;
        }
        if ((i11 & 128) != 0) {
            map2 = kVar2.f63317h;
        } else {
            map2 = map;
        }
        return kVar.a(z12, z13, m11, l14, l15, l16, l17, map2);
    }

    public final C5410k a(boolean z10, boolean z11, M m10, Long l10, Long l11, Long l12, Long l13, Map map) {
        Map map2 = map;
        C6496s.h(map2, "extras");
        return new C5410k(z10, z11, m10, l10, l11, l12, l13, map2);
    }

    public final Long c() {
        return this.f63313d;
    }

    public final M d() {
        return this.f63312c;
    }

    public final boolean e() {
        return this.f63311b;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f63310a) {
            arrayList.add("isRegularFile");
        }
        if (this.f63311b) {
            arrayList.add("isDirectory");
        }
        if (this.f63313d != null) {
            arrayList.add("byteCount=" + this.f63313d);
        }
        if (this.f63314e != null) {
            arrayList.add("createdAt=" + this.f63314e);
        }
        if (this.f63315f != null) {
            arrayList.add("lastModifiedAt=" + this.f63315f);
        }
        if (this.f63316g != null) {
            arrayList.add("lastAccessedAt=" + this.f63316g);
        }
        if (!this.f63317h.isEmpty()) {
            arrayList.add("extras=" + this.f63317h);
        }
        return C6565s.x0(arrayList, ", ", "FileMetadata(", ")", 0, (CharSequence) null, (C6798l) null, 56, (Object) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C5410k(boolean r10, boolean r11, Gh.M r12, java.lang.Long r13, java.lang.Long r14, java.lang.Long r15, java.lang.Long r16, java.util.Map r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r2 = r11
        L_0x0010:
            r3 = r0 & 4
            r4 = 0
            if (r3 == 0) goto L_0x0017
            r3 = r4
            goto L_0x0018
        L_0x0017:
            r3 = r12
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r4
            goto L_0x001f
        L_0x001e:
            r5 = r13
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r4
            goto L_0x0026
        L_0x0025:
            r6 = r14
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r4
            goto L_0x002d
        L_0x002c:
            r7 = r15
        L_0x002d:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r4 = r16
        L_0x0034:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003d
            java.util.Map r0 = mf.O.i()
            goto L_0x003f
        L_0x003d:
            r0 = r17
        L_0x003f:
            r10 = r9
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r4
            r18 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Gh.C5410k.<init>(boolean, boolean, Gh.M, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
