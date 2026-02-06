package H2;

import java.util.List;

final class c {

    /* renamed from: a  reason: collision with root package name */
    public final long f2649a;

    /* renamed from: b  reason: collision with root package name */
    public final List f2650b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f2651a;

        /* renamed from: b  reason: collision with root package name */
        public final String f2652b;

        /* renamed from: c  reason: collision with root package name */
        public final long f2653c;

        /* renamed from: d  reason: collision with root package name */
        public final long f2654d;

        public a(String str, String str2, long j10, long j11) {
            this.f2651a = str;
            this.f2652b = str2;
            this.f2653c = j10;
            this.f2654d = j11;
        }
    }

    public c(long j10, List list) {
        this.f2649a = j10;
        this.f2650b = list;
    }

    public O2.a a(long j10) {
        long j11;
        if (this.f2650b.size() < 2) {
            return null;
        }
        long j12 = j10;
        long j13 = -1;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        boolean z10 = false;
        for (int size = this.f2650b.size() - 1; size >= 0; size--) {
            a aVar = (a) this.f2650b.get(size);
            boolean equals = "video/mp4".equals(aVar.f2651a) | z10;
            if (size == 0) {
                j12 -= aVar.f2654d;
                j11 = 0;
            } else {
                j11 = j12 - aVar.f2653c;
            }
            long j17 = j12;
            j12 = j11;
            long j18 = j17;
            if (!equals || j12 == j18) {
                z10 = equals;
            } else {
                j16 = j18 - j12;
                j15 = j12;
                z10 = false;
            }
            if (size == 0) {
                j13 = j12;
                j14 = j18;
            }
        }
        if (j15 == -1 || j16 == -1 || j13 == -1 || j14 == -1) {
            return null;
        }
        return new O2.a(j13, j14, this.f2649a, j15, j16);
    }
}
