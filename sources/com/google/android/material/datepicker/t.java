package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

class t {

    /* renamed from: c  reason: collision with root package name */
    private static final t f55932c = new t((Long) null, (TimeZone) null);

    /* renamed from: a  reason: collision with root package name */
    private final Long f55933a;

    /* renamed from: b  reason: collision with root package name */
    private final TimeZone f55934b;

    private t(Long l10, TimeZone timeZone) {
        this.f55933a = l10;
        this.f55934b = timeZone;
    }

    static t c() {
        return f55932c;
    }

    /* access modifiers changed from: package-private */
    public Calendar a() {
        return b(this.f55934b);
    }

    /* access modifiers changed from: package-private */
    public Calendar b(TimeZone timeZone) {
        Calendar calendar;
        if (timeZone == null) {
            calendar = Calendar.getInstance();
        } else {
            calendar = Calendar.getInstance(timeZone);
        }
        Long l10 = this.f55933a;
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        return calendar;
    }
}
