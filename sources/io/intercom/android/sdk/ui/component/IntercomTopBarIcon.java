package io.intercom.android.sdk.ui.component;

import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import yf.C6787a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0013\u0010\u000eJ\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010¨\u0006\u001f"}, d2 = {"Lio/intercom/android/sdk/ui/component/IntercomTopBarIcon;", "", "", "iconRes", "", "contentDescription", "Lkotlin/Function0;", "Llf/M;", "onClick", "<init>", "(ILjava/lang/String;Lyf/a;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Lyf/a;", "copy", "(ILjava/lang/String;Lyf/a;)Lio/intercom/android/sdk/ui/component/IntercomTopBarIcon;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getIconRes", "Ljava/lang/String;", "getContentDescription", "Lyf/a;", "getOnClick", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntercomTopBarIcon {
    public static final int $stable = 0;
    private final String contentDescription;
    private final int iconRes;
    private final C6787a onClick;

    public IntercomTopBarIcon(int i10, String str, C6787a aVar) {
        C6496s.h(aVar, "onClick");
        this.iconRes = i10;
        this.contentDescription = str;
        this.onClick = aVar;
    }

    public static /* synthetic */ IntercomTopBarIcon copy$default(IntercomTopBarIcon intercomTopBarIcon, int i10, String str, C6787a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = intercomTopBarIcon.iconRes;
        }
        if ((i11 & 2) != 0) {
            str = intercomTopBarIcon.contentDescription;
        }
        if ((i11 & 4) != 0) {
            aVar = intercomTopBarIcon.onClick;
        }
        return intercomTopBarIcon.copy(i10, str, aVar);
    }

    public final int component1() {
        return this.iconRes;
    }

    public final String component2() {
        return this.contentDescription;
    }

    public final C6787a component3() {
        return this.onClick;
    }

    public final IntercomTopBarIcon copy(int i10, String str, C6787a aVar) {
        C6496s.h(aVar, "onClick");
        return new IntercomTopBarIcon(i10, str, aVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntercomTopBarIcon)) {
            return false;
        }
        IntercomTopBarIcon intercomTopBarIcon = (IntercomTopBarIcon) obj;
        return this.iconRes == intercomTopBarIcon.iconRes && C6496s.c(this.contentDescription, intercomTopBarIcon.contentDescription) && C6496s.c(this.onClick, intercomTopBarIcon.onClick);
    }

    public final String getContentDescription() {
        return this.contentDescription;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final C6787a getOnClick() {
        return this.onClick;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.iconRes) * 31;
        String str = this.contentDescription;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.onClick.hashCode();
    }

    public String toString() {
        return "IntercomTopBarIcon(iconRes=" + this.iconRes + ", contentDescription=" + this.contentDescription + ", onClick=" + this.onClick + ')';
    }
}
