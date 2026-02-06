package io.intercom.android.sdk.api;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import sf.C6714a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/api/Platform;", "", "identifier", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "Cordova", "ReactNative", "Flutter", "Native", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum Platform {
    Cordova(PlatformIdentifierUtilKt.CORDOVA_HEADER),
    ReactNative(PlatformIdentifierUtilKt.REACT_NATIVE_HEADER),
    Flutter(PlatformIdentifierUtilKt.FLUTTER_HEADER),
    Native(PlatformIdentifierUtilKt.NATIVE_SDK);
    
    private final String identifier;

    static {
        Platform[] $values;
        $ENTRIES = C6714a.a($values);
    }

    private Platform(String str) {
        this.identifier = str;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public final String getIdentifier() {
        return this.identifier;
    }
}
