package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.core.widget.b;
import q1.C2429a;

/* renamed from: androidx.appcompat.widget.i  reason: case insensitive filesystem */
class C1570i {

    /* renamed from: a  reason: collision with root package name */
    private final CheckedTextView f11910a;

    /* renamed from: b  reason: collision with root package name */
    private ColorStateList f11911b = null;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuff.Mode f11912c = null;

    /* renamed from: d  reason: collision with root package name */
    private boolean f11913d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f11914e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11915f;

    C1570i(CheckedTextView checkedTextView) {
        this.f11910a = checkedTextView;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Drawable a10 = b.a(this.f11910a);
        if (a10 == null) {
            return;
        }
        if (this.f11913d || this.f11914e) {
            Drawable mutate = C2429a.l(a10).mutate();
            if (this.f11913d) {
                C2429a.i(mutate, this.f11911b);
            }
            if (this.f11914e) {
                C2429a.j(mutate, this.f11912c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f11910a.getDrawableState());
            }
            this.f11910a.setCheckMarkDrawable(mutate);
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList b() {
        return this.f11911b;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode c() {
        return this.f11912c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|(2:6|7)|9|10|(1:14)|15|(1:17)|18|(1:20)|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x003f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.widget.CheckedTextView r0 = r10.f11910a
            android.content.Context r0 = r0.getContext()
            int[] r1 = i.j.f21508P0
            r2 = 0
            androidx.appcompat.widget.g0 r0 = androidx.appcompat.widget.g0.v(r0, r11, r1, r12, r2)
            android.widget.CheckedTextView r3 = r10.f11910a
            android.content.Context r4 = r3.getContext()
            int[] r5 = i.j.f21508P0
            android.content.res.TypedArray r7 = r0.r()
            r9 = 0
            r6 = r11
            r8 = r12
            androidx.core.view.C1680b0.m0(r3, r4, r5, r6, r7, r8, r9)
            int r11 = i.j.f21518R0     // Catch:{ all -> 0x003d }
            boolean r11 = r0.s(r11)     // Catch:{ all -> 0x003d }
            if (r11 == 0) goto L_0x003f
            int r11 = i.j.f21518R0     // Catch:{ all -> 0x003d }
            int r11 = r0.n(r11, r2)     // Catch:{ all -> 0x003d }
            if (r11 == 0) goto L_0x003f
            android.widget.CheckedTextView r12 = r10.f11910a     // Catch:{ NotFoundException -> 0x003f }
            android.content.Context r1 = r12.getContext()     // Catch:{ NotFoundException -> 0x003f }
            android.graphics.drawable.Drawable r11 = j.C2115a.b(r1, r11)     // Catch:{ NotFoundException -> 0x003f }
            r12.setCheckMarkDrawable(r11)     // Catch:{ NotFoundException -> 0x003f }
            goto L_0x005c
        L_0x003d:
            r11 = move-exception
            goto L_0x008c
        L_0x003f:
            int r11 = i.j.f21513Q0     // Catch:{ all -> 0x003d }
            boolean r11 = r0.s(r11)     // Catch:{ all -> 0x003d }
            if (r11 == 0) goto L_0x005c
            int r11 = i.j.f21513Q0     // Catch:{ all -> 0x003d }
            int r11 = r0.n(r11, r2)     // Catch:{ all -> 0x003d }
            if (r11 == 0) goto L_0x005c
            android.widget.CheckedTextView r12 = r10.f11910a     // Catch:{ all -> 0x003d }
            android.content.Context r1 = r12.getContext()     // Catch:{ all -> 0x003d }
            android.graphics.drawable.Drawable r11 = j.C2115a.b(r1, r11)     // Catch:{ all -> 0x003d }
            r12.setCheckMarkDrawable(r11)     // Catch:{ all -> 0x003d }
        L_0x005c:
            int r11 = i.j.f21523S0     // Catch:{ all -> 0x003d }
            boolean r11 = r0.s(r11)     // Catch:{ all -> 0x003d }
            if (r11 == 0) goto L_0x006f
            android.widget.CheckedTextView r11 = r10.f11910a     // Catch:{ all -> 0x003d }
            int r12 = i.j.f21523S0     // Catch:{ all -> 0x003d }
            android.content.res.ColorStateList r12 = r0.c(r12)     // Catch:{ all -> 0x003d }
            androidx.core.widget.b.b(r11, r12)     // Catch:{ all -> 0x003d }
        L_0x006f:
            int r11 = i.j.f21527T0     // Catch:{ all -> 0x003d }
            boolean r11 = r0.s(r11)     // Catch:{ all -> 0x003d }
            if (r11 == 0) goto L_0x0088
            android.widget.CheckedTextView r11 = r10.f11910a     // Catch:{ all -> 0x003d }
            int r12 = i.j.f21527T0     // Catch:{ all -> 0x003d }
            r1 = -1
            int r12 = r0.k(r12, r1)     // Catch:{ all -> 0x003d }
            r1 = 0
            android.graphics.PorterDuff$Mode r12 = androidx.appcompat.widget.N.e(r12, r1)     // Catch:{ all -> 0x003d }
            androidx.core.widget.b.c(r11, r12)     // Catch:{ all -> 0x003d }
        L_0x0088:
            r0.x()
            return
        L_0x008c:
            r0.x()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C1570i.d(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (this.f11915f) {
            this.f11915f = false;
            return;
        }
        this.f11915f = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public void f(ColorStateList colorStateList) {
        this.f11911b = colorStateList;
        this.f11913d = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public void g(PorterDuff.Mode mode) {
        this.f11912c = mode;
        this.f11914e = true;
        a();
    }
}
