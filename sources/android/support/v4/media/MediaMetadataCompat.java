package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.collection.C1587a;

@SuppressLint({"BanParcelableUsage"})
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    static final C1587a f10644c;

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f10645d = {"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f10646e = {"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};

    /* renamed from: f  reason: collision with root package name */
    private static final String[] f10647f = {"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};

    /* renamed from: a  reason: collision with root package name */
    final Bundle f10648a;

    /* renamed from: b  reason: collision with root package name */
    private MediaMetadata f10649b;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        /* renamed from: b */
        public MediaMetadataCompat[] newArray(int i10) {
            return new MediaMetadataCompat[i10];
        }
    }

    static {
        C1587a aVar = new C1587a();
        f10644c = aVar;
        aVar.put("android.media.metadata.TITLE", 1);
        aVar.put("android.media.metadata.ARTIST", 1);
        aVar.put("android.media.metadata.DURATION", 0);
        aVar.put("android.media.metadata.ALBUM", 1);
        aVar.put("android.media.metadata.AUTHOR", 1);
        aVar.put("android.media.metadata.WRITER", 1);
        aVar.put("android.media.metadata.COMPOSER", 1);
        aVar.put("android.media.metadata.COMPILATION", 1);
        aVar.put("android.media.metadata.DATE", 1);
        aVar.put("android.media.metadata.YEAR", 0);
        aVar.put("android.media.metadata.GENRE", 1);
        aVar.put("android.media.metadata.TRACK_NUMBER", 0);
        aVar.put("android.media.metadata.NUM_TRACKS", 0);
        aVar.put("android.media.metadata.DISC_NUMBER", 0);
        aVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        aVar.put("android.media.metadata.ART", 2);
        aVar.put("android.media.metadata.ART_URI", 1);
        aVar.put("android.media.metadata.ALBUM_ART", 2);
        aVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        aVar.put("android.media.metadata.USER_RATING", 3);
        aVar.put("android.media.metadata.RATING", 3);
        aVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        aVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        aVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        aVar.put("android.media.metadata.DISPLAY_ICON", 2);
        aVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        aVar.put("android.media.metadata.MEDIA_ID", 1);
        aVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        aVar.put("android.media.metadata.MEDIA_URI", 1);
        aVar.put("android.media.metadata.ADVERTISEMENT", 0);
        aVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
    }

    MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f10648a = bundle2;
        MediaSessionCompat.a(bundle2);
    }

    public static MediaMetadataCompat b(Object obj) {
        if (obj == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        mediaMetadata.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.f10649b = mediaMetadata;
        return createFromParcel;
    }

    public boolean a(String str) {
        return this.f10648a.containsKey(str);
    }

    public long c(String str) {
        return this.f10648a.getLong(str, 0);
    }

    public Object d() {
        if (this.f10649b == null) {
            Parcel obtain = Parcel.obtain();
            writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            this.f10649b = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
            obtain.recycle();
        }
        return this.f10649b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeBundle(this.f10648a);
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Bundle f10650a;

        public b() {
            this.f10650a = new Bundle();
        }

        public MediaMetadataCompat a() {
            return new MediaMetadataCompat(this.f10650a);
        }

        public b b(String str, Bitmap bitmap) {
            C1587a aVar = MediaMetadataCompat.f10644c;
            if (!aVar.containsKey(str) || ((Integer) aVar.get(str)).intValue() == 2) {
                this.f10650a.putParcelable(str, bitmap);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Bitmap");
        }

        public b c(String str, long j10) {
            C1587a aVar = MediaMetadataCompat.f10644c;
            if (!aVar.containsKey(str) || ((Integer) aVar.get(str)).intValue() == 0) {
                this.f10650a.putLong(str, j10);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a long");
        }

        public b d(String str, RatingCompat ratingCompat) {
            C1587a aVar = MediaMetadataCompat.f10644c;
            if (!aVar.containsKey(str) || ((Integer) aVar.get(str)).intValue() == 3) {
                this.f10650a.putParcelable(str, (Parcelable) ratingCompat.c());
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Rating");
        }

        public b e(String str, CharSequence charSequence) {
            C1587a aVar = MediaMetadataCompat.f10644c;
            if (!aVar.containsKey(str) || ((Integer) aVar.get(str)).intValue() == 1) {
                this.f10650a.putCharSequence(str, charSequence);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a CharSequence");
        }

        public b(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle = new Bundle(mediaMetadataCompat.f10648a);
            this.f10650a = bundle;
            MediaSessionCompat.a(bundle);
        }
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f10648a = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }
}
