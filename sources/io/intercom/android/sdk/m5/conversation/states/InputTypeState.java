package io.intercom.android.sdk.m5.conversation.states;

import io.intercom.android.sdk.ui.component.MediaPickerButtonKt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6521e;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 !2\u00020\u0001:\u0001!B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JK\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001e\u001a\u00020\u001fH×\u0001J\t\u0010 \u001a\u00020\tH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006\""}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/InputTypeState;", "", "mediaInputEnabled", "", "gifInputEnabled", "cameraInputEnabled", "fileInputEnabled", "trustedFileExtensions", "", "", "voiceInputEnabled", "<init>", "(ZZZZLjava/util/Set;Z)V", "getMediaInputEnabled", "()Z", "getGifInputEnabled", "getCameraInputEnabled", "getFileInputEnabled", "getTrustedFileExtensions", "()Ljava/util/Set;", "getVoiceInputEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@C6521e
public final class InputTypeState {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final InputTypeState DEFAULT = new InputTypeState(true, true, true, true, MediaPickerButtonKt.getDefaultTrustedFileExtensions(), false, 32, (DefaultConstructorMarker) null);
    private final boolean cameraInputEnabled;
    private final boolean fileInputEnabled;
    private final boolean gifInputEnabled;
    private final boolean mediaInputEnabled;
    private final Set<String> trustedFileExtensions;
    private final boolean voiceInputEnabled;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/InputTypeState$Companion;", "", "<init>", "()V", "DEFAULT", "Lio/intercom/android/sdk/m5/conversation/states/InputTypeState;", "getDEFAULT", "()Lio/intercom/android/sdk/m5/conversation/states/InputTypeState;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InputTypeState getDEFAULT() {
            return InputTypeState.DEFAULT;
        }

        private Companion() {
        }
    }

    public InputTypeState(boolean z10, boolean z11, boolean z12, boolean z13, Set<String> set, boolean z14) {
        C6496s.h(set, "trustedFileExtensions");
        this.mediaInputEnabled = z10;
        this.gifInputEnabled = z11;
        this.cameraInputEnabled = z12;
        this.fileInputEnabled = z13;
        this.trustedFileExtensions = set;
        this.voiceInputEnabled = z14;
    }

    public static /* synthetic */ InputTypeState copy$default(InputTypeState inputTypeState, boolean z10, boolean z11, boolean z12, boolean z13, Set<String> set, boolean z14, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = inputTypeState.mediaInputEnabled;
        }
        if ((i10 & 2) != 0) {
            z11 = inputTypeState.gifInputEnabled;
        }
        boolean z15 = z11;
        if ((i10 & 4) != 0) {
            z12 = inputTypeState.cameraInputEnabled;
        }
        boolean z16 = z12;
        if ((i10 & 8) != 0) {
            z13 = inputTypeState.fileInputEnabled;
        }
        boolean z17 = z13;
        if ((i10 & 16) != 0) {
            set = inputTypeState.trustedFileExtensions;
        }
        Set<String> set2 = set;
        if ((i10 & 32) != 0) {
            z14 = inputTypeState.voiceInputEnabled;
        }
        return inputTypeState.copy(z10, z15, z16, z17, set2, z14);
    }

    public final boolean component1() {
        return this.mediaInputEnabled;
    }

    public final boolean component2() {
        return this.gifInputEnabled;
    }

    public final boolean component3() {
        return this.cameraInputEnabled;
    }

    public final boolean component4() {
        return this.fileInputEnabled;
    }

    public final Set<String> component5() {
        return this.trustedFileExtensions;
    }

    public final boolean component6() {
        return this.voiceInputEnabled;
    }

    public final InputTypeState copy(boolean z10, boolean z11, boolean z12, boolean z13, Set<String> set, boolean z14) {
        C6496s.h(set, "trustedFileExtensions");
        return new InputTypeState(z10, z11, z12, z13, set, z14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputTypeState)) {
            return false;
        }
        InputTypeState inputTypeState = (InputTypeState) obj;
        return this.mediaInputEnabled == inputTypeState.mediaInputEnabled && this.gifInputEnabled == inputTypeState.gifInputEnabled && this.cameraInputEnabled == inputTypeState.cameraInputEnabled && this.fileInputEnabled == inputTypeState.fileInputEnabled && C6496s.c(this.trustedFileExtensions, inputTypeState.trustedFileExtensions) && this.voiceInputEnabled == inputTypeState.voiceInputEnabled;
    }

    public final boolean getCameraInputEnabled() {
        return this.cameraInputEnabled;
    }

    public final boolean getFileInputEnabled() {
        return this.fileInputEnabled;
    }

    public final boolean getGifInputEnabled() {
        return this.gifInputEnabled;
    }

    public final boolean getMediaInputEnabled() {
        return this.mediaInputEnabled;
    }

    public final Set<String> getTrustedFileExtensions() {
        return this.trustedFileExtensions;
    }

    public final boolean getVoiceInputEnabled() {
        return this.voiceInputEnabled;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.mediaInputEnabled) * 31) + Boolean.hashCode(this.gifInputEnabled)) * 31) + Boolean.hashCode(this.cameraInputEnabled)) * 31) + Boolean.hashCode(this.fileInputEnabled)) * 31) + this.trustedFileExtensions.hashCode()) * 31) + Boolean.hashCode(this.voiceInputEnabled);
    }

    public String toString() {
        return "InputTypeState(mediaInputEnabled=" + this.mediaInputEnabled + ", gifInputEnabled=" + this.gifInputEnabled + ", cameraInputEnabled=" + this.cameraInputEnabled + ", fileInputEnabled=" + this.fileInputEnabled + ", trustedFileExtensions=" + this.trustedFileExtensions + ", voiceInputEnabled=" + this.voiceInputEnabled + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InputTypeState(boolean z10, boolean z11, boolean z12, boolean z13, Set set, boolean z14, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, z11, z12, z13, set, (i10 & 32) != 0 ? false : z14);
    }
}
