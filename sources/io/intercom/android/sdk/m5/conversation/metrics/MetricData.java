package io.intercom.android.sdk.m5.conversation.metrics;

import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", "", "<init>", "()V", "SpeechRecognitionStarted", "SpeechRecognitionEnded", "MoreMenuClicked", "ConversationsInMoreMenuClicked", "NewConversationInMoreMenuClicked", "TicketsInMoreMenuClicked", "HelpInMoreMenuClicked", "PoweredByClicked", "ComposerInputClicked", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$ComposerInputClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$ConversationsInMoreMenuClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$HelpInMoreMenuClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$MoreMenuClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$NewConversationInMoreMenuClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$PoweredByClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$SpeechRecognitionEnded;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$SpeechRecognitionStarted;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$TicketsInMoreMenuClicked;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class MetricData {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$ComposerInputClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", "input", "", "<init>", "(Ljava/lang/String;)V", "getInput", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ComposerInputClicked extends MetricData {
        public static final int $stable = 0;
        private final String input;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ComposerInputClicked(String str) {
            super((DefaultConstructorMarker) null);
            C6496s.h(str, MetricTracker.Object.INPUT);
            this.input = str;
        }

        public static /* synthetic */ ComposerInputClicked copy$default(ComposerInputClicked composerInputClicked, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = composerInputClicked.input;
            }
            return composerInputClicked.copy(str);
        }

        public final String component1() {
            return this.input;
        }

        public final ComposerInputClicked copy(String str) {
            C6496s.h(str, MetricTracker.Object.INPUT);
            return new ComposerInputClicked(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ComposerInputClicked) && C6496s.c(this.input, ((ComposerInputClicked) obj).input);
        }

        public final String getInput() {
            return this.input;
        }

        public int hashCode() {
            return this.input.hashCode();
        }

        public String toString() {
            return "ComposerInputClicked(input=" + this.input + ')';
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH×\u0003J\t\u0010\f\u001a\u00020\rH×\u0001J\t\u0010\u000e\u001a\u00020\u000fH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$ConversationsInMoreMenuClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", "isMoreMenuContext", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ConversationsInMoreMenuClicked extends MetricData {
        public static final int $stable = 0;
        private final boolean isMoreMenuContext;

        public ConversationsInMoreMenuClicked(boolean z10) {
            super((DefaultConstructorMarker) null);
            this.isMoreMenuContext = z10;
        }

        public static /* synthetic */ ConversationsInMoreMenuClicked copy$default(ConversationsInMoreMenuClicked conversationsInMoreMenuClicked, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = conversationsInMoreMenuClicked.isMoreMenuContext;
            }
            return conversationsInMoreMenuClicked.copy(z10);
        }

        public final boolean component1() {
            return this.isMoreMenuContext;
        }

        public final ConversationsInMoreMenuClicked copy(boolean z10) {
            return new ConversationsInMoreMenuClicked(z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConversationsInMoreMenuClicked) && this.isMoreMenuContext == ((ConversationsInMoreMenuClicked) obj).isMoreMenuContext;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isMoreMenuContext);
        }

        public final boolean isMoreMenuContext() {
            return this.isMoreMenuContext;
        }

        public String toString() {
            return "ConversationsInMoreMenuClicked(isMoreMenuContext=" + this.isMoreMenuContext + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$HelpInMoreMenuClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HelpInMoreMenuClicked extends MetricData {
        public static final int $stable = 0;
        public static final HelpInMoreMenuClicked INSTANCE = new HelpInMoreMenuClicked();

        private HelpInMoreMenuClicked() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$MoreMenuClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MoreMenuClicked extends MetricData {
        public static final int $stable = 0;
        public static final MoreMenuClicked INSTANCE = new MoreMenuClicked();

        private MoreMenuClicked() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH×\u0003J\t\u0010\f\u001a\u00020\rH×\u0001J\t\u0010\u000e\u001a\u00020\u000fH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$NewConversationInMoreMenuClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", "isMoreMenuContext", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NewConversationInMoreMenuClicked extends MetricData {
        public static final int $stable = 0;
        private final boolean isMoreMenuContext;

        public NewConversationInMoreMenuClicked(boolean z10) {
            super((DefaultConstructorMarker) null);
            this.isMoreMenuContext = z10;
        }

        public static /* synthetic */ NewConversationInMoreMenuClicked copy$default(NewConversationInMoreMenuClicked newConversationInMoreMenuClicked, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = newConversationInMoreMenuClicked.isMoreMenuContext;
            }
            return newConversationInMoreMenuClicked.copy(z10);
        }

        public final boolean component1() {
            return this.isMoreMenuContext;
        }

        public final NewConversationInMoreMenuClicked copy(boolean z10) {
            return new NewConversationInMoreMenuClicked(z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NewConversationInMoreMenuClicked) && this.isMoreMenuContext == ((NewConversationInMoreMenuClicked) obj).isMoreMenuContext;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isMoreMenuContext);
        }

        public final boolean isMoreMenuContext() {
            return this.isMoreMenuContext;
        }

        public String toString() {
            return "NewConversationInMoreMenuClicked(isMoreMenuContext=" + this.isMoreMenuContext + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$PoweredByClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PoweredByClicked extends MetricData {
        public static final int $stable = 0;
        public static final PoweredByClicked INSTANCE = new PoweredByClicked();

        private PoweredByClicked() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$SpeechRecognitionEnded;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", "duration", "", "<init>", "(J)V", "getDuration", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SpeechRecognitionEnded extends MetricData {
        public static final int $stable = 0;
        private final long duration;

        public SpeechRecognitionEnded(long j10) {
            super((DefaultConstructorMarker) null);
            this.duration = j10;
        }

        public static /* synthetic */ SpeechRecognitionEnded copy$default(SpeechRecognitionEnded speechRecognitionEnded, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = speechRecognitionEnded.duration;
            }
            return speechRecognitionEnded.copy(j10);
        }

        public final long component1() {
            return this.duration;
        }

        public final SpeechRecognitionEnded copy(long j10) {
            return new SpeechRecognitionEnded(j10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SpeechRecognitionEnded) && this.duration == ((SpeechRecognitionEnded) obj).duration;
        }

        public final long getDuration() {
            return this.duration;
        }

        public int hashCode() {
            return Long.hashCode(this.duration);
        }

        public String toString() {
            return "SpeechRecognitionEnded(duration=" + this.duration + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$SpeechRecognitionStarted;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SpeechRecognitionStarted extends MetricData {
        public static final int $stable = 0;
        public static final SpeechRecognitionStarted INSTANCE = new SpeechRecognitionStarted();

        private SpeechRecognitionStarted() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH×\u0003J\t\u0010\f\u001a\u00020\rH×\u0001J\t\u0010\u000e\u001a\u00020\u000fH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/metrics/MetricData$TicketsInMoreMenuClicked;", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", "isMoreMenuContext", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TicketsInMoreMenuClicked extends MetricData {
        public static final int $stable = 0;
        private final boolean isMoreMenuContext;

        public TicketsInMoreMenuClicked(boolean z10) {
            super((DefaultConstructorMarker) null);
            this.isMoreMenuContext = z10;
        }

        public static /* synthetic */ TicketsInMoreMenuClicked copy$default(TicketsInMoreMenuClicked ticketsInMoreMenuClicked, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = ticketsInMoreMenuClicked.isMoreMenuContext;
            }
            return ticketsInMoreMenuClicked.copy(z10);
        }

        public final boolean component1() {
            return this.isMoreMenuContext;
        }

        public final TicketsInMoreMenuClicked copy(boolean z10) {
            return new TicketsInMoreMenuClicked(z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TicketsInMoreMenuClicked) && this.isMoreMenuContext == ((TicketsInMoreMenuClicked) obj).isMoreMenuContext;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isMoreMenuContext);
        }

        public final boolean isMoreMenuContext() {
            return this.isMoreMenuContext;
        }

        public String toString() {
            return "TicketsInMoreMenuClicked(isMoreMenuContext=" + this.isMoreMenuContext + ')';
        }
    }

    public /* synthetic */ MetricData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MetricData() {
    }
}
