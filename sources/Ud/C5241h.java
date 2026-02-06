package ud;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.d;
import com.swmansion.reanimated.NodesManager;
import com.swmansion.reanimated.ReanimatedModule;
import kotlin.jvm.internal.C6496s;

/* renamed from: ud.h  reason: case insensitive filesystem */
public final class C5241h {

    /* renamed from: a  reason: collision with root package name */
    private ReanimatedModule f61717a;

    public final void a(d dVar, ReactContext reactContext) {
        NodesManager nodesManager;
        C6496s.h(dVar, "event");
        C6496s.h(reactContext, "reactApplicationContext");
        if (this.f61717a == null) {
            this.f61717a = (ReanimatedModule) reactContext.getNativeModule(ReanimatedModule.class);
        }
        ReanimatedModule reanimatedModule = this.f61717a;
        if (reanimatedModule != null && (nodesManager = reanimatedModule.getNodesManager()) != null) {
            nodesManager.onEventDispatch(dVar);
        }
    }
}
