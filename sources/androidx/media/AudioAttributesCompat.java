package androidx.media;

import G3.b;
import android.util.SparseIntArray;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;

public class AudioAttributesCompat implements b {

    /* renamed from: b  reason: collision with root package name */
    private static final SparseIntArray f17291b;

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f17292c = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributesImpl f17293a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f17291b = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    static int a(boolean z10, int i10, int i11) {
        if ((i10 & 1) == 1) {
            if (z10) {
                return 1;
            }
            return 7;
        } else if ((i10 & 4) != 4) {
            switch (i11) {
                case 0:
                case 1:
                case 12:
                case StdKeyDeserializer.TYPE_URL /*14*/:
                case 16:
                    return 3;
                case 2:
                    return 0;
                case 3:
                    if (z10) {
                        return 0;
                    }
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                case 11:
                    return 10;
                case 13:
                    return 1;
                default:
                    if (!z10) {
                        return 3;
                    }
                    throw new IllegalArgumentException("Unknown usage value " + i11 + " in audio attributes");
            }
        } else if (z10) {
            return 0;
        } else {
            return 6;
        }
    }

    static String b(int i10) {
        switch (i10) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case StdKeyDeserializer.TYPE_URL /*14*/:
                return "USAGE_GAME";
            case 16:
                return "USAGE_ASSISTANT";
            default:
                return "unknown usage " + i10;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f17293a;
        if (audioAttributesImpl != null) {
            return audioAttributesImpl.equals(audioAttributesCompat.f17293a);
        }
        if (audioAttributesCompat.f17293a == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f17293a.hashCode();
    }

    public String toString() {
        return this.f17293a.toString();
    }
}
