package E3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C1680b0;
import java.util.Map;

/* renamed from: E3.c  reason: case insensitive filesystem */
public class C1153c extends C1162l {

    /* renamed from: f0  reason: collision with root package name */
    private static final String[] f1790f0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: g0  reason: collision with root package name */
    private static final Property f1791g0;

    /* renamed from: h0  reason: collision with root package name */
    private static final Property f1792h0;

    /* renamed from: i0  reason: collision with root package name */
    private static final Property f1793i0;

    /* renamed from: j0  reason: collision with root package name */
    private static final Property f1794j0;

    /* renamed from: k0  reason: collision with root package name */
    private static final Property f1795k0;

    /* renamed from: l0  reason: collision with root package name */
    private static final Property f1796l0;

    /* renamed from: m0  reason: collision with root package name */
    private static C1160j f1797m0 = new C1160j();

    /* renamed from: X  reason: collision with root package name */
    private int[] f1798X = new int[2];

    /* renamed from: Y  reason: collision with root package name */
    private boolean f1799Y = false;

    /* renamed from: Z  reason: collision with root package name */
    private boolean f1800Z = false;

    /* renamed from: E3.c$a */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f1801a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BitmapDrawable f1802b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f1803c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f1804d;

        a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f10) {
            this.f1801a = viewGroup;
            this.f1802b = bitmapDrawable;
            this.f1803c = view;
            this.f1804d = f10;
        }

        public void onAnimationEnd(Animator animator) {
            A.b(this.f1801a).b(this.f1802b);
            A.g(this.f1803c, this.f1804d);
        }
    }

    /* renamed from: E3.c$b */
    static class b extends Property {

        /* renamed from: a  reason: collision with root package name */
        private Rect f1806a = new Rect();

        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f1806a);
            Rect rect = this.f1806a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f1806a);
            this.f1806a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f1806a);
        }
    }

    /* renamed from: E3.c$c  reason: collision with other inner class name */
    static class C0031c extends Property {
        C0031c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    /* renamed from: E3.c$d */
    static class d extends Property {
        d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    /* renamed from: E3.c$e */
    static class e extends Property {
        e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            A.f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: E3.c$f */
    static class f extends Property {
        f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            A.f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: E3.c$g */
    static class g extends Property {
        g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            A.f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: E3.c$h */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f1807a;
        private k mViewBounds;

        h(k kVar) {
            this.f1807a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* renamed from: E3.c$i */
    class i extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1809a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f1810b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Rect f1811c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f1812d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f1813e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f1814f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f1815g;

        i(View view, Rect rect, int i10, int i11, int i12, int i13) {
            this.f1810b = view;
            this.f1811c = rect;
            this.f1812d = i10;
            this.f1813e = i11;
            this.f1814f = i12;
            this.f1815g = i13;
        }

        public void onAnimationCancel(Animator animator) {
            this.f1809a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f1809a) {
                C1680b0.v0(this.f1810b, this.f1811c);
                A.f(this.f1810b, this.f1812d, this.f1813e, this.f1814f, this.f1815g);
            }
        }
    }

    /* renamed from: E3.c$j */
    class j extends C1163m {

        /* renamed from: a  reason: collision with root package name */
        boolean f1817a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f1818b;

        j(ViewGroup viewGroup) {
            this.f1818b = viewGroup;
        }

        public void a(C1162l lVar) {
            x.c(this.f1818b, false);
            this.f1817a = true;
        }

        public void b(C1162l lVar) {
            x.c(this.f1818b, true);
        }

        public void c(C1162l lVar) {
            x.c(this.f1818b, false);
        }

        public void d(C1162l lVar) {
            if (!this.f1817a) {
                x.c(this.f1818b, false);
            }
            lVar.S(this);
        }
    }

    /* renamed from: E3.c$k */
    private static class k {

        /* renamed from: a  reason: collision with root package name */
        private int f1820a;

        /* renamed from: b  reason: collision with root package name */
        private int f1821b;

        /* renamed from: c  reason: collision with root package name */
        private int f1822c;

        /* renamed from: d  reason: collision with root package name */
        private int f1823d;

        /* renamed from: e  reason: collision with root package name */
        private View f1824e;

        /* renamed from: f  reason: collision with root package name */
        private int f1825f;

        /* renamed from: g  reason: collision with root package name */
        private int f1826g;

        k(View view) {
            this.f1824e = view;
        }

        private void b() {
            A.f(this.f1824e, this.f1820a, this.f1821b, this.f1822c, this.f1823d);
            this.f1825f = 0;
            this.f1826g = 0;
        }

        /* access modifiers changed from: package-private */
        public void a(PointF pointF) {
            this.f1822c = Math.round(pointF.x);
            this.f1823d = Math.round(pointF.y);
            int i10 = this.f1826g + 1;
            this.f1826g = i10;
            if (this.f1825f == i10) {
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public void c(PointF pointF) {
            this.f1820a = Math.round(pointF.x);
            this.f1821b = Math.round(pointF.y);
            int i10 = this.f1825f + 1;
            this.f1825f = i10;
            if (i10 == this.f1826g) {
                b();
            }
        }
    }

    static {
        Class<PointF> cls = PointF.class;
        f1791g0 = new b(cls, "boundsOrigin");
        f1792h0 = new C0031c(cls, "topLeft");
        f1793i0 = new d(cls, "bottomRight");
        f1794j0 = new e(cls, "bottomRight");
        f1795k0 = new f(cls, "topLeft");
        f1796l0 = new g(cls, "position");
    }

    private void g0(s sVar) {
        View view = sVar.f1910b;
        if (C1680b0.S(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            sVar.f1909a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            sVar.f1909a.put("android:changeBounds:parent", sVar.f1910b.getParent());
            if (this.f1800Z) {
                sVar.f1910b.getLocationInWindow(this.f1798X);
                sVar.f1909a.put("android:changeBounds:windowX", Integer.valueOf(this.f1798X[0]));
                sVar.f1909a.put("android:changeBounds:windowY", Integer.valueOf(this.f1798X[1]));
            }
            if (this.f1799Y) {
                sVar.f1909a.put("android:changeBounds:clip", C1680b0.t(view));
            }
        }
    }

    private boolean i0(View view, View view2) {
        if (!this.f1800Z) {
            return true;
        }
        s w10 = w(view, true);
        if (w10 == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == w10.f1910b) {
            return true;
        }
        return false;
    }

    public String[] G() {
        return f1790f0;
    }

    public void h(s sVar) {
        g0(sVar);
    }

    public void k(s sVar) {
        g0(sVar);
    }

    public Animator p(ViewGroup viewGroup, s sVar, s sVar2) {
        int i10;
        View view;
        Animator animator;
        ObjectAnimator objectAnimator;
        int i11;
        Rect rect;
        ObjectAnimator objectAnimator2;
        s sVar3 = sVar;
        s sVar4 = sVar2;
        if (sVar3 == null || sVar4 == null) {
            return null;
        }
        Map map = sVar3.f1909a;
        Map map2 = sVar4.f1909a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar4.f1910b;
        if (i0(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) sVar3.f1909a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) sVar4.f1909a.get("android:changeBounds:bounds");
            int i12 = rect2.left;
            int i13 = rect3.left;
            int i14 = rect2.top;
            int i15 = rect3.top;
            int i16 = rect2.right;
            int i17 = rect3.right;
            int i18 = rect2.bottom;
            int i19 = rect3.bottom;
            int i20 = i16 - i12;
            int i21 = i18 - i14;
            int i22 = i17 - i13;
            int i23 = i19 - i15;
            View view3 = view2;
            Rect rect4 = (Rect) sVar3.f1909a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) sVar4.f1909a.get("android:changeBounds:clip");
            if ((i20 == 0 || i21 == 0) && (i22 == 0 || i23 == 0)) {
                i10 = 0;
            } else {
                if (i12 == i13 && i14 == i15) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                if (!(i16 == i17 && i18 == i19)) {
                    i10++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i10++;
            }
            if (i10 <= 0) {
                return null;
            }
            Rect rect6 = rect5;
            if (!this.f1799Y) {
                view = view3;
                A.f(view, i12, i14, i16, i18);
                if (i10 == 2) {
                    if (i20 == i22 && i21 == i23) {
                        animator = C1156f.a(view, f1796l0, y().a((float) i12, (float) i14, (float) i13, (float) i15));
                    } else {
                        k kVar = new k(view);
                        ObjectAnimator a10 = C1156f.a(kVar, f1792h0, y().a((float) i12, (float) i14, (float) i13, (float) i15));
                        ObjectAnimator a11 = C1156f.a(kVar, f1793i0, y().a((float) i16, (float) i18, (float) i17, (float) i19));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(new Animator[]{a10, a11});
                        animatorSet.addListener(new h(kVar));
                        animator = animatorSet;
                    }
                } else if (i12 == i13 && i14 == i15) {
                    animator = C1156f.a(view, f1794j0, y().a((float) i16, (float) i18, (float) i17, (float) i19));
                } else {
                    animator = C1156f.a(view, f1795k0, y().a((float) i12, (float) i14, (float) i13, (float) i15));
                }
            } else {
                view = view3;
                A.f(view, i12, i14, Math.max(i20, i22) + i12, Math.max(i21, i23) + i14);
                if (i12 == i13 && i14 == i15) {
                    objectAnimator = null;
                } else {
                    objectAnimator = C1156f.a(view, f1796l0, y().a((float) i12, (float) i14, (float) i13, (float) i15));
                }
                if (rect4 == null) {
                    i11 = 0;
                    rect4 = new Rect(0, 0, i20, i21);
                } else {
                    i11 = 0;
                }
                if (rect6 == null) {
                    rect = new Rect(i11, i11, i22, i23);
                } else {
                    rect = rect6;
                }
                if (!rect4.equals(rect)) {
                    C1680b0.v0(view, rect4);
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", f1797m0, new Object[]{rect4, rect});
                    ofObject.addListener(new i(view, rect6, i13, i15, i17, i19));
                    objectAnimator2 = ofObject;
                } else {
                    objectAnimator2 = null;
                }
                animator = r.c(objectAnimator, objectAnimator2);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                x.c(viewGroup4, true);
                a(new j(viewGroup4));
            }
            return animator;
        }
        int intValue = ((Integer) sVar3.f1909a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) sVar3.f1909a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) sVar4.f1909a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) sVar4.f1909a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.f1798X);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c10 = A.c(view2);
        A.g(view2, 0.0f);
        A.b(viewGroup).a(bitmapDrawable);
        C1157g y10 = y();
        int[] iArr = this.f1798X;
        int i24 = iArr[0];
        int i25 = iArr[1];
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{C1158h.a(f1791g0, y10.a((float) (intValue - i24), (float) (intValue2 - i25), (float) (intValue3 - i24), (float) (intValue4 - i25)))});
        ofPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, c10));
        return ofPropertyValuesHolder;
    }
}
