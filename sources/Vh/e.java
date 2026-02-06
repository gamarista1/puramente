package Vh;

import ci.c;
import ci.d;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class e extends b {

    /* renamed from: m  reason: collision with root package name */
    private static final c f65514m = d.j(e.class);

    /* renamed from: d  reason: collision with root package name */
    int f65515d;

    /* renamed from: e  reason: collision with root package name */
    int f65516e;

    /* renamed from: f  reason: collision with root package name */
    int f65517f;

    /* renamed from: g  reason: collision with root package name */
    int f65518g;

    /* renamed from: h  reason: collision with root package name */
    long f65519h;

    /* renamed from: i  reason: collision with root package name */
    long f65520i;

    /* renamed from: j  reason: collision with root package name */
    a f65521j;

    /* renamed from: k  reason: collision with root package name */
    List f65522k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    byte[] f65523l;

    public e() {
        this.f65505a = 4;
    }

    /* access modifiers changed from: package-private */
    public int a() {
        int i10;
        a aVar = this.f65521j;
        if (aVar == null) {
            i10 = 0;
        } else {
            i10 = aVar.b();
        }
        int i11 = i10 + 13;
        Iterator it = this.f65522k.iterator();
        if (!it.hasNext()) {
            return i11;
        }
        android.support.v4.media.session.c.a(it.next());
        throw null;
    }

    public void e(ByteBuffer byteBuffer) {
        Integer num;
        int b10;
        this.f65515d = bi.d.l(byteBuffer);
        int l10 = bi.d.l(byteBuffer);
        this.f65516e = l10 >>> 2;
        this.f65517f = (l10 >> 1) & 1;
        this.f65518g = bi.d.i(byteBuffer);
        this.f65519h = bi.d.j(byteBuffer);
        this.f65520i = bi.d.j(byteBuffer);
        while (byteBuffer.remaining() > 2) {
            int position = byteBuffer.position();
            b a10 = l.a(this.f65515d, byteBuffer);
            int position2 = byteBuffer.position() - position;
            c cVar = f65514m;
            Integer valueOf = Integer.valueOf(position2);
            if (a10 != null) {
                num = Integer.valueOf(a10.b());
            } else {
                num = null;
            }
            cVar.d("{} - DecoderConfigDescr1 read: {}, size: {}", a10, valueOf, num);
            if (a10 != null && position2 < (b10 = a10.b())) {
                byte[] bArr = new byte[(b10 - position2)];
                this.f65523l = bArr;
                byteBuffer.get(bArr);
            }
            if (a10 instanceof a) {
                this.f65521j = (a) a10;
            }
        }
    }

    public ByteBuffer g() {
        ByteBuffer allocate = ByteBuffer.allocate(b());
        bi.e.i(allocate, this.f65505a);
        f(allocate, a());
        bi.e.i(allocate, this.f65515d);
        bi.e.i(allocate, (this.f65516e << 2) | (this.f65517f << 1) | 1);
        bi.e.f(allocate, this.f65518g);
        bi.e.g(allocate, this.f65519h);
        bi.e.g(allocate, this.f65520i);
        a aVar = this.f65521j;
        if (aVar != null) {
            allocate.put(aVar.o());
        }
        Iterator it = this.f65522k.iterator();
        if (!it.hasNext()) {
            return (ByteBuffer) allocate.rewind();
        }
        android.support.v4.media.session.c.a(it.next());
        throw null;
    }

    public void h(a aVar) {
        this.f65521j = aVar;
    }

    public void i(long j10) {
        this.f65520i = j10;
    }

    public void j(int i10) {
        this.f65518g = i10;
    }

    public void k(long j10) {
        this.f65519h = j10;
    }

    public void l(int i10) {
        this.f65515d = i10;
    }

    public void m(int i10) {
        this.f65516e = i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DecoderConfigDescriptor");
        sb2.append("{objectTypeIndication=");
        sb2.append(this.f65515d);
        sb2.append(", streamType=");
        sb2.append(this.f65516e);
        sb2.append(", upStream=");
        sb2.append(this.f65517f);
        sb2.append(", bufferSizeDB=");
        sb2.append(this.f65518g);
        sb2.append(", maxBitRate=");
        sb2.append(this.f65519h);
        sb2.append(", avgBitRate=");
        sb2.append(this.f65520i);
        sb2.append(", decoderSpecificInfo=");
        sb2.append((Object) null);
        sb2.append(", audioSpecificInfo=");
        sb2.append(this.f65521j);
        sb2.append(", configDescriptorDeadBytes=");
        byte[] bArr = this.f65523l;
        if (bArr == null) {
            bArr = new byte[0];
        }
        sb2.append(bi.c.a(bArr));
        sb2.append(", profileLevelIndicationDescriptors=");
        Object obj = this.f65522k;
        if (obj == null) {
            obj = "null";
        }
        sb2.append(obj);
        sb2.append('}');
        return sb2.toString();
    }
}
