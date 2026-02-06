package io.intercom.android.sdk.lightcompressor.config;

import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lio/intercom/android/sdk/lightcompressor/config/SharedStorageConfiguration;", "", "saveAt", "Lio/intercom/android/sdk/lightcompressor/config/SaveLocation;", "subFolderName", "", "<init>", "(Lio/intercom/android/sdk/lightcompressor/config/SaveLocation;Ljava/lang/String;)V", "getSaveAt", "()Lio/intercom/android/sdk/lightcompressor/config/SaveLocation;", "setSaveAt", "(Lio/intercom/android/sdk/lightcompressor/config/SaveLocation;)V", "getSubFolderName", "()Ljava/lang/String;", "setSubFolderName", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-lightcompressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SharedStorageConfiguration {
    private SaveLocation saveAt;
    private String subFolderName;

    public SharedStorageConfiguration() {
        this((SaveLocation) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SharedStorageConfiguration copy$default(SharedStorageConfiguration sharedStorageConfiguration, SaveLocation saveLocation, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            saveLocation = sharedStorageConfiguration.saveAt;
        }
        if ((i10 & 2) != 0) {
            str = sharedStorageConfiguration.subFolderName;
        }
        return sharedStorageConfiguration.copy(saveLocation, str);
    }

    public final SaveLocation component1() {
        return this.saveAt;
    }

    public final String component2() {
        return this.subFolderName;
    }

    public final SharedStorageConfiguration copy(SaveLocation saveLocation, String str) {
        return new SharedStorageConfiguration(saveLocation, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedStorageConfiguration)) {
            return false;
        }
        SharedStorageConfiguration sharedStorageConfiguration = (SharedStorageConfiguration) obj;
        return this.saveAt == sharedStorageConfiguration.saveAt && C6496s.c(this.subFolderName, sharedStorageConfiguration.subFolderName);
    }

    public final SaveLocation getSaveAt() {
        return this.saveAt;
    }

    public final String getSubFolderName() {
        return this.subFolderName;
    }

    public int hashCode() {
        SaveLocation saveLocation = this.saveAt;
        int i10 = 0;
        int hashCode = (saveLocation == null ? 0 : saveLocation.hashCode()) * 31;
        String str = this.subFolderName;
        if (str != null) {
            i10 = str.hashCode();
        }
        return hashCode + i10;
    }

    public final void setSaveAt(SaveLocation saveLocation) {
        this.saveAt = saveLocation;
    }

    public final void setSubFolderName(String str) {
        this.subFolderName = str;
    }

    public String toString() {
        return "SharedStorageConfiguration(saveAt=" + this.saveAt + ", subFolderName=" + this.subFolderName + ')';
    }

    public SharedStorageConfiguration(SaveLocation saveLocation, String str) {
        this.saveAt = saveLocation;
        this.subFolderName = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SharedStorageConfiguration(SaveLocation saveLocation, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : saveLocation, (i10 & 2) != 0 ? null : str);
    }
}
