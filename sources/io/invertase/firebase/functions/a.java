package io.invertase.firebase.functions;

import Ue.C5546a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnSuccessListener;

public final /* synthetic */ class a implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Promise f71404a;

    public /* synthetic */ a(Promise promise) {
        this.f71404a = promise;
    }

    public final void onSuccess(Object obj) {
        this.f71404a.resolve(C5546a.c("data", obj, Arguments.createMap()));
    }
}
