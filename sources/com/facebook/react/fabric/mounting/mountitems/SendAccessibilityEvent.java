package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.fabric.mounting.MountingManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002XD¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/fabric/mounting/mountitems/SendAccessibilityEvent;", "Lcom/facebook/react/fabric/mounting/mountitems/MountItem;", "", "_surfaceId", "reactTag", "eventType", "<init>", "(III)V", "Lcom/facebook/react/fabric/mounting/MountingManager;", "mountingManager", "Llf/M;", "execute", "(Lcom/facebook/react/fabric/mounting/MountingManager;)V", "getSurfaceId", "()I", "", "toString", "()Ljava/lang/String;", "I", "TAG", "Ljava/lang/String;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SendAccessibilityEvent implements MountItem {
    private final String TAG = "Fabric.SendAccessibilityEvent";
    private final int _surfaceId;
    private final int eventType;
    private final int reactTag;

    public SendAccessibilityEvent(int i10, int i11, int i12) {
        this._surfaceId = i10;
        this.reactTag = i11;
        this.eventType = i12;
    }

    public void execute(MountingManager mountingManager) {
        C6496s.h(mountingManager, "mountingManager");
        try {
            mountingManager.sendAccessibilityEvent(this._surfaceId, this.reactTag, this.eventType);
        } catch (RetryableMountingLayerException e10) {
            ReactSoftExceptionLogger.logSoftException(this.TAG, e10);
        }
    }

    public int getSurfaceId() {
        return this._surfaceId;
    }

    public String toString() {
        int i10 = this.reactTag;
        int i11 = this.eventType;
        return "SendAccessibilityEvent [" + i10 + "] " + i11;
    }
}
