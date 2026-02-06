package com.google.android.material.timepicker;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C1677a;
import androidx.core.view.C1680b0;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Locale;

class TimePickerView extends ConstraintLayout {

    /* renamed from: A  reason: collision with root package name */
    private final Chip f56355A;

    /* renamed from: B  reason: collision with root package name */
    private final ClockHandView f56356B;

    /* renamed from: C  reason: collision with root package name */
    private final ClockFaceView f56357C;

    /* renamed from: D  reason: collision with root package name */
    private final MaterialButtonToggleGroup f56358D;

    /* renamed from: E  reason: collision with root package name */
    private final View.OnClickListener f56359E;
    /* access modifiers changed from: private */

    /* renamed from: F  reason: collision with root package name */
    public f f56360F;
    /* access modifiers changed from: private */

    /* renamed from: G  reason: collision with root package name */
    public g f56361G;
    /* access modifiers changed from: private */

    /* renamed from: H  reason: collision with root package name */
    public e f56362H;

    /* renamed from: z  reason: collision with root package name */
    private final Chip f56363z;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            if (TimePickerView.this.f56361G != null) {
                TimePickerView.this.f56361G.e(((Integer) view.getTag(Ua.e.f52819O)).intValue());
            }
        }
    }

    class b implements MaterialButtonToggleGroup.d {
        b() {
        }

        public void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10) {
            int i11;
            if (i10 == Ua.e.f52840l) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            if (TimePickerView.this.f56360F != null && z10) {
                TimePickerView.this.f56360F.d(i11);
            }
        }
    }

    class c extends GestureDetector.SimpleOnGestureListener {
        c() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            e F10 = TimePickerView.this.f56362H;
            if (F10 == null) {
                return false;
            }
            F10.e();
            return true;
        }
    }

    class d implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GestureDetector f56367a;

        d(GestureDetector gestureDetector) {
            this.f56367a = gestureDetector;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f56367a.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    interface e {
        void e();
    }

    interface f {
        void d(int i10);
    }

    interface g {
        void e(int i10);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void Q() {
        this.f56363z.setTag(Ua.e.f52819O, 12);
        this.f56355A.setTag(Ua.e.f52819O, 10);
        this.f56363z.setOnClickListener(this.f56359E);
        this.f56355A.setOnClickListener(this.f56359E);
        this.f56363z.setAccessibilityClassName("android.view.View");
        this.f56355A.setAccessibilityClassName("android.view.View");
    }

    private void S() {
        d dVar = new d(new GestureDetector(getContext(), new c()));
        this.f56363z.setOnTouchListener(dVar);
        this.f56355A.setOnTouchListener(dVar);
    }

    private void U(Chip chip, boolean z10) {
        int i10;
        chip.setChecked(z10);
        if (z10) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        C1680b0.q0(chip, i10);
    }

    private void W() {
        int i10;
        if (this.f56358D.getVisibility() == 0) {
            androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
            dVar.p(this);
            if (C1680b0.A(this) == 0) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            dVar.n(Ua.e.f52836h, i10);
            dVar.i(this);
        }
    }

    public void G(ClockHandView.d dVar) {
        this.f56356B.b(dVar);
    }

    public void H(int i10) {
        boolean z10;
        Chip chip = this.f56363z;
        boolean z11 = false;
        if (i10 == 12) {
            z10 = true;
        } else {
            z10 = false;
        }
        U(chip, z10);
        Chip chip2 = this.f56355A;
        if (i10 == 10) {
            z11 = true;
        }
        U(chip2, z11);
    }

    public void I(boolean z10) {
        this.f56356B.j(z10);
    }

    public void J(float f10, boolean z10) {
        this.f56356B.m(f10, z10);
    }

    public void K(C1677a aVar) {
        C1680b0.o0(this.f56363z, aVar);
    }

    public void L(C1677a aVar) {
        C1680b0.o0(this.f56355A, aVar);
    }

    public void M(ClockHandView.c cVar) {
        this.f56356B.o(cVar);
    }

    /* access modifiers changed from: package-private */
    public void N(e eVar) {
        this.f56362H = eVar;
    }

    /* access modifiers changed from: package-private */
    public void O(f fVar) {
        this.f56360F = fVar;
    }

    /* access modifiers changed from: package-private */
    public void P(g gVar) {
        this.f56361G = gVar;
    }

    public void R(String[] strArr, int i10) {
        this.f56357C.P(strArr, i10);
    }

    public void T() {
        this.f56358D.setVisibility(0);
    }

    public void V(int i10, int i11, int i12) {
        int i13;
        if (i10 == 1) {
            i13 = Ua.e.f52840l;
        } else {
            i13 = Ua.e.f52839k;
        }
        this.f56358D.e(i13);
        Locale locale = getResources().getConfiguration().locale;
        String format = String.format(locale, "%02d", new Object[]{Integer.valueOf(i12)});
        String format2 = String.format(locale, "%02d", new Object[]{Integer.valueOf(i11)});
        if (!TextUtils.equals(this.f56363z.getText(), format)) {
            this.f56363z.setText(format);
        }
        if (!TextUtils.equals(this.f56355A.getText(), format2)) {
            this.f56355A.setText(format2);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        W();
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            W();
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f56359E = new a();
        LayoutInflater.from(context).inflate(Ua.g.f52865i, this);
        this.f56357C = (ClockFaceView) findViewById(Ua.e.f52837i);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(Ua.e.f52841m);
        this.f56358D = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new b());
        this.f56363z = (Chip) findViewById(Ua.e.f52846r);
        this.f56355A = (Chip) findViewById(Ua.e.f52843o);
        this.f56356B = (ClockHandView) findViewById(Ua.e.f52838j);
        S();
        Q();
    }
}
