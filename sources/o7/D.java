package o7;

import android.net.Uri;
import android.util.Log;
import com.facebook.I;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;

public abstract class D {

    /* renamed from: a  reason: collision with root package name */
    public static final a f47101a = new a((DefaultConstructorMarker) null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Uri a(String str, int i10, int i11, String str2) {
            X.n(str, "userId");
            int max = Math.max(i10, 0);
            int max2 = Math.max(i11, 0);
            if (max == 0 && max2 == 0) {
                throw new IllegalArgumentException("Either width or height must be greater than 0");
            }
            Uri.Builder buildUpon = Uri.parse(P.h()).buildUpon();
            U u10 = U.f71764a;
            String format = String.format(Locale.US, "%s/%s/picture", Arrays.copyOf(new Object[]{I.w(), str}, 2));
            C6496s.g(format, "format(locale, format, *args)");
            Uri.Builder path = buildUpon.path(format);
            if (max2 != 0) {
                path.appendQueryParameter(Snapshot.HEIGHT, String.valueOf(max2));
            }
            if (max != 0) {
                path.appendQueryParameter(Snapshot.WIDTH, String.valueOf(max));
            }
            path.appendQueryParameter("migration_overrides", "{october_2012:true}");
            if (!W.e0(str2)) {
                path.appendQueryParameter("access_token", str2);
            } else if (W.e0(I.r()) || W.e0(I.m())) {
                Log.d("ImageRequest", "Needs access token to fetch profile picture. Without an access token a default silhoutte picture is returned");
            } else {
                path.appendQueryParameter("access_token", I.m() + '|' + I.r());
            }
            Uri build = path.build();
            C6496s.g(build, "builder.build()");
            return build;
        }

        private a() {
        }
    }
}
