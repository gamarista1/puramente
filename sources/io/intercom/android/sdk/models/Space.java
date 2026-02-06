package io.intercom.android.sdk.models;

import Oc.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sf.C6714a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0005H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/models/Space;", "", "type", "Lio/intercom/android/sdk/models/Space$Type;", "label", "", "<init>", "(Lio/intercom/android/sdk/models/Space$Type;Ljava/lang/String;)V", "getType", "()Lio/intercom/android/sdk/models/Space$Type;", "getLabel", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Type", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Space {
    public static final int $stable = 0;
    @c("label")
    private final String label;
    @c("type")
    private final Type type;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/models/Space$Type;", "", "<init>", "(Ljava/lang/String;I)V", "HOME", "MESSAGES", "HELP", "TICKETS", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum Type {
        HOME,
        MESSAGES,
        HELP,
        TICKETS;

        static {
            Type[] $values;
            $ENTRIES = C6714a.a($values);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }
    }

    public Space() {
        this((Type) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Space copy$default(Space space, Type type2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            type2 = space.type;
        }
        if ((i10 & 2) != 0) {
            str = space.label;
        }
        return space.copy(type2, str);
    }

    public final Type component1() {
        return this.type;
    }

    public final String component2() {
        return this.label;
    }

    public final Space copy(Type type2, String str) {
        C6496s.h(type2, "type");
        return new Space(type2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Space)) {
            return false;
        }
        Space space = (Space) obj;
        return this.type == space.type && C6496s.c(this.label, space.label);
    }

    public final String getLabel() {
        return this.label;
    }

    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.label;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "Space(type=" + this.type + ", label=" + this.label + ')';
    }

    public Space(Type type2, String str) {
        C6496s.h(type2, "type");
        this.type = type2;
        this.label = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Space(Type type2, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Type.HOME : type2, (i10 & 2) != 0 ? null : str);
    }
}
