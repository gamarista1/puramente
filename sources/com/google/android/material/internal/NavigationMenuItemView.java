package com.google.android.material.internal;

import Ua.c;
import Ua.d;
import Ua.e;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.S;
import androidx.appcompat.widget.l0;
import androidx.core.view.C1677a;
import androidx.core.view.C1680b0;
import androidx.core.widget.i;
import i.C2037a;
import o1.h;
import q1.C2429a;
import y1.C2930A;

public class NavigationMenuItemView extends f implements k.a {

    /* renamed from: F  reason: collision with root package name */
    private static final int[] f55963F = {16842912};

    /* renamed from: A  reason: collision with root package name */
    private g f55964A;

    /* renamed from: B  reason: collision with root package name */
    private ColorStateList f55965B;

    /* renamed from: C  reason: collision with root package name */
    private boolean f55966C;

    /* renamed from: D  reason: collision with root package name */
    private Drawable f55967D;

    /* renamed from: E  reason: collision with root package name */
    private final C1677a f55968E;

    /* renamed from: v  reason: collision with root package name */
    private int f55969v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f55970w;

    /* renamed from: x  reason: collision with root package name */
    boolean f55971x;

    /* renamed from: y  reason: collision with root package name */
    private final CheckedTextView f55972y;

    /* renamed from: z  reason: collision with root package name */
    private FrameLayout f55973z;

    class a extends C1677a {
        a() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, C2930A a10) {
            super.onInitializeAccessibilityNodeInfo(view, a10);
            a10.r0(NavigationMenuItemView.this.f55971x);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void B() {
        if (D()) {
            this.f55972y.setVisibility(8);
            FrameLayout frameLayout = this.f55973z;
            if (frameLayout != null) {
                S.a aVar = (S.a) frameLayout.getLayoutParams();
                aVar.width = -1;
                this.f55973z.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f55972y.setVisibility(0);
        FrameLayout frameLayout2 = this.f55973z;
        if (frameLayout2 != null) {
            S.a aVar2 = (S.a) frameLayout2.getLayoutParams();
            aVar2.width = -2;
            this.f55973z.setLayoutParams(aVar2);
        }
    }

    private StateListDrawable C() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C2037a.f21277t, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f55963F, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private boolean D() {
        if (this.f55964A.getTitle() == null && this.f55964A.getIcon() == null && this.f55964A.getActionView() != null) {
            return true;
        }
        return false;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f55973z == null) {
                this.f55973z = (FrameLayout) ((ViewStub) findViewById(e.f52832d)).inflate();
            }
            this.f55973z.removeAllViews();
            this.f55973z.addView(view);
        }
    }

    public void c(g gVar, int i10) {
        int i11;
        this.f55964A = gVar;
        if (gVar.getItemId() > 0) {
            setId(gVar.getItemId());
        }
        if (gVar.isVisible()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        setVisibility(i11);
        if (getBackground() == null) {
            C1680b0.s0(this, C());
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.getTitle());
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.getContentDescription());
        l0.a(this, gVar.getTooltipText());
        B();
    }

    public boolean e() {
        return false;
    }

    public g getItemData() {
        return this.f55964A;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        g gVar = this.f55964A;
        if (gVar != null && gVar.isCheckable() && this.f55964A.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f55963F);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.f55971x != z10) {
            this.f55971x = z10;
            this.f55968E.sendAccessibilityEvent(this.f55972y, 2048);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        this.f55972y.setChecked(z10);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f55966C) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C2429a.l(drawable).mutate();
                C2429a.i(drawable, this.f55965B);
            }
            int i10 = this.f55969v;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.f55970w) {
            if (this.f55967D == null) {
                Drawable f10 = h.f(getResources(), d.f52804g, getContext().getTheme());
                this.f55967D = f10;
                if (f10 != null) {
                    int i11 = this.f55969v;
                    f10.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.f55967D;
        }
        i.i(this.f55972y, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i10) {
        this.f55972y.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.f55969v = i10;
    }

    /* access modifiers changed from: package-private */
    public void setIconTintList(ColorStateList colorStateList) {
        boolean z10;
        this.f55965B = colorStateList;
        if (colorStateList != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f55966C = z10;
        g gVar = this.f55964A;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.f55972y.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.f55970w = z10;
    }

    public void setTextAppearance(int i10) {
        i.o(this.f55972y, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f55972y.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f55972y.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a aVar = new a();
        this.f55968E = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(Ua.g.f52857a, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(c.f52774c));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(e.f52833e);
        this.f55972y = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C1680b0.o0(checkedTextView, aVar);
    }
}
