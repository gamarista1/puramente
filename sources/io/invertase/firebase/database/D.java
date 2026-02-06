package io.invertase.firebase.database;

import Ue.C5546a;
import com.facebook.react.bridge.ReadableMap;
import java.util.concurrent.Callable;

public final /* synthetic */ class D implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReadableMap f71297a;

    public /* synthetic */ D(ReadableMap readableMap) {
        this.f71297a = readableMap;
    }

    public final Object call() {
        return C5546a.g(this.f71297a).get("values");
    }
}
