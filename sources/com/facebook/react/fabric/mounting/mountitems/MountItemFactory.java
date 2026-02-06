package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C3413g0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\u000eJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010#\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010 2\u0006\u0010\"\u001a\u00020\u0004H\u0007¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/facebook/react/fabric/mounting/mountitems/MountItemFactory;", "", "<init>", "()V", "", "surfaceId", "reactTag", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "commandArgs", "Lcom/facebook/react/fabric/mounting/mountitems/DispatchCommandMountItem;", "createDispatchCommandMountItem", "(IIILcom/facebook/react/bridge/ReadableArray;)Lcom/facebook/react/fabric/mounting/mountitems/DispatchCommandMountItem;", "", "(IILjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)Lcom/facebook/react/fabric/mounting/mountitems/DispatchCommandMountItem;", "eventType", "Lcom/facebook/react/fabric/mounting/mountitems/MountItem;", "createSendAccessibilityEventMountItem", "(III)Lcom/facebook/react/fabric/mounting/mountitems/MountItem;", "component", "Lcom/facebook/react/bridge/ReadableMap;", "props", "Lcom/facebook/react/uimanager/g0;", "stateWrapper", "", "isLayoutable", "createPreAllocateViewMountItem", "(IILjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/uimanager/g0;Z)Lcom/facebook/react/fabric/mounting/mountitems/MountItem;", "createDestroyViewMountItem", "(II)Lcom/facebook/react/fabric/mounting/mountitems/MountItem;", "", "intBuf", "", "objBuf", "commitNumber", "createIntBufferBatchMountItem", "(I[I[Ljava/lang/Object;I)Lcom/facebook/react/fabric/mounting/mountitems/MountItem;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MountItemFactory {
    public static final MountItemFactory INSTANCE = new MountItemFactory();

    private MountItemFactory() {
    }

    public static final MountItem createDestroyViewMountItem(int i10, int i11) {
        return new DestroyUnmountedViewMountItem(i10, i11);
    }

    public static final DispatchCommandMountItem createDispatchCommandMountItem(int i10, int i11, int i12, ReadableArray readableArray) {
        return new DispatchIntCommandMountItem(i10, i11, i12, readableArray);
    }

    public static final MountItem createIntBufferBatchMountItem(int i10, int[] iArr, Object[] objArr, int i11) {
        C6496s.h(iArr, "intBuf");
        C6496s.h(objArr, "objBuf");
        return new IntBufferBatchMountItem(i10, iArr, objArr, i11);
    }

    public static final MountItem createPreAllocateViewMountItem(int i10, int i11, String str, ReadableMap readableMap, C3413g0 g0Var, boolean z10) {
        C6496s.h(str, "component");
        return new PreAllocateViewMountItem(i10, i11, str, readableMap, g0Var, z10);
    }

    public static final MountItem createSendAccessibilityEventMountItem(int i10, int i11, int i12) {
        return new SendAccessibilityEventMountItem(i10, i11, i12);
    }

    public static final DispatchCommandMountItem createDispatchCommandMountItem(int i10, int i11, String str, ReadableArray readableArray) {
        C6496s.h(str, "commandId");
        return new DispatchStringCommandMountItem(i10, i11, str, readableArray);
    }
}
