package io.intercom.android.sdk.models;

import Oc.c;
import com.amazon.a.a.o.b;
import io.intercom.android.sdk.m5.home.data.IconType;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u0000 \u00192\u00020\u0001:\u0002\u0018\u0019B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/models/EmptyState;", "", "title", "", "text", "action", "Lio/intercom/android/sdk/models/EmptyState$Action;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/models/EmptyState$Action;)V", "getTitle", "()Ljava/lang/String;", "getText", "getAction", "()Lio/intercom/android/sdk/models/EmptyState$Action;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Action", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EmptyState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final EmptyState NULL = new EmptyState((String) null, (String) null, (Action) null, 7, (DefaultConstructorMarker) null);
    @c("action")
    private final Action action;
    @c("text")
    private final String text;
    @c("title")
    private final String title;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0017\u001a\u00020\u0018H×\u0001J\t\u0010\u0019\u001a\u00020\u0005H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/models/EmptyState$Action;", "", "type", "Lio/intercom/android/sdk/models/ActionType;", "label", "", "icon", "Lio/intercom/android/sdk/m5/home/data/IconType;", "<init>", "(Lio/intercom/android/sdk/models/ActionType;Ljava/lang/String;Lio/intercom/android/sdk/m5/home/data/IconType;)V", "getType", "()Lio/intercom/android/sdk/models/ActionType;", "getLabel", "()Ljava/lang/String;", "getIcon", "()Lio/intercom/android/sdk/m5/home/data/IconType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Action {
        public static final int $stable = 0;
        @c("icon")
        private final IconType icon;
        @c("label")
        private final String label;
        @c("type")
        private final ActionType type;

        public Action() {
            this((ActionType) null, (String) null, (IconType) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Action copy$default(Action action, ActionType actionType, String str, IconType iconType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                actionType = action.type;
            }
            if ((i10 & 2) != 0) {
                str = action.label;
            }
            if ((i10 & 4) != 0) {
                iconType = action.icon;
            }
            return action.copy(actionType, str, iconType);
        }

        public final ActionType component1() {
            return this.type;
        }

        public final String component2() {
            return this.label;
        }

        public final IconType component3() {
            return this.icon;
        }

        public final Action copy(ActionType actionType, String str, IconType iconType) {
            C6496s.h(actionType, "type");
            C6496s.h(str, "label");
            return new Action(actionType, str, iconType);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return this.type == action.type && C6496s.c(this.label, action.label) && this.icon == action.icon;
        }

        public final IconType getIcon() {
            return this.icon;
        }

        public final String getLabel() {
            return this.label;
        }

        public final ActionType getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode = ((this.type.hashCode() * 31) + this.label.hashCode()) * 31;
            IconType iconType = this.icon;
            return hashCode + (iconType == null ? 0 : iconType.hashCode());
        }

        public String toString() {
            return "Action(type=" + this.type + ", label=" + this.label + ", icon=" + this.icon + ')';
        }

        public Action(ActionType actionType, String str, IconType iconType) {
            C6496s.h(actionType, "type");
            C6496s.h(str, "label");
            this.type = actionType;
            this.label = str;
            this.icon = iconType;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Action(ActionType actionType, String str, IconType iconType, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? ActionType.MESSAGE : actionType, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? null : iconType);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/models/EmptyState$Companion;", "", "<init>", "()V", "NULL", "Lio/intercom/android/sdk/models/EmptyState;", "getNULL", "()Lio/intercom/android/sdk/models/EmptyState;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EmptyState getNULL() {
            return EmptyState.NULL;
        }

        private Companion() {
        }
    }

    public EmptyState() {
        this((String) null, (String) null, (Action) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ EmptyState copy$default(EmptyState emptyState, String str, String str2, Action action2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = emptyState.title;
        }
        if ((i10 & 2) != 0) {
            str2 = emptyState.text;
        }
        if ((i10 & 4) != 0) {
            action2 = emptyState.action;
        }
        return emptyState.copy(str, str2, action2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.text;
    }

    public final Action component3() {
        return this.action;
    }

    public final EmptyState copy(String str, String str2, Action action2) {
        C6496s.h(str, b.f37461S);
        C6496s.h(str2, AttributeType.TEXT);
        C6496s.h(action2, "action");
        return new EmptyState(str, str2, action2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmptyState)) {
            return false;
        }
        EmptyState emptyState = (EmptyState) obj;
        return C6496s.c(this.title, emptyState.title) && C6496s.c(this.text, emptyState.text) && C6496s.c(this.action, emptyState.action);
    }

    public final Action getAction() {
        return this.action;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.text.hashCode()) * 31) + this.action.hashCode();
    }

    public String toString() {
        return "EmptyState(title=" + this.title + ", text=" + this.text + ", action=" + this.action + ')';
    }

    public EmptyState(String str, String str2, Action action2) {
        C6496s.h(str, b.f37461S);
        C6496s.h(str2, AttributeType.TEXT);
        C6496s.h(action2, "action");
        this.title = str;
        this.text = str2;
        this.action = action2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EmptyState(String str, String str2, Action action2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? new Action((ActionType) null, (String) null, (IconType) null, 7, (DefaultConstructorMarker) null) : action2);
    }
}
