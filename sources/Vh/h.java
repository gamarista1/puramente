package Vh;

import bi.e;
import ci.c;
import ci.d;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class h extends b {

    /* renamed from: q  reason: collision with root package name */
    private static c f65524q = d.j(h.class);

    /* renamed from: d  reason: collision with root package name */
    int f65525d;

    /* renamed from: e  reason: collision with root package name */
    int f65526e;

    /* renamed from: f  reason: collision with root package name */
    int f65527f;

    /* renamed from: g  reason: collision with root package name */
    int f65528g;

    /* renamed from: h  reason: collision with root package name */
    int f65529h;

    /* renamed from: i  reason: collision with root package name */
    int f65530i = 0;

    /* renamed from: j  reason: collision with root package name */
    String f65531j;

    /* renamed from: k  reason: collision with root package name */
    int f65532k;

    /* renamed from: l  reason: collision with root package name */
    int f65533l;

    /* renamed from: m  reason: collision with root package name */
    int f65534m;

    /* renamed from: n  reason: collision with root package name */
    e f65535n;

    /* renamed from: o  reason: collision with root package name */
    n f65536o;

    /* renamed from: p  reason: collision with root package name */
    List f65537p = new ArrayList();

    public h() {
        this.f65505a = 3;
    }

    /* access modifiers changed from: package-private */
    public int a() {
        int i10;
        if (this.f65526e > 0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        if (this.f65527f > 0) {
            i10 += this.f65530i + 1;
        }
        if (this.f65528g > 0) {
            i10 += 2;
        }
        int b10 = i10 + this.f65535n.b() + this.f65536o.b();
        if (this.f65537p.size() <= 0) {
            return b10;
        }
        throw new RuntimeException(" Doesn't handle other descriptors yet");
    }

    public void e(ByteBuffer byteBuffer) {
        this.f65525d = bi.d.h(byteBuffer);
        int l10 = bi.d.l(byteBuffer);
        int i10 = l10 >>> 7;
        this.f65526e = i10;
        this.f65527f = (l10 >>> 6) & 1;
        this.f65528g = (l10 >>> 5) & 1;
        this.f65529h = l10 & 31;
        if (i10 == 1) {
            this.f65533l = bi.d.h(byteBuffer);
        }
        if (this.f65527f == 1) {
            int l11 = bi.d.l(byteBuffer);
            this.f65530i = l11;
            this.f65531j = bi.d.g(byteBuffer, l11);
        }
        if (this.f65528g == 1) {
            this.f65534m = bi.d.h(byteBuffer);
        }
        while (byteBuffer.remaining() > 1) {
            b a10 = l.a(-1, byteBuffer);
            if (a10 instanceof e) {
                this.f65535n = (e) a10;
            } else if (a10 instanceof n) {
                this.f65536o = (n) a10;
            } else {
                this.f65537p.add(a10);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f65527f != hVar.f65527f || this.f65530i != hVar.f65530i || this.f65533l != hVar.f65533l || this.f65525d != hVar.f65525d || this.f65534m != hVar.f65534m || this.f65528g != hVar.f65528g || this.f65532k != hVar.f65532k || this.f65526e != hVar.f65526e || this.f65529h != hVar.f65529h) {
            return false;
        }
        String str = this.f65531j;
        if (str == null ? hVar.f65531j != null : !str.equals(hVar.f65531j)) {
            return false;
        }
        e eVar = this.f65535n;
        if (eVar == null ? hVar.f65535n != null : !eVar.equals(hVar.f65535n)) {
            return false;
        }
        List list = this.f65537p;
        if (list == null ? hVar.f65537p != null : !list.equals(hVar.f65537p)) {
            return false;
        }
        n nVar = this.f65536o;
        n nVar2 = hVar.f65536o;
        if (nVar == null ? nVar2 == null : nVar.equals(nVar2)) {
            return true;
        }
        return false;
    }

    public ByteBuffer g() {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[b()]);
        e.i(wrap, 3);
        f(wrap, a());
        e.e(wrap, this.f65525d);
        e.i(wrap, (this.f65526e << 7) | (this.f65527f << 6) | (this.f65528g << 5) | (this.f65529h & 31));
        if (this.f65526e > 0) {
            e.e(wrap, this.f65533l);
        }
        if (this.f65527f > 0) {
            e.i(wrap, this.f65530i);
            e.j(wrap, this.f65531j);
        }
        if (this.f65528g > 0) {
            e.e(wrap, this.f65534m);
        }
        ByteBuffer g10 = this.f65535n.g();
        ByteBuffer g11 = this.f65536o.g();
        wrap.put(g10.array());
        wrap.put(g11.array());
        return wrap;
    }

    public void h(e eVar) {
        this.f65535n = eVar;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = ((((((((((this.f65525d * 31) + this.f65526e) * 31) + this.f65527f) * 31) + this.f65528g) * 31) + this.f65529h) * 31) + this.f65530i) * 31;
        String str = this.f65531j;
        int i14 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (((((((i13 + i10) * 31) + this.f65532k) * 31) + this.f65533l) * 31) + this.f65534m) * 31;
        e eVar = this.f65535n;
        if (eVar != null) {
            i11 = eVar.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        n nVar = this.f65536o;
        if (nVar != null) {
            i12 = nVar.hashCode();
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        List list = this.f65537p;
        if (list != null) {
            i14 = list.hashCode();
        }
        return i17 + i14;
    }

    public void i(int i10) {
        this.f65525d = i10;
    }

    public void j(n nVar) {
        this.f65536o = nVar;
    }

    public String toString() {
        return "ESDescriptor" + "{esId=" + this.f65525d + ", streamDependenceFlag=" + this.f65526e + ", URLFlag=" + this.f65527f + ", oCRstreamFlag=" + this.f65528g + ", streamPriority=" + this.f65529h + ", URLLength=" + this.f65530i + ", URLString='" + this.f65531j + '\'' + ", remoteODFlag=" + this.f65532k + ", dependsOnEsId=" + this.f65533l + ", oCREsId=" + this.f65534m + ", decoderConfigDescriptor=" + this.f65535n + ", slConfigDescriptor=" + this.f65536o + '}';
    }
}
