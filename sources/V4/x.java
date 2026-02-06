package V4;

import T4.f;
import T4.i;
import T4.m;
import W4.b;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import o5.h;
import o5.l;

final class x implements f {

    /* renamed from: j  reason: collision with root package name */
    private static final h f34648j = new h(50);

    /* renamed from: b  reason: collision with root package name */
    private final b f34649b;

    /* renamed from: c  reason: collision with root package name */
    private final f f34650c;

    /* renamed from: d  reason: collision with root package name */
    private final f f34651d;

    /* renamed from: e  reason: collision with root package name */
    private final int f34652e;

    /* renamed from: f  reason: collision with root package name */
    private final int f34653f;

    /* renamed from: g  reason: collision with root package name */
    private final Class f34654g;

    /* renamed from: h  reason: collision with root package name */
    private final i f34655h;

    /* renamed from: i  reason: collision with root package name */
    private final m f34656i;

    x(b bVar, f fVar, f fVar2, int i10, int i11, m mVar, Class cls, i iVar) {
        this.f34649b = bVar;
        this.f34650c = fVar;
        this.f34651d = fVar2;
        this.f34652e = i10;
        this.f34653f = i11;
        this.f34656i = mVar;
        this.f34654g = cls;
        this.f34655h = iVar;
    }

    private byte[] c() {
        h hVar = f34648j;
        byte[] bArr = (byte[]) hVar.g(this.f34654g);
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.f34654g.getName().getBytes(f.f34158a);
        hVar.k(this.f34654g, bytes);
        return bytes;
    }

    public void b(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f34649b.e(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f34652e).putInt(this.f34653f).array();
        this.f34651d.b(messageDigest);
        this.f34650c.b(messageDigest);
        messageDigest.update(bArr);
        m mVar = this.f34656i;
        if (mVar != null) {
            mVar.b(messageDigest);
        }
        this.f34655h.b(messageDigest);
        messageDigest.update(c());
        this.f34649b.c(bArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f34653f != xVar.f34653f || this.f34652e != xVar.f34652e || !l.e(this.f34656i, xVar.f34656i) || !this.f34654g.equals(xVar.f34654g) || !this.f34650c.equals(xVar.f34650c) || !this.f34651d.equals(xVar.f34651d) || !this.f34655h.equals(xVar.f34655h)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (((((this.f34650c.hashCode() * 31) + this.f34651d.hashCode()) * 31) + this.f34652e) * 31) + this.f34653f;
        m mVar = this.f34656i;
        if (mVar != null) {
            hashCode = (hashCode * 31) + mVar.hashCode();
        }
        return (((hashCode * 31) + this.f34654g.hashCode()) * 31) + this.f34655h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f34650c + ", signature=" + this.f34651d + ", width=" + this.f34652e + ", height=" + this.f34653f + ", decodedResourceClass=" + this.f34654g + ", transformation='" + this.f34656i + '\'' + ", options=" + this.f34655h + '}';
    }
}
