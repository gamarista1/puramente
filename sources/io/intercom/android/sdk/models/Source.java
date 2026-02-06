package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.a.a.o.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/models/Source;", "Landroid/os/Parcelable;", "", "id", "type", "title", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getType", "getTitle", "getUrl", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Source implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<Source> CREATOR = new Creator();

    /* renamed from: id  reason: collision with root package name */
    private final String f70040id;
    private final String title;
    private final String type;
    private final String url;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Source> {
        public final Source createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "parcel");
            return new Source(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Source[] newArray(int i10) {
            return new Source[i10];
        }
    }

    public Source(String str, String str2, String str3, String str4) {
        C6496s.h(str, "id");
        C6496s.h(str2, "type");
        C6496s.h(str3, b.f37461S);
        C6496s.h(str4, "url");
        this.f70040id = str;
        this.type = str2;
        this.title = str3;
        this.url = str4;
    }

    public final int describeContents() {
        return 0;
    }

    public final String getId() {
        return this.f70040id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "dest");
        parcel.writeString(this.f70040id);
        parcel.writeString(this.type);
        parcel.writeString(this.title);
        parcel.writeString(this.url);
    }
}
