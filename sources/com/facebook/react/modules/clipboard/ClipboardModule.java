package com.facebook.react.modules.clipboard;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.facebook.fbreact.specs.NativeClipboardSpec;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Q7.a(name = "Clipboard")
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/modules/clipboard/ClipboardModule;", "Lcom/facebook/fbreact/specs/NativeClipboardSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "context", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lcom/facebook/react/bridge/Promise;", "promise", "Llf/M;", "getString", "(Lcom/facebook/react/bridge/Promise;)V", "", "text", "setString", "(Ljava/lang/String;)V", "Landroid/content/ClipboardManager;", "getClipboardService", "()Landroid/content/ClipboardManager;", "clipboardService", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ClipboardModule extends NativeClipboardSpec {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    public static final String NAME = "Clipboard";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipboardModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        C6496s.h(reactApplicationContext, "context");
    }

    private final ClipboardManager getClipboardService() {
        Object systemService = getReactApplicationContext().getSystemService("clipboard");
        C6496s.f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        return (ClipboardManager) systemService;
    }

    public void getString(Promise promise) {
        C6496s.h(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        try {
            ClipData primaryClip = getClipboardService().getPrimaryClip();
            if (primaryClip == null || primaryClip.getItemCount() < 1) {
                promise.resolve("");
            } else {
                promise.resolve(String.valueOf(primaryClip.getItemAt(0).getText()));
            }
        } catch (Exception e10) {
            promise.reject((Throwable) e10);
        }
    }

    public void setString(String str) {
        ClipData newPlainText = ClipData.newPlainText((CharSequence) null, str);
        C6496s.g(newPlainText, "newPlainText(...)");
        getClipboardService().setPrimaryClip(newPlainText);
    }
}
