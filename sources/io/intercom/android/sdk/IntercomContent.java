package io.intercom.android.sdk;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/IntercomContent;", "", "<init>", "()V", "HelpCenterCollections", "Article", "Carousel", "Survey", "Conversation", "Ticket", "Lio/intercom/android/sdk/IntercomContent$Article;", "Lio/intercom/android/sdk/IntercomContent$Carousel;", "Lio/intercom/android/sdk/IntercomContent$Conversation;", "Lio/intercom/android/sdk/IntercomContent$HelpCenterCollections;", "Lio/intercom/android/sdk/IntercomContent$Survey;", "Lio/intercom/android/sdk/IntercomContent$Ticket;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class IntercomContent {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/IntercomContent$Article;", "Lio/intercom/android/sdk/IntercomContent;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Article extends IntercomContent {
        public static final int $stable = 0;

        /* renamed from: id  reason: collision with root package name */
        private final String f68510id;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Article(String str) {
            super((DefaultConstructorMarker) null);
            C6496s.h(str, "id");
            this.f68510id = str;
        }

        public static /* synthetic */ Article copy$default(Article article, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = article.f68510id;
            }
            return article.copy(str);
        }

        public final String component1() {
            return this.f68510id;
        }

        public final Article copy(String str) {
            C6496s.h(str, "id");
            return new Article(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Article) && C6496s.c(this.f68510id, ((Article) obj).f68510id);
        }

        public final String getId() {
            return this.f68510id;
        }

        public int hashCode() {
            return this.f68510id.hashCode();
        }

        public String toString() {
            return "Article(id=" + this.f68510id + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/IntercomContent$Carousel;", "Lio/intercom/android/sdk/IntercomContent;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Carousel extends IntercomContent {
        public static final int $stable = 0;

        /* renamed from: id  reason: collision with root package name */
        private final String f68511id;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Carousel(String str) {
            super((DefaultConstructorMarker) null);
            C6496s.h(str, "id");
            this.f68511id = str;
        }

        public static /* synthetic */ Carousel copy$default(Carousel carousel, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = carousel.f68511id;
            }
            return carousel.copy(str);
        }

        public final String component1() {
            return this.f68511id;
        }

        public final Carousel copy(String str) {
            C6496s.h(str, "id");
            return new Carousel(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Carousel) && C6496s.c(this.f68511id, ((Carousel) obj).f68511id);
        }

        public final String getId() {
            return this.f68511id;
        }

        public int hashCode() {
            return this.f68511id.hashCode();
        }

        public String toString() {
            return "Carousel(id=" + this.f68511id + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/IntercomContent$Conversation;", "Lio/intercom/android/sdk/IntercomContent;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Conversation extends IntercomContent {
        public static final int $stable = 0;

        /* renamed from: id  reason: collision with root package name */
        private final String f68512id;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Conversation(String str) {
            super((DefaultConstructorMarker) null);
            C6496s.h(str, "id");
            this.f68512id = str;
        }

        public static /* synthetic */ Conversation copy$default(Conversation conversation, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = conversation.f68512id;
            }
            return conversation.copy(str);
        }

        public final String component1() {
            return this.f68512id;
        }

        public final Conversation copy(String str) {
            C6496s.h(str, "id");
            return new Conversation(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Conversation) && C6496s.c(this.f68512id, ((Conversation) obj).f68512id);
        }

        public final String getId() {
            return this.f68512id;
        }

        public int hashCode() {
            return this.f68512id.hashCode();
        }

        public String toString() {
            return "Conversation(id=" + this.f68512id + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH×\u0003J\t\u0010\u000f\u001a\u00020\u0010H×\u0001J\t\u0010\u0011\u001a\u00020\u0004H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/IntercomContent$HelpCenterCollections;", "Lio/intercom/android/sdk/IntercomContent;", "ids", "", "", "<init>", "(Ljava/util/List;)V", "getIds", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HelpCenterCollections extends IntercomContent {
        public static final int $stable = 8;
        private final List<String> ids;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HelpCenterCollections(List<String> list) {
            super((DefaultConstructorMarker) null);
            C6496s.h(list, "ids");
            this.ids = list;
        }

        public static /* synthetic */ HelpCenterCollections copy$default(HelpCenterCollections helpCenterCollections, List<String> list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = helpCenterCollections.ids;
            }
            return helpCenterCollections.copy(list);
        }

        public final List<String> component1() {
            return this.ids;
        }

        public final HelpCenterCollections copy(List<String> list) {
            C6496s.h(list, "ids");
            return new HelpCenterCollections(list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HelpCenterCollections) && C6496s.c(this.ids, ((HelpCenterCollections) obj).ids);
        }

        public final List<String> getIds() {
            return this.ids;
        }

        public int hashCode() {
            return this.ids.hashCode();
        }

        public String toString() {
            return "HelpCenterCollections(ids=" + this.ids + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/IntercomContent$Survey;", "Lio/intercom/android/sdk/IntercomContent;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Survey extends IntercomContent {
        public static final int $stable = 0;

        /* renamed from: id  reason: collision with root package name */
        private final String f68513id;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Survey(String str) {
            super((DefaultConstructorMarker) null);
            C6496s.h(str, "id");
            this.f68513id = str;
        }

        public static /* synthetic */ Survey copy$default(Survey survey, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = survey.f68513id;
            }
            return survey.copy(str);
        }

        public final String component1() {
            return this.f68513id;
        }

        public final Survey copy(String str) {
            C6496s.h(str, "id");
            return new Survey(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Survey) && C6496s.c(this.f68513id, ((Survey) obj).f68513id);
        }

        public final String getId() {
            return this.f68513id;
        }

        public int hashCode() {
            return this.f68513id.hashCode();
        }

        public String toString() {
            return "Survey(id=" + this.f68513id + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/IntercomContent$Ticket;", "Lio/intercom/android/sdk/IntercomContent;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Ticket extends IntercomContent {
        public static final int $stable = 0;

        /* renamed from: id  reason: collision with root package name */
        private final String f68514id;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Ticket(String str) {
            super((DefaultConstructorMarker) null);
            C6496s.h(str, "id");
            this.f68514id = str;
        }

        public static /* synthetic */ Ticket copy$default(Ticket ticket, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = ticket.f68514id;
            }
            return ticket.copy(str);
        }

        public final String component1() {
            return this.f68514id;
        }

        public final Ticket copy(String str) {
            C6496s.h(str, "id");
            return new Ticket(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Ticket) && C6496s.c(this.f68514id, ((Ticket) obj).f68514id);
        }

        public final String getId() {
            return this.f68514id;
        }

        public int hashCode() {
            return this.f68514id.hashCode();
        }

        public String toString() {
            return "Ticket(id=" + this.f68514id + ')';
        }
    }

    public /* synthetic */ IntercomContent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private IntercomContent() {
    }
}
