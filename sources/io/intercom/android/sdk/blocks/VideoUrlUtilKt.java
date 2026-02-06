package io.intercom.android.sdk.blocks;

import Sg.p;
import io.intercom.android.sdk.blocks.lib.VideoProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6535s;
import mf.C6565s;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"getEmbedUrl", "", "provider", "Lio/intercom/android/sdk/blocks/lib/VideoProvider;", "joinedIds", "ID_SEPARATOR", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class VideoUrlUtilKt {
    private static final String ID_SEPARATOR = "|";

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|27) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                io.intercom.android.sdk.blocks.lib.VideoProvider[] r0 = io.intercom.android.sdk.blocks.lib.VideoProvider.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.intercom.android.sdk.blocks.lib.VideoProvider r1 = io.intercom.android.sdk.blocks.lib.VideoProvider.YOUTUBE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                io.intercom.android.sdk.blocks.lib.VideoProvider r1 = io.intercom.android.sdk.blocks.lib.VideoProvider.VIMEO     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                io.intercom.android.sdk.blocks.lib.VideoProvider r1 = io.intercom.android.sdk.blocks.lib.VideoProvider.WISTIA     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                io.intercom.android.sdk.blocks.lib.VideoProvider r1 = io.intercom.android.sdk.blocks.lib.VideoProvider.LOOM     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                io.intercom.android.sdk.blocks.lib.VideoProvider r1 = io.intercom.android.sdk.blocks.lib.VideoProvider.VIDYARD     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                io.intercom.android.sdk.blocks.lib.VideoProvider r1 = io.intercom.android.sdk.blocks.lib.VideoProvider.BRIGHTCOVE     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                io.intercom.android.sdk.blocks.lib.VideoProvider r1 = io.intercom.android.sdk.blocks.lib.VideoProvider.JWPLAYER     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                io.intercom.android.sdk.blocks.lib.VideoProvider r1 = io.intercom.android.sdk.blocks.lib.VideoProvider.MICROSOFTSTREAM     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                io.intercom.android.sdk.blocks.lib.VideoProvider r1 = io.intercom.android.sdk.blocks.lib.VideoProvider.SYNTHESIA     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                io.intercom.android.sdk.blocks.lib.VideoProvider r1 = io.intercom.android.sdk.blocks.lib.VideoProvider.GUIDDE     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                io.intercom.android.sdk.blocks.lib.VideoProvider r1 = io.intercom.android.sdk.blocks.lib.VideoProvider.DESCRIPT     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                io.intercom.android.sdk.blocks.lib.VideoProvider r1 = io.intercom.android.sdk.blocks.lib.VideoProvider.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.blocks.VideoUrlUtilKt.WhenMappings.<clinit>():void");
        }
    }

    public static final String getEmbedUrl(VideoProvider videoProvider, String str) {
        StringBuilder sb2;
        StringBuilder sb3;
        C6496s.h(videoProvider, "provider");
        C6496s.h(str, "joinedIds");
        List F02 = p.F0(str, new String[]{"|"}, false, 0, 6, (Object) null);
        String str2 = (String) C6565s.o0(F02);
        List g02 = C6565s.g0(F02, 1);
        switch (WhenMappings.$EnumSwitchMapping$0[videoProvider.ordinal()]) {
            case 1:
                return "https://www.youtube.com/embed/" + str2 + "?rel=0";
            case 2:
                if (g02.isEmpty()) {
                    sb2 = new StringBuilder();
                    sb2.append("https://player.vimeo.com/video/");
                    sb2.append(str2);
                } else {
                    sb2 = new StringBuilder();
                    sb2.append("https://player.vimeo.com/video/");
                    sb2.append(str2);
                    sb2.append("?h=");
                    sb2.append((String) g02.get(0));
                }
                return sb2.toString();
            case 3:
                return "https://fast.wistia.net/embed/iframe/" + str2;
            case 4:
                return "https://www.loom.com/embed/" + str2;
            case 5:
                return "https://play.vidyard.com/" + str2;
            case 6:
                return "https://players.brightcove.net/" + str2 + "/default_default/index.html?videoId=" + ((String) g02.get(0));
            case 7:
                return "https://content.jwplatform.com/players/" + str2 + ".html";
            case 8:
                if (g02.isEmpty()) {
                    sb3 = new StringBuilder();
                    sb3.append("https://web.microsoftstream.com/embed/video/");
                    sb3.append(str2);
                } else {
                    sb3 = new StringBuilder();
                    sb3.append("https://");
                    sb3.append(str2);
                    sb3.append(".sharepoint.com/:v:/");
                    sb3.append((String) g02.get(0));
                }
                return sb3.toString();
            case 9:
                return "https://share.synthesia.io/embeds/videos/" + str2;
            case 10:
                return "https://embed.app.guidde.com/playbooks/" + str2;
            case 11:
                return "https://share.descript.com/embed/" + str2;
            case 12:
                return "";
            default:
                throw new C6535s();
        }
    }
}
