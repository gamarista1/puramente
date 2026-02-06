package W2;

import com.google.common.collect.C4770v;
import i2.C2082g;
import java.util.Objects;

public interface s {

    public interface a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f8664a = new C0178a();

        /* renamed from: W2.s$a$a  reason: collision with other inner class name */
        class C0178a implements a {
            C0178a() {
            }

            public boolean a(f2.s sVar) {
                return false;
            }

            public s b(f2.s sVar) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }

            public int c(f2.s sVar) {
                return 1;
            }
        }

        boolean a(f2.s sVar);

        s b(f2.s sVar);

        int c(f2.s sVar);
    }

    public static class b {
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static final b f8665c = new b(-9223372036854775807L, false);

        /* renamed from: a  reason: collision with root package name */
        public final long f8666a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f8667b;

        private b(long j10, boolean z10) {
            this.f8666a = j10;
            this.f8667b = z10;
        }

        public static b b() {
            return f8665c;
        }

        public static b c(long j10) {
            return new b(j10, true);
        }
    }

    void a(byte[] bArr, int i10, int i11, b bVar, C2082g gVar);

    k b(byte[] bArr, int i10, int i11) {
        C4770v.a t10 = C4770v.t();
        b a10 = b.f8665c;
        Objects.requireNonNull(t10);
        a(bArr, i10, i11, a10, new r(t10));
        return new g(t10.k());
    }

    int c();

    void reset() {
    }
}
