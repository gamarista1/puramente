package m9;

import ja.M;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: m9.g  reason: case insensitive filesystem */
public interface C3849g {

    /* renamed from: a  reason: collision with root package name */
    public static final ByteBuffer f46651a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* renamed from: m9.g$a */
    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public static final a f46652e = new a(-1, -1, -1);

        /* renamed from: a  reason: collision with root package name */
        public final int f46653a;

        /* renamed from: b  reason: collision with root package name */
        public final int f46654b;

        /* renamed from: c  reason: collision with root package name */
        public final int f46655c;

        /* renamed from: d  reason: collision with root package name */
        public final int f46656d;

        public a(int i10, int i11, int i12) {
            int i13;
            this.f46653a = i10;
            this.f46654b = i11;
            this.f46655c = i12;
            if (M.v0(i12)) {
                i13 = M.e0(i12, i11);
            } else {
                i13 = -1;
            }
            this.f46656d = i13;
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f46653a + ", channelCount=" + this.f46654b + ", encoding=" + this.f46655c + ']';
        }
    }

    /* renamed from: m9.g$b */
    public static final class b extends Exception {
        public b(a aVar) {
            super("Unhandled format: " + aVar);
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
