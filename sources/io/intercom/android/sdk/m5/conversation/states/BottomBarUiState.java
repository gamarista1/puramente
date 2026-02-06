package io.intercom.android.sdk.m5.conversation.states;

import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.models.PoweredBy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0002*+BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J\t\u0010\"\u001a\u00020\u000eHÆ\u0003JK\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÇ\u0001J\u0013\u0010$\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010&\u001a\u00020'H×\u0001J\t\u0010(\u001a\u00020)H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState;", "", "composerState", "Lio/intercom/android/sdk/m5/conversation/states/ComposerState;", "currentlyTypingState", "Lio/intercom/android/sdk/m5/conversation/states/CurrentlyTypingState;", "inputTypeState", "Lio/intercom/android/sdk/m5/conversation/states/InputTypeState;", "buttons", "", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBarButton;", "finDictationEnabled", "", "bottomBadge", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBadgeState;", "<init>", "(Lio/intercom/android/sdk/m5/conversation/states/ComposerState;Lio/intercom/android/sdk/m5/conversation/states/CurrentlyTypingState;Lio/intercom/android/sdk/m5/conversation/states/InputTypeState;Ljava/util/List;ZLio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBadgeState;)V", "getComposerState", "()Lio/intercom/android/sdk/m5/conversation/states/ComposerState;", "getCurrentlyTypingState", "()Lio/intercom/android/sdk/m5/conversation/states/CurrentlyTypingState;", "getInputTypeState", "()Lio/intercom/android/sdk/m5/conversation/states/InputTypeState;", "getButtons", "()Ljava/util/List;", "getFinDictationEnabled", "()Z", "getBottomBadge", "()Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBadgeState;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "BottomBarButton", "BottomBadgeState", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BottomBarUiState {
    public static final int $stable = 8;
    private final BottomBadgeState bottomBadge;
    private final List<BottomBarButton> buttons;
    private final ComposerState composerState;
    private final CurrentlyTypingState currentlyTypingState;
    private final boolean finDictationEnabled;
    private final InputTypeState inputTypeState;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBadgeState;", "", "PoweredByBadgeState", "PrivacyNoticeBadgeState", "None", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBadgeState$None;", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBadgeState$PoweredByBadgeState;", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBadgeState$PrivacyNoticeBadgeState;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface BottomBadgeState {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBadgeState$None;", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBadgeState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class None implements BottomBadgeState {
            public static final int $stable = 0;
            public static final None INSTANCE = new None();

            private None() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof None);
            }

            public int hashCode() {
                return -495368601;
            }

            public String toString() {
                return "None";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBadgeState$PoweredByBadgeState;", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBadgeState;", "poweredBy", "Lio/intercom/android/sdk/models/PoweredBy;", "<init>", "(Lio/intercom/android/sdk/models/PoweredBy;)V", "getPoweredBy", "()Lio/intercom/android/sdk/models/PoweredBy;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class PoweredByBadgeState implements BottomBadgeState {
            public static final int $stable = 0;
            private final PoweredBy poweredBy;

            public PoweredByBadgeState(PoweredBy poweredBy2) {
                C6496s.h(poweredBy2, "poweredBy");
                this.poweredBy = poweredBy2;
            }

            public static /* synthetic */ PoweredByBadgeState copy$default(PoweredByBadgeState poweredByBadgeState, PoweredBy poweredBy2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    poweredBy2 = poweredByBadgeState.poweredBy;
                }
                return poweredByBadgeState.copy(poweredBy2);
            }

            public final PoweredBy component1() {
                return this.poweredBy;
            }

            public final PoweredByBadgeState copy(PoweredBy poweredBy2) {
                C6496s.h(poweredBy2, "poweredBy");
                return new PoweredByBadgeState(poweredBy2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PoweredByBadgeState) && C6496s.c(this.poweredBy, ((PoweredByBadgeState) obj).poweredBy);
            }

            public final PoweredBy getPoweredBy() {
                return this.poweredBy;
            }

            public int hashCode() {
                return this.poweredBy.hashCode();
            }

            public String toString() {
                return "PoweredByBadgeState(poweredBy=" + this.poweredBy + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBadgeState$PrivacyNoticeBadgeState;", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBadgeState;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class PrivacyNoticeBadgeState implements BottomBadgeState {
            public static final int $stable = 0;
            private final String text;

            public PrivacyNoticeBadgeState(String str) {
                C6496s.h(str, AttributeType.TEXT);
                this.text = str;
            }

            public static /* synthetic */ PrivacyNoticeBadgeState copy$default(PrivacyNoticeBadgeState privacyNoticeBadgeState, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = privacyNoticeBadgeState.text;
                }
                return privacyNoticeBadgeState.copy(str);
            }

            public final String component1() {
                return this.text;
            }

            public final PrivacyNoticeBadgeState copy(String str) {
                C6496s.h(str, AttributeType.TEXT);
                return new PrivacyNoticeBadgeState(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PrivacyNoticeBadgeState) && C6496s.c(this.text, ((PrivacyNoticeBadgeState) obj).text);
            }

            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            public String toString() {
                return "PrivacyNoticeBadgeState(text=" + this.text + ')';
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBarButton;", "", "<init>", "()V", "GifInsert", "MediaInsert", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBarButton$GifInsert;", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBarButton$MediaInsert;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class BottomBarButton {
        public static final int $stable = 0;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBarButton$GifInsert;", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBarButton;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class GifInsert extends BottomBarButton {
            public static final int $stable = 0;
            public static final GifInsert INSTANCE = new GifInsert();

            private GifInsert() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof GifInsert);
            }

            public int hashCode() {
                return 806342211;
            }

            public String toString() {
                return "GifInsert";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBarButton$MediaInsert;", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBarButton;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class MediaInsert extends BottomBarButton {
            public static final int $stable = 0;
            public static final MediaInsert INSTANCE = new MediaInsert();

            private MediaInsert() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof MediaInsert);
            }

            public int hashCode() {
                return -196410141;
            }

            public String toString() {
                return "MediaInsert";
            }
        }

        public /* synthetic */ BottomBarButton(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private BottomBarButton() {
        }
    }

    public BottomBarUiState(ComposerState composerState2, CurrentlyTypingState currentlyTypingState2, InputTypeState inputTypeState2, List<? extends BottomBarButton> list, boolean z10, BottomBadgeState bottomBadgeState) {
        C6496s.h(composerState2, "composerState");
        C6496s.h(currentlyTypingState2, "currentlyTypingState");
        C6496s.h(inputTypeState2, "inputTypeState");
        C6496s.h(list, "buttons");
        C6496s.h(bottomBadgeState, "bottomBadge");
        this.composerState = composerState2;
        this.currentlyTypingState = currentlyTypingState2;
        this.inputTypeState = inputTypeState2;
        this.buttons = list;
        this.finDictationEnabled = z10;
        this.bottomBadge = bottomBadgeState;
    }

    public static /* synthetic */ BottomBarUiState copy$default(BottomBarUiState bottomBarUiState, ComposerState composerState2, CurrentlyTypingState currentlyTypingState2, InputTypeState inputTypeState2, List<BottomBarButton> list, boolean z10, BottomBadgeState bottomBadgeState, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            composerState2 = bottomBarUiState.composerState;
        }
        if ((i10 & 2) != 0) {
            currentlyTypingState2 = bottomBarUiState.currentlyTypingState;
        }
        CurrentlyTypingState currentlyTypingState3 = currentlyTypingState2;
        if ((i10 & 4) != 0) {
            inputTypeState2 = bottomBarUiState.inputTypeState;
        }
        InputTypeState inputTypeState3 = inputTypeState2;
        if ((i10 & 8) != 0) {
            list = bottomBarUiState.buttons;
        }
        List<BottomBarButton> list2 = list;
        if ((i10 & 16) != 0) {
            z10 = bottomBarUiState.finDictationEnabled;
        }
        boolean z11 = z10;
        if ((i10 & 32) != 0) {
            bottomBadgeState = bottomBarUiState.bottomBadge;
        }
        return bottomBarUiState.copy(composerState2, currentlyTypingState3, inputTypeState3, list2, z11, bottomBadgeState);
    }

    public final ComposerState component1() {
        return this.composerState;
    }

    public final CurrentlyTypingState component2() {
        return this.currentlyTypingState;
    }

    public final InputTypeState component3() {
        return this.inputTypeState;
    }

    public final List<BottomBarButton> component4() {
        return this.buttons;
    }

    public final boolean component5() {
        return this.finDictationEnabled;
    }

    public final BottomBadgeState component6() {
        return this.bottomBadge;
    }

    public final BottomBarUiState copy(ComposerState composerState2, CurrentlyTypingState currentlyTypingState2, InputTypeState inputTypeState2, List<? extends BottomBarButton> list, boolean z10, BottomBadgeState bottomBadgeState) {
        C6496s.h(composerState2, "composerState");
        C6496s.h(currentlyTypingState2, "currentlyTypingState");
        C6496s.h(inputTypeState2, "inputTypeState");
        C6496s.h(list, "buttons");
        C6496s.h(bottomBadgeState, "bottomBadge");
        return new BottomBarUiState(composerState2, currentlyTypingState2, inputTypeState2, list, z10, bottomBadgeState);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomBarUiState)) {
            return false;
        }
        BottomBarUiState bottomBarUiState = (BottomBarUiState) obj;
        return C6496s.c(this.composerState, bottomBarUiState.composerState) && C6496s.c(this.currentlyTypingState, bottomBarUiState.currentlyTypingState) && C6496s.c(this.inputTypeState, bottomBarUiState.inputTypeState) && C6496s.c(this.buttons, bottomBarUiState.buttons) && this.finDictationEnabled == bottomBarUiState.finDictationEnabled && C6496s.c(this.bottomBadge, bottomBarUiState.bottomBadge);
    }

    public final BottomBadgeState getBottomBadge() {
        return this.bottomBadge;
    }

    public final List<BottomBarButton> getButtons() {
        return this.buttons;
    }

    public final ComposerState getComposerState() {
        return this.composerState;
    }

    public final CurrentlyTypingState getCurrentlyTypingState() {
        return this.currentlyTypingState;
    }

    public final boolean getFinDictationEnabled() {
        return this.finDictationEnabled;
    }

    public final InputTypeState getInputTypeState() {
        return this.inputTypeState;
    }

    public int hashCode() {
        return (((((((((this.composerState.hashCode() * 31) + this.currentlyTypingState.hashCode()) * 31) + this.inputTypeState.hashCode()) * 31) + this.buttons.hashCode()) * 31) + Boolean.hashCode(this.finDictationEnabled)) * 31) + this.bottomBadge.hashCode();
    }

    public String toString() {
        return "BottomBarUiState(composerState=" + this.composerState + ", currentlyTypingState=" + this.currentlyTypingState + ", inputTypeState=" + this.inputTypeState + ", buttons=" + this.buttons + ", finDictationEnabled=" + this.finDictationEnabled + ", bottomBadge=" + this.bottomBadge + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BottomBarUiState(ComposerState composerState2, CurrentlyTypingState currentlyTypingState2, InputTypeState inputTypeState2, List list, boolean z10, BottomBadgeState bottomBadgeState, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(composerState2, currentlyTypingState2, inputTypeState2, (i10 & 8) != 0 ? C6565s.n() : list, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? BottomBadgeState.None.INSTANCE : bottomBadgeState);
    }
}
