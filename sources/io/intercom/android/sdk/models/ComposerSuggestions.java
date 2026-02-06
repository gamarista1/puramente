package io.intercom.android.sdk.models;

import Oc.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u001cB-\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000fJ4\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÇ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\u0019H×\u0001J\t\u0010\u001a\u001a\u00020\u001bH×\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\rR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lio/intercom/android/sdk/models/ComposerSuggestions;", "", "suggestions", "", "Lio/intercom/android/sdk/models/ComposerSuggestions$Suggestion;", "isComposerDisabled", "", "snapshotId", "", "<init>", "(Ljava/util/List;ZLjava/lang/Long;)V", "getSuggestions", "()Ljava/util/List;", "()Z", "getSnapshotId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(Ljava/util/List;ZLjava/lang/Long;)Lio/intercom/android/sdk/models/ComposerSuggestions;", "equals", "other", "hashCode", "", "toString", "", "Suggestion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ComposerSuggestions {
    public static final int $stable = 8;
    @c("composer_disabled")
    private final boolean isComposerDisabled;
    @c("snapshot_id")
    private final Long snapshotId;
    @c("suggestions")
    private final List<Suggestion> suggestions;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lio/intercom/android/sdk/models/ComposerSuggestions$Suggestion;", "", "text", "", "uuid", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getUuid", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Suggestion {
        public static final int $stable = 0;
        @c("text")
        private final String text;
        @c("uuid")
        private final String uuid;

        public Suggestion() {
            this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Suggestion copy$default(Suggestion suggestion, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = suggestion.text;
            }
            if ((i10 & 2) != 0) {
                str2 = suggestion.uuid;
            }
            return suggestion.copy(str, str2);
        }

        public final String component1() {
            return this.text;
        }

        public final String component2() {
            return this.uuid;
        }

        public final Suggestion copy(String str, String str2) {
            C6496s.h(str, AttributeType.TEXT);
            C6496s.h(str2, "uuid");
            return new Suggestion(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Suggestion)) {
                return false;
            }
            Suggestion suggestion = (Suggestion) obj;
            return C6496s.c(this.text, suggestion.text) && C6496s.c(this.uuid, suggestion.uuid);
        }

        public final String getText() {
            return this.text;
        }

        public final String getUuid() {
            return this.uuid;
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + this.uuid.hashCode();
        }

        public String toString() {
            return "Suggestion(text=" + this.text + ", uuid=" + this.uuid + ')';
        }

        public Suggestion(String str, String str2) {
            C6496s.h(str, AttributeType.TEXT);
            C6496s.h(str2, "uuid");
            this.text = str;
            this.uuid = str2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Suggestion(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2);
        }
    }

    public ComposerSuggestions() {
        this((List) null, false, (Long) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ComposerSuggestions copy$default(ComposerSuggestions composerSuggestions, List<Suggestion> list, boolean z10, Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = composerSuggestions.suggestions;
        }
        if ((i10 & 2) != 0) {
            z10 = composerSuggestions.isComposerDisabled;
        }
        if ((i10 & 4) != 0) {
            l10 = composerSuggestions.snapshotId;
        }
        return composerSuggestions.copy(list, z10, l10);
    }

    public final List<Suggestion> component1() {
        return this.suggestions;
    }

    public final boolean component2() {
        return this.isComposerDisabled;
    }

    public final Long component3() {
        return this.snapshotId;
    }

    public final ComposerSuggestions copy(List<Suggestion> list, boolean z10, Long l10) {
        C6496s.h(list, "suggestions");
        return new ComposerSuggestions(list, z10, l10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposerSuggestions)) {
            return false;
        }
        ComposerSuggestions composerSuggestions = (ComposerSuggestions) obj;
        return C6496s.c(this.suggestions, composerSuggestions.suggestions) && this.isComposerDisabled == composerSuggestions.isComposerDisabled && C6496s.c(this.snapshotId, composerSuggestions.snapshotId);
    }

    public final Long getSnapshotId() {
        return this.snapshotId;
    }

    public final List<Suggestion> getSuggestions() {
        return this.suggestions;
    }

    public int hashCode() {
        int hashCode = ((this.suggestions.hashCode() * 31) + Boolean.hashCode(this.isComposerDisabled)) * 31;
        Long l10 = this.snapshotId;
        return hashCode + (l10 == null ? 0 : l10.hashCode());
    }

    public final boolean isComposerDisabled() {
        return this.isComposerDisabled;
    }

    public String toString() {
        return "ComposerSuggestions(suggestions=" + this.suggestions + ", isComposerDisabled=" + this.isComposerDisabled + ", snapshotId=" + this.snapshotId + ')';
    }

    public ComposerSuggestions(List<Suggestion> list, boolean z10, Long l10) {
        C6496s.h(list, "suggestions");
        this.suggestions = list;
        this.isComposerDisabled = z10;
        this.snapshotId = l10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ComposerSuggestions(List list, boolean z10, Long l10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C6565s.n() : list, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? null : l10);
    }
}
