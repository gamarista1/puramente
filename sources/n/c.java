package n;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.C1679b;
import java.lang.reflect.Method;
import r1.C2553b;

public class c extends b implements MenuItem {

    /* renamed from: d  reason: collision with root package name */
    private final C2553b f24382d;

    /* renamed from: e  reason: collision with root package name */
    private Method f24383e;

    private class a extends C1679b implements ActionProvider.VisibilityListener {

        /* renamed from: d  reason: collision with root package name */
        private C1679b.C0284b f24384d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public final ActionProvider f24385e;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f24385e = actionProvider;
        }

        public boolean a() {
            return this.f24385e.hasSubMenu();
        }

        public boolean b() {
            return this.f24385e.isVisible();
        }

        public View c(MenuItem menuItem) {
            return this.f24385e.onCreateActionView(menuItem);
        }

        public boolean d() {
            return this.f24385e.onPerformDefaultAction();
        }

        public void e(SubMenu subMenu) {
            this.f24385e.onPrepareSubMenu(c.this.d(subMenu));
        }

        public boolean f() {
            return this.f24385e.overridesItemVisibility();
        }

        public void i(C1679b.C0284b bVar) {
            a aVar;
            this.f24384d = bVar;
            ActionProvider actionProvider = this.f24385e;
            if (bVar != null) {
                aVar = this;
            } else {
                aVar = null;
            }
            actionProvider.setVisibilityListener(aVar);
        }

        public void onActionProviderVisibilityChanged(boolean z10) {
            C1679b.C0284b bVar = this.f24384d;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z10);
            }
        }
    }

    static class b extends FrameLayout implements androidx.appcompat.view.c {

        /* renamed from: a  reason: collision with root package name */
        final CollapsibleActionView f24387a;

        b(View view) {
            super(view.getContext());
            this.f24387a = (CollapsibleActionView) view;
            addView(view);
        }

        /* access modifiers changed from: package-private */
        public View a() {
            return (View) this.f24387a;
        }

        public void b() {
            this.f24387a.onActionViewExpanded();
        }

        public void f() {
            this.f24387a.onActionViewCollapsed();
        }
    }

    /* renamed from: n.c$c  reason: collision with other inner class name */
    private class C0412c implements MenuItem.OnActionExpandListener {

        /* renamed from: a  reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f24388a;

        C0412c(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f24388a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f24388a.onMenuItemActionCollapse(c.this.c(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f24388a.onMenuItemActionExpand(c.this.c(menuItem));
        }
    }

    private class d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f24390a;

        d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f24390a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f24390a.onMenuItemClick(c.this.c(menuItem));
        }
    }

    public c(Context context, C2553b bVar) {
        super(context);
        if (bVar != null) {
            this.f24382d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean collapseActionView() {
        return this.f24382d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f24382d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        C1679b a10 = this.f24382d.a();
        if (a10 instanceof a) {
            return ((a) a10).f24385e;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f24382d.getActionView();
        if (actionView instanceof b) {
            return ((b) actionView).a();
        }
        return actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f24382d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f24382d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f24382d.getContentDescription();
    }

    public int getGroupId() {
        return this.f24382d.getGroupId();
    }

    public Drawable getIcon() {
        return this.f24382d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f24382d.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f24382d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f24382d.getIntent();
    }

    public int getItemId() {
        return this.f24382d.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f24382d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f24382d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f24382d.getNumericShortcut();
    }

    public int getOrder() {
        return this.f24382d.getOrder();
    }

    public SubMenu getSubMenu() {
        return d(this.f24382d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f24382d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f24382d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f24382d.getTooltipText();
    }

    public void h(boolean z10) {
        try {
            if (this.f24383e == null) {
                this.f24383e = this.f24382d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f24383e.invoke(this.f24382d, new Object[]{Boolean.valueOf(z10)});
        } catch (Exception e10) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
        }
    }

    public boolean hasSubMenu() {
        return this.f24382d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f24382d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f24382d.isCheckable();
    }

    public boolean isChecked() {
        return this.f24382d.isChecked();
    }

    public boolean isEnabled() {
        return this.f24382d.isEnabled();
    }

    public boolean isVisible() {
        return this.f24382d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        a aVar = new a(this.f24379a, actionProvider);
        C2553b bVar = this.f24382d;
        if (actionProvider == null) {
            aVar = null;
        }
        bVar.b(aVar);
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        this.f24382d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c10) {
        this.f24382d.setAlphabeticShortcut(c10);
        return this;
    }

    public MenuItem setCheckable(boolean z10) {
        this.f24382d.setCheckable(z10);
        return this;
    }

    public MenuItem setChecked(boolean z10) {
        this.f24382d.setChecked(z10);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f24382d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z10) {
        this.f24382d.setEnabled(z10);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f24382d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f24382d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f24382d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f24382d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c10) {
        this.f24382d.setNumericShortcut(c10);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        C0412c cVar;
        C2553b bVar = this.f24382d;
        if (onActionExpandListener != null) {
            cVar = new C0412c(onActionExpandListener);
        } else {
            cVar = null;
        }
        bVar.setOnActionExpandListener(cVar);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        d dVar;
        C2553b bVar = this.f24382d;
        if (onMenuItemClickListener != null) {
            dVar = new d(onMenuItemClickListener);
        } else {
            dVar = null;
        }
        bVar.setOnMenuItemClickListener(dVar);
        return this;
    }

    public MenuItem setShortcut(char c10, char c11) {
        this.f24382d.setShortcut(c10, c11);
        return this;
    }

    public void setShowAsAction(int i10) {
        this.f24382d.setShowAsAction(i10);
    }

    public MenuItem setShowAsActionFlags(int i10) {
        this.f24382d.setShowAsActionFlags(i10);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f24382d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f24382d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f24382d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z10) {
        return this.f24382d.setVisible(z10);
    }

    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f24382d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    public MenuItem setIcon(int i10) {
        this.f24382d.setIcon(i10);
        return this;
    }

    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f24382d.setNumericShortcut(c10, i10);
        return this;
    }

    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f24382d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    public MenuItem setTitle(int i10) {
        this.f24382d.setTitle(i10);
        return this;
    }

    public MenuItem setActionView(int i10) {
        this.f24382d.setActionView(i10);
        View actionView = this.f24382d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f24382d.setActionView((View) new b(actionView));
        }
        return this;
    }
}
