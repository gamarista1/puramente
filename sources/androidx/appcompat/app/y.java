package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.i;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.I;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.k0;
import androidx.core.view.C1680b0;
import java.util.ArrayList;
import x1.g;

class y extends C1560a {

    /* renamed from: a  reason: collision with root package name */
    final I f11122a;

    /* renamed from: b  reason: collision with root package name */
    final Window.Callback f11123b;

    /* renamed from: c  reason: collision with root package name */
    final i.g f11124c;

    /* renamed from: d  reason: collision with root package name */
    boolean f11125d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f11126e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11127f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList f11128g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final Runnable f11129h = new a();

    /* renamed from: i  reason: collision with root package name */
    private final Toolbar.h f11130i;

    class a implements Runnable {
        a() {
        }

        public void run() {
            y.this.z();
        }
    }

    class b implements Toolbar.h {
        b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return y.this.f11123b.onMenuItemSelected(0, menuItem);
        }
    }

    private final class c implements j.a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f11133a;

        c() {
        }

        public void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (!this.f11133a) {
                this.f11133a = true;
                y.this.f11122a.q();
                y.this.f11123b.onPanelClosed(108, eVar);
                this.f11133a = false;
            }
        }

        public boolean b(androidx.appcompat.view.menu.e eVar) {
            y.this.f11123b.onMenuOpened(108, eVar);
            return true;
        }
    }

    private final class d implements e.a {
        d() {
        }

        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            return false;
        }

        public void b(androidx.appcompat.view.menu.e eVar) {
            if (y.this.f11122a.e()) {
                y.this.f11123b.onPanelClosed(108, eVar);
            } else if (y.this.f11123b.onPreparePanel(0, (View) null, eVar)) {
                y.this.f11123b.onMenuOpened(108, eVar);
            }
        }
    }

    private class e implements i.g {
        e() {
        }

        public boolean a(int i10) {
            if (i10 != 0) {
                return false;
            }
            y yVar = y.this;
            if (yVar.f11125d) {
                return false;
            }
            yVar.f11122a.f();
            y.this.f11125d = true;
            return false;
        }

        public View onCreatePanelView(int i10) {
            if (i10 == 0) {
                return new View(y.this.f11122a.getContext());
            }
            return null;
        }
    }

    y(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f11130i = bVar;
        g.f(toolbar);
        k0 k0Var = new k0(toolbar, false);
        this.f11122a = k0Var;
        this.f11123b = (Window.Callback) g.f(callback);
        k0Var.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        k0Var.setWindowTitle(charSequence);
        this.f11124c = new e();
    }

    private Menu y() {
        if (!this.f11126e) {
            this.f11122a.t(new c(), new d());
            this.f11126e = true;
        }
        return this.f11122a.j();
    }

    public void A(int i10, int i11) {
        this.f11122a.i((i10 & i11) | ((~i11) & this.f11122a.v()));
    }

    public boolean g() {
        return this.f11122a.b();
    }

    public boolean h() {
        if (!this.f11122a.h()) {
            return false;
        }
        this.f11122a.collapseActionView();
        return true;
    }

    public void i(boolean z10) {
        if (z10 != this.f11127f) {
            this.f11127f = z10;
            if (this.f11128g.size() > 0) {
                android.support.v4.media.session.c.a(this.f11128g.get(0));
                throw null;
            }
        }
    }

    public int j() {
        return this.f11122a.v();
    }

    public Context k() {
        return this.f11122a.getContext();
    }

    public boolean l() {
        this.f11122a.m().removeCallbacks(this.f11129h);
        C1680b0.g0(this.f11122a.m(), this.f11129h);
        return true;
    }

    public void m(Configuration configuration) {
        super.m(configuration);
    }

    /* access modifiers changed from: package-private */
    public void n() {
        this.f11122a.m().removeCallbacks(this.f11129h);
    }

    public boolean o(int i10, KeyEvent keyEvent) {
        int i11;
        Menu y10 = y();
        if (y10 == null) {
            return false;
        }
        if (keyEvent != null) {
            i11 = keyEvent.getDeviceId();
        } else {
            i11 = -1;
        }
        boolean z10 = true;
        if (KeyCharacterMap.load(i11).getKeyboardType() == 1) {
            z10 = false;
        }
        y10.setQwertyMode(z10);
        return y10.performShortcut(i10, keyEvent, 0);
    }

    public boolean p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            q();
        }
        return true;
    }

    public boolean q() {
        return this.f11122a.c();
    }

    public void r(boolean z10) {
    }

    public void s(boolean z10) {
        int i10;
        if (z10) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        A(i10, 4);
    }

    public void t(Drawable drawable) {
        this.f11122a.x(drawable);
    }

    public void u(boolean z10) {
    }

    public void v(CharSequence charSequence) {
        this.f11122a.setTitle(charSequence);
    }

    public void w(CharSequence charSequence) {
        this.f11122a.setWindowTitle(charSequence);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void z() {
        /*
            r5 = this;
            android.view.Menu r0 = r5.y()
            boolean r1 = r0 instanceof androidx.appcompat.view.menu.e
            r2 = 0
            if (r1 == 0) goto L_0x000d
            r1 = r0
            androidx.appcompat.view.menu.e r1 = (androidx.appcompat.view.menu.e) r1
            goto L_0x000e
        L_0x000d:
            r1 = r2
        L_0x000e:
            if (r1 == 0) goto L_0x0013
            r1.e0()
        L_0x0013:
            r0.clear()     // Catch:{ all -> 0x0028 }
            android.view.Window$Callback r3 = r5.f11123b     // Catch:{ all -> 0x0028 }
            r4 = 0
            boolean r3 = r3.onCreatePanelMenu(r4, r0)     // Catch:{ all -> 0x0028 }
            if (r3 == 0) goto L_0x002a
            android.view.Window$Callback r3 = r5.f11123b     // Catch:{ all -> 0x0028 }
            boolean r2 = r3.onPreparePanel(r4, r2, r0)     // Catch:{ all -> 0x0028 }
            if (r2 != 0) goto L_0x002d
            goto L_0x002a
        L_0x0028:
            r0 = move-exception
            goto L_0x0033
        L_0x002a:
            r0.clear()     // Catch:{ all -> 0x0028 }
        L_0x002d:
            if (r1 == 0) goto L_0x0032
            r1.d0()
        L_0x0032:
            return
        L_0x0033:
            if (r1 == 0) goto L_0x0038
            r1.d0()
        L_0x0038:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.y.z():void");
    }
}
