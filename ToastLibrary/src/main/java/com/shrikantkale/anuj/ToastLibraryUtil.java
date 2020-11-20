package com.shrikantkale.anuj;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class ToastLibraryUtil {
    public static void showToast(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        Log.e("TAG", "VersionName: 1.0.2" );
    }
}
