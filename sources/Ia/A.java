package ia;

import N9.C3065n;
import N9.C3068q;
import ja.C3645a;
import java.io.IOException;

public interface A {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f44352a;

        /* renamed from: b  reason: collision with root package name */
        public final int f44353b;

        /* renamed from: c  reason: collision with root package name */
        public final int f44354c;

        /* renamed from: d  reason: collision with root package name */
        public final int f44355d;

        public a(int i10, int i11, int i12, int i13) {
            this.f44352a = i10;
            this.f44353b = i11;
            this.f44354c = i12;
            this.f44355d = i13;
        }

        public boolean a(int i10) {
            if (i10 == 1) {
                if (this.f44352a - this.f44353b <= 1) {
                    return false;
                }
            } else if (this.f44354c - this.f44355d <= 1) {
                return false;
            }
            return true;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f44356a;

        /* renamed from: b  reason: collision with root package name */
        public final long f44357b;

        public b(int i10, long j10) {
            boolean z10;
            if (j10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            C3645a.a(z10);
            this.f44356a = i10;
            this.f44357b = j10;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final C3065n f44358a;

        /* renamed from: b  reason: collision with root package name */
        public final C3068q f44359b;

        /* renamed from: c  reason: collision with root package name */
        public final IOException f44360c;

        /* renamed from: d  reason: collision with root package name */
        public final int f44361d;

        public c(C3065n nVar, C3068q qVar, IOException iOException, int i10) {
            this.f44358a = nVar;
            this.f44359b = qVar;
            this.f44360c = iOException;
            this.f44361d = i10;
        }
    }

    int a(int i10);

    long c(c cVar);

    b d(a aVar, c cVar);

    void b(long j10) {
    }
}
