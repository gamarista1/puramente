package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.adjust.sdk.network.ErrorCodes;
import com.google.android.gms.common.api.a;
import i.C2037a;
import i.j;
import java.lang.reflect.Method;

public class T implements n.e {

    /* renamed from: G  reason: collision with root package name */
    private static Method f11679G;

    /* renamed from: H  reason: collision with root package name */
    private static Method f11680H;

    /* renamed from: A  reason: collision with root package name */
    private Runnable f11681A;

    /* renamed from: B  reason: collision with root package name */
    final Handler f11682B;

    /* renamed from: C  reason: collision with root package name */
    private final Rect f11683C;

    /* renamed from: D  reason: collision with root package name */
    private Rect f11684D;

    /* renamed from: E  reason: collision with root package name */
    private boolean f11685E;

    /* renamed from: F  reason: collision with root package name */
    PopupWindow f11686F;

    /* renamed from: a  reason: collision with root package name */
    private Context f11687a;

    /* renamed from: b  reason: collision with root package name */
    private ListAdapter f11688b;

    /* renamed from: c  reason: collision with root package name */
    O f11689c;

    /* renamed from: d  reason: collision with root package name */
    private int f11690d;

    /* renamed from: e  reason: collision with root package name */
    private int f11691e;

    /* renamed from: f  reason: collision with root package name */
    private int f11692f;

    /* renamed from: g  reason: collision with root package name */
    private int f11693g;

    /* renamed from: h  reason: collision with root package name */
    private int f11694h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f11695i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f11696j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f11697k;

    /* renamed from: l  reason: collision with root package name */
    private int f11698l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f11699m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f11700n;

    /* renamed from: o  reason: collision with root package name */
    int f11701o;

    /* renamed from: p  reason: collision with root package name */
    private View f11702p;

    /* renamed from: q  reason: collision with root package name */
    private int f11703q;

    /* renamed from: r  reason: collision with root package name */
    private DataSetObserver f11704r;

    /* renamed from: s  reason: collision with root package name */
    private View f11705s;

    /* renamed from: t  reason: collision with root package name */
    private Drawable f11706t;

    /* renamed from: u  reason: collision with root package name */
    private AdapterView.OnItemClickListener f11707u;

    /* renamed from: v  reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f11708v;

    /* renamed from: w  reason: collision with root package name */
    final i f11709w;

    /* renamed from: x  reason: collision with root package name */
    private final h f11710x;

    /* renamed from: y  reason: collision with root package name */
    private final g f11711y;

    /* renamed from: z  reason: collision with root package name */
    private final e f11712z;

    class a implements Runnable {
        a() {
        }

        public void run() {
            View t10 = T.this.t();
            if (t10 != null && t10.getWindowToken() != null) {
                T.this.b();
            }
        }
    }

    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            O o10;
            if (i10 != -1 && (o10 = T.this.f11689c) != null) {
                o10.setListSelectionHidden(false);
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static class c {
        static int a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i10, z10);
        }
    }

    static class d {
        static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    private class e implements Runnable {
        e() {
        }

        public void run() {
            T.this.r();
        }
    }

    private class f extends DataSetObserver {
        f() {
        }

        public void onChanged() {
            if (T.this.c()) {
                T.this.b();
            }
        }

        public void onInvalidated() {
            T.this.dismiss();
        }
    }

    private class g implements AbsListView.OnScrollListener {
        g() {
        }

        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 == 1 && !T.this.A() && T.this.f11686F.getContentView() != null) {
                T t10 = T.this;
                t10.f11682B.removeCallbacks(t10.f11709w);
                T.this.f11709w.run();
            }
        }
    }

    private class h implements View.OnTouchListener {
        h() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = T.this.f11686F) != null && popupWindow.isShowing() && x10 >= 0 && x10 < T.this.f11686F.getWidth() && y10 >= 0 && y10 < T.this.f11686F.getHeight()) {
                T t10 = T.this;
                t10.f11682B.postDelayed(t10.f11709w, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                T t11 = T.this;
                t11.f11682B.removeCallbacks(t11.f11709w);
                return false;
            }
        }
    }

    private class i implements Runnable {
        i() {
        }

        public void run() {
            O o10 = T.this.f11689c;
            if (o10 != null && o10.isAttachedToWindow() && T.this.f11689c.getCount() > T.this.f11689c.getChildCount()) {
                int childCount = T.this.f11689c.getChildCount();
                T t10 = T.this;
                if (childCount <= t10.f11701o) {
                    t10.f11686F.setInputMethodMode(2);
                    T.this.b();
                }
            }
        }
    }

    static {
        Class<PopupWindow> cls = PopupWindow.class;
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f11679G = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f11680H = cls.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public T(Context context) {
        this(context, (AttributeSet) null, C2037a.f21247B);
    }

    private void C() {
        View view = this.f11702p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f11702p);
            }
        }
    }

    private void N(boolean z10) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f11679G;
            if (method != null) {
                try {
                    method.invoke(this.f11686F, new Object[]{Boolean.valueOf(z10)});
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            d.b(this.f11686F, z10);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: androidx.appcompat.widget.O} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: androidx.appcompat.widget.O} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: androidx.appcompat.widget.O} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int q() {
        /*
            r12 = this;
            androidx.appcompat.widget.O r0 = r12.f11689c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x00be
            android.content.Context r0 = r12.f11687a
            androidx.appcompat.widget.T$a r5 = new androidx.appcompat.widget.T$a
            r5.<init>()
            r12.f11681A = r5
            boolean r5 = r12.f11685E
            r5 = r5 ^ r3
            androidx.appcompat.widget.O r5 = r12.s(r0, r5)
            r12.f11689c = r5
            android.graphics.drawable.Drawable r6 = r12.f11706t
            if (r6 == 0) goto L_0x0022
            r5.setSelector(r6)
        L_0x0022:
            androidx.appcompat.widget.O r5 = r12.f11689c
            android.widget.ListAdapter r6 = r12.f11688b
            r5.setAdapter(r6)
            androidx.appcompat.widget.O r5 = r12.f11689c
            android.widget.AdapterView$OnItemClickListener r6 = r12.f11707u
            r5.setOnItemClickListener(r6)
            androidx.appcompat.widget.O r5 = r12.f11689c
            r5.setFocusable(r3)
            androidx.appcompat.widget.O r5 = r12.f11689c
            r5.setFocusableInTouchMode(r3)
            androidx.appcompat.widget.O r5 = r12.f11689c
            androidx.appcompat.widget.T$b r6 = new androidx.appcompat.widget.T$b
            r6.<init>()
            r5.setOnItemSelectedListener(r6)
            androidx.appcompat.widget.O r5 = r12.f11689c
            androidx.appcompat.widget.T$g r6 = r12.f11711y
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.f11708v
            if (r5 == 0) goto L_0x0054
            androidx.appcompat.widget.O r6 = r12.f11689c
            r6.setOnItemSelectedListener(r5)
        L_0x0054:
            androidx.appcompat.widget.O r5 = r12.f11689c
            android.view.View r6 = r12.f11702p
            if (r6 == 0) goto L_0x00b7
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.f11703q
            if (r8 == 0) goto L_0x008f
            if (r8 == r3) goto L_0x0088
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Invalid hint position "
            r0.append(r5)
            int r5 = r12.f11703q
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "ListPopupWindow"
            android.util.Log.e(r5, r0)
            goto L_0x0095
        L_0x0088:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x0095
        L_0x008f:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x0095:
            int r0 = r12.f11691e
            if (r0 < 0) goto L_0x009b
            r5 = r1
            goto L_0x009d
        L_0x009b:
            r0 = r4
            r5 = r0
        L_0x009d:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto L_0x00b8
        L_0x00b7:
            r0 = r4
        L_0x00b8:
            android.widget.PopupWindow r6 = r12.f11686F
            r6.setContentView(r5)
            goto L_0x00dc
        L_0x00be:
            android.widget.PopupWindow r0 = r12.f11686F
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r12.f11702p
            if (r0 == 0) goto L_0x00db
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00dc
        L_0x00db:
            r0 = r4
        L_0x00dc:
            android.widget.PopupWindow r5 = r12.f11686F
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x00f8
            android.graphics.Rect r6 = r12.f11683C
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.f11683C
            int r6 = r5.top
            int r5 = r5.bottom
            int r5 = r5 + r6
            boolean r7 = r12.f11695i
            if (r7 != 0) goto L_0x00fe
            int r6 = -r6
            r12.f11693g = r6
            goto L_0x00fe
        L_0x00f8:
            android.graphics.Rect r5 = r12.f11683C
            r5.setEmpty()
            r5 = r4
        L_0x00fe:
            android.widget.PopupWindow r6 = r12.f11686F
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L_0x0108
            goto L_0x0109
        L_0x0108:
            r3 = r4
        L_0x0109:
            android.view.View r4 = r12.t()
            int r6 = r12.f11693g
            int r3 = r12.u(r4, r6, r3)
            boolean r4 = r12.f11699m
            if (r4 != 0) goto L_0x017b
            int r4 = r12.f11690d
            if (r4 != r2) goto L_0x011c
            goto L_0x017b
        L_0x011c:
            int r4 = r12.f11691e
            r6 = -2
            if (r4 == r6) goto L_0x0144
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L_0x012b
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
        L_0x0129:
            r7 = r1
            goto L_0x015d
        L_0x012b:
            android.content.Context r2 = r12.f11687a
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.f11683C
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            goto L_0x0129
        L_0x0144:
            android.content.Context r2 = r12.f11687a
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.f11683C
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            goto L_0x0129
        L_0x015d:
            androidx.appcompat.widget.O r6 = r12.f11689c
            int r10 = r3 - r0
            r11 = -1
            r8 = 0
            r9 = -1
            int r1 = r6.d(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L_0x0179
            androidx.appcompat.widget.O r2 = r12.f11689c
            int r2 = r2.getPaddingTop()
            androidx.appcompat.widget.O r3 = r12.f11689c
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r5 = r5 + r2
            int r0 = r0 + r5
        L_0x0179:
            int r1 = r1 + r0
            return r1
        L_0x017b:
            int r3 = r3 + r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.T.q():int");
    }

    private int u(View view, int i10, boolean z10) {
        return c.a(this.f11686F, view, i10, z10);
    }

    public boolean A() {
        if (this.f11686F.getInputMethodMode() == 2) {
            return true;
        }
        return false;
    }

    public boolean B() {
        return this.f11685E;
    }

    public void D(View view) {
        this.f11705s = view;
    }

    public void E(int i10) {
        this.f11686F.setAnimationStyle(i10);
    }

    public void F(int i10) {
        Drawable background = this.f11686F.getBackground();
        if (background != null) {
            background.getPadding(this.f11683C);
            Rect rect = this.f11683C;
            this.f11691e = rect.left + rect.right + i10;
            return;
        }
        Q(i10);
    }

    public void G(int i10) {
        this.f11698l = i10;
    }

    public void H(Rect rect) {
        Rect rect2;
        if (rect != null) {
            rect2 = new Rect(rect);
        } else {
            rect2 = null;
        }
        this.f11684D = rect2;
    }

    public void I(int i10) {
        this.f11686F.setInputMethodMode(i10);
    }

    public void J(boolean z10) {
        this.f11685E = z10;
        this.f11686F.setFocusable(z10);
    }

    public void K(PopupWindow.OnDismissListener onDismissListener) {
        this.f11686F.setOnDismissListener(onDismissListener);
    }

    public void L(AdapterView.OnItemClickListener onItemClickListener) {
        this.f11707u = onItemClickListener;
    }

    public void M(boolean z10) {
        this.f11697k = true;
        this.f11696j = z10;
    }

    public void O(int i10) {
        this.f11703q = i10;
    }

    public void P(int i10) {
        O o10 = this.f11689c;
        if (c() && o10 != null) {
            o10.setListSelectionHidden(false);
            o10.setSelection(i10);
            if (o10.getChoiceMode() != 0) {
                o10.setItemChecked(i10, true);
            }
        }
    }

    public void Q(int i10) {
        this.f11691e = i10;
    }

    public int a() {
        return this.f11692f;
    }

    public void b() {
        int i10;
        int i11;
        int i12;
        int i13;
        int q10 = q();
        boolean A10 = A();
        androidx.core.widget.h.b(this.f11686F, this.f11694h);
        boolean z10 = true;
        if (!this.f11686F.isShowing()) {
            int i14 = this.f11691e;
            if (i14 == -1) {
                i14 = -1;
            } else if (i14 == -2) {
                i14 = t().getWidth();
            }
            int i15 = this.f11690d;
            if (i15 == -1) {
                q10 = -1;
            } else if (i15 != -2) {
                q10 = i15;
            }
            this.f11686F.setWidth(i14);
            this.f11686F.setHeight(q10);
            N(true);
            PopupWindow popupWindow = this.f11686F;
            if (this.f11700n || this.f11699m) {
                z10 = false;
            }
            popupWindow.setOutsideTouchable(z10);
            this.f11686F.setTouchInterceptor(this.f11710x);
            if (this.f11697k) {
                androidx.core.widget.h.a(this.f11686F, this.f11696j);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = f11680H;
                if (method != null) {
                    try {
                        method.invoke(this.f11686F, new Object[]{this.f11684D});
                    } catch (Exception e10) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                    }
                }
            } else {
                d.a(this.f11686F, this.f11684D);
            }
            androidx.core.widget.h.c(this.f11686F, t(), this.f11692f, this.f11693g, this.f11698l);
            this.f11689c.setSelection(-1);
            if (!this.f11685E || this.f11689c.isInTouchMode()) {
                r();
            }
            if (!this.f11685E) {
                this.f11682B.post(this.f11712z);
            }
        } else if (t().isAttachedToWindow()) {
            int i16 = this.f11691e;
            if (i16 == -1) {
                i16 = -1;
            } else if (i16 == -2) {
                i16 = t().getWidth();
            }
            int i17 = this.f11690d;
            if (i17 == -1) {
                if (!A10) {
                    q10 = -1;
                }
                if (A10) {
                    PopupWindow popupWindow2 = this.f11686F;
                    if (this.f11691e == -1) {
                        i13 = -1;
                    } else {
                        i13 = 0;
                    }
                    popupWindow2.setWidth(i13);
                    this.f11686F.setHeight(0);
                } else {
                    PopupWindow popupWindow3 = this.f11686F;
                    if (this.f11691e == -1) {
                        i12 = -1;
                    } else {
                        i12 = 0;
                    }
                    popupWindow3.setWidth(i12);
                    this.f11686F.setHeight(-1);
                }
            } else if (i17 != -2) {
                q10 = i17;
            }
            PopupWindow popupWindow4 = this.f11686F;
            if (this.f11700n || this.f11699m) {
                z10 = false;
            }
            popupWindow4.setOutsideTouchable(z10);
            PopupWindow popupWindow5 = this.f11686F;
            View t10 = t();
            int i18 = this.f11692f;
            int i19 = this.f11693g;
            if (i16 < 0) {
                i10 = -1;
            } else {
                i10 = i16;
            }
            if (q10 < 0) {
                i11 = -1;
            } else {
                i11 = q10;
            }
            popupWindow5.update(t10, i18, i19, i10, i11);
        }
    }

    public boolean c() {
        return this.f11686F.isShowing();
    }

    public void dismiss() {
        this.f11686F.dismiss();
        C();
        this.f11686F.setContentView((View) null);
        this.f11689c = null;
        this.f11682B.removeCallbacks(this.f11709w);
    }

    public void e(int i10) {
        this.f11692f = i10;
    }

    public Drawable g() {
        return this.f11686F.getBackground();
    }

    public void i(int i10) {
        this.f11693g = i10;
        this.f11695i = true;
    }

    public int l() {
        if (!this.f11695i) {
            return 0;
        }
        return this.f11693g;
    }

    public void m(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f11704r;
        if (dataSetObserver == null) {
            this.f11704r = new f();
        } else {
            ListAdapter listAdapter2 = this.f11688b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f11688b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f11704r);
        }
        O o10 = this.f11689c;
        if (o10 != null) {
            o10.setAdapter(this.f11688b);
        }
    }

    public ListView o() {
        return this.f11689c;
    }

    public void p(Drawable drawable) {
        this.f11686F.setBackgroundDrawable(drawable);
    }

    public void r() {
        O o10 = this.f11689c;
        if (o10 != null) {
            o10.setListSelectionHidden(true);
            o10.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public O s(Context context, boolean z10) {
        return new O(context, z10);
    }

    public View t() {
        return this.f11705s;
    }

    public Object v() {
        if (!c()) {
            return null;
        }
        return this.f11689c.getSelectedItem();
    }

    public long w() {
        if (!c()) {
            return Long.MIN_VALUE;
        }
        return this.f11689c.getSelectedItemId();
    }

    public int x() {
        if (!c()) {
            return -1;
        }
        return this.f11689c.getSelectedItemPosition();
    }

    public View y() {
        if (!c()) {
            return null;
        }
        return this.f11689c.getSelectedView();
    }

    public int z() {
        return this.f11691e;
    }

    public T(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public T(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f11690d = -2;
        this.f11691e = -2;
        this.f11694h = ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION;
        this.f11698l = 0;
        this.f11699m = false;
        this.f11700n = false;
        this.f11701o = a.e.API_PRIORITY_OTHER;
        this.f11703q = 0;
        this.f11709w = new i();
        this.f11710x = new h();
        this.f11711y = new g();
        this.f11712z = new e();
        this.f11683C = new Rect();
        this.f11687a = context;
        this.f11682B = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f21611l1, i10, i11);
        this.f11692f = obtainStyledAttributes.getDimensionPixelOffset(j.f21616m1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(j.f21621n1, 0);
        this.f11693g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f11695i = true;
        }
        obtainStyledAttributes.recycle();
        C1579s sVar = new C1579s(context, attributeSet, i10, i11);
        this.f11686F = sVar;
        sVar.setInputMethodMode(1);
    }
}
