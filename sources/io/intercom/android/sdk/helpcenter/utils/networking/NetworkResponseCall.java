package io.intercom.android.sdk.helpcenter.utils.networking;

import Gh.X;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import retrofit2.C6671d;
import retrofit2.C6673f;
import retrofit2.F;
import rh.C;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00018\u00008\u00000\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006 "}, d2 = {"Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponseCall;", "", "S", "Lretrofit2/d;", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "delegate", "<init>", "(Lretrofit2/d;)V", "Lretrofit2/f;", "callback", "Llf/M;", "enqueue", "(Lretrofit2/f;)V", "", "isExecuted", "()Z", "kotlin.jvm.PlatformType", "clone", "()Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponseCall;", "isCanceled", "cancel", "()V", "Lretrofit2/F;", "execute", "()Lretrofit2/F;", "Lrh/C;", "request", "()Lrh/C;", "LGh/X;", "timeout", "()LGh/X;", "Lretrofit2/d;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NetworkResponseCall<S> implements C6671d<NetworkResponse<? extends S>> {
    public static final int $stable = 8;
    private final C6671d<S> delegate;

    public NetworkResponseCall(C6671d<S> dVar) {
        C6496s.h(dVar, "delegate");
        this.delegate = dVar;
    }

    public void cancel() {
        this.delegate.cancel();
    }

    public void enqueue(C6673f fVar) {
        C6496s.h(fVar, "callback");
        this.delegate.enqueue(new NetworkResponseCall$enqueue$1(fVar, this));
    }

    public F<NetworkResponse<S>> execute() {
        throw new UnsupportedOperationException("NetworkResponseCall doesn't support execute");
    }

    public boolean isCanceled() {
        return this.delegate.isCanceled();
    }

    public boolean isExecuted() {
        return this.delegate.isExecuted();
    }

    public C request() {
        C request = this.delegate.request();
        C6496s.g(request, "request(...)");
        return request;
    }

    public X timeout() {
        X timeout = this.delegate.timeout();
        C6496s.g(timeout, "timeout(...)");
        return timeout;
    }

    public NetworkResponseCall<S> clone() {
        C6671d clone = this.delegate.clone();
        C6496s.g(clone, "clone(...)");
        return new NetworkResponseCall<>(clone);
    }
}
