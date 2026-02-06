package com.facebook.react.internal.interop;

import N7.a;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/facebook/react/internal/interop/InteropEventEmitter;", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", "", "targetReactTag", "", "eventName", "Lcom/facebook/react/bridge/WritableMap;", "eventData", "Llf/M;", "receiveEvent", "(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "Lcom/facebook/react/bridge/WritableArray;", "touches", "changedIndices", "receiveTouches", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableArray;Lcom/facebook/react/bridge/WritableArray;)V", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "eventDispatcherOverride", "overrideEventDispatcher", "(Lcom/facebook/react/uimanager/events/EventDispatcher;)V", "Lcom/facebook/react/bridge/ReactContext;", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InteropEventEmitter implements RCTEventEmitter {
    private EventDispatcher eventDispatcherOverride;
    private final ReactContext reactContext;

    public InteropEventEmitter(ReactContext reactContext2) {
        C6496s.h(reactContext2, "reactContext");
        this.reactContext = reactContext2;
    }

    public final void overrideEventDispatcher(EventDispatcher eventDispatcher) {
        this.eventDispatcherOverride = eventDispatcher;
    }

    @C6521e
    public void receiveEvent(int i10, String str, WritableMap writableMap) {
        C6496s.h(str, "eventName");
        EventDispatcher eventDispatcher = this.eventDispatcherOverride;
        if (eventDispatcher == null) {
            eventDispatcher = n0.c(this.reactContext, i10);
        }
        int e10 = n0.e(this.reactContext);
        if (eventDispatcher != null) {
            eventDispatcher.h(new a(str, writableMap, e10, i10));
        }
    }

    @C6521e
    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        C6496s.h(str, "eventName");
        C6496s.h(writableArray, "touches");
        C6496s.h(writableArray2, "changedIndices");
        throw new UnsupportedOperationException("EventEmitter#receiveTouches is not supported by the Fabric Interop Layer");
    }
}
