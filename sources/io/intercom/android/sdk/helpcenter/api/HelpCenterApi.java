package io.intercom.android.sdk.helpcenter.api;

import gi.a;
import gi.o;
import gi.s;
import gi.t;
import io.intercom.android.sdk.helpcenter.articles.ArticleResponse;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection;
import io.intercom.android.sdk.helpcenter.search.HelpCenterArticleSearchResponse;
import io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import lf.C6514M;
import qf.C6658d;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J2\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0014\b\u0003\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\b\u0010\tJ6\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\n\u001a\u00020\u00032\u0014\b\u0003\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\f\u0010\rJH\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00060\u00052\b\b\u0001\u0010\u000e\u001a\u00020\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0014\b\u0003\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0011\u0010\u0012J`\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00052\b\b\u0001\u0010\u0013\u001a\u00020\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0016\u001a\u00020\u00032\b\b\u0003\u0010\u0018\u001a\u00020\u00172\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0014\b\u0003\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u001a\u0010\u001bJ6\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00052\b\b\u0001\u0010\u0013\u001a\u00020\u00032\u0014\b\u0003\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u001d\u0010\r¨\u0006\u001e"}, d2 = {"Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;", "", "", "", "options", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "", "Lio/intercom/android/sdk/helpcenter/collections/HelpCenterCollection;", "fetchCollections", "(Ljava/util/Map;Lqf/d;)Ljava/lang/Object;", "id", "Lio/intercom/android/sdk/helpcenter/sections/HelpCenterCollectionContent;", "fetchCollectionDetails", "(Ljava/lang/String;Ljava/util/Map;Lqf/d;)Ljava/lang/Object;", "searchPhrase", "articleSource", "Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse;", "searchForArticles", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lqf/d;)Ljava/lang/Object;", "articleId", "", "reactionIndex", "articleContentId", "", "allowAutoResponses", "Llf/M;", "reactToArticle", "(Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;Ljava/util/Map;Lqf/d;)Ljava/lang/Object;", "Lio/intercom/android/sdk/helpcenter/articles/ArticleResponse;", "fetchArticle", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface HelpCenterApi {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object fetchArticle$default(HelpCenterApi helpCenterApi, String str, Map<String, String> map, C6658d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    map = HelpCenterApiHelper.INSTANCE.addDefaultOptions();
                }
                return helpCenterApi.fetchArticle(str, map, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchArticle");
        }

        public static /* synthetic */ Object fetchCollectionDetails$default(HelpCenterApi helpCenterApi, String str, Map<String, String> map, C6658d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    map = HelpCenterApiHelper.INSTANCE.addDefaultOptions();
                }
                return helpCenterApi.fetchCollectionDetails(str, map, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchCollectionDetails");
        }

        public static /* synthetic */ Object fetchCollections$default(HelpCenterApi helpCenterApi, Map<String, String> map, C6658d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    map = HelpCenterApiHelper.INSTANCE.addDefaultOptions();
                }
                return helpCenterApi.fetchCollections(map, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchCollections");
        }

        public static /* synthetic */ Object reactToArticle$default(HelpCenterApi helpCenterApi, String str, int i10, String str2, boolean z10, String str3, Map map, C6658d dVar, int i11, Object obj) {
            boolean z11;
            String str4;
            Map<String, String> map2;
            if (obj == null) {
                if ((i11 & 8) != 0) {
                    z11 = false;
                } else {
                    z11 = z10;
                }
                if ((i11 & 16) != 0) {
                    str4 = null;
                } else {
                    str4 = str3;
                }
                if ((i11 & 32) != 0) {
                    map2 = HelpCenterApiHelper.INSTANCE.addDefaultOptions();
                } else {
                    map2 = map;
                }
                return helpCenterApi.reactToArticle(str, i10, str2, z11, str4, map2, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reactToArticle");
        }

        public static /* synthetic */ Object searchForArticles$default(HelpCenterApi helpCenterApi, String str, String str2, Map<String, String> map, C6658d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    str2 = null;
                }
                if ((i10 & 4) != 0) {
                    map = HelpCenterApiHelper.INSTANCE.addDefaultOptions();
                }
                return helpCenterApi.searchForArticles(str, str2, map, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: searchForArticles");
        }
    }

    @o("articles/{articleId}")
    Object fetchArticle(@s("articleId") String str, @a Map<String, String> map, C6658d<? super NetworkResponse<ArticleResponse>> dVar);

    @o("help_center/collections/{id}")
    Object fetchCollectionDetails(@s("id") String str, @a Map<String, String> map, C6658d<? super NetworkResponse<HelpCenterCollectionContent>> dVar);

    @o("help_center/collections")
    Object fetchCollections(@a Map<String, String> map, C6658d<? super NetworkResponse<? extends List<HelpCenterCollection>>> dVar);

    @o("articles/{articleId}/react")
    Object reactToArticle(@s("articleId") String str, @t("reaction_index") int i10, @t("article_content_id") String str2, @t("allow_auto_responses") boolean z10, @t("article_source") String str3, @a Map<String, String> map, C6658d<? super NetworkResponse<C6514M>> dVar);

    @o("help_center/search")
    Object searchForArticles(@t("phrase") String str, @t("article_source") String str2, @a Map<String, String> map, C6658d<? super NetworkResponse<? extends List<HelpCenterArticleSearchResponse>>> dVar);
}
