package io.intercom.android.sdk.ui.extension;

import Sg.p;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0007"}, d2 = {"isVideo", "", "", "isImage", "isAudio", "isDocument", "isPdf", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ContentTypeExtensionKt {
    public static final boolean isAudio(String str) {
        C6496s.h(str, "<this>");
        return p.O(str, "audio", false, 2, (Object) null);
    }

    public static final boolean isDocument(String str) {
        C6496s.h(str, "<this>");
        if (p.O(str, "application", false, 2, (Object) null) || p.O(str, AttributeType.TEXT, false, 2, (Object) null)) {
            return true;
        }
        return false;
    }

    public static final boolean isImage(String str) {
        C6496s.h(str, "<this>");
        return p.O(str, AppearanceType.IMAGE, false, 2, (Object) null);
    }

    public static final boolean isPdf(String str) {
        C6496s.h(str, "<this>");
        return p.O(str, "pdf", false, 2, (Object) null);
    }

    public static final boolean isVideo(String str) {
        C6496s.h(str, "<this>");
        return p.O(str, "video", false, 2, (Object) null);
    }
}
