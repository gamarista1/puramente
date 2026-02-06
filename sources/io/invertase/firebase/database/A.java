package io.invertase.firebase.database;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class A implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseDatabaseReferenceModule f71291a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f71292b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f71293c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f71294d;

    public /* synthetic */ A(ReactNativeFirebaseDatabaseReferenceModule reactNativeFirebaseDatabaseReferenceModule, String str, String str2, String str3) {
        this.f71291a = reactNativeFirebaseDatabaseReferenceModule;
        this.f71292b = str;
        this.f71293c = str2;
        this.f71294d = str3;
    }

    public final Task then(Object obj) {
        return this.f71291a.lambda$set$1(this.f71292b, this.f71293c, this.f71294d, obj);
    }
}
