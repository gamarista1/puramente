package com.google.firebase.iid;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

final /* synthetic */ class g implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseInstanceId f57304a;

    /* renamed from: b  reason: collision with root package name */
    private final String f57305b;

    /* renamed from: c  reason: collision with root package name */
    private final String f57306c;

    /* renamed from: d  reason: collision with root package name */
    private final String f57307d;

    g(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3) {
        this.f57304a = firebaseInstanceId;
        this.f57305b = str;
        this.f57306c = str2;
        this.f57307d = str3;
    }

    public Task then(Object obj) {
        return this.f57304a.w(this.f57305b, this.f57306c, this.f57307d, (String) obj);
    }
}
