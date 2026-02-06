package com.facebook.react.devsupport;

import C7.i;
import I7.e;
import com.facebook.fbreact.specs.NativeLogBoxSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Q7.a(name = "LogBox")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/facebook/react/devsupport/LogBoxModule;", "Lcom/facebook/fbreact/specs/NativeLogBoxSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "LI7/e;", "devSupportManager", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;LI7/e;)V", "Llf/M;", "show", "()V", "hide", "invalidate", "LI7/e;", "LC7/i;", "surfaceDelegate", "LC7/i;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LogBoxModule extends NativeLogBoxSpec {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    public static final String NAME = "LogBox";
    private final e devSupportManager;
    private final i surfaceDelegate;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LogBoxModule(ReactApplicationContext reactApplicationContext, e eVar) {
        super(reactApplicationContext);
        C6496s.h(eVar, "devSupportManager");
        this.devSupportManager = eVar;
        i e10 = eVar.e("LogBox");
        this.surfaceDelegate = e10 == null ? new T(eVar) : e10;
    }

    /* access modifiers changed from: private */
    public static final void hide$lambda$1(LogBoxModule logBoxModule) {
        logBoxModule.surfaceDelegate.a();
    }

    /* access modifiers changed from: private */
    public static final void invalidate$lambda$2(LogBoxModule logBoxModule) {
        logBoxModule.surfaceDelegate.f();
    }

    /* access modifiers changed from: private */
    public static final void show$lambda$0(LogBoxModule logBoxModule) {
        if (!logBoxModule.surfaceDelegate.d()) {
            logBoxModule.surfaceDelegate.e("LogBox");
        }
        logBoxModule.surfaceDelegate.b();
    }

    public void hide() {
        UiThreadUtil.runOnUiThread(new U(this));
    }

    public void invalidate() {
        UiThreadUtil.runOnUiThread(new V(this));
    }

    public void show() {
        UiThreadUtil.runOnUiThread(new W(this));
    }
}
