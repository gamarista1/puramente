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
import com.bumptech.glide.request.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class k extends C3739a {

    /* renamed from: f  reason: collision with root package name */
    private static boolean f46121f;

    /* renamed from: g  reason: collision with root package name */
    private static int f46122g = i.f39062a;

    /* renamed from: a  reason: collision with root package name */
    protected final View f46123a;

    /* renamed from: b  reason: collision with root package name */
    private final a f46124b;

    /* renamed from: c  reason: collision with root package name */
    private View.OnAttachStateChangeListener f46125c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f46126d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f46127e;

    static final class a {

        /* renamed from: e  reason: collision with root package name */
        static Integer f46128e;

        /* renamed from: a  reason: collision with root package name */
        private final View f46129a;

        /* renamed from: b  reason: collision with root package name */
        private final List f46130b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        boolean f46131c;

        /* renamed from: d  reason: collision with root package name */
        private C0693a f46132d;

        /* renamed from: l5.k$a$a  reason: collision with other inner class name */
        private static final class C0693a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a  reason: collision with root package name */
            private final WeakReference f46133a;

            C0693a(a aVar) {
                this.f46133a = new WeakReference(aVar);
            }

            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = (a) this.f46133a.get();
                if (aVar == null) {
                    return true;
                }
                aVar.a();
                return true;
            }
        }

        a(View view) {
            this.f46129a = view;
        }

        private static int c(Context context) {
            if (f46128e == null) {
                Display defaultDisplay = ((WindowManager) o5.k.d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f46128e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f46128e.intValue();
        }

        private int e(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            if (this.f46131c && this.f46129a.isLayoutRequested()) {
                return 0;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (this.f46129a.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.f46129a.getContext());
        }

        private int f() {
            int i10;
            int paddingTop = this.f46129a.getPaddingTop() + this.f46129a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f46129a.getLayoutParams();
            if (layoutParams != null) {
                i10 = layoutParams.height;
            } else {
                i10 = 0;
            }
            return e(this.f46129a.getHeight(), i10, paddingTop);
        }

        private int g() {
            int i10;
            int paddingLeft = this.f46129a.getPaddingLeft() + this.f46129a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f46129a.getLayoutParams();
            if (layoutParams != null) {
                i10 = layoutParams.width;
            } else {
                i10 = 0;
            }
            return e(this.f46129a.getWidth(), i10, paddingLeft);
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
            Iterator it = new ArrayList(this.f46130b).iterator();
            while (it.hasNext()) {
                ((i) it.next()).d(i10, i11);
            }
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (!this.f46130b.isEmpty()) {
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
            ViewTreeObserver viewTreeObserver = this.f46129a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f46132d);
            }
            this.f46132d = null;
            this.f46130b.clear();
        }

        /* access modifiers changed from: package-private */
        public void d(i iVar) {
            int g10 = g();
            int f10 = f();
            if (i(g10, f10)) {
                iVar.d(g10, f10);
                return;
            }
            if (!this.f46130b.contains(iVar)) {
                this.f46130b.add(iVar);
            }
            if (this.f46132d == null) {
                ViewTreeObserver viewTreeObserver = this.f46129a.getViewTreeObserver();
                C0693a aVar = new C0693a(this);
                this.f46132d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        /* access modifiers changed from: package-private */
        public void k(i iVar) {
            this.f46130b.remove(iVar);
        }
    }

    public k(View view) {
        this.f46123a = (View) o5.k.d(view);
        this.f46124b = new a(view);
    }

    private Object e() {
        return this.f46123a.getTag(f46122g);
    }

    private void k() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f46125c;
        if (onAttachStateChangeListener != null && !this.f46127e) {
            this.f46123a.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f46127e = true;
        }
    }

    private void l() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f46125c;
        if (onAttachStateChangeListener != null && this.f46127e) {
            this.f46123a.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f46127e = false;
        }
    }

    private void m(Object obj) {
        f46121f = true;
        this.f46123a.setTag(f46122g, obj);
    }

    public d a() {
        Object e10 = e();
        if (e10 == null) {
            return null;
        }
        if (e10 instanceof d) {
            return (d) e10;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public void b(i iVar) {
        this.f46124b.k(iVar);
    }

    public void c(Drawable drawable) {
        super.c(drawable);
        k();
    }

    public void d(Drawable drawable) {
        super.d(drawable);
        this.f46124b.b();
        if (!this.f46126d) {
            l();
        }
    }

    public void f(d dVar) {
        m(dVar);
    }

    public void i(i iVar) {
        this.f46124b.d(iVar);
    }

    public View j() {
        return this.f46123a;
    }

    public String toString() {
        return "Target for: " + this.f46123a;
    }
}
