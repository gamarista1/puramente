package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;

class n extends BaseAdapter {

    /* renamed from: f  reason: collision with root package name */
    static final int f55913f = u.l().getMaximum(4);

    /* renamed from: a  reason: collision with root package name */
    final m f55914a;

    /* renamed from: b  reason: collision with root package name */
    final e f55915b;

    /* renamed from: c  reason: collision with root package name */
    private Collection f55916c;

    /* renamed from: d  reason: collision with root package name */
    c f55917d;

    /* renamed from: e  reason: collision with root package name */
    final a f55918e;

    n(m mVar, e eVar, a aVar) {
        this.f55914a = mVar;
        this.f55915b = eVar;
        this.f55918e = aVar;
        this.f55916c = eVar.g0();
    }

    private void e(Context context) {
        if (this.f55917d == null) {
            this.f55917d = new c(context);
        }
    }

    private boolean h(long j10) {
        for (Long longValue : this.f55915b.g0()) {
            if (u.a(j10) == u.a(longValue.longValue())) {
                return true;
            }
        }
        return false;
    }

    private void k(TextView textView, long j10) {
        b bVar;
        if (textView != null) {
            if (this.f55918e.f().D(j10)) {
                textView.setEnabled(true);
                if (h(j10)) {
                    bVar = this.f55917d.f55801b;
                } else if (u.j().getTimeInMillis() == j10) {
                    bVar = this.f55917d.f55802c;
                } else {
                    bVar = this.f55917d.f55800a;
                }
            } else {
                textView.setEnabled(false);
                bVar = this.f55917d.f55806g;
            }
            bVar.d(textView);
        }
    }

    private void l(MaterialCalendarGridView materialCalendarGridView, long j10) {
        if (m.c(j10).equals(this.f55914a)) {
            k((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(this.f55914a.j(j10)) - materialCalendarGridView.getFirstVisiblePosition()), j10);
        }
    }

    /* access modifiers changed from: package-private */
    public int a(int i10) {
        return b() + (i10 - 1);
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f55914a.f();
    }

    /* renamed from: c */
    public Long getItem(int i10) {
        if (i10 < this.f55914a.f() || i10 > i()) {
            return null;
        }
        return Long.valueOf(this.f55914a.i(j(i10)));
    }

    /* JADX WARNING: type inference failed for: r7v10, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0083 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0084  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x001e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = Ua.g.f52868l
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x001e:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L_0x0075
            com.google.android.material.datepicker.m r8 = r5.f55914a
            int r2 = r8.f55910e
            if (r7 < r2) goto L_0x002d
            goto L_0x0075
        L_0x002d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            com.google.android.material.datepicker.m r8 = r5.f55914a
            long r7 = r8.i(r7)
            com.google.android.material.datepicker.m r3 = r5.f55914a
            int r3 = r3.f55908c
            com.google.android.material.datepicker.m r4 = com.google.android.material.datepicker.m.e()
            int r4 = r4.f55908c
            if (r3 != r4) goto L_0x0067
            java.lang.String r7 = com.google.android.material.datepicker.f.e(r7)
            r0.setContentDescription(r7)
            goto L_0x006e
        L_0x0067:
            java.lang.String r7 = com.google.android.material.datepicker.f.j(r7)
            r0.setContentDescription(r7)
        L_0x006e:
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L_0x007d
        L_0x0075:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L_0x007d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L_0x0084
            return r0
        L_0x0084:
            long r6 = r6.longValue()
            r5.k(r0, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.n.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* access modifiers changed from: package-private */
    public boolean f(int i10) {
        if (i10 % this.f55914a.f55909d == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean g(int i10) {
        if ((i10 + 1) % this.f55914a.f55909d == 0) {
            return true;
        }
        return false;
    }

    public int getCount() {
        return this.f55914a.f55910e + b();
    }

    public long getItemId(int i10) {
        return (long) (i10 / this.f55914a.f55909d);
    }

    public boolean hasStableIds() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return (this.f55914a.f() + this.f55914a.f55910e) - 1;
    }

    /* access modifiers changed from: package-private */
    public int j(int i10) {
        return (i10 - this.f55914a.f()) + 1;
    }

    public void m(MaterialCalendarGridView materialCalendarGridView) {
        for (Long longValue : this.f55916c) {
            l(materialCalendarGridView, longValue.longValue());
        }
        e eVar = this.f55915b;
        if (eVar != null) {
            for (Long longValue2 : eVar.g0()) {
                l(materialCalendarGridView, longValue2.longValue());
            }
            this.f55916c = this.f55915b.g0();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean n(int i10) {
        if (i10 < b() || i10 > i()) {
            return false;
        }
        return true;
    }
}
