package E;

import yf.C6798l;

/* renamed from: E.d  reason: case insensitive filesystem */
public interface C1135d {

    /* renamed from: E.d$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f1611a;

        /* renamed from: b  reason: collision with root package name */
        private final int f1612b;

        /* renamed from: c  reason: collision with root package name */
        private final Object f1613c;

        public a(int i10, int i11, Object obj) {
            this.f1611a = i10;
            this.f1612b = i11;
            this.f1613c = obj;
            if (i10 < 0) {
                throw new IllegalArgumentException(("startIndex should be >= 0, but was " + i10).toString());
            } else if (i11 <= 0) {
                throw new IllegalArgumentException(("size should be >0, but was " + i11).toString());
            }
        }

        public final int a() {
            return this.f1612b;
        }

        public final int b() {
            return this.f1611a;
        }

        public final Object c() {
            return this.f1613c;
        }
    }

    void a(int i10, int i11, C6798l lVar);

    a get(int i10);

    int getSize();
}
