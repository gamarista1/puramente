package io.intercom.android.sdk.m5.helpcenter.ui.components;

import Y.C1500m;
import Y.C1510r0;
import Y.M0;
import Y.Y0;
import Y.o1;
import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.ui.platform.C1613a;
import g0.c;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.ConfigurableIntercomThemeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fR/\u0010\u0015\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8F@FX\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R+\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u00168F@FX\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/ui/components/TeamPresenceComponent;", "Landroidx/compose/ui/platform/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Llf/M;", "Content", "(LY/m;I)V", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "<set-?>", "teamPresenceState$delegate", "LY/r0;", "getTeamPresenceState", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "setTeamPresenceState", "(Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;)V", "teamPresenceState", "", "needsChatBubble$delegate", "getNeedsChatBubble", "()Z", "setNeedsChatBubble", "(Z)V", "needsChatBubble", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TeamPresenceComponent extends C1613a {
    public static final int $stable = 0;
    private final C1510r0 needsChatBubble$delegate;
    private final C1510r0 teamPresenceState$delegate;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TeamPresenceComponent(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C6496s.h(context, "context");
    }

    /* access modifiers changed from: private */
    public static final C6514M Content$lambda$1(TeamPresenceComponent teamPresenceComponent, int i10, C1500m mVar, int i11) {
        C6496s.h(teamPresenceComponent, "$tmp1_rcvr");
        teamPresenceComponent.Content(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public void Content(C1500m mVar, int i10) {
        int i11;
        int i12;
        C1500m h10 = mVar.h(-1850798977);
        if ((i10 & 14) == 0) {
            if (h10.S(this)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) != 2 || !h10.i()) {
            ArticleViewState.TeamPresenceState teamPresenceState = getTeamPresenceState();
            if (teamPresenceState != null) {
                AppConfig appConfig = Injector.get().getAppConfigProvider().get();
                C6496s.g(appConfig, "get(...)");
                ConfigurableIntercomThemeKt.ConfigurableIntercomTheme(appConfig, c.e(-1302062926, true, new TeamPresenceComponent$Content$1$1(this, teamPresenceState), h10, 54), h10, 56);
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new E(this, i10));
        }
    }

    public final boolean getNeedsChatBubble() {
        return ((Boolean) this.needsChatBubble$delegate.getValue()).booleanValue();
    }

    public final ArticleViewState.TeamPresenceState getTeamPresenceState() {
        return (ArticleViewState.TeamPresenceState) this.teamPresenceState$delegate.getValue();
    }

    public final void setNeedsChatBubble(boolean z10) {
        this.needsChatBubble$delegate.setValue(Boolean.valueOf(z10));
    }

    public final void setTeamPresenceState(ArticleViewState.TeamPresenceState teamPresenceState) {
        this.teamPresenceState$delegate.setValue(teamPresenceState);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TeamPresenceComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C6496s.h(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TeamPresenceComponent(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TeamPresenceComponent(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        C6496s.h(context, "context");
        this.teamPresenceState$delegate = u1.d((Object) null, (o1) null, 2, (Object) null);
        this.needsChatBubble$delegate = u1.d(Boolean.FALSE, (o1) null, 2, (Object) null);
    }
}
