package w5;

import F5.h;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.facebook.I;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C6496s;
import t5.C4039p;
import t7.C4049a;
import x5.C4165a;
import x5.C4170f;

/* renamed from: w5.b  reason: case insensitive filesystem */
public final class C4130b {

    /* renamed from: a  reason: collision with root package name */
    public static final C4130b f49147a = new C4130b();

    /* renamed from: w5.b$a */
    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private C4165a f49148a;

        /* renamed from: b  reason: collision with root package name */
        private WeakReference f49149b;

        /* renamed from: c  reason: collision with root package name */
        private WeakReference f49150c;

        /* renamed from: d  reason: collision with root package name */
        private View.OnClickListener f49151d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f49152e = true;

        public a(C4165a aVar, View view, View view2) {
            C6496s.h(aVar, "mapping");
            C6496s.h(view, "rootView");
            C6496s.h(view2, "hostView");
            this.f49148a = aVar;
            this.f49149b = new WeakReference(view2);
            this.f49150c = new WeakReference(view);
            this.f49151d = C4170f.g(view2);
        }

        public final boolean a() {
            return this.f49152e;
        }

        public void onClick(View view) {
            if (!C4049a.d(this)) {
                try {
                    C6496s.h(view, "view");
                    View.OnClickListener onClickListener = this.f49151d;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                    View view2 = (View) this.f49150c.get();
                    View view3 = (View) this.f49149b.get();
                    if (view2 != null && view3 != null) {
                        C4165a aVar = this.f49148a;
                        C6496s.f(aVar, "null cannot be cast to non-null type com.facebook.appevents.codeless.internal.EventBinding");
                        C4130b.d(aVar, view2, view3);
                    }
                } catch (Throwable th2) {
                    C4049a.b(th2, this);
                }
            }
        }
    }

    /* renamed from: w5.b$b  reason: collision with other inner class name */
    public static final class C0746b implements AdapterView.OnItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        private C4165a f49153a;

        /* renamed from: b  reason: collision with root package name */
        private WeakReference f49154b;

        /* renamed from: c  reason: collision with root package name */
        private WeakReference f49155c;

        /* renamed from: d  reason: collision with root package name */
        private AdapterView.OnItemClickListener f49156d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f49157e = true;

        public C0746b(C4165a aVar, View view, AdapterView adapterView) {
            C6496s.h(aVar, "mapping");
            C6496s.h(view, "rootView");
            C6496s.h(adapterView, "hostView");
            this.f49153a = aVar;
            this.f49154b = new WeakReference(adapterView);
            this.f49155c = new WeakReference(view);
            this.f49156d = adapterView.getOnItemClickListener();
        }

        public final boolean a() {
            return this.f49157e;
        }

        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            C6496s.h(view, "view");
            AdapterView.OnItemClickListener onItemClickListener = this.f49156d;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i10, j10);
            }
            View view2 = (View) this.f49155c.get();
            AdapterView adapterView2 = (AdapterView) this.f49154b.get();
            if (view2 != null && adapterView2 != null) {
                C4130b.d(this.f49153a, view2, adapterView2);
            }
        }
    }

    private C4130b() {
    }

    public static final a b(C4165a aVar, View view, View view2) {
        Class<C4130b> cls = C4130b.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(aVar, "mapping");
            C6496s.h(view, "rootView");
            C6496s.h(view2, "hostView");
            return new a(aVar, view, view2);
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final C0746b c(C4165a aVar, View view, AdapterView adapterView) {
        Class<C4130b> cls = C4130b.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(aVar, "mapping");
            C6496s.h(view, "rootView");
            C6496s.h(adapterView, "hostView");
            return new C0746b(aVar, view, adapterView);
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final void d(C4165a aVar, View view, View view2) {
        Class<C4130b> cls = C4130b.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(aVar, "mapping");
                C6496s.h(view, "rootView");
                C6496s.h(view2, "hostView");
                String b10 = aVar.b();
                Bundle b11 = C4135g.f49170f.b(aVar, view, view2);
                f49147a.f(b11);
                I.t().execute(new C4129a(b10, b11));
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void e(String str, Bundle bundle) {
        Class<C4130b> cls = C4130b.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(str, "$eventName");
                C6496s.h(bundle, "$parameters");
                C4039p.f48255b.g(I.l()).f(str, bundle);
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public final void f(Bundle bundle) {
        if (!C4049a.d(this)) {
            try {
                C6496s.h(bundle, "parameters");
                String string = bundle.getString("_valueToSum");
                if (string != null) {
                    bundle.putDouble("_valueToSum", h.f(string));
                }
                bundle.putString("_is_fb_codeless", "1");
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }
}
