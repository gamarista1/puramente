package io.intercom.android.sdk.helpcenter.api;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/intercom/android/sdk/helpcenter/api/SearchRequestCallback;", "", "", "Lio/intercom/android/sdk/helpcenter/api/HelpCenterArticleSearchResult;", "response", "Llf/M;", "onComplete", "(Ljava/util/List;)V", "", "errorCode", "onError", "(I)V", "onFailure", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SearchRequestCallback {
    void onComplete(List<HelpCenterArticleSearchResult> list);

    void onError(int i10);

    void onFailure();
}
