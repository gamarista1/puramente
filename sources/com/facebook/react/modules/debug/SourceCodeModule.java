package com.facebook.react.modules.debug;

import Q7.a;
import com.facebook.fbreact.specs.NativeSourceCodeSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.O;
import n7.C3863a;

@a(name = "SourceCode")
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0014¨\u0006\n"}, d2 = {"Lcom/facebook/react/modules/debug/SourceCodeModule;", "Lcom/facebook/fbreact/specs/NativeSourceCodeSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getTypedExportedConstants", "", "", "", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SourceCodeModule extends NativeSourceCodeSpec {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SourceCodeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        C6496s.h(reactApplicationContext, "reactContext");
    }

    /* access modifiers changed from: protected */
    public Map<String, Object> getTypedExportedConstants() {
        return O.f(C6502A.a("scriptURL", C3863a.d(getReactApplicationContext().getSourceURL(), "No source URL loaded, have you initialised the instance?")));
    }
}
