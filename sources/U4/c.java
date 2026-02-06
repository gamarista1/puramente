package U4;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class c implements d {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f34393a;

    /* renamed from: b  reason: collision with root package name */
    private final e f34394b;

    /* renamed from: c  reason: collision with root package name */
    private InputStream f34395c;

    static class a implements d {

        /* renamed from: b  reason: collision with root package name */
        private static final String[] f34396b = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f34397a;

        a(ContentResolver contentResolver) {
            this.f34397a = contentResolver;
        }

        public Cursor a(Uri uri) {
            return this.f34397a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f34396b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, (String) null);
        }
    }

    static class b implements d {

        /* renamed from: b  reason: collision with root package name */
        private static final String[] f34398b = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f34399a;

        b(ContentResolver contentResolver) {
            this.f34399a = contentResolver;
        }

        public Cursor a(Uri uri) {
            return this.f34399a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f34398b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, (String) null);
        }
    }

    c(Uri uri, e eVar) {
        this.f34393a = uri;
        this.f34394b = eVar;
    }

    private static c c(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.c.e(context).n().g(), dVar, com.bumptech.glide.c.e(context).g(), context.getContentResolver()));
    }

    public static c e(Context context, Uri uri) {
        return c(context, uri, new a(context.getContentResolver()));
    }

    public static c f(Context context, Uri uri) {
        return c(context, uri, new b(context.getContentResolver()));
    }

    private InputStream g() {
        int i10;
        InputStream d10 = this.f34394b.d(this.f34393a);
        if (d10 != null) {
            i10 = this.f34394b.a(this.f34393a);
        } else {
            i10 = -1;
        }
        if (i10 != -1) {
            return new g(d10, i10);
        }
        return d10;
    }

    public Class a() {
        return InputStream.class;
    }

    public void b() {
        InputStream inputStream = this.f34395c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public void d(h hVar, d.a aVar) {
        try {
            InputStream g10 = g();
            this.f34395c = g10;
            aVar.e(g10);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e10);
            }
            aVar.c(e10);
        }
    }

    public T4.a getDataSource() {
        return T4.a.LOCAL;
    }

    public void cancel() {
    }
}
