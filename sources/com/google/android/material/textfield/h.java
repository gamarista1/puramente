package com.google.android.material.textfield;

import Ua.i;
import Ua.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.C1565d;
import androidx.appcompat.widget.T;
import com.google.android.material.internal.g;
import com.google.android.material.internal.l;
import jb.C5041a;

public class h extends C1565d {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final T f56292e;

    /* renamed from: f  reason: collision with root package name */
    private final AccessibilityManager f56293f;

    /* renamed from: g  reason: collision with root package name */
    private final Rect f56294g;

    /* renamed from: h  reason: collision with root package name */
    private final int f56295h;

    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            Object obj;
            h hVar = h.this;
            if (i10 < 0) {
                obj = hVar.f56292e.v();
            } else {
                obj = hVar.getAdapter().getItem(i10);
            }
            h.this.f(obj);
            AdapterView.OnItemClickListener onItemClickListener = h.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i10 < 0) {
                    view = h.this.f56292e.y();
                    i10 = h.this.f56292e.x();
                    j10 = h.this.f56292e.w();
                }
                onItemClickListener.onItemClick(h.this.f56292e.o(), view, i10, j10);
            }
            h.this.f56292e.dismiss();
        }
    }

    public h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Ua.a.f52724b);
    }

    private TextInputLayout d() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private int e() {
        ListAdapter adapter = getAdapter();
        TextInputLayout d10 = d();
        int i10 = 0;
        if (adapter == null || d10 == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f56292e.x()) + 15);
        View view = null;
        int i11 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(max, view, d10);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        Drawable g10 = this.f56292e.g();
        if (g10 != null) {
            g10.getPadding(this.f56294g);
            Rect rect = this.f56294g;
            i11 += rect.left + rect.right;
        }
        return i11 + d10.getEndIconView().getMeasuredWidth();
    }

    /* access modifiers changed from: private */
    public void f(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    public CharSequence getHint() {
        TextInputLayout d10 = d();
        if (d10 == null || !d10.O()) {
            return super.getHint();
        }
        return d10.getHint();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout d10 = d();
        if (d10 != null && d10.O() && super.getHint() == null && g.c()) {
            setHint("");
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), e()), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    public <T extends ListAdapter & Filterable> void setAdapter(T t10) {
        super.setAdapter(t10);
        this.f56292e.m(getAdapter());
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f56293f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f56292e.b();
        }
    }

    public h(Context context, AttributeSet attributeSet, int i10) {
        super(C5041a.c(context, attributeSet, i10, 0), attributeSet, i10);
        this.f56294g = new Rect();
        Context context2 = getContext();
        TypedArray h10 = l.h(context2, attributeSet, j.f53161f2, i10, i.f52912b, new int[0]);
        if (h10.hasValue(j.f53169g2) && h10.getInt(j.f53169g2, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.f56295h = h10.getResourceId(j.f53177h2, Ua.g.f52867k);
        this.f56293f = (AccessibilityManager) context2.getSystemService("accessibility");
        T t10 = new T(context2);
        this.f56292e = t10;
        t10.J(true);
        t10.D(this);
        t10.I(2);
        t10.m(getAdapter());
        t10.L(new a());
        if (h10.hasValue(j.f53185i2)) {
            setSimpleItems(h10.getResourceId(j.f53185i2, 0));
        }
        h10.recycle();
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new ArrayAdapter(getContext(), this.f56295h, strArr));
    }
}
