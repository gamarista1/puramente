package Vc;

import Wc.a;
import java.util.LinkedList;

final class f {

    /* renamed from: e  reason: collision with root package name */
    static final f f53448e = new f(g.f53453b, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    private final int f53449a;

    /* renamed from: b  reason: collision with root package name */
    private final g f53450b;

    /* renamed from: c  reason: collision with root package name */
    private final int f53451c;

    /* renamed from: d  reason: collision with root package name */
    private final int f53452d;

    private f(g gVar, int i10, int i11, int i12) {
        this.f53450b = gVar;
        this.f53449a = i10;
        this.f53451c = i11;
        this.f53452d = i12;
    }

    /* access modifiers changed from: package-private */
    public f a(int i10) {
        int i11;
        g gVar = this.f53450b;
        int i12 = this.f53449a;
        int i13 = this.f53452d;
        if (i12 == 4 || i12 == 2) {
            int i14 = d.f53441c[i12][0];
            int i15 = 65535 & i14;
            int i16 = i14 >> 16;
            gVar = gVar.a(i15, i16);
            i13 += i16;
            i12 = 0;
        }
        int i17 = this.f53451c;
        if (i17 == 0 || i17 == 31) {
            i11 = 18;
        } else if (i17 == 62) {
            i11 = 9;
        } else {
            i11 = 8;
        }
        f fVar = new f(gVar, i12, i17 + 1, i13 + i11);
        if (fVar.f53451c == 2078) {
            return fVar.b(i10 + 1);
        }
        return fVar;
    }

    /* access modifiers changed from: package-private */
    public f b(int i10) {
        int i11 = this.f53451c;
        if (i11 == 0) {
            return this;
        }
        return new f(this.f53450b.b(i10 - i11, i11), this.f53449a, 0, this.f53452d);
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f53451c;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f53452d;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f53449a;
    }

    /* access modifiers changed from: package-private */
    public boolean f(f fVar) {
        int i10;
        int i11 = this.f53452d + (d.f53441c[this.f53449a][fVar.f53449a] >> 16);
        int i12 = fVar.f53451c;
        if (i12 > 0 && ((i10 = this.f53451c) == 0 || i10 > i12)) {
            i11 += 10;
        }
        if (i11 <= fVar.f53452d) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public f g(int i10, int i11) {
        int i12;
        int i13 = this.f53452d;
        g gVar = this.f53450b;
        int i14 = this.f53449a;
        if (i10 != i14) {
            int i15 = d.f53441c[i14][i10];
            int i16 = 65535 & i15;
            int i17 = i15 >> 16;
            gVar = gVar.a(i16, i17);
            i13 += i17;
        }
        if (i10 == 2) {
            i12 = 4;
        } else {
            i12 = 5;
        }
        return new f(gVar.a(i11, i12), i10, 0, i13 + i12);
    }

    /* access modifiers changed from: package-private */
    public f h(int i10, int i11) {
        int i12;
        g gVar = this.f53450b;
        int i13 = this.f53449a;
        if (i13 == 2) {
            i12 = 4;
        } else {
            i12 = 5;
        }
        return new f(gVar.a(d.f53443e[i13][i10], i12).a(i11, 5), this.f53449a, 0, this.f53452d + i12 + 5);
    }

    /* access modifiers changed from: package-private */
    public a i(byte[] bArr) {
        LinkedList<g> linkedList = new LinkedList<>();
        for (g gVar = b(bArr.length).f53450b; gVar != null; gVar = gVar.d()) {
            linkedList.addFirst(gVar);
        }
        a aVar = new a();
        for (g c10 : linkedList) {
            c10.c(aVar, bArr);
        }
        return aVar;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", new Object[]{d.f53440b[this.f53449a], Integer.valueOf(this.f53452d), Integer.valueOf(this.f53451c)});
    }
}
