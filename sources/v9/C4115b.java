package v9;

import J9.b;
import java.util.List;

/* renamed from: v9.b  reason: case insensitive filesystem */
final class C4115b {

    /* renamed from: a  reason: collision with root package name */
    public final long f48977a;

    /* renamed from: b  reason: collision with root package name */
    public final List f48978b;

    /* renamed from: v9.b$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f48979a;

        /* renamed from: b  reason: collision with root package name */
        public final String f48980b;

        /* renamed from: c  reason: collision with root package name */
        public final long f48981c;

        /* renamed from: d  reason: collision with root package name */
        public final long f48982d;

        public a(String str, String str2, long j10, long j11) {
            this.f48979a = str;
            this.f48980b = str2;
            this.f48981c = j10;
            this.f48982d = j11;
        }
    }

    public C4115b(long j10, List list) {
        this.f48977a = j10;
        this.f48978b = list;
    }

    public b a(long j10) {
        long j11;
        if (this.f48978b.size() < 2) {
            return null;
        }
        long j12 = j10;
        long j13 = -1;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        boolean z10 = false;
        for (int size = this.f48978b.size() - 1; size >= 0; size--) {
            a aVar = (a) this.f48978b.get(size);
            boolean equals = "video/mp4".equals(aVar.f48979a) | z10;
            if (size == 0) {
                j12 -= aVar.f48982d;
                j11 = 0;
            } else {
                j11 = j12 - aVar.f48981c;
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
        return new b(j13, j14, this.f48977a, j15, j16);
    }
}
