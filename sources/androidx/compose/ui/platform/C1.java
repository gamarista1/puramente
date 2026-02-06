package androidx.compose.ui.platform;

import a0.C1538b;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public final class C1 {

    /* renamed from: a  reason: collision with root package name */
    private final C1538b f13498a = new C1538b(new Reference[16], 0);

    /* renamed from: b  reason: collision with root package name */
    private final ReferenceQueue f13499b = new ReferenceQueue();

    private final void a() {
        Reference poll;
        do {
            poll = this.f13499b.poll();
            if (poll != null) {
                this.f13498a.w(poll);
                continue;
            }
        } while (poll != null);
    }

    public final Object b() {
        a();
        while (this.f13498a.t()) {
            C1538b bVar = this.f13498a;
            Object obj = ((Reference) bVar.y(bVar.q() - 1)).get();
            if (obj != null) {
                return obj;
            }
        }
        return null;
    }

    public final void c(Object obj) {
        a();
        this.f13498a.b(new WeakReference(obj, this.f13499b));
    }
}
