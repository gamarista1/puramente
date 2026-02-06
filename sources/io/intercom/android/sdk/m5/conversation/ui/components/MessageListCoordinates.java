package io.intercom.android.sdk.m5.conversation.ui.components;

import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q0.C2423i;
import q0.C2427m;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0010¨\u0006#"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/MessageListCoordinates;", "", "Lq0/i;", "boundsInParent", "boundsInWindow", "Lq0/m;", "size", "<init>", "(Lq0/i;Lq0/i;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "isZero", "()Z", "component1", "()Lq0/i;", "component2", "component3-NH-jbRc", "()J", "component3", "copy-cSwnlzA", "(Lq0/i;Lq0/i;J)Lio/intercom/android/sdk/m5/conversation/ui/components/MessageListCoordinates;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lq0/i;", "getBoundsInParent", "getBoundsInWindow", "J", "getSize-NH-jbRc", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class MessageListCoordinates {
    private final C2423i boundsInParent;
    private final C2423i boundsInWindow;
    private final long size;

    public /* synthetic */ MessageListCoordinates(C2423i iVar, C2423i iVar2, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, iVar2, j10);
    }

    /* renamed from: copy-cSwnlzA$default  reason: not valid java name */
    public static /* synthetic */ MessageListCoordinates m253copycSwnlzA$default(MessageListCoordinates messageListCoordinates, C2423i iVar, C2423i iVar2, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            iVar = messageListCoordinates.boundsInParent;
        }
        if ((i10 & 2) != 0) {
            iVar2 = messageListCoordinates.boundsInWindow;
        }
        if ((i10 & 4) != 0) {
            j10 = messageListCoordinates.size;
        }
        return messageListCoordinates.m255copycSwnlzA(iVar, iVar2, j10);
    }

    public final C2423i component1() {
        return this.boundsInParent;
    }

    public final C2423i component2() {
        return this.boundsInWindow;
    }

    /* renamed from: component3-NH-jbRc  reason: not valid java name */
    public final long m254component3NHjbRc() {
        return this.size;
    }

    /* renamed from: copy-cSwnlzA  reason: not valid java name */
    public final MessageListCoordinates m255copycSwnlzA(C2423i iVar, C2423i iVar2, long j10) {
        C6496s.h(iVar, "boundsInParent");
        C6496s.h(iVar2, "boundsInWindow");
        return new MessageListCoordinates(iVar, iVar2, j10, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageListCoordinates)) {
            return false;
        }
        MessageListCoordinates messageListCoordinates = (MessageListCoordinates) obj;
        return C6496s.c(this.boundsInParent, messageListCoordinates.boundsInParent) && C6496s.c(this.boundsInWindow, messageListCoordinates.boundsInWindow) && C2427m.h(this.size, messageListCoordinates.size);
    }

    public final C2423i getBoundsInParent() {
        return this.boundsInParent;
    }

    public final C2423i getBoundsInWindow() {
        return this.boundsInWindow;
    }

    /* renamed from: getSize-NH-jbRc  reason: not valid java name */
    public final long m256getSizeNHjbRc() {
        return this.size;
    }

    public int hashCode() {
        return (((this.boundsInParent.hashCode() * 31) + this.boundsInWindow.hashCode()) * 31) + C2427m.l(this.size);
    }

    public final boolean isZero() {
        if (!C6496s.c(this.boundsInParent, C2423i.f25325e.a()) || !C2427m.h(this.size, C2427m.f25341b.b())) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "MessageListCoordinates(boundsInParent=" + this.boundsInParent + ", boundsInWindow=" + this.boundsInWindow + ", size=" + C2427m.n(this.size) + ')';
    }

    private MessageListCoordinates(C2423i iVar, C2423i iVar2, long j10) {
        C6496s.h(iVar, "boundsInParent");
        C6496s.h(iVar2, "boundsInWindow");
        this.boundsInParent = iVar;
        this.boundsInWindow = iVar2;
        this.size = j10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MessageListCoordinates(C2423i iVar, C2423i iVar2, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C2423i.f25325e.a() : iVar, (i10 & 2) != 0 ? C2423i.f25325e.a() : iVar2, (i10 & 4) != 0 ? C2427m.f25341b.b() : j10, (DefaultConstructorMarker) null);
    }
}
