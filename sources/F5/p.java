package F5;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.I;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class p {

    /* renamed from: c  reason: collision with root package name */
    public static final a f30794c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f30795a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f30796b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a() {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(I.l()).edit();
            edit.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
            edit.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
            edit.apply();
        }

        public final p b() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(I.l());
            if (!defaultSharedPreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
                return null;
            }
            return new p(defaultSharedPreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", (String) null), defaultSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false), (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public /* synthetic */ p(String str, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z10);
    }

    public final void a() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(I.l()).edit();
        edit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.f30795a);
        edit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.f30796b);
        edit.apply();
    }

    public String toString() {
        String str;
        if (this.f30796b) {
            str = "Applink";
        } else {
            str = "Unclassified";
        }
        if (this.f30795a == null) {
            return str;
        }
        return str + '(' + this.f30795a + ')';
    }

    private p(String str, boolean z10) {
        this.f30795a = str;
        this.f30796b = z10;
    }
}
