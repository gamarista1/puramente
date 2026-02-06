package d4;

import X3.g;
import a4.C3114g;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import d4.C3472i;
import j4.C3627n;
import o4.l;
import o4.t;
import qf.C6658d;

/* renamed from: d4.f  reason: case insensitive filesystem */
public final class C3469f implements C3472i {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f43104a;

    /* renamed from: b  reason: collision with root package name */
    private final C3627n f43105b;

    /* renamed from: d4.f$a */
    public static final class a implements C3472i.a {
        /* renamed from: b */
        public C3472i a(Drawable drawable, C3627n nVar, g gVar) {
            return new C3469f(drawable, nVar);
        }
    }

    public C3469f(Drawable drawable, C3627n nVar) {
        this.f43104a = drawable;
        this.f43105b = nVar;
    }

    public Object a(C6658d dVar) {
        Drawable drawable;
        boolean u10 = l.u(this.f43104a);
        if (u10) {
            drawable = new BitmapDrawable(this.f43105b.g().getResources(), t.f47014a.a(this.f43104a, this.f43105b.f(), this.f43105b.o(), this.f43105b.n(), this.f43105b.c()));
        } else {
            drawable = this.f43104a;
        }
        return new C3470g(drawable, u10, C3114g.MEMORY);
    }
}
