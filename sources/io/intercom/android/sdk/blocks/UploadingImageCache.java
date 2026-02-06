package io.intercom.android.sdk.blocks;

import android.net.Uri;
import io.intercom.android.sdk.GalleryImage;
import java.util.HashMap;
import java.util.Map;

public class UploadingImageCache {
    private final Map<String, Uri> localImageUris;

    public UploadingImageCache() {
        this(new HashMap());
    }

    /* access modifiers changed from: package-private */
    public Uri getLocalImageUriForRemoteUrl(String str) {
        return this.localImageUris.get(str);
    }

    public void put(String str, GalleryImage galleryImage) {
        this.localImageUris.put(str, galleryImage.getUri());
    }

    UploadingImageCache(Map<String, Uri> map) {
        this.localImageUris = map;
    }
}
