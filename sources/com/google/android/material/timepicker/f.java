package com.google.android.material.timepicker;

import Ua.h;
import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.core.content.c;
import com.google.android.material.timepicker.ClockHandView;
import com.google.android.material.timepicker.TimePickerView;
import y1.C2930A;

class f implements ClockHandView.d, TimePickerView.g, TimePickerView.f, ClockHandView.c, g {

    /* renamed from: f  reason: collision with root package name */
    private static final String[] f56416f = {"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};

    /* renamed from: g  reason: collision with root package name */
    private static final String[] f56417g = {"00", "2", "4", "6", "8", "10", "12", "14", "16", "18", "20", "22"};

    /* renamed from: h  reason: collision with root package name */
    private static final String[] f56418h = {"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};

    /* renamed from: a  reason: collision with root package name */
    private final TimePickerView f56419a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final e f56420b;

    /* renamed from: c  reason: collision with root package name */
    private float f56421c;

    /* renamed from: d  reason: collision with root package name */
    private float f56422d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f56423e = false;

    class a extends a {
        a(Context context, int i10) {
            super(context, i10);
        }

        public void onInitializeAccessibilityNodeInfo(View view, C2930A a10) {
            super.onInitializeAccessibilityNodeInfo(view, a10);
            a10.x0(view.getResources().getString(h.f52893i, new Object[]{String.valueOf(f.this.f56420b.c())}));
        }
    }

    class b extends a {
        b(Context context, int i10) {
            super(context, i10);
        }

        public void onInitializeAccessibilityNodeInfo(View view, C2930A a10) {
            super.onInitializeAccessibilityNodeInfo(view, a10);
            a10.x0(view.getResources().getString(h.f52895k, new Object[]{String.valueOf(f.this.f56420b.f56413e)}));
        }
    }

    public f(TimePickerView timePickerView, e eVar) {
        this.f56419a = timePickerView;
        this.f56420b = eVar;
        j();
    }

    private int h() {
        if (this.f56420b.f56411c == 1) {
            return 15;
        }
        return 30;
    }

    private String[] i() {
        if (this.f56420b.f56411c == 1) {
            return f56417g;
        }
        return f56416f;
    }

    private void k(int i10, int i11) {
        e eVar = this.f56420b;
        if (eVar.f56413e != i11 || eVar.f56412d != i10) {
            this.f56419a.performHapticFeedback(4);
        }
    }

    private void m() {
        TimePickerView timePickerView = this.f56419a;
        e eVar = this.f56420b;
        timePickerView.V(eVar.f56415g, eVar.c(), this.f56420b.f56413e);
    }

    private void n() {
        o(f56416f, "%d");
        o(f56417g, "%d");
        o(f56418h, "%02d");
    }

    private void o(String[] strArr, String str) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            strArr[i10] = e.b(this.f56419a.getResources(), strArr[i10], str);
        }
    }

    public void a() {
        this.f56419a.setVisibility(8);
    }

    public void b() {
        this.f56419a.setVisibility(0);
    }

    public void c(float f10, boolean z10) {
        this.f56423e = true;
        e eVar = this.f56420b;
        int i10 = eVar.f56413e;
        int i11 = eVar.f56412d;
        if (eVar.f56414f == 10) {
            this.f56419a.J(this.f56422d, false);
            AccessibilityManager accessibilityManager = (AccessibilityManager) c.getSystemService(this.f56419a.getContext(), AccessibilityManager.class);
            if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                l(12, true);
            }
        } else {
            int round = Math.round(f10);
            if (!z10) {
                this.f56420b.i(((round + 15) / 30) * 5);
                this.f56421c = (float) (this.f56420b.f56413e * 6);
            }
            this.f56419a.J(this.f56421c, z10);
        }
        this.f56423e = false;
        m();
        k(i11, i10);
    }

    public void d(int i10) {
        this.f56420b.j(i10);
    }

    public void e(int i10) {
        l(i10, true);
    }

    public void f(float f10, boolean z10) {
        if (!this.f56423e) {
            e eVar = this.f56420b;
            int i10 = eVar.f56412d;
            int i11 = eVar.f56413e;
            int round = Math.round(f10);
            e eVar2 = this.f56420b;
            if (eVar2.f56414f == 12) {
                eVar2.i((round + 3) / 6);
                this.f56421c = (float) Math.floor((double) (this.f56420b.f56413e * 6));
            } else {
                this.f56420b.g((round + (h() / 2)) / h());
                this.f56422d = (float) (this.f56420b.c() * h());
            }
            if (!z10) {
                m();
                k(i10, i11);
            }
        }
    }

    public void invalidate() {
        this.f56422d = (float) (this.f56420b.c() * h());
        e eVar = this.f56420b;
        this.f56421c = (float) (eVar.f56413e * 6);
        l(eVar.f56414f, false);
        m();
    }

    public void j() {
        if (this.f56420b.f56411c == 0) {
            this.f56419a.T();
        }
        this.f56419a.G(this);
        this.f56419a.P(this);
        this.f56419a.O(this);
        this.f56419a.M(this);
        n();
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void l(int i10, boolean z10) {
        boolean z11;
        String[] strArr;
        int i11;
        float f10;
        if (i10 == 12) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f56419a.I(z11);
        this.f56420b.f56414f = i10;
        TimePickerView timePickerView = this.f56419a;
        if (z11) {
            strArr = f56418h;
        } else {
            strArr = i();
        }
        if (z11) {
            i11 = h.f52895k;
        } else {
            i11 = h.f52893i;
        }
        timePickerView.R(strArr, i11);
        TimePickerView timePickerView2 = this.f56419a;
        if (z11) {
            f10 = this.f56421c;
        } else {
            f10 = this.f56422d;
        }
        timePickerView2.J(f10, z10);
        this.f56419a.H(i10);
        this.f56419a.L(new a(this.f56419a.getContext(), h.f52892h));
        this.f56419a.K(new b(this.f56419a.getContext(), h.f52894j));
    }
}
