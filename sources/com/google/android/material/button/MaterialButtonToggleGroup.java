package com.google.android.material.button;

import Ua.i;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.core.view.C1677a;
import androidx.core.view.C1680b0;
import androidx.core.view.C1718v;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.n;
import ib.C5014a;
import ib.C5016c;
import ib.C5024k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import y1.C2930A;

public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: k  reason: collision with root package name */
    private static final String f55638k = "MaterialButtonToggleGroup";

    /* renamed from: l  reason: collision with root package name */
    private static final int f55639l = i.f52924n;

    /* renamed from: a  reason: collision with root package name */
    private final List f55640a;

    /* renamed from: b  reason: collision with root package name */
    private final e f55641b;

    /* renamed from: c  reason: collision with root package name */
    private final LinkedHashSet f55642c;

    /* renamed from: d  reason: collision with root package name */
    private final Comparator f55643d;

    /* renamed from: e  reason: collision with root package name */
    private Integer[] f55644e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f55645f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f55646g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f55647h;

    /* renamed from: i  reason: collision with root package name */
    private final int f55648i;

    /* renamed from: j  reason: collision with root package name */
    private Set f55649j;

    class a implements Comparator {
        a() {
        }

        /* renamed from: a */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            return Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    class b extends C1677a {
        b() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, C2930A a10) {
            super.onInitializeAccessibilityNodeInfo(view, a10);
            a10.w0(C2930A.f.b(0, 1, MaterialButtonToggleGroup.this.j(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    private static class c {

        /* renamed from: e  reason: collision with root package name */
        private static final C5016c f55652e = new C5014a(0.0f);

        /* renamed from: a  reason: collision with root package name */
        C5016c f55653a;

        /* renamed from: b  reason: collision with root package name */
        C5016c f55654b;

        /* renamed from: c  reason: collision with root package name */
        C5016c f55655c;

        /* renamed from: d  reason: collision with root package name */
        C5016c f55656d;

        c(C5016c cVar, C5016c cVar2, C5016c cVar3, C5016c cVar4) {
            this.f55653a = cVar;
            this.f55654b = cVar3;
            this.f55655c = cVar4;
            this.f55656d = cVar2;
        }

        public static c a(c cVar) {
            C5016c cVar2 = f55652e;
            return new c(cVar2, cVar.f55656d, cVar2, cVar.f55655c);
        }

        public static c b(c cVar, View view) {
            if (n.e(view)) {
                return c(cVar);
            }
            return d(cVar);
        }

        public static c c(c cVar) {
            C5016c cVar2 = cVar.f55653a;
            C5016c cVar3 = cVar.f55656d;
            C5016c cVar4 = f55652e;
            return new c(cVar2, cVar3, cVar4, cVar4);
        }

        public static c d(c cVar) {
            C5016c cVar2 = f55652e;
            return new c(cVar2, cVar2, cVar.f55654b, cVar.f55655c);
        }

        public static c e(c cVar, View view) {
            if (n.e(view)) {
                return d(cVar);
            }
            return c(cVar);
        }

        public static c f(c cVar) {
            C5016c cVar2 = cVar.f55653a;
            C5016c cVar3 = f55652e;
            return new c(cVar2, cVar3, cVar.f55654b, cVar3);
        }
    }

    public interface d {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10);
    }

    private class e implements MaterialButton.a {
        private e() {
        }

        public void a(MaterialButton materialButton, boolean z10) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ e(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Ua.a.f52741s);
    }

    private void c() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
                MaterialButton i11 = i(i10);
                int min = Math.min(i11.getStrokeWidth(), i(i10 - 1).getStrokeWidth());
                LinearLayout.LayoutParams d10 = d(i11);
                if (getOrientation() == 0) {
                    C1718v.c(d10, 0);
                    C1718v.d(d10, -min);
                    d10.topMargin = 0;
                } else {
                    d10.bottomMargin = 0;
                    d10.topMargin = -min;
                    C1718v.d(d10, 0);
                }
                i11.setLayoutParams(d10);
            }
            o(firstVisibleChildIndex);
        }
    }

    private LinearLayout.LayoutParams d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    private void f(int i10, boolean z10) {
        if (i10 == -1) {
            String str = f55638k;
            Log.e(str, "Button ID is not valid: " + i10);
            return;
        }
        HashSet hashSet = new HashSet(this.f55649j);
        if (z10 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.f55646g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else if (!z10 && hashSet.contains(Integer.valueOf(i10))) {
            if (!this.f55647h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        } else {
            return;
        }
        r(hashSet);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (l(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (l(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && l(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private void h(int i10, boolean z10) {
        Iterator it = this.f55642c.iterator();
        while (it.hasNext()) {
            ((d) it.next()).a(this, i10, z10);
        }
    }

    private MaterialButton i(int i10) {
        return (MaterialButton) getChildAt(i10);
    }

    /* access modifiers changed from: private */
    public int j(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) == view) {
                return i10;
            }
            if ((getChildAt(i11) instanceof MaterialButton) && l(i11)) {
                i10++;
            }
        }
        return -1;
    }

    private c k(int i10, int i11, int i12) {
        boolean z10;
        c cVar = (c) this.f55640a.get(i10);
        if (i11 == i12) {
            return cVar;
        }
        if (getOrientation() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 == i11) {
            if (z10) {
                return c.e(cVar, this);
            }
            return c.f(cVar);
        } else if (i10 != i12) {
            return null;
        } else {
            if (z10) {
                return c.b(cVar, this);
            }
            return c.a(cVar);
        }
    }

    private boolean l(int i10) {
        if (getChildAt(i10).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    private void o(int i10) {
        if (getChildCount() != 0 && i10 != -1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) i(i10).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
                return;
            }
            C1718v.c(layoutParams, 0);
            C1718v.d(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    private void p(int i10, boolean z10) {
        View findViewById = findViewById(i10);
        if (findViewById instanceof MaterialButton) {
            this.f55645f = true;
            ((MaterialButton) findViewById).setChecked(z10);
            this.f55645f = false;
        }
    }

    private static void q(C5024k.b bVar, c cVar) {
        if (cVar == null) {
            bVar.o(0.0f);
        } else {
            bVar.C(cVar.f55653a).t(cVar.f55656d).H(cVar.f55654b).x(cVar.f55655c);
        }
    }

    private void r(Set set) {
        Set set2 = this.f55649j;
        this.f55649j = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = i(i10).getId();
            p(id2, set.contains(Integer.valueOf(id2)));
            if (set2.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                h(id2, set.contains(Integer.valueOf(id2)));
            }
        }
        invalidate();
    }

    private void s() {
        TreeMap treeMap = new TreeMap(this.f55643d);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put(i(i10), Integer.valueOf(i10));
        }
        this.f55644e = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(C1680b0.k());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f55641b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(f55638k, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        f(materialButton.getId(), materialButton.isChecked());
        C5024k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f55640a.add(new c(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
        C1680b0.o0(materialButton, new b());
    }

    public void b(d dVar) {
        this.f55642c.add(dVar);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        s();
        super.dispatchDraw(canvas);
    }

    public void e(int i10) {
        f(i10, true);
    }

    public void g() {
        r(new HashSet());
    }

    public int getCheckedButtonId() {
        if (!this.f55646g || this.f55649j.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f55649j.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = i(i10).getId();
            if (this.f55649j.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f55644e;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        Log.w(f55638k, "Child order wasn't updated");
        return i11;
    }

    public boolean m() {
        return this.f55646g;
    }

    /* access modifiers changed from: package-private */
    public void n(MaterialButton materialButton, boolean z10) {
        if (!this.f55645f) {
            f(materialButton.getId(), z10);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f55648i;
        if (i10 != -1) {
            r(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C2930A l12 = C2930A.l1(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (m()) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        l12.v0(C2930A.e.b(1, visibleButtonCount, false, i10));
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        t();
        c();
        super.onMeasure(i10, i11);
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal((MaterialButton.a) null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f55640a.remove(indexOfChild);
        }
        t();
        c();
    }

    public void setSelectionRequired(boolean z10) {
        this.f55647h = z10;
    }

    public void setSingleSelection(boolean z10) {
        if (this.f55646g != z10) {
            this.f55646g = z10;
            g();
        }
    }

    /* access modifiers changed from: package-private */
    public void t() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i10 = 0; i10 < childCount; i10++) {
            MaterialButton i11 = i(i10);
            if (i11.getVisibility() != 8) {
                C5024k.b v10 = i11.getShapeAppearanceModel().v();
                q(v10, k(i10, firstVisibleChildIndex, lastVisibleChildIndex));
                i11.setShapeAppearanceModel(v10.m());
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButtonToggleGroup(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = f55639l
            android.content.Context r7 = jb.C5041a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.f55640a = r7
            com.google.android.material.button.MaterialButtonToggleGroup$e r7 = new com.google.android.material.button.MaterialButtonToggleGroup$e
            r0 = 0
            r7.<init>(r6, r0)
            r6.f55641b = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.f55642c = r7
            com.google.android.material.button.MaterialButtonToggleGroup$a r7 = new com.google.android.material.button.MaterialButtonToggleGroup$a
            r7.<init>()
            r6.f55643d = r7
            r7 = 0
            r6.f55645f = r7
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r6.f55649j = r0
            android.content.Context r0 = r6.getContext()
            int[] r2 = Ua.j.f52957D2
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.l.h(r0, r1, r2, r3, r4, r5)
            int r9 = Ua.j.f52981G2
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setSingleSelection((boolean) r9)
            int r9 = Ua.j.f52965E2
            r0 = -1
            int r9 = r8.getResourceId(r9, r0)
            r6.f55648i = r9
            int r9 = Ua.j.f52973F2
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f55647h = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            r8.recycle()
            androidx.core.view.C1680b0.y0(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
