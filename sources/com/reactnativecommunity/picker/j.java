package com.reactnativecommunity.picker;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.AdapterView;
import com.facebook.react.bridge.ReactContext;

public class j extends a {

    /* renamed from: k  reason: collision with root package name */
    private int f59292k = 0;

    /* renamed from: l  reason: collision with root package name */
    private Integer f59293l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public c f59294m;

    /* renamed from: n  reason: collision with root package name */
    private b f59295n;

    /* renamed from: o  reason: collision with root package name */
    private Integer f59296o;

    /* renamed from: p  reason: collision with root package name */
    private int f59297p = Integer.MIN_VALUE;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public boolean f59298q = false;

    /* renamed from: r  reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f59299r = new a();

    /* renamed from: s  reason: collision with root package name */
    private final Runnable f59300s = new i(this);

    class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
        }

        public void onNothingSelected(AdapterView adapterView) {
            if (j.this.f59294m != null && j.this.f59298q) {
                j.this.f59294m.a(-1);
            }
        }
    }

    public interface b {
        void b();

        void c();
    }

    public interface c {
        void a(int i10);
    }

    public j(Context context) {
        super(context);
        g(context);
        j();
    }

    private void g(Context context) {
        if (com.facebook.react.modules.i18nmanager.a.f().i(context)) {
            setLayoutDirection(1);
            setTextDirection(4);
            return;
        }
        setLayoutDirection(0);
        setTextDirection(3);
    }

    private ReactContext getReactContext() {
        Context context = getContext();
        if (!(context instanceof ReactContext) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (ReactContext) context;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h() {
        measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
        layout(getLeft(), getTop(), getRight(), getBottom());
    }

    private void j() {
        setBackgroundResource(e.f59286a);
        setBackgroundColor(0);
    }

    private void setSelectionWithSuppressEvent(int i10) {
        if (i10 != getSelectedItemPosition()) {
            setOnItemSelectedListener((AdapterView.OnItemSelectedListener) null);
            setSelection(i10, false);
            setOnItemSelectedListener(this.f59299r);
        }
    }

    public void clearFocus() {
        super.setFocusableInTouchMode(true);
        super.setFocusable(true);
        super.onDetachedFromWindow();
    }

    public int getMode() {
        return this.f59292k;
    }

    public b getOnFocusListener() {
        return this.f59295n;
    }

    public c getOnSelectListener() {
        return this.f59294m;
    }

    public Integer getPrimaryColor() {
        return this.f59293l;
    }

    public void i(View view, int i10, int i11) {
        measureChild(view, i10, i11);
    }

    public void k() {
        Integer num = this.f59296o;
        if (num != null) {
            setSelectionWithSuppressEvent(num.intValue());
            this.f59296o = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (getOnItemSelectedListener() == null) {
            setOnItemSelectedListener(this.f59299r);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(i10, i11);
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition < 0 || getAdapter() == null || selectedItemPosition >= getAdapter().getCount()) {
            i12 = (int) TypedValue.applyDimension(1, 50.0f, Resources.getSystem().getDisplayMetrics());
        } else {
            View view = getAdapter().getView(selectedItemPosition, (View) null, this);
            measureChild(view, View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            i12 = view.getMeasuredHeight();
        }
        if (i12 != this.f59297p) {
            this.f59297p = i12;
            setMeasuredHeight(i12);
        }
    }

    public void onWindowFocusChanged(boolean z10) {
        if (this.f59298q && z10) {
            this.f59298q = false;
            b bVar = this.f59295n;
            if (bVar != null) {
                bVar.b();
            }
        }
    }

    public boolean performClick() {
        this.f59298q = true;
        b bVar = this.f59295n;
        if (bVar != null) {
            bVar.c();
        }
        return super.performClick();
    }

    public void requestLayout() {
        super.requestLayout();
        post(this.f59300s);
    }

    public void setBackgroundColor(int i10) {
        ((GradientDrawable) ((LayerDrawable) getBackground()).findDrawableByLayerId(f.f59287a)).setColor(i10);
    }

    public void setDropdownIconColor(int i10) {
        ((RippleDrawable) ((LayerDrawable) getBackground()).findDrawableByLayerId(f.f59288b)).setColorFilter(i10, PorterDuff.Mode.SRC_ATOP);
    }

    public void setDropdownIconRippleColor(int i10) {
        ((RippleDrawable) ((LayerDrawable) getBackground()).findDrawableByLayerId(f.f59288b)).setColor(ColorStateList.valueOf(i10));
    }

    public void setOnFocusListener(b bVar) {
        this.f59295n = bVar;
    }

    public void setOnSelectListener(c cVar) {
        this.f59294m = cVar;
    }

    public void setPrimaryColor(Integer num) {
        this.f59293l = num;
    }

    public void setSelection(int i10, boolean z10) {
        super.setSelection(i10, z10);
    }

    public void setStagedSelection(int i10) {
        this.f59296o = Integer.valueOf(i10);
    }

    public void setSelection(int i10) {
        c cVar;
        super.setSelection(i10);
        if (this.f59298q && (cVar = this.f59294m) != null) {
            cVar.a(i10);
        }
    }

    public j(Context context, int i10) {
        super(context, i10);
        this.f59292k = i10;
        g(context);
        j();
    }
}
