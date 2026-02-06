package O3;

import M3.a;
import R3.b;
import android.content.Context;
import androidx.work.s;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    private final b f4740a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f4741b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f4742c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final LinkedHashSet f4743d = new LinkedHashSet();

    /* renamed from: e  reason: collision with root package name */
    private Object f4744e;

    protected h(Context context, b bVar) {
        C6496s.h(context, "context");
        C6496s.h(bVar, "taskExecutor");
        this.f4740a = bVar;
        Context applicationContext = context.getApplicationContext();
        C6496s.g(applicationContext, "context.applicationContext");
        this.f4741b = applicationContext;
    }

    /* access modifiers changed from: private */
    public static final void b(List list, h hVar) {
        C6496s.h(list, "$listenersList");
        C6496s.h(hVar, "this$0");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(hVar.f4744e);
        }
    }

    public final void c(a aVar) {
        C6496s.h(aVar, "listener");
        synchronized (this.f4742c) {
            try {
                if (this.f4743d.add(aVar)) {
                    if (this.f4743d.size() == 1) {
                        this.f4744e = e();
                        s e10 = s.e();
                        String a10 = i.f4745a;
                        e10.a(a10, getClass().getSimpleName() + ": initial state = " + this.f4744e);
                        h();
                    }
                    aVar.a(this.f4744e);
                }
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final Context d() {
        return this.f4741b;
    }

    public abstract Object e();

    public final void f(a aVar) {
        C6496s.h(aVar, "listener");
        synchronized (this.f4742c) {
            try {
                if (this.f4743d.remove(aVar) && this.f4743d.isEmpty()) {
                    i();
                }
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g(Object obj) {
        synchronized (this.f4742c) {
            Object obj2 = this.f4744e;
            if (obj2 == null || !C6496s.c(obj2, obj)) {
                this.f4744e = obj;
                this.f4740a.a().execute(new g(C6565s.e1(this.f4743d), this));
                C6514M m10 = C6514M.f71813a;
            }
        }
    }

    public abstract void h();

    public abstract void i();
}
