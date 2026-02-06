package com.th3rdwave.safeareacontext;

import android.view.View;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6494p;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import lf.C6514M;
import m8.C3832u;
import mf.O;
import yf.q;

@Q7.a(name = "RNCSafeAreaProvider")
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001cB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\b\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00110\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R0\u0010\u0019\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/th3rdwave/safeareacontext/f;", "", "<init>", "()V", "Lm8/u;", "kotlin.jvm.PlatformType", "getDelegate", "()Lm8/u;", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/h0;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/h0;)Lcom/th3rdwave/safeareacontext/f;", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "reactContext", "view", "Llf/M;", "addEventEmitters", "(Lcom/facebook/react/uimanager/h0;Lcom/th3rdwave/safeareacontext/f;)V", "mDelegate", "Lm8/u;", "Companion", "a", "react-native-safe-area-context_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SafeAreaProviderManager extends ViewGroupManager<f> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    public static final String REACT_CLASS = "RNCSafeAreaProvider";
    private final C3832u mDelegate = new C3832u(this);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* synthetic */ class b extends C6494p implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final b f60000a = new b();

        b() {
            super(3, g.class, "handleOnInsetsChange", "handleOnInsetsChange(Lcom/th3rdwave/safeareacontext/SafeAreaProvider;Lcom/th3rdwave/safeareacontext/EdgeInsets;Lcom/th3rdwave/safeareacontext/Rect;)V", 1);
        }

        public final void i(f fVar, a aVar, c cVar) {
            C6496s.h(fVar, "p0");
            C6496s.h(aVar, "p1");
            C6496s.h(cVar, "p2");
            g.b(fVar, aVar, cVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            i((f) obj, (a) obj2, (c) obj3);
            return C6514M.f71813a;
        }
    }

    public Map<String, Map<String, String>> getExportedCustomDirectEventTypeConstants() {
        return O.n(C6502A.a("topInsetsChange", O.n(C6502A.a("registrationName", "onInsetsChange"))));
    }

    public String getName() {
        return REACT_CLASS;
    }

    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    /* access modifiers changed from: protected */
    public void addEventEmitters(C3415h0 h0Var, f fVar) {
        C6496s.h(h0Var, "reactContext");
        C6496s.h(fVar, "view");
        super.addEventEmitters(h0Var, fVar);
        fVar.setOnInsetsChangeHandler(b.f60000a);
    }

    public f createViewInstance(C3415h0 h0Var) {
        C6496s.h(h0Var, "context");
        return new f(h0Var);
    }

    /* access modifiers changed from: protected */
    public C3832u getDelegate() {
        return this.mDelegate;
    }
}
