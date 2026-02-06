package io.intercom.android.sdk.models;

import Oc.c;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.Y;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 &2\u00020\u0001:\u0001&B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003JK\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÇ\u0001J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010#\u001a\u00020$H×\u0001J\t\u0010%\u001a\u00020\tH×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lio/intercom/android/sdk/models/AttachmentSettings;", "", "cameraEnabled", "", "mediaEnabled", "filesEnabled", "gifsEnabled", "trustedFileExtensions", "", "", "uploadSizeLimit", "", "<init>", "(ZZZZLjava/util/Set;J)V", "getCameraEnabled", "()Z", "getMediaEnabled", "getFilesEnabled", "getGifsEnabled", "getTrustedFileExtensions", "()Ljava/util/Set;", "getUploadSizeLimit", "()J", "uploadSizeLimitMB", "getUploadSizeLimitMB", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AttachmentSettings {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final AttachmentSettings DEFAULT = new AttachmentSettings(true, true, true, true, Y.e(), DEFAULT_UPLOAD_SIZE_LIMIT);
    private static final long DEFAULT_UPLOAD_SIZE_LIMIT = 104857600;
    @c("conversation_camera_enabled")
    private final boolean cameraEnabled;
    @c("conversation_files_enabled")
    private final boolean filesEnabled;
    @c("conversation_gifs_enabled")
    private final boolean gifsEnabled;
    @c("conversation_media_enabled")
    private final boolean mediaEnabled;
    @c("file_upload_extension_trusted_list")
    private final Set<String> trustedFileExtensions;
    @c("upload_size_limit")
    private final long uploadSizeLimit;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/models/AttachmentSettings$Companion;", "", "<init>", "()V", "DEFAULT_UPLOAD_SIZE_LIMIT", "", "DEFAULT", "Lio/intercom/android/sdk/models/AttachmentSettings;", "getDEFAULT", "()Lio/intercom/android/sdk/models/AttachmentSettings;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AttachmentSettings getDEFAULT() {
            return AttachmentSettings.DEFAULT;
        }

        private Companion() {
        }
    }

    public AttachmentSettings(boolean z10, boolean z11, boolean z12, boolean z13, Set<String> set, long j10) {
        C6496s.h(set, "trustedFileExtensions");
        this.cameraEnabled = z10;
        this.mediaEnabled = z11;
        this.filesEnabled = z12;
        this.gifsEnabled = z13;
        this.trustedFileExtensions = set;
        this.uploadSizeLimit = j10;
    }

    public static /* synthetic */ AttachmentSettings copy$default(AttachmentSettings attachmentSettings, boolean z10, boolean z11, boolean z12, boolean z13, Set<String> set, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = attachmentSettings.cameraEnabled;
        }
        if ((i10 & 2) != 0) {
            z11 = attachmentSettings.mediaEnabled;
        }
        boolean z14 = z11;
        if ((i10 & 4) != 0) {
            z12 = attachmentSettings.filesEnabled;
        }
        boolean z15 = z12;
        if ((i10 & 8) != 0) {
            z13 = attachmentSettings.gifsEnabled;
        }
        boolean z16 = z13;
        if ((i10 & 16) != 0) {
            set = attachmentSettings.trustedFileExtensions;
        }
        Set<String> set2 = set;
        if ((i10 & 32) != 0) {
            j10 = attachmentSettings.uploadSizeLimit;
        }
        return attachmentSettings.copy(z10, z14, z15, z16, set2, j10);
    }

    public final boolean component1() {
        return this.cameraEnabled;
    }

    public final boolean component2() {
        return this.mediaEnabled;
    }

    public final boolean component3() {
        return this.filesEnabled;
    }

    public final boolean component4() {
        return this.gifsEnabled;
    }

    public final Set<String> component5() {
        return this.trustedFileExtensions;
    }

    public final long component6() {
        return this.uploadSizeLimit;
    }

    public final AttachmentSettings copy(boolean z10, boolean z11, boolean z12, boolean z13, Set<String> set, long j10) {
        C6496s.h(set, "trustedFileExtensions");
        return new AttachmentSettings(z10, z11, z12, z13, set, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachmentSettings)) {
            return false;
        }
        AttachmentSettings attachmentSettings = (AttachmentSettings) obj;
        return this.cameraEnabled == attachmentSettings.cameraEnabled && this.mediaEnabled == attachmentSettings.mediaEnabled && this.filesEnabled == attachmentSettings.filesEnabled && this.gifsEnabled == attachmentSettings.gifsEnabled && C6496s.c(this.trustedFileExtensions, attachmentSettings.trustedFileExtensions) && this.uploadSizeLimit == attachmentSettings.uploadSizeLimit;
    }

    public final boolean getCameraEnabled() {
        return this.cameraEnabled;
    }

    public final boolean getFilesEnabled() {
        return this.filesEnabled;
    }

    public final boolean getGifsEnabled() {
        return this.gifsEnabled;
    }

    public final boolean getMediaEnabled() {
        return this.mediaEnabled;
    }

    public final Set<String> getTrustedFileExtensions() {
        return this.trustedFileExtensions;
    }

    public final long getUploadSizeLimit() {
        return this.uploadSizeLimit;
    }

    public final String getUploadSizeLimitMB() {
        return String.valueOf(this.uploadSizeLimit / ((long) 1048576));
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.cameraEnabled) * 31) + Boolean.hashCode(this.mediaEnabled)) * 31) + Boolean.hashCode(this.filesEnabled)) * 31) + Boolean.hashCode(this.gifsEnabled)) * 31) + this.trustedFileExtensions.hashCode()) * 31) + Long.hashCode(this.uploadSizeLimit);
    }

    public String toString() {
        return "AttachmentSettings(cameraEnabled=" + this.cameraEnabled + ", mediaEnabled=" + this.mediaEnabled + ", filesEnabled=" + this.filesEnabled + ", gifsEnabled=" + this.gifsEnabled + ", trustedFileExtensions=" + this.trustedFileExtensions + ", uploadSizeLimit=" + this.uploadSizeLimit + ')';
    }
}
