package ja;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* renamed from: ja.k  reason: case insensitive filesystem */
public abstract class C3655k {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.String r18) {
        /*
            r0 = 16
            r1 = 15
            r2 = 14
            r3 = 13
            r4 = 12
            r5 = 11
            r7 = 9
            r8 = 8
            r9 = 7
            r10 = 6
            r11 = 5
            r12 = 4
            r13 = 3
            r14 = 1
            r16 = -1
            if (r18 != 0) goto L_0x001b
            return r16
        L_0x001b:
            java.lang.String r15 = ja.w.t(r18)
            r15.hashCode()
            int r17 = r15.hashCode()
            switch(r17) {
                case -2123537834: goto L_0x016c;
                case -1662384011: goto L_0x0160;
                case -1662384007: goto L_0x0154;
                case -1662095187: goto L_0x0148;
                case -1606874997: goto L_0x013c;
                case -1487394660: goto L_0x0130;
                case -1248337486: goto L_0x0124;
                case -1079884372: goto L_0x0118;
                case -1004728940: goto L_0x010b;
                case -387023398: goto L_0x00fe;
                case -43467528: goto L_0x00f0;
                case 13915911: goto L_0x00e3;
                case 187078296: goto L_0x00d6;
                case 187078297: goto L_0x00c9;
                case 187078669: goto L_0x00bc;
                case 187090232: goto L_0x00af;
                case 187091926: goto L_0x00a2;
                case 187099443: goto L_0x0095;
                case 1331848029: goto L_0x0088;
                case 1503095341: goto L_0x007b;
                case 1504578661: goto L_0x006e;
                case 1504619009: goto L_0x0061;
                case 1504824762: goto L_0x0054;
                case 1504831518: goto L_0x0047;
                case 1505118770: goto L_0x003a;
                case 2039520277: goto L_0x002d;
                default: goto L_0x0029;
            }
        L_0x0029:
            r6 = r16
            goto L_0x0177
        L_0x002d:
            java.lang.String r6 = "video/x-matroska"
            boolean r6 = r15.equals(r6)
            if (r6 != 0) goto L_0x0036
            goto L_0x0029
        L_0x0036:
            r6 = 25
            goto L_0x0177
        L_0x003a:
            java.lang.String r6 = "audio/webm"
            boolean r6 = r15.equals(r6)
            if (r6 != 0) goto L_0x0043
            goto L_0x0029
        L_0x0043:
            r6 = 24
            goto L_0x0177
        L_0x0047:
            java.lang.String r6 = "audio/mpeg"
            boolean r6 = r15.equals(r6)
            if (r6 != 0) goto L_0x0050
            goto L_0x0029
        L_0x0050:
            r6 = 23
            goto L_0x0177
        L_0x0054:
            java.lang.String r6 = "audio/midi"
            boolean r6 = r15.equals(r6)
            if (r6 != 0) goto L_0x005d
            goto L_0x0029
        L_0x005d:
            r6 = 22
            goto L_0x0177
        L_0x0061:
            java.lang.String r6 = "audio/flac"
            boolean r6 = r15.equals(r6)
            if (r6 != 0) goto L_0x006a
            goto L_0x0029
        L_0x006a:
            r6 = 21
            goto L_0x0177
        L_0x006e:
            java.lang.String r6 = "audio/eac3"
            boolean r6 = r15.equals(r6)
            if (r6 != 0) goto L_0x0077
            goto L_0x0029
        L_0x0077:
            r6 = 20
            goto L_0x0177
        L_0x007b:
            java.lang.String r6 = "audio/3gpp"
            boolean r6 = r15.equals(r6)
            if (r6 != 0) goto L_0x0084
            goto L_0x0029
        L_0x0084:
            r6 = 19
            goto L_0x0177
        L_0x0088:
            java.lang.String r6 = "video/mp4"
            boolean r6 = r15.equals(r6)
            if (r6 != 0) goto L_0x0091
            goto L_0x0029
        L_0x0091:
            r6 = 18
            goto L_0x0177
        L_0x0095:
            java.lang.String r6 = "audio/wav"
            boolean r6 = r15.equals(r6)
            if (r6 != 0) goto L_0x009e
            goto L_0x0029
        L_0x009e:
            r6 = 17
            goto L_0x0177
        L_0x00a2:
            java.lang.String r6 = "audio/ogg"
            boolean r6 = r15.equals(r6)
            if (r6 != 0) goto L_0x00ac
            goto L_0x0029
        L_0x00ac:
            r6 = r0
            goto L_0x0177
        L_0x00af:
            java.lang.String r6 = "audio/mp4"
            boolean r6 = r15.equals(r6)
            if (r6 != 0) goto L_0x00b9
            goto L_0x0029
        L_0x00b9:
            r6 = r1
            goto L_0x0177
        L_0x00bc:
            java.lang.String r6 = "audio/amr"
            boolean r6 = r15.equals(r6)
            if (r6 != 0) goto L_0x00c6
            goto L_0x0029
        L_0x00c6:
            r6 = r2
            goto L_0x0177
        L_0x00c9:
            java.lang.String r6 = "audio/ac4"
            boolean r6 = r15.equals(r6)
            if (r6 != 0) goto L_0x00d3
            goto L_0x0029
        L_0x00d3:
            r6 = r3
            goto L_0x0177
        L_0x00d6:
            java.lang.String r6 = "audio/ac3"
            boolean r6 = r15.equals(r6)
            if (r6 != 0) goto L_0x00e0
            goto L_0x0029
        L_0x00e0:
            r6 = r4
            goto L_0x0177
        L_0x00e3:
            java.lang.String r6 = "video/x-flv"
            boolean r6 = r15.equals(r6)
            if (r6 != 0) goto L_0x00ed
            goto L_0x0029
        L_0x00ed:
            r6 = r5
            goto L_0x0177
        L_0x00f0:
            java.lang.String r6 = "application/webm"
            boolean r6 = r15.equals(r6)
            if (r6 != 0) goto L_0x00fa
            goto L_0x0029
        L_0x00fa:
            r6 = 10
            goto L_0x0177
        L_0x00fe:
            java.lang.String r6 = "audio/x-matroska"
            boolean r6 = r15.equals(r6)
            if (r6 != 0) goto L_0x0108
            goto L_0x0029
        L_0x0108:
            r6 = r7
            goto L_0x0177
        L_0x010b:
            java.lang.String r6 = "text/vtt"
            boolean r6 = r15.equals(r6)
            if (r6 != 0) goto L_0x0115
            goto L_0x0029
        L_0x0115:
            r6 = r8
            goto L_0x0177
        L_0x0118:
            java.lang.String r6 = "video/x-msvideo"
            boolean r6 = r15.equals(r6)
            if (r6 != 0) goto L_0x0122
            goto L_0x0029
        L_0x0122:
            r6 = r9
            goto L_0x0177
        L_0x0124:
            java.lang.String r6 = "application/mp4"
            boolean r6 = r15.equals(r6)
            if (r6 != 0) goto L_0x012e
            goto L_0x0029
        L_0x012e:
            r6 = r10
            goto L_0x0177
        L_0x0130:
            java.lang.String r6 = "image/jpeg"
            boolean r6 = r15.equals(r6)
            if (r6 != 0) goto L_0x013a
            goto L_0x0029
        L_0x013a:
            r6 = r11
            goto L_0x0177
        L_0x013c:
            java.lang.String r6 = "audio/amr-wb"
            boolean r6 = r15.equals(r6)
            if (r6 != 0) goto L_0x0146
            goto L_0x0029
        L_0x0146:
            r6 = r12
            goto L_0x0177
        L_0x0148:
            java.lang.String r6 = "video/webm"
            boolean r6 = r15.equals(r6)
            if (r6 != 0) goto L_0x0152
            goto L_0x0029
        L_0x0152:
            r6 = r13
            goto L_0x0177
        L_0x0154:
            java.lang.String r6 = "video/mp2t"
            boolean r6 = r15.equals(r6)
            if (r6 != 0) goto L_0x015e
            goto L_0x0029
        L_0x015e:
            r6 = 2
            goto L_0x0177
        L_0x0160:
            java.lang.String r6 = "video/mp2p"
            boolean r6 = r15.equals(r6)
            if (r6 != 0) goto L_0x016a
            goto L_0x0029
        L_0x016a:
            r6 = r14
            goto L_0x0177
        L_0x016c:
            java.lang.String r6 = "audio/eac3-joc"
            boolean r6 = r15.equals(r6)
            if (r6 != 0) goto L_0x0176
            goto L_0x0029
        L_0x0176:
            r6 = 0
        L_0x0177:
            switch(r6) {
                case 0: goto L_0x018c;
                case 1: goto L_0x0189;
                case 2: goto L_0x0188;
                case 3: goto L_0x0187;
                case 4: goto L_0x0186;
                case 5: goto L_0x0185;
                case 6: goto L_0x0184;
                case 7: goto L_0x0183;
                case 8: goto L_0x0182;
                case 9: goto L_0x0187;
                case 10: goto L_0x0187;
                case 11: goto L_0x0181;
                case 12: goto L_0x018c;
                case 13: goto L_0x0180;
                case 14: goto L_0x0186;
                case 15: goto L_0x0184;
                case 16: goto L_0x017f;
                case 17: goto L_0x017e;
                case 18: goto L_0x0184;
                case 19: goto L_0x0186;
                case 20: goto L_0x018c;
                case 21: goto L_0x017d;
                case 22: goto L_0x017c;
                case 23: goto L_0x017b;
                case 24: goto L_0x0187;
                case 25: goto L_0x0187;
                default: goto L_0x017a;
            }
        L_0x017a:
            return r16
        L_0x017b:
            return r9
        L_0x017c:
            return r1
        L_0x017d:
            return r12
        L_0x017e:
            return r4
        L_0x017f:
            return r7
        L_0x0180:
            return r14
        L_0x0181:
            return r11
        L_0x0182:
            return r3
        L_0x0183:
            return r0
        L_0x0184:
            return r8
        L_0x0185:
            return r2
        L_0x0186:
            return r13
        L_0x0187:
            return r10
        L_0x0188:
            return r5
        L_0x0189:
            r0 = 10
            return r0
        L_0x018c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.C3655k.a(java.lang.String):int");
    }

    public static int b(Map map) {
        String str;
        List list = (List) map.get("Content-Type");
        if (list == null || list.isEmpty()) {
            str = null;
        } else {
            str = (String) list.get(0);
        }
        return a(str);
    }

    public static int c(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        return -1;
    }
}
