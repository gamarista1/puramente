package com.google.firebase.iid;

import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.s;
import com.google.firebase.iid.u;

final /* synthetic */ class f implements s.a {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseInstanceId f57299a;

    /* renamed from: b  reason: collision with root package name */
    private final String f57300b;

    /* renamed from: c  reason: collision with root package name */
    private final String f57301c;

    /* renamed from: d  reason: collision with root package name */
    private final String f57302d;

    /* renamed from: e  reason: collision with root package name */
    private final u.a f57303e;

    f(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3, u.a aVar) {
        this.f57299a = firebaseInstanceId;
        this.f57300b = str;
        this.f57301c = str2;
        this.f57302d = str3;
        this.f57303e = aVar;
    }

    public Task start() {
        return this.f57299a.y(this.f57300b, this.f57301c, this.f57302d, this.f57303e);
    }
}
