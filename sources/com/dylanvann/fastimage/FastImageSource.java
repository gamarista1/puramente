package com.dylanvann.fastimage;

import Z4.h;
import Z4.i;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import q8.C3959a;

public class FastImageSource {
    private static final String ANDROID_CONTENT_SCHEME = "content";
    private static final String ANDROID_RESOURCE_SCHEME = "android.resource";
    private static final String DATA_SCHEME = "data";
    private static final String LOCAL_FILE_SCHEME = "file";
    private static final String LOCAL_RESOURCE_SCHEME = "res";
    private final i mHeaders;
    private String mSource;
    private Uri mUri;

    public FastImageSource(Context context, String str) {
        this(context, str, (i) null);
    }

    public static boolean isBase64Uri(Uri uri) {
        return DATA_SCHEME.equals(uri.getScheme());
    }

    public static boolean isContentUri(Uri uri) {
        return ANDROID_CONTENT_SCHEME.equals(uri.getScheme());
    }

    public static boolean isLocalFileUri(Uri uri) {
        return LOCAL_FILE_SCHEME.equals(uri.getScheme());
    }

    public static boolean isLocalResourceUri(Uri uri) {
        return LOCAL_RESOURCE_SCHEME.equals(uri.getScheme());
    }

    public static boolean isResourceUri(Uri uri) {
        return ANDROID_RESOURCE_SCHEME.equals(uri.getScheme());
    }

    public h getGlideUrl() {
        return new h(getUri().toString(), getHeaders());
    }

    public i getHeaders() {
        return this.mHeaders;
    }

    public String getSource() {
        return this.mSource;
    }

    public Object getSourceForLoad() {
        if (isContentUri() || isBase64Resource()) {
            return getSource();
        }
        if (isResource() || isLocalFile()) {
            return getUri();
        }
        return getGlideUrl();
    }

    public Uri getUri() {
        return this.mUri;
    }

    public boolean isBase64Resource() {
        Uri uri = this.mUri;
        if (uri == null || !isBase64Uri(uri)) {
            return false;
        }
        return true;
    }

    public boolean isLocalFile() {
        Uri uri = this.mUri;
        if (uri == null || !isLocalFileUri(uri)) {
            return false;
        }
        return true;
    }

    public boolean isResource() {
        Uri uri = this.mUri;
        if (uri == null || !isResourceUri(uri)) {
            return false;
        }
        return true;
    }

    public FastImageSource(Context context, String str, i iVar) {
        this(context, str, 0.0d, 0.0d, iVar);
    }

    public boolean isContentUri() {
        Uri uri = this.mUri;
        return uri != null && isContentUri(uri);
    }

    public FastImageSource(Context context, String str, double d10, double d11, i iVar) {
        C3959a aVar = new C3959a(context, str, d10, d11);
        this.mSource = aVar.e();
        this.mHeaders = iVar == null ? i.f35882b : iVar;
        this.mUri = aVar.f();
        if (isResource() && TextUtils.isEmpty(this.mUri.toString())) {
            throw new Resources.NotFoundException("Local Resource Not Found. Resource: '" + getSource() + "'.");
        } else if (isLocalResourceUri(this.mUri)) {
            String uri = this.mUri.toString();
            this.mUri = Uri.parse(uri.replace("res:/", "android.resource://" + context.getPackageName() + "/"));
        }
    }
}
