package e0;

import b0.C1868f;
import d0.C1900d;
import f0.c;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6556i;

/* renamed from: e0.b  reason: case insensitive filesystem */
public final class C1940b extends C6556i implements C1868f {

    /* renamed from: e  reason: collision with root package name */
    public static final a f19525e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f19526f = 8;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final C1940b f19527g;

    /* renamed from: b  reason: collision with root package name */
    private final Object f19528b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f19529c;

    /* renamed from: d  reason: collision with root package name */
    private final C1900d f19530d;

    /* renamed from: e0.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1868f a() {
            return C1940b.f19527g;
        }

        private a() {
        }
    }

    static {
        c cVar = c.f19592a;
        f19527g = new C1940b(cVar, cVar, C1900d.f19400d.a());
    }

    public C1940b(Object obj, Object obj2, C1900d dVar) {
        this.f19528b = obj;
        this.f19529c = obj2;
        this.f19530d = dVar;
    }

    public int a() {
        return this.f19530d.size();
    }

    public C1868f add(Object obj) {
        if (this.f19530d.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new C1940b(obj, obj, this.f19530d.u(obj, new C1939a()));
        }
        Object obj2 = this.f19529c;
        Object obj3 = this.f19530d.get(obj2);
        C6496s.e(obj3);
        return new C1940b(this.f19528b, obj, this.f19530d.u(obj2, ((C1939a) obj3).e(obj)).u(obj, new C1939a(obj2)));
    }

    public boolean contains(Object obj) {
        return this.f19530d.containsKey(obj);
    }

    public Iterator iterator() {
        return new C1941c(this.f19528b, this.f19530d);
    }

    public C1868f remove(Object obj) {
        Object obj2;
        Object obj3;
        C1939a aVar = (C1939a) this.f19530d.get(obj);
        if (aVar == null) {
            return this;
        }
        C1900d v10 = this.f19530d.v(obj);
        if (aVar.b()) {
            Object obj4 = v10.get(aVar.d());
            C6496s.e(obj4);
            v10 = v10.u(aVar.d(), ((C1939a) obj4).e(aVar.c()));
        }
        if (aVar.a()) {
            Object obj5 = v10.get(aVar.c());
            C6496s.e(obj5);
            v10 = v10.u(aVar.c(), ((C1939a) obj5).f(aVar.d()));
        }
        if (!aVar.b()) {
            obj2 = aVar.c();
        } else {
            obj2 = this.f19528b;
        }
        if (!aVar.a()) {
            obj3 = aVar.d();
        } else {
            obj3 = this.f19529c;
        }
        return new C1940b(obj2, obj3, v10);
    }
}
