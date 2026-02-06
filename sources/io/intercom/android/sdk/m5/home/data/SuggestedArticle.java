package io.intercom.android.sdk.m5.home.data;

import Oc.c;
import com.amazon.a.a.o.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/m5/home/data/SuggestedArticle;", "", "id", "", "title", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "getUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SuggestedArticle {
    public static final int $stable = 0;
    @c("id")

    /* renamed from: id  reason: collision with root package name */
    private final String f69770id;
    @c("title")
    private final String title;
    @c("url")
    private final String url;

    public SuggestedArticle(String str, String str2, String str3) {
        C6496s.h(str, "id");
        C6496s.h(str2, b.f37461S);
        C6496s.h(str3, "url");
        this.f69770id = str;
        this.title = str2;
        this.url = str3;
    }

    public static /* synthetic */ SuggestedArticle copy$default(SuggestedArticle suggestedArticle, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = suggestedArticle.f69770id;
        }
        if ((i10 & 2) != 0) {
            str2 = suggestedArticle.title;
        }
        if ((i10 & 4) != 0) {
            str3 = suggestedArticle.url;
        }
        return suggestedArticle.copy(str, str2, str3);
    }

    public final String component1() {
        return this.f69770id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.url;
    }

    public final SuggestedArticle copy(String str, String str2, String str3) {
        C6496s.h(str, "id");
        C6496s.h(str2, b.f37461S);
        C6496s.h(str3, "url");
        return new SuggestedArticle(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestedArticle)) {
            return false;
        }
        SuggestedArticle suggestedArticle = (SuggestedArticle) obj;
        return C6496s.c(this.f69770id, suggestedArticle.f69770id) && C6496s.c(this.title, suggestedArticle.title) && C6496s.c(this.url, suggestedArticle.url);
    }

    public final String getId() {
        return this.f69770id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((this.f69770id.hashCode() * 31) + this.title.hashCode()) * 31) + this.url.hashCode();
    }

    public String toString() {
        return "SuggestedArticle(id=" + this.f69770id + ", title=" + this.title + ", url=" + this.url + ')';
    }
}
