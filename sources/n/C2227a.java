package n;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.c;
import androidx.core.view.C1679b;
import q1.C2429a;
import r1.C2553b;

/* renamed from: n.a  reason: case insensitive filesystem */
public class C2227a implements C2553b {

    /* renamed from: a  reason: collision with root package name */
    private final int f24359a;

    /* renamed from: b  reason: collision with root package name */
    private final int f24360b;

    /* renamed from: c  reason: collision with root package name */
    private final int f24361c;

    /* renamed from: d  reason: collision with root package name */
    private CharSequence f24362d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f24363e;

    /* renamed from: f  reason: collision with root package name */
    private Intent f24364f;

    /* renamed from: g  reason: collision with root package name */
    private char f24365g;

    /* renamed from: h  reason: collision with root package name */
    private int f24366h = 4096;

    /* renamed from: i  reason: collision with root package name */
    private char f24367i;

    /* renamed from: j  reason: collision with root package name */
    private int f24368j = 4096;

    /* renamed from: k  reason: collision with root package name */
    private Drawable f24369k;

    /* renamed from: l  reason: collision with root package name */
    private Context f24370l;

    /* renamed from: m  reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f24371m;

    /* renamed from: n  reason: collision with root package name */
    private CharSequence f24372n;

    /* renamed from: o  reason: collision with root package name */
    private CharSequence f24373o;

    /* renamed from: p  reason: collision with root package name */
    private ColorStateList f24374p = null;

    /* renamed from: q  reason: collision with root package name */
    private PorterDuff.Mode f24375q = null;

    /* renamed from: r  reason: collision with root package name */
    private boolean f24376r = false;

    /* renamed from: s  reason: collision with root package name */
    private boolean f24377s = false;

    /* renamed from: t  reason: collision with root package name */
    private int f24378t = 16;

    public C2227a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f24370l = context;
        this.f24359a = i11;
        this.f24360b = i10;
        this.f24361c = i13;
        this.f24362d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f24369k;
        if (drawable == null) {
            return;
        }
        if (this.f24376r || this.f24377s) {
            Drawable l10 = C2429a.l(drawable);
            this.f24369k = l10;
            Drawable mutate = l10.mutate();
            this.f24369k = mutate;
            if (this.f24376r) {
                C2429a.i(mutate, this.f24374p);
            }
            if (this.f24377s) {
                C2429a.j(this.f24369k, this.f24375q);
            }
        }
    }

    public C1679b a() {
        return null;
    }

    public C2553b b(C1679b bVar) {
        throw new UnsupportedOperationException();
    }

    public boolean collapseActionView() {
        return false;
    }

    /* renamed from: d */
    public C2553b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public C2553b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public boolean expandActionView() {
        return false;
    }

    /* renamed from: f */
    public C2553b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f24368j;
    }

    public char getAlphabeticShortcut() {
        return this.f24367i;
    }

    public CharSequence getContentDescription() {
        return this.f24372n;
    }

    public int getGroupId() {
        return this.f24360b;
    }

    public Drawable getIcon() {
        return this.f24369k;
    }

    public ColorStateList getIconTintList() {
        return this.f24374p;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f24375q;
    }

    public Intent getIntent() {
        return this.f24364f;
    }

    public int getItemId() {
        return this.f24359a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f24366h;
    }

    public char getNumericShortcut() {
        return this.f24365g;
    }

    public int getOrder() {
        return this.f24361c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f24362d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f24363e;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f24362d;
    }

    public CharSequence getTooltipText() {
        return this.f24373o;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        if ((this.f24378t & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean isChecked() {
        if ((this.f24378t & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean isEnabled() {
        if ((this.f24378t & 16) != 0) {
            return true;
        }
        return false;
    }

    public boolean isVisible() {
        if ((this.f24378t & 8) == 0) {
            return true;
        }
        return false;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c10) {
        this.f24367i = Character.toLowerCase(c10);
        return this;
    }

    public MenuItem setCheckable(boolean z10) {
        this.f24378t = z10 | (this.f24378t & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z10) {
        int i10;
        int i11 = this.f24378t & -3;
        if (z10) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        this.f24378t = i10 | i11;
        return this;
    }

    public MenuItem setEnabled(boolean z10) {
        int i10;
        int i11 = this.f24378t & -17;
        if (z10) {
            i10 = 16;
        } else {
            i10 = 0;
        }
        this.f24378t = i10 | i11;
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f24369k = drawable;
        c();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f24374p = colorStateList;
        this.f24376r = true;
        c();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f24375q = mode;
        this.f24377s = true;
        c();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f24364f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c10) {
        this.f24365g = c10;
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f24371m = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c10, char c11) {
        this.f24365g = c10;
        this.f24367i = Character.toLowerCase(c11);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f24362d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f24363e = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z10) {
        int i10 = 8;
        int i11 = this.f24378t & 8;
        if (z10) {
            i10 = 0;
        }
        this.f24378t = i11 | i10;
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f24367i = Character.toLowerCase(c10);
        this.f24368j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    public C2553b setContentDescription(CharSequence charSequence) {
        this.f24372n = charSequence;
        return this;
    }

    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f24365g = c10;
        this.f24366h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    public MenuItem setTitle(int i10) {
        this.f24362d = this.f24370l.getResources().getString(i10);
        return this;
    }

    public C2553b setTooltipText(CharSequence charSequence) {
        this.f24373o = charSequence;
        return this;
    }

    public MenuItem setIcon(int i10) {
        this.f24369k = c.getDrawable(this.f24370l, i10);
        c();
        return this;
    }

    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f24365g = c10;
        this.f24366h = KeyEvent.normalizeMetaState(i10);
        this.f24367i = Character.toLowerCase(c11);
        this.f24368j = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    public void setShowAsAction(int i10) {
    }
}
