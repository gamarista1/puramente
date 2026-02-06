package com.amazon.a.a.l;

import android.app.Activity;
import android.content.Intent;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f37272a;

    /* renamed from: b  reason: collision with root package name */
    private final int f37273b;

    /* renamed from: c  reason: collision with root package name */
    private final int f37274c;

    /* renamed from: d  reason: collision with root package name */
    private final Intent f37275d;

    public a(Activity activity, int i10, int i11, Intent intent) {
        this.f37272a = activity;
        this.f37273b = i10;
        this.f37274c = i11;
        this.f37275d = intent;
    }

    public Activity a() {
        return this.f37272a;
    }

    public int b() {
        return this.f37273b;
    }

    public Intent c() {
        return this.f37275d;
    }

    public int d() {
        return this.f37274c;
    }

    public String toString() {
        return "ActivtyResult: [ requestCode: " + this.f37273b + ", resultCode: " + this.f37274c + ", activity: " + this.f37272a + ", intent: " + this.f37275d + "]";
    }
}
