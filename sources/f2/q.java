package f2;

import android.net.Uri;
import java.util.List;
import java.util.Map;

public abstract class q {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.String r23) {
        /*
            r0 = 21
            r1 = 20
            r2 = 19
            r3 = 18
            r4 = 17
            r5 = 16
            r6 = 15
            r7 = 14
            r8 = 13
            r9 = 12
            r12 = 9
            r13 = 8
            r14 = 7
            r15 = 6
            r16 = 5
            r17 = 4
            r18 = 3
            r19 = 1
            r20 = 0
            r21 = -1
            if (r23 != 0) goto L_0x0029
            return r21
        L_0x0029:
            java.lang.String r11 = f2.C1960A.p(r23)
            r11.hashCode()
            int r22 = r11.hashCode()
            switch(r22) {
                case -2123537834: goto L_0x01ce;
                case -1662384011: goto L_0x01c1;
                case -1662384007: goto L_0x01b5;
                case -1662095187: goto L_0x01a8;
                case -1606874997: goto L_0x019b;
                case -1487656890: goto L_0x018e;
                case -1487464693: goto L_0x0182;
                case -1487464690: goto L_0x0176;
                case -1487394660: goto L_0x0169;
                case -1487018032: goto L_0x015c;
                case -1248337486: goto L_0x014e;
                case -1079884372: goto L_0x0140;
                case -1004728940: goto L_0x0133;
                case -879272239: goto L_0x0126;
                case -879258763: goto L_0x0119;
                case -387023398: goto L_0x010c;
                case -43467528: goto L_0x00ff;
                case 13915911: goto L_0x00f2;
                case 187078296: goto L_0x00e5;
                case 187078297: goto L_0x00d8;
                case 187078669: goto L_0x00cb;
                case 187090232: goto L_0x00be;
                case 187091926: goto L_0x00b0;
                case 187099443: goto L_0x00a3;
                case 1331848029: goto L_0x0096;
                case 1503095341: goto L_0x0089;
                case 1504578661: goto L_0x007c;
                case 1504619009: goto L_0x006f;
                case 1504824762: goto L_0x0062;
                case 1504831518: goto L_0x0055;
                case 1505118770: goto L_0x0048;
                case 2039520277: goto L_0x003b;
                default: goto L_0x0037;
            }
        L_0x0037:
            r10 = r21
            goto L_0x01da
        L_0x003b:
            java.lang.String r10 = "video/x-matroska"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0044
            goto L_0x0037
        L_0x0044:
            r10 = 31
            goto L_0x01da
        L_0x0048:
            java.lang.String r10 = "audio/webm"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0051
            goto L_0x0037
        L_0x0051:
            r10 = 30
            goto L_0x01da
        L_0x0055:
            java.lang.String r10 = "audio/mpeg"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x005e
            goto L_0x0037
        L_0x005e:
            r10 = 29
            goto L_0x01da
        L_0x0062:
            java.lang.String r10 = "audio/midi"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x006b
            goto L_0x0037
        L_0x006b:
            r10 = 28
            goto L_0x01da
        L_0x006f:
            java.lang.String r10 = "audio/flac"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0078
            goto L_0x0037
        L_0x0078:
            r10 = 27
            goto L_0x01da
        L_0x007c:
            java.lang.String r10 = "audio/eac3"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0085
            goto L_0x0037
        L_0x0085:
            r10 = 26
            goto L_0x01da
        L_0x0089:
            java.lang.String r10 = "audio/3gpp"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0092
            goto L_0x0037
        L_0x0092:
            r10 = 25
            goto L_0x01da
        L_0x0096:
            java.lang.String r10 = "video/mp4"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x009f
            goto L_0x0037
        L_0x009f:
            r10 = 24
            goto L_0x01da
        L_0x00a3:
            java.lang.String r10 = "audio/wav"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00ac
            goto L_0x0037
        L_0x00ac:
            r10 = 23
            goto L_0x01da
        L_0x00b0:
            java.lang.String r10 = "audio/ogg"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00ba
            goto L_0x0037
        L_0x00ba:
            r10 = 22
            goto L_0x01da
        L_0x00be:
            java.lang.String r10 = "audio/mp4"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00c8
            goto L_0x0037
        L_0x00c8:
            r10 = r0
            goto L_0x01da
        L_0x00cb:
            java.lang.String r10 = "audio/amr"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00d5
            goto L_0x0037
        L_0x00d5:
            r10 = r1
            goto L_0x01da
        L_0x00d8:
            java.lang.String r10 = "audio/ac4"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00e2
            goto L_0x0037
        L_0x00e2:
            r10 = r2
            goto L_0x01da
        L_0x00e5:
            java.lang.String r10 = "audio/ac3"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00ef
            goto L_0x0037
        L_0x00ef:
            r10 = r3
            goto L_0x01da
        L_0x00f2:
            java.lang.String r10 = "video/x-flv"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00fc
            goto L_0x0037
        L_0x00fc:
            r10 = r4
            goto L_0x01da
        L_0x00ff:
            java.lang.String r10 = "application/webm"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0109
            goto L_0x0037
        L_0x0109:
            r10 = r5
            goto L_0x01da
        L_0x010c:
            java.lang.String r10 = "audio/x-matroska"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0116
            goto L_0x0037
        L_0x0116:
            r10 = r6
            goto L_0x01da
        L_0x0119:
            java.lang.String r10 = "image/png"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0123
            goto L_0x0037
        L_0x0123:
            r10 = r7
            goto L_0x01da
        L_0x0126:
            java.lang.String r10 = "image/bmp"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0130
            goto L_0x0037
        L_0x0130:
            r10 = r8
            goto L_0x01da
        L_0x0133:
            java.lang.String r10 = "text/vtt"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x013d
            goto L_0x0037
        L_0x013d:
            r10 = r9
            goto L_0x01da
        L_0x0140:
            java.lang.String r10 = "video/x-msvideo"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x014a
            goto L_0x0037
        L_0x014a:
            r10 = 11
            goto L_0x01da
        L_0x014e:
            java.lang.String r10 = "application/mp4"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0158
            goto L_0x0037
        L_0x0158:
            r10 = 10
            goto L_0x01da
        L_0x015c:
            java.lang.String r10 = "image/webp"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0166
            goto L_0x0037
        L_0x0166:
            r10 = r12
            goto L_0x01da
        L_0x0169:
            java.lang.String r10 = "image/jpeg"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0173
            goto L_0x0037
        L_0x0173:
            r10 = r13
            goto L_0x01da
        L_0x0176:
            java.lang.String r10 = "image/heif"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0180
            goto L_0x0037
        L_0x0180:
            r10 = r14
            goto L_0x01da
        L_0x0182:
            java.lang.String r10 = "image/heic"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x018c
            goto L_0x0037
        L_0x018c:
            r10 = r15
            goto L_0x01da
        L_0x018e:
            java.lang.String r10 = "image/avif"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0198
            goto L_0x0037
        L_0x0198:
            r10 = r16
            goto L_0x01da
        L_0x019b:
            java.lang.String r10 = "audio/amr-wb"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x01a5
            goto L_0x0037
        L_0x01a5:
            r10 = r17
            goto L_0x01da
        L_0x01a8:
            java.lang.String r10 = "video/webm"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x01b2
            goto L_0x0037
        L_0x01b2:
            r10 = r18
            goto L_0x01da
        L_0x01b5:
            java.lang.String r10 = "video/mp2t"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x01bf
            goto L_0x0037
        L_0x01bf:
            r10 = 2
            goto L_0x01da
        L_0x01c1:
            java.lang.String r10 = "video/mp2p"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x01cb
            goto L_0x0037
        L_0x01cb:
            r10 = r19
            goto L_0x01da
        L_0x01ce:
            java.lang.String r10 = "audio/eac3-joc"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x01d8
            goto L_0x0037
        L_0x01d8:
            r10 = r20
        L_0x01da:
            switch(r10) {
                case 0: goto L_0x01f6;
                case 1: goto L_0x01f3;
                case 2: goto L_0x01f0;
                case 3: goto L_0x01ef;
                case 4: goto L_0x01ee;
                case 5: goto L_0x01ed;
                case 6: goto L_0x01ec;
                case 7: goto L_0x01ec;
                case 8: goto L_0x01eb;
                case 9: goto L_0x01ea;
                case 10: goto L_0x01e9;
                case 11: goto L_0x01e8;
                case 12: goto L_0x01e7;
                case 13: goto L_0x01e6;
                case 14: goto L_0x01e5;
                case 15: goto L_0x01ef;
                case 16: goto L_0x01ef;
                case 17: goto L_0x01e4;
                case 18: goto L_0x01f6;
                case 19: goto L_0x01e3;
                case 20: goto L_0x01ee;
                case 21: goto L_0x01e9;
                case 22: goto L_0x01e2;
                case 23: goto L_0x01e1;
                case 24: goto L_0x01e9;
                case 25: goto L_0x01ee;
                case 26: goto L_0x01f6;
                case 27: goto L_0x01e0;
                case 28: goto L_0x01df;
                case 29: goto L_0x01de;
                case 30: goto L_0x01ef;
                case 31: goto L_0x01ef;
                default: goto L_0x01dd;
            }
        L_0x01dd:
            return r21
        L_0x01de:
            return r14
        L_0x01df:
            return r6
        L_0x01e0:
            return r17
        L_0x01e1:
            return r9
        L_0x01e2:
            return r12
        L_0x01e3:
            return r19
        L_0x01e4:
            return r16
        L_0x01e5:
            return r4
        L_0x01e6:
            return r2
        L_0x01e7:
            return r8
        L_0x01e8:
            return r5
        L_0x01e9:
            return r13
        L_0x01ea:
            return r3
        L_0x01eb:
            return r7
        L_0x01ec:
            return r1
        L_0x01ed:
            return r0
        L_0x01ee:
            return r18
        L_0x01ef:
            return r15
        L_0x01f0:
            r0 = 11
            return r0
        L_0x01f3:
            r0 = 10
            return r0
        L_0x01f6:
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.q.a(java.lang.String):int");
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
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        if (lastPathSegment.endsWith(".avif")) {
            return 21;
        }
        return -1;
    }
}
