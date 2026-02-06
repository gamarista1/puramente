package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.e;
import com.revenuecat.purchases.common.Constants;

public class m extends e implements SubMenu {

    /* renamed from: B  reason: collision with root package name */
    private e f11410B;

    /* renamed from: C  reason: collision with root package name */
    private g f11411C;

    public m(Context context, e eVar, g gVar) {
        super(context);
        this.f11410B = eVar;
        this.f11411C = gVar;
    }

    public e D() {
        return this.f11410B.D();
    }

    public boolean G() {
        return this.f11410B.G();
    }

    public boolean H() {
        return this.f11410B.H();
    }

    public boolean I() {
        return this.f11410B.I();
    }

    public void S(e.a aVar) {
        this.f11410B.S(aVar);
    }

    public boolean f(g gVar) {
        return this.f11410B.f(gVar);
    }

    public Menu f0() {
        return this.f11410B;
    }

    public MenuItem getItem() {
        return this.f11411C;
    }

    /* access modifiers changed from: package-private */
    public boolean h(e eVar, MenuItem menuItem) {
        if (super.h(eVar, menuItem) || this.f11410B.h(eVar, menuItem)) {
            return true;
        }
        return false;
    }

    public boolean k(g gVar) {
        return this.f11410B.k(gVar);
    }

    public void setGroupDividerEnabled(boolean z10) {
        this.f11410B.setGroupDividerEnabled(z10);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.W(drawable);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.Z(charSequence);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.a0(view);
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f11411C.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z10) {
        this.f11410B.setQwertyMode(z10);
    }

    public String t() {
        int i10;
        g gVar = this.f11411C;
        if (gVar != null) {
            i10 = gVar.getItemId();
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            return null;
        }
        return super.t() + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + i10;
    }

    public SubMenu setHeaderIcon(int i10) {
        return (SubMenu) super.V(i10);
    }

    public SubMenu setHeaderTitle(int i10) {
        return (SubMenu) super.Y(i10);
    }

    public SubMenu setIcon(int i10) {
        this.f11411C.setIcon(i10);
        return this;
    }
}
