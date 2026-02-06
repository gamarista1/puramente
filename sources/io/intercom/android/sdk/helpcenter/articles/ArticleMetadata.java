package io.intercom.android.sdk.helpcenter.articles;

import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;", "", "id", "", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ArticleMetadata {
    public static final int $stable = 0;

    /* renamed from: id  reason: collision with root package name */
    private final String f68556id;
    private final String title;

    public ArticleMetadata(String str, String str2) {
        C6496s.h(str, "id");
        this.f68556id = str;
        this.title = str2;
    }

    public static /* synthetic */ ArticleMetadata copy$default(ArticleMetadata articleMetadata, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = articleMetadata.f68556id;
        }
        if ((i10 & 2) != 0) {
            str2 = articleMetadata.title;
        }
        return articleMetadata.copy(str, str2);
    }

    public final String component1() {
        return this.f68556id;
    }

    public final String component2() {
        return this.title;
    }

    public final ArticleMetadata copy(String str, String str2) {
        C6496s.h(str, "id");
        return new ArticleMetadata(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArticleMetadata)) {
            return false;
        }
        ArticleMetadata articleMetadata = (ArticleMetadata) obj;
        return C6496s.c(this.f68556id, articleMetadata.f68556id) && C6496s.c(this.title, articleMetadata.title);
    }

    public final String getId() {
        return this.f68556id;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.f68556id.hashCode() * 31;
        String str = this.title;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ArticleMetadata(id=" + this.f68556id + ", title=" + this.title + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ArticleMetadata(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2);
    }
}
