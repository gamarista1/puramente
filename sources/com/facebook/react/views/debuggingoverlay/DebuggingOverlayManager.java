package com.facebook.react.views.debuggingoverlay;

import android.graphics.RectF;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UnexpectedNativeTypeException;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.w0;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import m8.C3809i;
import m8.C3811j;
import o8.b;
import o8.c;

@Q7.a(name = "DebuggingOverlay")
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/facebook/react/views/debuggingoverlay/DebuggingOverlayManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lo8/b;", "Lm8/j;", "<init>", "()V", "Lcom/facebook/react/uimanager/w0;", "getDelegate", "()Lcom/facebook/react/uimanager/w0;", "view", "", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "args", "Llf/M;", "receiveCommand", "(Lo8/b;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "highlightTraceUpdates", "(Lo8/b;Lcom/facebook/react/bridge/ReadableArray;)V", "highlightElements", "clearElementsHighlights", "(Lo8/b;)V", "Lcom/facebook/react/uimanager/h0;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/h0;)Lo8/b;", "getName", "()Ljava/lang/String;", "delegate", "Lcom/facebook/react/uimanager/w0;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DebuggingOverlayManager extends SimpleViewManager<b> implements C3811j {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    public static final String REACT_CLASS = "DebuggingOverlay";
    private final w0 delegate = new C3809i(this);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public w0 getDelegate() {
        return this.delegate;
    }

    public String getName() {
        return REACT_CLASS;
    }

    public void clearElementsHighlights(b bVar) {
        C6496s.h(bVar, "view");
        bVar.b();
    }

    public b createViewInstance(C3415h0 h0Var) {
        C6496s.h(h0Var, "context");
        return new b(h0Var);
    }

    public void highlightElements(b bVar, ReadableArray readableArray) {
        ReadableArray array;
        b bVar2 = bVar;
        ReadableArray readableArray2 = readableArray;
        C6496s.h(bVar2, "view");
        if (readableArray2 != null && (array = readableArray2.getArray(0)) != null) {
            ArrayList arrayList = new ArrayList();
            int size = array.size();
            boolean z10 = true;
            for (int i10 = 0; i10 < size; i10++) {
                ReadableMap map = array.getMap(i10);
                if (map != null) {
                    try {
                        float f10 = (float) map.getDouble("x");
                        float f11 = (float) map.getDouble("y");
                        G g10 = G.f41415a;
                        arrayList.add(new RectF(g10.b(f10), g10.b(f11), g10.b((float) (((double) f10) + map.getDouble(Snapshot.WIDTH))), g10.b((float) (((double) f11) + map.getDouble(Snapshot.HEIGHT)))));
                    } catch (Exception e10) {
                        if ((e10 instanceof NoSuchKeyException) || (e10 instanceof UnexpectedNativeTypeException)) {
                            ReactSoftExceptionLogger.logSoftException(REACT_CLASS, new ReactNoCrashSoftException("Unexpected payload for highlighting elements: every element should have x, y, width, height fields"));
                            C6514M m10 = C6514M.f71813a;
                            z10 = false;
                        } else {
                            throw e10;
                        }
                    }
                }
            }
            if (z10) {
                bVar2.setHighlightedElementsRectangles(arrayList);
            }
        }
    }

    public void highlightTraceUpdates(b bVar, ReadableArray readableArray) {
        b bVar2 = bVar;
        ReadableArray readableArray2 = readableArray;
        C6496s.h(bVar2, "view");
        if (readableArray2 != null) {
            boolean z10 = false;
            ReadableArray array = readableArray2.getArray(0);
            if (array != null) {
                ArrayList arrayList = new ArrayList();
                int size = array.size();
                int i10 = 0;
                boolean z11 = true;
                while (true) {
                    if (i10 >= size) {
                        z10 = z11;
                        break;
                    }
                    ReadableMap map = array.getMap(i10);
                    if (map != null) {
                        ReadableMap map2 = map.getMap("rectangle");
                        if (map2 == null) {
                            ReactSoftExceptionLogger.logSoftException(REACT_CLASS, new ReactNoCrashSoftException("Unexpected payload for highlighting trace updates: rectangle field is null"));
                            break;
                        }
                        int i11 = map.getInt("id");
                        int i12 = map.getInt("color");
                        try {
                            float f10 = (float) map2.getDouble("x");
                            float f11 = (float) map2.getDouble("y");
                            float f12 = (float) (((double) f10) + map2.getDouble(Snapshot.WIDTH));
                            float f13 = (float) (((double) f11) + map2.getDouble(Snapshot.HEIGHT));
                            G g10 = G.f41415a;
                            arrayList.add(new c(i11, new RectF(g10.b(f10), g10.b(f11), g10.b(f12), g10.b(f13)), i12));
                        } catch (Exception e10) {
                            if ((e10 instanceof NoSuchKeyException) || (e10 instanceof UnexpectedNativeTypeException)) {
                                ReactSoftExceptionLogger.logSoftException(REACT_CLASS, new ReactNoCrashSoftException("Unexpected payload for highlighting trace updates: rectangle field should have x, y, width, height fields"));
                                C6514M m10 = C6514M.f71813a;
                                z11 = false;
                            } else {
                                throw e10;
                            }
                        }
                    }
                    i10++;
                    z10 = false;
                }
                if (z10) {
                    bVar2.setTraceUpdates(arrayList);
                }
            }
        }
    }

    public void receiveCommand(b bVar, String str, ReadableArray readableArray) {
        C6496s.h(bVar, "view");
        C6496s.h(str, "commandId");
        int hashCode = str.hashCode();
        if (hashCode != -1942063165) {
            if (hashCode != 1326903961) {
                if (hashCode == 1385348555 && str.equals("highlightElements")) {
                    highlightElements(bVar, readableArray);
                    return;
                }
            } else if (str.equals("highlightTraceUpdates")) {
                highlightTraceUpdates(bVar, readableArray);
                return;
            }
        } else if (str.equals("clearElementsHighlights")) {
            clearElementsHighlights(bVar);
            return;
        }
        ReactSoftExceptionLogger.logSoftException(REACT_CLASS, new ReactNoCrashSoftException("Received unexpected command in DebuggingOverlayManager"));
    }
}
