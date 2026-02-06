package io.intercom.android.sdk.helpcenter.articles;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\nH×\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H×\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\u0005\u0010\u0014¨\u0006 "}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleStatsArguments;", "Landroid/os/Parcelable;", "", "articleId", "", "isFromSearchBrowse", "<init>", "(Ljava/lang/String;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lio/intercom/android/sdk/helpcenter/articles/ArticleStatsArguments;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getArticleId", "Z", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ArticleStatsArguments implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ArticleStatsArguments> CREATOR = new Creator();
    private final String articleId;
    private final boolean isFromSearchBrowse;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ArticleStatsArguments> {
        public final ArticleStatsArguments createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "parcel");
            return new ArticleStatsArguments(parcel.readString(), parcel.readInt() != 0);
        }

        public final ArticleStatsArguments[] newArray(int i10) {
            return new ArticleStatsArguments[i10];
        }
    }

    public ArticleStatsArguments() {
        this((String) null, false, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ArticleStatsArguments copy$default(ArticleStatsArguments articleStatsArguments, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = articleStatsArguments.articleId;
        }
        if ((i10 & 2) != 0) {
            z10 = articleStatsArguments.isFromSearchBrowse;
        }
        return articleStatsArguments.copy(str, z10);
    }

    public final String component1() {
        return this.articleId;
    }

    public final boolean component2() {
        return this.isFromSearchBrowse;
    }

    public final ArticleStatsArguments copy(String str, boolean z10) {
        C6496s.h(str, "articleId");
        return new ArticleStatsArguments(str, z10);
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArticleStatsArguments)) {
            return false;
        }
        ArticleStatsArguments articleStatsArguments = (ArticleStatsArguments) obj;
        return C6496s.c(this.articleId, articleStatsArguments.articleId) && this.isFromSearchBrowse == articleStatsArguments.isFromSearchBrowse;
    }

    public final String getArticleId() {
        return this.articleId;
    }

    public int hashCode() {
        return (this.articleId.hashCode() * 31) + Boolean.hashCode(this.isFromSearchBrowse);
    }

    public final boolean isFromSearchBrowse() {
        return this.isFromSearchBrowse;
    }

    public String toString() {
        return "ArticleStatsArguments(articleId=" + this.articleId + ", isFromSearchBrowse=" + this.isFromSearchBrowse + ')';
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "dest");
        parcel.writeString(this.articleId);
        parcel.writeInt(this.isFromSearchBrowse ? 1 : 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ArticleStatsArguments(String str) {
        this(str, false, 2, (DefaultConstructorMarker) null);
        C6496s.h(str, "articleId");
    }

    public ArticleStatsArguments(String str, boolean z10) {
        C6496s.h(str, "articleId");
        this.articleId = str;
        this.isFromSearchBrowse = z10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ArticleStatsArguments(String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? false : z10);
    }
}
