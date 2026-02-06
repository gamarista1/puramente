package com.google.firebase.auth.internal;

import android.net.Uri;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class a implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ Uri f57040a;

    public /* synthetic */ a(Uri uri) {
        this.f57040a = uri;
    }

    public final Object then(Task task) {
        return GenericIdpActivity.D(this.f57040a, task);
    }
}
