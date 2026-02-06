package m9;

import java.nio.ByteBuffer;
import k9.C3717q0;
import k9.S0;
import l9.s0;

public interface s {

    public static final class b extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final int f46685a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f46686b;

        /* renamed from: c  reason: collision with root package name */
        public final C3717q0 f46687c;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b(int r3, int r4, int r5, int r6, k9.C3717q0 r7, boolean r8, java.lang.Exception r9) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AudioTrack init failed "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " "
                r0.append(r1)
                java.lang.String r1 = "Config("
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = ", "
                r0.append(r4)
                r0.append(r5)
                r0.append(r4)
                r0.append(r6)
                java.lang.String r4 = ")"
                r0.append(r4)
                if (r8 == 0) goto L_0x0032
                java.lang.String r4 = " (recoverable)"
                goto L_0x0034
            L_0x0032:
                java.lang.String r4 = ""
            L_0x0034:
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r2.<init>(r4, r9)
                r2.f46685a = r3
                r2.f46686b = r8
                r2.f46687c = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m9.s.b.<init>(int, int, int, int, k9.q0, boolean, java.lang.Exception):void");
        }
    }

    public interface c {
        void a(boolean z10);

        void b(Exception exc);

        void c(long j10);

        void d();

        void e(int i10, long j10, long j11);

        void f();

        void g();
    }

    public static final class d extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final long f46688a;

        /* renamed from: b  reason: collision with root package name */
        public final long f46689b;

        public d(long j10, long j11) {
            super("Unexpected audio track timestamp discontinuity: expected " + j11 + ", got " + j10);
            this.f46688a = j10;
            this.f46689b = j11;
        }
    }

    public static final class e extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final int f46690a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f46691b;

        /* renamed from: c  reason: collision with root package name */
        public final C3717q0 f46692c;

        public e(int i10, C3717q0 q0Var, boolean z10) {
            super("AudioTrack write failed: " + i10);
            this.f46691b = z10;
            this.f46690a = i10;
            this.f46692c = q0Var;
        }
    }

    boolean a(C3717q0 q0Var);

    boolean b();

    S0 c();

    boolean d();

    void e(int i10);

    void f(S0 s02);

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

    void p(C3847e eVar);

    void pause();

    void q();

    void r(v vVar);

    void reset();

    void s(C3717q0 q0Var, int i10, int[] iArr);

    int t(C3717q0 q0Var);

    void u(s0 s0Var);

    void v(c cVar);

    public static final class a extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final C3717q0 f46684a;

        public a(Throwable th2, C3717q0 q0Var) {
            super(th2);
            this.f46684a = q0Var;
        }

        public a(String str, C3717q0 q0Var) {
            super(str);
            this.f46684a = q0Var;
        }
    }
}
