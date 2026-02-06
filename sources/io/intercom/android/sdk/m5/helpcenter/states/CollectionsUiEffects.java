package io.intercom.android.sdk.m5.helpcenter.states;

import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiEffects;", "", "<init>", "()V", "NavigateToCollectionContent", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiEffects$NavigateToCollectionContent;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CollectionsUiEffects {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiEffects$NavigateToCollectionContent;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiEffects;", "collectionId", "", "<init>", "(Ljava/lang/String;)V", "getCollectionId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NavigateToCollectionContent extends CollectionsUiEffects {
        public static final int $stable = 0;
        private final String collectionId;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NavigateToCollectionContent(String str) {
            super((DefaultConstructorMarker) null);
            C6496s.h(str, "collectionId");
            this.collectionId = str;
        }

        public static /* synthetic */ NavigateToCollectionContent copy$default(NavigateToCollectionContent navigateToCollectionContent, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = navigateToCollectionContent.collectionId;
            }
            return navigateToCollectionContent.copy(str);
        }

        public final String component1() {
            return this.collectionId;
        }

        public final NavigateToCollectionContent copy(String str) {
            C6496s.h(str, "collectionId");
            return new NavigateToCollectionContent(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NavigateToCollectionContent) && C6496s.c(this.collectionId, ((NavigateToCollectionContent) obj).collectionId);
        }

        public final String getCollectionId() {
            return this.collectionId;
        }

        public int hashCode() {
            return this.collectionId.hashCode();
        }

        public String toString() {
            return "NavigateToCollectionContent(collectionId=" + this.collectionId + ')';
        }
    }

    public /* synthetic */ CollectionsUiEffects(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CollectionsUiEffects() {
    }
}
