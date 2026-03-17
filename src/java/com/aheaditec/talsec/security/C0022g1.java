package com.aheaditec.talsec.security;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/* JADX INFO: renamed from: com.aheaditec.talsec.security.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class C0022g1 {
    public static final String b;
    public static final String[] c;
    public static final List<String> d;
    public final SharedPreferences a;

    static {
        byte[] bArr = {-113, -119, 63, 27};
        a(bArr, new byte[]{-95, -15, 82, 119, 88, 71, -119, -35});
        Charset charset = StandardCharsets.UTF_8;
        b = new String(bArr, charset).intern();
        byte[] bArr2 = {123, -77, -116, 77, -120, -1, 103, 50, -37, 55, 33, -73, 61, 88, -75, -3, -68, -108, 61, -97, 37, 123, 49, -18, -39, -56, -37, 10, 71, 61, 33, -84, 106};
        a(bArr2, new byte[]{79, -23, -59, 15, -47, -122, 46, 93, -125, 97, 71, -122, 101, 32, -15, -68, -14, -35, 105, -9, 118, 79, 116, -124, -76, -16, -105, 95, 61, 84, 83, -8, 27});
        String strIntern = new String(bArr2, charset).intern();
        byte[] bArr3 = {-3, -107, 44, -56, -58, 43, -25, 111, 76, 89, -105, -2, -17, 70, 108, 117, 0, -33, 9, 104, 86, -29, -80, 54, -56};
        a(bArr3, new byte[]{-104, -19, 99, -82, -1, 82, -86, 22, 36, 51, -49, -100, -101, 13, 28, 13, 50, -80, 83, 60, 96, -80, -47, 68, -128});
        String strIntern2 = new String(bArr3, charset).intern();
        byte[] bArr4 = {119, 51, 79, 11, 21, -113, -42, 8, 91, 55, -7, 55, -47, 64, 76, 99, -88, -5, -62, 49, 114};
        a(bArr4, new byte[]{52, 4, 62, 72, 89, -24, -112, 113, 50, 116, -107, 7, -66, 49, 33, 90, -112, -82, -125, 64, 43});
        String strIntern3 = new String(bArr4, charset).intern();
        byte[] bArr5 = {44, 127, 116, -112, 0, 122, 119, -76, -10, 93, -43, 2, -104, -33, 21, 63, 28, 60, 116, -6, -36, 87, -77, 94, -27, 46, 18, -110, 61, -59, 43, -63, -31, 98, -11, 87, 67, 46, -69, 9};
        a(bArr5, new byte[]{123, 74, 21, -42, 77, 56, 37, -37, -93, 109, -104, 65, -18, -108, 121, 12, 116, 123, 24, -110, -98, 18, -22, 45, -97, 69, 123, -31, 95, -100, 19, -123, -83, 39, -122, 46, 47, 104, -51, 78});
        String strIntern4 = new String(bArr5, charset).intern();
        byte[] bArr6 = {-45, -38, -86, 123, -39, 91, 57, -120, -15, 110, 46, 47, -76, 124, -95, -95, 87, 34, -70, -52, 20, -29, -114, 86, -84, 107, -124, 6, 114, 14, -64, 25, 18, -105, -82, 25, 48, -81, -46, 20};
        a(bArr6, new byte[]{-100, -74, -52, 67, -74, 60, 116, -63, -62, 47, 86, 99, -64, 43, -44, -105, 3, 20, -117, -82, 83, -91, -7, 27, -6, 83, -59, 81, 23, 71, -91, 41, 117, -30, -8, 33, 95, -62, -106, 120});
        String strIntern5 = new String(bArr6, charset).intern();
        byte[] bArr7 = {124, 101, 5, 28, -25, 99, -100, 58, -83, 121, 81, -87, 122, -46, -46, 61, 19, -67, 108, 72, 30, -33, -73, 97, -29, 120, -43, 122, -71, 96, 20, -68, 109, -56, -34, 29, -90, 28, 71, -44};
        a(bArr7, new byte[]{25, 9, 111, 40, -110, 86, -40, 74, -20, 13, 50, -104, 34, -124, -71, 118, 114, -51, 91, 36, 38, -108, -14, 4, -81, 76, -103, 53, -55, 8, 89, -6, 53, -71, -75, 118, -30, 41, 40, -79});
        String strIntern6 = new String(bArr7, charset).intern();
        byte[] bArr8 = {-87, 57, -119, 20, 83, 114, 123, 9, 42, 110, 81, -117, -83, -10, -86, 84, -105, 26, 5, 96, 19, -74, -96, -101, -118, 45, -33, -125, -17, -16, 6, 9, -80, 10, 81};
        a(bArr8, new byte[]{-19, 127, -67, 87, 34, 1, 76, 115, 78, 20, 97, -7, -53, -105, -55, 5, -37, 76, 118, 25, 39, -48, -17, -12, -2, 123, -123, -46, -92, -74, 65, 98, -7, 83, 21});
        String strIntern7 = new String(bArr8, charset).intern();
        byte[] bArr9 = {73, -45, -29, -89, 91, -103, 102, -38, 59, -95, 54, -77, 59, -48, -61, -98, -24, -27, 92, -2, -86, -120, -124, 95, -35, 3, 113, 95, -10, -79, 99, -23, 25, 8, 10, 45, 38, -114, 23, -6};
        a(bArr9, new byte[]{3, -93, -121, -55, 58, -12, 31, -119, 97, -25, 7, -122, 3, -89, -89, -36, -92, -75, 26, -116, -14, -71, -50, 47, -77, 104, 57, 18, -50, -63, 39, -121, 78, 114, 57, 95, 105, -17, 47, -56});
        String strIntern8 = new String(bArr9, charset).intern();
        byte[] bArr10 = {43, 73, -78, -21, -72, -90, 29, 2, -7, -70, -74, 15, -92, -103, 66, 37, 113, -77, 28, -88, -23, 61, 27, -104, 78, -43, 56, 94, -19, 48, -120, 76, -74, -51, 75, 100, 101};
        a(bArr10, new byte[]{99, 120, -12, -124, -56, -36, 90, 64, -108, -1, -3, 72, -32, -88, 14, 77, 29, -57, 78, -2, -86, 112, 98, -95, 40, -116, 85, 27, -120, 98, -55, 54, -29, -116, 59, 40, 15});
        String strIntern9 = new String(bArr10, charset).intern();
        byte[] bArr11 = {77, -83, -58, 97, 83, 123, -108, -87, -49, -118, -38, -43, 114, 103, 102, -23, -107, -122, -9, 8, -55, 54, 84, 62, 32, -6, -57, 73, -56, -127, 93, -38, 126, -101, 26};
        a(bArr11, new byte[]{24, -8, -116, 88, 100, 67, -3, -58, -119, -29, -18, -68, 43, 11, 33, -72, -9, -45, -91, 90, -92, 119, 58, 75, 85, -100, -16, 120, -65, -72, 22, -120, 70, -7, 77});
        String strIntern10 = new String(bArr11, charset).intern();
        byte[] bArr12 = {-120, -30, 120, 66, -72, 33, 6, 62, 60, -95, 60, 94, -117, 58, 46, -7, 97, -68, -5, -128, -43, -50, 113, -38, 120, 105, -9, 120, 5, 21, 62, 58, 7, 120};
        a(bArr12, new byte[]{-49, -47, 27, 56, -117, 67, 67, 88, 121, -54, 123, 110, -51, 98, 108, -97, 39, -23, -66, -75, -105, -116, 2, -126, 42, 37, -66, 79, 110, 100, 72, 88, 85, 62});
        String strIntern11 = new String(bArr12, charset).intern();
        byte[] bArr13 = {31, -106, -25, -99, 66, 30, 84, -97, 123, -19, -70, -61, 22, -30, 34, 13, -114, 104, -115, -42, -54, 30, -71, 8, 5, 116, 29, -30, -11, 108, 98, 59, -5, -98};
        a(bArr13, new byte[]{41, -25, -99, -92, 5, 108, 28, -85, 74, -127, -14, -96, 100, -76, 67, 71, -41, 48, -22, -116, -94, 87, -24, 96, 103, 50, 47, -109, -78, 47, 80, 116, -77, -8});
        String strIntern12 = new String(bArr13, charset).intern();
        byte[] bArr14 = {87, -89, -84, 59, 28, 20, -6, -122, 125, -9, 76, 108, -37, -2, 33, -69, 19, -4, 111, 116, 87, 12, 26, 23, -83, -48, -49, -122, -18, -57, 30, -50, -75, 21, 45, 44, 85, -111};
        a(bArr14, new byte[]{50, -14, -1, 109, 102, 127, -82, -33, 53, -60, 34, 60, -77, -73, 77, -19, 71, -104, 58, 30, 31, 126, 126, 69, -38, -103, -3, -60, -34, -85, 44, -105, -116, 69, 79, 66, 5, -41});
        String strIntern13 = new String(bArr14, charset).intern();
        byte[] bArr15 = {-89, 87, 104, 3, -35, -80, -86, -81, 117, 44, -28, -90, -54, 106, -83, 102, -86, -83, 52, 89, -58, -92, 21, -88, 125, -83, -40, 22, -128, 18, 70, 108, 111, 34, -10, 77, 101, -14, 52, 30};
        a(bArr15, new byte[]{-59, 60, 56, 112, -88, -27, -50, -40, 48, 92, -121, -108, -13, 31, -100, 1, -26, -1, 118, 97, -76, -45, 83, -19, 74, -33, -110, 87, -57, 86, 18, 54, 61, 20, -80, 53, 51, -106, 3, 100});
        String strIntern14 = new String(bArr15, charset).intern();
        byte[] bArr16 = {9, -75, -95, -106, -4, -116, -96, 115, 10, -91, -67, 20, 39, 110, 86, 97, 13, 123, -54, -13, 16, -86, -15, -3, 50, 58, 43, -121, -73, -98, -29, -104, 121, -13, -57};
        a(bArr16, new byte[]{103, -39, -29, -95, -55, -43, -109, 75, 63, -26, -37, 91, 99, 39, 100, 22, 110, 46, -128, -93, 73, -59, -67, -69, 5, 118, 108, -76, -43, -38, -127, -44, 53, -100, -88});
        String strIntern15 = new String(bArr16, charset).intern();
        byte[] bArr17 = {61, 110, -90, -43, 101, 27, 20, -87, -98, -19, -24, -32, 17, 112, -55, -25, 31, -22, 108, 32, 31, 46, 66, 44, 37, -10, 95, 101, -13, 37, 80, -9, -80, -68, 9, -74, 28, -119, 116, -44, 91, 1, 51, 61, -11, 56, -67, 10, 76};
        a(bArr17, new byte[]{115, 42, -62, -25, 35, 106, 98, -61, -84, -37, -85, -82, 86, 37, -118, -33, 47, -68, 95, 100, 45, 125, 40, 73, 109, -92, 41, 85, -98, 96, 51, -99, -54, -13, 106, -32, 127, -34, 16, -69, 14, 102, 122, 89, -104, 92, -40, 93, 53});
        String strIntern16 = new String(bArr17, charset).intern();
        byte[] bArr18 = {-8, -82, -96, -55, 69, 110, 79, -30, 35, 59, -36, 67, 97, 96, -102, 85, -53, -3, -19, -117, -75, -71, 100, 30, -35, -60, 80, 10, -73, 111, -60, 114, -15, -29, 65, 36, 26, 106};
        a(bArr18, new byte[]{-74, -62, -56, -101, 21, 35, 36, -108, 115, 78, -73, 11, 18, 24, -17, 56, -14, -98, -81, -15, -123, -6, 11, 82, -112, -67, 6, 93, -128, 93, -125, 56, -55, -38, 8, 96, 118, 43});
        String strIntern17 = new String(bArr18, charset).intern();
        byte[] bArr19 = {-9, 48, 118, 83, 79, 101, -85, -117, 111, 47, 87, -87, 77, 37, -94, 95, 33, -5, -95, -81, -80, -120, 44, -79, -35, -117, 84, -52, -85, -10, -45, 90, 75, 31, 46, -34, -128, 95, 30, 67};
        a(bArr19, new byte[]{-102, 119, 66, 52, 13, 8, -58, -61, 90, 26, 45, -45, 44, 76, -63, 8, 24, -107, -29, -19, -13, -79, 109, -42, -116, -71, 25, -72, -6, -94, -87, 61, 120, 43, 109, -75, -26, 9, 109, 17});
        String strIntern18 = new String(bArr19, charset).intern();
        byte[] bArr20 = {-67, -3, -31, -37, -65, 50, -2, -118, -93, 127, 98, 55, -3, 85, 44, 61, 106, 24, -49, 30, 76, -119, -92, 68, 40, 34, 76, -43, 53, 33, 46, 72, 78, -8, 81, -90};
        a(bArr20, new byte[]{-22, -52, -121, -117, -35, 120, -114, -18, -105, 13, 23, 86, -86, 13, 105, 91, 57, 87, -122, 40, 52, -64, -12, 113, 88, 122, 39, -100, 121, 82, 106, 36, 31, -117, 58, -1});
        String strIntern19 = new String(bArr20, charset).intern();
        byte[] bArr21 = {-35, 118, 80, -69, 107, 52, 126, -58, -70, -76, -47, 31, -66, 112, -14, 54, 86, 63, -98, -66, -44, -76, 49, -122, 34, -122, 23, 30, -79, -102, -36, 47, 109, 32, -43, 16, -109, 44, 60, -2};
        a(bArr21, new byte[]{-86, 33, 49, -1, 36, 117, 42, -15, -116, -26, -78, 71, -9, 64, -102, 95, 20, 115, -60, -23, -115, -124, 127, -59, 19, -20, 39, 123, -11, -12, -84, 29, 53, 79, -108, 124, -44, 102, 77, -116});
        String strIntern20 = new String(bArr21, charset).intern();
        byte[] bArr22 = {35, -126, 99, -127, 113, 31, -4, -105, 117, 76, 123, 16, -41, 83, 102, 9, 77, -103, 19, 126, -91, 103, 93, 120, -95, -52, -119, 88, -68, -47, 94, -76, 27, 109, -2};
        a(bArr22, new byte[]{16, -24, 37, -39, 28, 120, -84, -91, 29, 37, 15, 72, -124, 57, 50, 112, 4, -54, 112, 44, -41, 50, 46, 57, -106, -81, -62, 96, -18, -126, 29, -30, 112, 95, -56});
        String strIntern21 = new String(bArr22, charset).intern();
        byte[] bArr23 = {-3, 57, -84, -94, 70, 117, -99, -105, -29, -87, -51, 44, 57, 68, 72, 99, -72, -6, -56, -47, -120, 103, 68, 27, 89, -30, 10, 65, -91, -106, -23, 68, -25, 100, 95, -100, 69, -48, -92, 38};
        a(bArr23, new byte[]{-72, 93, -2, -38, 32, 60, -12, -58, -71, -59, -118, 75, 65, 3, 14, 27, -52, -82, -89, -94, -1, 83, 7, 108, 45, -111, 51, 14, -57, -31, -85, 50, -80, 14, 55, -59, 14, -90, -18, 82});
        String strIntern22 = new String(bArr23, charset).intern();
        byte[] bArr24 = {-19, 106, 31, 62, -30, -18, -35, 39, 81, -118, -120, 64, 87, 120, -69, -43, -19, 116, 103, 70, -4, 50, 116, 62, 47, 57, 96, -117, 46, -10, -117, -111, -32, -58, 57, 75, -3, 97, -65, -111};
        a(bArr24, new byte[]{-73, 63, 46, 119, -38, -94, -20, 99, 38, -35, -27, 57, 3, 8, -51, -100, -108, 28, 46, 127, -99, 99, 22, 122, 102, 77, 8, -59, 89, -67, -20, -87, -107, -82, 85, 122, -85, 5, -56, -2});
        String strIntern23 = new String(bArr24, charset).intern();
        byte[] bArr25 = {-86, -101, -21, 9, 98, -59, 16, 16, -22, 33, 15, -82, -46, 91, -86, -52, 110, 48, 104, 35, -85, -37, -52, -15, 91, -75, -50, 28, 29, -55, 106, 60, 67, 43, -31, -29, 112, -69, -85, -30};
        a(bArr25, new byte[]{-50, -33, -101, 80, 4, -115, 89, 106, -38, 119, 105, -32, -76, 54, -21, -122, 32, 73, 41, 123, -56, -85, -87, -76, 42, -7, -120, 83, 121, -91, 47, 90, 17, 70, -44, -76, 64, -4, -3, -123});
        String strIntern24 = new String(bArr25, charset).intern();
        byte[] bArr26 = {12, 6, 76, -65, 126, -53, -49, 122, 35, -116, -70, -102, -13, -123, -81, -107, 1, 123, 68, 86, 33, -23, 27, -3, -73, 85, -73, 48, -13, 61, 37, -20, -34, -42, 62, -28};
        a(bArr26, new byte[]{121, 111, 8, -48, 70, -100, -92, 3, 81, -57, -53, -50, -54, -61, -102, -96, 69, 2, 33, 110, 114, -118, 34, -119, -62, 20, -18, 90, -123, 69, 109, -37, -86, -72, 76, -44});
        String strIntern25 = new String(bArr26, charset).intern();
        byte[] bArr27 = {-111, -1, -50, -63, -101, 47, -69, 122, 13, 69, -101, 85, 113, -8, 36, 87, -104, -56, 55, -88, -84, -2, 4, 117, 31, 101, -69};
        a(bArr27, new byte[]{-58, -77, -100, -80, -1, 92, -53, 3, 107, 39, -81, 29, 59, -65, 23, 57, -38, -72, 114, -48, -3, -116, 54, 57, 47, 1, -48});
        String strIntern26 = new String(bArr27, charset).intern();
        byte[] bArr28 = {-80, -77, -122, -72, -87, 60, 78, -94, -11, -65, 22, -97, -71, -92, 109, 6, 105, -39, 42, 28, -82, 16, 66, 69, 19, -25, 79, 84, -72, 117, 116, -53, -55, 108, 127};
        a(bArr28, new byte[]{-47, -124, -2, -118, -61, 9, 39, -60, -68, -59, 116, -18, -37, -23, 89, 107, 44, -87, 98, 37, -39, 104, 32, 17, 101, -80, 9, 50, -11, 69, 19, -78, -81, 61, 48});
        String strIntern27 = new String(bArr28, charset).intern();
        byte[] bArr29 = {-121, -9, 64, -1, 36, -84, 41, -122, 2, 48, 46, 3, -91, 38, 93, 114, -57, -88, 52, -55, 59, 85, 39, -18, -27, -53, -48, -67, 24, 50, -91, -81, 10, -60, 26, 15, 98, 102, -90, 46};
        a(bArr29, new byte[]{-63, -103, 6, -115, 99, -61, 121, -25, 48, 123, 24, 77, -55, 118, 13, 10, -99, -64, 83, -126, 15, 25, 82, -76, -79, -81, -100, -41, 110, 80, -47, -38, 51, -82, 125, 118, 10, 9, -112, 75});
        String strIntern28 = new String(bArr29, charset).intern();
        byte[] bArr30 = {40, 25, 43, -49, -12, -64, -13, 108, -114, -83, 7, -102, -18, -112, 125, -127, 8, 16, 18, -19, -56, 28, 110, -9, -14, 49, 125, 120, 45, 96, -50, 53, -123, 92, 121, 22, 124, 67, -5, 77};
        a(bArr30, new byte[]{64, 111, 83, -10, -101, -87, -58, 38, -9, -64, 110, -47, -66, -88, 54, -57, 91, 88, 119, -97, -127, 110, 23, -49, -86, 92, 4, 77, 79, 57, -69, 2, -11, 57, 18, 90, 23, 27, -72, 21});
        String strIntern29 = new String(bArr30, charset).intern();
        byte[] bArr31 = {-99, 57, -53, 110, -122, -101, 86, -81, 44, -37, -99, -64, 19, -46, 90, -70, -124, -64, 111, -49};
        a(bArr31, new byte[]{-48, 113, -68, 45, -28, -8, 97, -102, 77, -119, -43, -92, 64, -75, 31, -118, -3, -126, 6, -117});
        c = new String[]{strIntern, strIntern2, strIntern3, strIntern4, strIntern5, strIntern6, strIntern7, strIntern8, strIntern9, strIntern10, strIntern11, strIntern12, strIntern13, strIntern14, strIntern15, strIntern16, strIntern17, strIntern18, strIntern19, strIntern20, strIntern21, strIntern22, strIntern23, strIntern24, strIntern25, strIntern26, strIntern27, strIntern28, strIntern29, new String(bArr31, charset).intern()};
        d = new ArrayList();
    }

    public C0022g1(Context context, String str, String[] strArr) {
        synchronized (C0022g1.class) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(a(context, str, strArr), 0);
            this.a = sharedPreferences;
            byte[] bArr = {-66, 78, -23, 50, 23, -4, -87, 52};
            a(bArr, new byte[]{-37, 35, -103, 70, 110, -93, -38, 68});
            Charset charset = StandardCharsets.UTF_8;
            if (!sharedPreferences.contains(new String(bArr, charset).intern())) {
                byte[] bArr2 = {-13, -107, 25, 45, 50, 53, 11, -17};
                a(bArr2, new byte[]{-106, -8, 105, 89, 75, 106, 120, -97});
                String strIntern = new String(bArr2, charset).intern();
                byte[] bArr3 = {123, -35, 7, -115, 109};
                a(bArr3, new byte[]{29, -68, 107, -2, 8, -116, -33, 113});
                a(strIntern, new String(bArr3, charset).intern());
            }
        }
    }

    public void a() {
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.clear();
        editorEdit.apply();
    }

    public boolean b(String str) {
        return this.a.contains(str);
    }

    public void c(String str) {
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.remove(str);
        editorEdit.apply();
    }

    public final String a(Context context, String[] strArr) {
        String str = context.getApplicationInfo().dataDir;
        byte[] bArr = {127, 14, -111, 36, -5, 86, 38, 26, -68, 127, 98, 92};
        a(bArr, new byte[]{12, 102, -16, 86, -98, 50, 121, 106, -50, 26, 4, 47});
        String[] list = new File(str, new String(bArr, StandardCharsets.UTF_8).intern()).list();
        if (list == null) {
            return "";
        }
        HashSet hashSet = new HashSet(Arrays.asList(list));
        for (String str2 : c) {
            for (String str3 : strArr) {
                String str4 = str3 + str2;
                StringBuilder sbAppend = new StringBuilder().append(str4);
                byte[] bArr2 = {73, 121, 107, 91};
                a(bArr2, new byte[]{103, 1, 6, 55, -64, -49, 76, 57});
                if (hashSet.contains(sbAppend.append(new String(bArr2, StandardCharsets.UTF_8).intern()).toString()) || d.contains(str4)) {
                    return str4;
                }
            }
        }
        return "";
    }

    public String a(String str) {
        return this.a.getString(str, null);
    }

    public final List<String> a(String[] strArr) {
        LinkedList linkedList = new LinkedList();
        for (String str : c) {
            for (String str2 : strArr) {
                linkedList.add(str2 + str);
            }
        }
        return linkedList;
    }

    public final String a(Context context, String str, String[] strArr) {
        try {
            String strA = a(context, strArr);
            if (!strA.isEmpty()) {
                return strA;
            }
            LinkedList linkedList = (LinkedList) a(strArr);
            String str2 = (String) linkedList.get(new Random().nextInt(linkedList.size()));
            d.add(str2);
            return str2;
        } catch (Exception unused) {
            return str;
        }
    }

    public void a(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public static void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = null;
        int i = 0;
        int i2 = 0;
        int i3 = -1850458006;
        byte[] bArr4 = null;
        while (true) {
            int i4 = ((16777216 & i3) * (i3 | 16777216)) + (((-16777217) & i3) * ((~i3) & 16777216));
            int i5 = i3 >>> 8;
            int i6 = (i5 - 1) - ((~i4) | i5);
            int i7 = (-1700147435) - ((i6 & 2) | (2028104049 - i6));
            switch ((-1363443157) ^ ((~i7) + ((i7 | 1) * 2))) {
                case -1940167324:
                    byte b2 = bArr3[i];
                    int i8 = ((byte) 0) - b2;
                    bArr3[i] = (byte) (((byte) (b2 & (~i8))) - ((byte) ((~b2) & i8)));
                    i3 = 614229416;
                    continue;
                case -360299937:
                    boolean z = (((double) ((byte) bArr3[i2])) > Double.NaN ? 1 : (((double) ((byte) bArr3[i2])) == Double.NaN ? 0 : -1)) > -1;
                    i3 = z ? 614229416 : z ? -1396193641 : 427928065;
                    i = i2;
                    continue;
                case 399486784:
                    return;
                case 585276366:
                    i3 = bArr.length > 0 ? 1985663266 : -1396193641;
                    bArr4 = bArr;
                    bArr3 = bArr2;
                    i2 = 0;
                    continue;
                case 1733787683:
                    byte b3 = bArr4[i];
                    byte b4 = bArr3[i];
                    bArr4[i] = (byte) (((byte) (b4 + b3)) - ((byte) (((byte) 2) * ((byte) (b4 & b3)))));
                    i2 = (i ^ 1) + ((i & 1) * 2);
                    if ((((i2 > bArr4.length ? 1 : (i2 == bArr4.length ? 0 : -1)) >>> 31) & 1) != 0) {
                        i3 = 1985663266;
                    }
                    break;
            }
            i3 = -1396193641;
        }
    }
}
