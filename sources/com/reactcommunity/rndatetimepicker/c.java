package com.reactcommunity.rndatetimepicker;

import androidx.fragment.app.J;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DatePickerModule f59191a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ J f59192b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ReadableMap f59193c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Promise f59194d;

    public /* synthetic */ c(DatePickerModule datePickerModule, J j10, ReadableMap readableMap, Promise promise) {
        this.f59191a = datePickerModule;
        this.f59192b = j10;
        this.f59193c = readableMap;
        this.f59194d = promise;
    }

    public final void run() {
        this.f59191a.lambda$open$0(this.f59192b, this.f59193c, this.f59194d);
    }
}
