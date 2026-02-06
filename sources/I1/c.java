package I1;

import kotlin.jvm.internal.DefaultConstructorMarker;

final class c extends n {

    /* renamed from: a  reason: collision with root package name */
    private final Object f2681a;

    /* renamed from: b  reason: collision with root package name */
    private final int f2682b;

    public c(Object obj, int i10) {
        super((DefaultConstructorMarker) null);
        this.f2681a = obj;
        this.f2682b = i10;
    }

    public final void a() {
        int i10;
        Object obj = this.f2681a;
        boolean z10 = false;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        if (i10 == this.f2682b) {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    public final Object b() {
        return this.f2681a;
    }
}
