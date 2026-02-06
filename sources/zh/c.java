package Zh;

import bi.e;
import bi.f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;

public final class c extends a {

    /* renamed from: e  reason: collision with root package name */
    private int f67027e;

    /* renamed from: f  reason: collision with root package name */
    private int f67028f;

    /* renamed from: g  reason: collision with root package name */
    private double f67029g = 72.0d;

    /* renamed from: h  reason: collision with root package name */
    private double f67030h = 72.0d;

    /* renamed from: i  reason: collision with root package name */
    private int f67031i = 1;

    /* renamed from: j  reason: collision with root package name */
    private String f67032j = "";

    /* renamed from: k  reason: collision with root package name */
    private int f67033k = 24;

    /* renamed from: l  reason: collision with root package name */
    private long[] f67034l = new long[3];

    public c(String str) {
        super(str);
    }

    public double E() {
        return this.f67029g;
    }

    public double F() {
        return this.f67030h;
    }

    public void I(String str) {
        this.f67032j = str;
    }

    public void M(int i10) {
        this.f67033k = i10;
    }

    public void Q(int i10) {
        this.f67031i = i10;
    }

    public void T(int i10) {
        this.f67028f = i10;
    }

    public void U(double d10) {
        this.f67029g = d10;
    }

    public void V(double d10) {
        this.f67030h = d10;
    }

    public int d() {
        return this.f67028f;
    }

    public int e() {
        return this.f67027e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            getBox(Channels.newChannel(byteArrayOutputStream));
            try {
                cVar.getBox(Channels.newChannel(byteArrayOutputStream2));
                return Arrays.equals(byteArrayOutputStream.toByteArray(), byteArrayOutputStream2.toByteArray());
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }

    public void f0(int i10) {
        this.f67027e = i10;
    }

    public void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(o());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        e.e(allocate, this.f67012d);
        e.e(allocate, 0);
        e.e(allocate, 0);
        e.g(allocate, this.f67034l[0]);
        e.g(allocate, this.f67034l[1]);
        e.g(allocate, this.f67034l[2]);
        e.e(allocate, e());
        e.e(allocate, d());
        e.b(allocate, E());
        e.b(allocate, F());
        e.g(allocate, 0);
        e.e(allocate, y());
        e.i(allocate, f.c(t()));
        allocate.put(f.b(t()));
        int c10 = f.c(t());
        while (c10 < 31) {
            c10++;
            allocate.put((byte) 0);
        }
        e.e(allocate, v());
        e.e(allocate, 65535);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        n(writableByteChannel);
    }

    public long getSize() {
        int i10;
        long f10 = f();
        long j10 = 78 + f10;
        if (this.f67097c || f10 + 86 >= 4294967296L) {
            i10 = 16;
        } else {
            i10 = 8;
        }
        return j10 + ((long) i10);
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

    public String t() {
        return this.f67032j;
    }

    public int v() {
        return this.f67033k;
    }

    public int y() {
        return this.f67031i;
    }
}
