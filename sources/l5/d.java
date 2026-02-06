package l5;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bumptech.glide.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o5.k;

public abstract class d implements j {

    /* renamed from: f  reason: collision with root package name */
    private static final int f46106f = i.f39062a;

    /* renamed from: a  reason: collision with root package name */
    private final a f46107a;

    /* renamed from: b  reason: collision with root package name */
    protected final View f46108b;

    /* renamed from: c  reason: collision with root package name */
    private View.OnAttachStateChangeListener f46109c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f46110d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f46111e;

    static final class a {

        /* renamed from: e  reason: collision with root package name */
        static Integer f46112e;

        /* renamed from: a  reason: collision with root package name */
        private final View f46113a;

        /* renamed from: b  reason: collision with root package name */
        private final List f46114b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        boolean f46115c;

        /* renamed from: d  reason: collision with root package name */
        private C0692a f46116d;

        /* renamed from: l5.d$a$a  reason: collision with other inner class name */
        private static final class C0692a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a  reason: collision with root package name */
            private final WeakReference f46117a;

            C0692a(a aVar) {
                this.f46117a = new WeakReference(aVar);
            }

            public boolean onPreDraw() {
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = (a) this.f46117a.get();
                if (aVar == null) {
                    return true;
                }
                aVar.a();
                return true;
            }
        }

        a(View view) {
            this.f46113a = view;
        }

        private static int c(Context context) {
            if (f46112e == null) {
                Display defaultDisplay = ((WindowManager) k.d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f46112e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f46112e.intValue();
        }

        private int e(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            if (this.f46115c && this.f46113a.isLayoutRequested()) {
                return 0;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (this.f46113a.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            if (Log.isLoggable("CustomViewTarget", 4)) {
                Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.f46113a.getContext());
        }

        private int f() {
            int i10;
            int paddingTop = this.f46113a.getPaddingTop() + this.f46113a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f46113a.getLayoutParams();
            if (layoutParams != null) {
                i10 = layoutParams.height;
            } else {
                i10 = 0;
            }
            return e(this.f46113a.getHeight(), i10, paddingTop);
        }

        private int g() {
            int i10;
            int paddingLeft = this.f46113a.getPaddingLeft() + this.f46113a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f46113a.getLayoutParams();
            if (layoutParams != null) {
                i10 = layoutParams.width;
            } else {
                i10 = 0;
            }
            return e(this.f46113a.getWidth(), i10, paddingLeft);
        }

        private boolean h(int i10) {
            if (i10 > 0 || i10 == Integer.MIN_VALUE) {
                return true;
            }
            return false;
        }

        private boolean i(int i10, int i11) {
            if (!h(i10) || !h(i11)) {
                return false;
            }
            return true;
        }

        private void j(int i10, int i11) {
            Iterator it = new ArrayList(this.f46114b).iterator();
            while (it.hasNext()) {
                ((i) it.next()).d(i10, i11);
            }
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (!this.f46114b.isEmpty()) {
                int g10 = g();
                int f10 = f();
                if (i(g10, f10)) {
                    j(g10, f10);
                    b();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            ViewTreeObserver viewTreeObserver = this.f46113a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f46116d);
            }
            this.f46116d = null;
            this.f46114b.clear();
        }

        /* access modifiers changed from: package-private */
        public void d(i iVar) {
            int g10 = g();
            int f10 = f();
            if (i(g10, f10)) {
                iVar.d(g10, f10);
                return;
            }
            if (!this.f46114b.contains(iVar)) {
                this.f46114b.add(iVar);
            }
            if (this.f46116d == null) {
                ViewTreeObserver viewTreeObserver = this.f46113a.getViewTreeObserver();
                C0692a aVar = new C0692a(this);
                this.f46116d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        /* access modifiers changed from: package-private */
        public void k(i iVar) {
            this.f46114b.remove(iVar);
        }
    }

    public d(View view) {
        this.f46108b = (View) k.d(view);
        this.f46107a = new a(view);
    }

    private Object e() {
        return this.f46108b.getTag(f46106f);
    }

    private void j() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f46109c;
        if (onAttachStateChangeListener != null && !this.f46111e) {
            this.f46108b.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f46111e = true;
        }
    }

    private void k() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f46109c;
        if (onAttachStateChangeListener != null && this.f46111e) {
            this.f46108b.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f46111e = false;
        }
    }

    private void n(Object obj) {
        this.f46108b.setTag(f46106f, obj);
    }

    public final com.bumptech.glide.request.d a() {
        Object e10 = e();
        if (e10 == null) {
            return null;
        }
        if (e10 instanceof com.bumptech.glide.request.d) {
            return (com.bumptech.glide.request.d) e10;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    public final void b(i iVar) {
        this.f46107a.k(iVar);
    }

    public final void c(Drawable drawable) {
        j();
        m(drawable);
    }

    public final void d(Drawable drawable) {
        this.f46107a.b();
        l(drawable);
        if (!this.f46110d) {
            k();
        }
    }

    public final void f(com.bumptech.glide.request.d dVar) {
        n(dVar);
    }

    public final void i(i iVar) {
        this.f46107a.d(iVar);
    }

    /* access modifiers changed from: protected */
    public abstract void l(Drawable drawable);

    public String toString() {
        return "Target for: " + this.f46108b;
    }

    public void onDestroy() {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    /* access modifiers changed from: protected */
    public void m(Drawable drawable) {
    }
}
