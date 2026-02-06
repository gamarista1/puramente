package Zh;

import bi.e;
import ci.c;
import ci.d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;

public final class b extends a {

    /* renamed from: r  reason: collision with root package name */
    private static c f67013r = d.j(b.class);

    /* renamed from: e  reason: collision with root package name */
    private int f67014e;

    /* renamed from: f  reason: collision with root package name */
    private int f67015f;

    /* renamed from: g  reason: collision with root package name */
    private long f67016g;

    /* renamed from: h  reason: collision with root package name */
    private int f67017h;

    /* renamed from: i  reason: collision with root package name */
    private int f67018i;

    /* renamed from: j  reason: collision with root package name */
    private int f67019j;

    /* renamed from: k  reason: collision with root package name */
    private long f67020k;

    /* renamed from: l  reason: collision with root package name */
    private long f67021l;

    /* renamed from: m  reason: collision with root package name */
    private long f67022m;

    /* renamed from: n  reason: collision with root package name */
    private long f67023n;

    /* renamed from: o  reason: collision with root package name */
    private int f67024o;

    /* renamed from: p  reason: collision with root package name */
    private long f67025p;

    /* renamed from: q  reason: collision with root package name */
    private byte[] f67026q;

    public b(String str) {
        super(str);
    }

    public void E(long j10) {
        this.f67016g = j10;
    }

    public void F(int i10) {
        this.f67015f = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            getBox(Channels.newChannel(byteArrayOutputStream));
            try {
                bVar.getBox(Channels.newChannel(byteArrayOutputStream2));
                return Arrays.equals(byteArrayOutputStream.toByteArray(), byteArrayOutputStream2.toByteArray());
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }

    public void getBox(WritableByteChannel writableByteChannel) {
        int i10;
        writableByteChannel.write(o());
        int i11 = this.f67017h;
        int i12 = 0;
        if (i11 == 1) {
            i10 = 16;
        } else {
            i10 = 0;
        }
        int i13 = i10 + 28;
        if (i11 == 2) {
            i12 = 36;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i13 + i12);
        allocate.position(6);
        e.e(allocate, this.f67012d);
        e.e(allocate, this.f67017h);
        e.e(allocate, this.f67024o);
        e.g(allocate, this.f67025p);
        e.e(allocate, this.f67014e);
        e.e(allocate, this.f67015f);
        e.e(allocate, this.f67018i);
        e.e(allocate, this.f67019j);
        if (this.f67096b.equals("mlpa")) {
            e.g(allocate, v());
        } else {
            e.g(allocate, v() << 16);
        }
        if (this.f67017h == 1) {
            e.g(allocate, this.f67020k);
            e.g(allocate, this.f67021l);
            e.g(allocate, this.f67022m);
            e.g(allocate, this.f67023n);
        }
        if (this.f67017h == 2) {
            e.g(allocate, this.f67020k);
            e.g(allocate, this.f67021l);
            e.g(allocate, this.f67022m);
            e.g(allocate, this.f67023n);
            allocate.put(this.f67026q);
        }
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        n(writableByteChannel);
    }

    public long getSize() {
        int i10;
        int i11 = this.f67017h;
        int i12 = 0;
        int i13 = 16;
        if (i11 == 1) {
            i10 = 16;
        } else {
            i10 = 0;
        }
        int i14 = i10 + 28;
        if (i11 == 2) {
            i12 = 36;
        }
        long f10 = ((long) (i14 + i12)) + f();
        if (!this.f67097c && 8 + f10 < 4294967296L) {
            i13 = 8;
        }
        return f10 + ((long) i13);
    }

    public int hashCode() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            getBox(Channels.newChannel(byteArrayOutputStream));
            return Arrays.hashCode(byteArrayOutputStream.toByteArray());
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public int t() {
        return this.f67014e;
    }

    public String toString() {
        return "AudioSampleEntry{bytesPerSample=" + this.f67023n + ", bytesPerFrame=" + this.f67022m + ", bytesPerPacket=" + this.f67021l + ", samplesPerPacket=" + this.f67020k + ", packetSize=" + this.f67019j + ", compressionId=" + this.f67018i + ", soundVersion=" + this.f67017h + ", sampleRate=" + this.f67016g + ", sampleSize=" + this.f67015f + ", channelCount=" + this.f67014e + ", boxes=" + b() + '}';
    }

    public long v() {
        return this.f67016g;
    }

    public void y(int i10) {
        this.f67014e = i10;
    }
}
