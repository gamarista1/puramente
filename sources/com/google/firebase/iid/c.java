package com.google.firebase.iid;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

final /* synthetic */ class c implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseInstanceId f57294a;

    /* renamed from: b  reason: collision with root package name */
    private final String f57295b;

    /* renamed from: c  reason: collision with root package name */
    private final String f57296c;

    c(FirebaseInstanceId firebaseInstanceId, String str, String str2) {
        this.f57294a = firebaseInstanceId;
        this.f57295b = str;
        this.f57296c = str2;
    }

    public Object then(Task task) {
        return this.f57294a.z(this.f57295b, this.f57296c, task);
    }
}
