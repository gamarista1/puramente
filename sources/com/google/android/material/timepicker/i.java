package com.google.android.material.timepicker;

import Ua.h;
import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.k;
import com.google.android.material.timepicker.TimePickerView;
import java.util.Locale;
import y1.C2930A;

class i implements TimePickerView.g, g {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f56430a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final e f56431b;

    /* renamed from: c  reason: collision with root package name */
    private final TextWatcher f56432c = new a();

    /* renamed from: d  reason: collision with root package name */
    private final TextWatcher f56433d = new b();

    /* renamed from: e  reason: collision with root package name */
    private final ChipTextInputComboView f56434e;

    /* renamed from: f  reason: collision with root package name */
    private final ChipTextInputComboView f56435f;

    /* renamed from: g  reason: collision with root package name */
    private final h f56436g;

    /* renamed from: h  reason: collision with root package name */
    private final EditText f56437h;

    /* renamed from: i  reason: collision with root package name */
    private final EditText f56438i;

    /* renamed from: j  reason: collision with root package name */
    private MaterialButtonToggleGroup f56439j;

    class a extends k {
        a() {
        }

        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    i.this.f56431b.i(0);
                    return;
                }
                i.this.f56431b.i(Integer.parseInt(editable.toString()));
            } catch (NumberFormatException unused) {
            }
        }
    }

    class b extends k {
        b() {
        }

        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    i.this.f56431b.g(0);
                    return;
                }
                i.this.f56431b.g(Integer.parseInt(editable.toString()));
            } catch (NumberFormatException unused) {
            }
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        public void onClick(View view) {
            i.this.e(((Integer) view.getTag(Ua.e.f52819O)).intValue());
        }
    }

    class d extends a {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f56443b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(Context context, int i10, e eVar) {
            super(context, i10);
            this.f56443b = eVar;
        }

        public void onInitializeAccessibilityNodeInfo(View view, C2930A a10) {
            super.onInitializeAccessibilityNodeInfo(view, a10);
            a10.x0(view.getResources().getString(h.f52893i, new Object[]{String.valueOf(this.f56443b.c())}));
        }
    }

    class e extends a {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f56445b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(Context context, int i10, e eVar) {
            super(context, i10);
            this.f56445b = eVar;
        }

        public void onInitializeAccessibilityNodeInfo(View view, C2930A a10) {
            super.onInitializeAccessibilityNodeInfo(view, a10);
            a10.x0(view.getResources().getString(h.f52895k, new Object[]{String.valueOf(this.f56445b.f56413e)}));
        }
    }

    class f implements MaterialButtonToggleGroup.d {
        f() {
        }

        public void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10) {
            int i11;
            if (i10 == Ua.e.f52840l) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            i.this.f56431b.j(i11);
        }
    }

    public i(LinearLayout linearLayout, e eVar) {
        this.f56430a = linearLayout;
        this.f56431b = eVar;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(Ua.e.f52845q);
        this.f56434e = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(Ua.e.f52842n);
        this.f56435f = chipTextInputComboView2;
        ((TextView) chipTextInputComboView.findViewById(Ua.e.f52844p)).setText(resources.getString(h.f52898n));
        ((TextView) chipTextInputComboView2.findViewById(Ua.e.f52844p)).setText(resources.getString(h.f52897m));
        chipTextInputComboView.setTag(Ua.e.f52819O, 12);
        chipTextInputComboView2.setTag(Ua.e.f52819O, 10);
        if (eVar.f56411c == 0) {
            k();
        }
        c cVar = new c();
        chipTextInputComboView2.setOnClickListener(cVar);
        chipTextInputComboView.setOnClickListener(cVar);
        chipTextInputComboView2.c(eVar.d());
        chipTextInputComboView.c(eVar.e());
        this.f56437h = chipTextInputComboView2.e().getEditText();
        this.f56438i = chipTextInputComboView.e().getEditText();
        this.f56436g = new h(chipTextInputComboView2, chipTextInputComboView, eVar);
        chipTextInputComboView2.f(new d(linearLayout.getContext(), h.f52892h, eVar));
        chipTextInputComboView.f(new e(linearLayout.getContext(), h.f52894j, eVar));
        g();
    }

    private void d() {
        this.f56437h.addTextChangedListener(this.f56433d);
        this.f56438i.addTextChangedListener(this.f56432c);
    }

    private void h() {
        this.f56437h.removeTextChangedListener(this.f56433d);
        this.f56438i.removeTextChangedListener(this.f56432c);
    }

    private void j(e eVar) {
        h();
        Locale locale = this.f56430a.getResources().getConfiguration().locale;
        String format = String.format(locale, "%02d", new Object[]{Integer.valueOf(eVar.f56413e)});
        String format2 = String.format(locale, "%02d", new Object[]{Integer.valueOf(eVar.c())});
        this.f56434e.g(format);
        this.f56435f.g(format2);
        d();
        l();
    }

    private void k() {
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f56430a.findViewById(Ua.e.f52841m);
        this.f56439j = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new f());
        this.f56439j.setVisibility(0);
        l();
    }

    private void l() {
        int i10;
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f56439j;
        if (materialButtonToggleGroup != null) {
            if (this.f56431b.f56415g == 0) {
                i10 = Ua.e.f52839k;
            } else {
                i10 = Ua.e.f52840l;
            }
            materialButtonToggleGroup.e(i10);
        }
    }

    public void a() {
        View focusedChild = this.f56430a.getFocusedChild();
        if (focusedChild == null) {
            this.f56430a.setVisibility(8);
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) androidx.core.content.c.getSystemService(this.f56430a.getContext(), InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(focusedChild.getWindowToken(), 0);
        }
        this.f56430a.setVisibility(8);
    }

    public void b() {
        this.f56430a.setVisibility(0);
    }

    public void e(int i10) {
        boolean z10;
        this.f56431b.f56414f = i10;
        ChipTextInputComboView chipTextInputComboView = this.f56434e;
        boolean z11 = false;
        if (i10 == 12) {
            z10 = true;
        } else {
            z10 = false;
        }
        chipTextInputComboView.setChecked(z10);
        ChipTextInputComboView chipTextInputComboView2 = this.f56435f;
        if (i10 == 10) {
            z11 = true;
        }
        chipTextInputComboView2.setChecked(z11);
        l();
    }

    public void f() {
        this.f56434e.setChecked(false);
        this.f56435f.setChecked(false);
    }

    public void g() {
        d();
        j(this.f56431b);
        this.f56436g.a();
    }

    public void i() {
        boolean z10;
        ChipTextInputComboView chipTextInputComboView = this.f56434e;
        boolean z11 = false;
        if (this.f56431b.f56414f == 12) {
            z10 = true;
        } else {
            z10 = false;
        }
        chipTextInputComboView.setChecked(z10);
        ChipTextInputComboView chipTextInputComboView2 = this.f56435f;
        if (this.f56431b.f56414f == 10) {
            z11 = true;
        }
        chipTextInputComboView2.setChecked(z11);
    }

    public void invalidate() {
        j(this.f56431b);
    }
}
