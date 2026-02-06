package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;

public final class a extends l {
    public a(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    public Class a() {
        return AssetFileDescriptor.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void c(AssetFileDescriptor assetFileDescriptor) {
        assetFileDescriptor.close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public AssetFileDescriptor e(Uri uri, ContentResolver contentResolver) {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }
}
