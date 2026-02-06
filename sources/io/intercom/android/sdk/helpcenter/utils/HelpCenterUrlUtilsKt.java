package io.intercom.android.sdk.helpcenter.utils;

import Sg.p;
import android.content.Context;
import io.intercom.android.sdk.helpcenter.articles.ArticleActivity;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityLauncher;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\u001a%\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a1\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0014\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a-\u0010\u0018\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00162\u0006\u0010\u000e\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a%\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u0006¨\u0006\u001b"}, d2 = {"", "url", "", "helpCenterUrls", "", "isHelpCenterArticleUrl", "(Ljava/lang/String;Ljava/util/Set;)Z", "isHelpCenterCollectionUrl", "lastSegment", "extractIdFromLastSegment", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/Context;", "context", "articleId", "place", "shouldHideReactions", "Llf/M;", "openArticle", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V", "collectionId", "openCollection", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "", "collectionIds", "openCollections", "(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;)V", "isHelpCenterUrl", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HelpCenterUrlUtilsKt {
    public static final String extractIdFromLastSegment(String str) {
        C6496s.h(str, "lastSegment");
        List F02 = p.F0(str, new String[]{"-"}, false, 0, 6, (Object) null);
        if (!F02.isEmpty()) {
            return (String) F02.get(0);
        }
        return "";
    }

    public static final boolean isHelpCenterArticleUrl(String str, Set<String> set) {
        C6496s.h(str, "url");
        C6496s.h(set, "helpCenterUrls");
        if (!isHelpCenterUrl(str, set) || !p.O(str, "/articles/", false, 2, (Object) null)) {
            return false;
        }
        return true;
    }

    public static final boolean isHelpCenterCollectionUrl(String str, Set<String> set) {
        C6496s.h(str, "url");
        C6496s.h(set, "helpCenterUrls");
        if (!isHelpCenterUrl(str, set) || !p.O(str, "/collections/", false, 2, (Object) null)) {
            return false;
        }
        return true;
    }

    private static final boolean isHelpCenterUrl(String str, Set<String> set) {
        Iterable<String> iterable = set;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (String J10 : iterable) {
            if (p.J(str, J10, false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    public static final void openArticle(Context context, String str, String str2) {
        C6496s.h(context, "context");
        C6496s.h(str, "articleId");
        C6496s.h(str2, "place");
        openArticle$default(context, str, str2, false, 8, (Object) null);
    }

    public static /* synthetic */ void openArticle$default(Context context, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        openArticle(context, str, str2, z10);
    }

    public static final void openCollection(Context context, String str, String str2) {
        C6496s.h(context, "context");
        C6496s.h(str, "collectionId");
        C6496s.h(str2, "place");
        IntercomRootActivityLauncher.INSTANCE.startHelpCenterCollection(context, str, str2);
    }

    public static final void openCollections(Context context, List<String> list, String str) {
        C6496s.h(context, "context");
        C6496s.h(list, "collectionIds");
        C6496s.h(str, "place");
        if (list.size() == 1) {
            IntercomRootActivityLauncher.INSTANCE.startHelpCenterCollection(context, (String) C6565s.o0(list), str);
        } else {
            IntercomRootActivityLauncher.INSTANCE.startHelpCenterCollections(context, list, str);
        }
    }

    public static final void openArticle(Context context, String str, String str2, boolean z10) {
        C6496s.h(context, "context");
        C6496s.h(str, "articleId");
        C6496s.h(str2, "place");
        context.startActivity(ArticleActivity.Companion.buildIntent(context, new ArticleActivity.ArticleActivityArguments(str, str2, false, z10, 4, (DefaultConstructorMarker) null)));
    }
}
