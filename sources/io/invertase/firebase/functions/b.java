package io.invertase.firebase.functions;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnFailureListener;

public final /* synthetic */ class b implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71405a;

    public /* synthetic */ b(Promise promise) {
        this.f71405a = promise;
    }

    public final void onFailure(Exception exc) {
        ReactNativeFirebaseFunctionsModule.lambda$httpsCallableFromUrl$3(this.f71405a, exc);
    }
}
