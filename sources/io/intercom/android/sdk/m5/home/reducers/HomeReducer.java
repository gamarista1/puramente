package io.intercom.android.sdk.m5.home.reducers;

import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.home.data.HomeCardType;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.HomeV2Response;
import io.intercom.android.sdk.m5.home.states.HomeClientState;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.models.ActiveBot;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.PoweredBy;
import io.intercom.android.sdk.models.TeamPresence;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;
import mf.C6565s;
import yf.C6787a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/m5/home/reducers/HomeReducer;", "", "Lkotlin/Function0;", "Lio/intercom/android/sdk/identity/AppConfig;", "config", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "intercomDataLayer", "<init>", "(Lyf/a;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;)V", "", "Lio/intercom/android/sdk/m5/home/data/HomeCards;", "homeCards", "Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData;", "newConversationCta", "reduceHomeCards", "(Ljava/util/List;Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData;)Ljava/util/List;", "Lio/intercom/android/sdk/m5/home/states/HomeClientState;", "homeClientState", "Llf/M;", "onRetryClicked", "Lio/intercom/android/sdk/m5/home/states/HomeUiState;", "computeUiState$intercom_sdk_base_release", "(Lio/intercom/android/sdk/m5/home/states/HomeClientState;Lyf/a;)Lio/intercom/android/sdk/m5/home/states/HomeUiState;", "computeUiState", "Lyf/a;", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HomeReducer {
    public static final int $stable = 8;
    private final C6787a config;
    private final IntercomDataLayer intercomDataLayer;

    public HomeReducer() {
        this((C6787a) null, (IntercomDataLayer) null, 3, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public static final AppConfig _init_$lambda$0() {
        return Injector.get().getAppConfigProvider().get();
    }

    private final List<HomeCards> reduceHomeCards(List<? extends HomeCards> list, OpenMessengerResponse.NewConversationData newConversationData) {
        if (newConversationData == null) {
            return list;
        }
        Iterable<HomeCards> iterable = list;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (HomeCards homeCards : iterable) {
            if (homeCards instanceof HomeCards.HomeNewConversationData) {
                HomeCards.HomeNewConversationData homeNewConversationData = (HomeCards.HomeNewConversationData) homeCards;
                homeCards = new HomeCards.HomeNewConversationData("", HomeCardType.NEW_CONVERSATION, homeNewConversationData.getAction(), homeNewConversationData.getPreventMultipleInboundConversationsEnabled(), homeNewConversationData.getOpenInboundConversationsIds(), homeNewConversationData.getShowFinAvatar(), homeNewConversationData.getShowTeammateExpectations(), newConversationData.getHomeCard());
            }
            arrayList.add(homeCards);
        }
        return arrayList;
    }

    public final HomeUiState computeUiState$intercom_sdk_base_release(HomeClientState homeClientState, C6787a aVar) {
        OpenMessengerResponse.NewConversationData newConversationData;
        PoweredBy poweredBy;
        Participant.Builder participant;
        Participant build;
        C6496s.h(homeClientState, "homeClientState");
        C6496s.h(aVar, "onRetryClicked");
        OpenMessengerResponse openMessengerResponseData = homeClientState.getOpenMessengerResponseData();
        AvatarWrapper avatarWrapper = null;
        if (openMessengerResponseData != null) {
            newConversationData = openMessengerResponseData.getNewConversationData();
        } else {
            newConversationData = null;
        }
        NetworkResponse<HomeV2Response> homeResponse = homeClientState.getHomeResponse();
        if ((homeResponse instanceof NetworkResponse.ClientError) || (homeResponse instanceof NetworkResponse.ServerError)) {
            return new HomeUiState.Error((PoweredBy) null, new ErrorState.WithoutCTA(0, 0, (Integer) null, 7, (DefaultConstructorMarker) null), HomeHeaderStateReducerKt.computeErrorHeader(((AppConfig) this.config.invoke()).getConfigModules()));
        }
        if (homeResponse instanceof NetworkResponse.NetworkError) {
            return new HomeUiState.Error((PoweredBy) null, new ErrorState.WithCTA(0, 0, (Integer) null, 0, aVar, 15, (DefaultConstructorMarker) null), HomeHeaderStateReducerKt.computeErrorHeader(((AppConfig) this.config.invoke()).getConfigModules()));
        }
        if (homeResponse instanceof NetworkResponse.Success) {
            OpenMessengerResponse openMessengerResponseData2 = homeClientState.getOpenMessengerResponseData();
            if (openMessengerResponseData2 != null) {
                poweredBy = openMessengerResponseData2.getPoweredBy();
            } else {
                poweredBy = null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object next : reduceHomeCards(((HomeV2Response) ((NetworkResponse.Success) homeResponse).getBody()).getCards(), newConversationData)) {
                HomeCards homeCards = (HomeCards) next;
                if (homeCards instanceof HomeCards.HomeNewConversationData) {
                    HomeCards.HomeNewConversationData homeNewConversationData = (HomeCards.HomeNewConversationData) homeCards;
                    if (homeNewConversationData.getPreventMultipleInboundConversationsEnabled() && !homeNewConversationData.getOpenInboundConversationsIds().isEmpty()) {
                    }
                }
                arrayList.add(next);
            }
            Iterable<Participant> builtActiveAdmins = ((TeamPresence) this.intercomDataLayer.getTeamPresence().getValue()).getBuiltActiveAdmins();
            ArrayList arrayList2 = new ArrayList(C6565s.y(builtActiveAdmins, 10));
            for (Participant participant2 : builtActiveAdmins) {
                Avatar avatar = participant2.getAvatar();
                C6496s.g(avatar, "getAvatar(...)");
                Boolean isBot = participant2.isBot();
                C6496s.g(isBot, "isBot(...)");
                arrayList2.add(new AvatarWrapper(avatar, isBot.booleanValue()));
            }
            ActiveBot activeBot = ((TeamPresence) this.intercomDataLayer.getTeamPresence().getValue()).getActiveBot();
            if (!(activeBot == null || (participant = activeBot.getParticipant()) == null || (build = participant.build()) == null)) {
                Avatar avatar2 = build.getAvatar();
                C6496s.g(avatar2, "getAvatar(...)");
                Boolean isBot2 = build.isBot();
                C6496s.g(isBot2, "isBot(...)");
                avatarWrapper = new AvatarWrapper(avatar2, isBot2.booleanValue());
            }
            return new HomeUiState.Content(poweredBy, arrayList, arrayList2, avatarWrapper, ((AppConfig) this.config.invoke()).isAccessToTeammateEnabled(), HomeHeaderStateReducerKt.computeContentHeader(((AppConfig) this.config.invoke()).getConfigModules(), (TeamPresence) this.intercomDataLayer.getTeamPresence().getValue(), homeClientState.isHeaderImageLoaded()));
        } else if (homeResponse == null) {
            return new HomeUiState.Loading((PoweredBy) null);
        } else {
            throw new C6535s();
        }
    }

    public HomeReducer(C6787a aVar, IntercomDataLayer intercomDataLayer2) {
        C6496s.h(aVar, "config");
        C6496s.h(intercomDataLayer2, "intercomDataLayer");
        this.config = aVar;
        this.intercomDataLayer = intercomDataLayer2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ HomeReducer(yf.C6787a r1, io.intercom.android.sdk.m5.data.IntercomDataLayer r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0009
            Oe.a r1 = new Oe.a
            r1.<init>()
        L_0x0009:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x0015
            io.intercom.android.sdk.Injector r2 = io.intercom.android.sdk.Injector.get()
            io.intercom.android.sdk.m5.data.IntercomDataLayer r2 = r2.getDataLayer()
        L_0x0015:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.home.reducers.HomeReducer.<init>(yf.a, io.intercom.android.sdk.m5.data.IntercomDataLayer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
