package com.google.firebase.auth.internal;

import android.net.Uri;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class c implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ Uri f57043a;

    public /* synthetic */ c(Uri uri) {
        this.f57043a = uri;
    }

    public final Object then(Task task) {
        return RecaptchaActivity.D(this.f57043a, task);
    }
}
