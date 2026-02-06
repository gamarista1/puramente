package o2;

import android.media.AudioDeviceInfo;
import f2.C1963D;
import f2.C1968c;
import f2.C1971f;
import f2.s;
import i2.C2078c;
import java.nio.ByteBuffer;
import n2.u1;

/* renamed from: o2.y  reason: case insensitive filesystem */
public interface C2378y {

    /* renamed from: o2.y$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f25050a;

        /* renamed from: b  reason: collision with root package name */
        public final int f25051b;

        /* renamed from: c  reason: collision with root package name */
        public final int f25052c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f25053d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f25054e;

        /* renamed from: f  reason: collision with root package name */
        public final int f25055f;

        public a(int i10, int i11, int i12, boolean z10, boolean z11, int i13) {
            this.f25050a = i10;
            this.f25051b = i11;
            this.f25052c = i12;
            this.f25053d = z10;
            this.f25054e = z11;
            this.f25055f = i13;
        }
    }

    /* renamed from: o2.y$c */
    public static final class c extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final int f25057a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f25058b;

        /* renamed from: c  reason: collision with root package name */
        public final s f25059c;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public c(int r4, int r5, int r6, int r7, f2.s r8, boolean r9, java.lang.Exception r10) {
            /*
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AudioTrack init failed "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r1 = " "
                r0.append(r1)
                java.lang.String r2 = "Config("
                r0.append(r2)
                r0.append(r5)
                java.lang.String r5 = ", "
                r0.append(r5)
                r0.append(r6)
                r0.append(r5)
                r0.append(r7)
                java.lang.String r5 = ")"
                r0.append(r5)
                r0.append(r1)
                r0.append(r8)
                if (r9 == 0) goto L_0x0038
                java.lang.String r5 = " (recoverable)"
                goto L_0x003a
            L_0x0038:
                java.lang.String r5 = ""
            L_0x003a:
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                r3.<init>(r5, r10)
                r3.f25057a = r4
                r3.f25058b = r9
                r3.f25059c = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o2.C2378y.c.<init>(int, int, int, int, f2.s, boolean, java.lang.Exception):void");
        }
    }

    /* renamed from: o2.y$d */
    public interface d {
        void a(boolean z10);

        void b(Exception exc);

        void c(long j10);

        void d();

        void e(int i10, long j10, long j11);

        void f();

        void g();

        void h();

        void i();

        void o(a aVar);

        void q(a aVar);
    }

    /* renamed from: o2.y$e */
    public static final class e extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final long f25060a;

        /* renamed from: b  reason: collision with root package name */
        public final long f25061b;

        public e(long j10, long j11) {
            super("Unexpected audio track timestamp discontinuity: expected " + j11 + ", got " + j10);
            this.f25060a = j10;
            this.f25061b = j11;
        }
    }

    /* renamed from: o2.y$f */
    public static final class f extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final int f25062a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f25063b;

        /* renamed from: c  reason: collision with root package name */
        public final s f25064c;

        public f(int i10, s sVar, boolean z10) {
            super("AudioTrack write failed: " + i10);
            this.f25063b = z10;
            this.f25062a = i10;
            this.f25064c = sVar;
        }
    }

    C2365k A(s sVar);

    boolean a(s sVar);

    boolean b();

    C1963D c();

    boolean d();

    void e(int i10);

    void f(C1963D d10);

    void flush();

    void g();

    boolean h(ByteBuffer byteBuffer, long j10, int i10);

    void i();

    long j(boolean z10);

    void k();

    void l();

    void m(float f10);

    void n();

    void o(boolean z10);

    void p(AudioDeviceInfo audioDeviceInfo);

    void pause();

    void q(int i10);

    void r(C2078c cVar);

    void release();

    void reset();

    void s(C1971f fVar);

    void t(u1 u1Var);

    int u(s sVar);

    void v(int i10, int i11);

    void x(C1968c cVar);

    void y(s sVar, int i10, int[] iArr);

    void z(d dVar);

    /* renamed from: o2.y$b */
    public static final class b extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final s f25056a;

        public b(Throwable th2, s sVar) {
            super(th2);
            this.f25056a = sVar;
        }

        public b(String str, s sVar) {
            super(str);
            this.f25056a = sVar;
        }
    }

    void w(long j10) {
    }
}
