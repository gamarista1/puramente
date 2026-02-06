package io.intercom.android.sdk.blocks.lib.models;

import Oc.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0017\u001a\u00020\u0018H×\u0001J\t\u0010\u0019\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/blocks/lib/models/ListOption;", "", "label", "", "archived", "", "id", "description", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getArchived", "()Z", "getId", "getDescription", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ListOption {
    public static final int $stable = 0;
    @c("archived")
    private final boolean archived;
    @c("description")
    private final String description;
    @c("id")

    /* renamed from: id  reason: collision with root package name */
    private final String f68546id;
    @c("label")
    private final String label;

    public ListOption(String str, boolean z10, String str2, String str3) {
        C6496s.h(str, "label");
        C6496s.h(str2, "id");
        this.label = str;
        this.archived = z10;
        this.f68546id = str2;
        this.description = str3;
    }

    public static /* synthetic */ ListOption copy$default(ListOption listOption, String str, boolean z10, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = listOption.label;
        }
        if ((i10 & 2) != 0) {
            z10 = listOption.archived;
        }
        if ((i10 & 4) != 0) {
            str2 = listOption.f68546id;
        }
        if ((i10 & 8) != 0) {
            str3 = listOption.description;
        }
        return listOption.copy(str, z10, str2, str3);
    }

    public final String component1() {
        return this.label;
    }

    public final boolean component2() {
        return this.archived;
    }

    public final String component3() {
        return this.f68546id;
    }

    public final String component4() {
        return this.description;
    }

    public final ListOption copy(String str, boolean z10, String str2, String str3) {
        C6496s.h(str, "label");
        C6496s.h(str2, "id");
        return new ListOption(str, z10, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListOption)) {
            return false;
        }
        ListOption listOption = (ListOption) obj;
        return C6496s.c(this.label, listOption.label) && this.archived == listOption.archived && C6496s.c(this.f68546id, listOption.f68546id) && C6496s.c(this.description, listOption.description);
    }

    public final boolean getArchived() {
        return this.archived;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.f68546id;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        int hashCode = ((((this.label.hashCode() * 31) + Boolean.hashCode(this.archived)) * 31) + this.f68546id.hashCode()) * 31;
        String str = this.description;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ListOption(label=" + this.label + ", archived=" + this.archived + ", id=" + this.f68546id + ", description=" + this.description + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListOption(String str, boolean z10, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z10, str2, (i10 & 8) != 0 ? null : str3);
    }
}
