package io.intercom.android.sdk.ui.preview.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017JB\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u001a\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u001fH×\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b(\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b)\u0010\u0017¨\u0006*"}, d2 = {"Lio/intercom/android/sdk/ui/preview/data/DownloadState;", "Landroid/os/Parcelable;", "", "showDownloadAction", "", "fileSavingText", "fileSavedText", "saveFailedText", "permissionDeniedText", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "copy", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/intercom/android/sdk/ui/preview/data/DownloadState;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowDownloadAction", "Ljava/lang/String;", "getFileSavingText", "getFileSavedText", "getSaveFailedText", "getPermissionDeniedText", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DownloadState implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DownloadState> CREATOR = new Creator();
    private final String fileSavedText;
    private final String fileSavingText;
    private final String permissionDeniedText;
    private final String saveFailedText;
    private final boolean showDownloadAction;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DownloadState> {
        public final DownloadState createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "parcel");
            return new DownloadState(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final DownloadState[] newArray(int i10) {
            return new DownloadState[i10];
        }
    }

    public DownloadState(boolean z10, String str, String str2, String str3, String str4) {
        C6496s.h(str, "fileSavingText");
        C6496s.h(str2, "fileSavedText");
        C6496s.h(str3, "saveFailedText");
        C6496s.h(str4, "permissionDeniedText");
        this.showDownloadAction = z10;
        this.fileSavingText = str;
        this.fileSavedText = str2;
        this.saveFailedText = str3;
        this.permissionDeniedText = str4;
    }

    public static /* synthetic */ DownloadState copy$default(DownloadState downloadState, boolean z10, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = downloadState.showDownloadAction;
        }
        if ((i10 & 2) != 0) {
            str = downloadState.fileSavingText;
        }
        String str5 = str;
        if ((i10 & 4) != 0) {
            str2 = downloadState.fileSavedText;
        }
        String str6 = str2;
        if ((i10 & 8) != 0) {
            str3 = downloadState.saveFailedText;
        }
        String str7 = str3;
        if ((i10 & 16) != 0) {
            str4 = downloadState.permissionDeniedText;
        }
        return downloadState.copy(z10, str5, str6, str7, str4);
    }

    public final boolean component1() {
        return this.showDownloadAction;
    }

    public final String component2() {
        return this.fileSavingText;
    }

    public final String component3() {
        return this.fileSavedText;
    }

    public final String component4() {
        return this.saveFailedText;
    }

    public final String component5() {
        return this.permissionDeniedText;
    }

    public final DownloadState copy(boolean z10, String str, String str2, String str3, String str4) {
        C6496s.h(str, "fileSavingText");
        C6496s.h(str2, "fileSavedText");
        C6496s.h(str3, "saveFailedText");
        C6496s.h(str4, "permissionDeniedText");
        return new DownloadState(z10, str, str2, str3, str4);
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadState)) {
            return false;
        }
        DownloadState downloadState = (DownloadState) obj;
        return this.showDownloadAction == downloadState.showDownloadAction && C6496s.c(this.fileSavingText, downloadState.fileSavingText) && C6496s.c(this.fileSavedText, downloadState.fileSavedText) && C6496s.c(this.saveFailedText, downloadState.saveFailedText) && C6496s.c(this.permissionDeniedText, downloadState.permissionDeniedText);
    }

    public final String getFileSavedText() {
        return this.fileSavedText;
    }

    public final String getFileSavingText() {
        return this.fileSavingText;
    }

    public final String getPermissionDeniedText() {
        return this.permissionDeniedText;
    }

    public final String getSaveFailedText() {
        return this.saveFailedText;
    }

    public final boolean getShowDownloadAction() {
        return this.showDownloadAction;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.showDownloadAction) * 31) + this.fileSavingText.hashCode()) * 31) + this.fileSavedText.hashCode()) * 31) + this.saveFailedText.hashCode()) * 31) + this.permissionDeniedText.hashCode();
    }

    public String toString() {
        return "DownloadState(showDownloadAction=" + this.showDownloadAction + ", fileSavingText=" + this.fileSavingText + ", fileSavedText=" + this.fileSavedText + ", saveFailedText=" + this.saveFailedText + ", permissionDeniedText=" + this.permissionDeniedText + ')';
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "dest");
        parcel.writeInt(this.showDownloadAction ? 1 : 0);
        parcel.writeString(this.fileSavingText);
        parcel.writeString(this.fileSavedText);
        parcel.writeString(this.saveFailedText);
        parcel.writeString(this.permissionDeniedText);
    }
}
