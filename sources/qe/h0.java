package qe;

import ae.C4464a;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class h0 extends C5173u {

    /* renamed from: a  reason: collision with root package name */
    private final Object f61442a;

    /* renamed from: b  reason: collision with root package name */
    private final Y f61443b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference f61444c;

    /* renamed from: d  reason: collision with root package name */
    private Object f61445d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h0(Object obj, Y y10, C4464a aVar) {
        super((DefaultConstructorMarker) null);
        C6496s.h(obj, "unconvertedValue");
        C6496s.h(y10, "typeConverter");
        this.f61442a = obj;
        this.f61443b = y10;
        this.f61444c = new WeakReference(aVar);
    }

    public final Object a() {
        if (this.f61445d == null) {
            this.f61445d = this.f61443b.a(this.f61442a, (C4464a) this.f61444c.get());
        }
        Object obj = this.f61445d;
        C6496s.e(obj);
        return obj;
    }
}
