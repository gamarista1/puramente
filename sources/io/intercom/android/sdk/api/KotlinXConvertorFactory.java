package io.intercom.android.sdk.api;

import gd.C5004c;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lh.C6538b;
import lh.e;
import lh.o;
import retrofit2.C6675h;
import rh.y;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/api/KotlinXConvertorFactory;", "", "<init>", "()V", "Lretrofit2/h$a;", "getConvertorFactory", "()Lretrofit2/h$a;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KotlinXConvertorFactory {
    public static final int $stable = 0;
    public static final KotlinXConvertorFactory INSTANCE = new KotlinXConvertorFactory();

    private KotlinXConvertorFactory() {
    }

    /* access modifiers changed from: private */
    public static final C6514M getConvertorFactory$lambda$0(e eVar) {
        C6496s.h(eVar, "$this$Json");
        eVar.g(true);
        eVar.f(true);
        return C6514M.f71813a;
    }

    public final C6675h.a getConvertorFactory() {
        return C5004c.a(o.b((C6538b) null, new f(), 1, (Object) null), y.f73499e.a("application/json"));
    }
}
