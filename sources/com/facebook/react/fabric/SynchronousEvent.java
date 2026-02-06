package com.facebook.react.fabric;

import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/fabric/SynchronousEvent;", "", "surfaceId", "", "viewTag", "eventName", "", "<init>", "(IILjava/lang/String;)V", "getSurfaceId", "()I", "getViewTag", "getEventName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SynchronousEvent {
    private final String eventName;
    private final int surfaceId;
    private final int viewTag;

    public SynchronousEvent(int i10, int i11, String str) {
        C6496s.h(str, "eventName");
        this.surfaceId = i10;
        this.viewTag = i11;
        this.eventName = str;
    }

    public static /* synthetic */ SynchronousEvent copy$default(SynchronousEvent synchronousEvent, int i10, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = synchronousEvent.surfaceId;
        }
        if ((i12 & 2) != 0) {
            i11 = synchronousEvent.viewTag;
        }
        if ((i12 & 4) != 0) {
            str = synchronousEvent.eventName;
        }
        return synchronousEvent.copy(i10, i11, str);
    }

    public final int component1() {
        return this.surfaceId;
    }

    public final int component2() {
        return this.viewTag;
    }

    public final String component3() {
        return this.eventName;
    }

    public final SynchronousEvent copy(int i10, int i11, String str) {
        C6496s.h(str, "eventName");
        return new SynchronousEvent(i10, i11, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SynchronousEvent)) {
            return false;
        }
        SynchronousEvent synchronousEvent = (SynchronousEvent) obj;
        return this.surfaceId == synchronousEvent.surfaceId && this.viewTag == synchronousEvent.viewTag && C6496s.c(this.eventName, synchronousEvent.eventName);
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final int getSurfaceId() {
        return this.surfaceId;
    }

    public final int getViewTag() {
        return this.viewTag;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.surfaceId) * 31) + Integer.hashCode(this.viewTag)) * 31) + this.eventName.hashCode();
    }

    public String toString() {
        int i10 = this.surfaceId;
        int i11 = this.viewTag;
        String str = this.eventName;
        return "SynchronousEvent(surfaceId=" + i10 + ", viewTag=" + i11 + ", eventName=" + str + ")";
    }
}
