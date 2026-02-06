package io.invertase.firebase.database;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class E implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseDatabaseReferenceModule f71298a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f71299b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f71300c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f71301d;

    public /* synthetic */ E(ReactNativeFirebaseDatabaseReferenceModule reactNativeFirebaseDatabaseReferenceModule, String str, String str2, String str3) {
        this.f71298a = reactNativeFirebaseDatabaseReferenceModule;
        this.f71299b = str;
        this.f71300c = str2;
        this.f71301d = str3;
    }

    public final Task then(Object obj) {
        return this.f71298a.lambda$update$4(this.f71299b, this.f71300c, this.f71301d, obj);
    }
}
