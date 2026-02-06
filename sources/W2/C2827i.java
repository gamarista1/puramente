package w2;

import java.io.IOException;
import t2.C2613A;
import t2.C2658x;

/* renamed from: w2.i  reason: case insensitive filesystem */
public interface C2827i {

    /* renamed from: w2.i$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final C2658x f27753a;

        /* renamed from: b  reason: collision with root package name */
        public final C2613A f27754b;

        /* renamed from: c  reason: collision with root package name */
        public final IOException f27755c;

        /* renamed from: d  reason: collision with root package name */
        public final int f27756d;

        public a(C2658x xVar, C2613A a10, IOException iOException, int i10) {
            this.f27753a = xVar;
            this.f27754b = a10;
            this.f27755c = iOException;
            this.f27756d = i10;
        }
    }

    int a(int i10);

    long c(a aVar);

    void b(long j10) {
    }
}
