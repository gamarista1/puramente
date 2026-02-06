package io.invertase.firebase.database;

import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: io.invertase.firebase.database.m  reason: case insensitive filesystem */
public final /* synthetic */ class C6414m implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f71385a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f71386b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ReadableMap f71387c;

    public /* synthetic */ C6414m(String str, String str2, ReadableMap readableMap) {
        this.f71385a = str;
        this.f71386b = str2;
        this.f71387c = readableMap;
    }

    public final void onComplete(Task task) {
        ReactNativeFirebaseDatabaseQueryModule.lambda$handleDatabaseEvent$1(this.f71385a, this.f71386b, this.f71387c, task);
    }
}
