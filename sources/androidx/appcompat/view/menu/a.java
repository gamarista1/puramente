package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

public abstract class a implements j {

    /* renamed from: a  reason: collision with root package name */
    protected Context f11246a;

    /* renamed from: b  reason: collision with root package name */
    protected Context f11247b;

    /* renamed from: c  reason: collision with root package name */
    protected e f11248c;

    /* renamed from: d  reason: collision with root package name */
    protected LayoutInflater f11249d;

    /* renamed from: e  reason: collision with root package name */
    protected LayoutInflater f11250e;

    /* renamed from: f  reason: collision with root package name */
    private j.a f11251f;

    /* renamed from: g  reason: collision with root package name */
    private int f11252g;

    /* renamed from: h  reason: collision with root package name */
    private int f11253h;

    /* renamed from: i  reason: collision with root package name */
    protected k f11254i;

    /* renamed from: j  reason: collision with root package name */
    private int f11255j;

    public a(Context context, int i10, int i11) {
        this.f11246a = context;
        this.f11249d = LayoutInflater.from(context);
        this.f11252g = i10;
        this.f11253h = i11;
    }

    public void a(e eVar, boolean z10) {
        j.a aVar = this.f11251f;
        if (aVar != null) {
            aVar.a(eVar, z10);
        }
    }

    /* access modifiers changed from: protected */
    public void b(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f11254i).addView(view, i10);
    }

    public abstract void c(g gVar, k.a aVar);

    public boolean d(e eVar, g gVar) {
        return false;
    }

    public void e(j.a aVar) {
        this.f11251f = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean f(androidx.appcompat.view.menu.m r2) {
        /*
            r1 = this;
            androidx.appcompat.view.menu.j$a r0 = r1.f11251f
            if (r0 == 0) goto L_0x000e
            if (r2 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            androidx.appcompat.view.menu.e r2 = r1.f11248c
        L_0x0009:
            boolean r2 = r0.b(r2)
            return r2
        L_0x000e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.a.f(androidx.appcompat.view.menu.m):boolean");
    }

    public void g(boolean z10) {
        g gVar;
        ViewGroup viewGroup = (ViewGroup) this.f11254i;
        if (viewGroup != null) {
            e eVar = this.f11248c;
            int i10 = 0;
            if (eVar != null) {
                eVar.r();
                ArrayList E10 = this.f11248c.E();
                int size = E10.size();
                int i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    g gVar2 = (g) E10.get(i12);
                    if (q(i11, gVar2)) {
                        View childAt = viewGroup.getChildAt(i11);
                        if (childAt instanceof k.a) {
                            gVar = ((k.a) childAt).getItemData();
                        } else {
                            gVar = null;
                        }
                        View n10 = n(gVar2, childAt, viewGroup);
                        if (gVar2 != gVar) {
                            n10.setPressed(false);
                            n10.jumpDrawablesToCurrentState();
                        }
                        if (n10 != childAt) {
                            b(n10, i11);
                        }
                        i11++;
                    }
                }
                i10 = i11;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (!l(viewGroup, i10)) {
                    i10++;
                }
            }
        }
    }

    public boolean i(e eVar, g gVar) {
        return false;
    }

    public void j(Context context, e eVar) {
        this.f11247b = context;
        this.f11250e = LayoutInflater.from(context);
        this.f11248c = eVar;
    }

    public k.a k(ViewGroup viewGroup) {
        return (k.a) this.f11249d.inflate(this.f11253h, viewGroup, false);
    }

    /* access modifiers changed from: protected */
    public boolean l(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    public j.a m() {
        return this.f11251f;
    }

    public View n(g gVar, View view, ViewGroup viewGroup) {
        k.a aVar;
        if (view instanceof k.a) {
            aVar = (k.a) view;
        } else {
            aVar = k(viewGroup);
        }
        c(gVar, aVar);
        return (View) aVar;
    }

    public k o(ViewGroup viewGroup) {
        if (this.f11254i == null) {
            k kVar = (k) this.f11249d.inflate(this.f11252g, viewGroup, false);
            this.f11254i = kVar;
            kVar.a(this.f11248c);
            g(true);
        }
        return this.f11254i;
    }

    public void p(int i10) {
        this.f11255j = i10;
    }

    public abstract boolean q(int i10, g gVar);
}
