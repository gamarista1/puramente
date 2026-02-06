package v5;

import com.adjust.sdk.Constants;

public enum l {
    ANON_ID("anon_id"),
    FB_LOGIN_ID("fb_login_id"),
    MAD_ID("madid"),
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
    

    /* renamed from: a  reason: collision with root package name */
    private final String f48821a;

    private l(String str) {
        this.f48821a = str;
    }

    public final String b() {
        return this.f48821a;
    }
}
