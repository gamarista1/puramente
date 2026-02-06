package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import i.j;
import java.lang.ref.WeakReference;
import o1.h;

class B {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f11496a;

    /* renamed from: b  reason: collision with root package name */
    private e0 f11497b;

    /* renamed from: c  reason: collision with root package name */
    private e0 f11498c;

    /* renamed from: d  reason: collision with root package name */
    private e0 f11499d;

    /* renamed from: e  reason: collision with root package name */
    private e0 f11500e;

    /* renamed from: f  reason: collision with root package name */
    private e0 f11501f;

    /* renamed from: g  reason: collision with root package name */
    private e0 f11502g;

    /* renamed from: h  reason: collision with root package name */
    private e0 f11503h;

    /* renamed from: i  reason: collision with root package name */
    private final D f11504i;

    /* renamed from: j  reason: collision with root package name */
    private int f11505j = 0;

    /* renamed from: k  reason: collision with root package name */
    private int f11506k = -1;

    /* renamed from: l  reason: collision with root package name */
    private Typeface f11507l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f11508m;

    class a extends h.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f11509a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f11510b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ WeakReference f11511c;

        a(int i10, int i11, WeakReference weakReference) {
            this.f11509a = i10;
            this.f11510b = i11;
            this.f11511c = weakReference;
        }

        public void h(int i10) {
        }

        public void i(Typeface typeface) {
            int i10;
            boolean z10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f11509a) != -1) {
                if ((this.f11510b & 2) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                typeface = e.a(typeface, i10, z10);
            }
            B.this.n(this.f11511c, typeface);
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f11513a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Typeface f11514b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f11515c;

        b(TextView textView, Typeface typeface, int i10) {
            this.f11513a = textView;
            this.f11514b = typeface;
            this.f11515c = i10;
        }

        public void run() {
            this.f11513a.setTypeface(this.f11514b, this.f11515c);
        }
    }

    static class c {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    static class d {
        static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    static class e {
        static Typeface a(Typeface typeface, int i10, boolean z10) {
            return Typeface.create(typeface, i10, z10);
        }
    }

    B(TextView textView) {
        this.f11496a = textView;
        this.f11504i = new D(textView);
    }

    private void B(int i10, float f10) {
        this.f11504i.t(i10, f10);
    }

    private void C(Context context, g0 g0Var) {
        int i10;
        String o10;
        boolean z10;
        boolean z11;
        this.f11505j = g0Var.k(j.f21537V2, this.f11505j);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            int k10 = g0Var.k(j.f21549Y2, -1);
            this.f11506k = k10;
            if (k10 != -1) {
                this.f11505j &= 2;
            }
        }
        boolean z12 = true;
        if (g0Var.s(j.f21545X2) || g0Var.s(j.f21553Z2)) {
            this.f11507l = null;
            if (g0Var.s(j.f21553Z2)) {
                i10 = j.f21553Z2;
            } else {
                i10 = j.f21545X2;
            }
            int i12 = this.f11506k;
            int i13 = this.f11505j;
            if (!context.isRestricted()) {
                try {
                    Typeface j10 = g0Var.j(i10, this.f11505j, new a(i12, i13, new WeakReference(this.f11496a)));
                    if (j10 != null) {
                        if (i11 < 28 || this.f11506k == -1) {
                            this.f11507l = j10;
                        } else {
                            Typeface create = Typeface.create(j10, 0);
                            int i14 = this.f11506k;
                            if ((this.f11505j & 2) != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            this.f11507l = e.a(create, i14, z11);
                        }
                    }
                    if (this.f11507l == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f11508m = z10;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f11507l == null && (o10 = g0Var.o(i10)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f11506k == -1) {
                    this.f11507l = Typeface.create(o10, this.f11505j);
                    return;
                }
                Typeface create2 = Typeface.create(o10, 0);
                int i15 = this.f11506k;
                if ((this.f11505j & 2) == 0) {
                    z12 = false;
                }
                this.f11507l = e.a(create2, i15, z12);
            }
        } else if (g0Var.s(j.f21533U2)) {
            this.f11508m = false;
            int k11 = g0Var.k(j.f21533U2, 1);
            if (k11 == 1) {
                this.f11507l = Typeface.SANS_SERIF;
            } else if (k11 == 2) {
                this.f11507l = Typeface.SERIF;
            } else if (k11 == 3) {
                this.f11507l = Typeface.MONOSPACE;
            }
        }
    }

    private void a(Drawable drawable, e0 e0Var) {
        if (drawable != null && e0Var != null) {
            C1572k.i(drawable, e0Var, this.f11496a.getDrawableState());
        }
    }

    private static e0 d(Context context, C1572k kVar, int i10) {
        ColorStateList f10 = kVar.f(context, i10);
        if (f10 == null) {
            return null;
        }
        e0 e0Var = new e0();
        e0Var.f11893d = true;
        e0Var.f11890a = f10;
        return e0Var;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f11496a.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.f11496a;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            Drawable[] compoundDrawablesRelative2 = this.f11496a.getCompoundDrawablesRelative();
            Drawable drawable7 = compoundDrawablesRelative2[0];
            if (drawable7 == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = this.f11496a.getCompoundDrawables();
                TextView textView2 = this.f11496a;
                if (drawable == null) {
                    drawable = compoundDrawables[0];
                }
                if (drawable2 == null) {
                    drawable2 = compoundDrawables[1];
                }
                if (drawable3 == null) {
                    drawable3 = compoundDrawables[2];
                }
                if (drawable4 == null) {
                    drawable4 = compoundDrawables[3];
                }
                textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                return;
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.f11496a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
        }
    }

    private void z() {
        e0 e0Var = this.f11503h;
        this.f11497b = e0Var;
        this.f11498c = e0Var;
        this.f11499d = e0Var;
        this.f11500e = e0Var;
        this.f11501f = e0Var;
        this.f11502g = e0Var;
    }

    /* access modifiers changed from: package-private */
    public void A(int i10, float f10) {
        if (!r0.f12003c && !l()) {
            B(i10, f10);
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (!(this.f11497b == null && this.f11498c == null && this.f11499d == null && this.f11500e == null)) {
            Drawable[] compoundDrawables = this.f11496a.getCompoundDrawables();
            a(compoundDrawables[0], this.f11497b);
            a(compoundDrawables[1], this.f11498c);
            a(compoundDrawables[2], this.f11499d);
            a(compoundDrawables[3], this.f11500e);
        }
        if (this.f11501f != null || this.f11502g != null) {
            Drawable[] compoundDrawablesRelative = this.f11496a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f11501f);
            a(compoundDrawablesRelative[2], this.f11502g);
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f11504i.a();
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f11504i.f();
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f11504i.g();
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f11504i.h();
    }

    /* access modifiers changed from: package-private */
    public int[] h() {
        return this.f11504i.i();
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return this.f11504i.j();
    }

    /* access modifiers changed from: package-private */
    public ColorStateList j() {
        e0 e0Var = this.f11503h;
        if (e0Var != null) {
            return e0Var.f11890a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode k() {
        e0 e0Var = this.f11503h;
        if (e0Var != null) {
            return e0Var.f11891b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return this.f11504i.n();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m(android.util.AttributeSet r17, int r18) {
        /*
            r16 = this;
            r7 = r16
            r8 = r17
            r9 = r18
            android.widget.TextView r0 = r7.f11496a
            android.content.Context r10 = r0.getContext()
            androidx.appcompat.widget.k r11 = androidx.appcompat.widget.C1572k.b()
            int[] r0 = i.j.f21546Y
            r12 = 0
            androidx.appcompat.widget.g0 r13 = androidx.appcompat.widget.g0.v(r10, r8, r0, r9, r12)
            android.widget.TextView r0 = r7.f11496a
            android.content.Context r1 = r0.getContext()
            int[] r2 = i.j.f21546Y
            android.content.res.TypedArray r4 = r13.r()
            r6 = 0
            r3 = r17
            r5 = r18
            androidx.core.view.C1680b0.m0(r0, r1, r2, r3, r4, r5, r6)
            int r0 = i.j.f21550Z
            r14 = -1
            int r0 = r13.n(r0, r14)
            int r1 = i.j.f21565c0
            boolean r1 = r13.s(r1)
            if (r1 == 0) goto L_0x0046
            int r1 = i.j.f21565c0
            int r1 = r13.n(r1, r12)
            androidx.appcompat.widget.e0 r1 = d(r10, r11, r1)
            r7.f11497b = r1
        L_0x0046:
            int r1 = i.j.f21555a0
            boolean r1 = r13.s(r1)
            if (r1 == 0) goto L_0x005a
            int r1 = i.j.f21555a0
            int r1 = r13.n(r1, r12)
            androidx.appcompat.widget.e0 r1 = d(r10, r11, r1)
            r7.f11498c = r1
        L_0x005a:
            int r1 = i.j.f21570d0
            boolean r1 = r13.s(r1)
            if (r1 == 0) goto L_0x006e
            int r1 = i.j.f21570d0
            int r1 = r13.n(r1, r12)
            androidx.appcompat.widget.e0 r1 = d(r10, r11, r1)
            r7.f11499d = r1
        L_0x006e:
            int r1 = i.j.f21560b0
            boolean r1 = r13.s(r1)
            if (r1 == 0) goto L_0x0082
            int r1 = i.j.f21560b0
            int r1 = r13.n(r1, r12)
            androidx.appcompat.widget.e0 r1 = d(r10, r11, r1)
            r7.f11500e = r1
        L_0x0082:
            int r1 = i.j.f21575e0
            boolean r1 = r13.s(r1)
            if (r1 == 0) goto L_0x0096
            int r1 = i.j.f21575e0
            int r1 = r13.n(r1, r12)
            androidx.appcompat.widget.e0 r1 = d(r10, r11, r1)
            r7.f11501f = r1
        L_0x0096:
            int r1 = i.j.f21580f0
            boolean r1 = r13.s(r1)
            if (r1 == 0) goto L_0x00aa
            int r1 = i.j.f21580f0
            int r1 = r13.n(r1, r12)
            androidx.appcompat.widget.e0 r1 = d(r10, r11, r1)
            r7.f11502g = r1
        L_0x00aa:
            r13.x()
            android.widget.TextView r1 = r7.f11496a
            android.text.method.TransformationMethod r1 = r1.getTransformationMethod()
            boolean r1 = r1 instanceof android.text.method.PasswordTransformationMethod
            r2 = 26
            if (r0 == r14) goto L_0x00fe
            int[] r4 = i.j.f21525S2
            androidx.appcompat.widget.g0 r0 = androidx.appcompat.widget.g0.t(r10, r0, r4)
            if (r1 != 0) goto L_0x00d1
            int r4 = i.j.f21563b3
            boolean r4 = r0.s(r4)
            if (r4 == 0) goto L_0x00d1
            int r4 = i.j.f21563b3
            boolean r4 = r0.a(r4, r12)
            r5 = 1
            goto L_0x00d3
        L_0x00d1:
            r4 = r12
            r5 = r4
        L_0x00d3:
            r7.C(r10, r0)
            int r6 = android.os.Build.VERSION.SDK_INT
            int r15 = i.j.f21568c3
            boolean r15 = r0.s(r15)
            if (r15 == 0) goto L_0x00e7
            int r15 = i.j.f21568c3
            java.lang.String r15 = r0.o(r15)
            goto L_0x00e8
        L_0x00e7:
            r15 = 0
        L_0x00e8:
            if (r6 < r2) goto L_0x00f9
            int r6 = i.j.f21558a3
            boolean r6 = r0.s(r6)
            if (r6 == 0) goto L_0x00f9
            int r6 = i.j.f21558a3
            java.lang.String r6 = r0.o(r6)
            goto L_0x00fa
        L_0x00f9:
            r6 = 0
        L_0x00fa:
            r0.x()
            goto L_0x0102
        L_0x00fe:
            r4 = r12
            r5 = r4
            r6 = 0
            r15 = 0
        L_0x0102:
            int[] r0 = i.j.f21525S2
            androidx.appcompat.widget.g0 r0 = androidx.appcompat.widget.g0.v(r10, r8, r0, r9, r12)
            if (r1 != 0) goto L_0x011a
            int r3 = i.j.f21563b3
            boolean r3 = r0.s(r3)
            if (r3 == 0) goto L_0x011a
            int r3 = i.j.f21563b3
            boolean r4 = r0.a(r3, r12)
            r3 = 1
            goto L_0x011b
        L_0x011a:
            r3 = r5
        L_0x011b:
            int r5 = android.os.Build.VERSION.SDK_INT
            int r13 = i.j.f21568c3
            boolean r13 = r0.s(r13)
            if (r13 == 0) goto L_0x012b
            int r13 = i.j.f21568c3
            java.lang.String r15 = r0.o(r13)
        L_0x012b:
            if (r5 < r2) goto L_0x013b
            int r2 = i.j.f21558a3
            boolean r2 = r0.s(r2)
            if (r2 == 0) goto L_0x013b
            int r2 = i.j.f21558a3
            java.lang.String r6 = r0.o(r2)
        L_0x013b:
            r2 = 28
            if (r5 < r2) goto L_0x0155
            int r2 = i.j.f21529T2
            boolean r2 = r0.s(r2)
            if (r2 == 0) goto L_0x0155
            int r2 = i.j.f21529T2
            int r2 = r0.f(r2, r14)
            if (r2 != 0) goto L_0x0155
            android.widget.TextView r2 = r7.f11496a
            r5 = 0
            r2.setTextSize(r12, r5)
        L_0x0155:
            r7.C(r10, r0)
            r0.x()
            if (r1 != 0) goto L_0x0162
            if (r3 == 0) goto L_0x0162
            r7.s(r4)
        L_0x0162:
            android.graphics.Typeface r0 = r7.f11507l
            if (r0 == 0) goto L_0x0177
            int r1 = r7.f11506k
            if (r1 != r14) goto L_0x0172
            android.widget.TextView r1 = r7.f11496a
            int r2 = r7.f11505j
            r1.setTypeface(r0, r2)
            goto L_0x0177
        L_0x0172:
            android.widget.TextView r1 = r7.f11496a
            r1.setTypeface(r0)
        L_0x0177:
            if (r6 == 0) goto L_0x017e
            android.widget.TextView r0 = r7.f11496a
            androidx.appcompat.widget.B.d.d(r0, r6)
        L_0x017e:
            if (r15 == 0) goto L_0x0189
            android.widget.TextView r0 = r7.f11496a
            android.os.LocaleList r1 = androidx.appcompat.widget.B.c.a(r15)
            androidx.appcompat.widget.B.c.b(r0, r1)
        L_0x0189:
            androidx.appcompat.widget.D r0 = r7.f11504i
            r0.o(r8, r9)
            boolean r0 = androidx.appcompat.widget.r0.f12003c
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 == 0) goto L_0x01cd
            androidx.appcompat.widget.D r0 = r7.f11504i
            int r0 = r0.j()
            if (r0 == 0) goto L_0x01cd
            androidx.appcompat.widget.D r0 = r7.f11504i
            int[] r0 = r0.i()
            int r1 = r0.length
            if (r1 <= 0) goto L_0x01cd
            android.widget.TextView r1 = r7.f11496a
            int r1 = androidx.appcompat.widget.B.d.a(r1)
            float r1 = (float) r1
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x01c8
            android.widget.TextView r0 = r7.f11496a
            androidx.appcompat.widget.D r1 = r7.f11504i
            int r1 = r1.g()
            androidx.appcompat.widget.D r2 = r7.f11504i
            int r2 = r2.f()
            androidx.appcompat.widget.D r3 = r7.f11504i
            int r3 = r3.h()
            androidx.appcompat.widget.B.d.b(r0, r1, r2, r3, r12)
            goto L_0x01cd
        L_0x01c8:
            android.widget.TextView r1 = r7.f11496a
            androidx.appcompat.widget.B.d.c(r1, r0, r12)
        L_0x01cd:
            int[] r0 = i.j.f21585g0
            androidx.appcompat.widget.g0 r8 = androidx.appcompat.widget.g0.u(r10, r8, r0)
            int r0 = i.j.f21625o0
            int r0 = r8.n(r0, r14)
            if (r0 == r14) goto L_0x01e1
            android.graphics.drawable.Drawable r0 = r11.c(r10, r0)
            r1 = r0
            goto L_0x01e2
        L_0x01e1:
            r1 = 0
        L_0x01e2:
            int r0 = i.j.f21650t0
            int r0 = r8.n(r0, r14)
            if (r0 == r14) goto L_0x01f0
            android.graphics.drawable.Drawable r0 = r11.c(r10, r0)
            r2 = r0
            goto L_0x01f1
        L_0x01f0:
            r2 = 0
        L_0x01f1:
            int r0 = i.j.f21630p0
            int r0 = r8.n(r0, r14)
            if (r0 == r14) goto L_0x01ff
            android.graphics.drawable.Drawable r0 = r11.c(r10, r0)
            r3 = r0
            goto L_0x0200
        L_0x01ff:
            r3 = 0
        L_0x0200:
            int r0 = i.j.f21615m0
            int r0 = r8.n(r0, r14)
            if (r0 == r14) goto L_0x020e
            android.graphics.drawable.Drawable r0 = r11.c(r10, r0)
            r4 = r0
            goto L_0x020f
        L_0x020e:
            r4 = 0
        L_0x020f:
            int r0 = i.j.f21635q0
            int r0 = r8.n(r0, r14)
            if (r0 == r14) goto L_0x021d
            android.graphics.drawable.Drawable r0 = r11.c(r10, r0)
            r5 = r0
            goto L_0x021e
        L_0x021d:
            r5 = 0
        L_0x021e:
            int r0 = i.j.f21620n0
            int r0 = r8.n(r0, r14)
            if (r0 == r14) goto L_0x022c
            android.graphics.drawable.Drawable r0 = r11.c(r10, r0)
            r6 = r0
            goto L_0x022d
        L_0x022c:
            r6 = 0
        L_0x022d:
            r0 = r16
            r0.y(r1, r2, r3, r4, r5, r6)
            int r0 = i.j.f21640r0
            boolean r0 = r8.s(r0)
            if (r0 == 0) goto L_0x0245
            int r0 = i.j.f21640r0
            android.content.res.ColorStateList r0 = r8.c(r0)
            android.widget.TextView r1 = r7.f11496a
            androidx.core.widget.i.g(r1, r0)
        L_0x0245:
            int r0 = i.j.f21645s0
            boolean r0 = r8.s(r0)
            if (r0 == 0) goto L_0x025d
            int r0 = i.j.f21645s0
            int r0 = r8.k(r0, r14)
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.N.e(r0, r1)
            android.widget.TextView r1 = r7.f11496a
            androidx.core.widget.i.h(r1, r0)
        L_0x025d:
            int r0 = i.j.f21660v0
            int r0 = r8.f(r0, r14)
            int r1 = i.j.f21665w0
            int r1 = r8.f(r1, r14)
            int r2 = i.j.f21670x0
            boolean r2 = r8.s(r2)
            if (r2 == 0) goto L_0x0294
            int r2 = i.j.f21670x0
            android.util.TypedValue r2 = r8.w(r2)
            if (r2 == 0) goto L_0x028b
            int r3 = r2.type
            r4 = 5
            if (r3 != r4) goto L_0x028b
            int r3 = r2.data
            int r3 = x1.j.a(r3)
            int r2 = r2.data
            float r2 = android.util.TypedValue.complexToFloat(r2)
            goto L_0x0296
        L_0x028b:
            int r2 = i.j.f21670x0
            int r2 = r8.f(r2, r14)
            float r2 = (float) r2
        L_0x0292:
            r3 = r14
            goto L_0x0296
        L_0x0294:
            r2 = r9
            goto L_0x0292
        L_0x0296:
            r8.x()
            if (r0 == r14) goto L_0x02a0
            android.widget.TextView r4 = r7.f11496a
            androidx.core.widget.i.j(r4, r0)
        L_0x02a0:
            if (r1 == r14) goto L_0x02a7
            android.widget.TextView r0 = r7.f11496a
            androidx.core.widget.i.k(r0, r1)
        L_0x02a7:
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x02b9
            if (r3 != r14) goto L_0x02b4
            android.widget.TextView r0 = r7.f11496a
            int r1 = (int) r2
            androidx.core.widget.i.l(r0, r1)
            goto L_0x02b9
        L_0x02b4:
            android.widget.TextView r0 = r7.f11496a
            androidx.core.widget.i.m(r0, r3, r2)
        L_0x02b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.B.m(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    public void n(WeakReference weakReference, Typeface typeface) {
        if (this.f11508m) {
            this.f11507l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView == null) {
                return;
            }
            if (textView.isAttachedToWindow()) {
                textView.post(new b(textView, typeface, this.f11505j));
            } else {
                textView.setTypeface(typeface, this.f11505j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void o(boolean z10, int i10, int i11, int i12, int i13) {
        if (!r0.f12003c) {
            c();
        }
    }

    /* access modifiers changed from: package-private */
    public void p() {
        b();
    }

    /* access modifiers changed from: package-private */
    public void q(Context context, int i10) {
        String o10;
        g0 t10 = g0.t(context, i10, j.f21525S2);
        if (t10.s(j.f21563b3)) {
            s(t10.a(j.f21563b3, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (t10.s(j.f21529T2) && t10.f(j.f21529T2, -1) == 0) {
            this.f11496a.setTextSize(0, 0.0f);
        }
        C(context, t10);
        if (i11 >= 26 && t10.s(j.f21558a3) && (o10 = t10.o(j.f21558a3)) != null) {
            d.d(this.f11496a, o10);
        }
        t10.x();
        Typeface typeface = this.f11507l;
        if (typeface != null) {
            this.f11496a.setTypeface(typeface, this.f11505j);
        }
    }

    /* access modifiers changed from: package-private */
    public void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            A1.c.f(editorInfo, textView.getText());
        }
    }

    /* access modifiers changed from: package-private */
    public void s(boolean z10) {
        this.f11496a.setAllCaps(z10);
    }

    /* access modifiers changed from: package-private */
    public void t(int i10, int i11, int i12, int i13) {
        this.f11504i.p(i10, i11, i12, i13);
    }

    /* access modifiers changed from: package-private */
    public void u(int[] iArr, int i10) {
        this.f11504i.q(iArr, i10);
    }

    /* access modifiers changed from: package-private */
    public void v(int i10) {
        this.f11504i.r(i10);
    }

    /* access modifiers changed from: package-private */
    public void w(ColorStateList colorStateList) {
        boolean z10;
        if (this.f11503h == null) {
            this.f11503h = new e0();
        }
        e0 e0Var = this.f11503h;
        e0Var.f11890a = colorStateList;
        if (colorStateList != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e0Var.f11893d = z10;
        z();
    }

    /* access modifiers changed from: package-private */
    public void x(PorterDuff.Mode mode) {
        boolean z10;
        if (this.f11503h == null) {
            this.f11503h = new e0();
        }
        e0 e0Var = this.f11503h;
        e0Var.f11891b = mode;
        if (mode != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e0Var.f11892c = z10;
        z();
    }
}
