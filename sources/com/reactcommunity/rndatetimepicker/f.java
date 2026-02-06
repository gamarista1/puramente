package com.reactcommunity.rndatetimepicker;

import android.os.Bundle;
import java.util.Calendar;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private Calendar f59208a = Calendar.getInstance();

    public f(Bundle bundle) {
        if (bundle != null && bundle.containsKey("value")) {
            this.f59208a.setTimeInMillis(bundle.getLong("value"));
        }
        this.f59208a.setTimeZone(b.h(bundle));
    }

    public int a() {
        return this.f59208a.get(5);
    }

    public int b() {
        return this.f59208a.get(11);
    }

    public int c() {
        return this.f59208a.get(12);
    }

    public int d() {
        return this.f59208a.get(2);
    }

    public int e() {
        return this.f59208a.get(1);
    }
}
