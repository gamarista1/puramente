package J5;

import F5.h;
import J5.j;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t7.C4049a;
import x5.C4168d;

public final class g implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d  reason: collision with root package name */
    public static final a f32183d = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    private static final Map f32184e = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference f32185a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f32186b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f32187c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Activity activity) {
            C6496s.h(activity, "activity");
            int hashCode = activity.hashCode();
            Map b10 = g.b();
            Integer valueOf = Integer.valueOf(hashCode);
            Object obj = b10.get(valueOf);
            if (obj == null) {
                obj = new g(activity, (DefaultConstructorMarker) null);
                b10.put(valueOf, obj);
            }
            g.c((g) obj);
        }

        public final void b(Activity activity) {
            C6496s.h(activity, "activity");
            g gVar = (g) g.b().remove(Integer.valueOf(activity.hashCode()));
            if (gVar != null) {
                g.d(gVar);
            }
        }

        private a() {
        }
    }

    public /* synthetic */ g(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    public static final /* synthetic */ Map b() {
        Class<g> cls = g.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return f32184e;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final /* synthetic */ void c(g gVar) {
        Class<g> cls = g.class;
        if (!C4049a.d(cls)) {
            try {
                gVar.g();
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final /* synthetic */ void d(g gVar) {
        Class<g> cls = g.class;
        if (!C4049a.d(cls)) {
            try {
                gVar.h();
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    private final void e() {
        if (!C4049a.d(this)) {
            try {
                f fVar = new f(this);
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    fVar.run();
                } else {
                    this.f32186b.post(fVar);
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void f(g gVar) {
        Class<g> cls = g.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(gVar, "this$0");
                try {
                    View d10 = h.d((Activity) gVar.f32185a.get());
                    Activity activity = (Activity) gVar.f32185a.get();
                    if (d10 == null) {
                        return;
                    }
                    if (activity != null) {
                        for (View view : c.a(d10)) {
                            if (!C4168d.g(view)) {
                                String d11 = c.d(view);
                                if (d11.length() > 0 && d11.length() <= 300) {
                                    j.a aVar = j.f32194e;
                                    String localClassName = activity.getLocalClassName();
                                    C6496s.g(localClassName, "activity.localClassName");
                                    aVar.d(view, d10, localClassName);
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    private final void g() {
        View d10;
        if (!C4049a.d(this)) {
            try {
                if (!this.f32187c.getAndSet(true) && (d10 = h.d((Activity) this.f32185a.get())) != null) {
                    ViewTreeObserver viewTreeObserver = d10.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(this);
                        e();
                    }
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    private final void h() {
        View d10;
        if (!C4049a.d(this)) {
            try {
                if (this.f32187c.getAndSet(false) && (d10 = h.d((Activity) this.f32185a.get())) != null) {
                    ViewTreeObserver viewTreeObserver = d10.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnGlobalLayoutListener(this);
                    }
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public void onGlobalLayout() {
        if (!C4049a.d(this)) {
            try {
                e();
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    private g(Activity activity) {
        this.f32185a = new WeakReference(activity);
        this.f32186b = new Handler(Looper.getMainLooper());
        this.f32187c = new AtomicBoolean(false);
    }
}
