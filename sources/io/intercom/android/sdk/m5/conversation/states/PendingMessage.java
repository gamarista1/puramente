package io.intercom.android.sdk.m5.conversation.states;

import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.models.Part;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0019B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J\t\u0010\u0017\u001a\u00020\u0018H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/PendingMessage;", "", "part", "Lio/intercom/android/sdk/models/Part;", "isFailed", "", "failedImageUploadData", "Lio/intercom/android/sdk/m5/conversation/states/PendingMessage$FailedImageUploadData;", "<init>", "(Lio/intercom/android/sdk/models/Part;ZLio/intercom/android/sdk/m5/conversation/states/PendingMessage$FailedImageUploadData;)V", "getPart", "()Lio/intercom/android/sdk/models/Part;", "()Z", "getFailedImageUploadData", "()Lio/intercom/android/sdk/m5/conversation/states/PendingMessage$FailedImageUploadData;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "FailedImageUploadData", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PendingMessage {
    public static final int $stable = 8;
    private final FailedImageUploadData failedImageUploadData;
    private final boolean isFailed;
    private final Part part;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/PendingMessage$FailedImageUploadData;", "", "clientAssignedUUID", "", "imageData", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "<init>", "(Ljava/lang/String;Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;)V", "getClientAssignedUUID", "()Ljava/lang/String;", "getImageData", "()Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FailedImageUploadData {
        public static final int $stable = 8;
        private final String clientAssignedUUID;
        private final MediaData.Media imageData;

        public FailedImageUploadData(String str, MediaData.Media media) {
            C6496s.h(str, "clientAssignedUUID");
            C6496s.h(media, "imageData");
            this.clientAssignedUUID = str;
            this.imageData = media;
        }

        public static /* synthetic */ FailedImageUploadData copy$default(FailedImageUploadData failedImageUploadData, String str, MediaData.Media media, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = failedImageUploadData.clientAssignedUUID;
            }
            if ((i10 & 2) != 0) {
                media = failedImageUploadData.imageData;
            }
            return failedImageUploadData.copy(str, media);
        }

        public final String component1() {
            return this.clientAssignedUUID;
        }

        public final MediaData.Media component2() {
            return this.imageData;
        }

        public final FailedImageUploadData copy(String str, MediaData.Media media) {
            C6496s.h(str, "clientAssignedUUID");
            C6496s.h(media, "imageData");
            return new FailedImageUploadData(str, media);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FailedImageUploadData)) {
                return false;
            }
            FailedImageUploadData failedImageUploadData = (FailedImageUploadData) obj;
            return C6496s.c(this.clientAssignedUUID, failedImageUploadData.clientAssignedUUID) && C6496s.c(this.imageData, failedImageUploadData.imageData);
        }

        public final String getClientAssignedUUID() {
            return this.clientAssignedUUID;
        }

        public final MediaData.Media getImageData() {
            return this.imageData;
        }

        public int hashCode() {
            return (this.clientAssignedUUID.hashCode() * 31) + this.imageData.hashCode();
        }

        public String toString() {
            return "FailedImageUploadData(clientAssignedUUID=" + this.clientAssignedUUID + ", imageData=" + this.imageData + ')';
        }
    }

    public PendingMessage(Part part2, boolean z10, FailedImageUploadData failedImageUploadData2) {
        C6496s.h(part2, "part");
        this.part = part2;
        this.isFailed = z10;
        this.failedImageUploadData = failedImageUploadData2;
    }

    public static /* synthetic */ PendingMessage copy$default(PendingMessage pendingMessage, Part part2, boolean z10, FailedImageUploadData failedImageUploadData2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            part2 = pendingMessage.part;
        }
        if ((i10 & 2) != 0) {
            z10 = pendingMessage.isFailed;
        }
        if ((i10 & 4) != 0) {
            failedImageUploadData2 = pendingMessage.failedImageUploadData;
        }
        return pendingMessage.copy(part2, z10, failedImageUploadData2);
    }

    public final Part component1() {
        return this.part;
    }

    public final boolean component2() {
        return this.isFailed;
    }

    public final FailedImageUploadData component3() {
        return this.failedImageUploadData;
    }

    public final PendingMessage copy(Part part2, boolean z10, FailedImageUploadData failedImageUploadData2) {
        C6496s.h(part2, "part");
        return new PendingMessage(part2, z10, failedImageUploadData2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendingMessage)) {
            return false;
        }
        PendingMessage pendingMessage = (PendingMessage) obj;
        return C6496s.c(this.part, pendingMessage.part) && this.isFailed == pendingMessage.isFailed && C6496s.c(this.failedImageUploadData, pendingMessage.failedImageUploadData);
    }

    public final FailedImageUploadData getFailedImageUploadData() {
        return this.failedImageUploadData;
    }

    public final Part getPart() {
        return this.part;
    }

    public int hashCode() {
        int hashCode = ((this.part.hashCode() * 31) + Boolean.hashCode(this.isFailed)) * 31;
        FailedImageUploadData failedImageUploadData2 = this.failedImageUploadData;
        return hashCode + (failedImageUploadData2 == null ? 0 : failedImageUploadData2.hashCode());
    }

    public final boolean isFailed() {
        return this.isFailed;
    }

    public String toString() {
        return "PendingMessage(part=" + this.part + ", isFailed=" + this.isFailed + ", failedImageUploadData=" + this.failedImageUploadData + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PendingMessage(Part part2, boolean z10, FailedImageUploadData failedImageUploadData2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(part2, z10, (i10 & 4) != 0 ? null : failedImageUploadData2);
    }
}
