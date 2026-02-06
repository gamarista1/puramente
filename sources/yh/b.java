package Yh;

import Vh.c;
import Vh.d;
import bi.e;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public int f66894a;

    /* renamed from: b  reason: collision with root package name */
    public int f66895b;

    /* renamed from: c  reason: collision with root package name */
    public int f66896c;

    /* renamed from: d  reason: collision with root package name */
    public int f66897d;

    /* renamed from: e  reason: collision with root package name */
    public int f66898e;

    /* renamed from: f  reason: collision with root package name */
    public List f66899f;

    /* renamed from: g  reason: collision with root package name */
    public List f66900g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f66901h;

    /* renamed from: i  reason: collision with root package name */
    public int f66902i;

    /* renamed from: j  reason: collision with root package name */
    public int f66903j;

    /* renamed from: k  reason: collision with root package name */
    public int f66904k;

    /* renamed from: l  reason: collision with root package name */
    public List f66905l;

    /* renamed from: m  reason: collision with root package name */
    public int f66906m;

    /* renamed from: n  reason: collision with root package name */
    public int f66907n;

    /* renamed from: o  reason: collision with root package name */
    public int f66908o;

    /* renamed from: p  reason: collision with root package name */
    public int f66909p;

    /* renamed from: q  reason: collision with root package name */
    public int f66910q;

    public b() {
        this.f66899f = new ArrayList();
        this.f66900g = new ArrayList();
        this.f66901h = true;
        this.f66902i = 1;
        this.f66903j = 0;
        this.f66904k = 0;
        this.f66905l = new ArrayList();
        this.f66906m = 63;
        this.f66907n = 7;
        this.f66908o = 31;
        this.f66909p = 31;
        this.f66910q = 31;
    }

    public void a(ByteBuffer byteBuffer) {
        e.i(byteBuffer, this.f66894a);
        e.i(byteBuffer, this.f66895b);
        e.i(byteBuffer, this.f66896c);
        e.i(byteBuffer, this.f66897d);
        d dVar = new d(byteBuffer);
        dVar.a(this.f66906m, 6);
        dVar.a(this.f66898e, 2);
        dVar.a(this.f66907n, 3);
        dVar.a(this.f66899f.size(), 5);
        for (ByteBuffer byteBuffer2 : this.f66899f) {
            e.e(byteBuffer, byteBuffer2.limit());
            byteBuffer.put((ByteBuffer) byteBuffer2.rewind());
        }
        e.i(byteBuffer, this.f66900g.size());
        for (ByteBuffer byteBuffer3 : this.f66900g) {
            e.e(byteBuffer, byteBuffer3.limit());
            byteBuffer.put((ByteBuffer) byteBuffer3.rewind());
        }
        if (this.f66901h) {
            int i10 = this.f66895b;
            if (i10 == 100 || i10 == 110 || i10 == 122 || i10 == 144) {
                d dVar2 = new d(byteBuffer);
                dVar2.a(this.f66908o, 6);
                dVar2.a(this.f66902i, 2);
                dVar2.a(this.f66909p, 5);
                dVar2.a(this.f66903j, 3);
                dVar2.a(this.f66910q, 5);
                dVar2.a(this.f66904k, 3);
                for (ByteBuffer byteBuffer4 : this.f66905l) {
                    e.e(byteBuffer, byteBuffer4.limit());
                    byteBuffer.put((ByteBuffer) byteBuffer4.reset());
                }
            }
        }
    }

    public long b() {
        long j10;
        int i10;
        long j11 = 6;
        for (ByteBuffer limit : this.f66899f) {
            j11 = j11 + 2 + ((long) limit.limit());
        }
        long j12 = j11 + 1;
        for (ByteBuffer limit2 : this.f66900g) {
            j12 = j10 + 2 + ((long) limit2.limit());
        }
        if (this.f66901h && ((i10 = this.f66895b) == 100 || i10 == 110 || i10 == 122 || i10 == 144)) {
            j10 += 4;
            for (ByteBuffer limit3 : this.f66905l) {
                j10 = j10 + 2 + ((long) limit3.limit());
            }
        }
        return j10;
    }

    public String toString() {
        return "AvcDecoderConfigurationRecord{configurationVersion=" + this.f66894a + ", avcProfileIndication=" + this.f66895b + ", profileCompatibility=" + this.f66896c + ", avcLevelIndication=" + this.f66897d + ", lengthSizeMinusOne=" + this.f66898e + ", hasExts=" + this.f66901h + ", chromaFormat=" + this.f66902i + ", bitDepthLumaMinus8=" + this.f66903j + ", bitDepthChromaMinus8=" + this.f66904k + ", lengthSizeMinusOnePaddingBits=" + this.f66906m + ", numberOfSequenceParameterSetsPaddingBits=" + this.f66907n + ", chromaFormatPaddingBits=" + this.f66908o + ", bitDepthLumaMinus8PaddingBits=" + this.f66909p + ", bitDepthChromaMinus8PaddingBits=" + this.f66910q + '}';
    }

    public b(ByteBuffer byteBuffer) {
        int i10;
        this.f66899f = new ArrayList();
        this.f66900g = new ArrayList();
        this.f66901h = true;
        this.f66902i = 1;
        this.f66903j = 0;
        this.f66904k = 0;
        this.f66905l = new ArrayList();
        this.f66906m = 63;
        this.f66907n = 7;
        this.f66908o = 31;
        this.f66909p = 31;
        this.f66910q = 31;
        this.f66894a = bi.d.l(byteBuffer);
        this.f66895b = bi.d.l(byteBuffer);
        this.f66896c = bi.d.l(byteBuffer);
        this.f66897d = bi.d.l(byteBuffer);
        c cVar = new c(byteBuffer);
        this.f66906m = cVar.a(6);
        this.f66898e = cVar.a(2);
        this.f66907n = cVar.a(3);
        int a10 = cVar.a(5);
        for (int i11 = 0; i11 < a10; i11++) {
            byte[] bArr = new byte[bi.d.h(byteBuffer)];
            byteBuffer.get(bArr);
            this.f66899f.add(ByteBuffer.wrap(bArr));
        }
        long l10 = (long) bi.d.l(byteBuffer);
        for (int i12 = 0; ((long) i12) < l10; i12++) {
            byte[] bArr2 = new byte[bi.d.h(byteBuffer)];
            byteBuffer.get(bArr2);
            this.f66900g.add(ByteBuffer.wrap(bArr2));
        }
        if (byteBuffer.remaining() < 4) {
            this.f66901h = false;
        }
        if (!this.f66901h || !((i10 = this.f66895b) == 100 || i10 == 110 || i10 == 122 || i10 == 144)) {
            this.f66902i = -1;
            this.f66903j = -1;
            this.f66904k = -1;
            return;
        }
        c cVar2 = new c(byteBuffer);
        this.f66908o = cVar2.a(6);
        this.f66902i = cVar2.a(2);
        this.f66909p = cVar2.a(5);
        this.f66903j = cVar2.a(3);
        this.f66910q = cVar2.a(5);
        this.f66904k = cVar2.a(3);
        long l11 = (long) bi.d.l(byteBuffer);
        for (int i13 = 0; ((long) i13) < l11; i13++) {
            byte[] bArr3 = new byte[bi.d.h(byteBuffer)];
            byteBuffer.get(bArr3);
            this.f66905l.add(ByteBuffer.wrap(bArr3));
        }
    }
}
