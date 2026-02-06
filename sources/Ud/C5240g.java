package ud;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.n0;
import kotlin.jvm.internal.C6496s;

/* renamed from: ud.g  reason: case insensitive filesystem */
public abstract class C5240g {
    public static final void a(ReactContext reactContext, d dVar) {
        C6496s.h(reactContext, "<this>");
        C6496s.h(dVar, "event");
        UIManager g10 = n0.g(reactContext, 2);
        C6496s.f(g10, "null cannot be cast to non-null type com.facebook.react.fabric.FabricUIManager");
        ((FabricUIManager) g10).getEventDispatcher().h(dVar);
    }
}
