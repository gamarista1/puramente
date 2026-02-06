package g2;

import com.google.common.collect.C4770v;
import g2.b;
import i2.C2076a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: g2.a  reason: case insensitive filesystem */
public final class C2009a {

    /* renamed from: a  reason: collision with root package name */
    private final C4770v f20991a;

    /* renamed from: b  reason: collision with root package name */
    private final List f20992b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private ByteBuffer[] f20993c = new ByteBuffer[0];

    /* renamed from: d  reason: collision with root package name */
    private b.a f20994d;

    /* renamed from: e  reason: collision with root package name */
    private b.a f20995e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f20996f;

    public C2009a(C4770v vVar) {
        this.f20991a = vVar;
        b.a aVar = b.a.f20998e;
        this.f20994d = aVar;
        this.f20995e = aVar;
        this.f20996f = false;
    }

    private int c() {
        return this.f20993c.length - 1;
    }

    private void g(ByteBuffer byteBuffer) {
        boolean z10;
        ByteBuffer byteBuffer2;
        boolean z11;
        for (boolean z12 = true; z12; z12 = z10) {
            z10 = false;
            for (int i10 = 0; i10 <= c(); i10++) {
                if (!this.f20993c[i10].hasRemaining()) {
                    b bVar = (b) this.f20992b.get(i10);
                    if (!bVar.b()) {
                        if (i10 > 0) {
                            byteBuffer2 = this.f20993c[i10 - 1];
                        } else if (byteBuffer.hasRemaining()) {
                            byteBuffer2 = byteBuffer;
                        } else {
                            byteBuffer2 = b.f20997a;
                        }
                        bVar.d(byteBuffer2);
                        this.f20993c[i10] = bVar.c();
                        if (((long) byteBuffer2.remaining()) - ((long) byteBuffer2.remaining()) > 0 || this.f20993c[i10].hasRemaining()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z10 |= z11;
                    } else if (!this.f20993c[i10].hasRemaining() && i10 < c()) {
                        ((b) this.f20992b.get(i10 + 1)).e();
                    }
                }
            }
        }
    }

    public b.a a(b.a aVar) {
        if (!aVar.equals(b.a.f20998e)) {
            for (int i10 = 0; i10 < this.f20991a.size(); i10++) {
                b bVar = (b) this.f20991a.get(i10);
                b.a f10 = bVar.f(aVar);
                if (bVar.a()) {
                    C2076a.g(!f10.equals(b.a.f20998e));
                    aVar = f10;
                }
            }
            this.f20995e = aVar;
            return aVar;
        }
        throw new b.C0349b(aVar);
    }

    public void b() {
        this.f20992b.clear();
        this.f20994d = this.f20995e;
        this.f20996f = false;
        for (int i10 = 0; i10 < this.f20991a.size(); i10++) {
            b bVar = (b) this.f20991a.get(i10);
            bVar.flush();
            if (bVar.a()) {
                this.f20992b.add(bVar);
            }
        }
        this.f20993c = new ByteBuffer[this.f20992b.size()];
        for (int i11 = 0; i11 <= c(); i11++) {
            this.f20993c[i11] = ((b) this.f20992b.get(i11)).c();
        }
    }

    public ByteBuffer d() {
        if (!f()) {
            return b.f20997a;
        }
        ByteBuffer byteBuffer = this.f20993c[c()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        g(b.f20997a);
        return this.f20993c[c()];
    }

    public boolean e() {
        if (!this.f20996f || !((b) this.f20992b.get(c())).b() || this.f20993c[c()].hasRemaining()) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2009a)) {
            return false;
        }
        C2009a aVar = (C2009a) obj;
        if (this.f20991a.size() != aVar.f20991a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f20991a.size(); i10++) {
            if (this.f20991a.get(i10) != aVar.f20991a.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean f() {
        return !this.f20992b.isEmpty();
    }

    public void h() {
        if (f() && !this.f20996f) {
            this.f20996f = true;
            ((b) this.f20992b.get(0)).e();
        }
    }

    public int hashCode() {
        return this.f20991a.hashCode();
    }

    public void i(ByteBuffer byteBuffer) {
        if (f() && !this.f20996f) {
            g(byteBuffer);
        }
    }

    public void j() {
        for (int i10 = 0; i10 < this.f20991a.size(); i10++) {
            b bVar = (b) this.f20991a.get(i10);
            bVar.flush();
            bVar.reset();
        }
        this.f20993c = new ByteBuffer[0];
        b.a aVar = b.a.f20998e;
        this.f20994d = aVar;
        this.f20995e = aVar;
        this.f20996f = false;
    }
}
