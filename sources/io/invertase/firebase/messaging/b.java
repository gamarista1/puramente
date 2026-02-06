package io.invertase.firebase.messaging;

import java.util.concurrent.Callable;

public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseMessagingModule f71424a;

    public /* synthetic */ b(ReactNativeFirebaseMessagingModule reactNativeFirebaseMessagingModule) {
        this.f71424a = reactNativeFirebaseMessagingModule;
    }

    public final Object call() {
        return this.f71424a.lambda$hasPermission$6();
    }
}
