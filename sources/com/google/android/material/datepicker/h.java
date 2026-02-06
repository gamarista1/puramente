package com.google.android.material.datepicker;

import android.os.Build;
import android.widget.BaseAdapter;
import java.util.Calendar;

class h extends BaseAdapter {

    /* renamed from: d  reason: collision with root package name */
    private static final int f55819d;

    /* renamed from: a  reason: collision with root package name */
    private final Calendar f55820a;

    /* renamed from: b  reason: collision with root package name */
    private final int f55821b;

    /* renamed from: c  reason: collision with root package name */
    private final int f55822c;

    static {
        int i10;
        if (Build.VERSION.SDK_INT >= 26) {
            i10 = 4;
        } else {
            i10 = 1;
        }
        f55819d = i10;
    }

    public h() {
        Calendar l10 = u.l();
        this.f55820a = l10;
        this.f55821b = l10.getMaximum(7);
        this.f55822c = l10.getFirstDayOfWeek();
    }

    private int b(int i10) {
        int i11 = i10 + this.f55822c;
        int i12 = this.f55821b;
        if (i11 > i12) {
            return i11 - i12;
        }
        return i11;
    }

    /* renamed from: a */
    public Integer getItem(int i10) {
        if (i10 >= this.f55821b) {
            return null;
        }
        return Integer.valueOf(b(i10));
    }

    public int getCount() {
        return this.f55821b;
    }

    public long getItemId(int i10) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r5v9, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r4, android.view.View r5, android.view.ViewGroup r6) {
        /*
            r3 = this;
            r0 = r5
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r5 != 0) goto L_0x0017
            android.content.Context r5 = r6.getContext()
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            int r0 = Ua.g.f52869m
            r1 = 0
            android.view.View r5 = r5.inflate(r0, r6, r1)
            r0 = r5
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0017:
            java.util.Calendar r5 = r3.f55820a
            int r4 = r3.b(r4)
            r1 = 7
            r5.set(r1, r4)
            android.content.res.Resources r4 = r0.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            java.util.Locale r4 = r4.locale
            java.util.Calendar r5 = r3.f55820a
            int r2 = f55819d
            java.lang.String r4 = r5.getDisplayName(r1, r2, r4)
            r0.setText(r4)
            android.content.Context r4 = r6.getContext()
            int r5 = Ua.h.f52905u
            java.lang.String r4 = r4.getString(r5)
            java.util.Calendar r5 = r3.f55820a
            r6 = 2
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r5 = r5.getDisplayName(r1, r6, r2)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r4 = java.lang.String.format(r4, r5)
            r0.setContentDescription(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.h.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
