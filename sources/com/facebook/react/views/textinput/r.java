package com.facebook.react.views.textinput;

import android.text.SpannableStringBuilder;
import android.widget.EditText;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final SpannableStringBuilder f42323a;

    /* renamed from: b  reason: collision with root package name */
    private final float f42324b;

    /* renamed from: c  reason: collision with root package name */
    private final int f42325c;

    /* renamed from: d  reason: collision with root package name */
    private final int f42326d;

    /* renamed from: e  reason: collision with root package name */
    private final int f42327e;

    /* renamed from: f  reason: collision with root package name */
    private final int f42328f;

    /* renamed from: g  reason: collision with root package name */
    private final CharSequence f42329g;

    public r(EditText editText) {
        this.f42323a = new SpannableStringBuilder(editText.getText());
        this.f42324b = editText.getTextSize();
        this.f42327e = editText.getInputType();
        this.f42329g = editText.getHint();
        this.f42325c = editText.getMinLines();
        this.f42326d = editText.getMaxLines();
        this.f42328f = editText.getBreakStrategy();
    }

    public void a(EditText editText) {
        editText.setText(this.f42323a);
        editText.setTextSize(0, this.f42324b);
        editText.setMinLines(this.f42325c);
        editText.setMaxLines(this.f42326d);
        editText.setInputType(this.f42327e);
        editText.setHint(this.f42329g);
        editText.setBreakStrategy(this.f42328f);
    }
}
