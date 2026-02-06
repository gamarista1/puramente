package u8;

import o7.C3892h;

public enum e implements C3892h {
    MESSAGE_DIALOG(20140204),
    PHOTOS(20140324),
    VIDEO(20141218),
    MESSENGER_GENERIC_TEMPLATE(20171115),
    MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE(20171115),
    MESSENGER_MEDIA_TEMPLATE(20171115);
    

    /* renamed from: a  reason: collision with root package name */
    private int f48635a;

    private e(int i10) {
        this.f48635a = i10;
    }

    public int a() {
        return this.f48635a;
    }

    public String b() {
        return "com.facebook.platform.action.request.MESSAGE_DIALOG";
    }
}
