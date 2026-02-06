package k4;

import Ug.C5582n;
import Ug.C5584o;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import k4.C3661c;
import kotlin.coroutines.jvm.internal.h;
import lf.C6514M;
import lf.v;
import qf.C6658d;
import rf.C6680b;
import yf.C6798l;

/* renamed from: k4.l  reason: case insensitive filesystem */
public interface C3670l extends C3668j {

    /* renamed from: k4.l$a */
    static final class a implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C3670l f45122a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewTreeObserver f45123b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f45124c;

        a(C3670l lVar, ViewTreeObserver viewTreeObserver, b bVar) {
            this.f45122a = lVar;
            this.f45123b = viewTreeObserver;
            this.f45124c = bVar;
        }

        public final void a(Throwable th2) {
            this.f45122a.m(this.f45123b, this.f45124c);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: k4.l$b */
    public static final class b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        private boolean f45125a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C3670l f45126b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewTreeObserver f45127c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5582n f45128d;

        b(C3670l lVar, ViewTreeObserver viewTreeObserver, C5582n nVar) {
            this.f45126b = lVar;
            this.f45127c = viewTreeObserver;
            this.f45128d = nVar;
        }

        public boolean onPreDraw() {
            C3667i j10 = this.f45126b.getSize();
            if (j10 != null) {
                this.f45126b.m(this.f45127c, this);
                if (!this.f45125a) {
                    this.f45125a = true;
                    this.f45128d.resumeWith(v.b(j10));
                }
            }
            return true;
        }
    }

    private C3661c d() {
        int i10;
        int i11;
        ViewGroup.LayoutParams layoutParams = a().getLayoutParams();
        if (layoutParams != null) {
            i10 = layoutParams.height;
        } else {
            i10 = -1;
        }
        int height = a().getHeight();
        if (n()) {
            i11 = a().getPaddingTop() + a().getPaddingBottom();
        } else {
            i11 = 0;
        }
        return k(i10, height, i11);
    }

    private C3661c e() {
        int i10;
        int i11;
        ViewGroup.LayoutParams layoutParams = a().getLayoutParams();
        if (layoutParams != null) {
            i10 = layoutParams.width;
        } else {
            i10 = -1;
        }
        int width = a().getWidth();
        if (n()) {
            i11 = a().getPaddingLeft() + a().getPaddingRight();
        } else {
            i11 = 0;
        }
        return k(i10, width, i11);
    }

    /* access modifiers changed from: private */
    C3667i getSize() {
        C3661c d10;
        C3661c e10 = e();
        if (e10 == null || (d10 = d()) == null) {
            return null;
        }
        return new C3667i(e10, d10);
    }

    static /* synthetic */ Object i(C3670l lVar, C6658d dVar) {
        C3667i size = lVar.getSize();
        if (size != null) {
            return size;
        }
        C5584o oVar = new C5584o(C6680b.c(dVar), 1);
        oVar.E();
        ViewTreeObserver viewTreeObserver = lVar.a().getViewTreeObserver();
        b bVar = new b(lVar, viewTreeObserver, oVar);
        viewTreeObserver.addOnPreDrawListener(bVar);
        oVar.s(new a(lVar, viewTreeObserver, bVar));
        Object v10 = oVar.v();
        if (v10 == C6680b.f()) {
            h.c(dVar);
        }
        return v10;
    }

    private C3661c k(int i10, int i11, int i12) {
        if (i10 == -2) {
            return C3661c.b.f45104a;
        }
        int i13 = i10 - i12;
        if (i13 > 0) {
            return C3659a.a(i13);
        }
        int i14 = i11 - i12;
        if (i14 > 0) {
            return C3659a.a(i14);
        }
        return null;
    }

    /* access modifiers changed from: private */
    void m(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        } else {
            a().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
    }

    View a();

    Object b(C6658d dVar) {
        return i(this, dVar);
    }

    boolean n();
}
