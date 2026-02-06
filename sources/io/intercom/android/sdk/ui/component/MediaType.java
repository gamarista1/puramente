package io.intercom.android.sdk.ui.component;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import sf.C6714a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lio/intercom/android/sdk/ui/component/MediaType;", "", "<init>", "(Ljava/lang/String;I)V", "ImageOnly", "VideOnly", "DocumentOnly", "ImageAndVideo", "All", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum MediaType {
    ImageOnly,
    VideOnly,
    DocumentOnly,
    ImageAndVideo,
    All;

    static {
        MediaType[] $values;
        $ENTRIES = C6714a.a($values);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }
}
