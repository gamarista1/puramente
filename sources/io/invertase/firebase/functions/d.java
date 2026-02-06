package io.invertase.firebase.functions;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnFailureListener;

public final /* synthetic */ class d implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71407a;

    public /* synthetic */ d(Promise promise) {
        this.f71407a = promise;
    }

    public final void onFailure(Exception exc) {
        ReactNativeFirebaseFunctionsModule.lambda$httpsCallable$1(this.f71407a, exc);
    }
}
