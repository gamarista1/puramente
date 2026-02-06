package io.intercom.android.sdk.helpcenter.utils.networking;

import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import retrofit2.C6671d;
import retrofit2.C6673f;
import retrofit2.F;

@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"io/intercom/android/sdk/helpcenter/utils/networking/NetworkResponseCall$enqueue$1", "Lretrofit2/f;", "Lretrofit2/d;", "call", "Lretrofit2/F;", "response", "Llf/M;", "onResponse", "(Lretrofit2/d;Lretrofit2/F;)V", "", "throwable", "onFailure", "(Lretrofit2/d;Ljava/lang/Throwable;)V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NetworkResponseCall$enqueue$1 implements C6673f {
    final /* synthetic */ C6673f $callback;
    final /* synthetic */ NetworkResponseCall<S> this$0;

    NetworkResponseCall$enqueue$1(C6673f fVar, NetworkResponseCall<S> networkResponseCall) {
        this.$callback = fVar;
        this.this$0 = networkResponseCall;
    }

    public void onFailure(C6671d<S> dVar, Throwable th2) {
        Object obj;
        C6496s.h(dVar, "call");
        C6496s.h(th2, "throwable");
        if (th2 instanceof IOException) {
            obj = new NetworkResponse.NetworkError((IOException) th2);
        } else {
            obj = new NetworkResponse.ClientError(th2);
        }
        this.$callback.onResponse(this.this$0, F.g(obj));
    }

    public void onResponse(C6671d<S> dVar, F<S> f10) {
        C6496s.h(dVar, "call");
        C6496s.h(f10, "response");
        Object a10 = f10.a();
        int b10 = f10.b();
        if (!f10.e()) {
            this.$callback.onResponse(this.this$0, F.g(new NetworkResponse.ServerError(b10)));
        } else if (a10 != null) {
            this.$callback.onResponse(this.this$0, F.g(new NetworkResponse.Success(a10)));
        } else {
            this.$callback.onResponse(this.this$0, F.g(new NetworkResponse.ClientError(new Throwable())));
        }
    }
}
