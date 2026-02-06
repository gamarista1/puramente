package io.intercom.android.sdk.fcm;

import android.app.Application;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class a implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Application f68554a;

    public /* synthetic */ a(Application application) {
        this.f68554a = application;
    }

    public final void onComplete(Task task) {
        IntercomFcmMessengerService.lambda$initialize$0(this.f68554a, task);
    }
}
