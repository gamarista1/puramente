package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.a.a.o.b.f;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.google.android.gms.common.api.a;
import f1.e;
import i1.C2062d;
import i1.C2063e;
import i1.C2064f;
import i1.C2066h;
import i1.C2069k;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.models.carousel.Carousel;
import j1.C2121b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: y  reason: collision with root package name */
    private static i f14836y;

    /* renamed from: a  reason: collision with root package name */
    SparseArray f14837a = new SparseArray();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f14838b = new ArrayList(4);
    /* access modifiers changed from: protected */

    /* renamed from: c  reason: collision with root package name */
    public C2064f f14839c = new C2064f();

    /* renamed from: d  reason: collision with root package name */
    private int f14840d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f14841e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f14842f = a.e.API_PRIORITY_OTHER;

    /* renamed from: g  reason: collision with root package name */
    private int f14843g = a.e.API_PRIORITY_OTHER;

    /* renamed from: h  reason: collision with root package name */
    protected boolean f14844h = true;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public int f14845i = 257;

    /* renamed from: j  reason: collision with root package name */
    private d f14846j = null;

    /* renamed from: k  reason: collision with root package name */
    protected c f14847k = null;

    /* renamed from: l  reason: collision with root package name */
    private int f14848l = -1;

    /* renamed from: m  reason: collision with root package name */
    private HashMap f14849m = new HashMap();

    /* renamed from: n  reason: collision with root package name */
    private int f14850n = -1;

    /* renamed from: o  reason: collision with root package name */
    private int f14851o = -1;

    /* renamed from: p  reason: collision with root package name */
    int f14852p = -1;

    /* renamed from: q  reason: collision with root package name */
    int f14853q = -1;

    /* renamed from: r  reason: collision with root package name */
    int f14854r = 0;

    /* renamed from: s  reason: collision with root package name */
    int f14855s = 0;

    /* renamed from: t  reason: collision with root package name */
    private SparseArray f14856t = new SparseArray();

    /* renamed from: u  reason: collision with root package name */
    c f14857u = new c(this);

    /* renamed from: v  reason: collision with root package name */
    private int f14858v = 0;

    /* renamed from: w  reason: collision with root package name */
    private int f14859w = 0;

    /* renamed from: x  reason: collision with root package name */
    private ArrayList f14860x;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f14861a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                i1.e$b[] r0 = i1.C2063e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14861a = r0
                i1.e$b r1 = i1.C2063e.b.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14861a     // Catch:{ NoSuchFieldError -> 0x001d }
                i1.e$b r1 = i1.C2063e.b.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f14861a     // Catch:{ NoSuchFieldError -> 0x0028 }
                i1.e$b r1 = i1.C2063e.b.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f14861a     // Catch:{ NoSuchFieldError -> 0x0033 }
                i1.e$b r1 = i1.C2063e.b.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.<clinit>():void");
        }
    }

    class c implements C2121b.C0361b {

        /* renamed from: a  reason: collision with root package name */
        ConstraintLayout f14938a;

        /* renamed from: b  reason: collision with root package name */
        int f14939b;

        /* renamed from: c  reason: collision with root package name */
        int f14940c;

        /* renamed from: d  reason: collision with root package name */
        int f14941d;

        /* renamed from: e  reason: collision with root package name */
        int f14942e;

        /* renamed from: f  reason: collision with root package name */
        int f14943f;

        /* renamed from: g  reason: collision with root package name */
        int f14944g;

        c(ConstraintLayout constraintLayout) {
            this.f14938a = constraintLayout;
        }

        private boolean d(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode2 == 1073741824 && ((mode == Integer.MIN_VALUE || mode == 0) && i12 == size)) {
                return true;
            }
            return false;
        }

        public final void a() {
            int childCount = this.f14938a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f14938a.getChildAt(i10);
            }
            int size = this.f14938a.f14838b.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    ((b) this.f14938a.f14838b.get(i11)).n(this.f14938a);
                }
            }
        }

        public final void b(C2063e eVar, C2121b.a aVar) {
            int i10;
            int i11;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            int i12;
            int i13;
            int i14;
            int i15;
            boolean z16;
            boolean z17;
            int i16;
            int i17;
            int i18;
            boolean z18;
            boolean z19;
            boolean z20;
            boolean z21;
            C2063e eVar2 = eVar;
            C2121b.a aVar2 = aVar;
            if (eVar2 != null) {
                if (eVar.X() == 8 && !eVar.l0()) {
                    aVar2.f22611e = 0;
                    aVar2.f22612f = 0;
                    aVar2.f22613g = 0;
                } else if (eVar.M() != null) {
                    e unused = ConstraintLayout.this.getClass();
                    C2063e.b bVar = aVar2.f22607a;
                    C2063e.b bVar2 = aVar2.f22608b;
                    int i19 = aVar2.f22609c;
                    int i20 = aVar2.f22610d;
                    int i21 = this.f14939b + this.f14940c;
                    int i22 = this.f14941d;
                    View view = (View) eVar.u();
                    int[] iArr = a.f14861a;
                    int i23 = iArr[bVar.ordinal()];
                    if (i23 == 1) {
                        i10 = View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
                    } else if (i23 == 2) {
                        i10 = ViewGroup.getChildMeasureSpec(this.f14943f, i22, -2);
                    } else if (i23 == 3) {
                        i10 = ViewGroup.getChildMeasureSpec(this.f14943f, i22 + eVar.D(), -1);
                    } else if (i23 != 4) {
                        i10 = 0;
                    } else {
                        i10 = ViewGroup.getChildMeasureSpec(this.f14943f, i22, -2);
                        if (eVar2.f21954w == 1) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        int i24 = aVar2.f22616j;
                        if (i24 == C2121b.a.f22605l || i24 == C2121b.a.f22606m) {
                            if (view.getMeasuredHeight() == eVar.z()) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            if (aVar2.f22616j == C2121b.a.f22606m || !z20 || ((z20 && z21) || eVar.p0())) {
                                i10 = View.MeasureSpec.makeMeasureSpec(eVar.Y(), 1073741824);
                            }
                        }
                    }
                    int i25 = iArr[bVar2.ordinal()];
                    if (i25 == 1) {
                        i11 = View.MeasureSpec.makeMeasureSpec(i20, 1073741824);
                    } else if (i25 == 2) {
                        i11 = ViewGroup.getChildMeasureSpec(this.f14944g, i21, -2);
                    } else if (i25 == 3) {
                        i11 = ViewGroup.getChildMeasureSpec(this.f14944g, i21 + eVar.W(), -1);
                    } else if (i25 != 4) {
                        i11 = 0;
                    } else {
                        i11 = ViewGroup.getChildMeasureSpec(this.f14944g, i21, -2);
                        if (eVar2.f21956x == 1) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        int i26 = aVar2.f22616j;
                        if (i26 == C2121b.a.f22605l || i26 == C2121b.a.f22606m) {
                            if (view.getMeasuredWidth() == eVar.Y()) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            if (aVar2.f22616j == C2121b.a.f22606m || !z18 || ((z18 && z19) || eVar.q0())) {
                                i11 = View.MeasureSpec.makeMeasureSpec(eVar.z(), 1073741824);
                            }
                        }
                    }
                    C2064f fVar = (C2064f) eVar.M();
                    if (fVar == null || !C2069k.b(ConstraintLayout.this.f14845i, 256) || view.getMeasuredWidth() != eVar.Y() || view.getMeasuredWidth() >= fVar.Y() || view.getMeasuredHeight() != eVar.z() || view.getMeasuredHeight() >= fVar.z() || view.getBaseline() != eVar.r() || eVar.o0() || !d(eVar.E(), i10, eVar.Y()) || !d(eVar.F(), i11, eVar.z())) {
                        C2063e.b bVar3 = C2063e.b.MATCH_CONSTRAINT;
                        if (bVar == bVar3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (bVar2 == bVar3) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        C2063e.b bVar4 = C2063e.b.MATCH_PARENT;
                        if (bVar2 == bVar4 || bVar2 == C2063e.b.FIXED) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (bVar == bVar4 || bVar == C2063e.b.FIXED) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z10 || eVar2.f21921f0 <= 0.0f) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        if (!z11 || eVar2.f21921f0 <= 0.0f) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        if (view != null) {
                            b bVar5 = (b) view.getLayoutParams();
                            int i27 = aVar2.f22616j;
                            if (i27 == C2121b.a.f22605l || i27 == C2121b.a.f22606m || !z10 || eVar2.f21954w != 0 || !z11 || eVar2.f21956x != 0) {
                                view.measure(i10, i11);
                                eVar2.a1(i10, i11);
                                int measuredWidth = view.getMeasuredWidth();
                                int measuredHeight = view.getMeasuredHeight();
                                i13 = view.getBaseline();
                                int i28 = eVar2.f21960z;
                                if (i28 > 0) {
                                    i12 = Math.max(i28, measuredWidth);
                                } else {
                                    i12 = measuredWidth;
                                }
                                int i29 = eVar2.f21864A;
                                if (i29 > 0) {
                                    i12 = Math.min(i29, i12);
                                }
                                int i30 = eVar2.f21868C;
                                if (i30 > 0) {
                                    i14 = Math.max(i30, measuredHeight);
                                    i16 = i10;
                                } else {
                                    i16 = i10;
                                    i14 = measuredHeight;
                                }
                                int i31 = eVar2.f21870D;
                                if (i31 > 0) {
                                    i14 = Math.min(i31, i14);
                                }
                                int i32 = i11;
                                if (!C2069k.b(ConstraintLayout.this.f14845i, 1)) {
                                    if (z14 && z12) {
                                        i12 = (int) ((((float) i14) * eVar2.f21921f0) + 0.5f);
                                    } else if (z15 && z13) {
                                        i14 = (int) ((((float) i12) / eVar2.f21921f0) + 0.5f);
                                    }
                                }
                                if (!(measuredWidth == i12 && measuredHeight == i14)) {
                                    if (measuredWidth != i12) {
                                        i17 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                                    } else {
                                        i17 = i16;
                                    }
                                    if (measuredHeight != i14) {
                                        i18 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                                    } else {
                                        i18 = i32;
                                    }
                                    view.measure(i17, i18);
                                    eVar2.a1(i17, i18);
                                    i12 = view.getMeasuredWidth();
                                    i14 = view.getMeasuredHeight();
                                    i13 = view.getBaseline();
                                }
                                i15 = -1;
                            } else {
                                i15 = -1;
                                i14 = 0;
                                i13 = 0;
                                i12 = 0;
                            }
                            if (i13 != i15) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (i12 == aVar2.f22609c && i14 == aVar2.f22610d) {
                                z17 = false;
                            } else {
                                z17 = true;
                            }
                            aVar2.f22615i = z17;
                            if (bVar5.f14901g0) {
                                z16 = true;
                            }
                            if (!(!z16 || i13 == -1 || eVar.r() == i13)) {
                                aVar2.f22615i = true;
                            }
                            aVar2.f22611e = i12;
                            aVar2.f22612f = i14;
                            aVar2.f22614h = z16;
                            aVar2.f22613g = i13;
                            e unused2 = ConstraintLayout.this.getClass();
                            return;
                        }
                        return;
                    }
                    aVar2.f22611e = eVar.Y();
                    aVar2.f22612f = eVar.z();
                    aVar2.f22613g = eVar.r();
                }
            }
        }

        public void c(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f14939b = i12;
            this.f14940c = i13;
            this.f14941d = i14;
            this.f14942e = i15;
            this.f14943f = i10;
            this.f14944g = i11;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        s(attributeSet, 0, 0);
    }

    private void B(C2063e eVar, b bVar, SparseArray sparseArray, int i10, C2062d.a aVar) {
        View view = (View) this.f14837a.get(i10);
        C2063e eVar2 = (C2063e) sparseArray.get(i10);
        if (eVar2 != null && view != null && (view.getLayoutParams() instanceof b)) {
            bVar.f14901g0 = true;
            C2062d.a aVar2 = C2062d.a.BASELINE;
            if (aVar == aVar2) {
                b bVar2 = (b) view.getLayoutParams();
                bVar2.f14901g0 = true;
                bVar2.f14931v0.P0(true);
            }
            eVar.q(aVar2).b(eVar2.q(aVar), bVar.f14865D, bVar.f14864C, true);
            eVar.P0(true);
            eVar.q(C2062d.a.TOP).q();
            eVar.q(C2062d.a.BOTTOM).q();
        }
    }

    private boolean C() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            } else if (getChildAt(i10).isLayoutRequested()) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        if (z10) {
            y();
        }
        return z10;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    public static i getSharedValues() {
        if (f14836y == null) {
            f14836y = new i();
        }
        return f14836y;
    }

    private C2063e p(int i10) {
        if (i10 == 0) {
            return this.f14839c;
        }
        View view = (View) this.f14837a.get(i10);
        if (view == null && (view = findViewById(i10)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f14839c;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f14931v0;
    }

    private void s(AttributeSet attributeSet, int i10, int i11) {
        this.f14839c.G0(this);
        this.f14839c.b2(this.f14857u);
        this.f14837a.put(getId(), this);
        this.f14846j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.f15351V0, i10, i11);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = obtainStyledAttributes.getIndex(i12);
                if (index == h.f15391Z0) {
                    this.f14840d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f14840d);
                } else if (index == h.f15402a1) {
                    this.f14841e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f14841e);
                } else if (index == h.f15371X0) {
                    this.f14842f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f14842f);
                } else if (index == h.f15381Y0) {
                    this.f14843g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f14843g);
                } else if (index == h.f15544n2) {
                    this.f14845i = obtainStyledAttributes.getInt(index, this.f14845i);
                } else if (index == h.f15490i1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            v(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f14847k = null;
                        }
                    }
                } else if (index == h.f15446e1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        d dVar = new d();
                        this.f14846j = dVar;
                        dVar.C(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f14846j = null;
                    }
                    this.f14848l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f14839c.c2(this.f14845i);
    }

    private void u() {
        this.f14844h = true;
        this.f14850n = -1;
        this.f14851o = -1;
        this.f14852p = -1;
        this.f14853q = -1;
        this.f14854r = 0;
        this.f14855s = 0;
    }

    private void y() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            C2063e r10 = r(getChildAt(i10));
            if (r10 != null) {
                r10.v0();
            }
        }
        if (isInEditMode) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    z(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    p(childAt.getId()).H0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f14848l != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                getChildAt(i12).getId();
            }
        }
        d dVar = this.f14846j;
        if (dVar != null) {
            dVar.k(this, true);
        }
        this.f14839c.z1();
        int size = this.f14838b.size();
        if (size > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                ((b) this.f14838b.get(i13)).p(this);
            }
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            getChildAt(i14);
        }
        this.f14856t.clear();
        this.f14856t.put(0, this.f14839c);
        this.f14856t.put(getId(), this.f14839c);
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            this.f14856t.put(childAt2.getId(), r(childAt2));
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt3 = getChildAt(i16);
            C2063e r11 = r(childAt3);
            if (r11 != null) {
                this.f14839c.a(r11);
                d(isInEditMode, childAt3, r11, (b) childAt3.getLayoutParams(), this.f14856t);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void A(C2064f fVar, int i10, int i11, int i12, int i13) {
        C2063e.b bVar;
        c cVar = this.f14857u;
        int i14 = cVar.f14942e;
        int i15 = cVar.f14941d;
        C2063e.b bVar2 = C2063e.b.FIXED;
        int childCount = getChildCount();
        if (i10 != Integer.MIN_VALUE) {
            if (i10 == 0) {
                bVar = C2063e.b.WRAP_CONTENT;
                if (childCount == 0) {
                    i11 = Math.max(0, this.f14840d);
                }
            } else if (i10 != 1073741824) {
                bVar = bVar2;
            } else {
                i11 = Math.min(this.f14842f - i15, i11);
                bVar = bVar2;
            }
            i11 = 0;
        } else {
            bVar = C2063e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i11 = Math.max(0, this.f14840d);
            }
        }
        if (i12 != Integer.MIN_VALUE) {
            if (i12 == 0) {
                bVar2 = C2063e.b.WRAP_CONTENT;
                if (childCount == 0) {
                    i13 = Math.max(0, this.f14841e);
                }
            } else if (i12 == 1073741824) {
                i13 = Math.min(this.f14843g - i14, i13);
            }
            i13 = 0;
        } else {
            bVar2 = C2063e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.f14841e);
            }
        }
        if (!(i11 == fVar.Y() && i13 == fVar.z())) {
            fVar.T1();
        }
        fVar.r1(0);
        fVar.s1(0);
        fVar.c1(this.f14842f - i15);
        fVar.b1(this.f14843g - i14);
        fVar.f1(0);
        fVar.e1(0);
        fVar.U0(bVar);
        fVar.p1(i11);
        fVar.l1(bVar2);
        fVar.Q0(i13);
        fVar.f1(this.f14840d - i15);
        fVar.e1(this.f14841e - i14);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    /* access modifiers changed from: protected */
    public void d(boolean z10, View view, C2063e eVar, b bVar, SparseArray sparseArray) {
        int i10;
        C2063e eVar2;
        C2063e eVar3;
        C2063e eVar4;
        C2063e eVar5;
        View view2 = view;
        C2063e eVar6 = eVar;
        b bVar2 = bVar;
        SparseArray sparseArray2 = sparseArray;
        bVar.b();
        bVar2.f14933w0 = false;
        eVar6.o1(view.getVisibility());
        if (bVar2.f14907j0) {
            eVar6.Y0(true);
            eVar6.o1(8);
        }
        eVar6.G0(view2);
        if (view2 instanceof b) {
            ((b) view2).l(eVar6, this.f14839c.V1());
        }
        if (bVar2.f14903h0) {
            C2066h hVar = (C2066h) eVar6;
            int i11 = bVar2.f14925s0;
            int i12 = bVar2.f14927t0;
            float f10 = bVar2.f14929u0;
            if (f10 != -1.0f) {
                hVar.E1(f10);
            } else if (i11 != -1) {
                hVar.C1(i11);
            } else if (i12 != -1) {
                hVar.D1(i12);
            }
        } else {
            int i13 = bVar2.f14911l0;
            int i14 = bVar2.f14913m0;
            int i15 = bVar2.f14915n0;
            int i16 = bVar2.f14917o0;
            int i17 = bVar2.f14919p0;
            int i18 = bVar2.f14921q0;
            float f11 = bVar2.f14923r0;
            int i19 = bVar2.f14918p;
            if (i19 != -1) {
                C2063e eVar7 = (C2063e) sparseArray2.get(i19);
                if (eVar7 != null) {
                    eVar6.m(eVar7, bVar2.f14922r, bVar2.f14920q);
                }
            } else {
                if (i13 != -1) {
                    C2063e eVar8 = (C2063e) sparseArray2.get(i13);
                    if (eVar8 != null) {
                        C2062d.a aVar = C2062d.a.LEFT;
                        eVar.g0(aVar, eVar8, aVar, bVar2.leftMargin, i17);
                    }
                } else if (!(i14 == -1 || (eVar5 = (C2063e) sparseArray2.get(i14)) == null)) {
                    eVar.g0(C2062d.a.LEFT, eVar5, C2062d.a.RIGHT, bVar2.leftMargin, i17);
                }
                if (i15 != -1) {
                    C2063e eVar9 = (C2063e) sparseArray2.get(i15);
                    if (eVar9 != null) {
                        eVar.g0(C2062d.a.RIGHT, eVar9, C2062d.a.LEFT, bVar2.rightMargin, i18);
                    }
                } else if (!(i16 == -1 || (eVar4 = (C2063e) sparseArray2.get(i16)) == null)) {
                    C2062d.a aVar2 = C2062d.a.RIGHT;
                    eVar.g0(aVar2, eVar4, aVar2, bVar2.rightMargin, i18);
                }
                int i20 = bVar2.f14904i;
                if (i20 != -1) {
                    C2063e eVar10 = (C2063e) sparseArray2.get(i20);
                    if (eVar10 != null) {
                        C2062d.a aVar3 = C2062d.a.TOP;
                        eVar.g0(aVar3, eVar10, aVar3, bVar2.topMargin, bVar2.f14934x);
                    }
                } else {
                    int i21 = bVar2.f14906j;
                    if (!(i21 == -1 || (eVar3 = (C2063e) sparseArray2.get(i21)) == null)) {
                        eVar.g0(C2062d.a.TOP, eVar3, C2062d.a.BOTTOM, bVar2.topMargin, bVar2.f14934x);
                    }
                }
                int i22 = bVar2.f14908k;
                if (i22 != -1) {
                    C2063e eVar11 = (C2063e) sparseArray2.get(i22);
                    if (eVar11 != null) {
                        eVar.g0(C2062d.a.BOTTOM, eVar11, C2062d.a.TOP, bVar2.bottomMargin, bVar2.f14936z);
                    }
                } else {
                    int i23 = bVar2.f14910l;
                    if (!(i23 == -1 || (eVar2 = (C2063e) sparseArray2.get(i23)) == null)) {
                        C2062d.a aVar4 = C2062d.a.BOTTOM;
                        eVar.g0(aVar4, eVar2, aVar4, bVar2.bottomMargin, bVar2.f14936z);
                    }
                }
                int i24 = bVar2.f14912m;
                if (i24 != -1) {
                    B(eVar, bVar, sparseArray, i24, C2062d.a.BASELINE);
                } else {
                    int i25 = bVar2.f14914n;
                    if (i25 != -1) {
                        B(eVar, bVar, sparseArray, i25, C2062d.a.TOP);
                    } else {
                        int i26 = bVar2.f14916o;
                        if (i26 != -1) {
                            B(eVar, bVar, sparseArray, i26, C2062d.a.BOTTOM);
                        }
                    }
                }
                if (f11 >= 0.0f) {
                    eVar6.R0(f11);
                }
                float f12 = bVar2.f14869H;
                if (f12 >= 0.0f) {
                    eVar6.i1(f12);
                }
            }
            if (z10 && !((i10 = bVar2.f14885X) == -1 && bVar2.f14886Y == -1)) {
                eVar6.g1(i10, bVar2.f14886Y);
            }
            if (bVar2.f14897e0) {
                eVar6.U0(C2063e.b.FIXED);
                eVar6.p1(bVar2.width);
                if (bVar2.width == -2) {
                    eVar6.U0(C2063e.b.WRAP_CONTENT);
                }
            } else if (bVar2.width == -1) {
                if (bVar2.f14889a0) {
                    eVar6.U0(C2063e.b.MATCH_CONSTRAINT);
                } else {
                    eVar6.U0(C2063e.b.MATCH_PARENT);
                }
                eVar6.q(C2062d.a.LEFT).f21850g = bVar2.leftMargin;
                eVar6.q(C2062d.a.RIGHT).f21850g = bVar2.rightMargin;
            } else {
                eVar6.U0(C2063e.b.MATCH_CONSTRAINT);
                eVar6.p1(0);
            }
            if (bVar2.f14899f0) {
                eVar6.l1(C2063e.b.FIXED);
                eVar6.Q0(bVar2.height);
                if (bVar2.height == -2) {
                    eVar6.l1(C2063e.b.WRAP_CONTENT);
                }
            } else if (bVar2.height == -1) {
                if (bVar2.f14891b0) {
                    eVar6.l1(C2063e.b.MATCH_CONSTRAINT);
                } else {
                    eVar6.l1(C2063e.b.MATCH_PARENT);
                }
                eVar6.q(C2062d.a.TOP).f21850g = bVar2.topMargin;
                eVar6.q(C2062d.a.BOTTOM).f21850g = bVar2.bottomMargin;
            } else {
                eVar6.l1(C2063e.b.MATCH_CONSTRAINT);
                eVar6.Q0(0);
            }
            eVar6.I0(bVar2.f14870I);
            eVar6.W0(bVar2.f14873L);
            eVar6.n1(bVar2.f14874M);
            eVar6.S0(bVar2.f14875N);
            eVar6.j1(bVar2.f14876O);
            eVar6.q1(bVar2.f14895d0);
            eVar6.V0(bVar2.f14877P, bVar2.f14879R, bVar2.f14881T, bVar2.f14883V);
            eVar6.m1(bVar2.f14878Q, bVar2.f14880S, bVar2.f14882U, bVar2.f14884W);
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f14838b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                ((b) this.f14838b.get(i10)).o(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(f.f37529a);
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i12 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i13 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = (float) i12;
                        float f11 = (float) i13;
                        float f12 = (float) (i12 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f13 = f11;
                        float f14 = f11;
                        float f15 = f12;
                        float f16 = f10;
                        Paint paint2 = paint;
                        canvas2.drawLine(f10, f13, f15, f14, paint);
                        float parseInt4 = (float) (i13 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f17 = f12;
                        float f18 = parseInt4;
                        canvas2.drawLine(f17, f14, f15, f18, paint);
                        float f19 = parseInt4;
                        float f20 = f16;
                        canvas2.drawLine(f17, f19, f20, f18, paint);
                        float f21 = f16;
                        canvas2.drawLine(f21, f19, f20, f14, paint);
                        paint.setColor(-16711936);
                        float f22 = f12;
                        Paint paint3 = paint;
                        canvas2.drawLine(f21, f14, f22, parseInt4, paint);
                        canvas2.drawLine(f21, parseInt4, f22, f14, paint);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean e(int i10, int i11) {
        if (this.f14860x == null) {
            return false;
        }
        View.MeasureSpec.getSize(i10);
        View.MeasureSpec.getSize(i11);
        Iterator it = this.f14860x.iterator();
        while (it.hasNext()) {
            android.support.v4.media.session.c.a(it.next());
            Iterator it2 = this.f14839c.w1().iterator();
            if (it2.hasNext()) {
                View view = (View) ((C2063e) it2.next()).u();
                view.getId();
                b bVar = (b) view.getLayoutParams();
                throw null;
            }
        }
        return false;
    }

    public void forceLayout() {
        u();
        super.forceLayout();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    public int getMaxHeight() {
        return this.f14843g;
    }

    public int getMaxWidth() {
        return this.f14842f;
    }

    public int getMinHeight() {
        return this.f14841e;
    }

    public int getMinWidth() {
        return this.f14840d;
    }

    public int getOptimizationLevel() {
        return this.f14839c.P1();
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        if (this.f14839c.f21938o == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.f14839c.f21938o = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.f14839c.f21938o = "parent";
            }
        }
        if (this.f14839c.v() == null) {
            C2064f fVar = this.f14839c;
            fVar.H0(fVar.f21938o);
            Log.v("ConstraintLayout", " setDebugName " + this.f14839c.v());
        }
        Iterator it = this.f14839c.w1().iterator();
        while (it.hasNext()) {
            C2063e eVar = (C2063e) it.next();
            View view = (View) eVar.u();
            if (view != null) {
                if (eVar.f21938o == null && (id2 = view.getId()) != -1) {
                    eVar.f21938o = getContext().getResources().getResourceEntryName(id2);
                }
                if (eVar.v() == null) {
                    eVar.H0(eVar.f21938o);
                    Log.v("ConstraintLayout", " setDebugName " + eVar.v());
                }
            }
        }
        this.f14839c.Q(sb2);
        return sb2.toString();
    }

    /* renamed from: h */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object l(int i10, Object obj) {
        if (i10 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap hashMap = this.f14849m;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f14849m.get(str);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            b bVar = (b) childAt.getLayoutParams();
            C2063e eVar = bVar.f14931v0;
            if ((childAt.getVisibility() != 8 || bVar.f14903h0 || bVar.f14905i0 || bVar.f14909k0 || isInEditMode) && !bVar.f14907j0) {
                int Z10 = eVar.Z();
                int a02 = eVar.a0();
                childAt.layout(Z10, a02, eVar.Y() + Z10, eVar.z() + a02);
            }
        }
        int size = this.f14838b.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                ((b) this.f14838b.get(i15)).m(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        boolean e10 = this.f14844h | e(i10, i11);
        this.f14844h = e10;
        if (!e10) {
            int childCount = getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                } else if (getChildAt(i12).isLayoutRequested()) {
                    this.f14844h = true;
                    break;
                } else {
                    i12++;
                }
            }
        }
        this.f14858v = i10;
        this.f14859w = i11;
        this.f14839c.e2(t());
        if (this.f14844h) {
            this.f14844h = false;
            if (C()) {
                this.f14839c.g2();
            }
        }
        this.f14839c.N1((e) null);
        x(this.f14839c, this.f14845i, i10, i11);
        w(i10, i11, this.f14839c.Y(), this.f14839c.z(), this.f14839c.W1(), this.f14839c.U1());
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C2063e r10 = r(view);
        if ((view instanceof Guideline) && !(r10 instanceof C2066h)) {
            b bVar = (b) view.getLayoutParams();
            C2066h hVar = new C2066h();
            bVar.f14931v0 = hVar;
            bVar.f14903h0 = true;
            hVar.F1(bVar.f14887Z);
        }
        if (view instanceof b) {
            b bVar2 = (b) view;
            bVar2.r();
            ((b) view.getLayoutParams()).f14905i0 = true;
            if (!this.f14838b.contains(bVar2)) {
                this.f14838b.add(bVar2);
            }
        }
        this.f14837a.put(view.getId(), view);
        this.f14844h = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f14837a.remove(view.getId());
        this.f14839c.y1(r(view));
        this.f14838b.remove(view);
        this.f14844h = true;
    }

    public View q(int i10) {
        return (View) this.f14837a.get(i10);
    }

    public final C2063e r(View view) {
        if (view == this) {
            return this.f14839c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f14931v0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f14931v0;
        }
        return null;
    }

    public void requestLayout() {
        u();
        super.requestLayout();
    }

    public void setConstraintSet(d dVar) {
        this.f14846j = dVar;
    }

    public void setId(int i10) {
        this.f14837a.remove(getId());
        super.setId(i10);
        this.f14837a.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 != this.f14843g) {
            this.f14843g = i10;
            requestLayout();
        }
    }

    public void setMaxWidth(int i10) {
        if (i10 != this.f14842f) {
            this.f14842f = i10;
            requestLayout();
        }
    }

    public void setMinHeight(int i10) {
        if (i10 != this.f14841e) {
            this.f14841e = i10;
            requestLayout();
        }
    }

    public void setMinWidth(int i10) {
        if (i10 != this.f14840d) {
            this.f14840d = i10;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(f fVar) {
        c cVar = this.f14847k;
        if (cVar != null) {
            cVar.c(fVar);
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f14845i = i10;
        this.f14839c.c2(i10);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean t() {
        if ((getContext().getApplicationInfo().flags & 4194304) == 0 || 1 != getLayoutDirection()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void v(int i10) {
        this.f14847k = new c(getContext(), this, i10);
    }

    /* access modifiers changed from: protected */
    public void w(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        c cVar = this.f14857u;
        int i14 = cVar.f14942e;
        int resolveSizeAndState = View.resolveSizeAndState(i12 + cVar.f14941d, i10, 0);
        int min = Math.min(this.f14842f, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f14843g, View.resolveSizeAndState(i13 + i14, i11, 0) & 16777215);
        if (z10) {
            min |= 16777216;
        }
        if (z11) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.f14850n = min;
        this.f14851o = min2;
    }

    /* access modifiers changed from: protected */
    public void x(C2064f fVar, int i10, int i11, int i12) {
        int i13;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i14 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.f14857u.c(i11, i12, max, max2, paddingWidth, i14);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        if (max3 <= 0 && max4 <= 0) {
            i13 = Math.max(0, getPaddingLeft());
        } else if (t()) {
            i13 = max4;
        } else {
            i13 = max3;
        }
        int i15 = size - paddingWidth;
        int i16 = size2 - i14;
        A(fVar, mode, i15, mode2, i16);
        fVar.X1(i10, mode, i15, mode2, i16, this.f14850n, this.f14851o, i13, max);
    }

    public void z(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f14849m == null) {
                this.f14849m = new HashMap();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.f14849m.put(str, num);
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        s(attributeSet, i10, 0);
    }

    public static class b extends ViewGroup.MarginLayoutParams {

        /* renamed from: A  reason: collision with root package name */
        public int f14862A = Integer.MIN_VALUE;

        /* renamed from: B  reason: collision with root package name */
        public int f14863B = Integer.MIN_VALUE;

        /* renamed from: C  reason: collision with root package name */
        public int f14864C = Integer.MIN_VALUE;

        /* renamed from: D  reason: collision with root package name */
        public int f14865D = 0;

        /* renamed from: E  reason: collision with root package name */
        boolean f14866E = true;

        /* renamed from: F  reason: collision with root package name */
        boolean f14867F = true;

        /* renamed from: G  reason: collision with root package name */
        public float f14868G = 0.5f;

        /* renamed from: H  reason: collision with root package name */
        public float f14869H = 0.5f;

        /* renamed from: I  reason: collision with root package name */
        public String f14870I = null;

        /* renamed from: J  reason: collision with root package name */
        float f14871J = 0.0f;

        /* renamed from: K  reason: collision with root package name */
        int f14872K = 1;

        /* renamed from: L  reason: collision with root package name */
        public float f14873L = -1.0f;

        /* renamed from: M  reason: collision with root package name */
        public float f14874M = -1.0f;

        /* renamed from: N  reason: collision with root package name */
        public int f14875N = 0;

        /* renamed from: O  reason: collision with root package name */
        public int f14876O = 0;

        /* renamed from: P  reason: collision with root package name */
        public int f14877P = 0;

        /* renamed from: Q  reason: collision with root package name */
        public int f14878Q = 0;

        /* renamed from: R  reason: collision with root package name */
        public int f14879R = 0;

        /* renamed from: S  reason: collision with root package name */
        public int f14880S = 0;

        /* renamed from: T  reason: collision with root package name */
        public int f14881T = 0;

        /* renamed from: U  reason: collision with root package name */
        public int f14882U = 0;

        /* renamed from: V  reason: collision with root package name */
        public float f14883V = 1.0f;

        /* renamed from: W  reason: collision with root package name */
        public float f14884W = 1.0f;

        /* renamed from: X  reason: collision with root package name */
        public int f14885X = -1;

        /* renamed from: Y  reason: collision with root package name */
        public int f14886Y = -1;

        /* renamed from: Z  reason: collision with root package name */
        public int f14887Z = -1;

        /* renamed from: a  reason: collision with root package name */
        public int f14888a = -1;

        /* renamed from: a0  reason: collision with root package name */
        public boolean f14889a0 = false;

        /* renamed from: b  reason: collision with root package name */
        public int f14890b = -1;

        /* renamed from: b0  reason: collision with root package name */
        public boolean f14891b0 = false;

        /* renamed from: c  reason: collision with root package name */
        public float f14892c = -1.0f;

        /* renamed from: c0  reason: collision with root package name */
        public String f14893c0 = null;

        /* renamed from: d  reason: collision with root package name */
        public boolean f14894d = true;

        /* renamed from: d0  reason: collision with root package name */
        public int f14895d0 = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f14896e = -1;

        /* renamed from: e0  reason: collision with root package name */
        boolean f14897e0 = true;

        /* renamed from: f  reason: collision with root package name */
        public int f14898f = -1;

        /* renamed from: f0  reason: collision with root package name */
        boolean f14899f0 = true;

        /* renamed from: g  reason: collision with root package name */
        public int f14900g = -1;

        /* renamed from: g0  reason: collision with root package name */
        boolean f14901g0 = false;

        /* renamed from: h  reason: collision with root package name */
        public int f14902h = -1;

        /* renamed from: h0  reason: collision with root package name */
        boolean f14903h0 = false;

        /* renamed from: i  reason: collision with root package name */
        public int f14904i = -1;

        /* renamed from: i0  reason: collision with root package name */
        boolean f14905i0 = false;

        /* renamed from: j  reason: collision with root package name */
        public int f14906j = -1;

        /* renamed from: j0  reason: collision with root package name */
        boolean f14907j0 = false;

        /* renamed from: k  reason: collision with root package name */
        public int f14908k = -1;

        /* renamed from: k0  reason: collision with root package name */
        boolean f14909k0 = false;

        /* renamed from: l  reason: collision with root package name */
        public int f14910l = -1;

        /* renamed from: l0  reason: collision with root package name */
        int f14911l0 = -1;

        /* renamed from: m  reason: collision with root package name */
        public int f14912m = -1;

        /* renamed from: m0  reason: collision with root package name */
        int f14913m0 = -1;

        /* renamed from: n  reason: collision with root package name */
        public int f14914n = -1;

        /* renamed from: n0  reason: collision with root package name */
        int f14915n0 = -1;

        /* renamed from: o  reason: collision with root package name */
        public int f14916o = -1;

        /* renamed from: o0  reason: collision with root package name */
        int f14917o0 = -1;

        /* renamed from: p  reason: collision with root package name */
        public int f14918p = -1;

        /* renamed from: p0  reason: collision with root package name */
        int f14919p0 = Integer.MIN_VALUE;

        /* renamed from: q  reason: collision with root package name */
        public int f14920q = 0;

        /* renamed from: q0  reason: collision with root package name */
        int f14921q0 = Integer.MIN_VALUE;

        /* renamed from: r  reason: collision with root package name */
        public float f14922r = 0.0f;

        /* renamed from: r0  reason: collision with root package name */
        float f14923r0 = 0.5f;

        /* renamed from: s  reason: collision with root package name */
        public int f14924s = -1;

        /* renamed from: s0  reason: collision with root package name */
        int f14925s0;

        /* renamed from: t  reason: collision with root package name */
        public int f14926t = -1;

        /* renamed from: t0  reason: collision with root package name */
        int f14927t0;

        /* renamed from: u  reason: collision with root package name */
        public int f14928u = -1;

        /* renamed from: u0  reason: collision with root package name */
        float f14929u0;

        /* renamed from: v  reason: collision with root package name */
        public int f14930v = -1;

        /* renamed from: v0  reason: collision with root package name */
        C2063e f14931v0 = new C2063e();

        /* renamed from: w  reason: collision with root package name */
        public int f14932w = Integer.MIN_VALUE;

        /* renamed from: w0  reason: collision with root package name */
        public boolean f14933w0 = false;

        /* renamed from: x  reason: collision with root package name */
        public int f14934x = Integer.MIN_VALUE;

        /* renamed from: y  reason: collision with root package name */
        public int f14935y = Integer.MIN_VALUE;

        /* renamed from: z  reason: collision with root package name */
        public int f14936z = Integer.MIN_VALUE;

        private static class a {

            /* renamed from: a  reason: collision with root package name */
            public static final SparseIntArray f14937a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f14937a = sparseIntArray;
                sparseIntArray.append(h.f15382Y1, 64);
                sparseIntArray.append(h.f15152B1, 65);
                sparseIntArray.append(h.f15242K1, 8);
                sparseIntArray.append(h.f15252L1, 9);
                sparseIntArray.append(h.f15272N1, 10);
                sparseIntArray.append(h.f15282O1, 11);
                sparseIntArray.append(h.f15342U1, 12);
                sparseIntArray.append(h.f15332T1, 13);
                sparseIntArray.append(h.f15583r1, 14);
                sparseIntArray.append(h.f15573q1, 15);
                sparseIntArray.append(h.f15533m1, 16);
                sparseIntArray.append(h.f15553o1, 52);
                sparseIntArray.append(h.f15543n1, 53);
                sparseIntArray.append(h.f15593s1, 2);
                sparseIntArray.append(h.f15613u1, 3);
                sparseIntArray.append(h.f15603t1, 4);
                sparseIntArray.append(h.f15436d2, 49);
                sparseIntArray.append(h.f15447e2, 50);
                sparseIntArray.append(h.f15653y1, 5);
                sparseIntArray.append(h.f15663z1, 6);
                sparseIntArray.append(h.f15142A1, 7);
                sparseIntArray.append(h.f15479h1, 67);
                sparseIntArray.append(h.f15361W0, 1);
                sparseIntArray.append(h.f15292P1, 17);
                sparseIntArray.append(h.f15302Q1, 18);
                sparseIntArray.append(h.f15643x1, 19);
                sparseIntArray.append(h.f15633w1, 20);
                sparseIntArray.append(h.f15491i2, 21);
                sparseIntArray.append(h.f15524l2, 22);
                sparseIntArray.append(h.f15502j2, 23);
                sparseIntArray.append(h.f15469g2, 24);
                sparseIntArray.append(h.f15513k2, 25);
                sparseIntArray.append(h.f15480h2, 26);
                sparseIntArray.append(h.f15458f2, 55);
                sparseIntArray.append(h.f15534m2, 54);
                sparseIntArray.append(h.f15202G1, 29);
                sparseIntArray.append(h.f15352V1, 30);
                sparseIntArray.append(h.f15623v1, 44);
                sparseIntArray.append(h.f15222I1, 45);
                sparseIntArray.append(h.f15372X1, 46);
                sparseIntArray.append(h.f15212H1, 47);
                sparseIntArray.append(h.f15362W1, 48);
                sparseIntArray.append(h.f15512k1, 27);
                sparseIntArray.append(h.f15501j1, 28);
                sparseIntArray.append(h.f15392Z1, 31);
                sparseIntArray.append(h.f15162C1, 32);
                sparseIntArray.append(h.f15414b2, 33);
                sparseIntArray.append(h.f15403a2, 34);
                sparseIntArray.append(h.f15425c2, 35);
                sparseIntArray.append(h.f15182E1, 36);
                sparseIntArray.append(h.f15172D1, 37);
                sparseIntArray.append(h.f15192F1, 38);
                sparseIntArray.append(h.f15232J1, 39);
                sparseIntArray.append(h.f15322S1, 40);
                sparseIntArray.append(h.f15262M1, 41);
                sparseIntArray.append(h.f15563p1, 42);
                sparseIntArray.append(h.f15523l1, 43);
                sparseIntArray.append(h.f15312R1, 51);
                sparseIntArray.append(h.f15554o2, 66);
            }
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.leftMargin = marginLayoutParams.leftMargin;
                this.rightMargin = marginLayoutParams.rightMargin;
                this.topMargin = marginLayoutParams.topMargin;
                this.bottomMargin = marginLayoutParams.bottomMargin;
                setMarginStart(marginLayoutParams.getMarginStart());
                setMarginEnd(marginLayoutParams.getMarginEnd());
            }
            if (layoutParams instanceof b) {
                b bVar = (b) layoutParams;
                this.f14888a = bVar.f14888a;
                this.f14890b = bVar.f14890b;
                this.f14892c = bVar.f14892c;
                this.f14894d = bVar.f14894d;
                this.f14896e = bVar.f14896e;
                this.f14898f = bVar.f14898f;
                this.f14900g = bVar.f14900g;
                this.f14902h = bVar.f14902h;
                this.f14904i = bVar.f14904i;
                this.f14906j = bVar.f14906j;
                this.f14908k = bVar.f14908k;
                this.f14910l = bVar.f14910l;
                this.f14912m = bVar.f14912m;
                this.f14914n = bVar.f14914n;
                this.f14916o = bVar.f14916o;
                this.f14918p = bVar.f14918p;
                this.f14920q = bVar.f14920q;
                this.f14922r = bVar.f14922r;
                this.f14924s = bVar.f14924s;
                this.f14926t = bVar.f14926t;
                this.f14928u = bVar.f14928u;
                this.f14930v = bVar.f14930v;
                this.f14932w = bVar.f14932w;
                this.f14934x = bVar.f14934x;
                this.f14935y = bVar.f14935y;
                this.f14936z = bVar.f14936z;
                this.f14862A = bVar.f14862A;
                this.f14863B = bVar.f14863B;
                this.f14864C = bVar.f14864C;
                this.f14865D = bVar.f14865D;
                this.f14868G = bVar.f14868G;
                this.f14869H = bVar.f14869H;
                this.f14870I = bVar.f14870I;
                this.f14871J = bVar.f14871J;
                this.f14872K = bVar.f14872K;
                this.f14873L = bVar.f14873L;
                this.f14874M = bVar.f14874M;
                this.f14875N = bVar.f14875N;
                this.f14876O = bVar.f14876O;
                this.f14889a0 = bVar.f14889a0;
                this.f14891b0 = bVar.f14891b0;
                this.f14877P = bVar.f14877P;
                this.f14878Q = bVar.f14878Q;
                this.f14879R = bVar.f14879R;
                this.f14881T = bVar.f14881T;
                this.f14880S = bVar.f14880S;
                this.f14882U = bVar.f14882U;
                this.f14883V = bVar.f14883V;
                this.f14884W = bVar.f14884W;
                this.f14885X = bVar.f14885X;
                this.f14886Y = bVar.f14886Y;
                this.f14887Z = bVar.f14887Z;
                this.f14897e0 = bVar.f14897e0;
                this.f14899f0 = bVar.f14899f0;
                this.f14901g0 = bVar.f14901g0;
                this.f14903h0 = bVar.f14903h0;
                this.f14911l0 = bVar.f14911l0;
                this.f14913m0 = bVar.f14913m0;
                this.f14915n0 = bVar.f14915n0;
                this.f14917o0 = bVar.f14917o0;
                this.f14919p0 = bVar.f14919p0;
                this.f14921q0 = bVar.f14921q0;
                this.f14923r0 = bVar.f14923r0;
                this.f14893c0 = bVar.f14893c0;
                this.f14895d0 = bVar.f14895d0;
                this.f14931v0 = bVar.f14931v0;
                this.f14866E = bVar.f14866E;
                this.f14867F = bVar.f14867F;
            }
        }

        public String a() {
            return this.f14893c0;
        }

        public void b() {
            this.f14903h0 = false;
            this.f14897e0 = true;
            this.f14899f0 = true;
            int i10 = this.width;
            if (i10 == -2 && this.f14889a0) {
                this.f14897e0 = false;
                if (this.f14877P == 0) {
                    this.f14877P = 1;
                }
            }
            int i11 = this.height;
            if (i11 == -2 && this.f14891b0) {
                this.f14899f0 = false;
                if (this.f14878Q == 0) {
                    this.f14878Q = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f14897e0 = false;
                if (i10 == 0 && this.f14877P == 1) {
                    this.width = -2;
                    this.f14889a0 = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f14899f0 = false;
                if (i11 == 0 && this.f14878Q == 1) {
                    this.height = -2;
                    this.f14891b0 = true;
                }
            }
            if (this.f14892c != -1.0f || this.f14888a != -1 || this.f14890b != -1) {
                this.f14903h0 = true;
                this.f14897e0 = true;
                this.f14899f0 = true;
                if (!(this.f14931v0 instanceof C2066h)) {
                    this.f14931v0 = new C2066h();
                }
                ((C2066h) this.f14931v0).F1(this.f14887Z);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x007a  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0082  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r11) {
            /*
                r10 = this;
                int r0 = r10.leftMargin
                int r1 = r10.rightMargin
                super.resolveLayoutDirection(r11)
                int r11 = r10.getLayoutDirection()
                r2 = 0
                r3 = 1
                if (r3 != r11) goto L_0x0011
                r11 = r3
                goto L_0x0012
            L_0x0011:
                r11 = r2
            L_0x0012:
                r4 = -1
                r10.f14915n0 = r4
                r10.f14917o0 = r4
                r10.f14911l0 = r4
                r10.f14913m0 = r4
                int r5 = r10.f14932w
                r10.f14919p0 = r5
                int r5 = r10.f14935y
                r10.f14921q0 = r5
                float r5 = r10.f14868G
                r10.f14923r0 = r5
                int r6 = r10.f14888a
                r10.f14925s0 = r6
                int r7 = r10.f14890b
                r10.f14927t0 = r7
                float r8 = r10.f14892c
                r10.f14929u0 = r8
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r11 == 0) goto L_0x0094
                int r11 = r10.f14924s
                if (r11 == r4) goto L_0x003f
                r10.f14915n0 = r11
            L_0x003d:
                r2 = r3
                goto L_0x0046
            L_0x003f:
                int r11 = r10.f14926t
                if (r11 == r4) goto L_0x0046
                r10.f14917o0 = r11
                goto L_0x003d
            L_0x0046:
                int r11 = r10.f14928u
                if (r11 == r4) goto L_0x004d
                r10.f14913m0 = r11
                r2 = r3
            L_0x004d:
                int r11 = r10.f14930v
                if (r11 == r4) goto L_0x0054
                r10.f14911l0 = r11
                r2 = r3
            L_0x0054:
                int r11 = r10.f14862A
                if (r11 == r9) goto L_0x005a
                r10.f14921q0 = r11
            L_0x005a:
                int r11 = r10.f14863B
                if (r11 == r9) goto L_0x0060
                r10.f14919p0 = r11
            L_0x0060:
                r11 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L_0x0068
                float r2 = r11 - r5
                r10.f14923r0 = r2
            L_0x0068:
                boolean r2 = r10.f14903h0
                if (r2 == 0) goto L_0x00b8
                int r2 = r10.f14887Z
                if (r2 != r3) goto L_0x00b8
                boolean r2 = r10.f14894d
                if (r2 == 0) goto L_0x00b8
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r3 == 0) goto L_0x0082
                float r11 = r11 - r8
                r10.f14929u0 = r11
                r10.f14925s0 = r4
                r10.f14927t0 = r4
                goto L_0x00b8
            L_0x0082:
                if (r6 == r4) goto L_0x008b
                r10.f14927t0 = r6
                r10.f14925s0 = r4
                r10.f14929u0 = r2
                goto L_0x00b8
            L_0x008b:
                if (r7 == r4) goto L_0x00b8
                r10.f14925s0 = r7
                r10.f14927t0 = r4
                r10.f14929u0 = r2
                goto L_0x00b8
            L_0x0094:
                int r11 = r10.f14924s
                if (r11 == r4) goto L_0x009a
                r10.f14913m0 = r11
            L_0x009a:
                int r11 = r10.f14926t
                if (r11 == r4) goto L_0x00a0
                r10.f14911l0 = r11
            L_0x00a0:
                int r11 = r10.f14928u
                if (r11 == r4) goto L_0x00a6
                r10.f14915n0 = r11
            L_0x00a6:
                int r11 = r10.f14930v
                if (r11 == r4) goto L_0x00ac
                r10.f14917o0 = r11
            L_0x00ac:
                int r11 = r10.f14862A
                if (r11 == r9) goto L_0x00b2
                r10.f14919p0 = r11
            L_0x00b2:
                int r11 = r10.f14863B
                if (r11 == r9) goto L_0x00b8
                r10.f14921q0 = r11
            L_0x00b8:
                int r11 = r10.f14928u
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f14930v
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f14926t
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f14924s
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f14900g
                if (r11 == r4) goto L_0x00d7
                r10.f14915n0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00e5
                if (r1 <= 0) goto L_0x00e5
                r10.rightMargin = r1
                goto L_0x00e5
            L_0x00d7:
                int r11 = r10.f14902h
                if (r11 == r4) goto L_0x00e5
                r10.f14917o0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00e5
                if (r1 <= 0) goto L_0x00e5
                r10.rightMargin = r1
            L_0x00e5:
                int r11 = r10.f14896e
                if (r11 == r4) goto L_0x00f4
                r10.f14911l0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x0102
                if (r0 <= 0) goto L_0x0102
                r10.leftMargin = r0
                goto L_0x0102
            L_0x00f4:
                int r11 = r10.f14898f
                if (r11 == r4) goto L_0x0102
                r10.f14913m0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x0102
                if (r0 <= 0) goto L_0x0102
                r10.leftMargin = r0
            L_0x0102:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.f15351V0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = a.f14937a.get(index);
                switch (i11) {
                    case 1:
                        this.f14887Z = obtainStyledAttributes.getInt(index, this.f14887Z);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f14918p);
                        this.f14918p = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            this.f14918p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.f14920q = obtainStyledAttributes.getDimensionPixelSize(index, this.f14920q);
                        break;
                    case 4:
                        float f10 = obtainStyledAttributes.getFloat(index, this.f14922r) % 360.0f;
                        this.f14922r = f10;
                        if (f10 >= 0.0f) {
                            break;
                        } else {
                            this.f14922r = (360.0f - f10) % 360.0f;
                            break;
                        }
                    case 5:
                        this.f14888a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f14888a);
                        break;
                    case 6:
                        this.f14890b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f14890b);
                        break;
                    case 7:
                        this.f14892c = obtainStyledAttributes.getFloat(index, this.f14892c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f14896e);
                        this.f14896e = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            this.f14896e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f14898f);
                        this.f14898f = resourceId3;
                        if (resourceId3 != -1) {
                            break;
                        } else {
                            this.f14898f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f14900g);
                        this.f14900g = resourceId4;
                        if (resourceId4 != -1) {
                            break;
                        } else {
                            this.f14900g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f14902h);
                        this.f14902h = resourceId5;
                        if (resourceId5 != -1) {
                            break;
                        } else {
                            this.f14902h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f14904i);
                        this.f14904i = resourceId6;
                        if (resourceId6 != -1) {
                            break;
                        } else {
                            this.f14904i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f14906j);
                        this.f14906j = resourceId7;
                        if (resourceId7 != -1) {
                            break;
                        } else {
                            this.f14906j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case StdKeyDeserializer.TYPE_URL /*14*/:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f14908k);
                        this.f14908k = resourceId8;
                        if (resourceId8 != -1) {
                            break;
                        } else {
                            this.f14908k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case StdKeyDeserializer.TYPE_CLASS /*15*/:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f14910l);
                        this.f14910l = resourceId9;
                        if (resourceId9 != -1) {
                            break;
                        } else {
                            this.f14910l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f14912m);
                        this.f14912m = resourceId10;
                        if (resourceId10 != -1) {
                            break;
                        } else {
                            this.f14912m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f14924s);
                        this.f14924s = resourceId11;
                        if (resourceId11 != -1) {
                            break;
                        } else {
                            this.f14924s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f14926t);
                        this.f14926t = resourceId12;
                        if (resourceId12 != -1) {
                            break;
                        } else {
                            this.f14926t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f14928u);
                        this.f14928u = resourceId13;
                        if (resourceId13 != -1) {
                            break;
                        } else {
                            this.f14928u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case InboxPagingSource.PAGE_SIZE /*20*/:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f14930v);
                        this.f14930v = resourceId14;
                        if (resourceId14 != -1) {
                            break;
                        } else {
                            this.f14930v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.f14932w = obtainStyledAttributes.getDimensionPixelSize(index, this.f14932w);
                        break;
                    case 22:
                        this.f14934x = obtainStyledAttributes.getDimensionPixelSize(index, this.f14934x);
                        break;
                    case 23:
                        this.f14935y = obtainStyledAttributes.getDimensionPixelSize(index, this.f14935y);
                        break;
                    case 24:
                        this.f14936z = obtainStyledAttributes.getDimensionPixelSize(index, this.f14936z);
                        break;
                    case 25:
                        this.f14862A = obtainStyledAttributes.getDimensionPixelSize(index, this.f14862A);
                        break;
                    case 26:
                        this.f14863B = obtainStyledAttributes.getDimensionPixelSize(index, this.f14863B);
                        break;
                    case 27:
                        this.f14889a0 = obtainStyledAttributes.getBoolean(index, this.f14889a0);
                        break;
                    case 28:
                        this.f14891b0 = obtainStyledAttributes.getBoolean(index, this.f14891b0);
                        break;
                    case 29:
                        this.f14868G = obtainStyledAttributes.getFloat(index, this.f14868G);
                        break;
                    case 30:
                        this.f14869H = obtainStyledAttributes.getFloat(index, this.f14869H);
                        break;
                    case 31:
                        int i12 = obtainStyledAttributes.getInt(index, 0);
                        this.f14877P = i12;
                        if (i12 != 1) {
                            break;
                        } else {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        }
                    case com.amazon.c.a.a.c.f37660h /*32*/:
                        int i13 = obtainStyledAttributes.getInt(index, 0);
                        this.f14878Q = i13;
                        if (i13 != 1) {
                            break;
                        } else {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        }
                    case CharsToNameCanonicalizer.HASH_MULT /*33*/:
                        try {
                            this.f14879R = obtainStyledAttributes.getDimensionPixelSize(index, this.f14879R);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f14879R) != -2) {
                                break;
                            } else {
                                this.f14879R = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f14881T = obtainStyledAttributes.getDimensionPixelSize(index, this.f14881T);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f14881T) != -2) {
                                break;
                            } else {
                                this.f14881T = -2;
                                break;
                            }
                        }
                    case 35:
                        this.f14883V = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f14883V));
                        this.f14877P = 2;
                        break;
                    case 36:
                        try {
                            this.f14880S = obtainStyledAttributes.getDimensionPixelSize(index, this.f14880S);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f14880S) != -2) {
                                break;
                            } else {
                                this.f14880S = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f14882U = obtainStyledAttributes.getDimensionPixelSize(index, this.f14882U);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f14882U) != -2) {
                                break;
                            } else {
                                this.f14882U = -2;
                                break;
                            }
                        }
                    case 38:
                        this.f14884W = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f14884W));
                        this.f14878Q = 2;
                        break;
                    default:
                        switch (i11) {
                            case Carousel.ENTITY_TYPE /*44*/:
                                d.H(this, obtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.f14873L = obtainStyledAttributes.getFloat(index, this.f14873L);
                                break;
                            case 46:
                                this.f14874M = obtainStyledAttributes.getFloat(index, this.f14874M);
                                break;
                            case 47:
                                this.f14875N = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f14876O = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f14885X = obtainStyledAttributes.getDimensionPixelOffset(index, this.f14885X);
                                break;
                            case 50:
                                this.f14886Y = obtainStyledAttributes.getDimensionPixelOffset(index, this.f14886Y);
                                break;
                            case 51:
                                this.f14893c0 = obtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f14914n);
                                this.f14914n = resourceId15;
                                if (resourceId15 != -1) {
                                    break;
                                } else {
                                    this.f14914n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f14916o);
                                this.f14916o = resourceId16;
                                if (resourceId16 != -1) {
                                    break;
                                } else {
                                    this.f14916o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                }
                            case 54:
                                this.f14865D = obtainStyledAttributes.getDimensionPixelSize(index, this.f14865D);
                                break;
                            case 55:
                                this.f14864C = obtainStyledAttributes.getDimensionPixelSize(index, this.f14864C);
                                break;
                            default:
                                switch (i11) {
                                    case 64:
                                        d.F(this, obtainStyledAttributes, index, 0);
                                        this.f14866E = true;
                                        break;
                                    case 65:
                                        d.F(this, obtainStyledAttributes, index, 1);
                                        this.f14867F = true;
                                        break;
                                    case 66:
                                        this.f14895d0 = obtainStyledAttributes.getInt(index, this.f14895d0);
                                        break;
                                    case 67:
                                        this.f14894d = obtainStyledAttributes.getBoolean(index, this.f14894d);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            b();
        }

        public b(int i10, int i11) {
            super(i10, i11);
        }
    }
}
