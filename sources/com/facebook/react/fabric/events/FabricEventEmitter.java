package com.facebook.react.fabric.events;

import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.uimanager.events.RCTModernEventEmitter;
import com.facebook.react.uimanager.events.o;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;
import z8.C4236a;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u0010JI\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0015J'\u0010\u0019\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u0019\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/facebook/react/fabric/events/FabricEventEmitter;", "Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;", "Lcom/facebook/react/fabric/FabricUIManager;", "uiManager", "<init>", "(Lcom/facebook/react/fabric/FabricUIManager;)V", "", "reactTag", "", "eventName", "Lcom/facebook/react/bridge/WritableMap;", "params", "Llf/M;", "receiveEvent", "(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "surfaceId", "(IILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "", "canCoalesceEvent", "customCoalesceKey", "category", "(IILjava/lang/String;ZILcom/facebook/react/bridge/WritableMap;I)V", "Lcom/facebook/react/bridge/WritableArray;", "touches", "changedIndices", "receiveTouches", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableArray;Lcom/facebook/react/bridge/WritableArray;)V", "Lcom/facebook/react/uimanager/events/o;", "event", "(Lcom/facebook/react/uimanager/events/o;)V", "Lcom/facebook/react/fabric/FabricUIManager;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FabricEventEmitter implements RCTModernEventEmitter {
    private final FabricUIManager uiManager;

    public FabricEventEmitter(FabricUIManager fabricUIManager) {
        C6496s.h(fabricUIManager, "uiManager");
        this.uiManager = fabricUIManager;
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
        throw new UnsupportedOperationException("EventEmitter#receiveTouches is not supported by Fabric");
    }

    public void receiveEvent(int i10, int i11, String str, WritableMap writableMap) {
        C6496s.h(str, "eventName");
        receiveEvent(i10, i11, str, false, 0, writableMap, 2);
    }

    @C6521e
    public void receiveTouches(o oVar) {
        C6496s.h(oVar, "event");
        throw new UnsupportedOperationException("EventEmitter#receiveTouches is not supported by Fabric");
    }

    public void receiveEvent(int i10, int i11, String str, boolean z10, int i12, WritableMap writableMap, int i13) {
        String str2 = str;
        C6496s.h(str, "eventName");
        C4236a.c(0, "FabricEventEmitter.receiveEvent('" + str + "')");
        try {
            this.uiManager.receiveEvent(i10, i11, str, z10, writableMap, i13);
        } finally {
            C4236a.i(0);
        }
    }
}
