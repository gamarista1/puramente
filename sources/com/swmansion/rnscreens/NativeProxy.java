package com.swmansion.rnscreens;

import android.util.Log;
import com.facebook.jni.HybridData;
import com.facebook.react.fabric.FabricUIManager;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H ¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00048\u0002X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0012\u0010\u0003¨\u0006\u0014"}, d2 = {"Lcom/swmansion/rnscreens/NativeProxy;", "", "<init>", "()V", "Lcom/facebook/jni/HybridData;", "initHybrid", "()Lcom/facebook/jni/HybridData;", "Lcom/facebook/react/fabric/FabricUIManager;", "fabricUIManager", "Llf/M;", "nativeAddMutationsListener", "(Lcom/facebook/react/fabric/FabricUIManager;)V", "", "screenTag", "notifyScreenRemoved", "(I)V", "mHybridData", "Lcom/facebook/jni/HybridData;", "getMHybridData$annotations", "a", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NativeProxy {

    /* renamed from: a  reason: collision with root package name */
    public static final a f59724a = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final ConcurrentHashMap f59725b = new ConcurrentHashMap();
    @B7.a
    private final HybridData mHybridData = initHybrid();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(int i10, r rVar) {
            C6496s.h(rVar, "view");
            NativeProxy.f59725b.put(Integer.valueOf(i10), new WeakReference(rVar));
        }

        public final void b() {
            NativeProxy.f59725b.clear();
        }

        public final void c(int i10) {
            NativeProxy.f59725b.remove(Integer.valueOf(i10));
        }

        private a() {
        }
    }

    private final native HybridData initHybrid();

    public final native void nativeAddMutationsListener(FabricUIManager fabricUIManager);

    @B7.a
    public final void notifyScreenRemoved(int i10) {
        r rVar;
        WeakReference weakReference = (WeakReference) f59725b.get(Integer.valueOf(i10));
        if (weakReference != null) {
            rVar = (r) weakReference.get();
        } else {
            rVar = null;
        }
        if (rVar != null) {
            rVar.r();
            return;
        }
        Log.w("[RNScreens]", "Did not find view with tag " + i10 + ".");
    }
}
