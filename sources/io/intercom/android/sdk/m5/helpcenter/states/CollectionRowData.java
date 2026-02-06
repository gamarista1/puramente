package io.intercom.android.sdk.m5.helpcenter.states;

import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001e\u001a\u00020\u0006H×\u0001J\t\u0010\u001f\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010¨\u0006 "}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/states/CollectionRowData;", "", "id", "", "titleText", "descriptionVisibility", "", "descriptionText", "articlesCount", "collectionsCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;II)V", "getId", "()Ljava/lang/String;", "getTitleText", "getDescriptionVisibility", "()I", "getDescriptionText", "getArticlesCount", "getCollectionsCount", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CollectionRowData {
    public static final int $stable = 0;
    private final int articlesCount;
    private final int collectionsCount;
    private final String descriptionText;
    private final int descriptionVisibility;

    /* renamed from: id  reason: collision with root package name */
    private final String f69636id;
    private final String titleText;

    public CollectionRowData(String str, String str2, int i10, String str3, int i11, int i12) {
        C6496s.h(str, "id");
        C6496s.h(str2, "titleText");
        C6496s.h(str3, "descriptionText");
        this.f69636id = str;
        this.titleText = str2;
        this.descriptionVisibility = i10;
        this.descriptionText = str3;
        this.articlesCount = i11;
        this.collectionsCount = i12;
    }

    public static /* synthetic */ CollectionRowData copy$default(CollectionRowData collectionRowData, String str, String str2, int i10, String str3, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = collectionRowData.f69636id;
        }
        if ((i13 & 2) != 0) {
            str2 = collectionRowData.titleText;
        }
        String str4 = str2;
        if ((i13 & 4) != 0) {
            i10 = collectionRowData.descriptionVisibility;
        }
        int i14 = i10;
        if ((i13 & 8) != 0) {
            str3 = collectionRowData.descriptionText;
        }
        String str5 = str3;
        if ((i13 & 16) != 0) {
            i11 = collectionRowData.articlesCount;
        }
        int i15 = i11;
        if ((i13 & 32) != 0) {
            i12 = collectionRowData.collectionsCount;
        }
        return collectionRowData.copy(str, str4, i14, str5, i15, i12);
    }

    public final String component1() {
        return this.f69636id;
    }

    public final String component2() {
        return this.titleText;
    }

    public final int component3() {
        return this.descriptionVisibility;
    }

    public final String component4() {
        return this.descriptionText;
    }

    public final int component5() {
        return this.articlesCount;
    }

    public final int component6() {
        return this.collectionsCount;
    }

    public final CollectionRowData copy(String str, String str2, int i10, String str3, int i11, int i12) {
        C6496s.h(str, "id");
        C6496s.h(str2, "titleText");
        C6496s.h(str3, "descriptionText");
        return new CollectionRowData(str, str2, i10, str3, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionRowData)) {
            return false;
        }
        CollectionRowData collectionRowData = (CollectionRowData) obj;
        return C6496s.c(this.f69636id, collectionRowData.f69636id) && C6496s.c(this.titleText, collectionRowData.titleText) && this.descriptionVisibility == collectionRowData.descriptionVisibility && C6496s.c(this.descriptionText, collectionRowData.descriptionText) && this.articlesCount == collectionRowData.articlesCount && this.collectionsCount == collectionRowData.collectionsCount;
    }

    public final int getArticlesCount() {
        return this.articlesCount;
    }

    public final int getCollectionsCount() {
        return this.collectionsCount;
    }

    public final String getDescriptionText() {
        return this.descriptionText;
    }

    public final int getDescriptionVisibility() {
        return this.descriptionVisibility;
    }

    public final String getId() {
        return this.f69636id;
    }

    public final String getTitleText() {
        return this.titleText;
    }

    public int hashCode() {
        return (((((((((this.f69636id.hashCode() * 31) + this.titleText.hashCode()) * 31) + Integer.hashCode(this.descriptionVisibility)) * 31) + this.descriptionText.hashCode()) * 31) + Integer.hashCode(this.articlesCount)) * 31) + Integer.hashCode(this.collectionsCount);
    }

    public String toString() {
        return "CollectionRowData(id=" + this.f69636id + ", titleText=" + this.titleText + ", descriptionVisibility=" + this.descriptionVisibility + ", descriptionText=" + this.descriptionText + ", articlesCount=" + this.articlesCount + ", collectionsCount=" + this.collectionsCount + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CollectionRowData(String str, String str2, int i10, String str3, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i10, str3, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? 0 : i12);
    }
}
