package com.facebook.react.defaults;

import com.facebook.jni.HybridData;
import com.facebook.react.P;
import com.facebook.react.V;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import yf.C6798l;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate;", "Lcom/facebook/react/V;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "context", "", "Lcom/facebook/react/P;", "packages", "", "cxxReactPackages", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;Ljava/util/List;)V", "Lcom/facebook/jni/HybridData;", "initHybrid", "()Lcom/facebook/jni/HybridData;", "Companion", "a", "b", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultTurboModuleManagerDelegate extends V {
    private static final b Companion = new b((DefaultConstructorMarker) null);

    public static final class a extends V.a {

        /* renamed from: c  reason: collision with root package name */
        private final List f40635c = new ArrayList();

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public DefaultTurboModuleManagerDelegate b(ReactApplicationContext reactApplicationContext, List list) {
            C6496s.h(reactApplicationContext, "context");
            C6496s.h(list, "packages");
            ArrayList arrayList = new ArrayList();
            for (C6798l invoke : this.f40635c) {
                C6565s.D(arrayList, (Iterable) invoke.invoke(reactApplicationContext));
            }
            return new DefaultTurboModuleManagerDelegate(reactApplicationContext, list, arrayList, (DefaultConstructorMarker) null);
        }
    }

    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @B7.a
        public final HybridData initHybrid(List<Object> list) {
            return DefaultTurboModuleManagerDelegate.initHybrid(list);
        }

        private b() {
        }
    }

    static {
        e.f40647a.a();
    }

    public /* synthetic */ DefaultTurboModuleManagerDelegate(ReactApplicationContext reactApplicationContext, List list, List list2, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext, list, list2);
    }

    @B7.a
    public static final native HybridData initHybrid(List<Object> list);

    /* access modifiers changed from: protected */
    public HybridData initHybrid() {
        throw new UnsupportedOperationException("DefaultTurboModuleManagerDelegate.initHybrid() must never be called!");
    }

    private DefaultTurboModuleManagerDelegate(ReactApplicationContext reactApplicationContext, List<? extends P> list, List<Object> list2) {
        super(reactApplicationContext, list, Companion.initHybrid(list2));
    }
}
