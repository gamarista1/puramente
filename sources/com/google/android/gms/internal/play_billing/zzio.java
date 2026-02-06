package com.google.android.gms.internal.play_billing;

import com.amazon.a.a.o.b;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

final class zzio {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String zza(zzim zzim, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        zzd(zzim, sb2, 0);
        return sb2.toString();
    }

    static void zzb(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            for (Object zzb : (List) obj) {
                zzb(sb2, i10, str, zzb);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry zzb2 : ((Map) obj).entrySet()) {
                zzb(sb2, i10, str, zzb2);
            }
        } else {
            sb2.append(10);
            zzc(i10, sb2);
            if (!str.isEmpty()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(Character.toLowerCase(str.charAt(0)));
                for (int i11 = 1; i11 < str.length(); i11++) {
                    char charAt = str.charAt(i11);
                    if (Character.isUpperCase(charAt)) {
                        sb3.append("_");
                    }
                    sb3.append(Character.toLowerCase(charAt));
                }
                str = sb3.toString();
            }
            sb2.append(str);
            if (obj instanceof String) {
                sb2.append(": \"");
                sb2.append(zzjh.zza(new zzgi(((String) obj).getBytes(zzhp.zza))));
                sb2.append('\"');
            } else if (obj instanceof zzgk) {
                sb2.append(": \"");
                sb2.append(zzjh.zza((zzgk) obj));
                sb2.append('\"');
            } else if (obj instanceof zzhk) {
                sb2.append(" {");
                zzd((zzhk) obj, sb2, i10 + 2);
                sb2.append("\n");
                zzc(i10, sb2);
                sb2.append("}");
            } else if (obj instanceof Map.Entry) {
                int i12 = i10 + 2;
                sb2.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                zzb(sb2, i12, SubscriberAttributeKt.JSON_NAME_KEY, entry.getKey());
                zzb(sb2, i12, "value", entry.getValue());
                sb2.append("\n");
                zzc(i10, sb2);
                sb2.append("}");
            } else {
                sb2.append(": ");
                sb2.append(obj);
            }
        }
    }

    private static void zzc(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(zza, 0, i11);
            i10 -= i11;
        }
    }

    private static void zzd(zzim zzim, StringBuilder sb2, int i10) {
        int i11;
        boolean z10;
        Method method;
        Method method2;
        zzim zzim2 = zzim;
        StringBuilder sb3 = sb2;
        int i12 = i10;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzim.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i13 = 0;
        while (true) {
            i11 = 3;
            if (i13 >= length) {
                break;
            }
            Method method3 = declaredMethods[i13];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith(b.au)) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i13++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i11);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb3, i12, substring.substring(0, substring.length() - 4), zzhk.zzt(method2, zzim2, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb3, i12, substring.substring(0, substring.length() - 3), zzhk.zzt(method, zzim2, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey(b.au.concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzt = zzhk.zzt(method4, zzim2, new Object[0]);
                    if (method5 == null) {
                        if (zzt instanceof Boolean) {
                            if (!((Boolean) zzt).booleanValue()) {
                            }
                        } else if (zzt instanceof Integer) {
                            if (((Integer) zzt).intValue() == 0) {
                            }
                        } else if (zzt instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzt).floatValue()) == 0) {
                            }
                        } else if (!(zzt instanceof Double)) {
                            if (zzt instanceof String) {
                                z10 = zzt.equals("");
                            } else if (zzt instanceof zzgk) {
                                z10 = zzt.equals(zzgk.zzb);
                            } else if (zzt instanceof zzim) {
                                if (zzt == ((zzim) zzt).zzi()) {
                                }
                            } else if ((zzt instanceof Enum) && ((Enum) zzt).ordinal() == 0) {
                            }
                            if (z10) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) zzt).doubleValue()) == 0) {
                        }
                    } else if (!((Boolean) zzhk.zzt(method5, zzim2, new Object[0])).booleanValue()) {
                    }
                    zzb(sb3, i12, substring, zzt);
                }
            }
            i11 = 3;
        }
        if (zzim2 instanceof zzhh) {
            Iterator zze = ((zzhh) zzim2).zzb.zze();
            if (zze.hasNext()) {
                zzhi zzhi = (zzhi) ((Map.Entry) zze.next()).getKey();
                throw null;
            }
        }
        zzjk zzjk = ((zzhk) zzim2).zzc;
        if (zzjk != null) {
            zzjk.zzi(sb3, i12);
        }
    }
}
