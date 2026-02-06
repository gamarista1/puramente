package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.C1790m;
import androidx.lifecycle.M;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class J implements C1798v {

    /* renamed from: i  reason: collision with root package name */
    public static final b f17107i = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final J f17108j = new J();

    /* renamed from: a  reason: collision with root package name */
    private int f17109a;

    /* renamed from: b  reason: collision with root package name */
    private int f17110b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f17111c = true;

    /* renamed from: d  reason: collision with root package name */
    private boolean f17112d = true;

    /* renamed from: e  reason: collision with root package name */
    private Handler f17113e;

    /* renamed from: f  reason: collision with root package name */
    private final C1800x f17114f = new C1800x(this);

    /* renamed from: g  reason: collision with root package name */
    private final Runnable f17115g = new I(this);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final M.a f17116h = new d(this);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f17117a = new a();

        private a() {
        }

        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            C6496s.h(activity, "activity");
            C6496s.h(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1798v a() {
            return J.f17108j;
        }

        public final void b(Context context) {
            C6496s.h(context, "context");
            J.f17108j.h(context);
        }

        private b() {
        }
    }

    public static final class c extends C1785h {
        final /* synthetic */ J this$0;

        public static final class a extends C1785h {
            final /* synthetic */ J this$0;

            a(J j10) {
                this.this$0 = j10;
            }

            public void onActivityPostResumed(Activity activity) {
                C6496s.h(activity, "activity");
                this.this$0.e();
            }

            public void onActivityPostStarted(Activity activity) {
                C6496s.h(activity, "activity");
                this.this$0.f();
            }
        }

        c(J j10) {
            this.this$0 = j10;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C6496s.h(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                M.f17152b.b(activity).e(this.this$0.f17116h);
            }
        }

        public void onActivityPaused(Activity activity) {
            C6496s.h(activity, "activity");
            this.this$0.d();
        }

        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            C6496s.h(activity, "activity");
            a.a(activity, new a(this.this$0));
        }

        public void onActivityStopped(Activity activity) {
            C6496s.h(activity, "activity");
            this.this$0.g();
        }
    }

    public static final class d implements M.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ J f17118a;

        d(J j10) {
            this.f17118a = j10;
        }

        public void onCreate() {
        }

        public void onResume() {
            this.f17118a.e();
        }

        public void onStart() {
            this.f17118a.f();
        }
    }

    private J() {
    }

    /* access modifiers changed from: private */
    public static final void i(J j10) {
        C6496s.h(j10, "this$0");
        j10.j();
        j10.k();
    }

    public static final C1798v l() {
        return f17107i.a();
    }

    public final void d() {
        int i10 = this.f17110b - 1;
        this.f17110b = i10;
        if (i10 == 0) {
            Handler handler = this.f17113e;
            C6496s.e(handler);
            handler.postDelayed(this.f17115g, 700);
        }
    }

    public final void e() {
        int i10 = this.f17110b + 1;
        this.f17110b = i10;
        if (i10 != 1) {
            return;
        }
        if (this.f17111c) {
            this.f17114f.i(C1790m.a.ON_RESUME);
            this.f17111c = false;
            return;
        }
        Handler handler = this.f17113e;
        C6496s.e(handler);
        handler.removeCallbacks(this.f17115g);
    }

    public final void f() {
        int i10 = this.f17109a + 1;
        this.f17109a = i10;
        if (i10 == 1 && this.f17112d) {
            this.f17114f.i(C1790m.a.ON_START);
            this.f17112d = false;
        }
    }

    public final void g() {
        this.f17109a--;
        k();
    }

    public C1790m getLifecycle() {
        return this.f17114f;
    }

    public final void h(Context context) {
        C6496s.h(context, "context");
        this.f17113e = new Handler();
        this.f17114f.i(C1790m.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        C6496s.f(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c(this));
    }

    public final void j() {
        if (this.f17110b == 0) {
            this.f17111c = true;
            this.f17114f.i(C1790m.a.ON_PAUSE);
        }
    }

    public final void k() {
        if (this.f17109a == 0 && this.f17111c) {
            this.f17114f.i(C1790m.a.ON_STOP);
            this.f17112d = true;
        }
    }
}
