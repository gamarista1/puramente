package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f10627a;

    /* renamed from: b  reason: collision with root package name */
    private final CharSequence f10628b;

    /* renamed from: c  reason: collision with root package name */
    private final CharSequence f10629c;

    /* renamed from: d  reason: collision with root package name */
    private final CharSequence f10630d;

    /* renamed from: e  reason: collision with root package name */
    private final Bitmap f10631e;

    /* renamed from: f  reason: collision with root package name */
    private final Uri f10632f;

    /* renamed from: g  reason: collision with root package name */
    private final Bundle f10633g;

    /* renamed from: h  reason: collision with root package name */
    private final Uri f10634h;

    /* renamed from: i  reason: collision with root package name */
    private MediaDescription f10635i;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i10) {
            return new MediaDescriptionCompat[i10];
        }
    }

    private static class b {
        static MediaDescription a(MediaDescription.Builder builder) {
            return builder.build();
        }

        static MediaDescription.Builder b() {
            return new MediaDescription.Builder();
        }

        static CharSequence c(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        static Bundle d(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        static Bitmap e(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        static Uri f(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        static String g(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        static CharSequence h(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        static CharSequence i(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        static void j(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        static void k(MediaDescription.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        static void l(MediaDescription.Builder builder, Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        static void m(MediaDescription.Builder builder, Uri uri) {
            builder.setIconUri(uri);
        }

        static void n(MediaDescription.Builder builder, String str) {
            builder.setMediaId(str);
        }

        static void o(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        static void p(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    private static class c {
        static Uri a(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        static void b(MediaDescription.Builder builder, Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private String f10636a;

        /* renamed from: b  reason: collision with root package name */
        private CharSequence f10637b;

        /* renamed from: c  reason: collision with root package name */
        private CharSequence f10638c;

        /* renamed from: d  reason: collision with root package name */
        private CharSequence f10639d;

        /* renamed from: e  reason: collision with root package name */
        private Bitmap f10640e;

        /* renamed from: f  reason: collision with root package name */
        private Uri f10641f;

        /* renamed from: g  reason: collision with root package name */
        private Bundle f10642g;

        /* renamed from: h  reason: collision with root package name */
        private Uri f10643h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f10636a, this.f10637b, this.f10638c, this.f10639d, this.f10640e, this.f10641f, this.f10642g, this.f10643h);
        }

        public d b(CharSequence charSequence) {
            this.f10639d = charSequence;
            return this;
        }

        public d c(Bundle bundle) {
            this.f10642g = bundle;
            return this;
        }

        public d d(Bitmap bitmap) {
            this.f10640e = bitmap;
            return this;
        }

        public d e(Uri uri) {
            this.f10641f = uri;
            return this;
        }

        public d f(String str) {
            this.f10636a = str;
            return this;
        }

        public d g(Uri uri) {
            this.f10643h = uri;
            return this;
        }

        public d h(CharSequence charSequence) {
            this.f10638c = charSequence;
            return this;
        }

        public d i(CharSequence charSequence) {
            this.f10637b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f10627a = str;
        this.f10628b = charSequence;
        this.f10629c = charSequence2;
        this.f10630d = charSequence3;
        this.f10631e = bitmap;
        this.f10632f = uri;
        this.f10633g = bundle;
        this.f10634h = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x0079
            android.support.v4.media.MediaDescriptionCompat$d r1 = new android.support.v4.media.MediaDescriptionCompat$d
            r1.<init>()
            android.media.MediaDescription r8 = (android.media.MediaDescription) r8
            java.lang.String r2 = android.support.v4.media.MediaDescriptionCompat.b.g(r8)
            r1.f(r2)
            java.lang.CharSequence r2 = android.support.v4.media.MediaDescriptionCompat.b.i(r8)
            r1.i(r2)
            java.lang.CharSequence r2 = android.support.v4.media.MediaDescriptionCompat.b.h(r8)
            r1.h(r2)
            java.lang.CharSequence r2 = android.support.v4.media.MediaDescriptionCompat.b.c(r8)
            r1.b(r2)
            android.graphics.Bitmap r2 = android.support.v4.media.MediaDescriptionCompat.b.e(r8)
            r1.d(r2)
            android.net.Uri r2 = android.support.v4.media.MediaDescriptionCompat.b.f(r8)
            r1.e(r2)
            android.os.Bundle r2 = android.support.v4.media.MediaDescriptionCompat.b.d(r8)
            if (r2 == 0) goto L_0x003e
            android.os.Bundle r2 = android.support.v4.media.session.MediaSessionCompat.p(r2)
        L_0x003e:
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x0049
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L_0x004a
        L_0x0049:
            r4 = r0
        L_0x004a:
            if (r4 == 0) goto L_0x0062
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L_0x005c
            int r6 = r2.size()
            r7 = 2
            if (r6 != r7) goto L_0x005c
            goto L_0x0063
        L_0x005c:
            r2.remove(r3)
            r2.remove(r5)
        L_0x0062:
            r0 = r2
        L_0x0063:
            r1.c(r0)
            if (r4 == 0) goto L_0x006c
            r1.g(r4)
            goto L_0x0073
        L_0x006c:
            android.net.Uri r0 = android.support.v4.media.MediaDescriptionCompat.c.a(r8)
            r1.g(r0)
        L_0x0073:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.a()
            r0.f10635i = r8
        L_0x0079:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public Object b() {
        MediaDescription mediaDescription = this.f10635i;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder b10 = b.b();
        b.n(b10, this.f10627a);
        b.p(b10, this.f10628b);
        b.o(b10, this.f10629c);
        b.j(b10, this.f10630d);
        b.l(b10, this.f10631e);
        b.m(b10, this.f10632f);
        b.k(b10, this.f10633g);
        c.b(b10, this.f10634h);
        MediaDescription a10 = b.a(b10);
        this.f10635i = a10;
        return a10;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f10628b + ", " + this.f10629c + ", " + this.f10630d;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        ((MediaDescription) b()).writeToParcel(parcel, i10);
    }
}
