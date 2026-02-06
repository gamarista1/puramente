package kh;

import gh.C5978b;
import gh.C5986j;
import ih.f;
import jh.c;
import jh.d;
import jh.e;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class K implements C5978b {

    /* renamed from: a  reason: collision with root package name */
    private final C5978b f71609a;

    /* renamed from: b  reason: collision with root package name */
    private final C5978b f71610b;

    public /* synthetic */ K(C5978b bVar, C5978b bVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, bVar2);
    }

    /* access modifiers changed from: protected */
    public abstract Object a(Object obj);

    /* access modifiers changed from: protected */
    public final C5978b b() {
        return this.f71609a;
    }

    /* access modifiers changed from: protected */
    public abstract Object c(Object obj);

    /* access modifiers changed from: protected */
    public final C5978b d() {
        return this.f71610b;
    }

    public Object deserialize(e eVar) {
        Object obj;
        C6496s.h(eVar, "decoder");
        f descriptor = getDescriptor();
        c b10 = eVar.b(descriptor);
        if (b10.p()) {
            c cVar = b10;
            obj = e(c.a.c(cVar, getDescriptor(), 0, b(), (Object) null, 8, (Object) null), c.a.c(cVar, getDescriptor(), 1, d(), (Object) null, 8, (Object) null));
        } else {
            Object a10 = B0.f71586a;
            Object a11 = B0.f71586a;
            while (true) {
                int o10 = b10.o(getDescriptor());
                if (o10 != -1) {
                    if (o10 == 0) {
                        a10 = c.a.c(b10, getDescriptor(), 0, b(), (Object) null, 8, (Object) null);
                    } else if (o10 == 1) {
                        a11 = c.a.c(b10, getDescriptor(), 1, d(), (Object) null, 8, (Object) null);
                    } else {
                        throw new C5986j("Invalid index: " + o10);
                    }
                } else if (a10 == B0.f71586a) {
                    throw new C5986j("Element 'key' is missing");
                } else if (a11 != B0.f71586a) {
                    obj = e(a10, a11);
                } else {
                    throw new C5986j("Element 'value' is missing");
                }
            }
        }
        b10.c(descriptor);
        return obj;
    }

    /* access modifiers changed from: protected */
    public abstract Object e(Object obj, Object obj2);

    public void serialize(jh.f fVar, Object obj) {
        C6496s.h(fVar, "encoder");
        d b10 = fVar.b(getDescriptor());
        b10.B(getDescriptor(), 0, this.f71609a, a(obj));
        b10.B(getDescriptor(), 1, this.f71610b, c(obj));
        b10.c(getDescriptor());
    }

    private K(C5978b bVar, C5978b bVar2) {
        this.f71609a = bVar;
        this.f71610b = bVar2;
    }
}
