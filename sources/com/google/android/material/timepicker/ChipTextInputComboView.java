package com.google.android.material.timepicker;

import Ua.e;
import Ua.g;
import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.C1677a;
import androidx.core.view.C1680b0;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.k;
import com.google.android.material.internal.n;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;

class ChipTextInputComboView extends FrameLayout implements Checkable {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Chip f56314a;

    /* renamed from: b  reason: collision with root package name */
    private final TextInputLayout f56315b;

    /* renamed from: c  reason: collision with root package name */
    private final EditText f56316c;

    /* renamed from: d  reason: collision with root package name */
    private TextWatcher f56317d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f56318e;

    private class b extends k {
        private b() {
        }

        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f56314a.setText(ChipTextInputComboView.this.d("00"));
            } else {
                ChipTextInputComboView.this.f56314a.setText(ChipTextInputComboView.this.d(editable));
            }
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    public String d(CharSequence charSequence) {
        return e.a(getResources(), charSequence);
    }

    private void h() {
        this.f56316c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    public void c(InputFilter inputFilter) {
        InputFilter[] filters = this.f56316c.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = inputFilter;
        this.f56316c.setFilters(inputFilterArr);
    }

    public TextInputLayout e() {
        return this.f56315b;
    }

    public void f(C1677a aVar) {
        C1680b0.o0(this.f56314a, aVar);
    }

    public void g(CharSequence charSequence) {
        this.f56314a.setText(d(charSequence));
        if (!TextUtils.isEmpty(this.f56316c.getText())) {
            this.f56316c.removeTextChangedListener(this.f56317d);
            this.f56316c.setText((CharSequence) null);
            this.f56316c.addTextChangedListener(this.f56317d);
        }
    }

    public boolean isChecked() {
        return this.f56314a.isChecked();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        h();
    }

    public void setChecked(boolean z10) {
        int i10;
        this.f56314a.setChecked(z10);
        EditText editText = this.f56316c;
        int i11 = 0;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        editText.setVisibility(i10);
        Chip chip = this.f56314a;
        if (z10) {
            i11 = 8;
        }
        chip.setVisibility(i11);
        if (isChecked()) {
            n.h(this.f56316c);
            if (!TextUtils.isEmpty(this.f56316c.getText())) {
                EditText editText2 = this.f56316c;
                editText2.setSelection(editText2.getText().length());
            }
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f56314a.setOnClickListener(onClickListener);
    }

    public void setTag(int i10, Object obj) {
        this.f56314a.setTag(i10, obj);
    }

    public void toggle() {
        this.f56314a.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(g.f52863g, this, false);
        this.f56314a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(g.f52864h, this, false);
        this.f56315b = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f56316c = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f56317d = bVar;
        editText.addTextChangedListener(bVar);
        h();
        addView(chip);
        addView(textInputLayout);
        this.f56318e = (TextView) findViewById(e.f52844p);
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
