package io.intercom.android.sdk.models;

import Oc.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0015H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/models/HomeConfig;", "", "header", "Lio/intercom/android/sdk/models/HeaderConfig;", "openConfig", "Lio/intercom/android/sdk/models/OpenConfig;", "<init>", "(Lio/intercom/android/sdk/models/HeaderConfig;Lio/intercom/android/sdk/models/OpenConfig;)V", "getHeader", "()Lio/intercom/android/sdk/models/HeaderConfig;", "getOpenConfig", "()Lio/intercom/android/sdk/models/OpenConfig;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HomeConfig {
    public static final int $stable = 8;
    @c("header")
    private final HeaderConfig header;
    @c("open_config")
    private final OpenConfig openConfig;

    public HomeConfig() {
        this((HeaderConfig) null, (OpenConfig) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ HomeConfig copy$default(HomeConfig homeConfig, HeaderConfig headerConfig, OpenConfig openConfig2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            headerConfig = homeConfig.header;
        }
        if ((i10 & 2) != 0) {
            openConfig2 = homeConfig.openConfig;
        }
        return homeConfig.copy(headerConfig, openConfig2);
    }

    public final HeaderConfig component1() {
        return this.header;
    }

    public final OpenConfig component2() {
        return this.openConfig;
    }

    public final HomeConfig copy(HeaderConfig headerConfig, OpenConfig openConfig2) {
        C6496s.h(headerConfig, "header");
        C6496s.h(openConfig2, "openConfig");
        return new HomeConfig(headerConfig, openConfig2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeConfig)) {
            return false;
        }
        HomeConfig homeConfig = (HomeConfig) obj;
        return C6496s.c(this.header, homeConfig.header) && C6496s.c(this.openConfig, homeConfig.openConfig);
    }

    public final HeaderConfig getHeader() {
        return this.header;
    }

    public final OpenConfig getOpenConfig() {
        return this.openConfig;
    }

    public int hashCode() {
        return (this.header.hashCode() * 31) + this.openConfig.hashCode();
    }

    public String toString() {
        return "HomeConfig(header=" + this.header + ", openConfig=" + this.openConfig + ')';
    }

    public HomeConfig(HeaderConfig headerConfig, OpenConfig openConfig2) {
        C6496s.h(headerConfig, "header");
        C6496s.h(openConfig2, "openConfig");
        this.header = headerConfig;
        this.openConfig = openConfig2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HomeConfig(HeaderConfig headerConfig, OpenConfig openConfig2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new HeaderConfig((HeaderBackgroundModel) null, (HeaderContentModel) null, false, 7, (DefaultConstructorMarker) null) : headerConfig, (i10 & 2) != 0 ? new OpenConfig((OpenToSpace) null, (List) null, (OpenForm) null, 7, (DefaultConstructorMarker) null) : openConfig2);
    }
}
