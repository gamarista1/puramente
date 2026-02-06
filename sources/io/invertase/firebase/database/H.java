package io.invertase.firebase.database;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;

public final /* synthetic */ class H implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReactNativeFirebaseDatabaseReferenceModule f71304a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f71305b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f71306c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f71307d;

    public /* synthetic */ H(ReactNativeFirebaseDatabaseReferenceModule reactNativeFirebaseDatabaseReferenceModule, String str, String str2, String str3) {
        this.f71304a = reactNativeFirebaseDatabaseReferenceModule;
        this.f71305b = str;
        this.f71306c = str2;
        this.f71307d = str3;
    }

    public final Task then(Object obj) {
        return this.f71304a.lambda$setWithPriority$7(this.f71305b, this.f71306c, this.f71307d, (Map) obj);
    }
}
