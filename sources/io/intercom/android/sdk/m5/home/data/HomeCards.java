package io.intercom.android.sdk.m5.home.data;

import Oc.c;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Ticket;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0011\u0018\u00002\u00020\u0001:\t\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/intercom/android/sdk/m5/home/data/HomeCards;", "", "cardTitle", "", "type", "Lio/intercom/android/sdk/m5/home/data/HomeCardType;", "<init>", "(Ljava/lang/String;Lio/intercom/android/sdk/m5/home/data/HomeCardType;)V", "getCardTitle", "()Ljava/lang/String;", "getType", "()Lio/intercom/android/sdk/m5/home/data/HomeCardType;", "HomeSpacesData", "HomeNewConversationData", "HomeRecentConversationData", "HomeHelpCenterData", "HomeExternalLinkData", "HomeMessengerAppData", "HomeRecentTicketsData", "HomeTicketLinksData", "UnSupported", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class HomeCards {
    public static final int $stable = 0;
    @c("card_title")
    private final String cardTitle;
    @c("type")
    private final HomeCardType type;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/intercom/android/sdk/m5/home/data/HomeCards$HomeExternalLinkData;", "Lio/intercom/android/sdk/m5/home/data/HomeCards;", "cardTitle", "", "type", "Lio/intercom/android/sdk/m5/home/data/HomeCardType;", "links", "", "Lio/intercom/android/sdk/m5/home/data/Link;", "<init>", "(Ljava/lang/String;Lio/intercom/android/sdk/m5/home/data/HomeCardType;Ljava/util/List;)V", "getLinks", "()Ljava/util/List;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HomeExternalLinkData extends HomeCards {
        public static final int $stable = 8;
        @c("links")
        private final List<Link> links;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HomeExternalLinkData(String str, HomeCardType homeCardType, List<Link> list) {
            super(str, homeCardType);
            C6496s.h(str, "cardTitle");
            C6496s.h(homeCardType, "type");
            C6496s.h(list, "links");
            this.links = list;
        }

        public final List<Link> getLinks() {
            return this.links;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/intercom/android/sdk/m5/home/data/HomeCards$HomeHelpCenterData;", "Lio/intercom/android/sdk/m5/home/data/HomeCards;", "cardTitle", "", "type", "Lio/intercom/android/sdk/m5/home/data/HomeCardType;", "suggestedArticles", "", "Lio/intercom/android/sdk/m5/home/data/SuggestedArticle;", "<init>", "(Ljava/lang/String;Lio/intercom/android/sdk/m5/home/data/HomeCardType;Ljava/util/List;)V", "getSuggestedArticles", "()Ljava/util/List;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HomeHelpCenterData extends HomeCards {
        public static final int $stable = 8;
        @c("suggested_articles")
        private final List<SuggestedArticle> suggestedArticles;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HomeHelpCenterData(String str, HomeCardType homeCardType, List<SuggestedArticle> list) {
            super(str, homeCardType);
            C6496s.h(str, "cardTitle");
            C6496s.h(homeCardType, "type");
            C6496s.h(list, "suggestedArticles");
            this.suggestedArticles = list;
        }

        public final List<SuggestedArticle> getSuggestedArticles() {
            return this.suggestedArticles;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/intercom/android/sdk/m5/home/data/HomeCards$HomeMessengerAppData;", "Lio/intercom/android/sdk/m5/home/data/HomeCards;", "cardTitle", "", "type", "Lio/intercom/android/sdk/m5/home/data/HomeCardType;", "fallbackUrl", "<init>", "(Ljava/lang/String;Lio/intercom/android/sdk/m5/home/data/HomeCardType;Ljava/lang/String;)V", "getFallbackUrl", "()Ljava/lang/String;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HomeMessengerAppData extends HomeCards {
        public static final int $stable = 0;
        @c("fallback_url")
        private final String fallbackUrl;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HomeMessengerAppData(String str, HomeCardType homeCardType, String str2) {
            super(str, homeCardType);
            C6496s.h(str, "cardTitle");
            C6496s.h(homeCardType, "type");
            C6496s.h(str2, "fallbackUrl");
            this.fallbackUrl = str2;
        }

        public final String getFallbackUrl() {
            return this.fallbackUrl;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\f\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\r\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lio/intercom/android/sdk/m5/home/data/HomeCards$HomeNewConversationData;", "Lio/intercom/android/sdk/m5/home/data/HomeCards;", "cardTitle", "", "type", "Lio/intercom/android/sdk/m5/home/data/HomeCardType;", "action", "Lio/intercom/android/sdk/m5/home/data/Action;", "preventMultipleInboundConversationsEnabled", "", "openInboundConversationsIds", "", "showFinAvatar", "showTeammateExpectations", "homeCard", "Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$HomeCard;", "<init>", "(Ljava/lang/String;Lio/intercom/android/sdk/m5/home/data/HomeCardType;Lio/intercom/android/sdk/m5/home/data/Action;ZLjava/util/List;ZZLio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$HomeCard;)V", "getAction", "()Lio/intercom/android/sdk/m5/home/data/Action;", "getPreventMultipleInboundConversationsEnabled", "()Z", "getOpenInboundConversationsIds", "()Ljava/util/List;", "getShowFinAvatar", "getShowTeammateExpectations", "getHomeCard", "()Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$HomeCard;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HomeNewConversationData extends HomeCards {
        public static final int $stable = 8;
        @c("action")
        private final Action action;
        private final OpenMessengerResponse.NewConversationData.HomeCard homeCard;
        @c("open_inbound_conversation_ids")
        private final List<String> openInboundConversationsIds;
        @c("prevent_multiple_inbound_conversations_enabled")
        private final boolean preventMultipleInboundConversationsEnabled;
        @c("show_fin_avatar")
        private final boolean showFinAvatar;
        @c("show_teammate_expectations")
        private final boolean showTeammateExpectations;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HomeNewConversationData(String str, HomeCardType homeCardType, Action action2, boolean z10, List<String> list, boolean z11, boolean z12, OpenMessengerResponse.NewConversationData.HomeCard homeCard2) {
            super(str, homeCardType);
            C6496s.h(str, "cardTitle");
            C6496s.h(homeCardType, "type");
            C6496s.h(action2, "action");
            C6496s.h(list, "openInboundConversationsIds");
            this.action = action2;
            this.preventMultipleInboundConversationsEnabled = z10;
            this.openInboundConversationsIds = list;
            this.showFinAvatar = z11;
            this.showTeammateExpectations = z12;
            this.homeCard = homeCard2;
        }

        public final Action getAction() {
            return this.action;
        }

        public final OpenMessengerResponse.NewConversationData.HomeCard getHomeCard() {
            return this.homeCard;
        }

        public final List<String> getOpenInboundConversationsIds() {
            return this.openInboundConversationsIds;
        }

        public final boolean getPreventMultipleInboundConversationsEnabled() {
            return this.preventMultipleInboundConversationsEnabled;
        }

        public final boolean getShowFinAvatar() {
            return this.showFinAvatar;
        }

        public final boolean getShowTeammateExpectations() {
            return this.showTeammateExpectations;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/intercom/android/sdk/m5/home/data/HomeCards$HomeRecentConversationData;", "Lio/intercom/android/sdk/m5/home/data/HomeCards;", "cardTitle", "", "type", "Lio/intercom/android/sdk/m5/home/data/HomeCardType;", "conversations", "", "Lio/intercom/android/sdk/models/Conversation;", "<init>", "(Ljava/lang/String;Lio/intercom/android/sdk/m5/home/data/HomeCardType;Ljava/util/List;)V", "getConversations", "()Ljava/util/List;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HomeRecentConversationData extends HomeCards {
        public static final int $stable = 8;
        @c("conversations")
        private final List<Conversation> conversations;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HomeRecentConversationData(String str, HomeCardType homeCardType, List<Conversation> list) {
            super(str, homeCardType);
            C6496s.h(str, "cardTitle");
            C6496s.h(homeCardType, "type");
            C6496s.h(list, "conversations");
            this.conversations = list;
        }

        public final List<Conversation> getConversations() {
            return this.conversations;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/intercom/android/sdk/m5/home/data/HomeCards$HomeRecentTicketsData;", "Lio/intercom/android/sdk/m5/home/data/HomeCards;", "cardTitle", "", "type", "Lio/intercom/android/sdk/m5/home/data/HomeCardType;", "tickets", "", "Lio/intercom/android/sdk/models/Ticket;", "<init>", "(Ljava/lang/String;Lio/intercom/android/sdk/m5/home/data/HomeCardType;Ljava/util/List;)V", "getTickets", "()Ljava/util/List;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HomeRecentTicketsData extends HomeCards {
        public static final int $stable = 8;
        @c("tickets")
        private final List<Ticket> tickets;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HomeRecentTicketsData(String str, HomeCardType homeCardType, List<Ticket> list) {
            super(str, homeCardType);
            C6496s.h(str, "cardTitle");
            C6496s.h(homeCardType, "type");
            C6496s.h(list, "tickets");
            this.tickets = list;
        }

        public final List<Ticket> getTickets() {
            return this.tickets;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/intercom/android/sdk/m5/home/data/HomeCards$HomeSpacesData;", "Lio/intercom/android/sdk/m5/home/data/HomeCards;", "cardTitle", "", "type", "Lio/intercom/android/sdk/m5/home/data/HomeCardType;", "spaceItems", "", "Lio/intercom/android/sdk/m5/home/data/SpaceItem;", "<init>", "(Ljava/lang/String;Lio/intercom/android/sdk/m5/home/data/HomeCardType;Ljava/util/List;)V", "getSpaceItems", "()Ljava/util/List;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HomeSpacesData extends HomeCards {
        public static final int $stable = 8;
        @c("space_items")
        private final List<SpaceItem> spaceItems;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HomeSpacesData(String str, HomeCardType homeCardType, List<SpaceItem> list) {
            super(str, homeCardType);
            C6496s.h(str, "cardTitle");
            C6496s.h(homeCardType, "type");
            C6496s.h(list, "spaceItems");
            this.spaceItems = list;
        }

        public final List<SpaceItem> getSpaceItems() {
            return this.spaceItems;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/m5/home/data/HomeCards$UnSupported;", "Lio/intercom/android/sdk/m5/home/data/HomeCards;", "cardTitle", "", "type", "Lio/intercom/android/sdk/m5/home/data/HomeCardType;", "<init>", "(Ljava/lang/String;Lio/intercom/android/sdk/m5/home/data/HomeCardType;)V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UnSupported extends HomeCards {
        public static final int $stable = 0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public UnSupported(String str, HomeCardType homeCardType) {
            super(str, homeCardType);
            C6496s.h(str, "cardTitle");
            C6496s.h(homeCardType, "type");
        }
    }

    public HomeCards(String str, HomeCardType homeCardType) {
        C6496s.h(str, "cardTitle");
        C6496s.h(homeCardType, "type");
        this.cardTitle = str;
        this.type = homeCardType;
    }

    public final String getCardTitle() {
        return this.cardTitle;
    }

    public final HomeCardType getType() {
        return this.type;
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/intercom/android/sdk/m5/home/data/HomeCards$HomeTicketLinksData;", "Lio/intercom/android/sdk/m5/home/data/HomeCards;", "cardTitle", "", "type", "Lio/intercom/android/sdk/m5/home/data/HomeCardType;", "links", "", "Lio/intercom/android/sdk/m5/home/data/TicketLink;", "<init>", "(Ljava/lang/String;Lio/intercom/android/sdk/m5/home/data/HomeCardType;Ljava/util/List;)V", "getLinks", "()Ljava/util/List;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HomeTicketLinksData extends HomeCards {
        public static final int $stable = 8;
        @c("links")
        private final List<TicketLink> links;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ HomeTicketLinksData(String str, HomeCardType homeCardType, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str, homeCardType, list);
        }

        public final List<TicketLink> getLinks() {
            return this.links;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HomeTicketLinksData(String str, HomeCardType homeCardType, List<TicketLink> list) {
            super(str, homeCardType);
            C6496s.h(str, "cardTitle");
            C6496s.h(homeCardType, "type");
            C6496s.h(list, "links");
            this.links = list;
        }
    }
}
