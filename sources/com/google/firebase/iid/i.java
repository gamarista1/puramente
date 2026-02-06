package com.google.firebase.iid;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.iid.u;

final /* synthetic */ class i implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseInstanceId f57309a;

    /* renamed from: b  reason: collision with root package name */
    private final u.a f57310b;

    i(FirebaseInstanceId firebaseInstanceId, u.a aVar) {
        this.f57309a = firebaseInstanceId;
        this.f57310b = aVar;
    }

    public void onSuccess(Object obj) {
        this.f57309a.x(this.f57310b, (l) obj);
    }
}
