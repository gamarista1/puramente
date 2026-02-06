package androidx.core.view;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: androidx.core.view.b  reason: case insensitive filesystem */
public abstract class C1679b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f16039a;

    /* renamed from: b  reason: collision with root package name */
    private a f16040b;

    /* renamed from: c  reason: collision with root package name */
    private C0284b f16041c;

    /* renamed from: androidx.core.view.b$a */
    public interface a {
    }

    /* renamed from: androidx.core.view.b$b  reason: collision with other inner class name */
    public interface C0284b {
        void onActionProviderVisibilityChanged(boolean z10);
    }

    public C1679b(Context context) {
        this.f16039a = context;
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract View c(MenuItem menuItem);

    public abstract boolean d();

    public abstract void e(SubMenu subMenu);

    public abstract boolean f();

    public void g() {
        this.f16041c = null;
        this.f16040b = null;
    }

    public void h(a aVar) {
        this.f16040b = aVar;
    }

    public abstract void i(C0284b bVar);
}
