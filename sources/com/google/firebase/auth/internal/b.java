package com.google.firebase.auth.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class b implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ RecaptchaActivity f57041a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ String f57042b;

    public /* synthetic */ b(RecaptchaActivity recaptchaActivity, String str) {
        this.f57041a = recaptchaActivity;
        this.f57042b = str;
    }

    public final void onComplete(Task task) {
        this.f57041a.F(this.f57042b, task);
    }
}
