package io.intercom.android.sdk.helpcenter.articles;

import gh.C5978b;
import gh.C5985i;
import kh.C6456i0;
import kh.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C5985i
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H×\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0015¨\u0006'"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleResponse;", "", "Lio/intercom/android/sdk/helpcenter/articles/Article;", "article", "<init>", "(Lio/intercom/android/sdk/helpcenter/articles/Article;)V", "", "seen0", "Lkh/t0;", "serializationConstructorMarker", "(ILio/intercom/android/sdk/helpcenter/articles/Article;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self$intercom_sdk_base_release", "(Lio/intercom/android/sdk/helpcenter/articles/ArticleResponse;Ljh/d;Lih/f;)V", "write$Self", "component1", "()Lio/intercom/android/sdk/helpcenter/articles/Article;", "copy", "(Lio/intercom/android/sdk/helpcenter/articles/Article;)Lio/intercom/android/sdk/helpcenter/articles/ArticleResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/intercom/android/sdk/helpcenter/articles/Article;", "getArticle", "getArticle$annotations", "()V", "Companion", "$serializer", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ArticleResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final Article article;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleResponse$Companion;", "", "<init>", "()V", "Lgh/b;", "Lio/intercom/android/sdk/helpcenter/articles/ArticleResponse;", "serializer", "()Lgh/b;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final C5978b serializer() {
            return ArticleResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ArticleResponse(int i10, Article article2, t0 t0Var) {
        if (1 != (i10 & 1)) {
            C6456i0.a(i10, 1, ArticleResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.article = article2;
    }

    public static /* synthetic */ ArticleResponse copy$default(ArticleResponse articleResponse, Article article2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            article2 = articleResponse.article;
        }
        return articleResponse.copy(article2);
    }

    public static /* synthetic */ void getArticle$annotations() {
    }

    public final Article component1() {
        return this.article;
    }

    public final ArticleResponse copy(Article article2) {
        C6496s.h(article2, "article");
        return new ArticleResponse(article2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ArticleResponse) && C6496s.c(this.article, ((ArticleResponse) obj).article);
    }

    public final Article getArticle() {
        return this.article;
    }

    public int hashCode() {
        return this.article.hashCode();
    }

    public String toString() {
        return "ArticleResponse(article=" + this.article + ')';
    }

    public ArticleResponse(Article article2) {
        C6496s.h(article2, "article");
        this.article = article2;
    }
}
