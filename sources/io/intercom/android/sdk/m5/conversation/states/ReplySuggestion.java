package io.intercom.android.sdk.m5.conversation.states;

import io.intercom.android.sdk.models.AttributeType;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ReplySuggestion;", "", "id", "", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReplySuggestion {
    public static final int $stable = 0;

    /* renamed from: id  reason: collision with root package name */
    private final String f68925id;
    private final String text;

    public ReplySuggestion(String str, String str2) {
        C6496s.h(str, "id");
        C6496s.h(str2, AttributeType.TEXT);
        this.f68925id = str;
        this.text = str2;
    }

    public static /* synthetic */ ReplySuggestion copy$default(ReplySuggestion replySuggestion, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = replySuggestion.f68925id;
        }
        if ((i10 & 2) != 0) {
            str2 = replySuggestion.text;
        }
        return replySuggestion.copy(str, str2);
    }

    public final String component1() {
        return this.f68925id;
    }

    public final String component2() {
        return this.text;
    }

    public final ReplySuggestion copy(String str, String str2) {
        C6496s.h(str, "id");
        C6496s.h(str2, AttributeType.TEXT);
        return new ReplySuggestion(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReplySuggestion)) {
            return false;
        }
        ReplySuggestion replySuggestion = (ReplySuggestion) obj;
        return C6496s.c(this.f68925id, replySuggestion.f68925id) && C6496s.c(this.text, replySuggestion.text);
    }

    public final String getId() {
        return this.f68925id;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (this.f68925id.hashCode() * 31) + this.text.hashCode();
    }

    public String toString() {
        return "ReplySuggestion(id=" + this.f68925id + ", text=" + this.text + ')';
    }
}
