package com.facebook.react.animated;

import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTModernEventEmitter;
import com.facebook.react.uimanager.events.o;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0014J'\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\u0018\u0010\u001cJI\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010!R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0016\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0016\u0010\t\u001a\u00020\b8\u0000@\u0000X\u000e¢\u0006\u0006\n\u0004\b\t\u0010%¨\u0006&"}, d2 = {"Lcom/facebook/react/animated/EventAnimationDriver;", "Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;", "", "eventName", "", "viewTag", "", "eventPath", "Lcom/facebook/react/animated/w;", "valueNode", "<init>", "(Ljava/lang/String;ILjava/util/List;Lcom/facebook/react/animated/w;)V", "targetReactTag", "Lcom/facebook/react/bridge/WritableMap;", "event", "Llf/M;", "receiveEvent", "(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "surfaceId", "targetTag", "(IILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "Lcom/facebook/react/bridge/WritableArray;", "touches", "changedIndices", "receiveTouches", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableArray;Lcom/facebook/react/bridge/WritableArray;)V", "Lcom/facebook/react/uimanager/events/o;", "touchEvent", "(Lcom/facebook/react/uimanager/events/o;)V", "", "canCoalesceEvent", "customCoalesceKey", "category", "(IILjava/lang/String;ZILcom/facebook/react/bridge/WritableMap;I)V", "Ljava/lang/String;", "I", "Ljava/util/List;", "Lcom/facebook/react/animated/w;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EventAnimationDriver implements RCTModernEventEmitter {
    public String eventName;
    private final List<String> eventPath;
    public w valueNode;
    public int viewTag;

    public EventAnimationDriver(String str, int i10, List<String> list, w wVar) {
        C6496s.h(str, "eventName");
        C6496s.h(list, "eventPath");
        C6496s.h(wVar, "valueNode");
        this.eventName = str;
        this.viewTag = i10;
        this.eventPath = list;
        this.valueNode = wVar;
    }

    @C6521e
    public void receiveEvent(int i10, String str, WritableMap writableMap) {
        C6496s.h(str, "eventName");
        receiveEvent(-1, i10, str, writableMap);
    }

    @C6521e
    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        C6496s.h(str, "eventName");
        C6496s.h(writableArray, "touches");
        C6496s.h(writableArray2, "changedIndices");
        throw new UnsupportedOperationException("receiveTouches is not support by native animated events");
    }

    public void receiveEvent(int i10, int i11, String str, WritableMap writableMap) {
        C6496s.h(str, "eventName");
        receiveEvent(i10, i11, str, false, 0, writableMap, 2);
    }

    @C6521e
    public void receiveTouches(o oVar) {
        C6496s.h(oVar, "touchEvent");
        throw new UnsupportedOperationException("receiveTouches is not support by native animated events");
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.facebook.react.bridge.WritableMap, code=com.facebook.react.bridge.ReadableMap, for r8v0, types: [com.facebook.react.bridge.WritableMap] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void receiveEvent(int r3, int r4, java.lang.String r5, boolean r6, int r7, com.facebook.react.bridge.ReadableMap r8, int r9) {
        /*
            r2 = this;
            java.lang.String r3 = "eventName"
            kotlin.jvm.internal.C6496s.h(r5, r3)
            if (r8 == 0) goto L_0x00d7
            java.util.List<java.lang.String> r3 = r2.eventPath
            int r3 = r3.size()
            int r3 = r3 + -1
            r4 = 0
            r5 = 0
            r6 = r4
        L_0x0012:
            if (r5 >= r3) goto L_0x00ac
            java.lang.String r7 = "'"
            java.lang.String r9 = "Unexpected type "
            if (r8 == 0) goto L_0x005b
            java.util.List<java.lang.String> r6 = r2.eventPath
            java.lang.Object r6 = r6.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            com.facebook.react.bridge.ReadableType r0 = r8.getType(r6)
            com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Map
            if (r0 != r1) goto L_0x0031
            com.facebook.react.bridge.ReadableMap r6 = r8.getMap(r6)
        L_0x002e:
            r8 = r6
            r6 = r4
            goto L_0x0089
        L_0x0031:
            com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Array
            if (r0 != r1) goto L_0x003b
            com.facebook.react.bridge.ReadableArray r6 = r8.getArray(r6)
        L_0x0039:
            r8 = r4
            goto L_0x0089
        L_0x003b:
            com.facebook.react.bridge.UnexpectedNativeTypeException r3 = new com.facebook.react.bridge.UnexpectedNativeTypeException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r9)
            r4.append(r0)
            java.lang.String r5 = " for key '"
            r4.append(r5)
            r4.append(r6)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L_0x005b:
            java.util.List<java.lang.String> r8 = r2.eventPath
            java.lang.Object r8 = r8.get(r5)
            java.lang.String r8 = (java.lang.String) r8
            int r8 = java.lang.Integer.parseInt(r8)
            if (r6 == 0) goto L_0x006e
            com.facebook.react.bridge.ReadableType r0 = r6.getType(r8)
            goto L_0x006f
        L_0x006e:
            r0 = r4
        L_0x006f:
            com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Map
            if (r0 != r1) goto L_0x007c
            if (r6 == 0) goto L_0x007a
            com.facebook.react.bridge.ReadableMap r6 = r6.getMap(r8)
            goto L_0x002e
        L_0x007a:
            r6 = r4
            goto L_0x002e
        L_0x007c:
            com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Array
            if (r0 != r1) goto L_0x008c
            if (r6 == 0) goto L_0x0087
            com.facebook.react.bridge.ReadableArray r6 = r6.getArray(r8)
            goto L_0x0039
        L_0x0087:
            r6 = r4
            goto L_0x0039
        L_0x0089:
            int r5 = r5 + 1
            goto L_0x0012
        L_0x008c:
            com.facebook.react.bridge.UnexpectedNativeTypeException r3 = new com.facebook.react.bridge.UnexpectedNativeTypeException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r9)
            r4.append(r0)
            java.lang.String r5 = " for index '"
            r4.append(r5)
            r4.append(r8)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L_0x00ac:
            java.util.List<java.lang.String> r3 = r2.eventPath
            int r4 = r3.size()
            int r4 = r4 + -1
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            if (r8 == 0) goto L_0x00c5
            com.facebook.react.animated.w r4 = r2.valueNode
            double r5 = r8.getDouble(r3)
            r4.f40562f = r5
            goto L_0x00d6
        L_0x00c5:
            int r3 = java.lang.Integer.parseInt(r3)
            com.facebook.react.animated.w r4 = r2.valueNode
            if (r6 == 0) goto L_0x00d2
            double r5 = r6.getDouble(r3)
            goto L_0x00d4
        L_0x00d2:
            r5 = 0
        L_0x00d4:
            r4.f40562f = r5
        L_0x00d6:
            return
        L_0x00d7:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Native animated events must have event data."
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.animated.EventAnimationDriver.receiveEvent(int, int, java.lang.String, boolean, int, com.facebook.react.bridge.WritableMap, int):void");
    }
}
