package V6;

import T5.k;
import W5.c;

public interface n extends x, c {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Object f34716a;

        /* renamed from: b  reason: collision with root package name */
        public final X5.a f34717b;

        /* renamed from: c  reason: collision with root package name */
        public int f34718c = 0;

        /* renamed from: d  reason: collision with root package name */
        public boolean f34719d = false;

        /* renamed from: e  reason: collision with root package name */
        public final b f34720e;

        /* renamed from: f  reason: collision with root package name */
        public int f34721f;

        /* renamed from: g  reason: collision with root package name */
        public int f34722g;

        private a(Object obj, X5.a aVar, b bVar, int i10) {
            this.f34716a = k.g(obj);
            this.f34717b = (X5.a) k.g(X5.a.t(aVar));
            this.f34720e = bVar;
            this.f34721f = 0;
            this.f34722g = i10;
        }

        public static a a(Object obj, X5.a aVar, int i10, b bVar) {
            return new a(obj, aVar, bVar, i10);
        }

        public static a b(Object obj, X5.a aVar, b bVar) {
            return a(obj, aVar, -1, bVar);
        }
    }

    public interface b {
        void a(Object obj, boolean z10);
    }

    X5.a e(Object obj);

    X5.a f(Object obj, X5.a aVar, b bVar);
}
