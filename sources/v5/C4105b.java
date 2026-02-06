package v5;

import com.adjust.sdk.Constants;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: v5.b  reason: case insensitive filesystem */
public enum C4105b {
    ANON_ID("anon_id"),
    APP_USER_ID("app_user_id"),
    ADVERTISER_ID("advertiser_id"),
    PAGE_ID("page_id"),
    PAGE_SCOPED_USER_ID("page_scoped_user_id"),
    USER_DATA("ud"),
    ADV_TE("advertiser_tracking_enabled"),
    APP_TE("application_tracking_enabled"),
    CONSIDER_VIEWS("consider_views"),
    DEVICE_TOKEN("device_token"),
    EXT_INFO("extInfo"),
    INCLUDE_DWELL_DATA("include_dwell_data"),
    INCLUDE_VIDEO_DATA("include_video_data"),
    INSTALL_REFERRER(Constants.INSTALL_REFERRER),
    INSTALLER_PACKAGE("installer_package"),
    RECEIPT_DATA("receipt_data"),
    URL_SCHEMES("url_schemes");
    

    /* renamed from: b  reason: collision with root package name */
    public static final a f48704b = null;

    /* renamed from: a  reason: collision with root package name */
    private final String f48723a;

    /* renamed from: v5.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C4105b a(String str) {
            C6496s.h(str, "rawValue");
            for (C4105b bVar : C4105b.values()) {
                if (C6496s.c(bVar.b(), str)) {
                    return bVar;
                }
            }
            return null;
        }

        private a() {
        }
    }

    static {
        f48704b = new a((DefaultConstructorMarker) null);
    }

    private C4105b(String str) {
        this.f48723a = str;
    }

    public final String b() {
        return this.f48723a;
    }
}
