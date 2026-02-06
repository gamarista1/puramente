package n;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.Y;
import r1.C2553b;

abstract class b {

    /* renamed from: a  reason: collision with root package name */
    final Context f24379a;

    /* renamed from: b  reason: collision with root package name */
    private Y f24380b;

    /* renamed from: c  reason: collision with root package name */
    private Y f24381c;

    b(Context context) {
        this.f24379a = context;
    }

    /* access modifiers changed from: package-private */
    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof C2553b)) {
            return menuItem;
        }
        C2553b bVar = (C2553b) menuItem;
        if (this.f24380b == null) {
            this.f24380b = new Y();
        }
        MenuItem menuItem2 = (MenuItem) this.f24380b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        c cVar = new c(this.f24379a, bVar);
        this.f24380b.put(bVar, cVar);
        return cVar;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        Y y10 = this.f24380b;
        if (y10 != null) {
            y10.clear();
        }
        Y y11 = this.f24381c;
        if (y11 != null) {
            y11.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final void f(int i10) {
        if (this.f24380b != null) {
            int i11 = 0;
            while (i11 < this.f24380b.size()) {
                if (((C2553b) this.f24380b.i(i11)).getGroupId() == i10) {
                    this.f24380b.k(i11);
                    i11--;
                }
                i11++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void g(int i10) {
        if (this.f24380b != null) {
            for (int i11 = 0; i11 < this.f24380b.size(); i11++) {
                if (((C2553b) this.f24380b.i(i11)).getItemId() == i10) {
                    this.f24380b.k(i11);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final SubMenu d(SubMenu subMenu) {
        return subMenu;
    }
}
