package com.google.firebase.iid;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

final /* synthetic */ class q implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    static final Continuation f57327a = new q();

    private q() {
    }

    public Object then(Task task) {
        return ((l) task.getResult()).a();
    }
}
