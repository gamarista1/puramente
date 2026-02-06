package com.facebook.react.views.swiperefresh;

import android.view.View;
import com.adjust.sdk.Constants;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.w0;
import e8.C3500a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import m8.C3801e;
import m8.C3803f;
import mf.O;

@Q7.a(name = "AndroidSwipeRefreshLayout")
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0011\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001;B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001c\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001fJ\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020 H\u0007¢\u0006\u0004\b\u001c\u0010!J\u001f\u0010#\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u000eH\u0017¢\u0006\u0004\b#\u0010\u0012J\u001f\u0010&\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$H\u0017¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b(\u0010\u0012J\u001f\u0010)\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b)\u0010*J)\u0010.\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\n2\b\u0010-\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b.\u0010/J\u001b\u00102\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020100H\u0016¢\u0006\u0004\b2\u00103J\u001b\u00104\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020100H\u0016¢\u0006\u0004\b4\u00103J\u0015\u00106\u001a\b\u0012\u0004\u0012\u00020\u000205H\u0014¢\u0006\u0004\b6\u00107R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u0002058\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006<"}, d2 = {"Lcom/facebook/react/views/swiperefresh/SwipeRefreshLayoutManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/facebook/react/views/swiperefresh/a;", "Lm8/f;", "<init>", "()V", "Lcom/facebook/react/uimanager/h0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/h0;)Lcom/facebook/react/views/swiperefresh/a;", "", "getName", "()Ljava/lang/String;", "view", "", "enabled", "Llf/M;", "setEnabled", "(Lcom/facebook/react/views/swiperefresh/a;Z)V", "Lcom/facebook/react/bridge/ReadableArray;", "colors", "setColors", "(Lcom/facebook/react/views/swiperefresh/a;Lcom/facebook/react/bridge/ReadableArray;)V", "", "color", "setProgressBackgroundColor", "(Lcom/facebook/react/views/swiperefresh/a;Ljava/lang/Integer;)V", "value", "setSize", "(Lcom/facebook/react/views/swiperefresh/a;I)V", "size", "(Lcom/facebook/react/views/swiperefresh/a;Ljava/lang/String;)V", "Lcom/facebook/react/bridge/Dynamic;", "(Lcom/facebook/react/views/swiperefresh/a;Lcom/facebook/react/bridge/Dynamic;)V", "refreshing", "setRefreshing", "", "offset", "setProgressViewOffset", "(Lcom/facebook/react/views/swiperefresh/a;F)V", "setNativeRefreshing", "addEventEmitters", "(Lcom/facebook/react/uimanager/h0;Lcom/facebook/react/views/swiperefresh/a;)V", "root", "commandId", "args", "receiveCommand", "(Lcom/facebook/react/views/swiperefresh/a;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "", "", "getExportedViewConstants", "()Ljava/util/Map;", "getExportedCustomDirectEventTypeConstants", "Lcom/facebook/react/uimanager/w0;", "getDelegate", "()Lcom/facebook/react/uimanager/w0;", "delegate", "Lcom/facebook/react/uimanager/w0;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class SwipeRefreshLayoutManager extends ViewGroupManager<a> implements C3803f {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    public static final String REACT_CLASS = "AndroidSwipeRefreshLayout";
    private final w0 delegate = new C3801e(this);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* access modifiers changed from: private */
    public static final void addEventEmitters$lambda$0(C3415h0 h0Var, a aVar) {
        EventDispatcher c10 = n0.c(h0Var, aVar.getId());
        if (c10 != null) {
            c10.h(new b(n0.f(aVar), aVar.getId()));
        }
    }

    /* access modifiers changed from: protected */
    public w0 getDelegate() {
        return this.delegate;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(O.n(C6502A.a("topRefresh", O.n(C6502A.a("registrationName", "onRefresh")))));
        return exportedCustomDirectEventTypeConstants;
    }

    public Map<String, Object> getExportedViewConstants() {
        return O.n(C6502A.a("SIZE", O.n(C6502A.a("DEFAULT", 1), C6502A.a("LARGE", 0))));
    }

    public String getName() {
        return REACT_CLASS;
    }

    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    /* access modifiers changed from: protected */
    public void addEventEmitters(C3415h0 h0Var, a aVar) {
        C6496s.h(h0Var, "reactContext");
        C6496s.h(aVar, "view");
        aVar.setOnRefreshListener(new c(h0Var, aVar));
    }

    /* access modifiers changed from: protected */
    public a createViewInstance(C3415h0 h0Var) {
        C6496s.h(h0Var, "reactContext");
        return new a(h0Var);
    }

    public void receiveCommand(a aVar, String str, ReadableArray readableArray) {
        C6496s.h(aVar, "root");
        C6496s.h(str, "commandId");
        if (C6496s.c(str, "setNativeRefreshing") && readableArray != null) {
            setRefreshing(aVar, readableArray.getBoolean(0));
        }
    }

    @C3500a(customType = "ColorArray", name = "colors")
    public void setColors(a aVar, ReadableArray readableArray) {
        C6496s.h(aVar, "view");
        if (readableArray != null) {
            int size = readableArray.size();
            int[] iArr = new int[size];
            int size2 = readableArray.size();
            for (int i10 = 0; i10 < size2; i10++) {
                if (readableArray.getType(i10) == ReadableType.Map) {
                    Integer color = ColorPropConverter.getColor(readableArray.getMap(i10), aVar.getContext());
                    C6496s.g(color, "getColor(...)");
                    iArr[i10] = color.intValue();
                } else {
                    iArr[i10] = readableArray.getInt(i10);
                }
            }
            aVar.setColorSchemeColors(Arrays.copyOf(iArr, size));
            return;
        }
        aVar.setColorSchemeColors(new int[0]);
    }

    @C3500a(defaultBoolean = true, name = "enabled")
    public void setEnabled(a aVar, boolean z10) {
        C6496s.h(aVar, "view");
        aVar.setEnabled(z10);
    }

    public void setNativeRefreshing(a aVar, boolean z10) {
        C6496s.h(aVar, "view");
        setRefreshing(aVar, z10);
    }

    @C3500a(customType = "Color", name = "progressBackgroundColor")
    public void setProgressBackgroundColor(a aVar, Integer num) {
        C6496s.h(aVar, "view");
        aVar.setProgressBackgroundColorSchemeColor(num != null ? num.intValue() : 0);
    }

    @C3500a(defaultFloat = 0.0f, name = "progressViewOffset")
    public void setProgressViewOffset(a aVar, float f10) {
        C6496s.h(aVar, "view");
        aVar.setProgressViewOffset(f10);
    }

    @C3500a(name = "refreshing")
    public void setRefreshing(a aVar, boolean z10) {
        C6496s.h(aVar, "view");
        aVar.setRefreshing(z10);
    }

    public final void setSize(a aVar, int i10) {
        C6496s.h(aVar, "view");
        aVar.setSize(i10);
    }

    public void setSize(a aVar, String str) {
        C6496s.h(aVar, "view");
        if (str == null || str.equals("default")) {
            aVar.setSize(1);
        } else if (str.equals(Constants.LARGE)) {
            aVar.setSize(0);
        } else {
            throw new IllegalArgumentException("Size must be 'default' or 'large', received: " + str);
        }
    }

    @C3500a(name = "size")
    public final void setSize(a aVar, Dynamic dynamic) {
        C6496s.h(aVar, "view");
        C6496s.h(dynamic, "size");
        if (dynamic.isNull()) {
            aVar.setSize(1);
        } else if (dynamic.getType() == ReadableType.Number) {
            aVar.setSize(dynamic.asInt());
        } else if (dynamic.getType() == ReadableType.String) {
            setSize(aVar, dynamic.asString());
        } else {
            throw new IllegalArgumentException("Size must be 'default' or 'large'");
        }
    }
}
