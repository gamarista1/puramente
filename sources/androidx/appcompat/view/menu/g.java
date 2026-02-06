package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.k;
import androidx.core.view.C1679b;
import i.h;
import j.C2115a;
import q1.C2429a;
import r1.C2553b;

public final class g implements C2553b {

    /* renamed from: A  reason: collision with root package name */
    private View f11341A;

    /* renamed from: B  reason: collision with root package name */
    private C1679b f11342B;

    /* renamed from: C  reason: collision with root package name */
    private MenuItem.OnActionExpandListener f11343C;

    /* renamed from: D  reason: collision with root package name */
    private boolean f11344D = false;

    /* renamed from: E  reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f11345E;

    /* renamed from: a  reason: collision with root package name */
    private final int f11346a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11347b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11348c;

    /* renamed from: d  reason: collision with root package name */
    private final int f11349d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f11350e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f11351f;

    /* renamed from: g  reason: collision with root package name */
    private Intent f11352g;

    /* renamed from: h  reason: collision with root package name */
    private char f11353h;

    /* renamed from: i  reason: collision with root package name */
    private int f11354i = 4096;

    /* renamed from: j  reason: collision with root package name */
    private char f11355j;

    /* renamed from: k  reason: collision with root package name */
    private int f11356k = 4096;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f11357l;

    /* renamed from: m  reason: collision with root package name */
    private int f11358m = 0;

    /* renamed from: n  reason: collision with root package name */
    e f11359n;

    /* renamed from: o  reason: collision with root package name */
    private m f11360o;

    /* renamed from: p  reason: collision with root package name */
    private Runnable f11361p;

    /* renamed from: q  reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f11362q;

    /* renamed from: r  reason: collision with root package name */
    private CharSequence f11363r;

    /* renamed from: s  reason: collision with root package name */
    private CharSequence f11364s;

    /* renamed from: t  reason: collision with root package name */
    private ColorStateList f11365t = null;

    /* renamed from: u  reason: collision with root package name */
    private PorterDuff.Mode f11366u = null;

    /* renamed from: v  reason: collision with root package name */
    private boolean f11367v = false;

    /* renamed from: w  reason: collision with root package name */
    private boolean f11368w = false;

    /* renamed from: x  reason: collision with root package name */
    private boolean f11369x = false;

    /* renamed from: y  reason: collision with root package name */
    private int f11370y = 16;

    /* renamed from: z  reason: collision with root package name */
    private int f11371z;

    class a implements C1679b.C0284b {
        a() {
        }

        public void onActionProviderVisibilityChanged(boolean z10) {
            g gVar = g.this;
            gVar.f11359n.K(gVar);
        }
    }

    g(e eVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f11359n = eVar;
        this.f11346a = i11;
        this.f11347b = i10;
        this.f11348c = i12;
        this.f11349d = i13;
        this.f11350e = charSequence;
        this.f11371z = i14;
    }

    private static void d(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f11369x && (this.f11367v || this.f11368w)) {
            drawable = C2429a.l(drawable).mutate();
            if (this.f11367v) {
                C2429a.i(drawable, this.f11365t);
            }
            if (this.f11368w) {
                C2429a.j(drawable, this.f11366u);
            }
            this.f11369x = false;
        }
        return drawable;
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        if (!this.f11359n.I() || g() == 0) {
            return false;
        }
        return true;
    }

    public boolean B() {
        if ((this.f11371z & 4) == 4) {
            return true;
        }
        return false;
    }

    public C1679b a() {
        return this.f11342B;
    }

    public C2553b b(C1679b bVar) {
        C1679b bVar2 = this.f11342B;
        if (bVar2 != null) {
            bVar2.g();
        }
        this.f11341A = null;
        this.f11342B = bVar;
        this.f11359n.L(true);
        C1679b bVar3 = this.f11342B;
        if (bVar3 != null) {
            bVar3.i(new a());
        }
        return this;
    }

    public void c() {
        this.f11359n.J(this);
    }

    public boolean collapseActionView() {
        if ((this.f11371z & 8) == 0) {
            return false;
        }
        if (this.f11341A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f11343C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f11359n.f(this);
        }
        return false;
    }

    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f11343C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f11359n.k(this);
        }
        return false;
    }

    public int f() {
        return this.f11349d;
    }

    /* access modifiers changed from: package-private */
    public char g() {
        if (this.f11359n.H()) {
            return this.f11355j;
        }
        return this.f11353h;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.f11341A;
        if (view != null) {
            return view;
        }
        C1679b bVar = this.f11342B;
        if (bVar == null) {
            return null;
        }
        View c10 = bVar.c(this);
        this.f11341A = c10;
        return c10;
    }

    public int getAlphabeticModifiers() {
        return this.f11356k;
    }

    public char getAlphabeticShortcut() {
        return this.f11355j;
    }

    public CharSequence getContentDescription() {
        return this.f11363r;
    }

    public int getGroupId() {
        return this.f11347b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f11357l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f11358m == 0) {
            return null;
        }
        Drawable b10 = C2115a.b(this.f11359n.u(), this.f11358m);
        this.f11358m = 0;
        this.f11357l = b10;
        return e(b10);
    }

    public ColorStateList getIconTintList() {
        return this.f11365t;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f11366u;
    }

    public Intent getIntent() {
        return this.f11352g;
    }

    public int getItemId() {
        return this.f11346a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f11345E;
    }

    public int getNumericModifiers() {
        return this.f11354i;
    }

    public char getNumericShortcut() {
        return this.f11353h;
    }

    public int getOrder() {
        return this.f11348c;
    }

    public SubMenu getSubMenu() {
        return this.f11360o;
    }

    public CharSequence getTitle() {
        return this.f11350e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f11351f;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f11350e;
    }

    public CharSequence getTooltipText() {
        return this.f11364s;
    }

    /* access modifiers changed from: package-private */
    public String h() {
        int i10;
        char g10 = g();
        if (g10 == 0) {
            return "";
        }
        Resources resources = this.f11359n.u().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f11359n.u()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(h.f21426m));
        }
        if (this.f11359n.H()) {
            i10 = this.f11356k;
        } else {
            i10 = this.f11354i;
        }
        d(sb2, i10, 65536, resources.getString(h.f21422i));
        d(sb2, i10, 4096, resources.getString(h.f21418e));
        d(sb2, i10, 2, resources.getString(h.f21417d));
        d(sb2, i10, 1, resources.getString(h.f21423j));
        d(sb2, i10, 4, resources.getString(h.f21425l));
        d(sb2, i10, 8, resources.getString(h.f21421h));
        if (g10 == 8) {
            sb2.append(resources.getString(h.f21419f));
        } else if (g10 == 10) {
            sb2.append(resources.getString(h.f21420g));
        } else if (g10 != ' ') {
            sb2.append(g10);
        } else {
            sb2.append(resources.getString(h.f21424k));
        }
        return sb2.toString();
    }

    public boolean hasSubMenu() {
        if (this.f11360o != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public CharSequence i(k.a aVar) {
        if (aVar == null || !aVar.e()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    public boolean isActionViewExpanded() {
        return this.f11344D;
    }

    public boolean isCheckable() {
        if ((this.f11370y & 1) == 1) {
            return true;
        }
        return false;
    }

    public boolean isChecked() {
        if ((this.f11370y & 2) == 2) {
            return true;
        }
        return false;
    }

    public boolean isEnabled() {
        if ((this.f11370y & 16) != 0) {
            return true;
        }
        return false;
    }

    public boolean isVisible() {
        C1679b bVar = this.f11342B;
        if (bVar == null || !bVar.f()) {
            if ((this.f11370y & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.f11370y & 8) != 0 || !this.f11342B.b()) {
            return false;
        } else {
            return true;
        }
    }

    public boolean j() {
        C1679b bVar;
        if ((this.f11371z & 8) == 0) {
            return false;
        }
        if (this.f11341A == null && (bVar = this.f11342B) != null) {
            this.f11341A = bVar.c(this);
        }
        if (this.f11341A != null) {
            return true;
        }
        return false;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f11362q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.f11359n;
        if (eVar.h(eVar, this)) {
            return true;
        }
        Runnable runnable = this.f11361p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f11352g != null) {
            try {
                this.f11359n.u().startActivity(this.f11352g);
                return true;
            } catch (ActivityNotFoundException e10) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
            }
        }
        C1679b bVar = this.f11342B;
        if (bVar == null || !bVar.d()) {
            return false;
        }
        return true;
    }

    public boolean l() {
        if ((this.f11370y & 32) == 32) {
            return true;
        }
        return false;
    }

    public boolean m() {
        if ((this.f11370y & 4) != 0) {
            return true;
        }
        return false;
    }

    public boolean n() {
        if ((this.f11371z & 1) == 1) {
            return true;
        }
        return false;
    }

    public boolean o() {
        if ((this.f11371z & 2) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public C2553b setActionView(int i10) {
        Context u10 = this.f11359n.u();
        setActionView(LayoutInflater.from(u10).inflate(i10, new LinearLayout(u10), false));
        return this;
    }

    /* renamed from: q */
    public C2553b setActionView(View view) {
        int i10;
        this.f11341A = view;
        this.f11342B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f11346a) > 0) {
            view.setId(i10);
        }
        this.f11359n.J(this);
        return this;
    }

    public void r(boolean z10) {
        this.f11344D = z10;
        this.f11359n.L(false);
    }

    /* access modifiers changed from: package-private */
    public void s(boolean z10) {
        int i10;
        int i11 = this.f11370y;
        int i12 = i11 & -3;
        if (z10) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        int i13 = i10 | i12;
        this.f11370y = i13;
        if (i11 != i13) {
            this.f11359n.L(false);
        }
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f11355j == c10) {
            return this;
        }
        this.f11355j = Character.toLowerCase(c10);
        this.f11359n.L(false);
        return this;
    }

    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f11370y;
        boolean z11 = z10 | (i10 & true);
        this.f11370y = z11 ? 1 : 0;
        if (i10 != z11) {
            this.f11359n.L(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z10) {
        if ((this.f11370y & 4) != 0) {
            this.f11359n.U(this);
        } else {
            s(z10);
        }
        return this;
    }

    public MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f11370y |= 16;
        } else {
            this.f11370y &= -17;
        }
        this.f11359n.L(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f11358m = 0;
        this.f11357l = drawable;
        this.f11369x = true;
        this.f11359n.L(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f11365t = colorStateList;
        this.f11367v = true;
        this.f11369x = true;
        this.f11359n.L(false);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f11366u = mode;
        this.f11368w = true;
        this.f11369x = true;
        this.f11359n.L(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f11352g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c10) {
        if (this.f11353h == c10) {
            return this;
        }
        this.f11353h = c10;
        this.f11359n.L(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f11343C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f11362q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c10, char c11) {
        this.f11353h = c10;
        this.f11355j = Character.toLowerCase(c11);
        this.f11359n.L(false);
        return this;
    }

    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 == 0 || i11 == 1 || i11 == 2) {
            this.f11371z = i10;
            this.f11359n.J(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f11350e = charSequence;
        this.f11359n.L(false);
        m mVar = this.f11360o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f11351f = charSequence;
        this.f11359n.L(false);
        return this;
    }

    public MenuItem setVisible(boolean z10) {
        if (y(z10)) {
            this.f11359n.K(this);
        }
        return this;
    }

    public void t(boolean z10) {
        int i10;
        int i11 = this.f11370y & -5;
        if (z10) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        this.f11370y = i10 | i11;
    }

    public String toString() {
        CharSequence charSequence = this.f11350e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z10) {
        if (z10) {
            this.f11370y |= 32;
        } else {
            this.f11370y &= -33;
        }
    }

    /* access modifiers changed from: package-private */
    public void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f11345E = contextMenuInfo;
    }

    /* renamed from: w */
    public C2553b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public void x(m mVar) {
        this.f11360o = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    /* access modifiers changed from: package-private */
    public boolean y(boolean z10) {
        int i10;
        int i11 = this.f11370y;
        int i12 = i11 & -9;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        int i13 = i10 | i12;
        this.f11370y = i13;
        if (i11 != i13) {
            return true;
        }
        return false;
    }

    public boolean z() {
        return this.f11359n.A();
    }

    public C2553b setContentDescription(CharSequence charSequence) {
        this.f11363r = charSequence;
        this.f11359n.L(false);
        return this;
    }

    public C2553b setTooltipText(CharSequence charSequence) {
        this.f11364s = charSequence;
        this.f11359n.L(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f11355j == c10 && this.f11356k == i10) {
            return this;
        }
        this.f11355j = Character.toLowerCase(c10);
        this.f11356k = KeyEvent.normalizeMetaState(i10);
        this.f11359n.L(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f11353h == c10 && this.f11354i == i10) {
            return this;
        }
        this.f11353h = c10;
        this.f11354i = KeyEvent.normalizeMetaState(i10);
        this.f11359n.L(false);
        return this;
    }

    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f11353h = c10;
        this.f11354i = KeyEvent.normalizeMetaState(i10);
        this.f11355j = Character.toLowerCase(c11);
        this.f11356k = KeyEvent.normalizeMetaState(i11);
        this.f11359n.L(false);
        return this;
    }

    public MenuItem setIcon(int i10) {
        this.f11357l = null;
        this.f11358m = i10;
        this.f11369x = true;
        this.f11359n.L(false);
        return this;
    }

    public MenuItem setTitle(int i10) {
        return setTitle((CharSequence) this.f11359n.u().getString(i10));
    }
}
