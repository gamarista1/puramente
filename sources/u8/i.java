package u8;

import o7.C3892h;

public enum i implements C3892h {
    SHARE_DIALOG(20130618),
    PHOTOS(20140204),
    VIDEO(20141028),
    MULTIMEDIA(20160327),
    HASHTAG(20160327),
    LINK_SHARE_QUOTES(20160327);
    

    /* renamed from: a  reason: collision with root package name */
    private final int f48650a;

    private i(int i10) {
        this.f48650a = i10;
    }

    public int a() {
        return this.f48650a;
    }

    public String b() {
        return "com.facebook.platform.action.request.FEED_DIALOG";
    }
}
