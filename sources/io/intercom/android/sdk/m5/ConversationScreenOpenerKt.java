package io.intercom.android.sdk.m5;

import android.content.Context;
import android.content.Intent;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgsKt;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aK\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\b\u0002\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001aC\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroid/content/Context;", "context", "", "conversationId", "Landroid/content/Intent;", "getConversationIntent", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "initialMessage", "", "isLaunchedProgrammatically", "Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;", "articleMetadata", "Ljava/lang/Class;", "activityName", "getComposerIntent", "(Landroid/content/Context;Ljava/lang/String;ZLio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;Ljava/lang/String;Ljava/lang/Class;)Landroid/content/Intent;", "Llf/M;", "openComposer", "(Landroid/content/Context;Ljava/lang/String;ZLio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;Ljava/lang/String;)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ConversationScreenOpenerKt {
    public static final Intent getComposerIntent(Context context, String str, boolean z10, ArticleMetadata articleMetadata, String str2, Class<?> cls) {
        String str3;
        String str4;
        C6496s.h(context, "context");
        C6496s.h(str, "initialMessage");
        C6496s.h(cls, "activityName");
        if (articleMetadata != null) {
            str3 = articleMetadata.getId();
        } else {
            str3 = null;
        }
        if (articleMetadata != null) {
            str4 = articleMetadata.getTitle();
        } else {
            str4 = null;
        }
        return IntercomRootActivityArgsKt.getIntentForArgs(context, new IntercomRootActivityArgs.ConversationScreenArgs(str2, str, z10, str3, str4, (TransitionArgs) null, 32, (DefaultConstructorMarker) null), cls);
    }

    public static /* synthetic */ Intent getComposerIntent$default(Context context, String str, boolean z10, ArticleMetadata articleMetadata, String str2, Class<IntercomRootActivity> cls, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "";
        }
        String str3 = str;
        if ((i10 & 32) != 0) {
            cls = IntercomRootActivity.class;
        }
        return getComposerIntent(context, str3, z10, articleMetadata, str2, cls);
    }

    public static final Intent getConversationIntent(Context context, String str) {
        C6496s.h(context, "context");
        return IntercomRootActivityArgsKt.getIntentForArgs$default(context, new IntercomRootActivityArgs.ConversationScreenArgs(str, "", false, (String) null, (String) null, (TransitionArgs) null, 48, (DefaultConstructorMarker) null), (Class) null, 4, (Object) null);
    }

    public static final void openComposer(Context context, String str, boolean z10, ArticleMetadata articleMetadata, String str2) {
        C6496s.h(context, "context");
        C6496s.h(str, "initialMessage");
        context.startActivity(getComposerIntent$default(context, str, z10, articleMetadata, str2, (Class) null, 32, (Object) null));
    }

    public static /* synthetic */ void openComposer$default(Context context, String str, boolean z10, ArticleMetadata articleMetadata, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "";
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            articleMetadata = null;
        }
        if ((i10 & 16) != 0) {
            str2 = null;
        }
        openComposer(context, str, z10, articleMetadata, str2);
    }
}
