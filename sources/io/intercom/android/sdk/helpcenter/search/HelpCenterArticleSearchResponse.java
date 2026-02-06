package io.intercom.android.sdk.helpcenter.search;

import com.amazon.a.a.o.b;
import gh.C5978b;
import gh.C5985i;
import ih.f;
import jh.d;
import kh.C6456i0;
import kh.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C5985i
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0013\b\b\u0018\u0000 62\u00020\u0001:\u0003786B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJB\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÇ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bH×\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010)\u0012\u0004\b.\u0010,\u001a\u0004\b-\u0010\u001aR \u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b0\u0010,\u001a\u0004\b/\u0010\u001aR \u0010\u0006\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b2\u0010,\u001a\u0004\b1\u0010\u001aR \u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u00103\u0012\u0004\b5\u0010,\u001a\u0004\b4\u0010\u001f¨\u00069"}, d2 = {"Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse;", "", "", "articleId", "summary", "title", "url", "Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse$Highlight;", "highlight", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse$Highlight;)V", "", "seen0", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse$Highlight;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self$intercom_sdk_base_release", "(Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse;Ljh/d;Lih/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse$Highlight;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse$Highlight;)Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getArticleId", "getArticleId$annotations", "()V", "getSummary", "getSummary$annotations", "getTitle", "getTitle$annotations", "getUrl", "getUrl$annotations", "Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse$Highlight;", "getHighlight", "getHighlight$annotations", "Companion", "Highlight", "$serializer", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HelpCenterArticleSearchResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final String articleId;
    private final Highlight highlight;
    private final String summary;
    private final String title;
    private final String url;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse$Companion;", "", "<init>", "()V", "Lgh/b;", "Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse;", "serializer", "()Lgh/b;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final C5978b serializer() {
            return HelpCenterArticleSearchResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @C5985i
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007H×\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u0016¨\u0006)"}, d2 = {"Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse$Highlight;", "", "", "title", "summary", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self$intercom_sdk_base_release", "(Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse$Highlight;Ljh/d;Lih/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse$Highlight;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getSummary", "getSummary$annotations", "Companion", "$serializer", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Highlight {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final String summary;
        private final String title;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse$Highlight$Companion;", "", "<init>", "()V", "Lgh/b;", "Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse$Highlight;", "serializer", "()Lgh/b;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final C5978b serializer() {
                return HelpCenterArticleSearchResponse$Highlight$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public Highlight() {
            this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Highlight copy$default(Highlight highlight, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = highlight.title;
            }
            if ((i10 & 2) != 0) {
                str2 = highlight.summary;
            }
            return highlight.copy(str, str2);
        }

        public static /* synthetic */ void getSummary$annotations() {
        }

        public static /* synthetic */ void getTitle$annotations() {
        }

        public static final /* synthetic */ void write$Self$intercom_sdk_base_release(Highlight highlight, d dVar, f fVar) {
            if (dVar.q(fVar, 0) || !C6496s.c(highlight.title, "")) {
                dVar.t(fVar, 0, highlight.title);
            }
            if (dVar.q(fVar, 1) || !C6496s.c(highlight.summary, "")) {
                dVar.t(fVar, 1, highlight.summary);
            }
        }

        public final String component1() {
            return this.title;
        }

        public final String component2() {
            return this.summary;
        }

        public final Highlight copy(String str, String str2) {
            C6496s.h(str, b.f37461S);
            C6496s.h(str2, "summary");
            return new Highlight(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Highlight)) {
                return false;
            }
            Highlight highlight = (Highlight) obj;
            return C6496s.c(this.title, highlight.title) && C6496s.c(this.summary, highlight.summary);
        }

        public final String getSummary() {
            return this.summary;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.summary.hashCode();
        }

        public String toString() {
            return "Highlight(title=" + this.title + ", summary=" + this.summary + ')';
        }

        public /* synthetic */ Highlight(int i10, String str, String str2, t0 t0Var) {
            if ((i10 & 1) == 0) {
                this.title = "";
            } else {
                this.title = str;
            }
            if ((i10 & 2) == 0) {
                this.summary = "";
            } else {
                this.summary = str2;
            }
        }

        public Highlight(String str, String str2) {
            C6496s.h(str, b.f37461S);
            C6496s.h(str2, "summary");
            this.title = str;
            this.summary = str2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Highlight(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2);
        }
    }

    public /* synthetic */ HelpCenterArticleSearchResponse(int i10, String str, String str2, String str3, String str4, Highlight highlight2, t0 t0Var) {
        if (1 != (i10 & 1)) {
            C6456i0.a(i10, 1, HelpCenterArticleSearchResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.articleId = str;
        if ((i10 & 2) == 0) {
            this.summary = "";
        } else {
            this.summary = str2;
        }
        if ((i10 & 4) == 0) {
            this.title = "";
        } else {
            this.title = str3;
        }
        if ((i10 & 8) == 0) {
            this.url = "";
        } else {
            this.url = str4;
        }
        if ((i10 & 16) == 0) {
            this.highlight = new Highlight((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        } else {
            this.highlight = highlight2;
        }
    }

    public static /* synthetic */ HelpCenterArticleSearchResponse copy$default(HelpCenterArticleSearchResponse helpCenterArticleSearchResponse, String str, String str2, String str3, String str4, Highlight highlight2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = helpCenterArticleSearchResponse.articleId;
        }
        if ((i10 & 2) != 0) {
            str2 = helpCenterArticleSearchResponse.summary;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = helpCenterArticleSearchResponse.title;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            str4 = helpCenterArticleSearchResponse.url;
        }
        String str7 = str4;
        if ((i10 & 16) != 0) {
            highlight2 = helpCenterArticleSearchResponse.highlight;
        }
        return helpCenterArticleSearchResponse.copy(str, str5, str6, str7, highlight2);
    }

    public static /* synthetic */ void getArticleId$annotations() {
    }

    public static /* synthetic */ void getHighlight$annotations() {
    }

    public static /* synthetic */ void getSummary$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public static /* synthetic */ void getUrl$annotations() {
    }

    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(HelpCenterArticleSearchResponse helpCenterArticleSearchResponse, d dVar, f fVar) {
        dVar.t(fVar, 0, helpCenterArticleSearchResponse.articleId);
        if (dVar.q(fVar, 1) || !C6496s.c(helpCenterArticleSearchResponse.summary, "")) {
            dVar.t(fVar, 1, helpCenterArticleSearchResponse.summary);
        }
        if (dVar.q(fVar, 2) || !C6496s.c(helpCenterArticleSearchResponse.title, "")) {
            dVar.t(fVar, 2, helpCenterArticleSearchResponse.title);
        }
        if (dVar.q(fVar, 3) || !C6496s.c(helpCenterArticleSearchResponse.url, "")) {
            dVar.t(fVar, 3, helpCenterArticleSearchResponse.url);
        }
        if (dVar.q(fVar, 4) || !C6496s.c(helpCenterArticleSearchResponse.highlight, new Highlight((String) null, (String) null, 3, (DefaultConstructorMarker) null))) {
            dVar.B(fVar, 4, HelpCenterArticleSearchResponse$Highlight$$serializer.INSTANCE, helpCenterArticleSearchResponse.highlight);
        }
    }

    public final String component1() {
        return this.articleId;
    }

    public final String component2() {
        return this.summary;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.url;
    }

    public final Highlight component5() {
        return this.highlight;
    }

    public final HelpCenterArticleSearchResponse copy(String str, String str2, String str3, String str4, Highlight highlight2) {
        C6496s.h(str, "articleId");
        C6496s.h(str2, "summary");
        C6496s.h(str3, b.f37461S);
        C6496s.h(str4, "url");
        C6496s.h(highlight2, "highlight");
        return new HelpCenterArticleSearchResponse(str, str2, str3, str4, highlight2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HelpCenterArticleSearchResponse)) {
            return false;
        }
        HelpCenterArticleSearchResponse helpCenterArticleSearchResponse = (HelpCenterArticleSearchResponse) obj;
        return C6496s.c(this.articleId, helpCenterArticleSearchResponse.articleId) && C6496s.c(this.summary, helpCenterArticleSearchResponse.summary) && C6496s.c(this.title, helpCenterArticleSearchResponse.title) && C6496s.c(this.url, helpCenterArticleSearchResponse.url) && C6496s.c(this.highlight, helpCenterArticleSearchResponse.highlight);
    }

    public final String getArticleId() {
        return this.articleId;
    }

    public final Highlight getHighlight() {
        return this.highlight;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((((this.articleId.hashCode() * 31) + this.summary.hashCode()) * 31) + this.title.hashCode()) * 31) + this.url.hashCode()) * 31) + this.highlight.hashCode();
    }

    public String toString() {
        return "HelpCenterArticleSearchResponse(articleId=" + this.articleId + ", summary=" + this.summary + ", title=" + this.title + ", url=" + this.url + ", highlight=" + this.highlight + ')';
    }

    public HelpCenterArticleSearchResponse(String str, String str2, String str3, String str4, Highlight highlight2) {
        C6496s.h(str, "articleId");
        C6496s.h(str2, "summary");
        C6496s.h(str3, b.f37461S);
        C6496s.h(str4, "url");
        C6496s.h(highlight2, "highlight");
        this.articleId = str;
        this.summary = str2;
        this.title = str3;
        this.url = str4;
        this.highlight = highlight2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HelpCenterArticleSearchResponse(String str, String str2, String str3, String str4, Highlight highlight2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4, (i10 & 16) != 0 ? new Highlight((String) null, (String) null, 3, (DefaultConstructorMarker) null) : highlight2);
    }
}
