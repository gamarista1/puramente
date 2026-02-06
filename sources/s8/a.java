package S8;

import S8.e;
import Y.C1510r0;
import Y.o1;
import android.app.Activity;
import android.content.Context;
import g.C2000c;
import kotlin.jvm.internal.C6496s;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f33935a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f33936b;

    /* renamed from: c  reason: collision with root package name */
    private final Activity f33937c;

    /* renamed from: d  reason: collision with root package name */
    private final C1510r0 f33938d = u1.d(b(), (o1) null, 2, (Object) null);

    /* renamed from: e  reason: collision with root package name */
    private C2000c f33939e;

    public a(String str, Context context, Activity activity) {
        C6496s.h(str, "permission");
        C6496s.h(context, "context");
        C6496s.h(activity, "activity");
        this.f33935a = str;
        this.f33936b = context;
        this.f33937c = activity;
    }

    private final e b() {
        if (g.d(this.f33936b, a())) {
            return e.b.f33948a;
        }
        return new e.a(g.g(this.f33937c, a()));
    }

    public String a() {
        return this.f33935a;
    }

    public final void c() {
        e(b());
    }

    public final void d(C2000c cVar) {
        this.f33939e = cVar;
    }

    public void e(e eVar) {
        C6496s.h(eVar, "<set-?>");
        this.f33938d.setValue(eVar);
    }

    public e getStatus() {
        return (e) this.f33938d.getValue();
    }
}
