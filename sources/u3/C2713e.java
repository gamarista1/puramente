package u3;

import kotlin.jvm.internal.C6496s;
import y3.h;

/* renamed from: u3.e  reason: case insensitive filesystem */
public final class C2713e implements h.c {

    /* renamed from: a  reason: collision with root package name */
    private final h.c f26633a;

    /* renamed from: b  reason: collision with root package name */
    private final C2711c f26634b;

    public C2713e(h.c cVar, C2711c cVar2) {
        C6496s.h(cVar, "delegate");
        C6496s.h(cVar2, "autoCloser");
        this.f26633a = cVar;
        this.f26634b = cVar2;
    }

    /* renamed from: b */
    public C2712d a(h.b bVar) {
        C6496s.h(bVar, "configuration");
        return new C2712d(this.f26633a.a(bVar), this.f26634b);
    }
}
