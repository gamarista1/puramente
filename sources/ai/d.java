package ai;

import bi.e;
import java.nio.ByteBuffer;

public class d {

    /* renamed from: j  reason: collision with root package name */
    public static final d f67102j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: k  reason: collision with root package name */
    public static final d f67103k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: l  reason: collision with root package name */
    public static final d f67104l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: m  reason: collision with root package name */
    public static final d f67105m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: a  reason: collision with root package name */
    double f67106a;

    /* renamed from: b  reason: collision with root package name */
    double f67107b;

    /* renamed from: c  reason: collision with root package name */
    double f67108c;

    /* renamed from: d  reason: collision with root package name */
    double f67109d;

    /* renamed from: e  reason: collision with root package name */
    double f67110e;

    /* renamed from: f  reason: collision with root package name */
    double f67111f;

    /* renamed from: g  reason: collision with root package name */
    double f67112g;

    /* renamed from: h  reason: collision with root package name */
    double f67113h;

    /* renamed from: i  reason: collision with root package name */
    double f67114i;

    public d(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        this.f67106a = d14;
        this.f67107b = d15;
        this.f67108c = d16;
        this.f67109d = d10;
        this.f67110e = d11;
        this.f67111f = d12;
        this.f67112g = d13;
        this.f67113h = d17;
        this.f67114i = d18;
    }

    public static d a(ByteBuffer byteBuffer) {
        return b(bi.d.d(byteBuffer), bi.d.d(byteBuffer), bi.d.c(byteBuffer), bi.d.d(byteBuffer), bi.d.d(byteBuffer), bi.d.c(byteBuffer), bi.d.d(byteBuffer), bi.d.d(byteBuffer), bi.d.c(byteBuffer));
    }

    public static d b(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        return new d(d10, d11, d13, d14, d12, d15, d18, d16, d17);
    }

    public void c(ByteBuffer byteBuffer) {
        e.b(byteBuffer, this.f67109d);
        e.b(byteBuffer, this.f67110e);
        e.a(byteBuffer, this.f67106a);
        e.b(byteBuffer, this.f67111f);
        e.b(byteBuffer, this.f67112g);
        e.a(byteBuffer, this.f67107b);
        e.b(byteBuffer, this.f67113h);
        e.b(byteBuffer, this.f67114i);
        e.a(byteBuffer, this.f67108c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.f67109d, this.f67109d) == 0 && Double.compare(dVar.f67110e, this.f67110e) == 0 && Double.compare(dVar.f67111f, this.f67111f) == 0 && Double.compare(dVar.f67112g, this.f67112g) == 0 && Double.compare(dVar.f67113h, this.f67113h) == 0 && Double.compare(dVar.f67114i, this.f67114i) == 0 && Double.compare(dVar.f67106a, this.f67106a) == 0 && Double.compare(dVar.f67107b, this.f67107b) == 0 && Double.compare(dVar.f67108c, this.f67108c) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f67106a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f67107b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f67108c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.f67109d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f67110e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f67111f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f67112g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.f67113h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f67114i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public String toString() {
        if (equals(f67102j)) {
            return "Rotate 0°";
        }
        if (equals(f67103k)) {
            return "Rotate 90°";
        }
        if (equals(f67104l)) {
            return "Rotate 180°";
        }
        if (equals(f67105m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f67106a + ", v=" + this.f67107b + ", w=" + this.f67108c + ", a=" + this.f67109d + ", b=" + this.f67110e + ", c=" + this.f67111f + ", d=" + this.f67112g + ", tx=" + this.f67113h + ", ty=" + this.f67114i + '}';
    }
}
