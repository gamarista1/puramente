package w;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: w.Q  reason: case insensitive filesystem */
public abstract class C2773Q {

    /* renamed from: a  reason: collision with root package name */
    private final Object f27240a;

    /* renamed from: b  reason: collision with root package name */
    private C2760D f27241b;

    public /* synthetic */ C2773Q(Object obj, C2760D d10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, d10);
    }

    public final C2760D a() {
        return this.f27241b;
    }

    public final Object b() {
        return this.f27240a;
    }

    public final void c(C2760D d10) {
        this.f27241b = d10;
    }

    private C2773Q(Object obj, C2760D d10) {
        this.f27240a = obj;
        this.f27241b = d10;
    }
}
