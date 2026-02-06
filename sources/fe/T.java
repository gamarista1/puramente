package Fe;

public enum T {
    FACEBOOK("com.facebook.katana"),
    FACEBOOK_MESSENGER("com.facebook.orca"),
    TWITTER("com.twitter.android"),
    MESSAGE(".mms"),
    EMAIL("com.google.android.email"),
    FLICKR("com.yahoo.mobile.client.android.flickr"),
    GOOGLE_DOC("com.google.android.apps.docs"),
    WHATS_APP("com.whatsapp"),
    PINTEREST("com.pinterest"),
    HANGOUT("com.google.android.talk"),
    INSTAGRAM("com.instagram.android"),
    WECHAT("jom.tencent.mm"),
    SNAPCHAT("com.snapchat.android"),
    GMAIL("com.google.android.gm");
    

    /* renamed from: a  reason: collision with root package name */
    private String f30995a;

    private T(String str) {
        this.f30995a = str;
    }

    public String toString() {
        return this.f30995a;
    }
}
