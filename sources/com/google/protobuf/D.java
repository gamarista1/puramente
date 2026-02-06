package com.google.protobuf;

import com.google.protobuf.m0;

public class D {

    /* renamed from: a  reason: collision with root package name */
    private final a f58377a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f58378b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f58379c;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public final m0.b f58380a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f58381b;

        /* renamed from: c  reason: collision with root package name */
        public final m0.b f58382c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f58383d;

        public a(m0.b bVar, Object obj, m0.b bVar2, Object obj2) {
            this.f58380a = bVar;
            this.f58381b = obj;
            this.f58382c = bVar2;
            this.f58383d = obj2;
        }
    }

    private D(m0.b bVar, Object obj, m0.b bVar2, Object obj2) {
        this.f58377a = new a(bVar, obj, bVar2, obj2);
        this.f58378b = obj;
        this.f58379c = obj2;
    }

    static int b(a aVar, Object obj, Object obj2) {
        return C4877o.b(aVar.f58380a, 1, obj) + C4877o.b(aVar.f58382c, 2, obj2);
    }

    public static D d(m0.b bVar, Object obj, m0.b bVar2, Object obj2) {
        return new D(bVar, obj, bVar2, obj2);
    }

    static void e(C4870h hVar, a aVar, Object obj, Object obj2) {
        C4877o.u(hVar, aVar.f58380a, 1, obj);
        C4877o.u(hVar, aVar.f58382c, 2, obj2);
    }

    public int a(int i10, Object obj, Object obj2) {
        return C4870h.O(i10) + C4870h.z(b(this.f58377a, obj, obj2));
    }

    /* access modifiers changed from: package-private */
    public a c() {
        return this.f58377a;
    }
}
