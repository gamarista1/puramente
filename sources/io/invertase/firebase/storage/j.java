package io.invertase.firebase.storage;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.storage.o;

public final /* synthetic */ class j implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseStorageModule f71483a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReadableMap f71484b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ o f71485c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Promise f71486d;

    public /* synthetic */ j(ReactNativeFirebaseStorageModule reactNativeFirebaseStorageModule, ReadableMap readableMap, o oVar, Promise promise) {
        this.f71483a = reactNativeFirebaseStorageModule;
        this.f71484b = readableMap;
        this.f71485c = oVar;
        this.f71486d = promise;
    }

    public final void onComplete(Task task) {
        this.f71483a.lambda$updateMetadata$6(this.f71484b, this.f71485c, this.f71486d, task);
    }
}
