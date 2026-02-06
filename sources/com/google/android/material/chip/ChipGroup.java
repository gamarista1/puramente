package com.google.android.material.chip;

import Ua.i;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.C1680b0;
import com.google.android.material.internal.a;
import java.util.List;
import java.util.Set;
import y1.C2930A;

public class ChipGroup extends com.google.android.material.internal.e {

    /* renamed from: k  reason: collision with root package name */
    private static final int f55704k = i.f52919i;

    /* renamed from: e  reason: collision with root package name */
    private int f55705e;

    /* renamed from: f  reason: collision with root package name */
    private int f55706f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public e f55707g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final com.google.android.material.internal.a f55708h;

    /* renamed from: i  reason: collision with root package name */
    private final int f55709i;

    /* renamed from: j  reason: collision with root package name */
    private final f f55710j;

    class a implements a.b {
        a() {
        }

        public void a(Set set) {
            if (ChipGroup.this.f55707g != null) {
                e e10 = ChipGroup.this.f55707g;
                ChipGroup chipGroup = ChipGroup.this;
                e10.a(chipGroup, chipGroup.f55708h.j(ChipGroup.this));
            }
        }
    }

    class b implements e {
        b(d dVar) {
        }

        public void a(ChipGroup chipGroup, List list) {
            if (ChipGroup.this.f55708h.l()) {
                ChipGroup.this.getCheckedChipId();
                throw null;
            }
        }
    }

    public static class c extends ViewGroup.MarginLayoutParams {
        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(int i10, int i11) {
            super(i10, i11);
        }
    }

    public interface d {
    }

    public interface e {
        void a(ChipGroup chipGroup, List list);
    }

    private class f implements ViewGroup.OnHierarchyChangeListener {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public ViewGroup.OnHierarchyChangeListener f55713a;

        private f() {
        }

        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(C1680b0.k());
                }
                ChipGroup.this.f55708h.e((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f55713a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                chipGroup.f55708h.n((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f55713a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }

        /* synthetic */ f(ChipGroup chipGroup, a aVar) {
            this();
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Ua.a.f52727e);
    }

    private int getChipCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof Chip) {
                i10++;
            }
        }
        return i10;
    }

    public boolean c() {
        return super.c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!super.checkLayoutParams(layoutParams) || !(layoutParams instanceof c)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public int g(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof Chip) {
                if (((Chip) getChildAt(i11)) == view) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.f55708h.k();
    }

    public List<Integer> getCheckedChipIds() {
        return this.f55708h.j(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f55705e;
    }

    public int getChipSpacingVertical() {
        return this.f55706f;
    }

    public boolean h() {
        return this.f55708h.l();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f55709i;
        if (i10 != -1) {
            this.f55708h.f(i10);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        int i11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C2930A l12 = C2930A.l1(accessibilityNodeInfo);
        if (c()) {
            i10 = getChipCount();
        } else {
            i10 = -1;
        }
        int rowCount = getRowCount();
        if (h()) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        l12.v0(C2930A.e.b(rowCount, i10, false, i11));
    }

    public void setChipSpacing(int i10) {
        setChipSpacingHorizontal(i10);
        setChipSpacingVertical(i10);
    }

    public void setChipSpacingHorizontal(int i10) {
        if (this.f55705e != i10) {
            this.f55705e = i10;
            setItemSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i10) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingResource(int i10) {
        setChipSpacing(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingVertical(int i10) {
        if (this.f55706f != i10) {
            this.f55706f = i10;
            setLineSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i10) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i10));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i10) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(d dVar) {
        if (dVar == null) {
            setOnCheckedStateChangeListener((e) null);
        } else {
            setOnCheckedStateChangeListener(new b(dVar));
        }
    }

    public void setOnCheckedStateChangeListener(e eVar) {
        this.f55707g = eVar;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        ViewGroup.OnHierarchyChangeListener unused = this.f55710j.f55713a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z10) {
        this.f55708h.p(z10);
    }

    @Deprecated
    public void setShowDividerHorizontal(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(boolean z10) {
        super.setSingleLine(z10);
    }

    public void setSingleSelection(boolean z10) {
        this.f55708h.q(z10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ChipGroup(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r4 = f55704k
            android.content.Context r9 = jb.C5041a.c(r9, r10, r11, r4)
            r8.<init>(r9, r10, r11)
            com.google.android.material.internal.a r9 = new com.google.android.material.internal.a
            r9.<init>()
            r8.f55708h = r9
            com.google.android.material.chip.ChipGroup$f r6 = new com.google.android.material.chip.ChipGroup$f
            r0 = 0
            r6.<init>(r8, r0)
            r8.f55710j = r6
            android.content.Context r0 = r8.getContext()
            int[] r2 = Ua.j.f53077U0
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r10
            r3 = r11
            android.content.res.TypedArray r10 = com.google.android.material.internal.l.h(r0, r1, r2, r3, r4, r5)
            int r11 = Ua.j.f53091W0
            int r11 = r10.getDimensionPixelOffset(r11, r7)
            int r0 = Ua.j.f53098X0
            int r0 = r10.getDimensionPixelOffset(r0, r11)
            r8.setChipSpacingHorizontal(r0)
            int r0 = Ua.j.f53105Y0
            int r11 = r10.getDimensionPixelOffset(r0, r11)
            r8.setChipSpacingVertical(r11)
            int r11 = Ua.j.f53120a1
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSingleLine((boolean) r11)
            int r11 = Ua.j.f53128b1
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSingleSelection((boolean) r11)
            int r11 = Ua.j.f53112Z0
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSelectionRequired(r11)
            int r11 = Ua.j.f53084V0
            r0 = -1
            int r11 = r10.getResourceId(r11, r0)
            r8.f55709i = r11
            r10.recycle()
            com.google.android.material.chip.ChipGroup$a r10 = new com.google.android.material.chip.ChipGroup$a
            r10.<init>()
            r9.o(r10)
            super.setOnHierarchyChangeListener(r6)
            r9 = 1
            androidx.core.view.C1680b0.y0(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public void setSingleLine(int i10) {
        setSingleLine(getResources().getBoolean(i10));
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
