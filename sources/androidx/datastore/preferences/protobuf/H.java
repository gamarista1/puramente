package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.r0;

public class H {

    /* renamed from: a  reason: collision with root package name */
    private final a f16271a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f16272b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f16273c;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public final r0.b f16274a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f16275b;

        /* renamed from: c  reason: collision with root package name */
        public final r0.b f16276c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f16277d;

        public a(r0.b bVar, Object obj, r0.b bVar2, Object obj2) {
            this.f16274a = bVar;
            this.f16275b = obj;
            this.f16276c = bVar2;
            this.f16277d = obj2;
        }
    }

    private H(r0.b bVar, Object obj, r0.b bVar2, Object obj2) {
        this.f16271a = new a(bVar, obj, bVar2, obj2);
        this.f16272b = obj;
        this.f16273c = obj2;
    }

    static int b(a aVar, Object obj, Object obj2) {
        return C1745s.b(aVar.f16274a, 1, obj) + C1745s.b(aVar.f16276c, 2, obj2);
    }

    public static H d(r0.b bVar, Object obj, r0.b bVar2, Object obj2) {
        return new H(bVar, obj, bVar2, obj2);
    }

    static void e(C1737j jVar, a aVar, Object obj, Object obj2) {
        C1745s.u(jVar, aVar.f16274a, 1, obj);
        C1745s.u(jVar, aVar.f16276c, 2, obj2);
    }

    public int a(int i10, Object obj, Object obj2) {
        return C1737j.P(i10) + C1737j.y(b(this.f16271a, obj, obj2));
    }

    /* access modifiers changed from: package-private */
    public a c() {
        return this.f16271a;
    }
}
