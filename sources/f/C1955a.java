package f;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.C6496s;

/* renamed from: f.a  reason: case insensitive filesystem */
public final class C1955a {

    /* renamed from: a  reason: collision with root package name */
    private final Set f19589a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    private volatile Context f19590b;

    public final void a(C1956b bVar) {
        C6496s.h(bVar, "listener");
        Context context = this.f19590b;
        if (context != null) {
            bVar.a(context);
        }
        this.f19589a.add(bVar);
    }

    public final void b() {
        this.f19590b = null;
    }

    public final void c(Context context) {
        C6496s.h(context, "context");
        this.f19590b = context;
        for (C1956b a10 : this.f19589a) {
            a10.a(context);
        }
    }

    public final Context d() {
        return this.f19590b;
    }

    public final void e(C1956b bVar) {
        C6496s.h(bVar, "listener");
        this.f19589a.remove(bVar);
    }
}
