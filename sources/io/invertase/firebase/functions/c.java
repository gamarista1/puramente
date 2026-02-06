package io.invertase.firebase.functions;

import Ue.C5546a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnSuccessListener;

public final /* synthetic */ class c implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71406a;

    public /* synthetic */ c(Promise promise) {
        this.f71406a = promise;
    }

    public final void onSuccess(Object obj) {
        this.f71406a.resolve(C5546a.c("data", obj, Arguments.createMap()));
    }
}
