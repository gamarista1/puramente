package com.google.firebase.iid;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;

final /* synthetic */ class e implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    private final CountDownLatch f57298a;

    e(CountDownLatch countDownLatch) {
        this.f57298a = countDownLatch;
    }

    public void onComplete(Task task) {
        this.f57298a.countDown();
    }
}
