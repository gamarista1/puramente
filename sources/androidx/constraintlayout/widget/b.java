package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import com.amazon.a.a.o.b.f;
import i1.C2063e;
import i1.C2064f;
import i1.C2067i;
import i1.C2068j;
import java.util.Arrays;
import java.util.HashMap;

public abstract class b extends View {

    /* renamed from: a  reason: collision with root package name */
    protected int[] f14964a = new int[32];

    /* renamed from: b  reason: collision with root package name */
    protected int f14965b;

    /* renamed from: c  reason: collision with root package name */
    protected Context f14966c;

    /* renamed from: d  reason: collision with root package name */
    protected C2067i f14967d;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f14968e = false;

    /* renamed from: f  reason: collision with root package name */
    protected String f14969f;

    /* renamed from: g  reason: collision with root package name */
    protected String f14970g;

    /* renamed from: h  reason: collision with root package name */
    private View[] f14971h = null;

    /* renamed from: i  reason: collision with root package name */
    protected HashMap f14972i = new HashMap();

    public b(Context context) {
        super(context);
        this.f14966c = context;
        j((AttributeSet) null);
    }

    private void a(String str) {
        if (str != null && str.length() != 0 && this.f14966c != null) {
            String trim = str.trim();
            int i10 = i(trim);
            if (i10 != 0) {
                this.f14972i.put(Integer.valueOf(i10), trim);
                b(i10);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    private void b(int i10) {
        if (i10 != getId()) {
            int i11 = this.f14965b + 1;
            int[] iArr = this.f14964a;
            if (i11 > iArr.length) {
                this.f14964a = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f14964a;
            int i12 = this.f14965b;
            iArr2[i12] = i10;
            this.f14965b = i12 + 1;
        }
    }

    private void c(String str) {
        ConstraintLayout constraintLayout;
        if (str != null && str.length() != 0 && this.f14966c != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            } else {
                constraintLayout = null;
            }
            if (constraintLayout == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = constraintLayout.getChildAt(i10);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof ConstraintLayout.b) && trim.equals(((ConstraintLayout.b) layoutParams).f14893c0)) {
                    if (childAt.getId() == -1) {
                        Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                    } else {
                        b(childAt.getId());
                    }
                }
            }
        }
    }

    private int[] g(String str) {
        String[] split = str.split(f.f37529a);
        int[] iArr = new int[split.length];
        int i10 = 0;
        for (String trim : split) {
            int i11 = i(trim.trim());
            if (i11 != 0) {
                iArr[i10] = i11;
                i10++;
            }
        }
        if (i10 != split.length) {
            return Arrays.copyOf(iArr, i10);
        }
        return iArr;
    }

    private int h(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f14966c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int i(String str) {
        ConstraintLayout constraintLayout;
        if (getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) getParent();
        } else {
            constraintLayout = null;
        }
        int i10 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object l10 = constraintLayout.l(0, str);
            if (l10 instanceof Integer) {
                i10 = ((Integer) l10).intValue();
            }
        }
        if (i10 == 0 && constraintLayout != null) {
            i10 = h(constraintLayout, str);
        }
        if (i10 == 0) {
            try {
                i10 = g.class.getField(str).getInt((Object) null);
            } catch (Exception unused) {
            }
        }
        if (i10 == 0) {
            return this.f14966c.getResources().getIdentifier(str, "id", this.f14966c.getPackageName());
        }
        return i10;
    }

    /* access modifiers changed from: protected */
    public void d() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            e((ConstraintLayout) parent);
        }
    }

    /* access modifiers changed from: protected */
    public void e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f14965b; i10++) {
            View q10 = constraintLayout.q(this.f14964a[i10]);
            if (q10 != null) {
                q10.setVisibility(visibility);
                if (elevation > 0.0f) {
                    q10.setTranslationZ(q10.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void f(ConstraintLayout constraintLayout) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f14964a, this.f14965b);
    }

    /* access modifiers changed from: protected */
    public void j(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.f15351V0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == h.f15457f1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f14969f = string;
                    setIds(string);
                } else if (index == h.f15468g1) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f14970g = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void k(d.a aVar, C2068j jVar, ConstraintLayout.b bVar, SparseArray sparseArray) {
        d.b bVar2 = aVar.f15004e;
        int[] iArr = bVar2.f15068k0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = bVar2.f15070l0;
            if (str != null) {
                if (str.length() > 0) {
                    d.b bVar3 = aVar.f15004e;
                    bVar3.f15068k0 = g(bVar3.f15070l0);
                } else {
                    aVar.f15004e.f15068k0 = null;
                }
            }
        }
        if (jVar != null) {
            jVar.c();
            if (aVar.f15004e.f15068k0 != null) {
                int i10 = 0;
                while (true) {
                    int[] iArr2 = aVar.f15004e.f15068k0;
                    if (i10 < iArr2.length) {
                        C2063e eVar = (C2063e) sparseArray.get(iArr2[i10]);
                        if (eVar != null) {
                            jVar.a(eVar);
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void m(ConstraintLayout constraintLayout) {
    }

    public void n(ConstraintLayout constraintLayout) {
    }

    public void o(ConstraintLayout constraintLayout) {
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f14969f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f14970g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        if (this.f14968e) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        r1 = (java.lang.String) r5.f14972i.get(java.lang.Integer.valueOf(r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void p(androidx.constraintlayout.widget.ConstraintLayout r6) {
        /*
            r5 = this;
            boolean r0 = r5.isInEditMode()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.f14969f
            r5.setIds(r0)
        L_0x000b:
            i1.i r0 = r5.f14967d
            if (r0 != 0) goto L_0x0010
            return
        L_0x0010:
            r0.c()
            r0 = 0
        L_0x0014:
            int r1 = r5.f14965b
            if (r0 >= r1) goto L_0x0053
            int[] r1 = r5.f14964a
            r1 = r1[r0]
            android.view.View r2 = r6.q(r1)
            if (r2 != 0) goto L_0x0045
            java.util.HashMap r3 = r5.f14972i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r5.h(r6, r1)
            if (r3 == 0) goto L_0x0045
            int[] r2 = r5.f14964a
            r2[r0] = r3
            java.util.HashMap r2 = r5.f14972i
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.put(r4, r1)
            android.view.View r2 = r6.q(r3)
        L_0x0045:
            if (r2 == 0) goto L_0x0050
            i1.i r1 = r5.f14967d
            i1.e r2 = r6.r(r2)
            r1.a(r2)
        L_0x0050:
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0053:
            i1.i r0 = r5.f14967d
            i1.f r6 = r6.f14839c
            r0.b(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.b.p(androidx.constraintlayout.widget.ConstraintLayout):void");
    }

    public void q(C2064f fVar, C2067i iVar, SparseArray sparseArray) {
        iVar.c();
        for (int i10 = 0; i10 < this.f14965b; i10++) {
            iVar.a((C2063e) sparseArray.get(this.f14964a[i10]));
        }
    }

    public void r() {
        if (this.f14967d != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.b) {
                ((ConstraintLayout.b) layoutParams).f14931v0 = (C2063e) this.f14967d;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setIds(String str) {
        this.f14969f = str;
        if (str != null) {
            int i10 = 0;
            this.f14965b = 0;
            while (true) {
                int indexOf = str.indexOf(44, i10);
                if (indexOf == -1) {
                    a(str.substring(i10));
                    return;
                } else {
                    a(str.substring(i10, indexOf));
                    i10 = indexOf + 1;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setReferenceTags(String str) {
        this.f14970g = str;
        if (str != null) {
            int i10 = 0;
            this.f14965b = 0;
            while (true) {
                int indexOf = str.indexOf(44, i10);
                if (indexOf == -1) {
                    c(str.substring(i10));
                    return;
                } else {
                    c(str.substring(i10, indexOf));
                    i10 = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f14969f = null;
        this.f14965b = 0;
        for (int b10 : iArr) {
            b(b10);
        }
    }

    public void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.f14969f == null) {
            b(i10);
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14966c = context;
        j(attributeSet);
    }

    public void l(C2063e eVar, boolean z10) {
    }
}
