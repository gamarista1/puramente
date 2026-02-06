package com.google.android.material.datepicker;

import Ua.e;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.C1677a;
import androidx.core.view.C1680b0;
import com.google.android.material.internal.n;
import java.util.Calendar;
import java.util.Iterator;
import x1.d;
import y1.C2930A;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: a  reason: collision with root package name */
    private final Calendar f55779a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f55780b;

    class a extends C1677a {
        a() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, C2930A a10) {
            super.onInitializeAccessibilityNodeInfo(view, a10);
            a10.v0((Object) null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(int i10, Rect rect) {
        if (i10 == 33) {
            setSelection(getAdapter().i());
        } else if (i10 == 130) {
            setSelection(getAdapter().b());
        } else {
            super.onFocusChanged(true, i10, rect);
        }
    }

    private View c(int i10) {
        return getChildAt(i10 - getFirstVisiblePosition());
    }

    private static int d(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    private static boolean e(Long l10, Long l11, Long l12, Long l13) {
        if (l10 == null || l11 == null || l12 == null || l13 == null || l12.longValue() > l11.longValue() || l13.longValue() < l10.longValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public n getAdapter() {
        return (n) super.getAdapter();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        n b10 = getAdapter();
        e eVar = b10.f55915b;
        c cVar = b10.f55917d;
        int max = Math.max(b10.b(), getFirstVisiblePosition());
        int min = Math.min(b10.i(), getLastVisiblePosition());
        Long c10 = b10.getItem(max);
        Long c11 = b10.getItem(min);
        Iterator it = eVar.Q().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            Object obj = dVar.f28213a;
            if (obj == null) {
                materialCalendarGridView = this;
            } else if (dVar.f28214b != null) {
                Long l10 = (Long) obj;
                long longValue = l10.longValue();
                Long l11 = (Long) dVar.f28214b;
                long longValue2 = l11.longValue();
                if (!e(c10, c11, l10, l11)) {
                    boolean e10 = n.e(this);
                    if (longValue < c10.longValue()) {
                        if (b10.f(max)) {
                            i19 = 0;
                        } else if (!e10) {
                            i19 = materialCalendarGridView.c(max - 1).getRight();
                        } else {
                            i19 = materialCalendarGridView.c(max - 1).getLeft();
                        }
                        i10 = i19;
                        i11 = max;
                    } else {
                        materialCalendarGridView.f55779a.setTimeInMillis(longValue);
                        i11 = b10.a(materialCalendarGridView.f55779a.get(5));
                        i10 = d(materialCalendarGridView.c(i11));
                    }
                    if (longValue2 > c11.longValue()) {
                        if (b10.g(min)) {
                            i18 = getWidth();
                        } else if (!e10) {
                            i18 = materialCalendarGridView.c(min).getRight();
                        } else {
                            i18 = materialCalendarGridView.c(min).getLeft();
                        }
                        i12 = i18;
                        i13 = min;
                    } else {
                        materialCalendarGridView.f55779a.setTimeInMillis(longValue2);
                        i13 = b10.a(materialCalendarGridView.f55779a.get(5));
                        i12 = d(materialCalendarGridView.c(i13));
                    }
                    int itemId = (int) b10.getItemId(i11);
                    int i20 = max;
                    int i21 = min;
                    int itemId2 = (int) b10.getItemId(i13);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (numColumns + getNumColumns()) - 1;
                        View c12 = materialCalendarGridView.c(numColumns);
                        int top = c12.getTop() + cVar.f55800a.c();
                        n nVar = b10;
                        int bottom = c12.getBottom() - cVar.f55800a.b();
                        if (!e10) {
                            if (numColumns > i11) {
                                i15 = 0;
                            } else {
                                i15 = i10;
                            }
                            if (i13 > numColumns2) {
                                i14 = getWidth();
                            } else {
                                i14 = i12;
                            }
                        } else {
                            if (i13 > numColumns2) {
                                i16 = 0;
                            } else {
                                i16 = i12;
                            }
                            if (numColumns > i11) {
                                i17 = getWidth();
                            } else {
                                i17 = i10;
                            }
                            int i22 = i16;
                            i14 = i17;
                            i15 = i22;
                        }
                        canvas.drawRect((float) i15, (float) top, (float) i14, (float) bottom, cVar.f55807h);
                        itemId++;
                        materialCalendarGridView = this;
                        it = it;
                        b10 = nVar;
                    }
                    materialCalendarGridView = this;
                    max = i20;
                    min = i21;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (z10) {
            a(i10, rect);
        } else {
            super.onFocusChanged(false, i10, rect);
        }
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!super.onKeyDown(i10, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().b()) {
            return true;
        }
        if (19 != i10) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    public void onMeasure(int i10, int i11) {
        if (this.f55780b) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setSelection(int i10) {
        if (i10 < getAdapter().b()) {
            super.setSelection(getAdapter().b());
        } else {
            super.setSelection(i10);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f55779a = u.l();
        if (j.l0(getContext())) {
            setNextFocusLeftId(e.f52829a);
            setNextFocusRightId(e.f52831c);
        }
        this.f55780b = j.m0(getContext());
        C1680b0.o0(this, new a());
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof n) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), n.class.getCanonicalName()}));
    }
}
