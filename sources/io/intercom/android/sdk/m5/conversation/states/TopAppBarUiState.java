package io.intercom.android.sdk.m5.conversation.states;

import com.amazon.a.a.o.b;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import r0.C2544x0;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000e\n\u0002\b\u001a\b\b\u0018\u0000 G2\u00020\u0001:\u0001GB\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0\bHÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010(\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b'\u0010%J\u0012\u0010*\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b)\u0010%J\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011HÇ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010/\u001a\u00020.H×\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b1\u00102J\u001a\u00104\u001a\u00020\u000b2\b\u00103\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b9\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b:\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b;\u0010\u001aR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\b=\u0010\u001eR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bA\u0010\"R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\bB\u0010\u001eR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010C\u001a\u0004\bD\u0010%R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010C\u001a\u0004\bE\u0010%R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0014\u0010C\u001a\u0004\bF\u0010%¨\u0006H"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "", "Lio/intercom/android/sdk/ui/common/StringProvider;", "title", "", "navIcon", "subTitle", "subTitleLeadingIcon", "", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "avatars", "", "displayActiveIndicator", "Lio/intercom/android/sdk/m5/conversation/states/TicketProgressRowState;", "ticketStatusState", "Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem;", "headerMenuItems", "Lr0/x0;", "backgroundColor", "contentColor", "subTitleColor", "<init>", "(Lio/intercom/android/sdk/ui/common/StringProvider;Ljava/lang/Integer;Lio/intercom/android/sdk/ui/common/StringProvider;Ljava/lang/Integer;Ljava/util/List;ZLio/intercom/android/sdk/m5/conversation/states/TicketProgressRowState;Ljava/util/List;Lr0/x0;Lr0/x0;Lr0/x0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Lio/intercom/android/sdk/ui/common/StringProvider;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "()Z", "component7", "()Lio/intercom/android/sdk/m5/conversation/states/TicketProgressRowState;", "component8", "component9-QN2ZGVo", "()Lr0/x0;", "component9", "component10-QN2ZGVo", "component10", "component11-QN2ZGVo", "component11", "copy-d8CKnI4", "(Lio/intercom/android/sdk/ui/common/StringProvider;Ljava/lang/Integer;Lio/intercom/android/sdk/ui/common/StringProvider;Ljava/lang/Integer;Ljava/util/List;ZLio/intercom/android/sdk/m5/conversation/states/TicketProgressRowState;Ljava/util/List;Lr0/x0;Lr0/x0;Lr0/x0;)Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "copy", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lio/intercom/android/sdk/ui/common/StringProvider;", "getTitle", "Ljava/lang/Integer;", "getNavIcon", "getSubTitle", "getSubTitleLeadingIcon", "Ljava/util/List;", "getAvatars", "Z", "getDisplayActiveIndicator", "Lio/intercom/android/sdk/m5/conversation/states/TicketProgressRowState;", "getTicketStatusState", "getHeaderMenuItems", "Lr0/x0;", "getBackgroundColor-QN2ZGVo", "getContentColor-QN2ZGVo", "getSubTitleColor-QN2ZGVo", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TopAppBarUiState {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: default  reason: not valid java name */
    public static final TopAppBarUiState f83default = new TopAppBarUiState(new StringProvider.ActualString(""), (Integer) null, (StringProvider) null, (Integer) null, C6565s.n(), false, (TicketProgressRowState) null, C6565s.n(), (C2544x0) null, (C2544x0) null, (C2544x0) null, 1794, (DefaultConstructorMarker) null);
    private final List<AvatarWrapper> avatars;
    private final C2544x0 backgroundColor;
    private final C2544x0 contentColor;
    private final boolean displayActiveIndicator;
    private final List<HeaderMenuItem> headerMenuItems;
    private final Integer navIcon;
    private final StringProvider subTitle;
    private final C2544x0 subTitleColor;
    private final Integer subTitleLeadingIcon;
    private final TicketProgressRowState ticketStatusState;
    private final StringProvider title;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState$Companion;", "", "<init>", "()V", "default", "Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "getDefault", "()Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TopAppBarUiState getDefault() {
            return TopAppBarUiState.f83default;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TopAppBarUiState(StringProvider stringProvider, Integer num, StringProvider stringProvider2, Integer num2, List list, boolean z10, TicketProgressRowState ticketProgressRowState, List list2, C2544x0 x0Var, C2544x0 x0Var2, C2544x0 x0Var3, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringProvider, num, stringProvider2, num2, list, z10, ticketProgressRowState, list2, x0Var, x0Var2, x0Var3);
    }

    /* renamed from: copy-d8CKnI4$default  reason: not valid java name */
    public static /* synthetic */ TopAppBarUiState m216copyd8CKnI4$default(TopAppBarUiState topAppBarUiState, StringProvider stringProvider, Integer num, StringProvider stringProvider2, Integer num2, List list, boolean z10, TicketProgressRowState ticketProgressRowState, List list2, C2544x0 x0Var, C2544x0 x0Var2, C2544x0 x0Var3, int i10, Object obj) {
        StringProvider stringProvider3;
        Integer num3;
        StringProvider stringProvider4;
        Integer num4;
        List list3;
        boolean z11;
        TicketProgressRowState ticketProgressRowState2;
        List list4;
        C2544x0 x0Var4;
        C2544x0 x0Var5;
        C2544x0 x0Var6;
        TopAppBarUiState topAppBarUiState2 = topAppBarUiState;
        int i11 = i10;
        if ((i11 & 1) != 0) {
            stringProvider3 = topAppBarUiState2.title;
        } else {
            stringProvider3 = stringProvider;
        }
        if ((i11 & 2) != 0) {
            num3 = topAppBarUiState2.navIcon;
        } else {
            num3 = num;
        }
        if ((i11 & 4) != 0) {
            stringProvider4 = topAppBarUiState2.subTitle;
        } else {
            stringProvider4 = stringProvider2;
        }
        if ((i11 & 8) != 0) {
            num4 = topAppBarUiState2.subTitleLeadingIcon;
        } else {
            num4 = num2;
        }
        if ((i11 & 16) != 0) {
            list3 = topAppBarUiState2.avatars;
        } else {
            list3 = list;
        }
        if ((i11 & 32) != 0) {
            z11 = topAppBarUiState2.displayActiveIndicator;
        } else {
            z11 = z10;
        }
        if ((i11 & 64) != 0) {
            ticketProgressRowState2 = topAppBarUiState2.ticketStatusState;
        } else {
            ticketProgressRowState2 = ticketProgressRowState;
        }
        if ((i11 & 128) != 0) {
            list4 = topAppBarUiState2.headerMenuItems;
        } else {
            list4 = list2;
        }
        if ((i11 & 256) != 0) {
            x0Var4 = topAppBarUiState2.backgroundColor;
        } else {
            x0Var4 = x0Var;
        }
        if ((i11 & 512) != 0) {
            x0Var5 = topAppBarUiState2.contentColor;
        } else {
            x0Var5 = x0Var2;
        }
        if ((i11 & 1024) != 0) {
            x0Var6 = topAppBarUiState2.subTitleColor;
        } else {
            x0Var6 = x0Var3;
        }
        return topAppBarUiState.m220copyd8CKnI4(stringProvider3, num3, stringProvider4, num4, list3, z11, ticketProgressRowState2, list4, x0Var4, x0Var5, x0Var6);
    }

    public final StringProvider component1() {
        return this.title;
    }

    /* renamed from: component10-QN2ZGVo  reason: not valid java name */
    public final C2544x0 m217component10QN2ZGVo() {
        return this.contentColor;
    }

    /* renamed from: component11-QN2ZGVo  reason: not valid java name */
    public final C2544x0 m218component11QN2ZGVo() {
        return this.subTitleColor;
    }

    public final Integer component2() {
        return this.navIcon;
    }

    public final StringProvider component3() {
        return this.subTitle;
    }

    public final Integer component4() {
        return this.subTitleLeadingIcon;
    }

    public final List<AvatarWrapper> component5() {
        return this.avatars;
    }

    public final boolean component6() {
        return this.displayActiveIndicator;
    }

    public final TicketProgressRowState component7() {
        return this.ticketStatusState;
    }

    public final List<HeaderMenuItem> component8() {
        return this.headerMenuItems;
    }

    /* renamed from: component9-QN2ZGVo  reason: not valid java name */
    public final C2544x0 m219component9QN2ZGVo() {
        return this.backgroundColor;
    }

    /* renamed from: copy-d8CKnI4  reason: not valid java name */
    public final TopAppBarUiState m220copyd8CKnI4(StringProvider stringProvider, Integer num, StringProvider stringProvider2, Integer num2, List<AvatarWrapper> list, boolean z10, TicketProgressRowState ticketProgressRowState, List<? extends HeaderMenuItem> list2, C2544x0 x0Var, C2544x0 x0Var2, C2544x0 x0Var3) {
        C6496s.h(stringProvider, b.f37461S);
        List<AvatarWrapper> list3 = list;
        C6496s.h(list3, "avatars");
        List<? extends HeaderMenuItem> list4 = list2;
        C6496s.h(list4, "headerMenuItems");
        return new TopAppBarUiState(stringProvider, num, stringProvider2, num2, list3, z10, ticketProgressRowState, list4, x0Var, x0Var2, x0Var3, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopAppBarUiState)) {
            return false;
        }
        TopAppBarUiState topAppBarUiState = (TopAppBarUiState) obj;
        return C6496s.c(this.title, topAppBarUiState.title) && C6496s.c(this.navIcon, topAppBarUiState.navIcon) && C6496s.c(this.subTitle, topAppBarUiState.subTitle) && C6496s.c(this.subTitleLeadingIcon, topAppBarUiState.subTitleLeadingIcon) && C6496s.c(this.avatars, topAppBarUiState.avatars) && this.displayActiveIndicator == topAppBarUiState.displayActiveIndicator && C6496s.c(this.ticketStatusState, topAppBarUiState.ticketStatusState) && C6496s.c(this.headerMenuItems, topAppBarUiState.headerMenuItems) && C6496s.c(this.backgroundColor, topAppBarUiState.backgroundColor) && C6496s.c(this.contentColor, topAppBarUiState.contentColor) && C6496s.c(this.subTitleColor, topAppBarUiState.subTitleColor);
    }

    public final List<AvatarWrapper> getAvatars() {
        return this.avatars;
    }

    /* renamed from: getBackgroundColor-QN2ZGVo  reason: not valid java name */
    public final C2544x0 m221getBackgroundColorQN2ZGVo() {
        return this.backgroundColor;
    }

    /* renamed from: getContentColor-QN2ZGVo  reason: not valid java name */
    public final C2544x0 m222getContentColorQN2ZGVo() {
        return this.contentColor;
    }

    public final boolean getDisplayActiveIndicator() {
        return this.displayActiveIndicator;
    }

    public final List<HeaderMenuItem> getHeaderMenuItems() {
        return this.headerMenuItems;
    }

    public final Integer getNavIcon() {
        return this.navIcon;
    }

    public final StringProvider getSubTitle() {
        return this.subTitle;
    }

    /* renamed from: getSubTitleColor-QN2ZGVo  reason: not valid java name */
    public final C2544x0 m223getSubTitleColorQN2ZGVo() {
        return this.subTitleColor;
    }

    public final Integer getSubTitleLeadingIcon() {
        return this.subTitleLeadingIcon;
    }

    public final TicketProgressRowState getTicketStatusState() {
        return this.ticketStatusState;
    }

    public final StringProvider getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        Integer num = this.navIcon;
        int i10 = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        StringProvider stringProvider = this.subTitle;
        int hashCode3 = (hashCode2 + (stringProvider == null ? 0 : stringProvider.hashCode())) * 31;
        Integer num2 = this.subTitleLeadingIcon;
        int hashCode4 = (((((hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.avatars.hashCode()) * 31) + Boolean.hashCode(this.displayActiveIndicator)) * 31;
        TicketProgressRowState ticketProgressRowState = this.ticketStatusState;
        int hashCode5 = (((hashCode4 + (ticketProgressRowState == null ? 0 : ticketProgressRowState.hashCode())) * 31) + this.headerMenuItems.hashCode()) * 31;
        C2544x0 x0Var = this.backgroundColor;
        int w10 = (hashCode5 + (x0Var == null ? 0 : C2544x0.w(x0Var.y()))) * 31;
        C2544x0 x0Var2 = this.contentColor;
        int w11 = (w10 + (x0Var2 == null ? 0 : C2544x0.w(x0Var2.y()))) * 31;
        C2544x0 x0Var3 = this.subTitleColor;
        if (x0Var3 != null) {
            i10 = C2544x0.w(x0Var3.y());
        }
        return w11 + i10;
    }

    public String toString() {
        return "TopAppBarUiState(title=" + this.title + ", navIcon=" + this.navIcon + ", subTitle=" + this.subTitle + ", subTitleLeadingIcon=" + this.subTitleLeadingIcon + ", avatars=" + this.avatars + ", displayActiveIndicator=" + this.displayActiveIndicator + ", ticketStatusState=" + this.ticketStatusState + ", headerMenuItems=" + this.headerMenuItems + ", backgroundColor=" + this.backgroundColor + ", contentColor=" + this.contentColor + ", subTitleColor=" + this.subTitleColor + ')';
    }

    private TopAppBarUiState(StringProvider stringProvider, Integer num, StringProvider stringProvider2, Integer num2, List<AvatarWrapper> list, boolean z10, TicketProgressRowState ticketProgressRowState, List<? extends HeaderMenuItem> list2, C2544x0 x0Var, C2544x0 x0Var2, C2544x0 x0Var3) {
        C6496s.h(stringProvider, b.f37461S);
        C6496s.h(list, "avatars");
        C6496s.h(list2, "headerMenuItems");
        this.title = stringProvider;
        this.navIcon = num;
        this.subTitle = stringProvider2;
        this.subTitleLeadingIcon = num2;
        this.avatars = list;
        this.displayActiveIndicator = z10;
        this.ticketStatusState = ticketProgressRowState;
        this.headerMenuItems = list2;
        this.backgroundColor = x0Var;
        this.contentColor = x0Var2;
        this.subTitleColor = x0Var3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TopAppBarUiState(io.intercom.android.sdk.ui.common.StringProvider r17, java.lang.Integer r18, io.intercom.android.sdk.ui.common.StringProvider r19, java.lang.Integer r20, java.util.List r21, boolean r22, io.intercom.android.sdk.m5.conversation.states.TicketProgressRowState r23, java.util.List r24, r0.C2544x0 r25, r0.C2544x0 r26, r0.C2544x0 r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
            r16 = this;
            r0 = r28
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r5 = r2
            goto L_0x000b
        L_0x0009:
            r5 = r18
        L_0x000b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0012
            r1 = 0
            r9 = r1
            goto L_0x0014
        L_0x0012:
            r9 = r22
        L_0x0014:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x001a
            r10 = r2
            goto L_0x001c
        L_0x001a:
            r10 = r23
        L_0x001c:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0026
            java.util.List r1 = mf.C6565s.n()
            r11 = r1
            goto L_0x0028
        L_0x0026:
            r11 = r24
        L_0x0028:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x002e
            r12 = r2
            goto L_0x0030
        L_0x002e:
            r12 = r25
        L_0x0030:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0036
            r13 = r2
            goto L_0x0038
        L_0x0036:
            r13 = r26
        L_0x0038:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x003e
            r14 = r2
            goto L_0x0040
        L_0x003e:
            r14 = r27
        L_0x0040:
            r15 = 0
            r3 = r16
            r4 = r17
            r6 = r19
            r7 = r20
            r8 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState.<init>(io.intercom.android.sdk.ui.common.StringProvider, java.lang.Integer, io.intercom.android.sdk.ui.common.StringProvider, java.lang.Integer, java.util.List, boolean, io.intercom.android.sdk.m5.conversation.states.TicketProgressRowState, java.util.List, r0.x0, r0.x0, r0.x0, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
