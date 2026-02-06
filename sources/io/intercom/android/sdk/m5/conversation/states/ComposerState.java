package io.intercom.android.sdk.m5.conversation.states;

import com.amazon.a.a.o.b;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.ReactionReply;
import io.intercom.android.sdk.ui.common.StringProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ComposerState;", "", "TextInput", "VoiceInput", "ConversationEnded", "Reactions", "Hidden", "Lio/intercom/android/sdk/m5/conversation/states/ComposerState$ConversationEnded;", "Lio/intercom/android/sdk/m5/conversation/states/ComposerState$Hidden;", "Lio/intercom/android/sdk/m5/conversation/states/ComposerState$Reactions;", "Lio/intercom/android/sdk/m5/conversation/states/ComposerState$TextInput;", "Lio/intercom/android/sdk/m5/conversation/states/ComposerState$VoiceInput;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ComposerState {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH×\u0003J\t\u0010\r\u001a\u00020\u000eH×\u0001J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ComposerState$Hidden;", "Lio/intercom/android/sdk/m5/conversation/states/ComposerState;", "hideKeyboard", "", "<init>", "(Z)V", "getHideKeyboard", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Hidden implements ComposerState {
        public static final int $stable = 0;
        private final boolean hideKeyboard;

        public Hidden() {
            this(false, 1, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Hidden copy$default(Hidden hidden, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = hidden.hideKeyboard;
            }
            return hidden.copy(z10);
        }

        public final boolean component1() {
            return this.hideKeyboard;
        }

        public final Hidden copy(boolean z10) {
            return new Hidden(z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Hidden) && this.hideKeyboard == ((Hidden) obj).hideKeyboard;
        }

        public final boolean getHideKeyboard() {
            return this.hideKeyboard;
        }

        public int hashCode() {
            return Boolean.hashCode(this.hideKeyboard);
        }

        public String toString() {
            return "Hidden(hideKeyboard=" + this.hideKeyboard + ')';
        }

        public Hidden(boolean z10) {
            this.hideKeyboard = z10;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Hidden(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? true : z10);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ComposerState$Reactions;", "Lio/intercom/android/sdk/m5/conversation/states/ComposerState;", "reactionReply", "Lio/intercom/android/sdk/models/ReactionReply;", "lastPartId", "", "conversationId", "<init>", "(Lio/intercom/android/sdk/models/ReactionReply;Ljava/lang/String;Ljava/lang/String;)V", "getReactionReply", "()Lio/intercom/android/sdk/models/ReactionReply;", "getLastPartId", "()Ljava/lang/String;", "getConversationId", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Reactions implements ComposerState {
        public static final int $stable = 8;
        private final String conversationId;
        private final String lastPartId;
        private final ReactionReply reactionReply;

        public Reactions(ReactionReply reactionReply2, String str, String str2) {
            C6496s.h(reactionReply2, "reactionReply");
            C6496s.h(str, "lastPartId");
            C6496s.h(str2, "conversationId");
            this.reactionReply = reactionReply2;
            this.lastPartId = str;
            this.conversationId = str2;
        }

        public static /* synthetic */ Reactions copy$default(Reactions reactions, ReactionReply reactionReply2, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                reactionReply2 = reactions.reactionReply;
            }
            if ((i10 & 2) != 0) {
                str = reactions.lastPartId;
            }
            if ((i10 & 4) != 0) {
                str2 = reactions.conversationId;
            }
            return reactions.copy(reactionReply2, str, str2);
        }

        public final ReactionReply component1() {
            return this.reactionReply;
        }

        public final String component2() {
            return this.lastPartId;
        }

        public final String component3() {
            return this.conversationId;
        }

        public final Reactions copy(ReactionReply reactionReply2, String str, String str2) {
            C6496s.h(reactionReply2, "reactionReply");
            C6496s.h(str, "lastPartId");
            C6496s.h(str2, "conversationId");
            return new Reactions(reactionReply2, str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Reactions)) {
                return false;
            }
            Reactions reactions = (Reactions) obj;
            return C6496s.c(this.reactionReply, reactions.reactionReply) && C6496s.c(this.lastPartId, reactions.lastPartId) && C6496s.c(this.conversationId, reactions.conversationId);
        }

        public final String getConversationId() {
            return this.conversationId;
        }

        public final String getLastPartId() {
            return this.lastPartId;
        }

        public final ReactionReply getReactionReply() {
            return this.reactionReply;
        }

        public int hashCode() {
            return (((this.reactionReply.hashCode() * 31) + this.lastPartId.hashCode()) * 31) + this.conversationId.hashCode();
        }

        public String toString() {
            return "Reactions(reactionReply=" + this.reactionReply + ", lastPartId=" + this.lastPartId + ", conversationId=" + this.conversationId + ')';
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ComposerState$VoiceInput;", "Lio/intercom/android/sdk/m5/conversation/states/ComposerState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class VoiceInput implements ComposerState {
        public static final int $stable = 0;
        public static final VoiceInput INSTANCE = new VoiceInput();

        private VoiceInput() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof VoiceInput);
        }

        public int hashCode() {
            return 346618184;
        }

        public String toString() {
            return "VoiceInput";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0016H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ComposerState$ConversationEnded;", "Lio/intercom/android/sdk/m5/conversation/states/ComposerState;", "message", "Lio/intercom/android/sdk/ui/common/StringProvider;", "cta", "Lio/intercom/android/sdk/m5/conversation/states/ComposerState$ConversationEnded$ConversationEndedCta;", "<init>", "(Lio/intercom/android/sdk/ui/common/StringProvider;Lio/intercom/android/sdk/m5/conversation/states/ComposerState$ConversationEnded$ConversationEndedCta;)V", "getMessage", "()Lio/intercom/android/sdk/ui/common/StringProvider;", "getCta", "()Lio/intercom/android/sdk/m5/conversation/states/ComposerState$ConversationEnded$ConversationEndedCta;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConversationEndedCta", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ConversationEnded implements ComposerState {
        public static final int $stable = StringProvider.$stable;
        private final ConversationEndedCta cta;
        private final StringProvider message;

        public ConversationEnded(StringProvider stringProvider, ConversationEndedCta conversationEndedCta) {
            C6496s.h(stringProvider, MetricTracker.Object.MESSAGE);
            this.message = stringProvider;
            this.cta = conversationEndedCta;
        }

        public static /* synthetic */ ConversationEnded copy$default(ConversationEnded conversationEnded, StringProvider stringProvider, ConversationEndedCta conversationEndedCta, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                stringProvider = conversationEnded.message;
            }
            if ((i10 & 2) != 0) {
                conversationEndedCta = conversationEnded.cta;
            }
            return conversationEnded.copy(stringProvider, conversationEndedCta);
        }

        public final StringProvider component1() {
            return this.message;
        }

        public final ConversationEndedCta component2() {
            return this.cta;
        }

        public final ConversationEnded copy(StringProvider stringProvider, ConversationEndedCta conversationEndedCta) {
            C6496s.h(stringProvider, MetricTracker.Object.MESSAGE);
            return new ConversationEnded(stringProvider, conversationEndedCta);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConversationEnded)) {
                return false;
            }
            ConversationEnded conversationEnded = (ConversationEnded) obj;
            return C6496s.c(this.message, conversationEnded.message) && C6496s.c(this.cta, conversationEnded.cta);
        }

        public final ConversationEndedCta getCta() {
            return this.cta;
        }

        public final StringProvider getMessage() {
            return this.message;
        }

        public int hashCode() {
            int hashCode = this.message.hashCode() * 31;
            ConversationEndedCta conversationEndedCta = this.cta;
            return hashCode + (conversationEndedCta == null ? 0 : conversationEndedCta.hashCode());
        }

        public String toString() {
            return "ConversationEnded(message=" + this.message + ", cta=" + this.cta + ')';
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0017\u001a\u00020\u0005H×\u0001J\t\u0010\u0018\u001a\u00020\u0007H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ComposerState$ConversationEnded$ConversationEndedCta;", "", "title", "Lio/intercom/android/sdk/ui/common/StringProvider;", "trailingIcon", "", "linkedConversationId", "", "<init>", "(Lio/intercom/android/sdk/ui/common/StringProvider;ILjava/lang/String;)V", "getTitle", "()Lio/intercom/android/sdk/ui/common/StringProvider;", "getTrailingIcon", "()I", "getLinkedConversationId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ConversationEndedCta {
            public static final int $stable = StringProvider.$stable;
            private final String linkedConversationId;
            private final StringProvider title;
            private final int trailingIcon;

            public ConversationEndedCta(StringProvider stringProvider, int i10, String str) {
                C6496s.h(stringProvider, b.f37461S);
                this.title = stringProvider;
                this.trailingIcon = i10;
                this.linkedConversationId = str;
            }

            public static /* synthetic */ ConversationEndedCta copy$default(ConversationEndedCta conversationEndedCta, StringProvider stringProvider, int i10, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    stringProvider = conversationEndedCta.title;
                }
                if ((i11 & 2) != 0) {
                    i10 = conversationEndedCta.trailingIcon;
                }
                if ((i11 & 4) != 0) {
                    str = conversationEndedCta.linkedConversationId;
                }
                return conversationEndedCta.copy(stringProvider, i10, str);
            }

            public final StringProvider component1() {
                return this.title;
            }

            public final int component2() {
                return this.trailingIcon;
            }

            public final String component3() {
                return this.linkedConversationId;
            }

            public final ConversationEndedCta copy(StringProvider stringProvider, int i10, String str) {
                C6496s.h(stringProvider, b.f37461S);
                return new ConversationEndedCta(stringProvider, i10, str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ConversationEndedCta)) {
                    return false;
                }
                ConversationEndedCta conversationEndedCta = (ConversationEndedCta) obj;
                return C6496s.c(this.title, conversationEndedCta.title) && this.trailingIcon == conversationEndedCta.trailingIcon && C6496s.c(this.linkedConversationId, conversationEndedCta.linkedConversationId);
            }

            public final String getLinkedConversationId() {
                return this.linkedConversationId;
            }

            public final StringProvider getTitle() {
                return this.title;
            }

            public final int getTrailingIcon() {
                return this.trailingIcon;
            }

            public int hashCode() {
                int hashCode = ((this.title.hashCode() * 31) + Integer.hashCode(this.trailingIcon)) * 31;
                String str = this.linkedConversationId;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "ConversationEndedCta(title=" + this.title + ", trailingIcon=" + this.trailingIcon + ", linkedConversationId=" + this.linkedConversationId + ')';
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ ConversationEndedCta(StringProvider stringProvider, int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(stringProvider, i10, (i11 & 4) != 0 ? null : str);
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ConversationEnded(StringProvider stringProvider, ConversationEndedCta conversationEndedCta, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringProvider, (i10 & 2) != 0 ? null : conversationEndedCta);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ComposerState$TextInput;", "Lio/intercom/android/sdk/m5/conversation/states/ComposerState;", "initialMessage", "", "hintText", "Lio/intercom/android/sdk/ui/common/StringProvider;", "isDisabled", "", "<init>", "(Ljava/lang/String;Lio/intercom/android/sdk/ui/common/StringProvider;Z)V", "getInitialMessage", "()Ljava/lang/String;", "getHintText", "()Lio/intercom/android/sdk/ui/common/StringProvider;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TextInput implements ComposerState {
        public static final int $stable = StringProvider.$stable;
        private final StringProvider hintText;
        private final String initialMessage;
        private final boolean isDisabled;

        public TextInput(String str, StringProvider stringProvider, boolean z10) {
            C6496s.h(str, "initialMessage");
            C6496s.h(stringProvider, "hintText");
            this.initialMessage = str;
            this.hintText = stringProvider;
            this.isDisabled = z10;
        }

        public static /* synthetic */ TextInput copy$default(TextInput textInput, String str, StringProvider stringProvider, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = textInput.initialMessage;
            }
            if ((i10 & 2) != 0) {
                stringProvider = textInput.hintText;
            }
            if ((i10 & 4) != 0) {
                z10 = textInput.isDisabled;
            }
            return textInput.copy(str, stringProvider, z10);
        }

        public final String component1() {
            return this.initialMessage;
        }

        public final StringProvider component2() {
            return this.hintText;
        }

        public final boolean component3() {
            return this.isDisabled;
        }

        public final TextInput copy(String str, StringProvider stringProvider, boolean z10) {
            C6496s.h(str, "initialMessage");
            C6496s.h(stringProvider, "hintText");
            return new TextInput(str, stringProvider, z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextInput)) {
                return false;
            }
            TextInput textInput = (TextInput) obj;
            return C6496s.c(this.initialMessage, textInput.initialMessage) && C6496s.c(this.hintText, textInput.hintText) && this.isDisabled == textInput.isDisabled;
        }

        public final StringProvider getHintText() {
            return this.hintText;
        }

        public final String getInitialMessage() {
            return this.initialMessage;
        }

        public int hashCode() {
            return (((this.initialMessage.hashCode() * 31) + this.hintText.hashCode()) * 31) + Boolean.hashCode(this.isDisabled);
        }

        public final boolean isDisabled() {
            return this.isDisabled;
        }

        public String toString() {
            return "TextInput(initialMessage=" + this.initialMessage + ", hintText=" + this.hintText + ", isDisabled=" + this.isDisabled + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ TextInput(String str, StringProvider stringProvider, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, stringProvider, (i10 & 4) != 0 ? false : z10);
        }
    }
}
