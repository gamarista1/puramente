package com.amazon.a.b;

import com.amazon.a.a.i.c;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final c f37593a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f37594b = new c("Amazon Appstore connection failure", "An error occurred connecting to Amazon Appstore. Please try opening this app again", f37600h, true, false);

    /* renamed from: c  reason: collision with root package name */
    public static final c f37595c;

    /* renamed from: d  reason: collision with root package name */
    public static final c f37596d = new c("Internet connection required", "An internet connection is required to open this app. Please connect to the internet and reopen this app.", f37600h, true, false);

    /* renamed from: e  reason: collision with root package name */
    public static final c f37597e;

    /* renamed from: f  reason: collision with root package name */
    public static final c f37598f = new c("Internal error", "An internal error occurred, please try opening this app again", f37600h, true, false);

    /* renamed from: g  reason: collision with root package name */
    public static final c f37599g;

    /* renamed from: h  reason: collision with root package name */
    private static final String f37600h = "Quit";

    /* renamed from: i  reason: collision with root package name */
    private static final String f37601i = "Help";

    /* renamed from: j  reason: collision with root package name */
    private static final String f37602j = "Update";

    static {
        String[] strArr = {f37600h, f37601i};
        c.a aVar = c.a.DEFAULT;
        c.a aVar2 = c.a.HELP;
        f37593a = new c(new String[]{"Amazon Appstore required"}, "Amazon Appstore is not installed on your device. Please install Amazon Appstore and sign in to Amazon to use this app.", strArr, new c.a[]{aVar, aVar2}, true, true, 1, 1);
        f37595c = new c(new String[]{"New Appstore version required", "Amazon Appstore Update Required"}, "Amazon Appstore is out of date.  Please visit the Amazon website to install the latest version of the Appstore. ", new String[]{f37600h, f37601i}, new c.a[]{aVar, aVar2}, true, true, 1, 2);
        f37597e = new c(new String[]{"Connection error"}, "An unknown error occurred connecting to Amazon Appstore.", new String[]{f37600h, f37601i}, new c.a[]{aVar, aVar2}, true, true, 1, 3);
        f37599g = new c("App update required", "Please update this app from the Amazon Appstore.", new String[]{f37600h, f37602j}, new c.a[]{aVar, c.a.DEEPLINK}, true, false, 0);
    }

    private e() {
    }
}
