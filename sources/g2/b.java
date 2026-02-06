package g2;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import f2.s;
import i2.L;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import nb.k;

public interface b {

    /* renamed from: a  reason: collision with root package name */
    public static final ByteBuffer f20997a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public static final a f20998e = new a(-1, -1, -1);

        /* renamed from: a  reason: collision with root package name */
        public final int f20999a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21000b;

        /* renamed from: c  reason: collision with root package name */
        public final int f21001c;

        /* renamed from: d  reason: collision with root package name */
        public final int f21002d;

        public a(s sVar) {
            this(sVar.f20060C, sVar.f20059B, sVar.f20061D);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f20999a == aVar.f20999a && this.f21000b == aVar.f21000b && this.f21001c == aVar.f21001c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return k.b(Integer.valueOf(this.f20999a), Integer.valueOf(this.f21000b), Integer.valueOf(this.f21001c));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f20999a + ", channelCount=" + this.f21000b + ", encoding=" + this.f21001c + ']';
        }

        public a(int i10, int i11, int i12) {
            this.f20999a = i10;
            this.f21000b = i11;
            this.f21001c = i12;
            this.f21002d = L.C0(i12) ? L.f0(i12, i11) : -1;
        }
    }

    /* renamed from: g2.b$b  reason: collision with other inner class name */
    public static final class C0349b extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final a f21003a;

        public C0349b(a aVar) {
            this("Unhandled input format:", aVar);
        }

        public C0349b(String str, a aVar) {
            super(str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + aVar);
            this.f21003a = aVar;
        }
    }

    boolean a();

    boolean b();

    ByteBuffer c();

    void d(ByteBuffer byteBuffer);

    void e();

    a f(a aVar);

    void flush();

    void reset();
}
