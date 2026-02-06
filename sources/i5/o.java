package i5;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.collection.C1587a;
import androidx.fragment.app.C1769q;
import androidx.fragment.app.C1773v;
import androidx.fragment.app.J;
import c5.x;
import com.bumptech.glide.c;
import com.bumptech.glide.m;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import o5.k;
import o5.l;

public class o implements Handler.Callback {

    /* renamed from: f  reason: collision with root package name */
    private static final b f44216f = new a();

    /* renamed from: a  reason: collision with root package name */
    private volatile m f44217a;

    /* renamed from: b  reason: collision with root package name */
    private final b f44218b;

    /* renamed from: c  reason: collision with root package name */
    private final C1587a f44219c = new C1587a();

    /* renamed from: d  reason: collision with root package name */
    private final i f44220d;

    /* renamed from: e  reason: collision with root package name */
    private final m f44221e;

    class a implements b {
        a() {
        }

        public m a(c cVar, j jVar, p pVar, Context context) {
            return new m(cVar, jVar, pVar, context);
        }
    }

    public interface b {
        m a(c cVar, j jVar, p pVar, Context context);
    }

    public o(b bVar) {
        bVar = bVar == null ? f44216f : bVar;
        this.f44218b = bVar;
        this.f44221e = new m(bVar);
        this.f44220d = b();
    }

    private static void a(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static i b() {
        if (!x.f36502f || !x.f36501e) {
            return new f();
        }
        return new h();
    }

    private static Activity c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private static void d(Collection collection, Map map) {
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                C1769q qVar = (C1769q) it.next();
                if (!(qVar == null || qVar.getView() == null)) {
                    map.put(qVar.getView(), qVar);
                    d(qVar.getChildFragmentManager().x0(), map);
                }
            }
        }
    }

    private C1769q e(View view, C1773v vVar) {
        this.f44219c.clear();
        d(vVar.getSupportFragmentManager().x0(), this.f44219c);
        View findViewById = vVar.findViewById(16908290);
        C1769q qVar = null;
        while (!view.equals(findViewById) && (qVar = (C1769q) this.f44219c.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f44219c.clear();
        return qVar;
    }

    private m j(Context context) {
        if (this.f44217a == null) {
            synchronized (this) {
                try {
                    if (this.f44217a == null) {
                        this.f44217a = this.f44218b.a(c.e(context.getApplicationContext()), new C3590a(), new g(), context.getApplicationContext());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f44217a;
    }

    private static boolean k(Context context) {
        Activity c10 = c(context);
        if (c10 == null || !c10.isFinishing()) {
            return true;
        }
        return false;
    }

    public m f(Context context) {
        if (context != null) {
            if (l.s() && !(context instanceof Application)) {
                if (context instanceof C1773v) {
                    return i((C1773v) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return f(contextWrapper.getBaseContext());
                    }
                }
            }
            return j(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public m g(View view) {
        if (l.r()) {
            return f(view.getContext().getApplicationContext());
        }
        k.d(view);
        k.e(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity c10 = c(view.getContext());
        if (c10 == null) {
            return f(view.getContext().getApplicationContext());
        }
        if (!(c10 instanceof C1773v)) {
            return f(view.getContext().getApplicationContext());
        }
        C1773v vVar = (C1773v) c10;
        C1769q e10 = e(view, vVar);
        if (e10 != null) {
            return h(e10);
        }
        return i(vVar);
    }

    public m h(C1769q qVar) {
        k.e(qVar.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (l.r()) {
            return f(qVar.getContext().getApplicationContext());
        }
        if (qVar.getActivity() != null) {
            this.f44220d.a(qVar.getActivity());
        }
        J childFragmentManager = qVar.getChildFragmentManager();
        Context context = qVar.getContext();
        return this.f44221e.b(context, c.e(context.getApplicationContext()), qVar.getLifecycle(), childFragmentManager, qVar.isVisible());
    }

    public boolean handleMessage(Message message) {
        return false;
    }

    public m i(C1773v vVar) {
        if (l.r()) {
            return f(vVar.getApplicationContext());
        }
        a(vVar);
        this.f44220d.a(vVar);
        boolean k10 = k(vVar);
        return this.f44221e.b(vVar, c.e(vVar.getApplicationContext()), vVar.getLifecycle(), vVar.getSupportFragmentManager(), k10);
    }
}
