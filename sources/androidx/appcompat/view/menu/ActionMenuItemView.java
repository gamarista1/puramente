package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C;
import androidx.appcompat.widget.Q;
import androidx.appcompat.widget.l0;
import i.j;

public class ActionMenuItemView extends C implements k.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: a  reason: collision with root package name */
    g f11214a;

    /* renamed from: b  reason: collision with root package name */
    private CharSequence f11215b;

    /* renamed from: c  reason: collision with root package name */
    private Drawable f11216c;

    /* renamed from: d  reason: collision with root package name */
    e.b f11217d;

    /* renamed from: e  reason: collision with root package name */
    private Q f11218e;

    /* renamed from: f  reason: collision with root package name */
    b f11219f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f11220g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f11221h;

    /* renamed from: i  reason: collision with root package name */
    private int f11222i;

    /* renamed from: j  reason: collision with root package name */
    private int f11223j;

    /* renamed from: k  reason: collision with root package name */
    private int f11224k;

    private class a extends Q {
        public a() {
            super(ActionMenuItemView.this);
        }

        public n.e b() {
            b bVar = ActionMenuItemView.this.f11219f;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        public boolean c() {
            n.e b10;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f11217d;
            if (bVar == null || !bVar.d(actionMenuItemView.f11214a) || (b10 = b()) == null || !b10.c()) {
                return false;
            }
            return true;
        }
    }

    public static abstract class b {
        public abstract n.e a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 >= 480 || ((i10 >= 640 && i11 >= 480) || configuration.orientation == 2)) {
            return true;
        }
        return false;
    }

    private void h() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f11215b);
        if (this.f11216c != null && (!this.f11214a.B() || (!this.f11220g && !this.f11221h))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        CharSequence charSequence3 = null;
        if (z12) {
            charSequence = this.f11215b;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence contentDescription = this.f11214a.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z12) {
                charSequence2 = null;
            } else {
                charSequence2 = this.f11214a.getTitle();
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f11214a.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z12) {
                charSequence3 = this.f11214a.getTitle();
            }
            l0.a(this, charSequence3);
            return;
        }
        l0.a(this, tooltipText);
    }

    public boolean a() {
        return f();
    }

    public boolean b() {
        if (!f() || this.f11214a.getIcon() != null) {
            return false;
        }
        return true;
    }

    public void c(g gVar, int i10) {
        int i11;
        this.f11214a = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        if (gVar.isVisible()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        setVisibility(i11);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f11218e == null) {
            this.f11218e = new a();
        }
    }

    public boolean e() {
        return true;
    }

    public boolean f() {
        return !TextUtils.isEmpty(getText());
    }

    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public g getItemData() {
        return this.f11214a;
    }

    public void onClick(View view) {
        e.b bVar = this.f11217d;
        if (bVar != null) {
            bVar.d(this.f11214a);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f11220g = g();
        h();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        boolean f10 = f();
        if (f10 && (i13 = this.f11223j) >= 0) {
            super.setPadding(i13, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i12 = Math.min(size, this.f11222i);
        } else {
            i12 = this.f11222i;
        }
        if (mode != 1073741824 && this.f11222i > 0 && measuredWidth < i12) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
        }
        if (!f10 && this.f11216c != null) {
            super.setPadding((getMeasuredWidth() - this.f11216c.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        Q q10;
        if (!this.f11214a.hasSubMenu() || (q10 = this.f11218e) == null || !q10.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f11221h != z10) {
            this.f11221h = z10;
            g gVar = this.f11214a;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f11216c = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f11224k;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i10) / ((float) intrinsicWidth)));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i10) / ((float) intrinsicHeight)));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        h();
    }

    public void setItemInvoker(e.b bVar) {
        this.f11217d = bVar;
    }

    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f11223j = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f11219f = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f11215b = charSequence;
        h();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f11220g = g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f21659v, i10, 0);
        this.f11222i = obtainStyledAttributes.getDimensionPixelSize(j.f21664w, 0);
        obtainStyledAttributes.recycle();
        this.f11224k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f11223j = -1;
        setSaveEnabled(false);
    }
}
