package com.margelo.nitro.core;

import Ug.K;
import Ug.L;
import Ug.Z;
import androidx.annotation.Keep;
import com.facebook.jni.HybridData;
import io.branch.rnbranch.RNBranchModule;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.v;
import lf.w;
import qf.C6658d;
import qf.i;
import rf.C6680b;
import yf.C6798l;

@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 $*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003%&'B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0013\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H ¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH ¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H ¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0014H ¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005H ¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u000bJ\u0015\u0010\u001a\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u000fJ'\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u001b¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00028\u0000H@¢\u0006\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcom/margelo/nitro/core/Promise;", "T", "", "<init>", "()V", "Lcom/facebook/jni/HybridData;", "hybridData", "(Lcom/facebook/jni/HybridData;)V", "result", "Llf/M;", "nativeResolve", "(Ljava/lang/Object;)V", "", "error", "nativeReject", "(Ljava/lang/Throwable;)V", "Lcom/margelo/nitro/core/Promise$OnResolvedCallback;", "callback", "addOnResolvedListener", "(Lcom/margelo/nitro/core/Promise$OnResolvedCallback;)V", "Lcom/margelo/nitro/core/Promise$OnRejectedCallback;", "addOnRejectedListener", "(Lcom/margelo/nitro/core/Promise$OnRejectedCallback;)V", "initHybrid", "()Lcom/facebook/jni/HybridData;", "resolve", "reject", "Lkotlin/Function1;", "listener", "then", "(Lyf/l;)Lcom/margelo/nitro/core/Promise;", "catch", "await", "(Lqf/d;)Ljava/lang/Object;", "mHybridData", "Lcom/facebook/jni/HybridData;", "Companion", "OnResolvedCallback", "OnRejectedCallback", "a", "react-native-nitro-modules_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@B7.a
public final class Promise<T> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final K defaultScope = L.a(Z.a());
    @B7.a
    @Keep
    private final HybridData mHybridData;

    @Keep
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bã\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/margelo/nitro/core/Promise$OnRejectedCallback;", "", "", "error", "Llf/M;", "onRejected", "(Ljava/lang/Throwable;)V", "react-native-nitro-modules_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @B7.a
    private interface OnRejectedCallback {
        @B7.a
        @Keep
        void onRejected(Throwable th2);
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bã\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/margelo/nitro/core/Promise$OnResolvedCallback;", "", "result", "Llf/M;", "onResolved", "(Ljava/lang/Object;)V", "react-native-nitro-modules_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @B7.a
    private interface OnResolvedCallback {
        @B7.a
        @Keep
        void onResolved(Object obj);
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6658d f59148a;

        b(C6658d dVar) {
            this.f59148a = dVar;
        }

        public final void a(Object obj) {
            this.f59148a.resumeWith(v.b(obj));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return C6514M.f71813a;
        }
    }

    static final class c implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6658d f59149a;

        c(C6658d dVar) {
            this.f59149a = dVar;
        }

        public final void a(Throwable th2) {
            C6496s.h(th2, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
            C6658d dVar = this.f59149a;
            v.a aVar = v.f71841b;
            dVar.resumeWith(v.b(w.a(th2)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C6514M.f71813a;
        }
    }

    public Promise() {
        this.mHybridData = initHybrid();
    }

    private final native void addOnRejectedListener(OnRejectedCallback onRejectedCallback);

    private final native void addOnResolvedListener(OnResolvedCallback onResolvedCallback);

    private final native HybridData initHybrid();

    private final native void nativeReject(Throwable th2);

    private final native void nativeResolve(Object obj);

    /* access modifiers changed from: private */
    public static final void then$lambda$0(C6798l lVar, Object obj) {
        if (obj == null) {
            obj = null;
        }
        if (obj != null) {
            lVar.invoke(obj);
            return;
        }
        throw new Error("Failed to cast Object to T!");
    }

    public final Object await(C6658d<? super T> dVar) {
        i iVar = new i(C6680b.c(dVar));
        then(new b(iVar));
        m25catch(new c(iVar));
        Object b10 = iVar.b();
        if (b10 == C6680b.f()) {
            h.c(dVar);
        }
        return b10;
    }

    /* renamed from: catch  reason: not valid java name */
    public final Promise<T> m25catch(C6798l lVar) {
        C6496s.h(lVar, "listener");
        addOnRejectedListener(new d(lVar));
        return this;
    }

    public final void reject(Throwable th2) {
        C6496s.h(th2, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
        nativeReject(th2);
    }

    public final void resolve(T t10) {
        nativeResolve(t10);
    }

    public final Promise<T> then(C6798l lVar) {
        C6496s.h(lVar, "listener");
        addOnResolvedListener(new c(lVar));
        return this;
    }

    @B7.a
    @Keep
    private Promise(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
