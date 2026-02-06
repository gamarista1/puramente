package com.google.android.material.datepicker;

import Ua.h;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.internal.k;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

abstract class d extends k {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f55808a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final DateFormat f55809b;

    /* renamed from: c  reason: collision with root package name */
    private final a f55810c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final String f55811d;

    /* renamed from: e  reason: collision with root package name */
    private final Runnable f55812e;

    /* renamed from: f  reason: collision with root package name */
    private Runnable f55813f;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f55814a;

        a(String str) {
            this.f55814a = str;
        }

        public void run() {
            TextInputLayout a10 = d.this.f55808a;
            DateFormat b10 = d.this.f55809b;
            Context context = a10.getContext();
            String string = context.getString(h.f52906v);
            String format = String.format(context.getString(h.f52908x), new Object[]{this.f55814a});
            String format2 = String.format(context.getString(h.f52907w), new Object[]{b10.format(new Date(u.j().getTimeInMillis()))});
            a10.setError(string + "\n" + format + "\n" + format2);
            d.this.e();
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f55816a;

        b(long j10) {
            this.f55816a = j10;
        }

        public void run() {
            d.this.f55808a.setError(String.format(d.this.f55811d, new Object[]{f.a(this.f55816a)}));
            d.this.e();
        }
    }

    d(String str, DateFormat dateFormat, TextInputLayout textInputLayout, a aVar) {
        this.f55809b = dateFormat;
        this.f55808a = textInputLayout;
        this.f55810c = aVar;
        this.f55811d = textInputLayout.getContext().getString(h.f52910z);
        this.f55812e = new a(str);
    }

    private Runnable d(long j10) {
        return new b(j10);
    }

    /* access modifiers changed from: package-private */
    public abstract void e();

    /* access modifiers changed from: package-private */
    public abstract void f(Long l10);

    public void g(View view, Runnable runnable) {
        view.postDelayed(runnable, 1000);
    }

    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.f55808a.removeCallbacks(this.f55812e);
        this.f55808a.removeCallbacks(this.f55813f);
        this.f55808a.setError((CharSequence) null);
        f((Long) null);
        if (!TextUtils.isEmpty(charSequence)) {
            try {
                Date parse = this.f55809b.parse(charSequence.toString());
                this.f55808a.setError((CharSequence) null);
                long time = parse.getTime();
                if (!this.f55810c.f().D(time) || !this.f55810c.l(time)) {
                    Runnable d10 = d(time);
                    this.f55813f = d10;
                    g(this.f55808a, d10);
                    return;
                }
                f(Long.valueOf(parse.getTime()));
            } catch (ParseException unused) {
                g(this.f55808a, this.f55812e);
            }
        }
    }
}
