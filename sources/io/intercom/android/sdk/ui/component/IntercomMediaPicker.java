package io.intercom.android.sdk.ui.component;

import Sg.p;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import h.C2012a;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6535s;
import mf.C6559l;
import mf.C6565s;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B%\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0019\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 J'\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010!\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010&R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010'¨\u0006("}, d2 = {"Lio/intercom/android/sdk/ui/component/IntercomMediaPicker;", "Lh/a;", "", "", "Landroid/net/Uri;", "Lio/intercom/android/sdk/ui/component/MediaType;", "mediaType", "", "trustedFileExtensions", "", "maxSelectionCount", "<init>", "(Lio/intercom/android/sdk/ui/component/MediaType;Ljava/util/Set;I)V", "input", "Landroid/content/Intent;", "getIntent", "(Ljava/lang/String;)Landroid/content/Intent;", "", "getVideoMimeTypes", "()[Ljava/lang/String;", "getImageMimeTypes", "getDocumentMimeTypes", "getAllMimeTypes", "supportedTypes", "getPhotoPickerIntent", "([Ljava/lang/String;)Landroid/content/Intent;", "getNativePickerIntent", "getClipDataUris", "(Landroid/content/Intent;)Ljava/util/List;", "Landroid/content/Context;", "context", "createIntent", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Ljava/util/List;", "Lio/intercom/android/sdk/ui/component/MediaType;", "Ljava/util/Set;", "I", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class IntercomMediaPicker extends C2012a {
    private final int maxSelectionCount;
    private final MediaType mediaType;
    private final Set<String> trustedFileExtensions;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                io.intercom.android.sdk.ui.component.MediaType[] r0 = io.intercom.android.sdk.ui.component.MediaType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.intercom.android.sdk.ui.component.MediaType r1 = io.intercom.android.sdk.ui.component.MediaType.All     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                io.intercom.android.sdk.ui.component.MediaType r1 = io.intercom.android.sdk.ui.component.MediaType.DocumentOnly     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                io.intercom.android.sdk.ui.component.MediaType r1 = io.intercom.android.sdk.ui.component.MediaType.ImageAndVideo     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                io.intercom.android.sdk.ui.component.MediaType r1 = io.intercom.android.sdk.ui.component.MediaType.ImageOnly     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                io.intercom.android.sdk.ui.component.MediaType r1 = io.intercom.android.sdk.ui.component.MediaType.VideOnly     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.ui.component.IntercomMediaPicker.WhenMappings.<clinit>():void");
        }
    }

    public IntercomMediaPicker(MediaType mediaType2, Set<String> set, int i10) {
        C6496s.h(mediaType2, "mediaType");
        C6496s.h(set, "trustedFileExtensions");
        this.mediaType = mediaType2;
        this.trustedFileExtensions = set;
        this.maxSelectionCount = i10;
    }

    private final String[] getAllMimeTypes() {
        ArrayList arrayList = new ArrayList();
        for (String mimeTypeFromExtension : this.trustedFileExtensions) {
            String mimeTypeFromExtension2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(mimeTypeFromExtension);
            if (mimeTypeFromExtension2 != null) {
                arrayList.add(mimeTypeFromExtension2);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private final List<Uri> getClipDataUris(Intent intent) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Uri data = intent.getData();
        if (data != null) {
            linkedHashSet.add(data);
        }
        ClipData clipData = intent.getClipData();
        if (clipData == null && linkedHashSet.isEmpty()) {
            return C6565s.n();
        }
        if (clipData != null) {
            int itemCount = clipData.getItemCount();
            for (int i10 = 0; i10 < itemCount; i10++) {
                Uri uri = clipData.getItemAt(i10).getUri();
                if (uri != null) {
                    linkedHashSet.add(uri);
                }
            }
        }
        return new ArrayList(linkedHashSet);
    }

    private final String[] getDocumentMimeTypes() {
        String[] allMimeTypes = getAllMimeTypes();
        ArrayList arrayList = new ArrayList();
        for (String str : allMimeTypes) {
            if (p.O(str, "application", false, 2, (Object) null) || p.O(str, AttributeType.TEXT, false, 2, (Object) null)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private final String[] getImageMimeTypes() {
        String[] allMimeTypes = getAllMimeTypes();
        ArrayList arrayList = new ArrayList();
        for (String str : allMimeTypes) {
            if (p.O(str, AppearanceType.IMAGE, false, 2, (Object) null)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private final Intent getIntent(String str) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.mediaType.ordinal()];
        boolean z10 = true;
        if (i10 == 1) {
            Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").putExtra("android.intent.extra.MIME_TYPES", getAllMimeTypes()).setType(str);
            if (this.maxSelectionCount <= 1) {
                z10 = false;
            }
            Intent putExtra = type.putExtra("android.intent.extra.ALLOW_MULTIPLE", z10);
            C6496s.e(putExtra);
            return putExtra;
        } else if (i10 == 2) {
            return getNativePickerIntent(getDocumentMimeTypes());
        } else {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        throw new C6535s();
                    } else if (MediaPickerButtonKt.isPhotoPickerAvailable()) {
                        return getPhotoPickerIntent(getVideoMimeTypes());
                    } else {
                        return getNativePickerIntent(getVideoMimeTypes());
                    }
                } else if (MediaPickerButtonKt.isPhotoPickerAvailable()) {
                    return getPhotoPickerIntent(getImageMimeTypes());
                } else {
                    return getNativePickerIntent(getImageMimeTypes());
                }
            } else if (MediaPickerButtonKt.isPhotoPickerAvailable()) {
                return getPhotoPickerIntent((String[]) C6559l.H(getImageMimeTypes(), getVideoMimeTypes()));
            } else {
                return getNativePickerIntent((String[]) C6559l.H(getImageMimeTypes(), getVideoMimeTypes()));
            }
        }
    }

    private final Intent getNativePickerIntent(String[] strArr) {
        boolean z10 = true;
        Intent addFlags = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType((String) C6559l.b0(strArr)).putExtra("android.intent.extra.MIME_TYPES", strArr).addFlags(1);
        if (this.maxSelectionCount <= 1) {
            z10 = false;
        }
        Intent putExtra = addFlags.putExtra("android.intent.extra.ALLOW_MULTIPLE", z10);
        C6496s.g(putExtra, "putExtra(...)");
        return putExtra;
    }

    private final Intent getPhotoPickerIntent(String[] strArr) {
        Intent intent = new Intent("android.provider.action.PICK_IMAGES");
        intent.putExtra("android.intent.extra.MIME_TYPES", strArr);
        int i10 = this.maxSelectionCount;
        if (i10 > 1) {
            if (i10 <= MediaStore.getPickImagesMaxLimit()) {
                intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", this.maxSelectionCount);
            } else {
                throw new IllegalArgumentException("Max items must be less or equals MediaStore.getPickImagesMaxLimit()");
            }
        }
        return intent;
    }

    private final String[] getVideoMimeTypes() {
        String[] allMimeTypes = getAllMimeTypes();
        ArrayList arrayList = new ArrayList();
        for (String str : allMimeTypes) {
            if (p.O(str, "video", false, 2, (Object) null)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public Intent createIntent(Context context, String str) {
        C6496s.h(context, "context");
        C6496s.h(str, MetricTracker.Object.INPUT);
        return getIntent(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0007, code lost:
        r2 = getClipDataUris(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<android.net.Uri> parseResult(int r2, android.content.Intent r3) {
        /*
            r1 = this;
            r0 = -1
            if (r2 != r0) goto L_0x0004
            goto L_0x0005
        L_0x0004:
            r3 = 0
        L_0x0005:
            if (r3 == 0) goto L_0x000e
            java.util.List r2 = r1.getClipDataUris(r3)
            if (r2 == 0) goto L_0x000e
            goto L_0x0012
        L_0x000e:
            java.util.List r2 = mf.C6565s.n()
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.ui.component.IntercomMediaPicker.parseResult(int, android.content.Intent):java.util.List");
    }
}
