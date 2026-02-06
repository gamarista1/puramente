package io.invertase.firebase.database;

import Ue.C5546a;
import com.facebook.react.bridge.ReadableMap;
import java.util.concurrent.Callable;

/* renamed from: io.invertase.firebase.database.y  reason: case insensitive filesystem */
public final /* synthetic */ class C6425y implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReadableMap f71402a;

    public /* synthetic */ C6425y(ReadableMap readableMap) {
        this.f71402a = readableMap;
    }

    public final Object call() {
        return C5546a.g(this.f71402a).get("value");
    }
}
