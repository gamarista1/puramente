package io.intercom.android.sdk.models;

import Oc.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.a.a.o.b;
import io.intercom.android.sdk.models.Avatar;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÂ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJD\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÇ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\u0010H×\u0001¢\u0006\u0004\b\u001f\u0010\u0016J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 H×\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0002X\u0004¢\u0006\f\n\u0004\b\t\u0010*\u0012\u0004\b+\u0010,R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020-0\u00078F¢\u0006\u0006\u001a\u0004\b.\u0010\r¨\u00060"}, d2 = {"Lio/intercom/android/sdk/models/Metadata;", "Landroid/os/Parcelable;", "", "title", "suffix", "", "timestamp", "", "Lio/intercom/android/sdk/models/Avatar$Builder;", "_avatars", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;)V", "component4", "()Ljava/util/List;", "Landroid/os/Parcel;", "dest", "", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;)Lio/intercom/android/sdk/models/Metadata;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSuffix", "Ljava/lang/Long;", "getTimestamp", "Ljava/util/List;", "get_avatars$annotations", "()V", "Lio/intercom/android/sdk/models/Avatar;", "getAvatars", "avatars", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Metadata implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Metadata> CREATOR = new Creator();
    @c("avatars")
    private final List<Avatar.Builder> _avatars;
    @c("suffix")
    private final String suffix;
    @c("timestamp")
    private final Long timestamp;
    @c("title")
    private final String title;

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Metadata> {
        public final Metadata createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "parcel");
            return new Metadata(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (List) null, 8, (DefaultConstructorMarker) null);
        }

        public final Metadata[] newArray(int i10) {
            return new Metadata[i10];
        }
    }

    public Metadata() {
        this((String) null, (String) null, (Long) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    private final List<Avatar.Builder> component4() {
        return this._avatars;
    }

    public static /* synthetic */ Metadata copy$default(Metadata metadata, String str, String str2, Long l10, List<Avatar.Builder> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = metadata.title;
        }
        if ((i10 & 2) != 0) {
            str2 = metadata.suffix;
        }
        if ((i10 & 4) != 0) {
            l10 = metadata.timestamp;
        }
        if ((i10 & 8) != 0) {
            list = metadata._avatars;
        }
        return metadata.copy(str, str2, l10, list);
    }

    private static /* synthetic */ void get_avatars$annotations() {
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.suffix;
    }

    public final Long component3() {
        return this.timestamp;
    }

    public final Metadata copy(String str, String str2, Long l10, List<Avatar.Builder> list) {
        C6496s.h(str, b.f37461S);
        return new Metadata(str, str2, l10, list);
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Metadata)) {
            return false;
        }
        Metadata metadata = (Metadata) obj;
        return C6496s.c(this.title, metadata.title) && C6496s.c(this.suffix, metadata.suffix) && C6496s.c(this.timestamp, metadata.timestamp) && C6496s.c(this._avatars, metadata._avatars);
    }

    public final List<Avatar> getAvatars() {
        List<Avatar.Builder> list = this._avatars;
        if (list == null) {
            return C6565s.n();
        }
        Iterable<Avatar.Builder> iterable = list;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (Avatar.Builder build : iterable) {
            arrayList.add(build.build());
        }
        return arrayList;
    }

    public final String getSuffix() {
        return this.suffix;
    }

    public final Long getTimestamp() {
        return this.timestamp;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.suffix;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l10 = this.timestamp;
        int hashCode3 = (hashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        List<Avatar.Builder> list = this._avatars;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        return "Metadata(title=" + this.title + ", suffix=" + this.suffix + ", timestamp=" + this.timestamp + ", _avatars=" + this._avatars + ')';
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "dest");
        parcel.writeString(this.title);
        parcel.writeString(this.suffix);
        Long l10 = this.timestamp;
        if (l10 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeLong(l10.longValue());
    }

    public Metadata(String str, String str2, Long l10, List<Avatar.Builder> list) {
        C6496s.h(str, b.f37461S);
        this.title = str;
        this.suffix = str2;
        this.timestamp = l10;
        this._avatars = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Metadata(String str, String str2, Long l10, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : l10, (i10 & 8) != 0 ? null : list);
    }
}
