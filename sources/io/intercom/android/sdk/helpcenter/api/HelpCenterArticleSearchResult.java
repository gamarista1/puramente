package io.intercom.android.sdk.helpcenter.api;

import com.amazon.a.a.o.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lio/intercom/android/sdk/helpcenter/api/HelpCenterArticleSearchResult;", "", "articleId", "", "title", "summary", "matchingSnippet", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getArticleId", "()Ljava/lang/String;", "getTitle", "getSummary", "getMatchingSnippet", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HelpCenterArticleSearchResult {
    public static final int $stable = 0;
    private final String articleId;
    private final String matchingSnippet;
    private final String summary;
    private final String title;

    public HelpCenterArticleSearchResult(String str, String str2, String str3, String str4) {
        C6496s.h(str, "articleId");
        C6496s.h(str2, b.f37461S);
        C6496s.h(str3, "summary");
        C6496s.h(str4, "matchingSnippet");
        this.articleId = str;
        this.title = str2;
        this.summary = str3;
        this.matchingSnippet = str4;
    }

    public static /* synthetic */ HelpCenterArticleSearchResult copy$default(HelpCenterArticleSearchResult helpCenterArticleSearchResult, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = helpCenterArticleSearchResult.articleId;
        }
        if ((i10 & 2) != 0) {
            str2 = helpCenterArticleSearchResult.title;
        }
        if ((i10 & 4) != 0) {
            str3 = helpCenterArticleSearchResult.summary;
        }
        if ((i10 & 8) != 0) {
            str4 = helpCenterArticleSearchResult.matchingSnippet;
        }
        return helpCenterArticleSearchResult.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.articleId;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.summary;
    }

    public final String component4() {
        return this.matchingSnippet;
    }

    public final HelpCenterArticleSearchResult copy(String str, String str2, String str3, String str4) {
        C6496s.h(str, "articleId");
        C6496s.h(str2, b.f37461S);
        C6496s.h(str3, "summary");
        C6496s.h(str4, "matchingSnippet");
        return new HelpCenterArticleSearchResult(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HelpCenterArticleSearchResult)) {
            return false;
        }
        HelpCenterArticleSearchResult helpCenterArticleSearchResult = (HelpCenterArticleSearchResult) obj;
        return C6496s.c(this.articleId, helpCenterArticleSearchResult.articleId) && C6496s.c(this.title, helpCenterArticleSearchResult.title) && C6496s.c(this.summary, helpCenterArticleSearchResult.summary) && C6496s.c(this.matchingSnippet, helpCenterArticleSearchResult.matchingSnippet);
    }

    public final String getArticleId() {
        return this.articleId;
    }

    public final String getMatchingSnippet() {
        return this.matchingSnippet;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((this.articleId.hashCode() * 31) + this.title.hashCode()) * 31) + this.summary.hashCode()) * 31) + this.matchingSnippet.hashCode();
    }

    public String toString() {
        return "HelpCenterArticleSearchResult(articleId=" + this.articleId + ", title=" + this.title + ", summary=" + this.summary + ", matchingSnippet=" + this.matchingSnippet + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HelpCenterArticleSearchResult(String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4);
    }
}
