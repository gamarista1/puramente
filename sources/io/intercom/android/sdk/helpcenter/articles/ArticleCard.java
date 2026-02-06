package io.intercom.android.sdk.helpcenter.articles;

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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007H×\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u0016¨\u0006)"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleCard;", "", "", "articleId", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self$intercom_sdk_base_release", "(Lio/intercom/android/sdk/helpcenter/articles/ArticleCard;Ljh/d;Lih/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lio/intercom/android/sdk/helpcenter/articles/ArticleCard;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getArticleId", "getArticleId$annotations", "()V", "getTitle", "getTitle$annotations", "Companion", "$serializer", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ArticleCard {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final String articleId;
    private final String title;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleCard$Companion;", "", "<init>", "()V", "Lgh/b;", "Lio/intercom/android/sdk/helpcenter/articles/ArticleCard;", "serializer", "()Lgh/b;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final C5978b serializer() {
            return ArticleCard$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ArticleCard(int i10, String str, String str2, t0 t0Var) {
        if (3 != (i10 & 3)) {
            C6456i0.a(i10, 3, ArticleCard$$serializer.INSTANCE.getDescriptor());
        }
        this.articleId = str;
        this.title = str2;
    }

    public static /* synthetic */ ArticleCard copy$default(ArticleCard articleCard, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = articleCard.articleId;
        }
        if ((i10 & 2) != 0) {
            str2 = articleCard.title;
        }
        return articleCard.copy(str, str2);
    }

    public static /* synthetic */ void getArticleId$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(ArticleCard articleCard, d dVar, f fVar) {
        dVar.t(fVar, 0, articleCard.articleId);
        dVar.t(fVar, 1, articleCard.title);
    }

    public final String component1() {
        return this.articleId;
    }

    public final String component2() {
        return this.title;
    }

    public final ArticleCard copy(String str, String str2) {
        C6496s.h(str, "articleId");
        C6496s.h(str2, b.f37461S);
        return new ArticleCard(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArticleCard)) {
            return false;
        }
        ArticleCard articleCard = (ArticleCard) obj;
        return C6496s.c(this.articleId, articleCard.articleId) && C6496s.c(this.title, articleCard.title);
    }

    public final String getArticleId() {
        return this.articleId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (this.articleId.hashCode() * 31) + this.title.hashCode();
    }

    public String toString() {
        return "ArticleCard(articleId=" + this.articleId + ", title=" + this.title + ')';
    }

    public ArticleCard(String str, String str2) {
        C6496s.h(str, "articleId");
        C6496s.h(str2, b.f37461S);
        this.articleId = str;
        this.title = str2;
    }
}
