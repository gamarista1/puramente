package com.reactcommunity.rndatetimepicker;

import android.os.Bundle;
import android.widget.DatePicker;

public final /* synthetic */ class h implements DatePicker.OnDateChangedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Bundle f59209a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f59210b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f59211c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ DatePicker f59212d;

    public /* synthetic */ h(Bundle bundle, long j10, long j11, DatePicker datePicker) {
        this.f59209a = bundle;
        this.f59210b = j10;
        this.f59211c = j11;
        this.f59212d = datePicker;
    }

    public final void onDateChanged(DatePicker datePicker, int i10, int i11, int i12) {
        i.X(this.f59209a, this.f59210b, this.f59211c, this.f59212d, datePicker, i10, i11, i12);
    }
}
