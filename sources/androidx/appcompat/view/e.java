package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

public class e extends b implements e.a {

    /* renamed from: c  reason: collision with root package name */
    private Context f11150c;

    /* renamed from: d  reason: collision with root package name */
    private ActionBarContextView f11151d;

    /* renamed from: e  reason: collision with root package name */
    private b.a f11152e;

    /* renamed from: f  reason: collision with root package name */
    private WeakReference f11153f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f11154g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f11155h;

    /* renamed from: i  reason: collision with root package name */
    private androidx.appcompat.view.menu.e f11156i;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z10) {
        this.f11150c = context;
        this.f11151d = actionBarContextView;
        this.f11152e = aVar;
        androidx.appcompat.view.menu.e T10 = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).T(1);
        this.f11156i = T10;
        T10.S(this);
        this.f11155h = z10;
    }

    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.f11152e.c(this, menuItem);
    }

    public void b(androidx.appcompat.view.menu.e eVar) {
        k();
        this.f11151d.l();
    }

    public void c() {
        if (!this.f11154g) {
            this.f11154g = true;
            this.f11152e.a(this);
        }
    }

    public View d() {
        WeakReference weakReference = this.f11153f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public Menu e() {
        return this.f11156i;
    }

    public MenuInflater f() {
        return new g(this.f11151d.getContext());
    }

    public CharSequence g() {
        return this.f11151d.getSubtitle();
    }

    public CharSequence i() {
        return this.f11151d.getTitle();
    }

    public void k() {
        this.f11152e.d(this, this.f11156i);
    }

    public boolean l() {
        return this.f11151d.j();
    }

    public void m(View view) {
        WeakReference weakReference;
        this.f11151d.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.f11153f = weakReference;
    }

    public void n(int i10) {
        o(this.f11150c.getString(i10));
    }

    public void o(CharSequence charSequence) {
        this.f11151d.setSubtitle(charSequence);
    }

    public void q(int i10) {
        r(this.f11150c.getString(i10));
    }

    public void r(CharSequence charSequence) {
        this.f11151d.setTitle(charSequence);
    }

    public void s(boolean z10) {
        super.s(z10);
        this.f11151d.setTitleOptional(z10);
    }
}
