package com.google.firebase.auth;

import Db.C4255c;
import Db.i0;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import ub.m;

final class I0 implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ P f56909a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f56910b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f56911c;

    I0(FirebaseAuth firebaseAuth, P p10, String str) {
        this.f56909a = p10;
        this.f56910b = str;
        this.f56911c = firebaseAuth;
    }

    public final void onComplete(Task task) {
        String str;
        String str2;
        String str3;
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            if (exception != null) {
                str3 = exception.getMessage();
            } else {
                str3 = "";
            }
            Log.e("FirebaseAuth", "Error while validating application identity: " + str3);
            if (exception == null || !C4255c.f(exception)) {
                Log.e("FirebaseAuth", "Proceeding without any application identifier.");
                str = null;
                str2 = null;
            } else {
                FirebaseAuth.j0((m) exception, this.f56909a, this.f56910b);
                return;
            }
        } else {
            String c10 = ((i0) task.getResult()).c();
            str2 = ((i0) task.getResult()).a();
            str = c10;
        }
        this.f56911c.i0(this.f56909a, str, str2);
    }
}
