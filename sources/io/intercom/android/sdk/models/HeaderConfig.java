package io.intercom.android.sdk.models;

import Oc.c;
import com.facebook.react.modules.appstate.AppStateModule;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0019H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/models/HeaderConfig;", "", "background", "Lio/intercom/android/sdk/models/HeaderBackgroundModel;", "content", "Lio/intercom/android/sdk/models/HeaderContentModel;", "headerExpanded", "", "<init>", "(Lio/intercom/android/sdk/models/HeaderBackgroundModel;Lio/intercom/android/sdk/models/HeaderContentModel;Z)V", "getBackground", "()Lio/intercom/android/sdk/models/HeaderBackgroundModel;", "getContent", "()Lio/intercom/android/sdk/models/HeaderContentModel;", "getHeaderExpanded", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HeaderConfig {
    public static final int $stable = 8;
    @c("background")
    private final HeaderBackgroundModel background;
    @c("content")
    private final HeaderContentModel content;
    @c("header_expanded")
    private final boolean headerExpanded;

    public HeaderConfig() {
        this((HeaderBackgroundModel) null, (HeaderContentModel) null, false, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ HeaderConfig copy$default(HeaderConfig headerConfig, HeaderBackgroundModel headerBackgroundModel, HeaderContentModel headerContentModel, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            headerBackgroundModel = headerConfig.background;
        }
        if ((i10 & 2) != 0) {
            headerContentModel = headerConfig.content;
        }
        if ((i10 & 4) != 0) {
            z10 = headerConfig.headerExpanded;
        }
        return headerConfig.copy(headerBackgroundModel, headerContentModel, z10);
    }

    public final HeaderBackgroundModel component1() {
        return this.background;
    }

    public final HeaderContentModel component2() {
        return this.content;
    }

    public final boolean component3() {
        return this.headerExpanded;
    }

    public final HeaderConfig copy(HeaderBackgroundModel headerBackgroundModel, HeaderContentModel headerContentModel, boolean z10) {
        C6496s.h(headerBackgroundModel, AppStateModule.APP_STATE_BACKGROUND);
        C6496s.h(headerContentModel, "content");
        return new HeaderConfig(headerBackgroundModel, headerContentModel, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderConfig)) {
            return false;
        }
        HeaderConfig headerConfig = (HeaderConfig) obj;
        return C6496s.c(this.background, headerConfig.background) && C6496s.c(this.content, headerConfig.content) && this.headerExpanded == headerConfig.headerExpanded;
    }

    public final HeaderBackgroundModel getBackground() {
        return this.background;
    }

    public final HeaderContentModel getContent() {
        return this.content;
    }

    public final boolean getHeaderExpanded() {
        return this.headerExpanded;
    }

    public int hashCode() {
        return (((this.background.hashCode() * 31) + this.content.hashCode()) * 31) + Boolean.hashCode(this.headerExpanded);
    }

    public String toString() {
        return "HeaderConfig(background=" + this.background + ", content=" + this.content + ", headerExpanded=" + this.headerExpanded + ')';
    }

    public HeaderConfig(HeaderBackgroundModel headerBackgroundModel, HeaderContentModel headerContentModel, boolean z10) {
        C6496s.h(headerBackgroundModel, AppStateModule.APP_STATE_BACKGROUND);
        C6496s.h(headerContentModel, "content");
        this.background = headerBackgroundModel;
        this.content = headerContentModel;
        this.headerExpanded = z10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HeaderConfig(HeaderBackgroundModel headerBackgroundModel, HeaderContentModel headerContentModel, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new HeaderBackgroundModel((String) null, (List) null, (String) null, false, (HeaderBackdropType) null, false, 63, (DefaultConstructorMarker) null) : headerBackgroundModel, (i10 & 2) != 0 ? new HeaderContentModel((String) null, false, (HeaderTextModel) null, (HeaderTextModel) null, (CloseButtonModel) null, 31, (DefaultConstructorMarker) null) : headerContentModel, (i10 & 4) != 0 ? true : z10);
    }
}
