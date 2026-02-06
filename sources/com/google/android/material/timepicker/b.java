package com.google.android.material.timepicker;

import Ua.e;
import Ua.g;
import Ua.h;
import Ua.i;
import Ua.j;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.C1680b0;
import androidx.fragment.app.C1767o;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.timepicker.TimePickerView;
import fb.C4981b;
import ib.C5020g;
import java.util.LinkedHashSet;
import java.util.Set;

public final class b extends C1767o implements TimePickerView.e {

    /* renamed from: A  reason: collision with root package name */
    private int f56370A;

    /* renamed from: B  reason: collision with root package name */
    private int f56371B = 0;

    /* renamed from: C  reason: collision with root package name */
    private CharSequence f56372C;

    /* renamed from: D  reason: collision with root package name */
    private int f56373D = 0;

    /* renamed from: E  reason: collision with root package name */
    private CharSequence f56374E;

    /* renamed from: F  reason: collision with root package name */
    private int f56375F = 0;

    /* renamed from: G  reason: collision with root package name */
    private CharSequence f56376G;
    /* access modifiers changed from: private */

    /* renamed from: H  reason: collision with root package name */
    public MaterialButton f56377H;

    /* renamed from: I  reason: collision with root package name */
    private Button f56378I;
    /* access modifiers changed from: private */

    /* renamed from: X  reason: collision with root package name */
    public int f56379X = 0;

    /* renamed from: Y  reason: collision with root package name */
    private e f56380Y;

    /* renamed from: Z  reason: collision with root package name */
    private int f56381Z = 0;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final Set f56382q = new LinkedHashSet();
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final Set f56383r = new LinkedHashSet();

    /* renamed from: s  reason: collision with root package name */
    private final Set f56384s = new LinkedHashSet();

    /* renamed from: t  reason: collision with root package name */
    private final Set f56385t = new LinkedHashSet();

    /* renamed from: u  reason: collision with root package name */
    private TimePickerView f56386u;

    /* renamed from: v  reason: collision with root package name */
    private ViewStub f56387v;

    /* renamed from: w  reason: collision with root package name */
    private f f56388w;

    /* renamed from: x  reason: collision with root package name */
    private i f56389x;

    /* renamed from: y  reason: collision with root package name */
    private g f56390y;

    /* renamed from: z  reason: collision with root package name */
    private int f56391z;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            for (View.OnClickListener onClick : b.this.f56382q) {
                onClick.onClick(view);
            }
            b.this.F();
        }
    }

    /* renamed from: com.google.android.material.timepicker.b$b  reason: collision with other inner class name */
    class C0841b implements View.OnClickListener {
        C0841b() {
        }

        public void onClick(View view) {
            for (View.OnClickListener onClick : b.this.f56383r) {
                onClick.onClick(view);
            }
            b.this.F();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        public void onClick(View view) {
            int i10;
            b bVar = b.this;
            if (bVar.f56379X == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            int unused = bVar.f56379X = i10;
            b bVar2 = b.this;
            bVar2.k0(bVar2.f56377H);
        }
    }

    public static final class d {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public e f56395a = new e();
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f56396b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f56397c = 0;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f56398d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f56399e = 0;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f56400f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public int f56401g = 0;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f56402h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public int f56403i = 0;

        public b j() {
            return b.h0(this);
        }

        public d k(int i10) {
            this.f56395a.h(i10);
            return this;
        }

        public d l(int i10) {
            this.f56395a.i(i10);
            return this;
        }

        public d m(int i10) {
            this.f56403i = i10;
            return this;
        }

        public d n(int i10) {
            e eVar = this.f56395a;
            int i11 = eVar.f56412d;
            int i12 = eVar.f56413e;
            e eVar2 = new e(i10);
            this.f56395a = eVar2;
            eVar2.i(i12);
            this.f56395a.h(i11);
            return this;
        }

        public d o(CharSequence charSequence) {
            this.f56398d = charSequence;
            return this;
        }
    }

    private Pair c0(int i10) {
        if (i10 == 0) {
            return new Pair(Integer.valueOf(this.f56391z), Integer.valueOf(h.f52899o));
        }
        if (i10 == 1) {
            return new Pair(Integer.valueOf(this.f56370A), Integer.valueOf(h.f52896l));
        }
        throw new IllegalArgumentException("no icon for mode: " + i10);
    }

    private int f0() {
        int i10 = this.f56381Z;
        if (i10 != 0) {
            return i10;
        }
        TypedValue a10 = C4981b.a(requireContext(), Ua.a.f52748z);
        if (a10 == null) {
            return 0;
        }
        return a10.data;
    }

    private g g0(int i10, TimePickerView timePickerView, ViewStub viewStub) {
        if (i10 == 0) {
            f fVar = this.f56388w;
            if (fVar == null) {
                fVar = new f(timePickerView, this.f56380Y);
            }
            this.f56388w = fVar;
            return fVar;
        }
        if (this.f56389x == null) {
            this.f56389x = new i((LinearLayout) viewStub.inflate(), this.f56380Y);
        }
        this.f56389x.f();
        return this.f56389x;
    }

    /* access modifiers changed from: private */
    public static b h0(d dVar) {
        b bVar = new b();
        Bundle bundle = new Bundle();
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", dVar.f56395a);
        bundle.putInt("TIME_PICKER_INPUT_MODE", dVar.f56396b);
        bundle.putInt("TIME_PICKER_TITLE_RES", dVar.f56397c);
        if (dVar.f56398d != null) {
            bundle.putCharSequence("TIME_PICKER_TITLE_TEXT", dVar.f56398d);
        }
        bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", dVar.f56399e);
        if (dVar.f56400f != null) {
            bundle.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", dVar.f56400f);
        }
        bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", dVar.f56401g);
        if (dVar.f56402h != null) {
            bundle.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", dVar.f56402h);
        }
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", dVar.f56403i);
        bVar.setArguments(bundle);
        return bVar;
    }

    private void i0(Bundle bundle) {
        if (bundle != null) {
            e eVar = (e) bundle.getParcelable("TIME_PICKER_TIME_MODEL");
            this.f56380Y = eVar;
            if (eVar == null) {
                this.f56380Y = new e();
            }
            this.f56379X = bundle.getInt("TIME_PICKER_INPUT_MODE", 0);
            this.f56371B = bundle.getInt("TIME_PICKER_TITLE_RES", 0);
            this.f56372C = bundle.getCharSequence("TIME_PICKER_TITLE_TEXT");
            this.f56373D = bundle.getInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", 0);
            this.f56374E = bundle.getCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT");
            this.f56375F = bundle.getInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", 0);
            this.f56376G = bundle.getCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT");
            this.f56381Z = bundle.getInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", 0);
        }
    }

    private void j0() {
        int i10;
        Button button = this.f56378I;
        if (button != null) {
            if (J()) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            button.setVisibility(i10);
        }
    }

    /* access modifiers changed from: private */
    public void k0(MaterialButton materialButton) {
        if (materialButton != null && this.f56386u != null && this.f56387v != null) {
            g gVar = this.f56390y;
            if (gVar != null) {
                gVar.a();
            }
            g g02 = g0(this.f56379X, this.f56386u, this.f56387v);
            this.f56390y = g02;
            g02.b();
            this.f56390y.invalidate();
            Pair c02 = c0(this.f56379X);
            materialButton.setIconResource(((Integer) c02.first).intValue());
            materialButton.setContentDescription(getResources().getString(((Integer) c02.second).intValue()));
            materialButton.sendAccessibilityEvent(4);
        }
    }

    public final Dialog K(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), f0());
        Context context = dialog.getContext();
        int c10 = C4981b.c(context, Ua.a.f52734l, b.class.getCanonicalName());
        C5020g gVar = new C5020g(context, (AttributeSet) null, Ua.a.f52747y, i.f52927q);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, j.f53322z3, Ua.a.f52747y, i.f52927q);
        this.f56370A = obtainStyledAttributes.getResourceId(j.f52934A3, 0);
        this.f56391z = obtainStyledAttributes.getResourceId(j.f52942B3, 0);
        obtainStyledAttributes.recycle();
        gVar.M(context);
        gVar.W(ColorStateList.valueOf(c10));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(gVar);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        gVar.V(C1680b0.v(window.getDecorView()));
        return dialog;
    }

    public boolean b0(View.OnClickListener onClickListener) {
        return this.f56382q.add(onClickListener);
    }

    public int d0() {
        return this.f56380Y.f56412d % 24;
    }

    public void e() {
        this.f56379X = 1;
        k0(this.f56377H);
        this.f56389x.i();
    }

    public int e0() {
        return this.f56380Y.f56413e;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        for (DialogInterface.OnCancelListener onCancel : this.f56384s) {
            onCancel.onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        i0(bundle);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(g.f52866j, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(e.f52851w);
        this.f56386u = timePickerView;
        timePickerView.N(this);
        this.f56387v = (ViewStub) viewGroup2.findViewById(e.f52847s);
        this.f56377H = (MaterialButton) viewGroup2.findViewById(e.f52849u);
        TextView textView = (TextView) viewGroup2.findViewById(e.f52835g);
        int i10 = this.f56371B;
        if (i10 != 0) {
            textView.setText(i10);
        } else if (!TextUtils.isEmpty(this.f56372C)) {
            textView.setText(this.f56372C);
        }
        k0(this.f56377H);
        Button button = (Button) viewGroup2.findViewById(e.f52850v);
        button.setOnClickListener(new a());
        int i11 = this.f56373D;
        if (i11 != 0) {
            button.setText(i11);
        } else if (!TextUtils.isEmpty(this.f56374E)) {
            button.setText(this.f56374E);
        }
        Button button2 = (Button) viewGroup2.findViewById(e.f52848t);
        this.f56378I = button2;
        button2.setOnClickListener(new C0841b());
        int i12 = this.f56375F;
        if (i12 != 0) {
            this.f56378I.setText(i12);
        } else if (!TextUtils.isEmpty(this.f56376G)) {
            this.f56378I.setText(this.f56376G);
        }
        j0();
        this.f56377H.setOnClickListener(new c());
        return viewGroup2;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f56390y = null;
        this.f56388w = null;
        this.f56389x = null;
        TimePickerView timePickerView = this.f56386u;
        if (timePickerView != null) {
            timePickerView.N((TimePickerView.e) null);
            this.f56386u = null;
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        for (DialogInterface.OnDismissListener onDismiss : this.f56385t) {
            onDismiss.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", this.f56380Y);
        bundle.putInt("TIME_PICKER_INPUT_MODE", this.f56379X);
        bundle.putInt("TIME_PICKER_TITLE_RES", this.f56371B);
        bundle.putCharSequence("TIME_PICKER_TITLE_TEXT", this.f56372C);
        bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", this.f56373D);
        bundle.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", this.f56374E);
        bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", this.f56375F);
        bundle.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", this.f56376G);
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", this.f56381Z);
    }
}
