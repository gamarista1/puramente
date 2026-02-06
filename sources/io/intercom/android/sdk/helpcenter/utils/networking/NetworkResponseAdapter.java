package io.intercom.android.sdk.helpcenter.utils.networking;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import retrofit2.C6671d;
import retrofit2.C6672e;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00040\u0003B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponseAdapter;", "", "S", "Lretrofit2/e;", "Lretrofit2/d;", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "Ljava/lang/reflect/Type;", "successType", "<init>", "(Ljava/lang/reflect/Type;)V", "responseType", "()Ljava/lang/reflect/Type;", "call", "adapt", "(Lretrofit2/d;)Lretrofit2/d;", "Ljava/lang/reflect/Type;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NetworkResponseAdapter<S> implements C6672e {
    public static final int $stable = 8;
    private final Type successType;

    public NetworkResponseAdapter(Type type) {
        C6496s.h(type, "successType");
        this.successType = type;
    }

    public Type responseType() {
        return this.successType;
    }

    public C6671d<NetworkResponse<S>> adapt(C6671d<S> dVar) {
        C6496s.h(dVar, "call");
        return new NetworkResponseCall(dVar);
    }
}
