package io.intercom.android.sdk.models;

import Oc.c;
import io.intercom.android.sdk.models.Space;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\u0019H×\u0001J\t\u0010\u001a\u001a\u00020\u001bH×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lio/intercom/android/sdk/models/OpenConfig;", "", "openTo", "Lio/intercom/android/sdk/models/OpenToSpace;", "spaces", "", "Lio/intercom/android/sdk/models/Space;", "form", "Lio/intercom/android/sdk/models/OpenForm;", "<init>", "(Lio/intercom/android/sdk/models/OpenToSpace;Ljava/util/List;Lio/intercom/android/sdk/models/OpenForm;)V", "getOpenTo", "()Lio/intercom/android/sdk/models/OpenToSpace;", "getSpaces", "()Ljava/util/List;", "getForm", "()Lio/intercom/android/sdk/models/OpenForm;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OpenConfig {
    public static final int $stable = 8;
    @c("form")
    private final OpenForm form;
    @c("open_to")
    private final OpenToSpace openTo;
    @c("spaces")
    private final List<Space> spaces;

    public OpenConfig() {
        this((OpenToSpace) null, (List) null, (OpenForm) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ OpenConfig copy$default(OpenConfig openConfig, OpenToSpace openToSpace, List<Space> list, OpenForm openForm, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            openToSpace = openConfig.openTo;
        }
        if ((i10 & 2) != 0) {
            list = openConfig.spaces;
        }
        if ((i10 & 4) != 0) {
            openForm = openConfig.form;
        }
        return openConfig.copy(openToSpace, list, openForm);
    }

    public final OpenToSpace component1() {
        return this.openTo;
    }

    public final List<Space> component2() {
        return this.spaces;
    }

    public final OpenForm component3() {
        return this.form;
    }

    public final OpenConfig copy(OpenToSpace openToSpace, List<Space> list, OpenForm openForm) {
        C6496s.h(openToSpace, "openTo");
        C6496s.h(list, "spaces");
        C6496s.h(openForm, "form");
        return new OpenConfig(openToSpace, list, openForm);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenConfig)) {
            return false;
        }
        OpenConfig openConfig = (OpenConfig) obj;
        return this.openTo == openConfig.openTo && C6496s.c(this.spaces, openConfig.spaces) && this.form == openConfig.form;
    }

    public final OpenForm getForm() {
        return this.form;
    }

    public final OpenToSpace getOpenTo() {
        return this.openTo;
    }

    public final List<Space> getSpaces() {
        return this.spaces;
    }

    public int hashCode() {
        return (((this.openTo.hashCode() * 31) + this.spaces.hashCode()) * 31) + this.form.hashCode();
    }

    public String toString() {
        return "OpenConfig(openTo=" + this.openTo + ", spaces=" + this.spaces + ", form=" + this.form + ')';
    }

    public OpenConfig(OpenToSpace openToSpace, List<Space> list, OpenForm openForm) {
        C6496s.h(openToSpace, "openTo");
        C6496s.h(list, "spaces");
        C6496s.h(openForm, "form");
        this.openTo = openToSpace;
        this.spaces = list;
        this.form = openForm;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OpenConfig(OpenToSpace openToSpace, List list, OpenForm openForm, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? OpenToSpace.HOME : openToSpace, (i10 & 2) != 0 ? C6565s.e(new Space((Space.Type) null, (String) null, 3, (DefaultConstructorMarker) null)) : list, (i10 & 4) != 0 ? OpenForm.DEFAULT : openForm);
    }
}
