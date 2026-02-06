package lc;

import lc.C5092b;

/* renamed from: lc.f  reason: case insensitive filesystem */
public abstract class C5096f {

    /* renamed from: lc.f$a */
    public static abstract class a {
        public abstract C5096f a();

        public abstract a b(b bVar);

        public abstract a c(String str);

        public abstract a d(long j10);
    }

    /* renamed from: lc.f$b */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static a a() {
        return new C5092b.C0896b().d(0);
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();
}
