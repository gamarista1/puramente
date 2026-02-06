package androidx.media;

import java.util.Arrays;

public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public int f17296a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f17297b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f17298c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f17299d = -1;

    public int a() {
        return this.f17297b;
    }

    public int b() {
        int i10 = this.f17298c;
        int c10 = c();
        if (c10 == 6) {
            i10 |= 4;
        } else if (c10 == 7) {
            i10 |= 1;
        }
        return i10 & 273;
    }

    public int c() {
        int i10 = this.f17299d;
        if (i10 != -1) {
            return i10;
        }
        return AudioAttributesCompat.a(false, this.f17298c, this.f17296a);
    }

    public int d() {
        return this.f17296a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f17297b == audioAttributesImplBase.a() && this.f17298c == audioAttributesImplBase.b() && this.f17296a == audioAttributesImplBase.d() && this.f17299d == audioAttributesImplBase.f17299d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f17297b), Integer.valueOf(this.f17298c), Integer.valueOf(this.f17296a), Integer.valueOf(this.f17299d)});
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f17299d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f17299d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        sb2.append(AudioAttributesCompat.b(this.f17296a));
        sb2.append(" content=");
        sb2.append(this.f17297b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f17298c).toUpperCase());
        return sb2.toString();
    }
}
