package E3;

import E3.C1162l;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

public abstract class M extends C1162l {

    /* renamed from: Y  reason: collision with root package name */
    private static final String[] f1771Y = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: X  reason: collision with root package name */
    private int f1772X = 3;

    class a extends C1163m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f1773a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f1774b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f1775c;

        a(ViewGroup viewGroup, View view, View view2) {
            this.f1773a = viewGroup;
            this.f1774b = view;
            this.f1775c = view2;
        }

        public void b(C1162l lVar) {
            if (this.f1774b.getParent() == null) {
                x.a(this.f1773a).c(this.f1774b);
            } else {
                M.this.cancel();
            }
        }

        public void c(C1162l lVar) {
            x.a(this.f1773a).d(this.f1774b);
        }

        public void d(C1162l lVar) {
            this.f1775c.setTag(C1159i.f1845a, (Object) null);
            x.a(this.f1773a).d(this.f1774b);
            lVar.S(this);
        }
    }

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        boolean f1783a;

        /* renamed from: b  reason: collision with root package name */
        boolean f1784b;

        /* renamed from: c  reason: collision with root package name */
        int f1785c;

        /* renamed from: d  reason: collision with root package name */
        int f1786d;

        /* renamed from: e  reason: collision with root package name */
        ViewGroup f1787e;

        /* renamed from: f  reason: collision with root package name */
        ViewGroup f1788f;

        c() {
        }
    }

    private void g0(s sVar) {
        sVar.f1909a.put("android:visibility:visibility", Integer.valueOf(sVar.f1910b.getVisibility()));
        sVar.f1909a.put("android:visibility:parent", sVar.f1910b.getParent());
        int[] iArr = new int[2];
        sVar.f1910b.getLocationOnScreen(iArr);
        sVar.f1909a.put("android:visibility:screenLocation", iArr);
    }

    private c i0(s sVar, s sVar2) {
        c cVar = new c();
        cVar.f1783a = false;
        cVar.f1784b = false;
        if (sVar == null || !sVar.f1909a.containsKey("android:visibility:visibility")) {
            cVar.f1785c = -1;
            cVar.f1787e = null;
        } else {
            cVar.f1785c = ((Integer) sVar.f1909a.get("android:visibility:visibility")).intValue();
            cVar.f1787e = (ViewGroup) sVar.f1909a.get("android:visibility:parent");
        }
        if (sVar2 == null || !sVar2.f1909a.containsKey("android:visibility:visibility")) {
            cVar.f1786d = -1;
            cVar.f1788f = null;
        } else {
            cVar.f1786d = ((Integer) sVar2.f1909a.get("android:visibility:visibility")).intValue();
            cVar.f1788f = (ViewGroup) sVar2.f1909a.get("android:visibility:parent");
        }
        if (sVar != null && sVar2 != null) {
            int i10 = cVar.f1785c;
            int i11 = cVar.f1786d;
            if (i10 == i11 && cVar.f1787e == cVar.f1788f) {
                return cVar;
            }
            if (i10 != i11) {
                if (i10 == 0) {
                    cVar.f1784b = false;
                    cVar.f1783a = true;
                } else if (i11 == 0) {
                    cVar.f1784b = true;
                    cVar.f1783a = true;
                }
            } else if (cVar.f1788f == null) {
                cVar.f1784b = false;
                cVar.f1783a = true;
            } else if (cVar.f1787e == null) {
                cVar.f1784b = true;
                cVar.f1783a = true;
            }
        } else if (sVar == null && cVar.f1786d == 0) {
            cVar.f1784b = true;
            cVar.f1783a = true;
        } else if (sVar2 == null && cVar.f1785c == 0) {
            cVar.f1784b = false;
            cVar.f1783a = true;
        }
        return cVar;
    }

    public String[] G() {
        return f1771Y;
    }

    public boolean I(s sVar, s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.f1909a.containsKey("android:visibility:visibility") != sVar.f1909a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c i02 = i0(sVar, sVar2);
        if (!i02.f1783a) {
            return false;
        }
        if (i02.f1785c == 0 || i02.f1786d == 0) {
            return true;
        }
        return false;
    }

    public void h(s sVar) {
        g0(sVar);
    }

    public Animator j0(ViewGroup viewGroup, s sVar, int i10, s sVar2, int i11) {
        if ((this.f1772X & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f1910b.getParent();
            if (i0(w(view, false), H(view, false)).f1783a) {
                return null;
            }
        }
        return k0(viewGroup, sVar2.f1910b, sVar, sVar2);
    }

    public void k(s sVar) {
        g0(sVar);
    }

    public abstract Animator k0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0083, code lost:
        if (r10.f1879w != false) goto L_0x0085;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator l0(android.view.ViewGroup r11, E3.s r12, int r13, E3.s r14, int r15) {
        /*
            r10 = this;
            int r13 = r10.f1772X
            r0 = 2
            r13 = r13 & r0
            r1 = 0
            if (r13 == r0) goto L_0x0008
            return r1
        L_0x0008:
            if (r12 != 0) goto L_0x000b
            return r1
        L_0x000b:
            android.view.View r13 = r12.f1910b
            if (r14 == 0) goto L_0x0012
            android.view.View r2 = r14.f1910b
            goto L_0x0013
        L_0x0012:
            r2 = r1
        L_0x0013:
            int r3 = E3.C1159i.f1845a
            java.lang.Object r3 = r13.getTag(r3)
            android.view.View r3 = (android.view.View) r3
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0023
            r2 = r1
            r6 = r5
            goto L_0x0088
        L_0x0023:
            if (r2 == 0) goto L_0x003a
            android.view.ViewParent r3 = r2.getParent()
            if (r3 != 0) goto L_0x002c
            goto L_0x003a
        L_0x002c:
            r3 = 4
            if (r15 != r3) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            if (r13 != r2) goto L_0x0036
        L_0x0032:
            r3 = r2
            r6 = r4
            r2 = r1
            goto L_0x003e
        L_0x0036:
            r2 = r1
            r3 = r2
            r6 = r5
            goto L_0x003e
        L_0x003a:
            if (r2 == 0) goto L_0x0036
            r3 = r1
            r6 = r4
        L_0x003e:
            if (r6 == 0) goto L_0x0069
            android.view.ViewParent r6 = r13.getParent()
            if (r6 != 0) goto L_0x0047
            goto L_0x0085
        L_0x0047:
            android.view.ViewParent r6 = r13.getParent()
            boolean r6 = r6 instanceof android.view.View
            if (r6 == 0) goto L_0x0069
            android.view.ViewParent r6 = r13.getParent()
            android.view.View r6 = (android.view.View) r6
            E3.s r7 = r10.H(r6, r5)
            E3.s r8 = r10.w(r6, r5)
            E3.M$c r7 = r10.i0(r7, r8)
            boolean r7 = r7.f1783a
            if (r7 != 0) goto L_0x006e
            android.view.View r2 = E3.r.a(r11, r13, r6)
        L_0x0069:
            r6 = r4
            r9 = r3
            r3 = r2
            r2 = r9
            goto L_0x0088
        L_0x006e:
            int r7 = r6.getId()
            android.view.ViewParent r6 = r6.getParent()
            if (r6 != 0) goto L_0x0069
            r6 = -1
            if (r7 == r6) goto L_0x0069
            android.view.View r6 = r11.findViewById(r7)
            if (r6 == 0) goto L_0x0069
            boolean r6 = r10.f1879w
            if (r6 == 0) goto L_0x0069
        L_0x0085:
            r2 = r3
            r6 = r4
            r3 = r13
        L_0x0088:
            if (r3 == 0) goto L_0x00da
            if (r6 != 0) goto L_0x00bc
            java.util.Map r15 = r12.f1909a
            java.lang.String r1 = "android:visibility:screenLocation"
            java.lang.Object r15 = r15.get(r1)
            int[] r15 = (int[]) r15
            r1 = r15[r4]
            r15 = r15[r5]
            int[] r0 = new int[r0]
            r11.getLocationOnScreen(r0)
            r2 = r0[r4]
            int r1 = r1 - r2
            int r2 = r3.getLeft()
            int r1 = r1 - r2
            r3.offsetLeftAndRight(r1)
            r0 = r0[r5]
            int r15 = r15 - r0
            int r0 = r3.getTop()
            int r15 = r15 - r0
            r3.offsetTopAndBottom(r15)
            E3.v r15 = E3.x.a(r11)
            r15.c(r3)
        L_0x00bc:
            android.animation.Animator r12 = r10.m0(r11, r3, r12, r14)
            if (r6 != 0) goto L_0x00d9
            if (r12 != 0) goto L_0x00cc
            E3.v r11 = E3.x.a(r11)
            r11.d(r3)
            goto L_0x00d9
        L_0x00cc:
            int r14 = E3.C1159i.f1845a
            r13.setTag(r14, r3)
            E3.M$a r14 = new E3.M$a
            r14.<init>(r11, r3, r13)
            r10.a(r14)
        L_0x00d9:
            return r12
        L_0x00da:
            if (r2 == 0) goto L_0x00fc
            int r13 = r2.getVisibility()
            E3.A.h(r2, r4)
            android.animation.Animator r11 = r10.m0(r11, r2, r12, r14)
            if (r11 == 0) goto L_0x00f8
            E3.M$b r12 = new E3.M$b
            r12.<init>(r2, r15, r5)
            r11.addListener(r12)
            E3.C1151a.a(r11, r12)
            r10.a(r12)
            goto L_0x00fb
        L_0x00f8:
            E3.A.h(r2, r13)
        L_0x00fb:
            return r11
        L_0x00fc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.M.l0(android.view.ViewGroup, E3.s, int, E3.s, int):android.animation.Animator");
    }

    public abstract Animator m0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    public void n0(int i10) {
        if ((i10 & -4) == 0) {
            this.f1772X = i10;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    public Animator p(ViewGroup viewGroup, s sVar, s sVar2) {
        c i02 = i0(sVar, sVar2);
        if (!i02.f1783a) {
            return null;
        }
        if (i02.f1787e == null && i02.f1788f == null) {
            return null;
        }
        if (i02.f1784b) {
            return j0(viewGroup, sVar, i02.f1785c, sVar2, i02.f1786d);
        }
        return l0(viewGroup, sVar, i02.f1785c, sVar2, i02.f1786d);
    }

    private static class b extends AnimatorListenerAdapter implements C1162l.f {

        /* renamed from: a  reason: collision with root package name */
        private final View f1777a;

        /* renamed from: b  reason: collision with root package name */
        private final int f1778b;

        /* renamed from: c  reason: collision with root package name */
        private final ViewGroup f1779c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f1780d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f1781e;

        /* renamed from: f  reason: collision with root package name */
        boolean f1782f = false;

        b(View view, int i10, boolean z10) {
            this.f1777a = view;
            this.f1778b = i10;
            this.f1779c = (ViewGroup) view.getParent();
            this.f1780d = z10;
            g(true);
        }

        private void f() {
            if (!this.f1782f) {
                A.h(this.f1777a, this.f1778b);
                ViewGroup viewGroup = this.f1779c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        private void g(boolean z10) {
            ViewGroup viewGroup;
            if (this.f1780d && this.f1781e != z10 && (viewGroup = this.f1779c) != null) {
                this.f1781e = z10;
                x.c(viewGroup, z10);
            }
        }

        public void b(C1162l lVar) {
            g(true);
        }

        public void c(C1162l lVar) {
            g(false);
        }

        public void d(C1162l lVar) {
            f();
            lVar.S(this);
        }

        public void onAnimationCancel(Animator animator) {
            this.f1782f = true;
        }

        public void onAnimationEnd(Animator animator) {
            f();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f1782f) {
                A.h(this.f1777a, this.f1778b);
            }
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f1782f) {
                A.h(this.f1777a, 0);
            }
        }

        public void a(C1162l lVar) {
        }

        public void e(C1162l lVar) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }
}
