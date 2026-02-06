package io.intercom.android.sdk.helpcenter.articles;

import gh.C5978b;
import gh.C5985i;
import ih.f;
import jh.d;
import kh.C6456i0;
import kh.t0;
import kh.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C5985i
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bH×\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u0019¨\u0006,"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/Article;", "", "", "relatedConversationId", "Lio/intercom/android/sdk/helpcenter/articles/ArticleCard;", "card", "<init>", "(Ljava/lang/String;Lio/intercom/android/sdk/helpcenter/articles/ArticleCard;)V", "", "seen0", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Lio/intercom/android/sdk/helpcenter/articles/ArticleCard;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self$intercom_sdk_base_release", "(Lio/intercom/android/sdk/helpcenter/articles/Article;Ljh/d;Lih/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleCard;", "copy", "(Ljava/lang/String;Lio/intercom/android/sdk/helpcenter/articles/ArticleCard;)Lio/intercom/android/sdk/helpcenter/articles/Article;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRelatedConversationId", "getRelatedConversationId$annotations", "()V", "Lio/intercom/android/sdk/helpcenter/articles/ArticleCard;", "getCard", "getCard$annotations", "Companion", "$serializer", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Article {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final ArticleCard card;
    private final String relatedConversationId;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/Article$Companion;", "", "<init>", "()V", "Lgh/b;", "Lio/intercom/android/sdk/helpcenter/articles/Article;", "serializer", "()Lgh/b;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final C5978b serializer() {
            return Article$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Article(int i10, String str, ArticleCard articleCard, t0 t0Var) {
        if (2 != (i10 & 2)) {
            C6456i0.a(i10, 2, Article$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.relatedConversationId = null;
        } else {
            this.relatedConversationId = str;
        }
        this.card = articleCard;
    }

    public static /* synthetic */ Article copy$default(Article article, String str, ArticleCard articleCard, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = article.relatedConversationId;
        }
        if ((i10 & 2) != 0) {
            articleCard = article.card;
        }
        return article.copy(str, articleCard);
    }

    public static /* synthetic */ void getCard$annotations() {
    }

    public static /* synthetic */ void getRelatedConversationId$annotations() {
    }

    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(Article article, d dVar, f fVar) {
        if (dVar.q(fVar, 0) || article.relatedConversationId != null) {
            dVar.p(fVar, 0, x0.f71726a, article.relatedConversationId);
        }
        dVar.B(fVar, 1, ArticleCard$$serializer.INSTANCE, article.card);
    }

    public final String component1() {
        return this.relatedConversationId;
    }

    public final ArticleCard component2() {
        return this.card;
    }

    public final Article copy(String str, ArticleCard articleCard) {
        C6496s.h(articleCard, "card");
        return new Article(str, articleCard);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Article)) {
            return false;
        }
        Article article = (Article) obj;
        return C6496s.c(this.relatedConversationId, article.relatedConversationId) && C6496s.c(this.card, article.card);
    }

    public final ArticleCard getCard() {
        return this.card;
    }

    public final String getRelatedConversationId() {
        return this.relatedConversationId;
    }

    public int hashCode() {
        String str = this.relatedConversationId;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.card.hashCode();
    }

    public String toString() {
        return "Article(relatedConversationId=" + this.relatedConversationId + ", card=" + this.card + ')';
    }

    public Article(String str, ArticleCard articleCard) {
        C6496s.h(articleCard, "card");
        this.relatedConversationId = str;
        this.card = articleCard;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Article(String str, ArticleCard articleCard, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, articleCard);
    }
}
