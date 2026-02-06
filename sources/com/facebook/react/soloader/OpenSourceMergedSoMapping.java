package com.facebook.react.soloader;

import com.facebook.soloader.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH ¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH ¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\fH ¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\fH ¢\u0006\u0004\b\u0011\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\fH ¢\u0006\u0004\b\u0012\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\fH ¢\u0006\u0004\b\u0013\u0010\u000eJ\u0010\u0010\u0014\u001a\u00020\fH ¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\fH ¢\u0006\u0004\b\u0015\u0010\u000eJ\u0010\u0010\u0016\u001a\u00020\fH ¢\u0006\u0004\b\u0016\u0010\u000eJ\u0010\u0010\u0017\u001a\u00020\fH ¢\u0006\u0004\b\u0017\u0010\u000eJ\u0010\u0010\u0018\u001a\u00020\fH ¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\fH ¢\u0006\u0004\b\u0019\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\fH ¢\u0006\u0004\b\u001a\u0010\u000eJ\u0010\u0010\u001b\u001a\u00020\fH ¢\u0006\u0004\b\u001b\u0010\u000eJ\u0010\u0010\u001c\u001a\u00020\fH ¢\u0006\u0004\b\u001c\u0010\u000eJ\u0010\u0010\u001d\u001a\u00020\fH ¢\u0006\u0004\b\u001d\u0010\u000eJ\u0010\u0010\u001e\u001a\u00020\fH ¢\u0006\u0004\b\u001e\u0010\u000eJ\u0010\u0010\u001f\u001a\u00020\fH ¢\u0006\u0004\b\u001f\u0010\u000eJ\u0010\u0010 \u001a\u00020\fH ¢\u0006\u0004\b \u0010\u000eJ\u0010\u0010!\u001a\u00020\fH ¢\u0006\u0004\b!\u0010\u000eJ\u0010\u0010\"\u001a\u00020\fH ¢\u0006\u0004\b\"\u0010\u000e¨\u0006#"}, d2 = {"Lcom/facebook/react/soloader/OpenSourceMergedSoMapping;", "Lcom/facebook/soloader/l;", "<init>", "()V", "", "input", "b", "(Ljava/lang/String;)Ljava/lang/String;", "libraryName", "Llf/M;", "a", "(Ljava/lang/String;)V", "", "libfabricjni_so", "()I", "libhermes_executor_so", "libhermesinstancejni_so", "libhermestooling_so", "libjscexecutor_so", "libjscinstance_so", "libjscruntime_so", "libjsctooling_so", "libjsijniprofiler_so", "libjsinspector_so", "libmapbufferjni_so", "libreact_devsupportjni_so", "libreact_featureflagsjni_so", "libreact_newarchdefaults_so", "libreactnative_so", "libreactnativeblob_so", "libreactnativejni_so", "librninstance_so", "libturbomodulejsijni_so", "libuimanagerjni_so", "libyoga_so", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OpenSourceMergedSoMapping implements l {

    /* renamed from: a  reason: collision with root package name */
    public static final OpenSourceMergedSoMapping f41360a = new OpenSourceMergedSoMapping();

    private OpenSourceMergedSoMapping() {
    }

    public void a(String str) {
        C6496s.h(str, "libraryName");
        switch (str.hashCode()) {
            case -1793638007:
                if (str.equals("mapbufferjni")) {
                    libmapbufferjni_so();
                    return;
                }
                return;
            case -1624070447:
                if (str.equals("rninstance")) {
                    librninstance_so();
                    return;
                }
                return;
            case -1570429553:
                if (str.equals("reactnativejni")) {
                    libreactnativejni_so();
                    return;
                }
                return;
            case -1454983728:
                if (str.equals("jsctooling")) {
                    libjsctooling_so();
                    return;
                }
                return;
            case -1438915853:
                if (str.equals("reactnativeblob")) {
                    libreactnativeblob_so();
                    return;
                }
                return;
            case -1382694412:
                if (str.equals("react_featureflagsjni")) {
                    libreact_featureflagsjni_so();
                    return;
                }
                return;
            case -1033318826:
                if (str.equals("reactnative")) {
                    libreactnative_so();
                    return;
                }
                return;
            case -616737073:
                if (str.equals("jscinstance")) {
                    libjscinstance_so();
                    return;
                }
                return;
            case -579037304:
                if (str.equals("react_newarchdefaults")) {
                    libreact_newarchdefaults_so();
                    return;
                }
                return;
            case -49345041:
                if (str.equals("turbomodulejsijni")) {
                    libturbomodulejsijni_so();
                    return;
                }
                return;
            case 3714672:
                if (str.equals("yoga")) {
                    libyoga_so();
                    return;
                }
                return;
            case 65536138:
                if (str.equals("hermesinstancejni")) {
                    libhermesinstancejni_so();
                    return;
                }
                return;
            case 86183502:
                if (str.equals("jsijniprofiler")) {
                    libjsijniprofiler_so();
                    return;
                }
                return;
            case 352552524:
                if (str.equals("hermes_executor")) {
                    libhermes_executor_so();
                    return;
                }
                return;
            case 614482404:
                if (str.equals("hermestooling")) {
                    libhermestooling_so();
                    return;
                }
                return;
            case 688235659:
                if (str.equals("react_devsupportjni")) {
                    libreact_devsupportjni_so();
                    return;
                }
                return;
            case 716617324:
                if (str.equals("uimanagerjni")) {
                    libuimanagerjni_so();
                    return;
                }
                return;
            case 871152397:
                if (str.equals("jscexecutor")) {
                    libjscexecutor_so();
                    return;
                }
                return;
            case 1236065886:
                if (str.equals("jscruntime")) {
                    libjscruntime_so();
                    return;
                }
                return;
            case 1590431694:
                if (str.equals("jsinspector")) {
                    libjsinspector_so();
                    return;
                }
                return;
            case 2016911584:
                if (str.equals("fabricjni")) {
                    libfabricjni_so();
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
        return "hermestooling";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008e, code lost:
        return "jsctooling";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String b(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.C6496s.h(r2, r0)
            int r0 = r2.hashCode()
            switch(r0) {
                case -1793638007: goto L_0x00b5;
                case -1624070447: goto L_0x00ac;
                case -1570429553: goto L_0x00a3;
                case -1438915853: goto L_0x009a;
                case -1382694412: goto L_0x0091;
                case -616737073: goto L_0x0085;
                case -579037304: goto L_0x007c;
                case -49345041: goto L_0x0073;
                case 3714672: goto L_0x006a;
                case 65536138: goto L_0x005e;
                case 86183502: goto L_0x0054;
                case 352552524: goto L_0x004a;
                case 688235659: goto L_0x0040;
                case 716617324: goto L_0x0036;
                case 871152397: goto L_0x002c;
                case 1236065886: goto L_0x0022;
                case 1590431694: goto L_0x0018;
                case 2016911584: goto L_0x000e;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x00bf
        L_0x000e:
            java.lang.String r0 = "fabricjni"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00bd
            goto L_0x00bf
        L_0x0018:
            java.lang.String r0 = "jsinspector"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00bd
            goto L_0x00bf
        L_0x0022:
            java.lang.String r0 = "jscruntime"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x008e
            goto L_0x00bf
        L_0x002c:
            java.lang.String r0 = "jscexecutor"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x008e
            goto L_0x00bf
        L_0x0036:
            java.lang.String r0 = "uimanagerjni"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00bd
            goto L_0x00bf
        L_0x0040:
            java.lang.String r0 = "react_devsupportjni"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00bd
            goto L_0x00bf
        L_0x004a:
            java.lang.String r0 = "hermes_executor"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0067
            goto L_0x00bf
        L_0x0054:
            java.lang.String r0 = "jsijniprofiler"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0067
            goto L_0x00bf
        L_0x005e:
            java.lang.String r0 = "hermesinstancejni"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0067
            goto L_0x00bf
        L_0x0067:
            java.lang.String r2 = "hermestooling"
            goto L_0x00bf
        L_0x006a:
            java.lang.String r0 = "yoga"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00bd
            goto L_0x00bf
        L_0x0073:
            java.lang.String r0 = "turbomodulejsijni"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00bd
            goto L_0x00bf
        L_0x007c:
            java.lang.String r0 = "react_newarchdefaults"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00bd
            goto L_0x00bf
        L_0x0085:
            java.lang.String r0 = "jscinstance"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x008e
            goto L_0x00bf
        L_0x008e:
            java.lang.String r2 = "jsctooling"
            goto L_0x00bf
        L_0x0091:
            java.lang.String r0 = "react_featureflagsjni"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00bd
            goto L_0x00bf
        L_0x009a:
            java.lang.String r0 = "reactnativeblob"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00bd
            goto L_0x00bf
        L_0x00a3:
            java.lang.String r0 = "reactnativejni"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00bd
            goto L_0x00bf
        L_0x00ac:
            java.lang.String r0 = "rninstance"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00bd
            goto L_0x00bf
        L_0x00b5:
            java.lang.String r0 = "mapbufferjni"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00bf
        L_0x00bd:
            java.lang.String r2 = "reactnative"
        L_0x00bf:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.soloader.OpenSourceMergedSoMapping.b(java.lang.String):java.lang.String");
    }

    public final native int libfabricjni_so();

    public final native int libhermes_executor_so();

    public final native int libhermesinstancejni_so();

    public final native int libhermestooling_so();

    public final native int libjscexecutor_so();

    public final native int libjscinstance_so();

    public final native int libjscruntime_so();

    public final native int libjsctooling_so();

    public final native int libjsijniprofiler_so();

    public final native int libjsinspector_so();

    public final native int libmapbufferjni_so();

    public final native int libreact_devsupportjni_so();

    public final native int libreact_featureflagsjni_so();

    public final native int libreact_newarchdefaults_so();

    public final native int libreactnative_so();

    public final native int libreactnativeblob_so();

    public final native int libreactnativejni_so();

    public final native int librninstance_so();

    public final native int libturbomodulejsijni_so();

    public final native int libuimanagerjni_so();

    public final native int libyoga_so();
}
