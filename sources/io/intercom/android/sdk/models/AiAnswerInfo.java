package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lio/intercom/android/sdk/models/AiAnswerInfo;", "Landroid/os/Parcelable;", "", "text", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "isEmpty", "()Z", "Landroid/os/Parcel;", "dest", "", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "getUrl", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AiAnswerInfo implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<AiAnswerInfo> CREATOR = new Creator();
    private final String text;
    private final String url;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AiAnswerInfo> {
        public final AiAnswerInfo createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "parcel");
            return new AiAnswerInfo(parcel.readString(), parcel.readString());
        }

        public final AiAnswerInfo[] newArray(int i10) {
            return new AiAnswerInfo[i10];
        }
    }

    public AiAnswerInfo(String str, String str2) {
        C6496s.h(str, AttributeType.TEXT);
        this.text = str;
        this.url = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean isEmpty() {
        String str;
        if (this.text.length() == 0 && ((str = this.url) == null || str.length() == 0)) {
            return true;
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "dest");
        parcel.writeString(this.text);
        parcel.writeString(this.url);
    }
}
