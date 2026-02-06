package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.G;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import z8.C4236a;

public abstract class r {

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f41672a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.facebook.react.uimanager.events.q[] r0 = com.facebook.react.uimanager.events.q.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f41672a = r0
                com.facebook.react.uimanager.events.q r1 = com.facebook.react.uimanager.events.q.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f41672a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.react.uimanager.events.q r1 = com.facebook.react.uimanager.events.q.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f41672a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.react.uimanager.events.q r1 = com.facebook.react.uimanager.events.q.MOVE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f41672a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.react.uimanager.events.q r1 = com.facebook.react.uimanager.events.q.CANCEL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.events.r.a.<clinit>():void");
        }
    }

    private static WritableMap[] a(o oVar) {
        MotionEvent c10 = oVar.c();
        WritableMap[] writableMapArr = new WritableMap[c10.getPointerCount()];
        float x10 = c10.getX() - oVar.e();
        float y10 = c10.getY() - oVar.f();
        for (int i10 = 0; i10 < c10.getPointerCount(); i10++) {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("pageX", (double) G.f(c10.getX(i10)));
            createMap.putDouble("pageY", (double) G.f(c10.getY(i10)));
            createMap.putDouble("locationX", (double) G.f(c10.getX(i10) - x10));
            createMap.putDouble("locationY", (double) G.f(c10.getY(i10) - y10));
            createMap.putInt("targetSurface", oVar.getSurfaceId());
            createMap.putInt("target", oVar.getViewTag());
            createMap.putDouble(DiagnosticsEntry.TIMESTAMP_KEY, (double) oVar.getTimestampMs());
            createMap.putDouble("identifier", (double) c10.getPointerId(i10));
            writableMapArr[i10] = createMap;
        }
        return writableMapArr;
    }

    private static WritableArray b(boolean z10, WritableMap... writableMapArr) {
        WritableArray createArray = Arguments.createArray();
        for (WritableMap writableMap : writableMapArr) {
            if (writableMap != null) {
                if (z10) {
                    writableMap = writableMap.copy();
                }
                createArray.pushMap(writableMap);
            }
        }
        return createArray;
    }

    static void c(RCTModernEventEmitter rCTModernEventEmitter, o oVar) {
        WritableMap[] writableMapArr;
        WritableMap[] writableMapArr2;
        C4236a.c(0, "TouchesHelper.sentTouchEventModern(" + oVar.getEventName() + ")");
        try {
            q d10 = oVar.d();
            MotionEvent c10 = oVar.c();
            if (c10 == null) {
                ReactSoftExceptionLogger.logSoftException("TouchesHelper", new IllegalStateException("Cannot dispatch a TouchEvent that has no MotionEvent; the TouchEvent has been recycled"));
                return;
            }
            WritableMap[] a10 = a(oVar);
            int i10 = a.f41672a[d10.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    int actionIndex = c10.getActionIndex();
                    WritableMap writableMap = a10[actionIndex];
                    a10[actionIndex] = null;
                    writableMapArr2 = new WritableMap[]{writableMap};
                } else if (i10 == 3) {
                    writableMapArr2 = new WritableMap[a10.length];
                    for (int i11 = 0; i11 < a10.length; i11++) {
                        writableMapArr2[i11] = a10[i11].copy();
                    }
                } else if (i10 != 4) {
                    writableMapArr = a10;
                    a10 = null;
                } else {
                    writableMapArr = new WritableMap[0];
                }
                WritableMap[] writableMapArr3 = a10;
                a10 = writableMapArr2;
                writableMapArr = writableMapArr3;
            } else {
                writableMapArr = a10;
                a10 = new WritableMap[]{a10[c10.getActionIndex()].copy()};
            }
            if (a10 != null) {
                for (WritableMap copy : a10) {
                    WritableMap copy2 = copy.copy();
                    WritableArray b10 = b(true, a10);
                    WritableArray b11 = b(true, writableMapArr);
                    copy2.putArray("changedTouches", b10);
                    copy2.putArray("touches", b11);
                    rCTModernEventEmitter.receiveEvent(oVar.getSurfaceId(), oVar.getViewTag(), oVar.getEventName(), oVar.canCoalesce(), 0, copy2, oVar.getEventCategory());
                }
            }
            C4236a.i(0);
        } finally {
            C4236a.i(0);
        }
    }

    static void d(RCTEventEmitter rCTEventEmitter, o oVar) {
        q d10 = oVar.d();
        WritableArray b10 = b(false, a(oVar));
        MotionEvent c10 = oVar.c();
        WritableArray createArray = Arguments.createArray();
        if (d10 == q.MOVE || d10 == q.CANCEL) {
            for (int i10 = 0; i10 < c10.getPointerCount(); i10++) {
                createArray.pushInt(i10);
            }
        } else if (d10 == q.START || d10 == q.END) {
            createArray.pushInt(c10.getActionIndex());
        } else {
            throw new RuntimeException("Unknown touch type: " + d10);
        }
        rCTEventEmitter.receiveTouches(q.b(d10), b10, createArray);
    }
}
