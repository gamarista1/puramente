package com.reactcommunity.rndatetimepicker;

import androidx.fragment.app.J;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;

public final /* synthetic */ class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TimePickerModule f59227a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ J f59228b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ReadableMap f59229c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Promise f59230d;

    public /* synthetic */ r(TimePickerModule timePickerModule, J j10, ReadableMap readableMap, Promise promise) {
        this.f59227a = timePickerModule;
        this.f59228b = j10;
        this.f59229c = readableMap;
        this.f59230d = promise;
    }

    public final void run() {
        this.f59227a.lambda$open$0(this.f59228b, this.f59229c, this.f59230d);
    }
}
