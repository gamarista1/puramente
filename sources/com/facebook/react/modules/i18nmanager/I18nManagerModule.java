package com.facebook.react.modules.i18nmanager;

import com.facebook.fbreact.specs.NativeI18nManagerSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.i18nmanager.a;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import mf.O;

@Q7.a(name = "I18nManager")
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/modules/i18nmanager/I18nManagerModule;", "Lcom/facebook/fbreact/specs/NativeI18nManagerSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "context", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "", "", "getTypedExportedConstants", "()Ljava/util/Map;", "", "value", "Llf/M;", "allowRTL", "(Z)V", "forceRTL", "swapLeftAndRightInRTL", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class I18nManagerModule extends NativeI18nManagerSpec {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    public static final String NAME = "I18nManager";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public I18nManagerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public void allowRTL(boolean z10) {
        a a10 = a.f41056a.a();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C6496s.g(reactApplicationContext, "getReactApplicationContext(...)");
        a10.b(reactApplicationContext, z10);
    }

    public void forceRTL(boolean z10) {
        a a10 = a.f41056a.a();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C6496s.g(reactApplicationContext, "getReactApplicationContext(...)");
        a10.e(reactApplicationContext, z10);
    }

    public Map<String, Object> getTypedExportedConstants() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Locale locale = reactApplicationContext.getResources().getConfiguration().getLocales().get(0);
        a.C0643a aVar = a.f41056a;
        a a10 = aVar.a();
        C6496s.e(reactApplicationContext);
        return O.l(C6502A.a("isRTL", Boolean.valueOf(a10.i(reactApplicationContext))), C6502A.a("doLeftAndRightSwapInRTL", Boolean.valueOf(aVar.a().d(reactApplicationContext))), C6502A.a("localeIdentifier", locale.toString()));
    }

    public void swapLeftAndRightInRTL(boolean z10) {
        a a10 = a.f41056a.a();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C6496s.g(reactApplicationContext, "getReactApplicationContext(...)");
        a10.m(reactApplicationContext, z10);
    }
}
