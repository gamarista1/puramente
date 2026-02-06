package io.intercom.android.sdk.models;

import Oc.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lio/intercom/android/sdk/models/ConversationUiFlags;", "", "showLastPartMeta", "", "<init>", "(Ljava/lang/Boolean;)V", "getShowLastPartMeta", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lio/intercom/android/sdk/models/ConversationUiFlags;", "equals", "other", "hashCode", "", "toString", "", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConversationUiFlags {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final ConversationUiFlags DEFAULT = new ConversationUiFlags((Boolean) null, 1, (DefaultConstructorMarker) null);
    @c("show_last_part_meta")
    private final Boolean showLastPartMeta;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/intercom/android/sdk/models/ConversationUiFlags$Companion;", "", "<init>", "()V", "DEFAULT", "Lio/intercom/android/sdk/models/ConversationUiFlags;", "getDEFAULT$annotations", "getDEFAULT", "()Lio/intercom/android/sdk/models/ConversationUiFlags;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getDEFAULT$annotations() {
        }

        public final ConversationUiFlags getDEFAULT() {
            return ConversationUiFlags.DEFAULT;
        }

        private Companion() {
        }
    }

    public ConversationUiFlags() {
        this((Boolean) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ConversationUiFlags copy$default(ConversationUiFlags conversationUiFlags, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = conversationUiFlags.showLastPartMeta;
        }
        return conversationUiFlags.copy(bool);
    }

    public static final ConversationUiFlags getDEFAULT() {
        return Companion.getDEFAULT();
    }

    public final Boolean component1() {
        return this.showLastPartMeta;
    }

    public final ConversationUiFlags copy(Boolean bool) {
        return new ConversationUiFlags(bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConversationUiFlags) && C6496s.c(this.showLastPartMeta, ((ConversationUiFlags) obj).showLastPartMeta);
    }

    public final Boolean getShowLastPartMeta() {
        return this.showLastPartMeta;
    }

    public int hashCode() {
        Boolean bool = this.showLastPartMeta;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        return "ConversationUiFlags(showLastPartMeta=" + this.showLastPartMeta + ')';
    }

    public ConversationUiFlags(Boolean bool) {
        this.showLastPartMeta = bool;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ConversationUiFlags(Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Boolean.TRUE : bool);
    }
}
