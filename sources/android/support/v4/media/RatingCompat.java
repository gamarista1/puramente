package android.support.v4.media;

import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

@SuppressLint({"BanParcelableUsage"})
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final int f10651a;

    /* renamed from: b  reason: collision with root package name */
    private final float f10652b;

    /* renamed from: c  reason: collision with root package name */
    private Object f10653c;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* renamed from: b */
        public RatingCompat[] newArray(int i10) {
            return new RatingCompat[i10];
        }
    }

    private static class b {
        static float a(Rating rating) {
            return rating.getPercentRating();
        }

        static int b(Rating rating) {
            return rating.getRatingStyle();
        }

        static float c(Rating rating) {
            return rating.getStarRating();
        }

        static boolean d(Rating rating) {
            return rating.hasHeart();
        }

        static boolean e(Rating rating) {
            return rating.isRated();
        }

        static boolean f(Rating rating) {
            return rating.isThumbUp();
        }

        static Rating g(boolean z10) {
            return Rating.newHeartRating(z10);
        }

        static Rating h(float f10) {
            return Rating.newPercentageRating(f10);
        }

        static Rating i(int i10, float f10) {
            return Rating.newStarRating(i10, f10);
        }

        static Rating j(boolean z10) {
            return Rating.newThumbRating(z10);
        }

        static Rating k(int i10) {
            return Rating.newUnratedRating(i10);
        }
    }

    RatingCompat(int i10, float f10) {
        this.f10651a = i10;
        this.f10652b = f10;
    }

    public static RatingCompat a(Object obj) {
        RatingCompat ratingCompat = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int b10 = b.b(rating);
            if (b.e(rating)) {
                switch (b10) {
                    case 1:
                        ratingCompat = h(b.d(rating));
                        break;
                    case 2:
                        ratingCompat = k(b.f(rating));
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompat = j(b10, b.c(rating));
                        break;
                    case 6:
                        ratingCompat = i(b.a(rating));
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompat = l(b10);
            }
            ratingCompat.f10653c = obj;
        }
        return ratingCompat;
    }

    public static RatingCompat h(boolean z10) {
        float f10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        return new RatingCompat(1, f10);
    }

    public static RatingCompat i(float f10) {
        if (f10 >= 0.0f && f10 <= 100.0f) {
            return new RatingCompat(6, f10);
        }
        Log.e("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static RatingCompat j(int i10, float f10) {
        float f11;
        if (i10 == 3) {
            f11 = 3.0f;
        } else if (i10 == 4) {
            f11 = 4.0f;
        } else if (i10 != 5) {
            Log.e("Rating", "Invalid rating style (" + i10 + ") for a star rating");
            return null;
        } else {
            f11 = 5.0f;
        }
        if (f10 >= 0.0f && f10 <= f11) {
            return new RatingCompat(i10, f10);
        }
        Log.e("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    public static RatingCompat k(boolean z10) {
        float f10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        return new RatingCompat(2, f10);
    }

    public static RatingCompat l(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i10, -1.0f);
            default:
                return null;
        }
    }

    public float b() {
        if (this.f10651a != 6 || !f()) {
            return -1.0f;
        }
        return this.f10652b;
    }

    public Object c() {
        if (this.f10653c == null) {
            if (f()) {
                int i10 = this.f10651a;
                switch (i10) {
                    case 1:
                        this.f10653c = b.g(e());
                        break;
                    case 2:
                        this.f10653c = b.j(g());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        this.f10653c = b.i(i10, d());
                        break;
                    case 6:
                        this.f10653c = b.h(b());
                        break;
                    default:
                        return null;
                }
            } else {
                this.f10653c = b.k(this.f10651a);
            }
        }
        return this.f10653c;
    }

    public float d() {
        int i10 = this.f10651a;
        if ((i10 == 3 || i10 == 4 || i10 == 5) && f()) {
            return this.f10652b;
        }
        return -1.0f;
    }

    public int describeContents() {
        return this.f10651a;
    }

    public boolean e() {
        if (this.f10651a == 1 && this.f10652b == 1.0f) {
            return true;
        }
        return false;
    }

    public boolean f() {
        if (this.f10652b >= 0.0f) {
            return true;
        }
        return false;
    }

    public boolean g() {
        if (this.f10651a == 2 && this.f10652b == 1.0f) {
            return true;
        }
        return false;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Rating:style=");
        sb2.append(this.f10651a);
        sb2.append(" rating=");
        float f10 = this.f10652b;
        if (f10 < 0.0f) {
            str = "unrated";
        } else {
            str = String.valueOf(f10);
        }
        sb2.append(str);
        return sb2.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f10651a);
        parcel.writeFloat(this.f10652b);
    }
}
