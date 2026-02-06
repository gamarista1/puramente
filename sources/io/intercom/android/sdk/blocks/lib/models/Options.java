package io.intercom.android.sdk.blocks.lib.models;

import Oc.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0017\u001a\u00020\u0018H×\u0001J\t\u0010\u0019\u001a\u00020\bH×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/blocks/lib/models/Options;", "", "multiline", "", "listOptions", "", "Lio/intercom/android/sdk/blocks/lib/models/ListOption;", "accept", "", "<init>", "(ZLjava/util/List;Ljava/lang/String;)V", "getMultiline", "()Z", "getListOptions", "()Ljava/util/List;", "getAccept", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Options {
    public static final int $stable = 8;
    @c("accept")
    private final String accept;
    @c("list_options")
    private final List<ListOption> listOptions;
    @c("multiline")
    private final boolean multiline;

    public Options() {
        this(false, (List) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Options copy$default(Options options, boolean z10, List<ListOption> list, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = options.multiline;
        }
        if ((i10 & 2) != 0) {
            list = options.listOptions;
        }
        if ((i10 & 4) != 0) {
            str = options.accept;
        }
        return options.copy(z10, list, str);
    }

    public final boolean component1() {
        return this.multiline;
    }

    public final List<ListOption> component2() {
        return this.listOptions;
    }

    public final String component3() {
        return this.accept;
    }

    public final Options copy(boolean z10, List<ListOption> list, String str) {
        C6496s.h(list, "listOptions");
        C6496s.h(str, "accept");
        return new Options(z10, list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Options)) {
            return false;
        }
        Options options = (Options) obj;
        return this.multiline == options.multiline && C6496s.c(this.listOptions, options.listOptions) && C6496s.c(this.accept, options.accept);
    }

    public final String getAccept() {
        return this.accept;
    }

    public final List<ListOption> getListOptions() {
        return this.listOptions;
    }

    public final boolean getMultiline() {
        return this.multiline;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.multiline) * 31) + this.listOptions.hashCode()) * 31) + this.accept.hashCode();
    }

    public String toString() {
        return "Options(multiline=" + this.multiline + ", listOptions=" + this.listOptions + ", accept=" + this.accept + ')';
    }

    public Options(boolean z10, List<ListOption> list, String str) {
        C6496s.h(list, "listOptions");
        C6496s.h(str, "accept");
        this.multiline = z10;
        this.listOptions = list;
        this.accept = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Options(boolean z10, List list, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? C6565s.n() : list, (i10 & 4) != 0 ? "" : str);
    }
}
