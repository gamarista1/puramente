package io.intercom.android.sdk.models;

import Oc.c;
import io.intercom.android.sdk.models.Participant;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÇ\u0001J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001a\u001a\u00020\u001bH×\u0001J\t\u0010\u001c\u001a\u00020\u001dH×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lio/intercom/android/sdk/models/ActiveBot;", "", "participant", "Lio/intercom/android/sdk/models/Participant$Builder;", "isAi", "", "useBotUx", "isIdentityCustomized", "streamingPart", "Lio/intercom/android/sdk/models/StreamingPart;", "<init>", "(Lio/intercom/android/sdk/models/Participant$Builder;ZZZLio/intercom/android/sdk/models/StreamingPart;)V", "getParticipant", "()Lio/intercom/android/sdk/models/Participant$Builder;", "()Z", "getUseBotUx", "getStreamingPart", "()Lio/intercom/android/sdk/models/StreamingPart;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ActiveBot {
    public static final int $stable = 8;
    @c("has_ai")
    private final boolean isAi;
    @c("has_customized_identity")
    private final boolean isIdentityCustomized;
    @c("participant")
    private final Participant.Builder participant;
    @c("streaming_part")
    private final StreamingPart streamingPart;
    @c("use_bot_ux")
    private final boolean useBotUx;

    public ActiveBot() {
        this((Participant.Builder) null, false, false, false, (StreamingPart) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ActiveBot copy$default(ActiveBot activeBot, Participant.Builder builder, boolean z10, boolean z11, boolean z12, StreamingPart streamingPart2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            builder = activeBot.participant;
        }
        if ((i10 & 2) != 0) {
            z10 = activeBot.isAi;
        }
        boolean z13 = z10;
        if ((i10 & 4) != 0) {
            z11 = activeBot.useBotUx;
        }
        boolean z14 = z11;
        if ((i10 & 8) != 0) {
            z12 = activeBot.isIdentityCustomized;
        }
        boolean z15 = z12;
        if ((i10 & 16) != 0) {
            streamingPart2 = activeBot.streamingPart;
        }
        return activeBot.copy(builder, z13, z14, z15, streamingPart2);
    }

    public final Participant.Builder component1() {
        return this.participant;
    }

    public final boolean component2() {
        return this.isAi;
    }

    public final boolean component3() {
        return this.useBotUx;
    }

    public final boolean component4() {
        return this.isIdentityCustomized;
    }

    public final StreamingPart component5() {
        return this.streamingPart;
    }

    public final ActiveBot copy(Participant.Builder builder, boolean z10, boolean z11, boolean z12, StreamingPart streamingPart2) {
        C6496s.h(builder, "participant");
        return new ActiveBot(builder, z10, z11, z12, streamingPart2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActiveBot)) {
            return false;
        }
        ActiveBot activeBot = (ActiveBot) obj;
        return C6496s.c(this.participant, activeBot.participant) && this.isAi == activeBot.isAi && this.useBotUx == activeBot.useBotUx && this.isIdentityCustomized == activeBot.isIdentityCustomized && C6496s.c(this.streamingPart, activeBot.streamingPart);
    }

    public final Participant.Builder getParticipant() {
        return this.participant;
    }

    public final StreamingPart getStreamingPart() {
        return this.streamingPart;
    }

    public final boolean getUseBotUx() {
        return this.useBotUx;
    }

    public int hashCode() {
        int hashCode = ((((((this.participant.hashCode() * 31) + Boolean.hashCode(this.isAi)) * 31) + Boolean.hashCode(this.useBotUx)) * 31) + Boolean.hashCode(this.isIdentityCustomized)) * 31;
        StreamingPart streamingPart2 = this.streamingPart;
        return hashCode + (streamingPart2 == null ? 0 : streamingPart2.hashCode());
    }

    public final boolean isAi() {
        return this.isAi;
    }

    public final boolean isIdentityCustomized() {
        return this.isIdentityCustomized;
    }

    public String toString() {
        return "ActiveBot(participant=" + this.participant + ", isAi=" + this.isAi + ", useBotUx=" + this.useBotUx + ", isIdentityCustomized=" + this.isIdentityCustomized + ", streamingPart=" + this.streamingPart + ')';
    }

    public ActiveBot(Participant.Builder builder, boolean z10, boolean z11, boolean z12, StreamingPart streamingPart2) {
        C6496s.h(builder, "participant");
        this.participant = builder;
        this.isAi = z10;
        this.useBotUx = z11;
        this.isIdentityCustomized = z12;
        this.streamingPart = streamingPart2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ActiveBot(io.intercom.android.sdk.models.Participant.Builder r4, boolean r5, boolean r6, boolean r7, io.intercom.android.sdk.models.StreamingPart r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0009
            io.intercom.android.sdk.models.Participant$Builder r4 = new io.intercom.android.sdk.models.Participant$Builder
            r4.<init>()
        L_0x0009:
            r10 = r9 & 2
            r0 = 0
            if (r10 == 0) goto L_0x0010
            r10 = r0
            goto L_0x0011
        L_0x0010:
            r10 = r5
        L_0x0011:
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0017
            r1 = r0
            goto L_0x0018
        L_0x0017:
            r1 = r6
        L_0x0018:
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r0 = r7
        L_0x001e:
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0023
            r8 = 0
        L_0x0023:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r1
            r9 = r0
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.models.ActiveBot.<init>(io.intercom.android.sdk.models.Participant$Builder, boolean, boolean, boolean, io.intercom.android.sdk.models.StreamingPart, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
