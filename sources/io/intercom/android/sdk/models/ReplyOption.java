package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\tH×\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H×\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006\u001f"}, d2 = {"Lio/intercom/android/sdk/models/ReplyOption;", "Landroid/os/Parcelable;", "", "text", "uuid", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lio/intercom/android/sdk/models/ReplyOption;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "getUuid", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReplyOption implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ReplyOption> CREATOR = new Creator();
    private final String text;
    private final String uuid;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ReplyOption> {
        public final ReplyOption createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "parcel");
            return new ReplyOption(parcel.readString(), parcel.readString());
        }

        public final ReplyOption[] newArray(int i10) {
            return new ReplyOption[i10];
        }
    }

    public ReplyOption(String str, String str2) {
        C6496s.h(str, AttributeType.TEXT);
        C6496s.h(str2, "uuid");
        this.text = str;
        this.uuid = str2;
    }

    public static /* synthetic */ ReplyOption copy$default(ReplyOption replyOption, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = replyOption.text;
        }
        if ((i10 & 2) != 0) {
            str2 = replyOption.uuid;
        }
        return replyOption.copy(str, str2);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.uuid;
    }

    public final ReplyOption copy(String str, String str2) {
        C6496s.h(str, AttributeType.TEXT);
        C6496s.h(str2, "uuid");
        return new ReplyOption(str, str2);
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReplyOption)) {
            return false;
        }
        ReplyOption replyOption = (ReplyOption) obj;
        return C6496s.c(this.text, replyOption.text) && C6496s.c(this.uuid, replyOption.uuid);
    }

    public final String getText() {
        return this.text;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + this.uuid.hashCode();
    }

    public String toString() {
        return "ReplyOption(text=" + this.text + ", uuid=" + this.uuid + ')';
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "dest");
        parcel.writeString(this.text);
        parcel.writeString(this.uuid);
    }
}
