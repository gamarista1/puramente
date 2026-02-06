package androidx.collection;

import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;
import u.C2667d;

/* renamed from: androidx.collection.y  reason: case insensitive filesystem */
public final class C1610y extends C1594h {

    /* renamed from: e  reason: collision with root package name */
    private int f12216e;

    public C1610y(int i10) {
        super((DefaultConstructorMarker) null);
        boolean z10;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C2667d.a("Capacity must be a positive value.");
        }
        g(V.g(i10));
    }

    private final void e() {
        this.f12216e = V.c(b()) - this.f12173d;
    }

    private final void f(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = V.f12128a;
        } else {
            jArr = new long[(((i10 + 15) & -8) >> 3)];
            C6559l.z(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f12170a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        e();
    }

    private final void g(int i10) {
        int i11;
        if (i10 > 0) {
            i11 = Math.max(7, V.f(i10));
        } else {
            i11 = 0;
        }
        this.f12172c = i11;
        f(i11);
        this.f12171b = new float[i11];
    }
}
